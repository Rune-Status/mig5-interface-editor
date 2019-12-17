package org.ie.client;

/* Class37_Sub4_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub10 extends NodeSub {
	public int anInt2668;
	public static int anInt2669;
	public static int anInt2670;
	public static int anInt2671;
	public static RSString aClass16_2672;
	public RSString aClass16_2673 = Class37_Sub4_Sub7_Sub5.aClass16_3808;
	public static RSString aClass16_2674 = Class37_Sub2.create_rsstring(
			" is already on your friend list)3");
	public RSString[] aClass16Array2675;
	public int anInt2676 = 0;
	public static int anInt2677;
	public static RSString aClass16_2678;
	public static int anInt2679;
	public int anInt2680;
	public static int[] anIntArray2681;
	public int anInt2682;
	public int[] anIntArray2683;
	public int[] anIntArray2684;
	public static int anInt2685;
	public static Object anObject2686;
	public static int anInt2687;
	public static boolean freeWorld;
	public static int[] anIntArray2689;
	public static boolean aBoolean2690;

	public static void method675(int i) {
		anIntArray2681 = null;
		aClass16_2672 = null;
		if (i != 50)
			method677(-67, -57, 37);
		anObject2686 = null;
		anIntArray2689 = null;
		aClass16_2674 = null;
		aClass16_2678 = null;
	}

	public static boolean method676(int i, int i_0_, int i_1_, int i_2_) {
		anInt2671++;
		int i_3_ = Class38.aClass67_847.method1239(Class37_Sub9_Sub1.anInt2916,
				i_0_, i_1_, i);
		int i_4_ = 0x7fff & i >> -1767311250;
		if (i_2_ == (i_3_ ^ 0xffffffff))
			return false;
		int i_5_ = (0xe9 & i_3_) >> -1321478522;
		int i_6_ = i_3_ & 0x1f;
		if (i_6_ == 10 || i_6_ == 11 || i_6_ == 22) {
			Class37_Sub4_Sub11 class37_sub4_sub11 = Class37_Sub9_Sub8
					.method794(i_4_, 28067);
			int i_7_;
			int i_8_;
			if (i_5_ != 0 && i_5_ != 2) {
				i_7_ = class37_sub4_sub11.anInt2743;
				i_8_ = class37_sub4_sub11.anInt2731;
			} else {
				i_7_ = class37_sub4_sub11.anInt2731;
				i_8_ = class37_sub4_sub11.anInt2743;
			}
			int i_9_ = class37_sub4_sub11.anInt2708;
			if (i_5_ != 0)
				i_9_ = (i_9_ << i_5_ & 0xf) - -(i_9_ >> -i_5_ + 4);
			NodeSub
					.method434(
							(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
							i_9_,
							i_0_,
							(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
							true, 2, 0, i_8_, 0, i_1_, 0, i_7_, true);
		} else
			NodeSub
					.method434(
							(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
							0,
							i_0_,
							(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
							true, 2, i_6_ - -1, 0, i_5_, i_1_, 0, 0, true);
		Class19.anInt490 = 2;
		Class37_Sub9_Sub8.anInt3057 = 0;
		Class27.anInt676 = Class37_Sub13.lastClickY;
		Applet_Sub1.anInt8 = Class33.lastClickX;
		return true;
	}

	public static void method677(int i, int i_10_, int i_11_) {
		if (i_10_ < 128 || (i_11_ ^ 0xffffffff) > -129 || i_10_ > 13056
				|| (i_11_ ^ 0xffffffff) < -13057) {
			Class37_Sub23.anInt2232 = -1;
			ByteVector.anInt2014 = -1;
		} else {
			int i_13_ = -i
					+ RSString.method153(Class37_Sub9_Sub1.anInt2916,
							i_11_, i_10_);
			i_13_ -= Class37_Sub25.anInt2286;
			int i_14_ = (Rasterizer.anIntArray3910[Class37_Sub4_Sub7_Sub1_Sub2.anInt3969]);
			i_10_ -= Class19.anInt483;
			i_11_ -= OverridedInterface.anInt1888;
			int i_15_ = (Rasterizer.anIntArray3910[Class37_Sub17.anInt2188]);
			int i_16_ = (Rasterizer.anIntArray3929[Class37_Sub4_Sub7_Sub1_Sub2.anInt3969]);
			int i_17_ = (Rasterizer.anIntArray3929[Class37_Sub17.anInt2188]);
			int i_18_ = i_10_ * i_17_ + i_11_ * i_15_ >> 1974719664;
			i_11_ = -(i_15_ * i_10_) + i_11_ * i_17_ >> -360519952;
			i_10_ = i_18_;
			i_18_ = -(i_11_ * i_14_) + i_16_ * i_13_ >> -965031056;
			i_11_ = i_11_ * i_16_ + i_13_ * i_14_ >> 1527109328;
			i_13_ = i_18_;
			if (i_11_ < 50) {
				ByteVector.anInt2014 = -1;
				Class37_Sub23.anInt2232 = -1;
			} else {
				ByteVector.anInt2014 = (i_13_ << -1494857559) / i_11_ + 167;
				Class37_Sub23.anInt2232 = 256 - -((i_10_ << 751827337) / i_11_);
			}
		}
	}

	public static void method678(int i) {
		anInt2670++;
		if (Class43.aClass19_950 != null)
			Class43.aClass19_950.method209((byte) -128);
		if (i != 17242)
			freeWorld = false;
	}

	public void method679(int i, ByteVector class37_sub11) {
		anInt2669++;
		for (;;) {
			int i_19_ = class37_sub11.getUnsignedByte();
			if ((i_19_ ^ 0xffffffff) == -1)
				break;
			method680(i_19_, (byte) -111, class37_sub11);
		}
		if (i != 15)
			anInt2680 = 57;
	}

	public void method680(int i, byte i_20_, ByteVector class37_sub11) {
		if ((i ^ 0xffffffff) != -2) {
			if ((i ^ 0xffffffff) == -3)
				anInt2682 = class37_sub11.getUnsignedByte();
			else if (i != 3) {
				if (i == 4)
					anInt2680 = class37_sub11.getInt();
				else if (i != 5) {
					if (i == 6) {
						anInt2676 = class37_sub11.getUnsignedShort();
						anIntArray2683 = new int[anInt2676];
						anIntArray2684 = new int[anInt2676];
						for (int i_21_ = 0; (anInt2676 ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
							anIntArray2683[i_21_] = class37_sub11.getInt();
							anIntArray2684[i_21_] = class37_sub11.getInt();
						}
					}
				} else {
					anInt2676 = class37_sub11.getUnsignedShort();
					anIntArray2683 = new int[anInt2676];
					aClass16Array2675 = new RSString[anInt2676];
					for (int i_22_ = 0; anInt2676 > i_22_; i_22_++) {
						anIntArray2683[i_22_] = class37_sub11.getInt();
						aClass16Array2675[i_22_] = class37_sub11.getRS2String();
					}
				}
			} else
				aClass16_2673 = class37_sub11.getRS2String();
		} else
			anInt2668 = class37_sub11.getUnsignedByte();
		anInt2687++;
		if (i_20_ >= -56)
			method676(-33, -52, 126, -21);
	}

	static {
		aClass16_2672 = aClass16_2674;
		aClass16_2678 = Class37_Sub2.create_rsstring("sl_button");
		anIntArray2681 = new int[50];
		anInt2677 = 0;
		anObject2686 = new Object();
		anIntArray2689 = new int[32];
		int i = 2;
		for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -33; i_23_++) {
			anIntArray2689[i_23_] = -1 + i;
			i += i;
		}
	}
}
