package org.ie.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mgi.tools.rseditor.core.utilities.ByteBuffer;

import org.ie.Main;
import org.ie.client.Class37_Sub11_Sub1;
import org.ie.client.Class37_Sub2;
import org.ie.client.Class37_Sub4_Sub16;
import org.ie.client.OverridedInterface;
import org.ie.client.Class76;
import org.ie.client.RSInterface;
import org.ie.client.RSString;
import org.ie.gui.GUI;
import org.ie.gui.types.Type;
import org.ie.gui.types.impl.ContainerType;
import org.ie.gui.types.impl.DiagonalType;
import org.ie.gui.types.impl.ItemContainerType;
import org.ie.gui.types.impl.ModelType;
import org.ie.gui.types.impl.RectangleType;
import org.ie.gui.types.impl.SpriteType;
import org.ie.gui.types.impl.TextType;
import org.ie.gui.types.impl.UnknownType1;
import org.ie.gui.types.impl.UnknownType7;
import org.ie.gui.types.impl.YellowBoxType;

import com.google.common.base.Joiner;

public class Utils {
	
	public static Map<Integer, String> typeNames = new HashMap<Integer, String>();

	public static String convertRSString(RSString str) {
		String msg = new String(str.aByteArray1669);
		/*System.out.println("1st " +msg);
		if(msg.indexOf(",") >= 0)
			msg = msg.replace(",", ")1");
		if(msg.indexOf("-") >= 0)
			msg = msg.replace("-", ")2");
		if(msg.indexOf(".") >= 0)
			msg = msg.replace(".", ")3");
		if(msg.indexOf("/") >= 0)
			msg = msg.replace("/", ")4");
		if(msg.indexOf("+") >= 0)
			msg = msg.replace("+", ")0");
		if(msg.indexOf("\\") >= 0)
			msg = msg.replace("\\", "*6");
		System.out.println("1st " +msg);*/
		return msg;
	}

	public static RSString convertString(String msg) {
		/*System.out.println("2nd " +msg);
		if(msg.indexOf(",") >= 0)
			msg = msg.replace(",", ")1");
		if(msg.indexOf("-") >= 0)
			msg = msg.replace("-", ")2");
		if(msg.indexOf(".") >= 0)
			msg = msg.replace(".", ")3");
		if(msg.indexOf("/") >= 0)
			msg = msg.replace("/", ")4");
		if(msg.indexOf("+") >= 0)
			msg = msg.replace("+", ")0");
		if(msg.indexOf("\\") >= 0)
			msg = msg.replace("\\", "*6");
		System.out.println("2nd " +msg);*/
		return Class37_Sub2.create_rsstring(msg);
	}

	public static RSInterface[][] expand2dArray(RSInterface[][] children) {
		int value = children.length;
		RSInterface[][] newChildren = new RSInterface[value + 1][];
		System.arraycopy(children, 0, newChildren, 0, children.length);
		newChildren[value] = new RSInterface[1];
		return newChildren;
	}

	public static void writeObjects(ByteBuffer os, Object[] data) {
		if(data == null) {
			os.writeByte(0);
			return;
		}
		int count = data.length;
		os.writeByte(count);
		for(int i = 0; i < count; i++) {
			Object value = data[i];
			if(value.getClass().equals(RSString.class)) {
				os.writeByte(1);
				os.writeString2(((RSString) data[i]).toString());
			} else if(value.getClass().equals(Integer.class)) {
				os.writeByte(0);
				os.writeInt((Integer) data[i]);
			}
		}
	}

	public static void writeConfigs(ByteBuffer os, int[] data) {
		if(data == null) {
			os.writeByte(0);
			return;
		}
		int count = data.length;
		os.writeByte(count);
		for(int i = 0; i < count; i++) {
			os.writeInt(data[i]);
		}
	}

