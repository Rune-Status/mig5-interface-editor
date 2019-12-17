package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class SpriteType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"disabledSprite", "enabledSprite"
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"disabledSprite", "rotation", "gridOriginal", "alpha", "outline", "shadow", "flipVertical", "flipHorizontal"
		};
	}

}
