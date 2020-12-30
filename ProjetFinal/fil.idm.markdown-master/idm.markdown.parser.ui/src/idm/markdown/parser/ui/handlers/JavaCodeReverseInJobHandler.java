/*****************************************************************************
 * Copyright (c) 2020 Cedric Dumoulin.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   cedric.dumoulin@univ-lille.fr - Initial API and implementation
 *   
 *****************************************************************************/

package idm.markdown.parser.ui.handlers;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import idm.markdown.parser.ui.Activator;
import idm.markdown.parser.ui.Messages;
import idm.markdown.parser.ui.ProjectExplorerNodeWalkerWithIProgress;
import idm.markdown.parser.ui.ReverseSelectedNodeVisitor;
import idm.markdown.parser.ui.ReverseSelectedNodeVisitor.Parameters;
import idm.markdown.parser.ui.utils.QualifiedNamesFromIJavaElementCollector;


/**
 * A {@link IHandler} to start Java Code reverse.
 * The current selection is retrieved. For each selected element, try to reverse it to UML if it correspond to 
 * Java code.
 *  
 * @author cedric dumoulin
 * 
 * @since 2.0
 */
@SuppressWarnings("nls")
public class JavaCodeReverseInJobHandler extends AbstractExecuteInJobHandler implements IHandler {

	private static String DefaultGenerationModeleName = "";

	
	/**
	 * The selection recorded before the Job was started.
	 */
	private ITreeSelection recordedSelection;

	private int selectedParser = 0;


	private Parameters parameters;

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.handlers.AbstractExecuteInJobHandler#getJobName()
	 *
	 * @return
	 */
	@Override
	String getJobName() {
		return "Reverse Java Code";
	}

	/**
	 * @param event
	 * @return True if the execution should continue, false if the execution should stop.
	 */
	@Override
	protected boolean doPrepareExecute(ExecutionEvent event) {
		

		// Get reverse parameters from a dialog
		Shell shell = getShell();
		// ReverseCodeDialog dialog = new ReverseCodeDialog(shell, DefaultGenerationPackageName, Arrays.asList("generated") );
////		final ReverseCodeDialog dialog = getDialog(shell, modelUid);
//
//		int res = dialog.open();
//		// System.out.println("dialog result =" + res);
//		if (res == Window.CANCEL) {
//			return false;
//		}
		
		parameters = new ReverseSelectedNodeVisitor.Parameters();
//		parameters.setSearchPaths( Arrays.asList(dialog.getSearchPath() ) );
//		parameters.setPackageName( getPackageName(dialog) );
//		selectedParser = dialog.getSelectedParserIndex();
//		parameters.setCreationPaths(dialog.getCreationPaths());
		
		// Create reverse command
		ISelection selection = getCurrentSelection();
		if(! (selection instanceof ITreeSelection) ) {
			Status errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ReverseCodeHandler_WrongSelectionType_Title);
			ErrorDialog.openError(shell, "", Messages.ReverseCodeHandler_WrongSelectionType_Message, errorStatus);

			// Stop the handler execution.
			return false;
		}
		recordedSelection = (ITreeSelection)selection;
		
		// Get qualified names of CUs in projects
		QualifiedNamesFromIJavaElementCollector collector = new QualifiedNamesFromIJavaElementCollector(false, true, false);
		List<String> qualifiedNamesInProjects = collector.getQualifiedNamesFromSelection(recordedSelection);
		parameters.setQualifiedNamesInProjects(qualifiedNamesInProjects);
		
		return true;
	}

	/**
	 * Method called from a Job, and in a Transactionnal command
	 * @param monitor
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected void doExecuteTransactionInJob(IProgressMonitor monitor) {
		System.err.println("Transaction and job called !");

		switch( selectedParser  ) {
		case 0 :
		case 1 :
			// JAvaParser
			ReverseSelectedNodeVisitor visitor = new ReverseSelectedNodeVisitor(parameters);
//			ProjectExplorerNodeWalker reverseWalker = new ProjectExplorerNodeWalker(visitor);
			ProjectExplorerNodeWalkerWithIProgress reverseWalker = new ProjectExplorerNodeWalkerWithIProgress(visitor);
			reverseWalker.visit(recordedSelection.toList(), monitor);
			break;
			
		case 2 :
			// JDT Parser
			System.err.println("Use JDT parser (todo)");
			return;
		}
		// Perform reverse

	}


	/**
	 * The dialog used for user.
	 *
	 * @param shell
	 * @param modelUid
	 * @return the dialog to show to user
	 */
//	protected ReverseCodeDialog getDialog(Shell shell, String modelUid) {
//		
//		String selectedProjectName;
//		try {
//			selectedProjectName = getSelectedProjectName();
//		} catch (MarkdownParserUIException e) {
//			selectedProjectName = "";
//		}
//		
//		return new ReverseCodeDialog(shell, modelUid, selectedProjectName, null);
//	}
	
	/**
	 * Find the name of the model provided by the dialog
	 *
	 * @param dialog
	 *            opened dialog to user
	 * @return the name of the model. If the user has changed this name, return the name provided by the user; return the default model name
	 *         otherwise.
	 */
//	protected String getPackageName(ReverseCodeDialog dialog) {
//		String generationPackageName = dialog.getValue();
//		if (generationPackageName == null || generationPackageName.length() == 0) {
//			generationPackageName = DefaultGenerationModeleName;
//		}
//		return generationPackageName;
//	}
}
