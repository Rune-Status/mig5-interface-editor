package org.ie.client;

/* Class37_Sub9_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub17 extends Class37_Sub9 {
	public static int anInt3210;
	public int anInt3211;
	public int[] anIntArray3212 = new int[3];
	public static int anInt3213;
	public static int anInt3214;
	public static volatile int currentMouseX;
	public int anInt3216 = 4096;
	public int anInt3217;
	public static int anInt3218;
	public static int anInt3219 = 0;
	public static int anInt3220;
	public static int anInt3221;
	public int anInt3222 = 4096;
	public static int anInt3223;
	public static ByteVector aClass37_Sub11_3224;
	public static int anInt3225;
	public static RSString aClass16_3226;
	public static RSString aClass16_3227;

	public static void method833(int i) {
		aClass16_3226 = null;
		if (i == 4096) {
			aClass16_3227 = null;
			aClass37_Sub11_3224 = null;
		}
	}

	public static RSInterface method834(RSInterface rSInterface) {
		int idk = Class42.method1084(RuntimeException_Sub1.get_click_mask(rSInterface));
		if (idk == 0)
			return null;
		for (int i = 0; i < idk; i++) {
			rSInterface = Class37_Sub9_Sub14.getInterface(rSInterface.parentId);
			if (rSInterface == null)
				return null;
		}
		return rSInterface;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt3210++;
		if (bool != true)
			currentMouseX = -80;
		int i_1_ = i;
		while_79_: do {
			while_78_: do {
				while_77_: do {
					do {
						if ((i_1_ ^ 0xffffffff) != -1) {
							if ((i_1_ ^ 0xffffffff) != -2) {
								if ((i_1_ ^ 0xffffffff) != -3) {
									if (i_1_ != 3) {
										if ((i_1_ ^ 0xffffffff) == -5)
											break while_78_;
										break while_79_;
									}
								} else
									break;
								break while_77_;
							}
						} else {
							anInt3217 = class37_sub11.getUnsignedShort();
							return;
						}
						anInt3211 = class37_sub11.getUnsignedShort();
						return;
					} while (false);
					anInt3222 = class37_sub11.getUnsignedShort();
					return;
				} while (false);
				anInt3216 = class37_sub11.getUnsignedShort();
				return;
			} while (false);
			int i_2_ = class37_sub11.getTriByte(-26256544);
			anIntArray3212[2] = Class37_Sub4_Sub7.method490(i_2_, 255) >> 1851507628;
			anIntArray3212[1] = Class37_Sub4_Sub7.method490(4080,
					i_2_ >> 1389804452);
			anIntArray3212[0] = Class37_Sub4_Sub7.method490(16711680, i_2_) << 1732009348;
		} while (false);
	}

	public int[][] method759(byte i, int i_3_) {
		anInt3220++;
		int[][] is = aClass33_1946.method298(false, i_3_);
		if (aClass33_1946.aBoolean767) {
			int[][] is_4_ = this.method762(0, i_3_, (byte) -113);
			int[] is_5_ = is_4_[0];
			int[] is_6_ = is_4_[1];
			int[] is_7_ = is_4_[2];
			int[] is_8_ = is[0];
			int[] is_9_ = is[1];
			int[] is_10_ = is[2];
			for (int i_11_ = 0; Class32.anInt743 > i_11_; i_11_++) {
				int i_12_ = is_5_[i_11_];
				int i_13_ = i_12_ + -anIntArray3212[0];
				if (i_13_ < 0)
					i_13_ = -i_13_;
				if (anInt3217 < i_13_) {
					is_8_[i_11_] = i_12_;
					is_9_[i_11_] = is_6_[i_11_];
					is_10_[i_11_] = is_7_[i_11_];
				} else {
					int i_14_ = is_6_[i_11_];
					i_13_ = i_14_ - anIntArray3212[1];
					if (i_13_ < 0)
						i_13_ = -i_13_;
					if (i_13_ > anInt3217) {
						is_8_[i_11_] = i_12_;
						is_9_[i_11_] = i_14_;
						is_10_[i_11_] = is_7_[i_11_];
					} else {
						int i_15_ = is_7_[i_11_];
						i_13_ = i_15_ + -anIntArray3212[2];
						if (i_13_ < 0)
							i_13_ = -i_13_;
						if (anInt3217 < i_13_) {
							is_8_[i_11_] = i_12_;
							is_9_[i_11_] = i_14_;
							is_10_[i_11_] = i_15_;
						} else {
							is_8_[i_11_] = anInt3216 * i_12_ >> -570633556;
							is_9_[i_11_] = i_14_ * anInt3222 >> 1743883500;
							is_10_[i_11_] = i_15_ * anInt3211 >> -686243988;
						}
					}
				}
			}
		}
		if (i <= 111)
			return null;
		return is;
	}

	public Class37_Sub9_Sub17() {
		super(1, false);
		anInt3211 = 4096;
		anInt3217 = 409;
	}

	static {
		anInt3218 = -1;
		currentMouseX = -1;
		anInt3223 = 255;
		anInt3225 = 0;
		aClass37_Sub11_3224 = new ByteVector(8);
		aClass16_3226 = Class37_Sub2.create_rsstring("null");
		aClass16_3227 = Class37_Sub2.create_rsstring("<col=00ff80>");
	}
}
