/**
 * 
 */
package idm.markdown.parser;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import idm.simplemarkdown.mm.simplemarkdown.Document;
import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory;

/**
 * A class used to help to manage an EMF Model.
 * 
 * @author dumoulin
 *
 */
public class EmfModelManager {

	/**
	 * The current {@link ResourceSet}
	 */
	protected ResourceSet resourceSet;
	
	/**
	 * Current {@link Resource}
	 */
	protected Resource resource;
	
	/**
	 * Constructor
	 */
	public EmfModelManager() {
		
		// Save doc
		// Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("simplemarkdown", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        resourceSet = new ResourceSetImpl();

	}
	
	public void createModelResource(String filename) {
		
	}
	
	public void getModel() {
		
	}

	/** 
	 * Create a Document for the specified input File
	 * @param file
	 * @return
	 */
	public Document createFileDocumentFor(File file) {
		
        // create a resource
//        Resource resource = resourceSet.createResource(URI.createURI("tests/test1.simplemarkdown"));
        try {
        	String filename = file.getPath();
        	
        	System.out.println("Destination resource : " + filename );
        	
			resource = resourceSet.createResource(URI.createFileURI(filename));
//			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        resource = resourceSet.createResource(URI.createFileURI(file.getCanonicalPath()));
        
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName(file.getPath());

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(doc);

        return doc;
	}

	/** 
	 * Create a Document for the specified input File
	 * @param file
	 * @return
	 */
	public Document createPlatformResourceDocumentFor(File file) {
		
        // create a resource
//        Resource resource = resourceSet.createResource(URI.createURI("tests/test1.simplemarkdown"));
        try {
        	String filename = file.getPath();
        	
        	System.out.println("Destination resource : " + filename );
        	
//			resource = resourceSet.createResource(URI.createFileURI(filename));
			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        resource = resourceSet.createResource(URI.createFileURI(file.getCanonicalPath()));
        
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName(file.getPath());

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(doc);

        return doc;
	}

	public void saveDocument(Document doc, File file) {
        // now save the content.
		System.out.println("save resource to : " + resource.getURI());
       try {
           resource.save(Collections.EMPTY_MAP);
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
	}
}
