package org.ie.gui.components;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;

public abstract class JFormattedField extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private JSpinField inputField;
	private JTextField resultField;
	
	public JFormattedField() {
		this(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public JFormattedField(int min, int max) {
		setLayout(new GridLayout(1, 2));
		resultField = new JTextField(5);
		resultField.setEnabled(false);
		inputField = new JSpinField() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public void stateChanged(ChangeEvent event) {
				try {
					SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
					int value = newValue(model.getNumber().intValue());
					setValue(value);
					
					int formattedValue = Integer.parseInt(getFormat(value + ""));
					
					resultField.setText(formattedValue + "");
					valueChanged(formattedValue);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		add(inputField, BorderLayout.CENTER);
		add(resultField, BorderLayout.EAST);
	}

	public void setValue(int value) {
		inputField.setValue(value);
	}
	
	public int newValue(int value) {
		return value;
	}
	
	public String getFormat(String value) {
		return value;
	}
	
	public abstract void valueChanged(int value);

}
