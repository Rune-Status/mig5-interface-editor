package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class RectangleType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"filled", "disabledColor", "enabledColor", "disabledMouseOverColor", "enabledMouseOverColor",
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"disabledColor", "filled", "alpha"
		};
	}

}
