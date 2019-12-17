package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class UnknownType1 extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"disabledColor", "horizontalAlignment", "verticalAlignment", "anInt420", "font", "shaded",
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"",
		};
	}

}
