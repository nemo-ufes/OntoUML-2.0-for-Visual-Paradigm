package it.unibz.inf.ontouml.vp.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.vp.plugin.ApplicationManager;
import com.vp.plugin.ProjectManager;
import com.vp.plugin.ViewManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.model.IAssociation;
import com.vp.plugin.model.IAssociationEnd;
import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.IProject;
import com.vp.plugin.model.IStereotype;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.vp.OntoUMLPluginForVP;
import it.unibz.inf.ontouml.vp.uml.OntoUMLModelGenerator;
import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;
import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetup;
import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;

public class TestAction implements VPActionController {

	private Injector injector;
	private XtextResourceSet resourceSet;
	
	private boolean shouldDie = false;
	private boolean amalive = false;
	
	private ScheduledExecutorService service;
			
	private Runnable clock = new Runnable() {
		@Override public void run() {
//			ViewManager vm = ApplicationManager.instance().getViewManager();
//			vm.showMessage("Now it is"+Calendar.getInstance().getTime(), "Time");
			System.out.println("Now it is "+Calendar.getInstance().getTime());
		}
	};
	
	private void testThreadsAndStuff() {
		if(!amalive) {
			amalive = !amalive;
			service = Executors.newScheduledThreadPool(1);
			service.scheduleAtFixedRate(clock, 0, 1, TimeUnit.SECONDS);
		}
		else {
			amalive = !amalive;
			service.shutdownNow();
		}
	}
	
	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void performAction(VPAction arg0) {
		testThreadsAndStuff();
//		testGeneratedModelValidation();
//		testGenerateOntoUMLModel();
//		testAssociationGetters();
//		checkOntoUMLStereotypes();
//		StereotypeUtils.setUpOntoUMLStereotypes();
//		outputMessages();
//		showMessageOnLog();
//		testStandaloneXtext();
//		testClassRelationships();
//		testGeneralizations();
//		printAllElements();
//		createStereotype();
//		deleteStereotype();
	}
	
