package org.ie.client;

import org.ie.Main;

/* Class37_Sub4_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub16 extends NodeSub {
	public static int anInt2864 = 0;
	public static RSString aClass16_2865;
	public static int anInt2866;
	public static int anInt2867;
	public static int anInt2868;
	public static int[] anIntArray2869 = new int[32768];
	public Class61[] aClass61Array2870;
	public static int[] anIntArray2871;

	public boolean method722(boolean bool, int i) {
		anInt2867++;
		if (bool != false)
			method723((byte) -42);
		return aClass61Array2870[i].aBoolean1163;
	}

	public static void method723(byte i) {
		aClass16_2865 = null;
		if (i != -46)
			overrideInterface(-38, -120, -20);
		anIntArray2869 = null;
		anIntArray2871 = null;
	}

	public static OverridedInterface overrideInterface(int type, int interfaceId, int position) {
		OverridedInterface class37_sub6 = new OverridedInterface();
		class37_sub6.interfaceId = interfaceId;
		class37_sub6.type = type;
		Class76.overridedInterfaces.put(class37_sub6, (long) position);
		InterfaceClickMask.resetComponentAnimation(interfaceId);
		Class87.executeOnStartScript(interfaceId);
		RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(position);
		if (rSInterface != null)
			Class73.refreshInterface(rSInterface);
		if (Class79.aClass18_1489 != null) {
			Class73.refreshInterface(Class79.aClass18_1489);
			Class79.aClass18_1489 = null;
		}
		Class37_Sub9_Sub13.anInt3134 = 0;
		Class37_Sub20.menu_open = false;
		Class37_Sub7.redrawInterfaceArea(Class37_Sub9_Sub24.anInt3377,
				Class37_Sub4_Sub13.anInt2794, Class15_Sub1.anInt1753,
				Class37_Sub5.anInt1878);
		if (Main.gamepanel != -1)
			Class26.method259(Main.gamepanel, 1, -125);
		return class37_sub6;
	}

	public Class37_Sub4_Sub16(Class15 class15, Class15 class15_3_, int i,
			boolean bool) {
		try {
			Deque landscape = new Deque();
			int i_4_ = class15.method129(i);
			aClass61Array2870 = new Class61[i_4_];
			int[] is = class15.method119(i, (byte) 68);
			for (int i_5_ = 0; (is.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				byte[] is_6_ = class15.getFile(i, is[i_5_]);
				int i_7_ = 0xff & is_6_[1] | (is_6_[0] & 0xff) << -163476184;
				Class37_Sub25 class37_sub25 = null;
				for (Class37_Sub25 class37_sub25_8_ = (Class37_Sub25) landscape
						.getFirst(); class37_sub25_8_ != null; class37_sub25_8_ = (Class37_Sub25) landscape
						.getNext()) {
					if ((class37_sub25_8_.anInt2278 ^ 0xffffffff) == (i_7_ ^ 0xffffffff)) {
						class37_sub25 = class37_sub25_8_;
						break;
					}
				}
				if (class37_sub25 == null) {
					byte[] is_9_;
					if (!bool)
						is_9_ = class15_3_.method110(0, 90, i_7_);
					else
						is_9_ = class15_3_.method110(i_7_, 90, 0);
					class37_sub25 = new Class37_Sub25(i_7_, is_9_);
					landscape.addLast(class37_sub25);
				}
				aClass61Array2870[is[i_5_]] = new Class61(is_6_, class37_sub25);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("t.<init>(" + (class15 != null ? "{...}" : "null") + ','
							+ (class15_3_ != null ? "{...}" : "null") + ',' + i
							+ ',' + bool + ')'));
		}
	}

	static {
		aClass16_2865 = Class37_Sub2.create_rsstring(" loggt sich aus)3");
	}
}
