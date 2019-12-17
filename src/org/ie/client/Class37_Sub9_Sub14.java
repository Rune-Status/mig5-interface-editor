package org.ie.client;

/* Class37_Sub9_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub14 extends Class37_Sub9 {
	public static RSString aClass16_3143;
	public static RSString aClass16_3144;
	public static Class15 aClass15_3145;
	public static int anInt3146;
	public static int anInt3147;
	public static RSString aClass16_3148 = (Class37_Sub2.create_rsstring("Benutzen Sie die (WPasswort -=ndern(W Option"));
	public static RSString aClass16_3149 = Class37_Sub2.create_rsstring("sch-Utteln:");
	public static RSString aClass16_3150;
	public static RSString[] aClass16Array3151;
	public static int anInt3152;
	public static int anInt3153;
	public int anInt3154 = 4096;
	public static int anInt3155;
	public static RSString aClass16_3156;

	public static void handleMouse() {
		synchronized (Cache.mouseHandler) {
			Class60.lastMousePress = Class71.currentMousePress;
			Class37_Sub4_Sub7_Sub7.lastMouseX = Class37_Sub9_Sub17.currentMouseX;
			Class37_Sub9_Sub1.lastMouseY = Class37_Sub9_Sub23.currentMouseY;
			Class37_Sub9_Sub28.lastMouseClick = Class37_Sub9_Sub29.currentMouseClick;
			Class33.lastClickX = Class37_Sub9_Sub19.currentClickX;
			Class37_Sub13.lastClickY = Class1.currentClickY;
			Class89.lastClickTime = Class87.currentClickTime;
			Class37_Sub9_Sub29.currentMouseClick = 0;
		}
	}

	public static void method819(int i) {
		aClass16_3144 = null;
		aClass16_3149 = null;
		aClass16Array3151 = null;
		aClass16_3143 = null;
		aClass16_3156 = null;
		if (i == 4096) {
			aClass16_3150 = null;
			aClass15_3145 = null;
			aClass16_3148 = null;
		}
	}

	public Class37_Sub9_Sub14() {
		this(4096);
	}

	public Class37_Sub9_Sub14(int i) {
		super(0, true);
		anInt3154 = i;
	}

	public static RSInterface getInterface(int i) {
		int id = i >> 16;
		int childId = 0xffff & i;
		try {
			if (Class37_Sub9_Sub29.mainInterfaceArray[id] == null
					|| Class37_Sub9_Sub29.mainInterfaceArray[id][childId] == null) {
				boolean flag = InterfaceClickMask.loadExists(id);
				if (!flag)
					return null;
			}
			return Class37_Sub9_Sub29.mainInterfaceArray[id][childId];
		} catch (Exception e) {
			return null;
			//return Class37_Sub9_Sub29.mainInterfaceArray[id][Class37_Sub9_Sub29.mainInterfaceArray[id].length-1];
		}
	}

	public int[] method761(int i, int i_3_) {
		if (i > -125)
			method819(-73);
		int[] is = aClass38_1966.method1049(i_3_, true);
		if (aClass38_1966.aBoolean850)
			Class53.method1134(is, 0, Class32.anInt743, anInt3154);
		anInt3146++;
		return is;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt3155++;
		if (bool != true)
			handleMouse();
		int i_4_ = i;
		if (i_4_ == 0)
			anInt3154 = (class37_sub11.getUnsignedByte() << 904088684) / 255;
	}

	public static int method821(int i) {
		if (i != 255)
			getInterface(-70);
		anInt3153++;
		return Class37_Sub9_Sub19.mouseIdleTime++;
	}

	static {
		aClass16_3144 = Class37_Sub2.create_rsstring("Musik)2Engine vorbereitet)3");
		aClass16Array3151 = new RSString[500];
		aClass16_3150 = Class37_Sub2.create_rsstring("To create a new account you need to");
		aClass16_3143 = aClass16_3150;
		aClass16_3156 = Class37_Sub2.create_rsstring("l");
	}
}