	private void testGeneratedModelValidation() {
		System.out.println("Validating OntoUML Model -----------------------------------------");
		Injector injector = new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		File user;
		try {
			user = File.createTempFile("mymodel", ".ontouml");
			FileWriter fw = new FileWriter(user);
			fw.write((new OntoUMLModelGenerator()).generateOntoUMLModel());
			fw.close();

			Resource resource = resourceSet.getResource(URI.createFileURI(user.getAbsolutePath()), true);
			Model model = (Model) resource.getContents().get(0);
			resource.save(null);

			IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider()
					.getResourceValidator();
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			for (Issue issue : issues) {
//				ModelElement me = (ModelElement) model.eContents().get(issue.);
//				System.out.print("> "+issue.getOffset()+'|'+issue.getUriToProblem()+'|'+issue.getLength()+'|'+issue.toString()+'\n');
				
//				for (String str : issue.getUriToProblem().deresolve(base)segments()) {
//					System.out.print("> "+str+" ");
//				}
//				System.out.println();
				
				URI meUri = issue.getUriToProblem().deresolve(resource.getURI());
				int index = Integer.parseInt(meUri.toString().substring(meUri.toString().lastIndexOf('.')+1));
				
				System.out.println("> "+model.getElements().get(index).getName()+" | "+model.getElements().get(index).getAlias());
				
				System.out.println(issue.getMessage());
			}

			user.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Success!-----------------------------------------");
	}

	private void testGenerateOntoUMLModel() {
		String model = (new OntoUMLModelGenerator()).generateOntoUMLModel();
		System.out.println("OntoUML Model Start");
		System.out.println(model);
		System.out.println("OntoUML Model Finish");
	}

	private void testAssociationGetters() {
		final ProjectManager pm =ApplicationManager.instance().getProjectManager(); 
		final IProject p = pm.getProject();
		@SuppressWarnings("rawtypes")
		Iterator iter = p.allLevelModelElementIterator(IModelElementFactory.MODEL_TYPE_ASSOCIATION);
		
		while(iter.hasNext()) {
			IAssociation a = (IAssociation) iter.next();
			
			System.out.print("ASSOCIATION "+a.getName()+" "+a.getId());
			System.out.print(" FROM ["+((IAssociationEnd) a.getFromEnd()).getMultiplicity()+"] "+a.getFrom().getName());
			System.out.print(" TO ["+((IAssociationEnd) a.getToEnd()).getMultiplicity()+"] "+a.getTo().getName()+'\n');
		}
	}
	
	public void checkOntoUMLStereotypes() {
		System.out.print("Installed Class Stereeotypes");
		
		final ProjectManager pm =ApplicationManager.instance().getProjectManager(); 
		final IProject p = pm.getProject();
		IModelElement[] selectable_stereotypes = pm.getSelectableStereotypesForModelType(IModelElementFactory.MODEL_TYPE_CLASS, p, true);
		
		if(selectable_stereotypes==null || selectable_stereotypes.length==0) {
			System.out.println(": No selectable stereotypes.");
			return ;
		}
		
		for (IModelElement str : selectable_stereotypes) {
			System.out.print(": "+str.getName());
		}
		System.out.println();
		
		System.out.print("Installed Association Stereeotypes");
		
		selectable_stereotypes = pm.getSelectableStereotypesForModelType(IModelElementFactory.MODEL_TYPE_ASSOCIATION, p, true);
		
		if(selectable_stereotypes==null || selectable_stereotypes.length==0) {
			System.out.println(": No selectable stereotypes.");
			return ;
		}
		
		for (IModelElement str : selectable_stereotypes) {
			System.out.print(": "+str.getName());
		}
		System.out.println();
	}
	
	private static void showMessageOnLog() {
		ViewManager vm = ApplicationManager.instance().getViewManager();
//		vm.showMessage("Hello World!");
		vm.clearMessages(OntoUMLPluginForVP.PLUGIN_ID);
//		vm.clearMessages(null);
//		vm.showMessage("Hello World!");
		vm.showMessage("Hello World!", OntoUMLPluginForVP.PLUGIN_ID);
	}
	
	private static void outputMessages() {
		ViewManager vm = ApplicationManager.instance().getViewManager();
		vm.clearMessages("OntoUML Plugin");//OntoUMLPluginForVP.PLUGIN_ID);
		vm.showMessage("[ERROR] The class \"SeriveAgreement\" is a non-sortal must be defined as abstract.", "OntoUML Plugin");
		vm.showMessage("[INCOMPLETE] The class \"Customer\" is a non-sortal and must be specialized by some sortal in order to have instances.", "OntoUML Plugin");
		vm.showMessage("[ERROR] The class \"Business Insurance Agreement\" is a substance sortal and cannot specialize other sortals (\"Insurance Agreement\").", "OntoUML Plugin");
		vm.showMessage("[ERROR] The class \"Insurance Comapny\" is rigid and cannot specialize anti-rigid classes (\"Insurance Provider\", \"Provider\").", "OntoUML Plugin");
		
//		'''The class "«c.nameOrAlias»" is a ultimate sortal and cannot specialize '''+
//		'''other ultimate sortals («FOR k : kinds»«IF kinds.head!=k», «ENDIF»"«k.nameOrAlias»"«ENDFOR»).'''
	}
	
	private void testStandaloneXtext() {
		// do this only once per application
		System.out.println("Get injector!");
		if(injector == null)
//			injector = new ML2StandaloneSetup().createInjectorAndDoEMFRegistration();
			injector = new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		 
		// obtain a resourceset from the injector
		System.out.println("Get resource set!");
		if(resourceSet == null)
			resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// create file
		System.out.println("Create temp file!");
		File user;
		try {
			user = File.createTempFile("mymodel", ".ontouml");
//			user = new File("/Users/claudenirmf/Desktop/mymodel.ml2");// File.createTempFile("mymodel", ".ml2");
//			user.createNewFile();
	        // Delete the file when the virtual machine is terminated.
//	        user.deleteOnExit();
	        System.out.println(user.getAbsolutePath());
	        
	        // load a resource by URI, in this case from the file system
	        System.out.println("Get resource!");
	        Resource resource = resourceSet.createResource(URI.createFileURI("/Users/claudenirmf/Desktop/asd.ontouml"));//, true);
	        
	        System.out.println("Create model!");
	        resource.getContents().add(getTestModel());
	        
	        resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Success!");
	}
	
	private static EObject getTestModel() {
		Model m = XcoreFactory.eINSTANCE.createModel();
		OntoUMLClass c = XcoreFactory.eINSTANCE.createOntoUMLClass();
		c.set_type(EndurantType.KIND);
		c.setName("Person");
		c.setAlias("HumanBeing");
		m.getElements().add(c);
//		m.getElements().add(XcoreFactory.eINSTANCE.createGeneralization());
//		m.getElements().add(XcoreFactory.eINSTANCE.createGeneralizationSet());
		return m;
	}
	
	private static void createTempFile() {
		// Create a temporary file userlist.txt in the default platform
        // temporary folder / directory. We can get the platform temporary
        // folder using System.getProperty("java.io.tmpdir")
        File user;
		try {
			user = File.createTempFile("userlist", ".txt");

	        // Delete the file when the virtual machine is terminated.
	        user.deleteOnExit();
	
	        // Create a temporary file data.txt in the user specified folder.
	        File data = File.createTempFile("data", ".txt", new File("C:/Users/kodejava/Data"));
	        data.deleteOnExit();
	
	        // Write data into temporary file
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(data))) {
	            writer.write("750101,2008-01-01,BLUE,CAR");
	            writer.write("750102,2008-09-06,RED,CAR");
	            writer.write("750103,2008-05-01,GREEN,CAR");
	            writer.write("750104,2008-06-08,YELLOW,CAR");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testClassRelationships() {
		System.out.println("------------------------");
		String[] modelElementTypes = {IModelElementFactory.MODEL_TYPE_CLASS};
		Iterator<IModelElement> iter = ApplicationManager.instance().getProjectManager().getProject().allLevelModelElementIterator(modelElementTypes);
		while(iter.hasNext()) {
			IClass c = (IClass) iter.next();
			System.out.println("Name: "+c.getName()+"\t ID: "+c.getId()+"\t Model Element Type: "+c.getModelType());
			
			Iterator<IModelElement> iter2 = c.fromRelationshipIterator();
			System.out.println("\tFrom "+c.getName()+" there are...");
			while(iter2.hasNext()) {
				IModelElement e = iter2.next();
				System.out.println("\tName: "+e.getName()+"\t ID: "+e.getId()+"\t Model Element Type: "+e.getModelType());
			}
			
			iter2 = c.toRelationshipIterator();
			System.out.println("\tTo "+c.getName()+" there are...");
			while(iter2.hasNext()) {
				IModelElement e = iter2.next();
				System.out.println("\tName: "+e.getName()+"\t ID: "+e.getId()+"\t Model Element Type: "+e.getModelType());
			}
		}
		System.out.println("------------------------");
	}
	
	private static void testGeneralizations() {
		System.out.println("------------------------");
		String[] modelElementTypes = {IModelElementFactory.MODEL_TYPE_GENERALIZATION};
		Iterator<IModelElement> iter = ApplicationManager.instance().getProjectManager().getProject().allLevelModelElementIterator(modelElementTypes);
		while(iter.hasNext()) {
			IModelElement e = iter.next();
			System.out.println("\tName: "+e.getName()+"\t ID: "+e.getId()+"\t Model Element Type: "+e.getModelType());
//			System.out.println("\t\tFrom: "+((IGeneralization) e).getFrom().getName()+"\t To: "+((IGeneralization) e).getTo().getName());
			System.out.println("\t\tSuperclass: "+((IGeneralization) e).getFrom().getName()+"\tSubclass: "+((IGeneralization) e).getTo().getName());
		}
		System.out.println("------------------------");
	}

	private static void printAllElements() {
		System.out.println("\n------------------------\n");
		String[] modelElementTypes = {IModelElementFactory.MODEL_TYPE_CLASS, IModelElementFactory.MODEL_TYPE_PACKAGE, IModelElementFactory.MODEL_TYPE_GENERALIZATION};
		Iterator<IModelElement> iter = ApplicationManager.instance().getProjectManager().getProject().allLevelModelElementIterator(modelElementTypes);
		while(iter.hasNext()) {
			IModelElement e = iter.next();
			System.out.println("Name: "+e.getName()+"\t ID: "+e.getId()+"\t Model Element Type: "+e.getModelType());
		}
		System.out.println("\n------------------------\n");
	}
	
	private static void createStereotype() {
		final String str_name = "testStereotype";
		if(StereotypeUtils.getInstalledClassStereotypeNames().contains(str_name)) {
			System.out.println("Stereotype «"+str_name+"» already present.");
		}
		else {
			System.out.println("Stereotype «"+str_name+"» does not exist. Generating it...");
			final IStereotype s = IModelElementFactory.instance().createStereotype();
			s.setName("testStereotype");
			s.setBaseType(IModelElementFactory.MODEL_TYPE_CLASS);
			System.out.println("Stereotype generated.");
		}
	}
	
	private static void deleteStereotype() {
		final String str_name = "testStereotype";
		if(StereotypeUtils.getInstalledClassStereotypeNames().contains(str_name)) {
			System.out.println("Stereotype «"+str_name+"» present. Deleting it...");
			StereotypeUtils.getStereotype(str_name, IModelElementFactory.MODEL_TYPE_CLASS).delete();
			System.out.println("Stereotype deleted.");
		}
		else {
			System.out.println("Stereotype «"+str_name+"» does not exist.");
		}
	}
	
}
