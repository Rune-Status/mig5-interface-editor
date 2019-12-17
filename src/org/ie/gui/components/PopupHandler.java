package org.ie.gui.components;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPopupMenu;
import javax.swing.JTree;

public class PopupHandler implements ActionListener {
	
    protected JTree tree;
    protected JPopupMenu popup;
    protected Point loc;
 
    public PopupHandler(JTree tree, JPopupMenu popup) {
        this.tree = tree;
        this.popup = popup;
        tree.addMouseListener(ma);
    }
 
    public void actionPerformed(ActionEvent e) {
    	
    }

    private MouseListener ma = new MouseAdapter() {
        private void checkForPopup(MouseEvent e) {
            if(e.isPopupTrigger()) {
                loc = e.getPoint();
                popup.show(tree, loc.x, loc.y);
            }
        }
 
        public void mousePressed(MouseEvent e)  { checkForPopup(e); }
        public void mouseReleased(MouseEvent e) { checkForPopup(e); }
        public void mouseClicked(MouseEvent e)  { checkForPopup(e); }
    };
}