package org.ie.gui.types;

public abstract class Type {
	
	public abstract String[] getOldFormatVariables();
	
	public abstract String[] getNewFormatVariables();
	
	public String[] getVariables(boolean old) {
		if(!old)
			return getNewFormatVariables();
		return getOldFormatVariables();
	}

}