	public static void openInterface(int id, int location) {
		int i_21_ = 0;
		int i_23_ = Main.gamepanel << 16 | location;
		OverridedInterface class37_sub6 = ((OverridedInterface) Class76.overridedInterfaces.get((long) i_23_));
		if (class37_sub6 != null)
			Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, (id != class37_sub6.interfaceId));
		Class37_Sub4_Sub16.overrideInterface(i_21_, id, i_23_);
		GUI.reloadTree();
	}

	public static void insert(RSInterface[] component, int fromSlot, int toSlot) {
		// we reset the item in the from slot
		RSInterface from = component[fromSlot];
		if(from == null) {
			return;
		}
		component[fromSlot] = null;
		// find which direction to shift in
		if(fromSlot > toSlot) {
			int shiftFrom = toSlot;
			int shiftTo = fromSlot;
			for(int i = (toSlot + 1); i < fromSlot; i++) {
				if(component[i] == null) {
					shiftTo = i;
					break;
				}
			}
			RSInterface[] slice = new RSInterface[shiftTo - shiftFrom];
			System.arraycopy(component, shiftFrom, slice, 0, slice.length);
			System.arraycopy(slice, 0, component, shiftFrom + 1, slice.length);
		} else {
			int sliceStart = fromSlot + 1;
			int sliceEnd = toSlot;
			for(int i = (sliceEnd - 1); i >= sliceStart; i--) {
				if(component[i] == null) {
					sliceStart = i;
					break;
				}
			}
			RSInterface[] slice = new RSInterface[sliceEnd - sliceStart + 1];
			System.arraycopy(component, sliceStart, slice, 0, slice.length);
			System.arraycopy(slice, 0, component, sliceStart - 1, slice.length);
		}
		// now fill in the target slot
		component[toSlot] = from;
	}
	
	public static RSInterface[] expandArray(RSInterface[] children) {
		RSInterface[] newChildren = new RSInterface[children.length + 1];
		System.arraycopy(children, 0, newChildren, 0, children.length);
		return newChildren;
	}

	public static RSInterface[] shrinkChildren(RSInterface[] children) {
		List<RSInterface> childList = new ArrayList<RSInterface>();
		for(RSInterface child : children) {
			if(child != null)
				childList.add(child);
		}
		return childList.toArray(new RSInterface[0]);
	}
	
    static {
		typeNames.put(0, "Container");
		typeNames.put(1, "Unknown 1");
		typeNames.put(2, "Item container");
		typeNames.put(3, "Rectangle");
		typeNames.put(4, "Text");
		typeNames.put(5, "Sprite");
		typeNames.put(6, "Model");
		typeNames.put(7, "Unknown 7");//aint used anymore
		typeNames.put(8, "Yellow box");
		typeNames.put(9, "Line");//should be diagonal
    }

	public final static Type[] types = new Type[] {
		new ContainerType(), new UnknownType1(), new ItemContainerType(), new RectangleType(), new TextType(), new SpriteType(), new ModelType(),
		new UnknownType7(), new YellowBoxType(), new DiagonalType(),
	};

	public static String parseArray(Field field) throws Exception {
		String value = "";
		if(field.getType().isArray()) {
			if(field.getGenericType().equals(int[].class)) {
				int[] objectI = (int[]) field.get(GUI.selectedChildInterface);
				List<Integer> ints = new ArrayList<Integer>();
				if(objectI != null)
					for(int a = 0; a < objectI.length; a++)
						ints.add(objectI[a]);
				value = Joiner.on("__").join(ints);
			} else if(field.getGenericType().equals(Object[].class)) {
				Object[] object = (Object[]) field.get(GUI.selectedChildInterface);
				List<Object> objs = new ArrayList<Object>();
				if(object != null)
					for(int a = 0; a < object.length; a++) {
						objs.add(object[a]);
					}
				value = Joiner.on("__").join(objs);
			} else if(field.getGenericType().equals(int[][].class)) {
				int[][] values = (int[][]) field.get(GUI.selectedChildInterface);
				if(values != null) {
					for(int i = 0; i < values.length; i++) {
						List<Integer> ints = new ArrayList<Integer>();
						for(int v : values[i]) {
							ints.add(v);
						}
						String str = Joiner.on(",").join(ints);
						value = "[" + str + "]";
					}
				}
			}
		}
		return value;
	}

}
