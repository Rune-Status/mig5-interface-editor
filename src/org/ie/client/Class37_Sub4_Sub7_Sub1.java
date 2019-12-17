package org.ie.client;

/* Class37_Sub4_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class37_Sub4_Sub7_Sub1 extends Class37_Sub4_Sub7 {
	public boolean aBoolean3635 = false;
	public int anInt3636;
	public int anInt3637;
	public int anInt3638 = 0;
	public int localY;
	public int anInt3640;
	public int anInt3641;
	public int anInt3642;
	public int newLocationY;
	public static int anInt3644;
	public int anInt3645;
	public int[] anIntArray3646;
	public int anInt3647 = -1;
	public int firstDistanceSpeed;
	public static RSString aClass16_3649 = Class37_Sub2.create_rsstring(
			":chalreq:");
	public int anInt3650 = 0;
	public int[] anIntArray3651;
	public int anInt3652;
	public int anInt3653;
	public int anInt3654;
	public int anInt3655 = -1;
	public static int anInt3656;
	public int anInt3657 = -1;
	public int anInt3658;
	public int anInt3659;
	public int anInt3660 = -1;
	public int walkingFace;
	public int anInt3662 = 100;
	public int anInt3663;
	public int anInt3664;
	public int anInt3665;
	public int anInt3666;
	public int secondDistanceSpeed;
	public int anInt3668 = 32;
	public int[] anIntArray3669;
	public static Hashtable aClass13_3670 = new Hashtable(32);
	public static int anInt3671;
	public static int anInt3672;
	public int anInt3673;
	public int[] anIntArray3674;
	public int[] anIntArray3675;
	public int anInt3676;
	public int anInt3677;
	public int anInt3678;
	public int anInt3679;
	public int anInt3680;
	public int anInt3681;
	public boolean[] aBooleanArray3682;
	public int anInt3683;
	public int localX;
	public static int anInt3685;
	public int anInt3686;
	public int anInt3687;
	public int newLocationX;
	public int anInt3689;
	public int anInt3690;
	public int anInt3691;
	public int anInt3692;
	public int anInt3693;
	public RSString aClass16_3694;
	public static int anInt3695;
	public int anInt3696;
	public int anInt3697;
	public int anInt3698;
	public static Class42[] aClass42Array3699 = new Class42[16];
	public static int anInt3700;
	public int anInt3701;
	public static short[][] aShortArrayArray3702;

	public void method495(boolean bool, int i, int i_0_) {
		anInt3656++;
		int i_1_ = anIntArray3669[0];
		int i_2_ = anIntArray3651[0];
		if ((anInt3655 ^ 0xffffffff) != 0
				&& (Class37_Sub9_Sub22.method861(anInt3655).anInt2754 ^ 0xffffffff) == -2)
			anInt3655 = -1;
		if (anInt3645 < 9)
			anInt3645++;
		if ((i_0_ ^ 0xffffffff) == -1) {
			i_2_--;
			i_1_++;
		}
		if (i != -3523)
			method498(false);
		for (int i_3_ = anInt3645; i_3_ > 0; i_3_--) {
			anIntArray3651[i_3_] = anIntArray3651[-1 + i_3_];
			anIntArray3669[i_3_] = anIntArray3669[-1 + i_3_];
			aBooleanArray3682[i_3_] = aBooleanArray3682[-1 + i_3_];
		}
		aBooleanArray3682[0] = bool;
		if ((i_0_ ^ 0xffffffff) == -2)
			i_1_++;
		if ((i_0_ ^ 0xffffffff) == -3) {
			i_1_++;
			i_2_++;
		}
		if (i_0_ == 3)
			i_2_--;
		if (i_0_ == 4)
			i_2_++;
		if ((i_0_ ^ 0xffffffff) == -6) {
			i_1_--;
			i_2_--;
		}
		if (i_0_ == 6)
			i_1_--;
		if ((i_0_ ^ 0xffffffff) == -8) {
			i_1_--;
			i_2_++;
		}
		anIntArray3651[0] = i_2_;
		anIntArray3669[0] = i_1_;
	}

	public void method496(int i, int i_4_, byte i_5_, int i_6_) {
		anInt3685++;
		for (int i_7_ = 0; i_7_ < 4; i_7_++) {
			if (i >= anIntArray3646[i_7_]) {
				anIntArray3675[i_7_] = i_4_;
				anIntArray3674[i_7_] = i_6_;
				anIntArray3646[i_7_] = i - -70;
				return;
			}
		}
		int i_8_ = -89 / ((50 - i_5_) / 51);
	}

	public boolean method497(int i) {
		if (i != 20542)
			return false;
		anInt3644++;
		return false;
	}

	public static void method498(boolean bool) {
		while (Class83.byteVector.method991(NodeSub.anInt1844, -1337) >= 11) {
			int i = Class83.byteVector.method996(11, 56);
			if ((i ^ 0xffffffff) == -2048)
				break;
			boolean bool_9_ = false;
			if (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i] == null) {
				bool_9_ = true;
				Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i] = new Class37_Sub4_Sub7_Sub1_Sub2();
				if (Class37_Sub9_Sub15.aClass37_Sub11Array3175[i] != null)
					Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i].method509(
							Class37_Sub9_Sub15.aClass37_Sub11Array3175[i],
							65535);
			}
			Class26.anIntArray657[Class19.anInt487++] = i;
			Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i];
			class37_sub4_sub7_sub1_sub2.anInt3641 = Class37_Sub7.loopCycle;
			int i_10_ = Class83.byteVector.method996(1, 23);
			if (i_10_ == 1)
				Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i;
			int i_11_ = (Class37_Sub9_Sub18.anIntArray3233[Class83.byteVector
					.method996(3, 77)]);
			if (bool_9_)
				class37_sub4_sub7_sub1_sub2.anInt3681 = class37_sub4_sub7_sub1_sub2.anInt3663 = i_11_;
			int i_12_ = Class83.byteVector.method996(5, 32);
			if (i_12_ > 15)
				i_12_ -= 32;
			int i_13_ = Class83.byteVector.method996(1, 74);
			int i_14_ = Class83.byteVector.method996(5, 104);
			if ((i_14_ ^ 0xffffffff) < -16)
				i_14_ -= 32;
			class37_sub4_sub7_sub1_sub2
					.method499(
							(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0])
									- -i_14_,
							i_12_
									+ (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
							i_13_ == 1, -119);
		}
		if (bool != false)
			aShortArrayArray3702 = null;
		Class83.byteVector.method988(true);
		anInt3695++;
	}

	public void method499(int i, int i_15_, boolean bool, int i_16_) {
		if (i_16_ < -109) {
			anInt3671++;
			if (anInt3655 != -1
					&& Class37_Sub9_Sub22.method861(anInt3655).anInt2754 == 1)
				anInt3655 = -1;
			if (!bool) {
				int i_17_ = i_15_ - anIntArray3651[0];
				int i_18_ = -anIntArray3669[0] + i;
				if (i_17_ >= -8 && (i_17_ ^ 0xffffffff) >= -9
						&& (i_18_ ^ 0xffffffff) <= 7 && i_18_ <= 8) {
					if (anInt3645 < 9)
						anInt3645++;
					for (int i_19_ = anInt3645; (i_19_ ^ 0xffffffff) < -1; i_19_--) {
						anIntArray3651[i_19_] = anIntArray3651[-1 + i_19_];
						anIntArray3669[i_19_] = anIntArray3669[-1 + i_19_];
						aBooleanArray3682[i_19_] = aBooleanArray3682[-1 + i_19_];
					}
					anIntArray3651[0] = i_15_;
					aBooleanArray3682[0] = false;
					anIntArray3669[0] = i;
					return;
				}
			}
			anInt3645 = 0;
			anIntArray3651[0] = i_15_;
			anInt3640 = 0;
			anIntArray3669[0] = i;
			anInt3642 = 64 * anInt3683 + 128 * anIntArray3669[0];
			anInt3665 = 0;
			anInt3666 = 128 * anIntArray3651[0] + anInt3683 * 64;
		}
	}

	public static void method500(byte i) {
		aClass13_3670 = null;
		int i_20_ = 27 / ((69 - i) / 56);
		aShortArrayArray3702 = null;
		aClass16_3649 = null;
		aClass42Array3699 = null;
	}

	public void method501(int i) {
		anInt3645 = 0;
		anInt3672++;
		anInt3640 = 0;
		if (i <= 2)
			anInt3678 = -76;
	}

	public Class37_Sub4_Sub7_Sub1() {
		anInt3658 = 0;
		anInt3640 = 0;
		anInt3654 = 0;
		anInt3636 = -1;
		anIntArray3669 = new int[10];
		aBooleanArray3682 = new boolean[10];
		anInt3653 = -1;
		anInt3665 = 0;
		anInt3641 = 0;
		anIntArray3674 = new int[4];
		anInt3637 = 0;
		anInt3680 = 0;
		anInt3673 = 0;
		anInt3664 = 0;
		anInt3683 = 1;
		anIntArray3675 = new int[4];
		anInt3687 = 0;
		anInt3678 = -1;
		anInt3645 = 0;
		anInt3659 = 0;
		anInt3676 = -1;
		aClass16_3694 = null;
		anInt3696 = -1;
		anIntArray3646 = new int[4];
		anInt3679 = 0;
		anInt3677 = 0;
		anInt3686 = -1;
		anInt3691 = 200;
		anInt3689 = 0;
		anInt3697 = -1000;
		anIntArray3651 = new int[10];
		anInt3698 = -1;
		anInt3701 = -1;
	}
}
