package org.ie;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.ie.client.Class37_Sub2;
import org.ie.gui.GUI;

public class Main {
	
	public static final int VERSION = 490;
	private static GUI gui;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Main();
			}
			
		});
	}

	public static int gamepanel;
	
	private Main() {
		gui = new GUI();
	}
	
	public static GUI getGUI() {
		return gui;
	}

}
