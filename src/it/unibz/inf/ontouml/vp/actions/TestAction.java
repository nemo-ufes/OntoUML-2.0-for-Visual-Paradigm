package it.unibz.inf.ontouml.vp.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.IStereotype;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;

public class TestAction implements VPActionController {

	@Override
	public void performAction(VPAction arg0) {
		testClassRelationships();
//		testGeneralizations();
//		printAllElements();
//		createStereotype();
//		deleteStereotype();
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub

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
		if(StereotypeUtils.getAllStereotypeNames().contains(str_name)) {
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
		if(StereotypeUtils.getAllStereotypeNames().contains(str_name)) {
			System.out.println("Stereotype «"+str_name+"» present. Deleting it...");
			StereotypeUtils.getStereotype(str_name, IModelElementFactory.MODEL_TYPE_CLASS).delete();
			System.out.println("Stereotype deleted.");
		}
		else {
			System.out.println("Stereotype «"+str_name+"» does not exist.");
		}
	}
	
}
