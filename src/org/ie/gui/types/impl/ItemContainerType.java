package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class ItemContainerType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"inv", "invStackSize", "invSpritePadX", "invSpritePadY", "spriteY", "spriteX", "spriteId",
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"",
		};
	}

}
