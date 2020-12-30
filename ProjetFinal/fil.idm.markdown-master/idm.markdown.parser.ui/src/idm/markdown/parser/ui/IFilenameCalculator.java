package idm.markdown.parser.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

public interface IFilenameCalculator {

	/**
	 * Compute the output file name from the input filename
	 * @param file
	 * @return
	 */
	String computeFileNameFor(IFile file);

	/**
	 * Called when Visitor enter a {@link IFolder}
	 * @param folder
	 */
	void enterFolder(IFolder folder);

}