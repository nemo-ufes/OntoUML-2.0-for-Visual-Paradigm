package it.unibz.inf.ontouml.vp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.vp.plugin.ApplicationManager;
import com.vp.plugin.ViewManager;
import com.vp.plugin.model.IProject;
import com.vp.plugin.model.IProjectListener;

import it.unibz.inf.ontouml.vp.OntoUMLPluginForVP;
import it.unibz.inf.ontouml.vp.uml.OntoUMLModelGenerator;
import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetup;
import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;

public class ProjectValidationListenner implements IProjectListener {

	@Override
	public void projectAfterOpened(IProject p) {
		System.out.println("Project just opened.");
		validate();
	}

	@Override
	public void projectNewed(IProject p) {
		System.out.println("Project create.");
	}

	@Override
	public void projectOpened(IProject p) {
		System.out.println("Project opened.");
	}

	@Override
	public void projectPreSave(IProject p) {
		System.out.println("Project pre-saved.");
	}

	@Override
	public void projectRenamed(IProject p) {
		System.out.println("Project renamed.");
	}

	@Override
	public void projectSaved(IProject p) {
		System.out.println("Project saved.");
		validate();
	}
	
	private void validate() {
		ViewManager vm = ApplicationManager.instance().getViewManager();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		vm.clearMessages(OntoUMLPluginForVP.PLUGIN_NAME);
		vm.showMessage("[" + dateFormat.format(Calendar.getInstance().getTime()) + 
				"] Initiating OntoUML Validation...", OntoUMLPluginForVP.PLUGIN_NAME);
		
		System.out.println("Validating OntoUML Model -----------------------------------------");
		Injector injector = new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		File user;
		try {
			user = File.createTempFile("mymodel", ".ontouml");
			FileWriter fw = new FileWriter(user);
			fw.write((new OntoUMLModelGenerator()).generateOntoUMLModel());
			fw.close();
			
			Resource resource = resourceSet.getResource(URI.createFileURI(user.getAbsolutePath()),true);
			Model m = (Model) resource.getContents().get(0);
			resource.save(null);
			
			IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			for (Issue issue : issues) {
				if(!issue.isSyntaxError())
					vm.showMessage(issueToLog(issue,(XtextResource) resource), 
							OntoUMLPluginForVP.PLUGIN_NAME);
			}
			
			user.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Success!-----------------------------------------");
		vm.showMessage("[" + dateFormat.format(Calendar.getInstance().getTime()) + 
				"] OntoUML Validation Concluded.", OntoUMLPluginForVP.PLUGIN_NAME);
	}

	private String issueToLog(Issue issue, XtextResource resource) {
		final Model model = (Model) resource.getContents().get(0);
		final String uri = issue.getUriToProblem().deresolve(resource.getURI()).toString();
		final int index = Integer.parseInt(uri.substring(uri.lastIndexOf('.')+1));
		final ModelElement me = model.getElements().get(index);
		final StringBuilder ret = new StringBuilder();
		
		if(issue.getSeverity().equals(Severity.ERROR))
			ret.append('[' + issue.getSeverity().toString() + "]\t\t\t\t");
		else
			ret.append('[' + issue.getSeverity().toString() + "]");
		
		if(me instanceof OntoUMLClass) {
			ret.append(" on CLASS '" + me.getAlias() + '\'');
		}
		else if(me instanceof RegularAssociation) {
			RegularAssociation a = (RegularAssociation) me;
			ret.append(" on ASSOCIATION '" + a.getAlias() + '\'');
			ret.append(" ('" + a.getEndA().getAlias() + '\'');
			ret.append(", '" + a.getEndB().getAlias() + "')");
		}
		else if(me instanceof Generalization) {
			Generalization g = (Generalization) me;
			ret.append(" on GENERALIZATION '" + g.getAlias() + '\'');
			ret.append(" ('" + g.getGeneric().getAlias() + '\'');
			ret.append(", '" + g.getSpecific().getAlias() + "')");
		}
		else if(me instanceof GeneralizationSet) {
			GeneralizationSet gs = (GeneralizationSet) me;
			List<Generalization> list = gs.getGeneralizations();
			ret.append(" on GENERALIZATION_SET '" + gs.getAlias() + '\'');
			ret.append(" ('" + list.get(0).getGeneric().getAlias() + '\'');
			
			for (Generalization g : list) {
				ret.append(", '" + g.getSpecific().getAlias() + '\'');
			}
			ret.append(')');
		}
		
		ret.append(" : " + issue.getMessage());
		
		return ret.toString();
	}

}
