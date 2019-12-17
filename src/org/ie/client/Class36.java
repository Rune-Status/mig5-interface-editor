package org.ie.client;

/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import javax.swing.JPanel;

public class Class36 {
	public static int anInt795;
	public static Class15_Sub1 aClass15_Sub1_796;
	public static JPanel aFrame797;
	public static int anInt798;
	public static RSString aClass16_799;
	public static Class15 aClass15_800;
	public static int anInt801;
	public static int anInt802;
	public static RSString aClass16_803 = Class37_Sub2.create_rsstring("Anmelde)2Zeitlimit -Uberschritten)3");
	public static int anInt804;
	public static int anInt805;
	public static int anInt806;
	public static RSString aClass16_807;
	public static short[][] aShortArrayArray808;
	public static int[] anIntArray809;

	public static int method316(int i, RSString rSString) {
		anInt802++;
		if ((Class37_Sub9_Sub25.anInt3382 ^ 0xffffffff) == -2)
			return 7;
		if (rSString.method165(Class52.aClass16_1055, i ^ 0x33))
			return 1;
		if (rSString.method165(Class37_Sub9_Sub4.aClass16_2984, 52))
			return 1;
		if (i != 7)
			aClass16_807 = null;
		if (rSString.method165(client.aClass16_1721, 52))
			return 2;
		if (rSString.method165(Class37_Sub9_Sub26.aClass16_3389, 52))
			return 2;
		if (rSString.method165(Class37_Sub4_Sub4.aClass16_2578, i + 45))
			return 3;
		if (rSString.method165(Class29.aClass16_707, 52))
			return 4;
		if (rSString.method165(Class50.aClass16_1022, 52))
			return 4;
		if (rSString.method165(Class84.aClass16_1530, 52))
			return 5;
		if (rSString.method165(Class1.aClass16_70, 52))
			return 6;
		return 0;
	}

	public static void method317(int i) {
		Class88.aClass65_1594.clear();
		anInt801++;
		Class37_Sub9_Sub23.aClass65_3346.clear();
		if (i != 8)
			aClass15_800 = null;
		Class39.aClass65_867.clear();
		Class72.aClass65_1371.clear();
		Class37_Sub4_Sub12.aClass65_2770.clear();
	}

	public static RSString method318(int i, int i_0_) {
		if (i != -21952)
			method319(null, 22);
		anInt798++;
		return (Class37_Sub9_Sub27.method881((new RSString[] {
				Class37_Sub9_Sub24.method870(i_0_ >> -658598408 & 0xff,
						(byte) -114),
				client.aClass16_1727,
				Class37_Sub9_Sub24.method870(((i_0_ & 0xff9881) >> -949502576),
						(byte) -114),
				client.aClass16_1727,
				Class37_Sub9_Sub24.method870((0xff0a & i_0_) >> 2053687912,
						(byte) -114), client.aClass16_1727,
				Class37_Sub9_Sub24.method870(i_0_ & 0xff, (byte) -114) })));
	}

	public static RSString method319(ByteVector class37_sub11, int i) {
		anInt795++;
		if (i >= -25)
			anIntArray809 = null;
		return Class68.method1248(class37_sub11, false, 32767);
	}

	public static void method320(byte i) {
		aClass16_803 = null;
		anIntArray809 = null;
		aClass16_807 = null;
		aFrame797 = null;
		aClass15_800 = null;
		if (i != -27)
			method318(6, -40);
		aClass15_Sub1_796 = null;
		aShortArrayArray808 = null;
		aClass16_799 = null;
	}

	public static boolean method321(int i_1_) {
		if ((0x1 & i_1_ >> 126462004) == 0)
			return false;
		return true;
	}

	static {
		aClass16_799 = Class37_Sub2.create_rsstring("compass");
		aClass16_807 = Class37_Sub2.create_rsstring(":tradereq:");
		anIntArray809 = new int[2048];
		aShortArrayArray808 = (new short[][] {
				{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
						2983, -11343, 8, 5281, 10438, 3650, -27322, -21845,
						200, 571, 908, 21830, 28946, -15701, -14010 },
				{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
						10153, -8915, 4783, 1341, 16578, -30533, 25239, 8,
						5281, 10438, 3650, -27322, -21845, 200, 571, 908,
						21830, 28946, -15701, -14010 },
				{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106,
						24094, 10153, -8915, 4783, 1341, 16578, -30533, 8,
						5281, 10438, 3650, -27322, -21845, 200, 571, 908,
						21830, 28946, -15701, -14010 },
				{ 4626, 11146, 6439, 12, 4758, 10270 },
				{ 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } });
	}
}
