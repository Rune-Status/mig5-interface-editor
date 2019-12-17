package org.ie.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import mgi.tools.rseditor.core.cache.Cache;
import mgi.tools.rseditor.core.cache.File;
import mgi.tools.rseditor.core.cache.FileSystem;
import mgi.tools.rseditor.core.cache.Folder;
import mgi.tools.rseditor.core.utilities.ByteBuffer;

import org.ie.client.Class37_Sub9_Sub29;
import org.ie.client.Class37_Sub9_Sub5;
import org.ie.client.Class71;
import org.ie.client.Class84;
import org.ie.client.RSInterface;
import org.ie.client.RSString;
import org.ie.client.Signlink;
import org.ie.utils.Utils;

public class Packing {
	
	private static Cache cache;
	public static FileSystem fs3;
	
	static {
		cache = Cache.openCache(Signlink.findCacheDirectory());
		fs3 = cache.getFilesSystem(3);
		fs3.setUseAutomaticVersionsIncremetor(false);
	}
	
	public static void pack() {
		if(cache == null)
			return;
		int id = GUI.selectedParent;
		if(id == -1)
			return;
		RSInterface[] children = Class37_Sub9_Sub29.mainInterfaceArray[id];
		//id = 12;
		System.out.println("amt="+children.length);
		Folder folder = fs3.findFolderByID(id);
		if(folder != null) {
			if(folder.filesCount() > 0)
				folder.deleteAllFiles();
		}
		for(int i = 0; i < children.length; i++) {
			RSInterface child = children[i];
			if(child == null)
				continue;
			byte[] data = null;
			boolean old = !child.newFormat;
			try {
				if(old)
					data = packOld(child);
				else
					data = packNew(child);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if(data != null) {
				//File file = fs3.findFolderByID(id).findFileByID(i);
				//if(file == null) {
				if(folder != null) {
					folder.addFile(new File(i, new ByteBuffer(data)));
				} else {
					Folder toAdd = new Folder(new File[] {new File(i, new ByteBuffer(data))});
					fs3.addFolder(toAdd);
					folder = toAdd;
				}
				//String oldMd5 = MD5.md5(file.getData().getBuffer());
				//String newMd5 = MD5.md5(data);
				//System.out.println(child.type+", child " + i + ": " + oldMd5.equals(newMd5)+", "+data.length+":"+file.getData().getBuffer().length);
				//	file.setData(new ByteBuffer(data));
				//}
			}
		}
		fs3.finish();
		JOptionPane.showMessageDialog(null, "Interface successfully packed.");
	}
	
	private static byte[] packOld(RSInterface child) throws IOException {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream os = new DataOutputStream(bout);
		
		os.writeByte((byte) child.type);
		os.writeByte((byte) child.actionType);
		os.writeShort((short) child.clientCode);
		os.writeShort((short) child.x);
		os.writeShort((short) child.y);
		os.writeShort((short) child.width);
		os.writeShort((short) child.height);
		os.writeByte((byte) child.alpha);
		os.writeShort((short) child.parentId);
		os.writeShort((short) child.mouseOverId);
		
		int valueCompareCount = child.requiredValues == null ? 0 : child.requiredValues.length;
		os.writeByte((byte) valueCompareCount);
		if(valueCompareCount > 0) {
			for(int idx = 0; idx < valueCompareCount; idx++) {
				os.writeByte((byte) child.valueCompareType[idx]);
				os.writeShort((short) child.requiredValues[idx]);
			}
		}
		int cs1length = child.cs1opcodes == null ? 0 : child.cs1opcodes.length;
		os.writeByte((byte) cs1length);
		if(cs1length > 0) {
			for(int idx = 0; idx < cs1length; idx++) {
				int cs1blocklength = child.cs1opcodes[idx].length;
				os.writeShort((short) cs1blocklength);
				for(int idx2 = 0; idx2 < cs1blocklength; idx2++) {
					os.writeShort((short) child.cs1opcodes[idx][idx2]);
				}
			}
		}
		int type = child.type;
		if(type == 0) {
			os.writeShort((short) child.maxScrollVertical);
			os.writeByte((byte) (child.hidden ? 1 : 0));
		}
		if(type == 1) {
			os.writeShort((short) 0);
			os.writeByte((byte) 0);
		}
		if(type == 2) {
			os.writeByte((byte) child.someHashModifier);
			os.writeByte((byte) child.someHash1Modifier);
			os.writeByte((byte) child.someHash2Modifier);
			os.writeByte((byte) child.someHash3Modifier);
			os.writeByte((byte) child.invSpritePadX);
			os.writeByte((byte) child.invSpritePadY);
			for(int i = 0; i < 20; i++) {
				boolean enabled = child.spriteId[i] != -1;
				os.writeByte((byte) (enabled ? 1 : 0));
				if(enabled) {
					os.writeShort((short) (child.spriteX[i] & 0xff));
					os.writeShort((short) (child.spriteY[i] & 0xff));
					os.writeInt(child.spriteId[i]);
				}
			}
			for(int i = 0; i < 5; i++) {
				RSString action = child.oiActions[i];
				if(action != null) {
					writeString(os, action);
				}
			}
		}
		if(type == 3)
			os.writeByte((byte) child.filled);
		if(type == 4 || type == 1) {
			os.writeByte((byte) child.horizontalAlignment);
			os.writeByte((byte) child.verticalAlignment);
			os.writeByte((byte) child.verticalSpacing);
			os.writeShort(child.font);
			os.writeByte((byte) (child.shaded ? 1 : 0));
		}
		if(type == 4) {
			writeString(os, child.disabledText);
			writeString(os, child.enabledText);
		}
		if(type == 1 || type == 3 || type == 4)
			os.writeInt(child.disabledColor);
		if(type == 3 || type == 4) {
			os.writeInt(child.enabledColor);
			os.writeInt(child.disabledMouseOverColor);
			os.writeInt(child.enabledMouseOverColor);
		}
		if(type == 5) {
			os.writeInt(child.disabledSprite);
			os.writeInt(child.enabledSprite);
		}
		if(type == 6) {
			os.writeShort((short) child.mediaIdDisabled);
			os.writeShort((short) child.mediaIdEnabled);
			os.writeShort((short) child.disabledAnim);
			os.writeShort((short) child.enabledAnim);
			os.writeShort((short) child.zoom);
			os.writeShort((short) child.rotateX);
			os.writeShort((short) child.rotateY);
		}
		if(type == 7) {
			os.writeByte((byte) child.horizontalAlignment);
			os.writeShort(child.font);
			os.writeByte((byte) (child.shaded ? 1 : 0));
			os.writeInt(child.disabledColor);
			os.writeShort((short) child.invSpritePadX);
			os.writeShort((short) child.invSpritePadY);
			os.writeByte((byte) child.someHash6Modifier);
			for(int i = 0; i < 5; i++) {
				RSString action = child.oiActions[i];
				if(action != null) {
					writeString(os, action);
				}
			}
		}
		if(type == 8) {
			writeString(os, child.disabledText);
		}
		int actionType = child.actionType;
		if(actionType == 2 || type == 2) {
			writeString(os, child.selectedActionName);
			writeString(os, child.spellName);
			os.writeShort((short) child.someSpellModifier);
		}
		if(actionType == 1 || actionType == 4 || actionType == 5 || actionType == 6) {
			if(child.tooltip.equalsRSString(-100, Class84.select))
				os.writeByte(0);
			else if(child.tooltip.equalsRSString(-100, Class71.continueString))
				os.writeByte(0);
			else if(child.tooltip.equalsRSString(-100, Class37_Sub9_Sub5.ok))
				os.writeByte(0);
			else
				writeString(os, child.tooltip);
		}	
		return bout.toByteArray();
	}
	
	private static byte[] packNew(RSInterface child) throws IOException {
		ByteBuffer os = new ByteBuffer();
		
		os.writeByte(-1);
		os.writeByte(child.type);
		os.writeShort(child.clientCode);
		os.writeShort(child.x);
		os.writeShort(child.y);
		os.writeShort(child.width);
		os.writeShort(child.height);
		os.writeByte(child.h_size_mode);
		os.writeByte(child.v_size_mode);
		os.writeByte(child.h_pos_mode);
		os.writeByte(child.v_pos_mode);
		os.writeShort(child.parentId);
		os.writeByte(child.hidden ? 1 : 0);
		
		int type = child.type;
		if(type == 0) {
			os.writeShort(child.maxScrollHorizontal);
			os.writeShort(child.maxScrollVertical);
			os.writeByte(child.aBoolean1150 ? 1 : 0);
		}
		if(type == 5) {
			os.writeInt(child.disabledSprite);
			os.writeShort(child.rotation);
			os.writeByte(child.extraBoolean ? 2 : child.gridOriginal ? 1 : 0);
			os.writeByte(child.alpha);
			os.writeByte(child.outline);
			os.writeInt(child.shadow);
			os.writeByte(child.flipVertical ? 1 : 0);
			os.writeByte(child.flipHorizontal ? 1 : 0);
		}
		if(type == 6) {
			os.writeShort(child.mediaIdDisabled);
			os.writeShort(child.translateX);
			os.writeShort(child.translateY);
			os.writeShort(child.rotateX);
			os.writeShort(child.rotateY);
			os.writeShort(child.rotateZ);
			os.writeShort(child.zoom);
			os.writeShort(child.disabledAnim);
			os.writeByte(child.aBoolean364 ? 1 : 0);
			os.writeShort(20000);
			if(child.h_size_mode != 0)
				os.writeShort(child.anInt1018);
			if(child.v_size_mode != 0)
				os.writeShort(child.anInt1076);
		}
		if(type == 4) {
			os.writeShort(child.font);
			os.writeString2(new String(child.disabledText.aByteArray1669));
			os.writeByte(child.verticalSpacing);
			os.writeByte(child.horizontalAlignment);
			os.writeByte(child.verticalAlignment);
			os.writeByte(child.shaded ? 1 : 0);
			os.writeInt(child.disabledColor);
		}
		if(type == 3) {
			os.writeInt(child.disabledColor);
			os.writeByte(child.filled);
			os.writeByte(child.alpha);
		}
		if(type == 9) {
			os.writeByte(child.thickness);
			os.writeInt(child.disabledColor);
			os.writeByte(child.standardVerticalOrientation ? 1 : 0);
		}
		os.writeMedInt(child.click_mask);
		os.writeString2(new String(child.action_name.aByteArray1669));
		int actionLength = child.niActions == null ? 0 : child.niActions.length;
		os.writeByte(actionLength);
		if(actionLength > 0) {
			for(int i = 0; i < actionLength; i++) {
				os.writeString2(new String(child.niActions[i].aByteArray1669));
			}
		}
		os.writeByte(child.anInt378);
		os.writeByte(child.anInt350);
		os.writeByte(child.modifyDraggingAlpha ? 1 : 0);
		os.writeString2(new String(child.selectedActionName.aByteArray1669));
		Utils.writeObjects(os, child.onStartListener);
		Utils.writeObjects(os, child.mouseFocusListener);
		Utils.writeObjects(os, child.mouseUnfocusListener);
		Utils.writeObjects(os, child.spellUsedListener);
		Utils.writeObjects(os, child.spellUsedOnItemListener);
		Utils.writeObjects(os, child.varpUpdateListener);
		Utils.writeObjects(os, child.inventoryUpdateListener);
		Utils.writeObjects(os, child.skillUpdateListener);
		Utils.writeObjects(os, child.mainLoopListener);
		Utils.writeObjects(os, child.anObjectArray363);
		Utils.writeObjects(os, child.mouseFocusedListener);
		Utils.writeObjects(os, child.mouseClickFocusListener);
		Utils.writeObjects(os, child.mouseClickListener);
		Utils.writeObjects(os, child.mouseClickUnfocusListener);
		Utils.writeObjects(os, child.mouseDraggedListener);
		Utils.writeObjects(os, child.anObjectArray409);
		Utils.writeObjects(os, child.anObjectArray456);
		Utils.writeObjects(os, child.mouseWheelListener);
		Utils.writeConfigs(os, child.varpListenerValues);
		Utils.writeConfigs(os, child.inventoryListenerValues);
		Utils.writeConfigs(os, child.skillListenerValues);
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream os2 = new DataOutputStream(bout);
		os2.write(os.getBuffer(), 0, os.getPosition());
		
		return bout.toByteArray();
	}
	
	public static void writeString(DataOutputStream os, RSString string) throws IOException {
		os.writeBytes(Utils.convertRSString(string));
		os.writeByte((byte) 0);
	}

}
