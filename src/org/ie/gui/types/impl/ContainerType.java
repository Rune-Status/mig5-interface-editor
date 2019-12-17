package org.ie.gui.types.impl;

import org.ie.gui.types.Type;

public class ContainerType extends Type {

	@Override
	public String[] getOldFormatVariables() {
		return new String[] {
			"maxScrollVertical", "hidden"
		};
	}

	@Override
	public String[] getNewFormatVariables() {
		return new String[] {
			"maxScrollHorizontal", "maxScrollVertical"
		};
	}
	
}
