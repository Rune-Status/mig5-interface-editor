package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class ModelType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"modelTypeDisabled", "mediaIdDisabled", "mediaTypeEnabled", "mediaIdEnabled", "disabledAnim", "enabledAnim", "zoom", "rotateX", "rotateY"
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"modelTypeDisabled", "mediaIdDisabled", "translateX", "translateY", "rotateX", "rotateY", "rotateZ", "zoom", "disabledAnim", "aBoolean364"
		};
	}

}
