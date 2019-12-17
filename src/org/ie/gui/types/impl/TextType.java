package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class TextType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"horizontalAlignment", "verticalAlignment", "verticalSpacing", "font", "shaded", "disabledText", "enabledText", "disabledColor", "enabledColor", "disabledMouseOverColor", "enabledMouseOverColor"
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"font", "disabledText", "verticalSpacing", "horizontalAlignment", "verticalAlignment", "shaded", "disabledColor"
		};
	}

}
