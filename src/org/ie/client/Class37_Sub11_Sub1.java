package org.ie.client;

import org.ie.Main;

/* Class37_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub11_Sub1 extends ByteVector {
	public static Class15_Sub1 aClass15_Sub1_3609;
	public static int anInt3610;
	public static int[] anIntArray3611 = new int[100];
	public static int anInt3612;
	public static Class19 aClass19_3613;
	public static RSString aClass16_3614;
	public static int anInt3615;
	public static int anInt3616;
	public static int anInt3617;
	public static RSString aClass16_3618;
	public static int anInt3619;
	public static RSString aClass16_3620;
	public static int anInt3621;
	public static int anInt3622;
	public static int anInt3623;
	public static int anInt3624;
	public static int anInt3625;
	public int anInt3626;
	public static RSString aClass16_3627;
	public Class4 aClass4_3628;
	public static int anInt3629;

	public int method986(int i) {
		if (i != 7)
			aClass16_3620 = null;
		anInt3612++;
		return (buf[pos++] - aClass4_3628.method50(true) & 0xff);
	}

	public static void method987(int i, int i_0_, int i_1_) {
		RSInterface rSInterface = Class37_Sub9_Sub35.method914(i_0_, i);
		if (rSInterface != null && rSInterface.spellUsedOnItemListener != null) {
			InterfaceListener class37_sub8 = new InterfaceListener();
			class37_sub8.aClass18_1925 = rSInterface;
			class37_sub8.objectData = rSInterface.spellUsedOnItemListener;
			Class43.executeScript(class37_sub8);
		}
		Class37_Sub4_Sub12.anInt2759 = i_1_;
		KeyboardHandler.anInt558 = i;
		Class37_Sub4_Sub5.aBoolean2595 = true;
		Class32.anInt737 = i_0_;
		Class73.refreshInterface(rSInterface);
	}

	public void method988(boolean bool) {
		anInt3619++;
		pos = (7 + anInt3626) / 8;
		if (bool != true)
			aClass19_3613 = null;
	}

	public void method989(int i_3_) {
		//buffer[currentOffset++] = (byte) (i_3_ + aClass4_3628
		//		.method50(true));
		anInt3621++;
	}

	public void method990(boolean bool, int[] is) {
		anInt3622++;
		if (bool == false)
			aClass4_3628 = new Class4(is);
	}

	public int method991(int i, int i_4_) {
		anInt3616++;
		if (i_4_ != -1337)
			return 75;
		return 8 * i - anInt3626;
	}

	public Class37_Sub11_Sub1(int i) {
		super(i);
	}

	public static void method992(int i, OverridedInterface class37_sub6, boolean bool) {
		int i_5_ = class37_sub6.interfaceId;
		int i_6_ = (int) class37_sub6.hash;
		class37_sub6.unlink();
		if (bool)
			Class37_Sub9_Sub24.uncacheInterface(i_5_);
		Class57.method1146(i_5_);
		RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_6_);
		if (rSInterface != null)
			Class73.refreshInterface(rSInterface);
		Class37_Sub20.menu_open = false;
		Class37_Sub9_Sub13.anInt3134 = 0;
		Class37_Sub7.redrawInterfaceArea(Class37_Sub9_Sub24.anInt3377,
				Class37_Sub4_Sub13.anInt2794, Class15_Sub1.anInt1753,
				Class37_Sub5.anInt1878);
		if (Main.gamepanel != -1)
			Class26.method259(Main.gamepanel, 1, -127);
	}

	public void method993(boolean bool) {
		anInt3626 = 8 * pos;
		anInt3615++;
		if (bool != false)
			method990(true, null);
	}

	public static RSString method994(int i, int i_7_) {
		if (i_7_ != 3)
			method992(116, null, false);
		anInt3623++;
		RSString rSString = Class37_Sub9_Sub24.method870(i, (byte) -114);
		for (int i_8_ = rSString.length() + -3; i_8_ > 0; i_8_ -= 3)
			rSString = (Class37_Sub9_Sub27.method881(new RSString[] {
					rSString.method169(0, 0, i_8_),
					ClientScriptDef.aClass16_2621,
					rSString.method158(i_8_, -1) }));
		if (rSString.length() > 9)
			return (Class37_Sub9_Sub27.method881((new RSString[] {
					Class75.aClass16_1410,
					rSString.method169(0, 0, rSString.length() + -8),
					Cache.aClass16_1228, Class37_Sub9_Sub24.aClass16_3370,
					rSString, Class2.aClass16_80 })));
		if ((rSString.length() ^ 0xffffffff) < -7)
			return (Class37_Sub9_Sub27.method881((new RSString[] {
					Class37_Sub23.aClass16_2235,
					rSString.method169(0, 0, rSString.length() + -4),
					Class27.aClass16_667, Class37_Sub9_Sub24.aClass16_3370,
					rSString, Class2.aClass16_80 })));
		return Class37_Sub9_Sub27.method881((new RSString[] {
				Class19.aClass16_471, rSString,
				(Class37_Sub9_Sub22.aClass16_3332) }));
	}

	public static void method995(int i) {
		aClass15_Sub1_3609 = null;
		if (i > -126)
			aClass19_3613 = null;
		aClass16_3620 = null;
		aClass16_3614 = null;
		anIntArray3611 = null;
		aClass19_3613 = null;
		aClass16_3618 = null;
		aClass16_3627 = null;
	}

	public int method996(int i, int i_9_) {
		anInt3617++;
		if (i_9_ < 10)
			aClass16_3614 = null;
		int i_10_ = anInt3626 >> -1494101117;
		int i_11_ = 0;
		int i_12_ = -(anInt3626 & 0x7) + 8;
		anInt3626 += i;
		for (/**/; (i ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_ = 8) {
			i_11_ += ((buf[i_10_++] & Class47.anIntArray994[i_12_]) << i
					+ -i_12_);
			i -= i_12_;
		}
		if (i_12_ != i)
			i_11_ += (buf[i_10_] >> i_12_ - i & Class47.anIntArray994[i]);
		else
			i_11_ += buf[i_10_] & Class47.anIntArray994[i_12_];
		return i_11_;
	}

	static {
		anInt3610 = 1;
		anInt3625 = 0;
		aClass16_3614 = Class37_Sub2.create_rsstring("Unexpected loginserver response)3");
		aClass16_3618 = aClass16_3614;
		aClass16_3620 = Class37_Sub2.create_rsstring("Einloggen");
		aClass16_3627 = Class37_Sub2.create_rsstring("<col=ffff00>");
	}
}
