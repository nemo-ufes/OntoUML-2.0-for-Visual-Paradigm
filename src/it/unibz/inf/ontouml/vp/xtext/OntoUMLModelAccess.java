package it.unibz.inf.ontouml.vp.xtext;

import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetup;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;

public class OntoUMLModelAccess {

	private static Injector injector = null;
	private static XtextResourceSet resourceSet = null;
	private static String resourceName = "model.ontouml";
	
	private static Injector getInjector() {
		if(injector==null)	new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector;
	}
	
	private static XtextResourceSet getResourceSet() {
		if(resourceSet==null)	getInjector().getInstance(XtextResourceSet.class);
		return resourceSet;
	}
	
	private static void clearResourceSet() {
		getResourceSet().getResources().clear();
	}
	
	public static void createOntoUMLModel() {
		clearResourceSet();
		Resource resource = getResourceSet().getResource(URI.createFileURI("model.ontouml"), true);
		resource.getContents().add(XcoreFactory.eINSTANCE.createModel());
		
//		// Validation
//		IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
//		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
//		for (Issue issue : issues) {
//		  System.out.println(issue.getMessage());
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
	
}
