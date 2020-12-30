/**
 * 
 */
package idm.markdown.parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import idm.simplemarkdown.mm.simplemarkdown.Document;
import idm.simplemarkdown.mm.simplemarkdown.Paragraph;
import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory;

/**
 * @author dumoulin
 *
 */
public class CreateModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputFolder ="src/resources/md/";
		String outputFolder = "tests/";
		String filename = "tests";
		
		String inputFile = inputFolder + filename + ".md";
		String outputFile = outputFolder + filename + ".simplemarkdown";
		
		CreateModel create = new CreateModel();
//		create.parseMarkdownFile(inputFile, outputFile);
		create.parseWithEmfModelManager(inputFile, outputFile);
	}

	/**
	 * 
	 */
	private void parseMarkdownFile(String inputFilename, String outputFilename) {
		// Create a Document
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName("My doc !");
		Paragraph para1 = SimplemarkdownFactory.eINSTANCE.createParagraph();
		
		doc.getContents().add(para1);
		
		// Save doc
		// Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("simplemarkdown", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI.createURI(outputFilename));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(doc);
        
        parseMarkdownFile(inputFilename, doc);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	
	}
	
	/**
	 * 
	 * @param doc
	 */
	private void parseMarkdownFile(String inputFilename, Document doc) {
		
		// Open file
		FileReader reader;
        try {        	
        	reader = new FileReader(new File(inputFilename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
        
        // Parse file
        Markdown2Model parser = new Markdown2Model();
        parser.parseFile(reader, doc);
        
	}

	/**
	 * 
	 */
	private void parseWithEmfModelManager( String inputFilename, String outputFilename) {
		
		EmfModelManager modelManager = new EmfModelManager();
        Markdown2Model parser = new Markdown2Model();


		// 
		File outputfile = new File(outputFilename);	
		Document doc = modelManager.createFileDocumentFor(outputfile);
		
        
		// Open file
		FileReader reader;
        try {
        	reader = new FileReader(new File(inputFilename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
        
        // Parse file
        parser.parseFile(reader, doc);
 
        // Save document
        modelManager.saveDocument(doc, outputfile);
	}

}
