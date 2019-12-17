package org.ie.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import org.ie.Main;
import org.ie.client.Class37_Sub2;
import org.ie.client.Class37_Sub9_Sub13;
import org.ie.client.Class37_Sub9_Sub29;
import org.ie.client.Class73;
import org.ie.client.RSInterface;
import org.ie.client.RSString;
import org.ie.client.client;
import org.ie.gui.components.JChoiceField;
import org.ie.gui.components.JFormattedField;
import org.ie.gui.components.JSpinField;
import org.ie.gui.components.PopupHandler;
import org.ie.gui.types.Type;
import org.ie.utils.SpringUtilities;
import org.ie.utils.Utils;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class GUI implements TreeSelectionListener {
	
	public static int selectedParent = -1;
	public static int selectedChild = -1;
	public static RSInterface selectedChildInterface = null;
	public static JFrame mainFrame;
	private JPanel gamePanel;
	private static JPanel editPanel;
	
	public GUI() {
		mainFrame = new JFrame("Interface editor");
		mainFrame.setSize(1024, 570);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		
		gamePanel = new JPanel(new BorderLayout());
		gamePanel.setBounds(0, 0, 0, 0);
		
		client c = new client(gamePanel);
		c.method20("runescape", 503, 16, Class37_Sub9_Sub13.anInt3141 + 32, 474, 765, (byte) -72);
		gamePanel.add(c, BorderLayout.CENTER);
		
		mainFrame.add(gamePanel, BorderLayout.WEST);
		mainFrame.add(getControlPanel(), BorderLayout.CENTER);
		mainFrame.setVisible(true);
		//mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	static JTabbedPane tabs;
	
	public JPanel getControlPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		tabs = new JTabbedPane();
		tabs.setFocusable(false);
		tabs.addTab("Controls", getControlsTab());
		tabs.addTab("Interface", getInterfaceTab());
		tabs.addTab("Editing", getEditingTab());
		
		
		panel.add(tabs, BorderLayout.CENTER);
		return panel;
	}
	
	public JPanel getControlsTab() {
		JPanel panel = new JPanel(new BorderLayout());
		JPanel buttons = new JPanel(new GridLayout(0, 1));
		String[] controls = {
			"New interface", "Open", "Save", "Run script", "Send varp", "Test", "Duplicate current", "Export", "Import"
		};
		for(String control : controls) {
			JButton button = new JButton(control);
			button.addActionListener(new ButtonActions());
			buttons.add(button);
		}
		panel.add(buttons, BorderLayout.NORTH);
		return panel;
	}
	
	private static DefaultMutableTreeNode tree = new DefaultMutableTreeNode("Interface");
	private static JTree jTree;
	private JPopupMenu popup;
	private JPanel interfaceTab;
	
	public JPanel getInterfaceTab() {
		interfaceTab = new JPanel(new BorderLayout());
		
		jTree = new JTree(tree);
		jTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		jTree.addTreeSelectionListener(this);
		jTree.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getClickCount() == 2) {
					updateEditingTab();
				}
			}
		});
		
		popup = new JPopupMenu();
        popup.setInvoker(jTree);
        PopupHandler handler = new PopupHandler(jTree, popup) {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                String ac = e.getActionCommand();
                TreePath path  = tree.getPathForLocation(loc.x, loc.y);
                if(selectedParent != -1) {
	                if(ac.equals("Delete")) {
	                	removeChild(path);
	                }
	                if(ac.equals("Move")) {
	                	JPanel panel = new JPanel(new SpringLayout());
	                	JTextField text = new JTextField(10);
	    				panel.add(new JLabel("Index:"));
	    				panel.add(text);
	    				SpringUtilities.makeCompactGrid(panel, 2, 1, 0, 0, 5, 5);
	    				int ret = JOptionPane.showConfirmDialog(Main.getGUI().getMainFrame(), panel, "Moving menu", JOptionPane.OK_CANCEL_OPTION);
	    				if (ret == JOptionPane.OK_OPTION) {
	    					Utils.insert(Class37_Sub9_Sub29.mainInterfaceArray[selectedParent], selectedChild, Integer.parseInt(text.getText()));
	    				}
	    				reloadTree();
	                }
	                if(ac.equals("Add")) {
	                	JPanel panel = new JPanel(new SpringLayout());
	    				JComboBox box = new JComboBox(Utils.typeNames.values().toArray());
	    				JCheckBox checkbox = new JCheckBox();
	    				panel.add(new JLabel("Select type:"));
	    				panel.add(box);
	    				panel.add(new JLabel("New version:"));
	    				panel.add(checkbox);
	    				SpringUtilities.makeCompactGrid(panel, 2, 2, 0, 0, 5, 5);
	    				int ret = JOptionPane.showConfirmDialog(Main.getGUI().getMainFrame(), panel, "Creation menu", JOptionPane.OK_CANCEL_OPTION);
	    				if (ret == JOptionPane.OK_OPTION) {
	    					addChild(box.getSelectedIndex(), checkbox.isSelected());
	    				}
	                }
	                if(ac.equals("Duplicate")) {
	                	duplicateChild(path);
	                }
                }
        	}
        };
        popup.add(getMenuItem("Add", handler));
        popup.add(getMenuItem("Delete", handler));
        popup.add(getMenuItem("Duplicate", handler));
        popup.add(getMenuItem("Move", handler));
        
		interfaceTab.add(new JScrollPane(jTree), BorderLayout.CENTER);
		return interfaceTab;
	}
	
	public JPanel getEditingTab() {
		editPanel = new JPanel(new BorderLayout());
		return editPanel;
	}
	
	public JPanel getGamePanel() {
		return gamePanel;
	}

	public static void reloadTree() {
		tree.removeAllChildren();
		
		DefaultTreeModel model = new DefaultTreeModel(tree);
		
		RSInterface[] children = Class37_Sub9_Sub29.mainInterfaceArray[selectedParent];
		for(int i = 0; i < children.length; i++) {
			RSInterface child = children[i];
			if(child != null) {
				int type = child.type;
				int parent = child.parentId;

				String name = Utils.typeNames.containsKey(type) ? Utils.typeNames.get(type) : "Type " + type;
				DefaultMutableTreeNode node = new DefaultMutableTreeNode("Child " + i + "[" + name + ""+(parent == -1 ? "" : ",parent="+(parent&0xffff))+"]");
				model.insertNodeInto(node, tree, i);

			}
		}
		jTree.setModel(model);
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent event) {
		TreePath path = event.getPath();

		DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
		String name = (String) node.getUserObject();
		if(name.startsWith("Child")) {
			int id = Integer.parseInt(name.substring(name.indexOf("Child ") + 6, name.indexOf("[")));
			selectedChild = id;
			if(selectedChild >= Class37_Sub9_Sub29.mainInterfaceArray[selectedParent].length)
				selectedChild = 0;
			//System.out.println("parent: " + selectedParent + ", child: " + selectedChild+":"+Class37_Sub9_Sub29.mainInterfaceArray[selectedParent].length);
			selectedChildInterface = Class37_Sub9_Sub29.mainInterfaceArray[selectedParent][selectedChild];
		}
	}
	
	public static void updateEditingTab() {
		tabs.setSelectedIndex(2);
		editPanel.removeAll();
		editPanel.add(getEditingTabContent(), BorderLayout.CENTER);
		editPanel.repaint();
		editPanel.updateUI();
	}

	public static JPanel getEditingTabContent() {
		JPanel panel = new JPanel(new BorderLayout());
		JPanel buttonPanel = new JPanel(new FlowLayout());
		String[] buttons = {
			"Edit listeners"	
		};
		for(String button : buttons) {
			JButton btn = new JButton(button);
			btn.addActionListener(new ButtonActions());
			buttonPanel.add(btn);
		}
		
		JPanel fieldPanel = new JPanel(new SpringLayout());
		int lines = 0;
		if(selectedChildInterface != null) {
			Map<String, String> fields = new LinkedHashMap<String, String>();
			
			final RSInterface inter = selectedChildInterface;
			int type = inter.type;
			
			addLine(fieldPanel, "Currently editing:", selectedParent+"");
			addLine(fieldPanel, "Format:", inter.newFormat ? "New" : "Old");
			addLine(fieldPanel, "Type:", type + "");
			lines += 3;
			
			fields.put("-sep-", null);
			if(!inter.newFormat)
				fields.put("Action type:", "type");
			fields.put("Client code:", "clientCode");
			fields.put("X:", "x");
			fields.put("Y:", "y");
			fields.put("Width:", "width");
			fields.put("Height:", "height");
			if(!inter.newFormat)
				fields.put("Alpha:", "alpha");
			fields.put("Parent:", "parentId");
			if(inter.newFormat) {
				fields.put("Hidden:", "hidden");
				fields.put("Actions:", "niActions");
				fields.put("Action name:", "action_name");
				fields.put("Click mask:", "click_mask");
				fields.put("anInt378:", "anInt378");
				fields.put("anInt350:", "anInt350");
				fields.put("Modify dragging alpha:", "modifyDraggingAlpha");
			} else {
				fields.put("Mouse over id:", "mouseOverId");
				fields.put("Tooltip:", "tooltip");
				if(selectedChildInterface.oiActions != null)
					fields.put("Actions", "oiActions");
			}
			
			Type t = null;
			
			if(type >= 0 && type < Utils.types.length)
				t = Utils.types[type];
			
			if(t != null) { //add fields to gui
				for(String field : t.getVariables(!inter.newFormat)) {
					fields.put(field, field);
				}
			}
			
			
			for(Iterator<String> it = fields.keySet().iterator(); it.hasNext(); ) {
				try {
					String label = it.next();
					if(label.equals("-sep-")) {
						fieldPanel.add(new JSeparator());
						fieldPanel.add(new JSeparator());
						lines++;
						continue;
					}
					final String val = fields.get(label);
					addLabel(fieldPanel, label);
					
					final Field field = inter.getClass().getDeclaredField(val);
					
					if(label.equals("font")) {
						System.out.println(field.get(inter));
						String[] fonts = {"Small", "Normal", "Bold", "Fancy"};
						String[] fontValues = {"494", "495", "496", "497"};
						JChoiceField choiceField = new JChoiceField(fonts, fontValues) {
							private static final long serialVersionUID = 1L;

							@Override
							public void valueChanged(String choice, String value) throws Exception {
								field.setInt(inter, Integer.parseInt(value));
							}
						};
						//choiceField.setSelectedIndex(494 - field.getInt(inter));
						fieldPanel.add(choiceField);
						fieldPanel.add(choiceField);
					} else if(label.equals("horizontalAlignment")) {
						String[] alignments = { "Left", "Center", "Right"};
						String[] alignmentValues = { "0", "1", "2"};
						JChoiceField choiceField = new JChoiceField(alignments, alignmentValues) {
							private static final long serialVersionUID = 1L;
							@Override
							public void valueChanged(String choice, String value) throws Exception {
								field.setInt(inter, Integer.parseInt(value));
							}
						};
						choiceField.setSelectedIndex(field.getInt(inter));
						fieldPanel.add(choiceField);
					} else if(label.equals("verticalAlignment")) {
						String[] alignments = { "Top", "Center", "Bottom", "Custom"};
						String[] alignmentValues = { "0", "1", "2", "3" };
						JChoiceField choiceField = new JChoiceField(alignments, alignmentValues) {
							private static final long serialVersionUID = 1L;
							@Override
							public void valueChanged(String choice, String value) throws Exception {
								field.setInt(inter, Integer.parseInt(value));
							}
						};
						choiceField.setSelectedIndex(field.getInt(inter));
						fieldPanel.add(choiceField);
					} else if(label.equals("Parent:")) {
						JFormattedField textField = new JFormattedField(-1, 65535) {
							private static final long serialVersionUID = 1L;

							@Override
							public String getFormat(String value) {
								try {
									int val = selectedParent << 16 | Integer.parseInt(value);
									return val + "";
								} catch(Exception e) {
									return "-1";
								}
							}

							@Override
							public void valueChanged(int value) {
								try {
									field.setInt(inter, value);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							
							@Override
							public int newValue(int value) {
								return value == 65535 ? -1 : value;
							}
						};
						textField.setValue(field.getInt(inter) & 0xffff);
						fieldPanel.add(textField);
					} else {
						// JSpinField only for integer values
						if(field.getType() == Integer.TYPE || field.getType() == Short.TYPE || field.getType() == Long.TYPE) {
							JSpinField spinner = new JSpinField(Integer.MIN_VALUE, Integer.MAX_VALUE) {
								private static final long serialVersionUID = 1L;
								
								@Override
								public void stateChanged(ChangeEvent event) {
									try {
										SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
										int value = model.getNumber().intValue();
										setValue(value);
										
										if(field.getType().equals(Integer.TYPE)) {
											field.setInt(inter, value);
										}
									} catch(Exception e) {
										e.printStackTrace();
									}
								}
							};
							spinner.setValue(field.getInt(inter));
							fieldPanel.add(spinner);
						} else if(field.getType().equals(RSString[].class) || field.getType().equals(int[].class)) {
							final JTextField textField = new JTextField(10);
							fieldPanel.add(textField);
							String value = "";
							System.out.println(field.getName());
							if(field.getType().equals(RSString[].class)) {
								List<String> strings = new ArrayList<String>();
								for(RSString rss : (RSString[]) field.get(inter)) {
									if(rss != null)
										strings.add(new String(rss.aByteArray1669));
								}
								value = Joiner.on("__").join(strings);
							} else if(field.getType().equals(int[].class)) {
								List<Integer> ints = new ArrayList<Integer>();
								for(int v : (int[]) field.get(inter)) {
									ints.add(v);
								}
								value = Joiner.on("__").join(ints);
							}
							textField.setText(value);
							textField.addFocusListener(new FocusAdapter() {
								@Override
								public void focusLost(FocusEvent event) {
									try {
										String[] vals = Iterables.toArray(Splitter.on("__").split(textField.getText()), String.class);
										
										if(field.getType().equals(RSString[].class)) {
											RSString[] rsVals = new RSString[vals.length];
											for(int i = 0; i < rsVals.length; i++) {
												rsVals[i] = Class37_Sub2.create_rsstring(vals[i]);
											}
											field.set(inter, rsVals);
										}
										if(field.getType().equals(int[].class)) {
											int[] intVals = new int[vals.length];
											for(int i = 0; i < intVals.length; i++) {
												intVals[i] = Integer.parseInt(vals[i]);
											}
											field.set(inter, intVals);
										}
									} catch(Exception e) {
										e.printStackTrace();
									}
								}
							});
						} else if(field.getType().equals(Boolean.TYPE)) {
							final JCheckBox checkbox = new JCheckBox();
							boolean selected = field.getBoolean(inter);
							checkbox.setSelected(selected);
							fieldPanel.add(checkbox);
							checkbox.addItemListener(new ItemListener() {
								@Override
								public void itemStateChanged(ItemEvent event) {
									try {
										field.setBoolean(inter, checkbox.isSelected());
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						} else if(field.getType().equals(RSString.class)) {
							final JTextField textField = new JTextField(10);
							fieldPanel.add(textField);
							RSString value = (RSString) field.get(inter);
							textField.setText(new String(value.aByteArray1669));
							textField.addFocusListener(new FocusAdapter() {
								@Override
								public void focusLost(FocusEvent event) {
									try {
										String val = textField.getText();
										
										RSString rsVals = Class37_Sub2.create_rsstring(val);
										field.set(inter, rsVals);
									} catch(Exception e) {
										e.printStackTrace();
									}
								}
							});
						} else {
							System.out.println("unhandled: " + field.toGenericString());
							JTextField textField = new JTextField(10);
							fieldPanel.add(textField);
						}
						if(!inter.newFormat)
							Class73.refreshInterface(inter);
					}
					lines++;
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		if(lines > 0)
			SpringUtilities.makeCompactGrid(fieldPanel, lines, 2, 5, 5, 5, 5);
		
		panel.add(new JScrollPane(fieldPanel), BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		return panel;
	}
	
	public static void addLabel(JPanel panel, String text) {
		panel.add(new JLabel(text));
	}
	
	public static void addLine(JPanel panel, String text1, String text2) {
		addLabel(panel, text1);
		addLabel(panel, text2);
	}
	
	private JMenuItem getMenuItem(String s, ActionListener al) {
        JMenuItem menuItem = new JMenuItem(s);
        menuItem.setActionCommand(s);
        menuItem.addActionListener(al);
        return menuItem;
    }
	
    private void duplicateChild(TreePath path) {
    	if (path != null) {
    		DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
    		String name = (String) node.getUserObject();
    		int id = Integer.parseInt(name.substring(name.indexOf("Child ") + 6, name.indexOf("[")));
    	
    		RSInterface[] children = Utils.expandArray(Class37_Sub9_Sub29.mainInterfaceArray[selectedParent]);
    		RSInterface newChild = new RSInterface();
    		Field[] fields = newChild.getClass().getDeclaredFields();
    		for(Field field : fields) {
    			 try {
					field.set(newChild, children[id].getClass().getField(field.getName()).get(children[id]));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		newChild.bitPacked = (selectedParent << 16) | children.length - 1;
    		//newChild.x += 5;
    		//newChild.y += 5;
    		children[children.length - 1] = newChild;
    		Class37_Sub9_Sub29.mainInterfaceArray[selectedParent] = children;
	    	reloadTree();
	    	selectedChild = children.length - 1;
    		
    	}
    }

    private void removeChild(TreePath path) {
    	if (path != null) {
    		DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
    		String name = (String) node.getUserObject();
    		int id = Integer.parseInt(name.substring(name.indexOf("Child ") + 6, name.indexOf("[")));
    		
    		RSInterface[] children = Class37_Sub9_Sub29.mainInterfaceArray[selectedParent];
    		children[id] = null;
    		Class37_Sub9_Sub29.mainInterfaceArray[selectedParent] = Utils.shrinkChildren(children);
    		reloadTree();
    	}
    }
    
    private void addChild(int type, boolean format) {
    	if(selectedParent == -1)
    		return;
    	try {
    		RSInterface[] children = Utils.expandArray(Class37_Sub9_Sub29.mainInterfaceArray[selectedParent]);
    		RSInterface newChild = new RSInterface();
    		newChild.type = type;
    		if(type == 4) {
    			newChild.font = 495;
    		}
    		newChild.x = 10;
    		newChild.bitPacked = (selectedParent << 16) | children.length - 1;
    		newChild.y = 10;
    		newChild.width = 10;
    		newChild.height = 10;
    		newChild.newFormat = format;
    		children[children.length - 1] = newChild;
    		Class37_Sub9_Sub29.mainInterfaceArray[selectedParent] = children;
	    	reloadTree();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public JFrame getMainFrame() {
    	return mainFrame;
    }
	
}
