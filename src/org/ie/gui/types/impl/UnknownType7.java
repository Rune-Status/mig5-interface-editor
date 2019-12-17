package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class UnknownType7 extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"inv", "invStackSize", "textAlignment", "font", "shaded", "disabledColor", "invSpritePadX", "invSpritePadY", "actions"
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"",
		};
	}

}
