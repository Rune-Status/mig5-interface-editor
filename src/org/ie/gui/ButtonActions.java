package org.ie.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import mgi.tools.rseditor.core.cache.Folder;
import mgi.tools.rseditor.core.utilities.ByteBuffer;

import org.ie.Main;
import org.ie.client.*;
import org.ie.utils.SpringUtilities;
import org.ie.utils.Utils;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class ButtonActions implements ActionListener {
	
	public byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
    
        // Get the size of the file
        long length = file.length();
    
        if (length > Integer.MAX_VALUE) {
            // File is too large
        }
    
        // Create the byte array to hold the data
        byte[] bytes = new byte[(int)length];
    
        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }
    
        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+file.getName());
        }
    
        // Close the input stream and return bytes
        is.close();
        return bytes;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		if(action.equalsIgnoreCase("export")) {
			try {
				Folder folder = Packing.fs3.findFolderByID(GUI.selectedParent);
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(Signlink.findCacheDirectory()+"/dumpedInterfaces/"+GUI.selectedParent+".dat"));
				dos.write(folder.pack().getBuffer());
				dos.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(action.equalsIgnoreCase("import")) {
			try {
				Folder folder = Packing.fs3.findFolderByID(GUI.selectedParent);
				byte[] buffer = getBytesFromFile(new File(Signlink.findCacheDirectory()+"/dumpedInterfaces/"+GUI.selectedParent+".dat"));
				folder.loadGhetto(new ByteBuffer(buffer));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(action.equalsIgnoreCase("duplicate current")) {
			Class37_Sub9_Sub29.mainInterfaceArray = Utils.expand2dArray(Class37_Sub9_Sub29.mainInterfaceArray);
			Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1] = new RSInterface[Class37_Sub9_Sub29.mainInterfaceArray[GUI.selectedParent].length];
			for(int i = 0; i < Class37_Sub9_Sub29.mainInterfaceArray[GUI.selectedParent].length; i++) {
				Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1][i] = Class37_Sub9_Sub29.mainInterfaceArray[GUI.selectedParent][i];
			}
			//System.arraycopy(Class37_Sub9_Sub29.mainInterfaceArray[GUI.selectedParent], 0, Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1], 0, Class37_Sub9_Sub29.mainInterfaceArray[GUI.selectedParent].length);
			Class15_Sub1.aBooleanArray1754 = new boolean[Class37_Sub9_Sub29.mainInterfaceArray.length + 1];
			Class15_Sub1.aBooleanArray1754[Class37_Sub9_Sub29.mainInterfaceArray.length - 1] = true;
			GUI.selectedParent = Class37_Sub9_Sub29.mainInterfaceArray.length - 1;
			GUI.selectedChild = 0;
			Utils.openInterface(GUI.selectedParent, 0);
			GUI.tabs.setSelectedIndex(1);
		}
		if(action.equalsIgnoreCase("new interface")) {
			for(int i = 0; i < Class37_Sub4_Sub14.aClass15_2805.method108((byte) 64); i++) 
				InterfaceClickMask.loadExists(i);
			//System.out.println(Class37_Sub9_Sub29.mainInterfaceArray.length);
			Class37_Sub9_Sub29.mainInterfaceArray = Utils.expand2dArray(Class37_Sub9_Sub29.mainInterfaceArray);
			Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1][0] = new RSInterface();
			Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1][0].type = 1;
			Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1][0].newFormat = false;
			Class37_Sub9_Sub29.mainInterfaceArray[Class37_Sub9_Sub29.mainInterfaceArray.length - 1][0].bitPacked = (Class37_Sub9_Sub29.mainInterfaceArray.length - 1 << 1382429264);
			//System.out.println(Class37_Sub9_Sub29.mainInterfaceArray.length);
			Class15_Sub1.aBooleanArray1754 = new boolean[Class37_Sub9_Sub29.mainInterfaceArray.length + 1];
			Class15_Sub1.aBooleanArray1754[Class37_Sub9_Sub29.mainInterfaceArray.length - 1] = true;
			GUI.selectedParent = Class37_Sub9_Sub29.mainInterfaceArray.length - 1;
			GUI.selectedChild = 0;
			Utils.openInterface(GUI.selectedParent, 0);
			GUI.tabs.setSelectedIndex(1);
		}
		if(action.equalsIgnoreCase("test")) {
			for(int parent = 0; parent < 700; parent++) {
				for(int child = 0; child < 1000; child++) {
					RSInterface inter = Class37_Sub9_Sub14.getInterface(parent << 16 | child);
					if(inter != null) {
						if(inter.invStackSize != null) {
							//for(int i = 0; i < inter.mouseDraggedListener.length; i++) {
							//	System.out.println(inter.mouseDraggedListener[i]);
							//}
							System.out.println("Found "+parent+":"+child);
							System.out.println();
						}
					}
				}
			}
			/*for(int i = 0; i < 10000; i++) {
				Class37_Sub4_Sub10 class37_sub4_sub10 = Class84.method1317(i);
				if(class37_sub4_sub10 != null) {
					if(!class37_sub4_sub10.aClass16_2673.toString().equalsIgnoreCase("null")) {
						for(int a = 0; a < class37_sub4_sub10.aClass16Array2675.length; a++)
							System.out.println(class37_sub4_sub10.aClass16Array2675[a]);
					}
				}
			}*/
			/*for(int i = 0; i < 5000; i++) {
				ClientScriptDef class37_sub4_sub6 = Class37_Sub9_Sub20.list(true, i);
				if(class37_sub4_sub6 != null) {
					for(int a = 0; a < class37_sub4_sub6.opcodes.length; a++) {
						int opcode = class37_sub4_sub6.opcodes[a];
						if(opcode == 3605) {
							System.out.println("script "+i+":"+opcode);
						//System.out.println(class37_sub4_sub6.opcodes[a]);
							for(int b = 0; b < class37_sub4_sub6.values.length; b++) {
								//System.out.println(class37_sub4_sub6.anIntArray2611[b]+":"+b);
							}
							//System.out.println();
							//if(class37_sub4_sub6.aClass16Array2617[b] != null) {
							//for(int b = 0; b < class37_sub4_sub6.aClass16Array2617.length; b++)
							//if(class37_sub4_sub6.aClass16Array2617[b] != null) {
							//	System.out.print(new String(class37_sub4_sub6.aClass16Array2617[b].aByteArray1669)+", ");
							//}
						}
					}
						//if(class37_sub4_sub6.aClass16Array2617[a] != null)
					//if(class37_sub4_sub6.name != null)
						//System.out.print(new String(class37_sub4_sub6.name.aByteArray1669)+", ");
					}
					//System.out.println("Script "+i+":"+class37_sub4_sub6.opcodes[0]);
					//System.out.println();
				//}
			}
			//itemId, outline?, dummy, somethign with cache, stack, something with outline?
			/*for(int i = 0; i < 11791; i++) {
				RSItem item = Class46.loadItem(i, (byte) 100);
				if(item != null) {
					if(item.certID == -1 || item.itemName.toString().equalsIgnoreCase("null")) {
						Class37_Sub4_Sub9_Sub3 image = Class37_Sub4_Sub7_Sub1_Sub2.method507(i, 0, false, false, -1, 0);
						image.dumpImage("images32", ""+i, true);
					}
				}
			}*/
			/*System.out.println("Inventory length="+Class37_Sub16.aClass15_2152.method129(5));
			for(int i = 0; i < Class37_Sub16.aClass15_2152.method129(5); i++) {
				InventoryDef iType = Class17.list(i);
				System.out.println("inv type="+i+", size="+iType.size);
			}
			System.out.println("the end");*/
		}
		if(action.equalsIgnoreCase("send varp")) {
			JPanel panel = new JPanel(new SpringLayout());
			JTextField idField = new JTextField(20);
			panel.add(new JLabel("Args(Split by , ):"));
			panel.add(idField);
			SpringUtilities.makeCompactGrid(panel, 1, 2, 0, 0, 5, 5);
			int ret = JOptionPane.showConfirmDialog(Main.getGUI().getMainFrame(), panel, "Send varp", JOptionPane.OK_CANCEL_OPTION);
			if (ret == JOptionPane.OK_OPTION) {
				String[] split = idField.getText().split(",");
				int value = Integer.parseInt(split[1]);
				int id = Integer.parseInt(split[0]);
				Class80.anIntArray1503[id] = value;
				if ((value ^ 0xffffffff) != (Class37_Sub23.varpData[id] ^ 0xffffffff)) {
					Class37_Sub23.varpData[id] = value;
					Cache.method1183(id, (byte) -3);
				}
				Class37_Sub9_Sub1.scriptedVarp[Class37_Sub4_Sub7.method490(
						Class24.scriptedVarpLength++, 31)] = id;
			}
		}
		if(action.equalsIgnoreCase("run script")) {
			JPanel panel = new JPanel(new SpringLayout());
			JTextField idField = new JTextField(20);
			panel.add(new JLabel("Args:"));
			panel.add(idField);
			SpringUtilities.makeCompactGrid(panel, 1, 2, 0, 0, 5, 5);
			int ret = JOptionPane.showConfirmDialog(Main.getGUI().getMainFrame(), panel, "Run script", JOptionPane.OK_CANCEL_OPTION);
			if (ret == JOptionPane.OK_OPTION) {
				Object[] split = idField.getText().split(",");
				Object[] data = new Object[split.length];
				for(int i = 0; i < split.length; i++) {
					try {
						data[i] = new Integer(Integer.parseInt((String) split[i]));
					} catch(Exception ea) {
						data[i] = new String((String) split[i]);
					}
				}
				System.out.println(Arrays.toString(data));
				InterfaceListener class37_sub8 = new InterfaceListener();
				class37_sub8.objectData = data;
				Class43.executeScript(class37_sub8);
			}
		}
		
		if(action.equalsIgnoreCase("edit listeners")) {
			try {
				JDialog dialog = new JDialog();
				dialog.setTitle("Edit listeners");
				dialog.setSize(300, 400);
				dialog.setLocationRelativeTo(Main.getGUI().getMainFrame());
				JPanel panel = new JPanel(new SpringLayout());
				
				if(GUI.selectedChildInterface != null) {
					String[] labels = new String[0];
					
					if(GUI.selectedChildInterface.newFormat) {
						labels = new String[] {
							"onStartListener", "mouseFocusListener", "mouseFocusedListener", "mouseUnfocusListener", "spellUsedListener", "spellUsedOnItemListener", "varpUpdateListener", "inventoryUpdateListener", "skillUpdateListener", "mainLoopListener", "anObjectArray363", "mouseClickFocusListener", "mouseClickListener", "mouseClickUnfocusListener", "mouseDraggedListener", "anObjectArray409", "anObjectArray456", "mouseWheelListener", "newListener1", "newListener2", "varpListenerValues", "inventoryListenerValues", "skillListenerValues", "newListener1Values", "newListener2Values",
						};
					} else {
						labels = new String[] {
							"requiredValues", "valueCompareType", "cs1opcodes",
						};
					}
					final JTextField[] textFields = new JTextField[labels.length];
					
					for(int i = 0; i < labels.length; i++) {
						panel.add(new JLabel(labels[i]));
						textFields[i] = new JTextField(10);
						JTextField textField = textFields[i];
						
						Field field = GUI.selectedChildInterface.getClass().getDeclaredField(labels[i]);
						textField.setText(Utils.parseArray(field));
						panel.add(textField);
					}
					
					panel.add(new JLabel());
					JButton apply = new JButton("Apply");
					panel.add(apply);
					final String[] finalLabels = labels;
					apply.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent event) {
							for(int i = 0; i < finalLabels.length; i++) {
								try {
									Field field = GUI.selectedChildInterface.getClass().getDeclaredField(finalLabels[i]);
									if(field.getGenericType().equals(Object[].class)) {
										if(textFields[i].getText().length() <= 0) {
											field.set(GUI.selectedChildInterface, null);
											continue;
										}
										Object[] newValue = Iterables.toArray(Splitter.on("__").split(textFields[i].getText()), Object.class);
										for(int j = 0; j < newValue.length; j++) {
											String value = (String) newValue[j];
											try {
												newValue[j] = Integer.parseInt(value);
											} catch(Exception e) {
												//newValue[j] = Class37_Sub2.crateRSString((byte) 102, value);
												newValue[j] = Utils.convertString(value);
											}		
										}
										field.set(GUI.selectedChildInterface, newValue);
									} else if(field.getGenericType().equals(int[].class)) {
										if(textFields[i].getText().length() <= 0) {
											field.set(GUI.selectedChildInterface, null);
											continue;
										}
										String[] newValueStr = Iterables.toArray(Splitter.on("__").split(textFields[i].getText()), String.class);
										int[] newValue = new int[newValueStr.length];
										for(int j = 0; j < newValueStr.length; j++) {
											newValue[j] = Integer.parseInt(newValueStr[j]);
										}
										field.set(GUI.selectedChildInterface, newValue);
									} else if(field.getGenericType().equals(int[][].class)) {
										if(textFields[i].getText().length() <= 0) {
											field.set(GUI.selectedChildInterface, null);
											continue;
										}
										String text = textFields[i].getText().substring(1, textFields[i].getText().length() - 1);
										String[] newValueStr = Iterables.toArray(Splitter.on(",").split(text), String.class);
										int[][] newValues = new int[1][];
										newValues[0] = new int[newValueStr.length];
										for(int a = 0; a < newValueStr.length; a++) {
											System.out.println(newValueStr[a]);
											newValues[0][a] = Integer.parseInt(newValueStr[a]);
										}
										field.set(GUI.selectedChildInterface, newValues);
										//System.out.println(textFields[i].getText()+":"+text);
									}
								} catch(Exception e) {
									e.printStackTrace();
								}
							}
						}
					});
					SpringUtilities.makeCompactGrid(panel, labels.length + 1, 2, 5, 5, 5, 5);
				}
				
				dialog.add(panel);
				dialog.pack();
				dialog.setVisible(true);
			} catch(Exception ea) {
				ea.printStackTrace();
			}
		}
		if(action.equalsIgnoreCase("open")) {
			JPanel panel = new JPanel(new SpringLayout());
			String[] labels = { "Using 548", "Id:", "Location:" };
			Object[][] locations = {
					{ "Viewport", "Chatbox", "Sidebar" },
					{ 62, 79, 84 },
			};
			JTextField idField = new JTextField(10);
			JCheckBox box = new JCheckBox();
			JComboBox locationList = new JComboBox(locations[0]);
			
			for (int i = 0; i < labels.length; i++) {
				panel.add(new JLabel(labels[i]));
				if(i == 0)
					panel.add(box);
				if(i == 1)
					panel.add(idField);
				if(i == 2)
					panel.add(locationList);
			}
			SpringUtilities.makeCompactGrid(panel, labels.length, 2, 0, 0, 5, 5);
			int ret = JOptionPane.showConfirmDialog(GUI.mainFrame, panel,"Open interface", JOptionPane.OK_CANCEL_OPTION);
			if (ret == JOptionPane.OK_OPTION) {
				int id = Integer.parseInt(idField.getText());
				int location = (Integer) locations[1][locationList.getSelectedIndex()];
				boolean using_548 = box.isSelected();
				GUI.selectedParent = id;
				GUI.selectedChild = 0;
				if(using_548) {
					if(Main.gamepanel != 548) {
						Main.gamepanel = 548;
					    InterfaceClickMask.resetComponentAnimation(Main.gamepanel);
					    Class87.executeOnStartScript(Main.gamepanel);
					    for (int i_82_ = 0; i_82_ < 100; i_82_++)
					    	Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_82_] = true;
					}
					Utils.openInterface(id, location);
				} else {
					if(Main.gamepanel != 100) {
						Main.gamepanel = 100;
					    InterfaceClickMask.resetComponentAnimation(Main.gamepanel);
					    Class87.executeOnStartScript(Main.gamepanel);
					    for (int i_82_ = 0; i_82_ < 100; i_82_++)
					    	Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_82_] = true;
					}
					Utils.openInterface(id, 0);
				}
			}
		}
		if(action.equalsIgnoreCase("Save")) {
			Packing.pack();
		}
	}
    
    

}
