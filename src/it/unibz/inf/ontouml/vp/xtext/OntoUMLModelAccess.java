package it.unibz.inf.ontouml.vp.xtext;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.vp.plugin.ApplicationManager;
import com.vp.plugin.ViewManager;

import it.unibz.inf.ontouml.vp.OntoUMLPluginForVP;
import it.unibz.inf.ontouml.vp.uml.AdapterManager;
import it.unibz.inf.ontouml.vp.uml.ModelAccess;
import it.unibz.inf.ontouml.vp.uml.ModelElementAdapter;
import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetup;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;

public class OntoUMLModelAccess {

	private static OntoUMLStandaloneSetup ss;
	@Inject private static Injector injector;
	private static XtextResourceSet resourceSet;
	private static String resourceName = "model.ontouml";
	
	private static OntoUMLStandaloneSetup getSetup() {
		if(ss==null)
			ss = new OntoUMLStandaloneSetup();
		return ss;
	}
	
	private static Injector getInjector() {
		if(injector==null)	
			injector = getSetup().createInjector();
		
		return injector;
	}
	
	private static XtextResourceSet getResourceSet() {
		if(resourceSet==null) {
//			resourceSet = injector.getInstance(XtextResourceSet.class);
			getSetup().register(getInjector());;
			resourceSet = getInjector().getInstance(XtextResourceSet.class);
		}
		return resourceSet;
	}
	
	private static void clearResourceSet() {
		getResourceSet().getResources().clear();
	}
	
	public static Model createModel() {
//		clearResourceSet();
		if(injector == null)
			injector = new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		if(resourceSet == null)
			resourceSet = injector.getInstance(XtextResourceSet.class);
		
		File user=null;
		try {
			user = File.createTempFile("mymodel", ".ontouml");
	        // Delete the file when the virtual machine is terminated.
	        user.deleteOnExit();
//	        System.out.println(user.getAbsolutePath());
	        
	        // load a resource by URI, in this case from the file system
//	        System.out.println("Get resource!");
//	        Resource resource = resourceSet.getResource(URI.createFileURI(user.getAbsolutePath()), true);
	        
//	        System.out.println("Create model!");
//	        resource.getContents().add(XcoreFactory.eINSTANCE.createModel());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Resource resource = getResourceSet().getResource(URI.createFileURI(user.getAbsolutePath()), true);
		Model m = XcoreFactory.eINSTANCE.createModel();
		resource.getContents().add(m);
		return m;
	}
	
	public static void loadModel() {
		Model m = createModel();
		Iterator<ModelElementAdapter> iter = ModelAccess.getModelIterator();
		while(iter.hasNext()) {
			AdapterManager.registerToOntoUML(m, iter.next());
		}
		iter = ModelAccess.getModelIterator();
		while(iter.hasNext()) {
			AdapterManager.updateToOntoUML(m, iter.next());
		}
		try {
//			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//	        Map<String, Object> map = XtextResource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
			Resource r = getResource();
			r.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getResourceSet().getResources().get(0));
		System.out.println(getResourceSet().getResources().get(0).getContents());
		System.out.println(getResourceSet().getResources().get(0).getContents().get(0));
		System.out.println(((Model) getResourceSet().getResources().get(0).getContents().get(0)).getElements());
		
		// Validation
//		System.out.println("Validando!!!");
//		ViewManager vm = ApplicationManager.instance().getViewManager();
//		IResourceValidator validator = ((XtextResource)getResourceSet().getResources().get(0)).getResourceServiceProvider().getResourceValidator();
//		List<Issue> issues = validator.validate((XtextResource) getResourceSet().getResources().get(0), CheckMode.ALL, CancelIndicator.NullImpl);
//		for (Issue issue : issues) {
//			System.out.println("Issue!!!");
//			System.out.println(issue.getMessage());
//			vm.clearMessages(OntoUMLPluginForVP.PLUGIN_NAME);
//			vm.showMessage(issue.getMessage(), OntoUMLPluginForVP.PLUGIN_NAME);
//		}
//		
//		// Code Generator
//		GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
//		InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
//		generator.doGenerate(resource, fsa);
//		for (Entry<String, CharSequence> file : fsa.getTextFiles().entrySet()) {
//		  System.out.println("Generated file path : "+file.getKey());
//		  System.out.println("Generated file contents : "+file.getValue());
//		}
	}
	
	public static void validateModel() {
		// Validation
		XtextResource res = getResource();
		IResourceValidator validator = res.getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl);
		ViewManager vm = ApplicationManager.instance().getViewManager();
		vm.clearMessages(OntoUMLPluginForVP.PLUGIN_NAME);
		for (Issue issue : issues) {
			vm.showMessage("[ERROR]\t"+issue.getMessage(),OntoUMLPluginForVP.PLUGIN_NAME);
			System.out.println("[ERROR]\t"+issue.getMessage());
		}
		
	}

	public static XtextResource getResource() {
		return (XtextResource) getResourceSet().getResources().get(0);
	}

	private static Model getOntoUMLModel() {
		return (Model) getResourceSet().getResources().get(0).getContents().get(0);
	}
	
}
