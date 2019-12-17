package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class DiagonalType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"",
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"thickness", "disabledColor"
		};
	}

}
