/**
 * 
 */
package idm.markdown.parser.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

/**
 * Class used to Compute the output file name from the input filename.
 * 
 * Computation of the filename take into account :
 * - the preferences,(to be defined) 
 * - the first selected elements (folder or file)
 * 
 * 
 * @author dumoulin
 *
 */
public class FilenameCalculator implements IFilenameCalculator {

	/**
	 * Name o the outputFolder relative to the enclosing project.
	 */
	protected String outputFolder;
	
	protected IFolder startFolder;
	
	/**
	 * Compute the output file name from the input filename
	 * @param file
	 * @return
	 */
	@Override
	public String computeFileNameFor(IFile file) {
		
		return null;
	}
	
	/**
	 * Called when Visitor enter a {@link IFolder}
	 * @param folder
	 */
	@Override
	public void enterFolder( IFolder folder) {
		// Memorize the start folder
		if( startFolder != null ) {
			return;
		}
		
		// we enter the first folder
		startFolder = folder;
		
	}
}
