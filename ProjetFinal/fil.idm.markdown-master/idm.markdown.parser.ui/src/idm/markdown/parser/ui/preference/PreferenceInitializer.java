/*****************************************************************************
 * Copyright (c) 2014 Jonathan Geoffroy
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Jonathan Geoffroy	geoffroy.jonathan@gmail.com		initial implementation
 *
 *****************************************************************************/
package idm.markdown.parser.ui.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import idm.markdown.parser.ui.Activator;
/**
 * Initialize reverse eclipse preference by default values.
 * 
 * @author Jonathan Geoffroy
 *
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public PreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("nls")
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		store.setDefault(PreferenceConstants.P_SEARCH_PATH, "java;*;osgi.*;datatype");
//		store.setDefault(PreferenceConstants.P_CREATION_PATH, "java.* ; ; java" 
//		        + CreationPathListEditor.SPLIT_STRING + "org.eclipse.papyrus.* ; ; *" 
//				+ CreationPathListEditor.SPLIT_STRING + "org.eclipse.* ; org.eclipse.papyrus.* ; *" 
//		        + CreationPathListEditor.SPLIT_STRING + " org.osgi.* ; ; osgi.*" 
//				+ CreationPathListEditor.SPLIT_STRING + " datatype.* ; ; datatype");
	}
}
