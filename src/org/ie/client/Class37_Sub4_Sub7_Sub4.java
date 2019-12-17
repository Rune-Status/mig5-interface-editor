package org.ie.client;

/* Class37_Sub4_Sub7_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub4 extends Class37_Sub4_Sub7 {
	public Class89[] aClass89Array3756;
	public short[] aShortArray3757;
	public byte[] aByteArray3758;
	public Class89[] aClass89Array3759;
	public short aShort3760;
	public int[] anIntArray3761;
	public short[] aShortArray3762;
	public int[] anIntArray3763;
	public byte[] aByteArray3764;
	public int[] anIntArray3765;
	public byte[] aByteArray3766;
	public short[] aShortArray3767;
	public short[] aShortArray3768;
	public Class26[] aClass26Array3769;
	public short[] aShortArray3770;
	public byte[] aByteArray3771;
	public int[] anIntArray3772;
	public short[] aShortArray3773;
	public byte[] aByteArray3774;
	public int anInt3775;
	public int anInt3776;
	public byte[] aByteArray3777;
	public int anInt3778;
	public int anInt3779;
	public boolean aBoolean3780 = false;
	public int[][] anIntArrayArray3781;
	public byte[] aByteArray3782;
	public byte[] aByteArray3783;
	public int[] anIntArray3784;
	public int anInt3785;
	public byte[] aByteArray3786;
	public short[] aShortArray3787;
	public byte aByte3788 = 0;
	public static int anInt3789;
	public int anInt3790;
	public short[] aShortArray3791;
	public static int[] anIntArray3792 = new int[10000];
	public short aShort3793;
	public int[] anIntArray3794;
	public static int[] anIntArray3795;
	public int[] anIntArray3796;
	public byte[] aByteArray3797;
	public static int[] anIntArray3798;
	public static int[] anIntArray3799;
	public int anInt3800;
	public int[][] anIntArrayArray3801;
	public int anInt3802;
	public int[] anIntArray3803;

	public Class37_Sub4_Sub7_Sub6 method518(int i, int i_0_, int i_1_,
			int i_2_, int i_3_, boolean bool, boolean bool_4_) {
		return new Class37_Sub4_Sub7_Sub6_Sub1(this, i, i_0_, i_1_, i_2_, i_3_);
	}

	public void method519() {
		for (int i = 0; i < anInt3802; i++) {
			int i_5_ = anIntArray3765[i];
			anIntArray3765[i] = anIntArray3772[i];
			anIntArray3772[i] = -i_5_;
		}
		method528();
	}

	public void method520(int i, int i_6_, int i_7_) {
		for (int i_8_ = 0; i_8_ < anInt3802; i_8_++) {
			anIntArray3772[i_8_] += i;
			anIntArray3784[i_8_] += i_6_;
			anIntArray3765[i_8_] += i_7_;
		}
		method528();
	}

	public void method521() {
		for (int i = 0; i < anInt3802; i++) {
			int i_9_ = anIntArray3772[i];
			anIntArray3772[i] = anIntArray3765[i];
			anIntArray3765[i] = -i_9_;
		}
		method528();
	}

	public static void method522() {
		anIntArray3795 = null;
		anIntArray3792 = null;
		anIntArray3799 = null;
		anIntArray3798 = null;
	}

	public void method523(byte[] is) {
		boolean bool = false;
		boolean bool_10_ = false;
		ByteVector class37_sub11 = new ByteVector(is);
		ByteVector class37_sub11_11_ = new ByteVector(is);
		ByteVector class37_sub11_12_ = new ByteVector(is);
		ByteVector class37_sub11_13_ = new ByteVector(is);
		ByteVector class37_sub11_14_ = new ByteVector(is);
		class37_sub11.pos = is.length - 18;
		int i = class37_sub11.getUnsignedShort();
		int i_15_ = class37_sub11.getUnsignedShort();
		int i_16_ = class37_sub11.getUnsignedByte();
		int i_17_ = class37_sub11.getUnsignedByte();
		int i_18_ = class37_sub11.getUnsignedByte();
		int i_19_ = class37_sub11.getUnsignedByte();
		int i_20_ = class37_sub11.getUnsignedByte();
		int i_21_ = class37_sub11.getUnsignedByte();
		int i_22_ = class37_sub11.getUnsignedShort();
		int i_23_ = class37_sub11.getUnsignedShort();
		int i_24_ = class37_sub11.getUnsignedShort();
		int i_25_ = class37_sub11.getUnsignedShort();
		int i_26_ = 0;
		int i_27_ = i_26_;
		i_26_ += i;
		int i_28_ = i_26_;
		i_26_ += i_15_;
		int i_29_ = i_26_;
		if (i_18_ == 255)
			i_26_ += i_15_;
		int i_30_ = i_26_;
		if (i_20_ == 1)
			i_26_ += i_15_;
		int i_31_ = i_26_;
		if (i_17_ == 1)
			i_26_ += i_15_;
		int i_32_ = i_26_;
		if (i_21_ == 1)
			i_26_ += i;
		int i_33_ = i_26_;
		if (i_19_ == 1)
			i_26_ += i_15_;
		int i_34_ = i_26_;
		i_26_ += i_25_;
		int i_35_ = i_26_;
		i_26_ += i_15_ * 2;
		int i_36_ = i_26_;
		i_26_ += i_16_ * 6;
		int i_37_ = i_26_;
		i_26_ += i_22_;
		int i_38_ = i_26_;
		i_26_ += i_23_;
		int i_39_ = i_26_;
		i_26_ += i_24_;
		anInt3802 = i;
		anInt3775 = i_15_;
		anInt3790 = i_16_;
		anIntArray3772 = new int[i];
		anIntArray3784 = new int[i];
		anIntArray3765 = new int[i];
		anIntArray3763 = new int[i_15_];
		anIntArray3794 = new int[i_15_];
		anIntArray3803 = new int[i_15_];
		if (i_16_ > 0) {
			aByteArray3783 = new byte[i_16_];
			aShortArray3791 = new short[i_16_];
			aShortArray3768 = new short[i_16_];
			aShortArray3757 = new short[i_16_];
		}
		if (i_21_ == 1)
			anIntArray3796 = new int[i];
		if (i_17_ == 1) {
			aByteArray3782 = new byte[i_15_];
			aByteArray3771 = new byte[i_15_];
			aShortArray3767 = new short[i_15_];
		}
		if (i_18_ == 255)
			aByteArray3774 = new byte[i_15_];
		else
			aByte3788 = (byte) i_18_;
		if (i_19_ == 1)
			aByteArray3777 = new byte[i_15_];
		if (i_20_ == 1)
			anIntArray3761 = new int[i_15_];
		aShortArray3773 = new short[i_15_];
		class37_sub11.pos = i_27_;
		class37_sub11_11_.pos = i_37_;
		class37_sub11_12_.pos = i_38_;
		class37_sub11_13_.pos = i_39_;
		class37_sub11_14_.pos = i_32_;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			int i_44_ = class37_sub11.getUnsignedByte();
			int i_45_ = 0;
			if ((i_44_ & 0x1) != 0)
				i_45_ = class37_sub11_11_.method959(25);
			int i_46_ = 0;
			if ((i_44_ & 0x2) != 0)
				i_46_ = class37_sub11_12_.method959(-119);
			int i_47_ = 0;
			if ((i_44_ & 0x4) != 0)
				i_47_ = class37_sub11_13_.method959(-102);
			anIntArray3772[i_43_] = i_40_ + i_45_;
			anIntArray3784[i_43_] = i_41_ + i_46_;
			anIntArray3765[i_43_] = i_42_ + i_47_;
			i_40_ = anIntArray3772[i_43_];
			i_41_ = anIntArray3784[i_43_];
			i_42_ = anIntArray3765[i_43_];
			if (i_21_ == 1)
				anIntArray3796[i_43_] = class37_sub11_14_.getUnsignedByte();
		}
		class37_sub11.pos = i_35_;
		class37_sub11_11_.pos = i_31_;
		class37_sub11_12_.pos = i_29_;
		class37_sub11_13_.pos = i_33_;
		class37_sub11_14_.pos = i_30_;
		for (int i_48_ = 0; i_48_ < i_15_; i_48_++) {
			aShortArray3773[i_48_] = (short) class37_sub11.getUnsignedShort();
			if (i_17_ == 1) {
				int i_49_ = class37_sub11_11_.getUnsignedByte();
				if ((i_49_ & 0x1) == 1) {
					aByteArray3782[i_48_] = (byte) 1;
					bool = true;
				} else
					aByteArray3782[i_48_] = (byte) 0;
				if ((i_49_ & 0x2) == 2) {
					aByteArray3771[i_48_] = (byte) (i_49_ >> 2);
					aShortArray3767[i_48_] = aShortArray3773[i_48_];
					aShortArray3773[i_48_] = (short) 127;
					if (aShortArray3767[i_48_] != -1)
						bool_10_ = true;
				} else {
					aByteArray3771[i_48_] = (byte) -1;
					aShortArray3767[i_48_] = (short) -1;
				}
			}
			if (i_18_ == 255)
				aByteArray3774[i_48_] = class37_sub11_12_.method982((byte) 112);
			if (i_19_ == 1)
				aByteArray3777[i_48_] = class37_sub11_13_.method982((byte) 105);
			if (i_20_ == 1)
				anIntArray3761[i_48_] = class37_sub11_14_.getUnsignedByte();
		}
		class37_sub11.pos = i_34_;
		class37_sub11_11_.pos = i_28_;
		int i_50_ = 0;
		int i_51_ = 0;
		int i_52_ = 0;
		int i_53_ = 0;
		for (int i_54_ = 0; i_54_ < i_15_; i_54_++) {
			int i_55_ = class37_sub11_11_.getUnsignedByte();
			if (i_55_ == 1) {
				i_50_ = class37_sub11.method959(19) + i_53_;
				i_53_ = i_50_;
				i_51_ = class37_sub11.method959(-123) + i_53_;
				i_53_ = i_51_;
				i_52_ = class37_sub11.method959(-100) + i_53_;
				i_53_ = i_52_;
				anIntArray3763[i_54_] = i_50_;
				anIntArray3794[i_54_] = i_51_;
				anIntArray3803[i_54_] = i_52_;
			}
			if (i_55_ == 2) {
				i_51_ = i_52_;
				i_52_ = class37_sub11.method959(-101) + i_53_;
				i_53_ = i_52_;
				anIntArray3763[i_54_] = i_50_;
				anIntArray3794[i_54_] = i_51_;
				anIntArray3803[i_54_] = i_52_;
			}
			if (i_55_ == 3) {
				i_50_ = i_52_;
				i_52_ = class37_sub11.method959(77) + i_53_;
				i_53_ = i_52_;
				anIntArray3763[i_54_] = i_50_;
				anIntArray3794[i_54_] = i_51_;
				anIntArray3803[i_54_] = i_52_;
			}
			if (i_55_ == 4) {
				int i_56_ = i_50_;
				i_50_ = i_51_;
				i_51_ = i_56_;
				i_52_ = class37_sub11.method959(53) + i_53_;
				i_53_ = i_52_;
				anIntArray3763[i_54_] = i_50_;
				anIntArray3794[i_54_] = i_51_;
				anIntArray3803[i_54_] = i_52_;
			}
		}
		class37_sub11.pos = i_36_;
		for (int i_57_ = 0; i_57_ < i_16_; i_57_++) {
			aByteArray3783[i_57_] = (byte) 0;
			aShortArray3791[i_57_] = (short) class37_sub11.getUnsignedShort();
			aShortArray3768[i_57_] = (short) class37_sub11.getUnsignedShort();
			aShortArray3757[i_57_] = (short) class37_sub11.getUnsignedShort();
		}
		if (aByteArray3771 != null) {
			boolean bool_58_ = false;
			for (int i_59_ = 0; i_59_ < i_15_; i_59_++) {
				int i_60_ = aByteArray3771[i_59_] & 0xff;
				if (i_60_ != 255) {
					if (((aShortArray3791[i_60_] & 0xffff) == anIntArray3763[i_59_])
							&& ((aShortArray3768[i_60_] & 0xffff) == anIntArray3794[i_59_])
							&& ((aShortArray3757[i_60_] & 0xffff) == anIntArray3803[i_59_]))
						aByteArray3771[i_59_] = (byte) -1;
					else
						bool_58_ = true;
				}
			}
			if (!bool_58_)
				aByteArray3771 = null;
		}
		if (!bool_10_)
			aShortArray3767 = null;
		if (!bool)
			aByteArray3782 = null;
	}

	public void method524(int i) {
		int i_61_ = anIntArray3799[i];
		int i_62_ = anIntArray3798[i];
		for (int i_63_ = 0; i_63_ < anInt3802; i_63_++) {
			int i_64_ = ((anIntArray3765[i_63_] * i_61_ + anIntArray3772[i_63_]
					* i_62_) >> 16);
			anIntArray3765[i_63_] = (anIntArray3765[i_63_] * i_62_ - anIntArray3772[i_63_]
					* i_61_) >> 16;
			anIntArray3772[i_63_] = i_64_;
		}
		method528();
	}

	public void method525(short i, short i_65_) {
		if (aShortArray3767 != null) {
			for (int i_66_ = 0; i_66_ < anInt3775; i_66_++) {
				if (aShortArray3767[i_66_] == i)
					aShortArray3767[i_66_] = i_65_;
			}
		}
	}

	public int method526(Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_67_,
			int i) {
		int i_68_ = -1;
		int i_69_ = class37_sub4_sub7_sub4_67_.anIntArray3772[i];
		int i_70_ = class37_sub4_sub7_sub4_67_.anIntArray3784[i];
		int i_71_ = class37_sub4_sub7_sub4_67_.anIntArray3765[i];
		for (int i_72_ = 0; i_72_ < anInt3802; i_72_++) {
			if (i_69_ == anIntArray3772[i_72_]
					&& i_70_ == anIntArray3784[i_72_]
					&& i_71_ == anIntArray3765[i_72_]) {
				i_68_ = i_72_;
				break;
			}
		}
		if (i_68_ == -1) {
			anIntArray3772[anInt3802] = i_69_;
			anIntArray3784[anInt3802] = i_70_;
			anIntArray3765[anInt3802] = i_71_;
			if (class37_sub4_sub7_sub4_67_.anIntArray3796 != null)
				anIntArray3796[anInt3802] = class37_sub4_sub7_sub4_67_.anIntArray3796[i];
			i_68_ = anInt3802++;
		}
		return i_68_;
	}

	public void method527() {
		if (!aBoolean3780) {
			anInt2627 = 0;
			anInt3785 = 0;
			anInt3779 = 999999;
			anInt3800 = -999999;
			anInt3776 = -99999;
			anInt3778 = 99999;
			for (int i = 0; i < anInt3802; i++) {
				int i_73_ = anIntArray3772[i];
				int i_74_ = anIntArray3784[i];
				int i_75_ = anIntArray3765[i];
				if (i_73_ < anInt3779)
					anInt3779 = i_73_;
				if (i_73_ > anInt3800)
					anInt3800 = i_73_;
				if (i_75_ < anInt3778)
					anInt3778 = i_75_;
				if (i_75_ > anInt3776)
					anInt3776 = i_75_;
				if (-i_74_ > anInt2627)
					anInt2627 = -i_74_;
				if (i_74_ > anInt3785)
					anInt3785 = i_74_;
			}
			aBoolean3780 = true;
		}
	}

	public void method528() {
		aClass89Array3759 = null;
		aClass89Array3756 = null;
		aClass26Array3769 = null;
		aBoolean3780 = false;
	}

	public static Class37_Sub4_Sub7_Sub4 method529(Class15 class15, int i,
			int i_76_) {
		byte[] is = class15.getFile(i, i_76_);
		if (is == null)
			return null;
		return new Class37_Sub4_Sub7_Sub4(is);
	}

	public static void method530(Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4,
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_77_, int i,
			int i_78_, int i_79_, boolean bool) {
		class37_sub4_sub7_sub4.method527();
		class37_sub4_sub7_sub4.method538();
		class37_sub4_sub7_sub4_77_.method527();
		class37_sub4_sub7_sub4_77_.method538();
		anInt3789++;
		int i_80_ = 0;
		int[] is = class37_sub4_sub7_sub4_77_.anIntArray3772;
		int i_81_ = class37_sub4_sub7_sub4_77_.anInt3802;
		for (int i_82_ = 0; i_82_ < class37_sub4_sub7_sub4.anInt3802; i_82_++) {
			Class89 class89 = class37_sub4_sub7_sub4.aClass89Array3759[i_82_];
			if (class89.anInt1621 != 0) {
				int i_83_ = class37_sub4_sub7_sub4.anIntArray3784[i_82_]
						- i_78_;
				if (i_83_ <= class37_sub4_sub7_sub4_77_.anInt3785) {
					int i_84_ = class37_sub4_sub7_sub4.anIntArray3772[i_82_]
							- i;
					if (i_84_ >= class37_sub4_sub7_sub4_77_.anInt3779
							&& i_84_ <= class37_sub4_sub7_sub4_77_.anInt3800) {
						int i_85_ = (class37_sub4_sub7_sub4.anIntArray3765[i_82_] - i_79_);
						if (i_85_ >= class37_sub4_sub7_sub4_77_.anInt3778
								&& i_85_ <= class37_sub4_sub7_sub4_77_.anInt3776) {
							for (int i_86_ = 0; i_86_ < i_81_; i_86_++) {
								Class89 class89_87_ = (class37_sub4_sub7_sub4_77_.aClass89Array3759[i_86_]);
								if (i_84_ == is[i_86_]
										&& i_85_ == (class37_sub4_sub7_sub4_77_.anIntArray3765[i_86_])
										&& i_83_ == (class37_sub4_sub7_sub4_77_.anIntArray3784[i_86_])
										&& class89_87_.anInt1621 != 0) {
									if ((class37_sub4_sub7_sub4.aClass89Array3756) == null)
										class37_sub4_sub7_sub4.aClass89Array3756 = (new Class89[(class37_sub4_sub7_sub4.anInt3802)]);
									if ((class37_sub4_sub7_sub4_77_.aClass89Array3756) == null)
										class37_sub4_sub7_sub4_77_.aClass89Array3756 = new Class89[i_81_];
									Class89 class89_88_ = (class37_sub4_sub7_sub4.aClass89Array3756[i_82_]);
									if (class89_88_ == null)
										class89_88_ = class37_sub4_sub7_sub4.aClass89Array3756[i_82_] = new Class89(
												class89);
									Class89 class89_89_ = (class37_sub4_sub7_sub4_77_.aClass89Array3756[i_86_]);
									if (class89_89_ == null)
										class89_89_ = class37_sub4_sub7_sub4_77_.aClass89Array3756[i_86_] = new Class89(
												class89_87_);
									class89_88_.anInt1617 += class89_87_.anInt1617;
									class89_88_.anInt1614 += class89_87_.anInt1614;
									class89_88_.anInt1611 += class89_87_.anInt1611;
									class89_88_.anInt1621 += class89_87_.anInt1621;
									class89_89_.anInt1617 += class89.anInt1617;
									class89_89_.anInt1614 += class89.anInt1614;
									class89_89_.anInt1611 += class89.anInt1611;
									class89_89_.anInt1621 += class89.anInt1621;
									i_80_++;
									anIntArray3795[i_82_] = anInt3789;
									anIntArray3792[i_86_] = anInt3789;
								}
							}
						}
					}
				}
			}
		}
		if (i_80_ >= 3 && bool) {
			for (int i_90_ = 0; i_90_ < class37_sub4_sub7_sub4.anInt3775; i_90_++) {
				if (anIntArray3795[(class37_sub4_sub7_sub4.anIntArray3763[i_90_])] == anInt3789
						&& anIntArray3795[(class37_sub4_sub7_sub4.anIntArray3794[i_90_])] == anInt3789
						&& anIntArray3795[(class37_sub4_sub7_sub4.anIntArray3803[i_90_])] == anInt3789) {
					if (class37_sub4_sub7_sub4.aByteArray3782 == null)
						class37_sub4_sub7_sub4.aByteArray3782 = new byte[class37_sub4_sub7_sub4.anInt3775];
					class37_sub4_sub7_sub4.aByteArray3782[i_90_] = (byte) 2;
				}
			}
			for (int i_91_ = 0; i_91_ < class37_sub4_sub7_sub4_77_.anInt3775; i_91_++) {
				if (anIntArray3792[(class37_sub4_sub7_sub4_77_.anIntArray3763[i_91_])] == anInt3789
						&& anIntArray3792[(class37_sub4_sub7_sub4_77_.anIntArray3794[i_91_])] == anInt3789
						&& anIntArray3792[(class37_sub4_sub7_sub4_77_.anIntArray3803[i_91_])] == anInt3789) {
					if (class37_sub4_sub7_sub4_77_.aByteArray3782 == null)
						class37_sub4_sub7_sub4_77_.aByteArray3782 = new byte[class37_sub4_sub7_sub4_77_.anInt3775];
					class37_sub4_sub7_sub4_77_.aByteArray3782[i_91_] = (byte) 2;
				}
			}
		}
	}

	public Class37_Sub4_Sub7_Sub4 method531(int[][] is, int i, int i_92_,
			int i_93_, boolean bool, int i_94_) {
		method527();
		int i_95_ = i + anInt3779;
		int i_96_ = i + anInt3800;
		int i_97_ = i_93_ + anInt3778;
		int i_98_ = i_93_ + anInt3776;
		if (i_95_ < 0 || i_96_ + 128 >> 7 >= is.length || i_97_ < 0
				|| i_98_ + 128 >> 7 >= is[0].length)
			return this;
		i_95_ >>= 7;
		i_96_ = i_96_ + 127 >> 7;
		i_97_ >>= 7;
		i_98_ = i_98_ + 127 >> 7;
		if (is[i_95_][i_97_] == i_92_ && is[i_96_][i_97_] == i_92_
				&& is[i_95_][i_98_] == i_92_ && is[i_96_][i_98_] == i_92_)
			return this;
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_99_;
		if (bool) {
			class37_sub4_sub7_sub4_99_ = new Class37_Sub4_Sub7_Sub4();
			class37_sub4_sub7_sub4_99_.anInt3802 = anInt3802;
			class37_sub4_sub7_sub4_99_.anInt3775 = anInt3775;
			class37_sub4_sub7_sub4_99_.anInt3790 = anInt3790;
			class37_sub4_sub7_sub4_99_.anIntArray3772 = anIntArray3772;
			class37_sub4_sub7_sub4_99_.anIntArray3765 = anIntArray3765;
			class37_sub4_sub7_sub4_99_.anIntArray3763 = anIntArray3763;
			class37_sub4_sub7_sub4_99_.anIntArray3794 = anIntArray3794;
			class37_sub4_sub7_sub4_99_.anIntArray3803 = anIntArray3803;
			class37_sub4_sub7_sub4_99_.aByteArray3782 = aByteArray3782;
			class37_sub4_sub7_sub4_99_.aByteArray3774 = aByteArray3774;
			class37_sub4_sub7_sub4_99_.aByteArray3777 = aByteArray3777;
			class37_sub4_sub7_sub4_99_.aByteArray3771 = aByteArray3771;
			class37_sub4_sub7_sub4_99_.aShortArray3773 = aShortArray3773;
			class37_sub4_sub7_sub4_99_.aShortArray3767 = aShortArray3767;
			class37_sub4_sub7_sub4_99_.aByte3788 = aByte3788;
			class37_sub4_sub7_sub4_99_.aByteArray3783 = aByteArray3783;
			class37_sub4_sub7_sub4_99_.aShortArray3791 = aShortArray3791;
			class37_sub4_sub7_sub4_99_.aShortArray3768 = aShortArray3768;
			class37_sub4_sub7_sub4_99_.aShortArray3757 = aShortArray3757;
			class37_sub4_sub7_sub4_99_.aShortArray3762 = aShortArray3762;
			class37_sub4_sub7_sub4_99_.aShortArray3770 = aShortArray3770;
			class37_sub4_sub7_sub4_99_.aShortArray3787 = aShortArray3787;
			class37_sub4_sub7_sub4_99_.aByteArray3764 = aByteArray3764;
			class37_sub4_sub7_sub4_99_.aByteArray3797 = aByteArray3797;
			class37_sub4_sub7_sub4_99_.aByteArray3758 = aByteArray3758;
			class37_sub4_sub7_sub4_99_.aByteArray3766 = aByteArray3766;
			class37_sub4_sub7_sub4_99_.aByteArray3786 = aByteArray3786;
			class37_sub4_sub7_sub4_99_.anIntArray3796 = anIntArray3796;
			class37_sub4_sub7_sub4_99_.anIntArray3761 = anIntArray3761;
			class37_sub4_sub7_sub4_99_.anIntArrayArray3801 = anIntArrayArray3801;
			class37_sub4_sub7_sub4_99_.anIntArrayArray3781 = anIntArrayArray3781;
			class37_sub4_sub7_sub4_99_.aShort3760 = aShort3760;
			class37_sub4_sub7_sub4_99_.aShort3793 = aShort3793;
			class37_sub4_sub7_sub4_99_.anIntArray3784 = new int[class37_sub4_sub7_sub4_99_.anInt3802];
		} else
			class37_sub4_sub7_sub4_99_ = this;
		if (i_94_ == 0) {
			for (int i_100_ = 0; i_100_ < class37_sub4_sub7_sub4_99_.anInt3802; i_100_++) {
				int i_101_ = anIntArray3772[i_100_] + i;
				int i_102_ = anIntArray3765[i_100_] + i_93_;
				int i_103_ = i_101_ & 0x7f;
				int i_104_ = i_102_ & 0x7f;
				int i_105_ = i_101_ >> 7;
				int i_106_ = i_102_ >> 7;
				int i_107_ = ((is[i_105_][i_106_] * (128 - i_103_) + is[i_105_ + 1][i_106_]
						* i_103_) >> 7);
				int i_108_ = ((is[i_105_][i_106_ + 1] * (128 - i_103_) + is[i_105_ + 1][i_106_ + 1]
						* i_103_) >> 7);
				int i_109_ = i_107_ * (128 - i_104_) + i_108_ * i_104_ >> 7;
				class37_sub4_sub7_sub4_99_.anIntArray3784[i_100_] = anIntArray3784[i_100_]
						+ i_109_ - i_92_;
			}
		} else {
			for (int i_110_ = 0; i_110_ < class37_sub4_sub7_sub4_99_.anInt3802; i_110_++) {
				int i_111_ = (-anIntArray3784[i_110_] << 16) / anInt2627;
				if (i_111_ < i_94_) {
					int i_112_ = anIntArray3772[i_110_] + i;
					int i_113_ = anIntArray3765[i_110_] + i_93_;
					int i_114_ = i_112_ & 0x7f;
					int i_115_ = i_113_ & 0x7f;
					int i_116_ = i_112_ >> 7;
					int i_117_ = i_113_ >> 7;
					int i_118_ = ((is[i_116_][i_117_] * (128 - i_114_) + is[i_116_ + 1][i_117_]
							* i_114_) >> 7);
					int i_119_ = ((is[i_116_][i_117_ + 1] * (128 - i_114_) + is[i_116_ + 1][i_117_ + 1]
							* i_114_) >> 7);
					int i_120_ = i_118_ * (128 - i_115_) + i_119_ * i_115_ >> 7;
					class37_sub4_sub7_sub4_99_.anIntArray3784[i_110_] = (anIntArray3784[i_110_] + (i_120_ - i_92_)
							* (i_94_ - i_111_) / i_94_);
				}
			}
		}
		class37_sub4_sub7_sub4_99_.method528();
		return class37_sub4_sub7_sub4_99_;
	}

	public Class37_Sub4_Sub7_Sub4 method532() {
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_121_ = new Class37_Sub4_Sub7_Sub4();
		if (aByteArray3782 != null) {
			class37_sub4_sub7_sub4_121_.aByteArray3782 = new byte[anInt3775];
			for (int i = 0; i < anInt3775; i++)
				class37_sub4_sub7_sub4_121_.aByteArray3782[i] = aByteArray3782[i];
		}
		class37_sub4_sub7_sub4_121_.anInt3802 = anInt3802;
		class37_sub4_sub7_sub4_121_.anInt3775 = anInt3775;
		class37_sub4_sub7_sub4_121_.anInt3790 = anInt3790;
		class37_sub4_sub7_sub4_121_.anIntArray3772 = anIntArray3772;
		class37_sub4_sub7_sub4_121_.anIntArray3784 = anIntArray3784;
		class37_sub4_sub7_sub4_121_.anIntArray3765 = anIntArray3765;
		class37_sub4_sub7_sub4_121_.anIntArray3763 = anIntArray3763;
		class37_sub4_sub7_sub4_121_.anIntArray3794 = anIntArray3794;
		class37_sub4_sub7_sub4_121_.anIntArray3803 = anIntArray3803;
		class37_sub4_sub7_sub4_121_.aByteArray3774 = aByteArray3774;
		class37_sub4_sub7_sub4_121_.aByteArray3777 = aByteArray3777;
		class37_sub4_sub7_sub4_121_.aByteArray3771 = aByteArray3771;
		class37_sub4_sub7_sub4_121_.aShortArray3773 = aShortArray3773;
		class37_sub4_sub7_sub4_121_.aShortArray3767 = aShortArray3767;
		class37_sub4_sub7_sub4_121_.aByte3788 = aByte3788;
		class37_sub4_sub7_sub4_121_.aByteArray3783 = aByteArray3783;
		class37_sub4_sub7_sub4_121_.aShortArray3791 = aShortArray3791;
		class37_sub4_sub7_sub4_121_.aShortArray3768 = aShortArray3768;
		class37_sub4_sub7_sub4_121_.aShortArray3757 = aShortArray3757;
		class37_sub4_sub7_sub4_121_.aShortArray3762 = aShortArray3762;
		class37_sub4_sub7_sub4_121_.aShortArray3770 = aShortArray3770;
		class37_sub4_sub7_sub4_121_.aShortArray3787 = aShortArray3787;
		class37_sub4_sub7_sub4_121_.aByteArray3764 = aByteArray3764;
		class37_sub4_sub7_sub4_121_.aByteArray3797 = aByteArray3797;
		class37_sub4_sub7_sub4_121_.aByteArray3758 = aByteArray3758;
		class37_sub4_sub7_sub4_121_.aByteArray3766 = aByteArray3766;
		class37_sub4_sub7_sub4_121_.aByteArray3786 = aByteArray3786;
		class37_sub4_sub7_sub4_121_.anIntArray3796 = anIntArray3796;
		class37_sub4_sub7_sub4_121_.anIntArray3761 = anIntArray3761;
		class37_sub4_sub7_sub4_121_.anIntArrayArray3801 = anIntArrayArray3801;
		class37_sub4_sub7_sub4_121_.anIntArrayArray3781 = anIntArrayArray3781;
		class37_sub4_sub7_sub4_121_.aClass89Array3759 = aClass89Array3759;
		class37_sub4_sub7_sub4_121_.aClass26Array3769 = aClass26Array3769;
		class37_sub4_sub7_sub4_121_.aShort3760 = aShort3760;
		class37_sub4_sub7_sub4_121_.aShort3793 = aShort3793;
		return class37_sub4_sub7_sub4_121_;
	}

	public void method533() {
		for (int i = 0; i < anInt3802; i++) {
			anIntArray3772[i] = -anIntArray3772[i];
			anIntArray3765[i] = -anIntArray3765[i];
		}
		method528();
	}

	public void method534(int i, int i_122_, int i_123_) {
		for (int i_124_ = 0; i_124_ < anInt3802; i_124_++) {
			anIntArray3772[i_124_] = anIntArray3772[i_124_] * i / 128;
			anIntArray3784[i_124_] = anIntArray3784[i_124_] * i_122_ / 128;
			anIntArray3765[i_124_] = anIntArray3765[i_124_] * i_123_ / 128;
		}
		method528();
	}

	public void method535(short i, short i_125_) {
		for (int i_126_ = 0; i_126_ < anInt3775; i_126_++) {
			if (aShortArray3773[i_126_] == i)
				aShortArray3773[i_126_] = i_125_;
		}
	}

	public void method536(byte[] is) {
		ByteVector class37_sub11 = new ByteVector(is);
		ByteVector class37_sub11_127_ = new ByteVector(is);
		ByteVector class37_sub11_128_ = new ByteVector(is);
		ByteVector class37_sub11_129_ = new ByteVector(is);
		ByteVector class37_sub11_130_ = new ByteVector(is);
		ByteVector class37_sub11_131_ = new ByteVector(is);
		ByteVector class37_sub11_132_ = new ByteVector(is);
		class37_sub11.pos = is.length - 23;
		int i = class37_sub11.getUnsignedShort();
		int i_133_ = class37_sub11.getUnsignedShort();
		int i_134_ = class37_sub11.getUnsignedByte();
		int i_135_ = class37_sub11.getUnsignedByte();
		int i_136_ = class37_sub11.getUnsignedByte();
		int i_137_ = class37_sub11.getUnsignedByte();
		int i_138_ = class37_sub11.getUnsignedByte();
		int i_139_ = class37_sub11.getUnsignedByte();
		int i_140_ = class37_sub11.getUnsignedByte();
		int i_141_ = class37_sub11.getUnsignedShort();
		int i_142_ = class37_sub11.getUnsignedShort();
		int i_143_ = class37_sub11.getUnsignedShort();
		int i_144_ = class37_sub11.getUnsignedShort();
		int i_145_ = class37_sub11.getUnsignedShort();
		int i_146_ = 0;
		int i_147_ = 0;
		int i_148_ = 0;
		if (i_134_ > 0) {
			aByteArray3783 = new byte[i_134_];
			class37_sub11.pos = 0;
			for (int i_149_ = 0; i_149_ < i_134_; i_149_++) {
				byte i_150_ = (aByteArray3783[i_149_] = class37_sub11
						.method982((byte) 122));
				if (i_150_ == 0)
					i_146_++;
				if (i_150_ >= 1 && i_150_ <= 3)
					i_147_++;
				if (i_150_ == 2)
					i_148_++;
			}
		}
		int i_151_ = i_134_;
		int i_152_ = i_151_;
		i_151_ += i;
		int i_153_ = i_151_;
		if (i_135_ == 1)
			i_151_ += i_133_;
		int i_154_ = i_151_;
		i_151_ += i_133_;
		int i_155_ = i_151_;
		if (i_136_ == 255)
			i_151_ += i_133_;
		int i_156_ = i_151_;
		if (i_138_ == 1)
			i_151_ += i_133_;
		int i_157_ = i_151_;
		if (i_140_ == 1)
			i_151_ += i;
		int i_158_ = i_151_;
		if (i_137_ == 1)
			i_151_ += i_133_;
		int i_159_ = i_151_;
		i_151_ += i_144_;
		int i_160_ = i_151_;
		if (i_139_ == 1)
			i_151_ += i_133_ * 2;
		int i_161_ = i_151_;
		i_151_ += i_145_;
		int i_162_ = i_151_;
		i_151_ += i_133_ * 2;
		int i_163_ = i_151_;
		i_151_ += i_141_;
		int i_164_ = i_151_;
		i_151_ += i_142_;
		int i_165_ = i_151_;
		i_151_ += i_143_;
		int i_166_ = i_151_;
		i_151_ += i_146_ * 6;
		int i_167_ = i_151_;
		i_151_ += i_147_ * 6;
		int i_168_ = i_151_;
		i_151_ += i_147_ * 6;
		int i_169_ = i_151_;
		i_151_ += i_147_;
		int i_170_ = i_151_;
		i_151_ += i_147_;
		int i_171_ = i_151_;
		i_151_ += i_147_ + i_148_ * 2;
		int i_172_ = i_151_;
		anInt3802 = i;
		anInt3775 = i_133_;
		anInt3790 = i_134_;
		anIntArray3772 = new int[i];
		anIntArray3784 = new int[i];
		anIntArray3765 = new int[i];
		anIntArray3763 = new int[i_133_];
		anIntArray3794 = new int[i_133_];
		anIntArray3803 = new int[i_133_];
		if (i_140_ == 1)
			anIntArray3796 = new int[i];
		if (i_135_ == 1)
			aByteArray3782 = new byte[i_133_];
		if (i_136_ == 255)
			aByteArray3774 = new byte[i_133_];
		else
			aByte3788 = (byte) i_136_;
		if (i_137_ == 1)
			aByteArray3777 = new byte[i_133_];
		if (i_138_ == 1)
			anIntArray3761 = new int[i_133_];
		if (i_139_ == 1)
			aShortArray3767 = new short[i_133_];
		if (i_139_ == 1 && i_134_ > 0)
			aByteArray3771 = new byte[i_133_];
		aShortArray3773 = new short[i_133_];
		if (i_134_ > 0) {
			aShortArray3791 = new short[i_134_];
			aShortArray3768 = new short[i_134_];
			aShortArray3757 = new short[i_134_];
			if (i_147_ > 0) {
				aShortArray3762 = new short[i_147_];
				aShortArray3770 = new short[i_147_];
				aShortArray3787 = new short[i_147_];
				aByteArray3764 = new byte[i_147_];
				aByteArray3797 = new byte[i_147_];
				aByteArray3758 = new byte[i_147_];
			}
			if (i_148_ > 0) {
				aByteArray3766 = new byte[i_148_];
				aByteArray3786 = new byte[i_148_];
			}
		}
		class37_sub11.pos = i_152_;
		class37_sub11_127_.pos = i_163_;
		class37_sub11_128_.pos = i_164_;
		class37_sub11_129_.pos = i_165_;
		class37_sub11_130_.pos = i_157_;
		int i_173_ = 0;
		int i_174_ = 0;
		int i_175_ = 0;
		for (int i_176_ = 0; i_176_ < i; i_176_++) {
			int i_177_ = class37_sub11.getUnsignedByte();
			int i_178_ = 0;
			if ((i_177_ & 0x1) != 0)
				i_178_ = class37_sub11_127_.method959(38);
			int i_179_ = 0;
			if ((i_177_ & 0x2) != 0)
				i_179_ = class37_sub11_128_.method959(26);
			int i_180_ = 0;
			if ((i_177_ & 0x4) != 0)
				i_180_ = class37_sub11_129_.method959(115);
			anIntArray3772[i_176_] = i_173_ + i_178_;
			anIntArray3784[i_176_] = i_174_ + i_179_;
			anIntArray3765[i_176_] = i_175_ + i_180_;
			i_173_ = anIntArray3772[i_176_];
			i_174_ = anIntArray3784[i_176_];
			i_175_ = anIntArray3765[i_176_];
			if (i_140_ == 1)
				anIntArray3796[i_176_] = class37_sub11_130_
						.getUnsignedByte();
		}
		class37_sub11.pos = i_162_;
		class37_sub11_127_.pos = i_153_;
		class37_sub11_128_.pos = i_155_;
		class37_sub11_129_.pos = i_158_;
		class37_sub11_130_.pos = i_156_;
		class37_sub11_131_.pos = i_160_;
		class37_sub11_132_.pos = i_161_;
		for (int i_181_ = 0; i_181_ < i_133_; i_181_++) {
			aShortArray3773[i_181_] = (short) class37_sub11.getUnsignedShort();
			if (i_135_ == 1)
				aByteArray3782[i_181_] = class37_sub11_127_
						.method982((byte) 101);
			if (i_136_ == 255)
				aByteArray3774[i_181_] = class37_sub11_128_
						.method982((byte) 122);
			if (i_137_ == 1)
				aByteArray3777[i_181_] = class37_sub11_129_
						.method982((byte) 121);
			if (i_138_ == 1)
				anIntArray3761[i_181_] = class37_sub11_130_
						.getUnsignedByte();
			if (i_139_ == 1)
				aShortArray3767[i_181_] = (short) (class37_sub11_131_
						.getUnsignedShort() - 1);
			if (aByteArray3771 != null) {
				if (aShortArray3767[i_181_] != -1)
					aByteArray3771[i_181_] = (byte) (class37_sub11_132_
							.getUnsignedByte() - 1);
				else
					aByteArray3771[i_181_] = (byte) -1;
			}
		}
		class37_sub11.pos = i_159_;
		class37_sub11_127_.pos = i_154_;
		int i_182_ = 0;
		int i_183_ = 0;
		int i_184_ = 0;
		int i_185_ = 0;
		for (int i_186_ = 0; i_186_ < i_133_; i_186_++) {
			int i_187_ = class37_sub11_127_.getUnsignedByte();
			if (i_187_ == 1) {
				i_182_ = class37_sub11.method959(-101) + i_185_;
				i_185_ = i_182_;
				i_183_ = class37_sub11.method959(-128) + i_185_;
				i_185_ = i_183_;
				i_184_ = class37_sub11.method959(-126) + i_185_;
				i_185_ = i_184_;
				anIntArray3763[i_186_] = i_182_;
				anIntArray3794[i_186_] = i_183_;
				anIntArray3803[i_186_] = i_184_;
			}
			if (i_187_ == 2) {
				i_183_ = i_184_;
				i_184_ = class37_sub11.method959(-109) + i_185_;
				i_185_ = i_184_;
				anIntArray3763[i_186_] = i_182_;
				anIntArray3794[i_186_] = i_183_;
				anIntArray3803[i_186_] = i_184_;
			}
			if (i_187_ == 3) {
				i_182_ = i_184_;
				i_184_ = class37_sub11.method959(58) + i_185_;
				i_185_ = i_184_;
				anIntArray3763[i_186_] = i_182_;
				anIntArray3794[i_186_] = i_183_;
				anIntArray3803[i_186_] = i_184_;
			}
			if (i_187_ == 4) {
				int i_188_ = i_182_;
				i_182_ = i_183_;
				i_183_ = i_188_;
				i_184_ = class37_sub11.method959(-127) + i_185_;
				i_185_ = i_184_;
				anIntArray3763[i_186_] = i_182_;
				anIntArray3794[i_186_] = i_183_;
				anIntArray3803[i_186_] = i_184_;
			}
		}
		class37_sub11.pos = i_166_;
		class37_sub11_127_.pos = i_167_;
		class37_sub11_128_.pos = i_168_;
		class37_sub11_129_.pos = i_169_;
		class37_sub11_130_.pos = i_170_;
		class37_sub11_131_.pos = i_171_;
		for (int i_189_ = 0; i_189_ < i_134_; i_189_++) {
			int i_190_ = aByteArray3783[i_189_] & 0xff;
			if (i_190_ == 0) {
				aShortArray3791[i_189_] = (short) class37_sub11
						.getUnsignedShort();
				aShortArray3768[i_189_] = (short) class37_sub11
						.getUnsignedShort();
				aShortArray3757[i_189_] = (short) class37_sub11
						.getUnsignedShort();
			}
			if (i_190_ == 1) {
				aShortArray3791[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3768[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3757[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3762[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3770[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3787[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aByteArray3764[i_189_] = class37_sub11_129_
						.method982((byte) 100);
				aByteArray3797[i_189_] = class37_sub11_130_
						.method982((byte) 100);
				aByteArray3758[i_189_] = class37_sub11_131_
						.method982((byte) 103);
			}
			if (i_190_ == 2) {
				aShortArray3791[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3768[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3757[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3762[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3770[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3787[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aByteArray3764[i_189_] = class37_sub11_129_
						.method982((byte) 114);
				aByteArray3797[i_189_] = class37_sub11_130_
						.method982((byte) 115);
				aByteArray3758[i_189_] = class37_sub11_131_
						.method982((byte) 100);
				aByteArray3766[i_189_] = class37_sub11_131_
						.method982((byte) 120);
				aByteArray3786[i_189_] = class37_sub11_131_
						.method982((byte) 117);
			}
			if (i_190_ == 3) {
				aShortArray3791[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3768[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3757[i_189_] = (short) class37_sub11_127_
						.getUnsignedShort();
				aShortArray3762[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3770[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aShortArray3787[i_189_] = (short) class37_sub11_128_
						.getUnsignedShort();
				aByteArray3764[i_189_] = class37_sub11_129_
						.method982((byte) 90);
				aByteArray3797[i_189_] = class37_sub11_130_
						.method982((byte) 123);
				aByteArray3758[i_189_] = class37_sub11_131_
						.method982((byte) 111);
			}
		}
		class37_sub11.pos = i_172_;
		int i_191_ = class37_sub11.getUnsignedByte();
		if (i_191_ != 0) {
			new Class10();
			class37_sub11.getUnsignedShort();
			class37_sub11.getUnsignedShort();
			class37_sub11.getUnsignedShort();
			class37_sub11.getInt();
		}
	}

	public void method537() {
		if (anIntArray3796 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_192_ = 0; i_192_ < anInt3802; i_192_++) {
				int i_193_ = anIntArray3796[i_192_];
				is[i_193_]++;
				if (i_193_ > i)
					i = i_193_;
			}
			anIntArrayArray3801 = new int[i + 1][];
			for (int i_194_ = 0; i_194_ <= i; i_194_++) {
				anIntArrayArray3801[i_194_] = new int[is[i_194_]];
				is[i_194_] = 0;
			}
			for (int i_195_ = 0; i_195_ < anInt3802; i_195_++) {
				int i_196_ = anIntArray3796[i_195_];
				anIntArrayArray3801[i_196_][is[i_196_]++] = i_195_;
			}
			anIntArray3796 = null;
		}
		if (anIntArray3761 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_197_ = 0; i_197_ < anInt3775; i_197_++) {
				int i_198_ = anIntArray3761[i_197_];
				is[i_198_]++;
				if (i_198_ > i)
					i = i_198_;
			}
			anIntArrayArray3781 = new int[i + 1][];
			for (int i_199_ = 0; i_199_ <= i; i_199_++) {
				anIntArrayArray3781[i_199_] = new int[is[i_199_]];
				is[i_199_] = 0;
			}
			for (int i_200_ = 0; i_200_ < anInt3775; i_200_++) {
				int i_201_ = anIntArray3761[i_200_];
				anIntArrayArray3781[i_201_][is[i_201_]++] = i_200_;
			}
			anIntArray3761 = null;
		}
	}

	public void method538() {
		if (aClass89Array3759 == null) {
			aClass89Array3759 = new Class89[anInt3802];
			for (int i = 0; i < anInt3802; i++)
				aClass89Array3759[i] = new Class89();
			for (int i = 0; i < anInt3775; i++) {
				int i_202_ = anIntArray3763[i];
				int i_203_ = anIntArray3794[i];
				int i_204_ = anIntArray3803[i];
				int i_205_ = anIntArray3772[i_203_] - anIntArray3772[i_202_];
				int i_206_ = anIntArray3784[i_203_] - anIntArray3784[i_202_];
				int i_207_ = anIntArray3765[i_203_] - anIntArray3765[i_202_];
				int i_208_ = anIntArray3772[i_204_] - anIntArray3772[i_202_];
				int i_209_ = anIntArray3784[i_204_] - anIntArray3784[i_202_];
				int i_210_ = anIntArray3765[i_204_] - anIntArray3765[i_202_];
				int i_211_ = i_206_ * i_210_ - i_209_ * i_207_;
				int i_212_ = i_207_ * i_208_ - i_210_ * i_205_;
				int i_213_;
				for (i_213_ = i_205_ * i_209_ - i_208_ * i_206_; (i_211_ > 8192
						|| i_212_ > 8192 || i_213_ > 8192 || i_211_ < -8192
						|| i_212_ < -8192 || i_213_ < -8192); i_213_ >>= 1) {
					i_211_ >>= 1;
					i_212_ >>= 1;
				}
				int i_214_ = (int) Math.sqrt((double) (i_211_ * i_211_ + i_212_
						* i_212_ + i_213_ * i_213_));
				if (i_214_ <= 0)
					i_214_ = 1;
				i_211_ = i_211_ * 256 / i_214_;
				i_212_ = i_212_ * 256 / i_214_;
				i_213_ = i_213_ * 256 / i_214_;
				byte i_215_;
				if (aByteArray3782 == null)
					i_215_ = (byte) 0;
				else
					i_215_ = aByteArray3782[i];
				if (i_215_ == 0) {
					Class89 class89 = aClass89Array3759[i_202_];
					class89.anInt1617 += i_211_;
					class89.anInt1614 += i_212_;
					class89.anInt1611 += i_213_;
					class89.anInt1621++;
					class89 = aClass89Array3759[i_203_];
					class89.anInt1617 += i_211_;
					class89.anInt1614 += i_212_;
					class89.anInt1611 += i_213_;
					class89.anInt1621++;
					class89 = aClass89Array3759[i_204_];
					class89.anInt1617 += i_211_;
					class89.anInt1614 += i_212_;
					class89.anInt1611 += i_213_;
					class89.anInt1621++;
				} else if (i_215_ == 1) {
					if (aClass26Array3769 == null)
						aClass26Array3769 = new Class26[anInt3775];
					Class26 class26 = aClass26Array3769[i] = new Class26();
					class26.anInt655 = i_211_;
					class26.anInt656 = i_212_;
					class26.anInt648 = i_213_;
				}
			}
		}
	}

	public void method539() {
		for (int i = 0; i < anInt3802; i++)
			anIntArray3765[i] = -anIntArray3765[i];
		for (int i = 0; i < anInt3775; i++) {
			int i_216_ = anIntArray3763[i];
			anIntArray3763[i] = anIntArray3803[i];
			anIntArray3803[i] = i_216_;
		}
		method528();
	}

	public Class37_Sub4_Sub7_Sub4() {
		anInt3775 = 0;
		anInt3802 = 0;
	}

	public Class37_Sub4_Sub7_Sub4(byte[] is) {
		anInt3775 = 0;
		anInt3802 = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			method536(is);
		else
			method523(is);
	}

	public Class37_Sub4_Sub7_Sub4(
			Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s, int i) {
		anInt3775 = 0;
		anInt3802 = 0;
		boolean bool = false;
		boolean bool_217_ = false;
		boolean bool_218_ = false;
		boolean bool_219_ = false;
		boolean bool_220_ = false;
		boolean bool_221_ = false;
		anInt3802 = 0;
		anInt3775 = 0;
		anInt3790 = 0;
		aByte3788 = (byte) -1;
		for (int i_222_ = 0; i_222_ < i; i_222_++) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_223_ = class37_sub4_sub7_sub4s[i_222_];
			if (class37_sub4_sub7_sub4_223_ != null) {
				anInt3802 += class37_sub4_sub7_sub4_223_.anInt3802;
				anInt3775 += class37_sub4_sub7_sub4_223_.anInt3775;
				anInt3790 += class37_sub4_sub7_sub4_223_.anInt3790;
				if (class37_sub4_sub7_sub4_223_.aByteArray3774 != null)
					bool_217_ = true;
				else {
					if (aByte3788 == -1)
						aByte3788 = class37_sub4_sub7_sub4_223_.aByte3788;
					if (aByte3788 != class37_sub4_sub7_sub4_223_.aByte3788)
						bool_217_ = true;
				}
				bool = (bool | class37_sub4_sub7_sub4_223_.aByteArray3782 != null);
				bool_218_ = (bool_218_ | class37_sub4_sub7_sub4_223_.aByteArray3777 != null);
				bool_219_ = (bool_219_ | class37_sub4_sub7_sub4_223_.anIntArray3761 != null);
				bool_220_ = (bool_220_ | class37_sub4_sub7_sub4_223_.aShortArray3767 != null);
				bool_221_ = (bool_221_ | class37_sub4_sub7_sub4_223_.aByteArray3771 != null);
			}
		}
		anIntArray3772 = new int[anInt3802];
		anIntArray3784 = new int[anInt3802];
		anIntArray3765 = new int[anInt3802];
		anIntArray3796 = new int[anInt3802];
		anIntArray3763 = new int[anInt3775];
		anIntArray3794 = new int[anInt3775];
		anIntArray3803 = new int[anInt3775];
		if (bool)
			aByteArray3782 = new byte[anInt3775];
		if (bool_217_)
			aByteArray3774 = new byte[anInt3775];
		if (bool_218_)
			aByteArray3777 = new byte[anInt3775];
		if (bool_219_)
			anIntArray3761 = new int[anInt3775];
		if (bool_220_)
			aShortArray3767 = new short[anInt3775];
		if (bool_221_)
			aByteArray3771 = new byte[anInt3775];
		aShortArray3773 = new short[anInt3775];
		if (anInt3790 > 0) {
			aByteArray3783 = new byte[anInt3790];
			aShortArray3791 = new short[anInt3790];
			aShortArray3768 = new short[anInt3790];
			aShortArray3757 = new short[anInt3790];
			aShortArray3762 = new short[anInt3790];
			aShortArray3770 = new short[anInt3790];
			aShortArray3787 = new short[anInt3790];
			aByteArray3764 = new byte[anInt3790];
			aByteArray3797 = new byte[anInt3790];
			aByteArray3758 = new byte[anInt3790];
			aByteArray3766 = new byte[anInt3790];
			aByteArray3786 = new byte[anInt3790];
		}
		anInt3802 = 0;
		anInt3775 = 0;
		anInt3790 = 0;
		for (int i_224_ = 0; i_224_ < i; i_224_++) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_225_ = class37_sub4_sub7_sub4s[i_224_];
			if (class37_sub4_sub7_sub4_225_ != null) {
				for (int i_226_ = 0; i_226_ < class37_sub4_sub7_sub4_225_.anInt3775; i_226_++) {
					if (bool
							&& class37_sub4_sub7_sub4_225_.aByteArray3782 != null)
						aByteArray3782[anInt3775] = (class37_sub4_sub7_sub4_225_.aByteArray3782[i_226_]);
					if (bool_217_) {
						if (class37_sub4_sub7_sub4_225_.aByteArray3774 != null)
							aByteArray3774[anInt3775] = (class37_sub4_sub7_sub4_225_.aByteArray3774[i_226_]);
						else
							aByteArray3774[anInt3775] = class37_sub4_sub7_sub4_225_.aByte3788;
					}
					if (bool_218_
							&& class37_sub4_sub7_sub4_225_.aByteArray3777 != null)
						aByteArray3777[anInt3775] = (class37_sub4_sub7_sub4_225_.aByteArray3777[i_226_]);
					if (bool_219_
							&& class37_sub4_sub7_sub4_225_.anIntArray3761 != null)
						anIntArray3761[anInt3775] = (class37_sub4_sub7_sub4_225_.anIntArray3761[i_226_]);
					if (bool_220_) {
						if (class37_sub4_sub7_sub4_225_.aShortArray3767 != null)
							aShortArray3767[anInt3775] = (class37_sub4_sub7_sub4_225_.aShortArray3767[i_226_]);
						else
							aShortArray3767[anInt3775] = (short) -1;
					}
					if (bool_221_) {
						if (class37_sub4_sub7_sub4_225_.aByteArray3771 != null
								&& (class37_sub4_sub7_sub4_225_.aByteArray3771[i_226_]) != -1)
							aByteArray3771[anInt3775] = (byte) ((class37_sub4_sub7_sub4_225_.aByteArray3771[i_226_]) + anInt3790);
						else
							aByteArray3771[anInt3775] = (byte) -1;
					}
					aShortArray3773[anInt3775] = class37_sub4_sub7_sub4_225_.aShortArray3773[i_226_];
					anIntArray3763[anInt3775] = method526(
							class37_sub4_sub7_sub4_225_,
							(class37_sub4_sub7_sub4_225_.anIntArray3763[i_226_]));
					anIntArray3794[anInt3775] = method526(
							class37_sub4_sub7_sub4_225_,
							(class37_sub4_sub7_sub4_225_.anIntArray3794[i_226_]));
					anIntArray3803[anInt3775] = method526(
							class37_sub4_sub7_sub4_225_,
							(class37_sub4_sub7_sub4_225_.anIntArray3803[i_226_]));
					anInt3775++;
				}
				for (int i_227_ = 0; i_227_ < class37_sub4_sub7_sub4_225_.anInt3790; i_227_++) {
					byte i_228_ = (aByteArray3783[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3783[i_227_]));
					if (i_228_ == 0) {
						aShortArray3791[anInt3790] = (short) method526(
								class37_sub4_sub7_sub4_225_,
								(class37_sub4_sub7_sub4_225_.aShortArray3791[i_227_]));
						aShortArray3768[anInt3790] = (short) method526(
								class37_sub4_sub7_sub4_225_,
								(class37_sub4_sub7_sub4_225_.aShortArray3768[i_227_]));
						aShortArray3757[anInt3790] = (short) method526(
								class37_sub4_sub7_sub4_225_,
								(class37_sub4_sub7_sub4_225_.aShortArray3757[i_227_]));
					}
					if (i_228_ >= 1 && i_228_ <= 3) {
						aShortArray3791[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3791[i_227_]);
						aShortArray3768[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3768[i_227_]);
						aShortArray3757[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3757[i_227_]);
						aShortArray3762[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3762[i_227_]);
						aShortArray3770[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3770[i_227_]);
						aShortArray3787[anInt3790] = (class37_sub4_sub7_sub4_225_.aShortArray3787[i_227_]);
						aByteArray3764[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3764[i_227_]);
						aByteArray3797[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3797[i_227_]);
						aByteArray3758[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3758[i_227_]);
					}
					if (i_228_ == 2) {
						aByteArray3766[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3766[i_227_]);
						aByteArray3786[anInt3790] = (class37_sub4_sub7_sub4_225_.aByteArray3786[i_227_]);
					}
					anInt3790++;
				}
			}
		}
	}

	public Class37_Sub4_Sub7_Sub4(
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_229_, boolean bool,
			boolean bool_230_, boolean bool_231_, boolean bool_232_) {
		anInt3775 = 0;
		anInt3802 = 0;
		anInt3802 = class37_sub4_sub7_sub4_229_.anInt3802;
		anInt3775 = class37_sub4_sub7_sub4_229_.anInt3775;
		anInt3790 = class37_sub4_sub7_sub4_229_.anInt3790;
		if (bool) {
			anIntArray3772 = class37_sub4_sub7_sub4_229_.anIntArray3772;
			anIntArray3784 = class37_sub4_sub7_sub4_229_.anIntArray3784;
			anIntArray3765 = class37_sub4_sub7_sub4_229_.anIntArray3765;
		} else {
			anIntArray3772 = new int[anInt3802];
			anIntArray3784 = new int[anInt3802];
			anIntArray3765 = new int[anInt3802];
			for (int i = 0; i < anInt3802; i++) {
				anIntArray3772[i] = class37_sub4_sub7_sub4_229_.anIntArray3772[i];
				anIntArray3784[i] = class37_sub4_sub7_sub4_229_.anIntArray3784[i];
				anIntArray3765[i] = class37_sub4_sub7_sub4_229_.anIntArray3765[i];
			}
		}
		if (bool_230_)
			aShortArray3773 = class37_sub4_sub7_sub4_229_.aShortArray3773;
		else {
			aShortArray3773 = new short[anInt3775];
			for (int i = 0; i < anInt3775; i++)
				aShortArray3773[i] = class37_sub4_sub7_sub4_229_.aShortArray3773[i];
		}
		if (bool_231_ || class37_sub4_sub7_sub4_229_.aShortArray3767 == null)
			aShortArray3767 = class37_sub4_sub7_sub4_229_.aShortArray3767;
		else {
			aShortArray3767 = new short[anInt3775];
			for (int i = 0; i < anInt3775; i++)
				aShortArray3767[i] = class37_sub4_sub7_sub4_229_.aShortArray3767[i];
		}
		if (bool_232_)
			aByteArray3777 = class37_sub4_sub7_sub4_229_.aByteArray3777;
		else {
			aByteArray3777 = new byte[anInt3775];
			if (class37_sub4_sub7_sub4_229_.aByteArray3777 == null) {
				for (int i = 0; i < anInt3775; i++)
					aByteArray3777[i] = (byte) 0;
			} else {
				for (int i = 0; i < anInt3775; i++)
					aByteArray3777[i] = class37_sub4_sub7_sub4_229_.aByteArray3777[i];
			}
		}
		anIntArray3763 = class37_sub4_sub7_sub4_229_.anIntArray3763;
		anIntArray3794 = class37_sub4_sub7_sub4_229_.anIntArray3794;
		anIntArray3803 = class37_sub4_sub7_sub4_229_.anIntArray3803;
		aByteArray3782 = class37_sub4_sub7_sub4_229_.aByteArray3782;
		aByteArray3774 = class37_sub4_sub7_sub4_229_.aByteArray3774;
		aByteArray3771 = class37_sub4_sub7_sub4_229_.aByteArray3771;
		aByte3788 = class37_sub4_sub7_sub4_229_.aByte3788;
		aByteArray3783 = class37_sub4_sub7_sub4_229_.aByteArray3783;
		aShortArray3791 = class37_sub4_sub7_sub4_229_.aShortArray3791;
		aShortArray3768 = class37_sub4_sub7_sub4_229_.aShortArray3768;
		aShortArray3757 = class37_sub4_sub7_sub4_229_.aShortArray3757;
		aShortArray3762 = class37_sub4_sub7_sub4_229_.aShortArray3762;
		aShortArray3770 = class37_sub4_sub7_sub4_229_.aShortArray3770;
		aShortArray3787 = class37_sub4_sub7_sub4_229_.aShortArray3787;
		aByteArray3764 = class37_sub4_sub7_sub4_229_.aByteArray3764;
		aByteArray3797 = class37_sub4_sub7_sub4_229_.aByteArray3797;
		aByteArray3758 = class37_sub4_sub7_sub4_229_.aByteArray3758;
		aByteArray3766 = class37_sub4_sub7_sub4_229_.aByteArray3766;
		aByteArray3786 = class37_sub4_sub7_sub4_229_.aByteArray3786;
		anIntArray3796 = class37_sub4_sub7_sub4_229_.anIntArray3796;
		anIntArray3761 = class37_sub4_sub7_sub4_229_.anIntArray3761;
		anIntArrayArray3801 = class37_sub4_sub7_sub4_229_.anIntArrayArray3801;
		anIntArrayArray3781 = class37_sub4_sub7_sub4_229_.anIntArrayArray3781;
		aClass89Array3759 = class37_sub4_sub7_sub4_229_.aClass89Array3759;
		aClass26Array3769 = class37_sub4_sub7_sub4_229_.aClass26Array3769;
		aClass89Array3756 = class37_sub4_sub7_sub4_229_.aClass89Array3756;
		aShort3760 = class37_sub4_sub7_sub4_229_.aShort3760;
		aShort3793 = class37_sub4_sub7_sub4_229_.aShort3793;
	}

	static {
		anInt3789 = 0;
		anIntArray3799 = Rasterizer.anIntArray3910;
		anIntArray3798 = Rasterizer.anIntArray3929;
		anIntArray3795 = new int[10000];
	}
}
