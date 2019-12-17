package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class YellowBoxType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"disabledText",
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"",
		};
	}

}
