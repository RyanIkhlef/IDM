/*****************************************************************************
 * Copyright (c) 2016 Cedric Dumoulin and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Cedric Dumoulin - Initial API and implementation
 *   
 *****************************************************************************/

package idm.markdown.parser.ui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ITypeRoot;

import idm.markdown.parser.EmfModelManager;
import idm.markdown.parser.Markdown2Model;
import idm.simplemarkdown.mm.simplemarkdown.Document;

/**
 * This visitor visit the provided Nodes. 
 * Node are usually selections from Eclipse Project/Package Explorers.
 * 
 * This visitor walk the nodes and apply the appropriate code reverse.
 * 
 * @author cedric dumoulin
 *
 */
public class ReverseSelectedNodeVisitor implements IProjectExplorerNodeVisitor {


	protected Markdown2Model parser;
	protected EmfModelManager modelManager;
	
	/**
	 * List of reversed elements. This list is filled with the found reversed elements.
	 * The result is available after all node visit.
	 * 
	 */
	protected List<String> reversedElementQualifiedNames;

	
	/**
	 * Constructor.
	 *
	 */
	public ReverseSelectedNodeVisitor(Package rootPackage, String generatedPackageName, List<String> searchPaths, List<String> creationPaths, List<String> qualifiedNamesInProjects) {
        System.out.println("Should create parser here");
        
        parser = new Markdown2Model();
        modelManager = new EmfModelManager();
        
        IFilenameCalculator filenameCalculator = new FilenameCalculator();
	}

	/**
	 * Constructor.
	 *
	 * @param parameters
	 */
	public ReverseSelectedNodeVisitor(Parameters parameters) {
		this( parameters.getUmlRootPackage(), parameters.getPackageName(), parameters.getSearchPaths(), parameters.getCreationPaths(), parameters.getQualifiedNamesInProjects());
	}

	/**
	 * @return the reversedElementQualifiedNames
	 */
	public List<String> getReversedElementQualifiedNames() {
		return reversedElementQualifiedNames;
	}


	
	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitICompilationUnit(org.eclipse.jdt.core.ICompilationUnit)
	 *
	 * @param unit
	 */
	@Override
	public void visitICompilationUnit(ICompilationUnit unit) {
		processITypeRoot(unit);
	}

	/**
	 * Process a {@link ICompilationUnit} or a {@link IClassFile}.
	 * 
	 * @param unit
	 */
	@SuppressWarnings("nls")
	protected void processITypeRoot(ITypeRoot unit) {
		System.out.println("try to reverseType(" + unit.getElementName() + ")");
//		try {
//			String source = unit.getSource();
//			if (source == null)
//			{
//				System.err.println("No source attached to unit '" + unit.getElementName() + "'");
//				return;
//			}
//
//
//			CompilationUnit cu = JavaParser.parse(new StringReader(source),true);
//			javaAnalyser.processCompilationUnit(cu);
//			// Add the name to the reversed list
//			addReversedName(unit.findPrimaryType().getFullyQualifiedName('.'));
//		} catch (JavaModelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIClassFile(org.eclipse.jdt.core.IClassFile)
	 *
	 * @param unit
	 */
	@Override
	public void visitIClassFile(IClassFile unit) {
		processITypeRoot(unit);
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIPackageFragment(org.eclipse.jdt.core.IPackageFragment)
	 *
	 * @param node
	 */
	@Override
	public void visitIPackageFragment(IPackageFragment node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIPackageFragmentRoot(org.eclipse.jdt.core.IPackageFragmentRoot)
	 *
	 * @param node
	 */
	@Override
	public void visitIPackageFragmentRoot(IPackageFragmentRoot node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIClasspathContainer(org.eclipse.jdt.core.IClasspathContainer)
	 *
	 * @param node
	 */
	@Override
	public void visitIClasspathContainer(IClasspathContainer node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIProject(org.eclipse.core.resources.IProject)
	 *
	 * @param node
	 */
	@Override
	public void visitIProject(IProject node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitIFile(IFile node) {
		
		if( "md".equals( node.getFileExtension() ) ) {
			System.out.println("Visit markdown file " + node.getName());
			System.out.println("Visit markdown fullpath " + node.getFullPath());
			System.out.println("Visit markdown location " + node.getLocation().toString());
		}
		else {
		    System.out.println("Visit file " + node.getName());
		    return;
		    
		}   
		
//		node.getProject();
//		node.getF
		
		// Compute model filename
		IPath modelPath = node.getFullPath().removeFileExtension().addFileExtension("simplemarkdown");
//		IPath modelPath = node.getLocation().removeFileExtension().addFileExtension("simplemarkdown");
		System.out.println("Destination file = " + modelPath.toString());
		
		
		
//		modelPath = new Path("tests/test2.simplemarkdown");
	    Document doc = modelManager.createPlatformResourceDocumentFor( modelPath.toFile() );
	    
		FileReader reader;
        try {
//	        String filename = "src/resources/md/installPapyrus.md";
        	File filename = node.getLocation().toFile();

        	
        	reader = new FileReader(filename);
        	// parse file
        	parser.parseFile(reader, doc);
        	// Close resource
            reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

        
        modelManager.saveDocument(doc, modelPath.toFile());
	}

	@Override
	public void visitIFolder(IFolder node) {
		
	}

	
	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIJavaProject(org.eclipse.jdt.core.IJavaProject)
	 *
	 * @param node
	 */
	@Override
	public void visitIJavaProject(IJavaProject node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Parameters to provide to the constructor.
	 *
	 */
	static public class Parameters {
		protected List<String> searchPaths;
		
		protected List<String> creationPaths;
		
		protected Package umlRootPackage;
		
		protected String packageName;
		
		protected List<String> qualifiedNamesInProjects;

		/**
		 * @return the searchPaths
		 */
		public List<String> getSearchPaths() {
			return searchPaths;
		}

		/**
		 * @param searchPaths the searchPaths to set
		 */
		public void setSearchPaths(List<String> searchPaths) {
			this.searchPaths = searchPaths;
		}

		/**
		 * @return creationPaths
		 */
		public List<String> getCreationPaths() {
			return creationPaths;
		}

		/**
		 * @param creationPaths the creationPaths to set
		 */
		public void setCreationPaths(List<String> creationPaths) {
			this.creationPaths = creationPaths;
		}

		/**
		 * @return the umlModel
		 */
		public Package getUmlRootPackage() {
			return umlRootPackage;
		}

		/**
		 * @param umlModel the umlModel to set
		 */
		public void setUmlRootPackage(Package umlModel) {
			this.umlRootPackage = umlModel;
		}

		/**
		 * @return the packageName
		 */
		public String getPackageName() {
			return packageName;
		}

		/**
		 * @param packageName the packageName to set
		 */
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public List<String> getQualifiedNamesInProjects() {
			return qualifiedNamesInProjects;
		}

		public void setQualifiedNamesInProjects(List<String> qualifiedNamesInProjects) {
			this.qualifiedNamesInProjects = qualifiedNamesInProjects;
		}
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#postVisit()
	 *
	 */
	@Override
	public void postVisit() {
		// Nothing
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#preVisit()
	 *
	 */
	@Override
	public void preVisit() {
	}
}
