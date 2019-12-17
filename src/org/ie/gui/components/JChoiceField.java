package org.ie.gui.components;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public abstract class JChoiceField extends JComboBox {

	private static final long serialVersionUID = 1L;
	
	public JChoiceField(final String[] choices, final String[] values) {
		super(choices);
		addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange() == ItemEvent.SELECTED) {
					int index = getSelectedIndex();
					try {
						valueChanged(choices[index], values[index]);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	public abstract void valueChanged(String choice, String value) throws Exception;
	
}
