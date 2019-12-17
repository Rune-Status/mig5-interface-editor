package org.ie.client;

/* Class37_Sub4_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class37_Sub4_Sub9_Sub2 extends Graphics2D {
	public static int anInt3866;
	public static RSString aClass16_3867;
	public static RSString aClass16_3868 = Class37_Sub2.create_rsstring(
			")4u");
	public int[] anIntArray3869;
	public static RSString aClass16_3870 = Class37_Sub2.create_rsstring(
			"u=");
	public int[] aByteArray720;
	public static RSString aClass16_3872;
	public static RSString aClass16_3873;
	public static int anInt3874;
	public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array3875;
	public static int anInt3876;
	public static RSString aClass16_3877;
	public byte[][] aByteArrayArray3878;
	public static RSString aClass16_3879;
	public static RSString aClass16_3880;
	public static int anInt3881;
	public static int anInt3882;
	public static int anInt3883;
	public static int anInt3884;
	public static RSString aClass16_3885;
	public int anInt3886;
	public static int anInt3887;
	public int[] anIntArray3888;
	public int anInt727;
	public static RSString aClass16_3890;
	public int anInt3891;
	public static RSString[] aClass16Array3892;
	public static RSString aClass16_3893;
	public static int anInt3894;
	public int[] anIntArray3895;
	public static RSString aClass16_3896;
	public static RSString aClass16_3897;
	public static RSString aClass16_3898;
	public int[] anIntArray3899;
	public static RSString aClass16_3900;
	public byte[] aByteArrayArray711;
	public static int anInt3902;

	public int method599(RSString rSString, int[] is, RSString[] class16s) {
		if (rSString == null)
			return 0;
		int i = 0;
		int i_0_ = 0;
		RSString class16_1_ = Class37_Sub4_Sub7.method491(100, 0);
		int i_2_ = -1;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = -1;
		int i_6_ = -1;
		int i_7_ = 0;
		int i_8_ = rSString.length();
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			int i_10_ = rSString.charAt(i_9_);
			if (i_10_ == 60)
				i_5_ = i_9_;
			else {
				if (i_10_ == 62 && i_5_ != -1) {
					RSString class16_11_ = rSString
							.method169(0, i_5_ + 1, i_9_);
					i_5_ = -1;
					class16_1_.method154(0, 60);
					class16_1_.method157(class16_11_, -20035);
					class16_1_.method154(0, 62);
					if (class16_11_.equalsRSString(-127, aClass16_3872)) {
						class16s[i_7_++] = class16_1_.method169(0, i_0_,
								class16_1_.length());
						i_0_ = class16_1_.length();
						i = 0;
						i_2_ = -1;
						i_6_ = -1;
					} else if (class16_11_.equalsRSString(-107, aClass16_3893)) {
						i += method615(60);
						if (aByteArrayArray711 != null && i_6_ != -1)
							i += aByteArrayArray711[(i_6_ << 8) + 60];
						i_6_ = 60;
					} else if (class16_11_.equalsRSString(-106, aClass16_3873)) {
						i += method615(62);
						if (aByteArrayArray711 != null && i_6_ != -1)
							i += aByteArrayArray711[(i_6_ << 8) + 62];
						i_6_ = 62;
					} else if (class16_11_.method165(aClass16_3879, 52)) {
						try {
							int i_12_ = class16_11_.method158(4, -1).method175(
									8109);
							i += (aClass37_Sub4_Sub9_Sub1Array3875[i_12_].anInt3864);
							i_6_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_10_ = -1;
				}
				if (i_5_ == -1) {
					if (i_10_ != -1) {
						class16_1_.method154(0, i_10_);
						i += method615(i_10_);
						if (aByteArrayArray711 != null && i_6_ != -1)
							i += aByteArrayArray711[(i_6_ << 8) + i_10_];
						i_6_ = i_10_;
					}
					if (i_10_ == 32) {
						i_2_ = class16_1_.length();
						i_3_ = i;
						i_4_ = 1;
					}
					if (is != null
							&& i > is[i_7_ < is.length ? i_7_ : is.length - 1]
							&& i_2_ >= 0) {
						class16s[i_7_++] = class16_1_.method169(0, i_0_, i_2_
								- i_4_);
						i_0_ = i_2_;
						i_2_ = -1;
						i -= i_3_;
						i_6_ = -1;
					}
					if (i_10_ == 45) {
						i_2_ = class16_1_.length();
						i_3_ = i;
						i_4_ = 0;
					}
				}
			}
		}
		if (class16_1_.length() > i_0_)
			class16s[i_7_++] = class16_1_.method169(0, i_0_, class16_1_
					.length());
		return i_7_;
	}

	public void method600Old(byte[] is) {
		aByteArray720 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < aByteArray720.length; i++)
				aByteArray720[i] = is[i] & 0xff;
			anInt727 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_13_ = 0; i_13_ < 256; i_13_++)
				aByteArray720[i_13_] = is[i++] & 0xff;
			int[] is_14_ = new int[256];
			int[] is_15_ = new int[256];
			for (int i_16_ = 0; i_16_ < 256; i_16_++)
				is_14_[i_16_] = is[i++] & 0xff;
			for (int i_17_ = 0; i_17_ < 256; i_17_++)
				is_15_[i_17_] = is[i++] & 0xff;
			byte[][] is_18_ = new byte[256][];
			for (int i_19_ = 0; i_19_ < 256; i_19_++) {
				is_18_[i_19_] = new byte[is_14_[i_19_]];
				byte i_20_ = 0;
				for (int i_21_ = 0; i_21_ < is_18_[i_19_].length; i_21_++) {
					i_20_ += is[i++];
					is_18_[i_19_][i_21_] = i_20_;
				}
			}
			byte[][] is_22_ = new byte[256][];
			for (int i_23_ = 0; i_23_ < 256; i_23_++) {
				is_22_[i_23_] = new byte[is_14_[i_23_]];
				byte i_24_ = 0;
				for (int i_25_ = 0; i_25_ < is_22_[i_23_].length; i_25_++) {
					i_24_ += is[i++];
					is_22_[i_23_][i_25_] = i_24_;
				}
			}
			aByteArrayArray711 = new byte[65536];
			for (int i_26_ = 0; i_26_ < 256; i_26_++) {
				if (i_26_ != 32 && i_26_ != 160) {
					for (int i_27_ = 0; i_27_ < 256; i_27_++) {
						if (i_27_ != 32 && i_27_ != 160)
							aByteArrayArray711[(i_26_ << 8) + i_27_] = (byte) method625(
									is_18_, is_22_, is_15_, aByteArray720,
									is_14_, i_26_, i_27_);
					}
				}
			}
			anInt727 = is_15_[32] + is_14_[32];
		}
	}

	public void method600(byte[] data) {
		ByteVector stream = new ByteVector(data);
		int i = stream.getUnsignedByte();
		if (i != 0)
			throw new RuntimeException("");
		boolean bool = stream.getUnsignedByte() == 1;
		aByteArray720 = new int[256];
		stream.method1768(0, 256, (byte) -101, aByteArray720);
		if(bool) {
			int[] is = new int[256];
			int[] is_27_ = new int[256];
			for (int i_28_ = 0; i_28_ < 256; i_28_++)
				is[i_28_] = stream.getUnsignedByte();
			for (int i_29_ = 0; i_29_ < 256; i_29_++)
				is_27_[i_29_] = stream.getUnsignedByte();
			byte[][] is_30_ = new byte[256][];
			for (int i_31_ = 0; i_31_ < 256; i_31_++) {
				is_30_[i_31_] = new byte[is[i_31_]];
				byte i_32_ = 0;
				for (int i_33_ = 0; is_30_[i_31_].length > i_33_;
					 i_33_++) {
					i_32_ += stream.getSignedByte();
					is_30_[i_31_][i_33_] = i_32_;
				}
			}
			byte[][] is_34_ = new byte[256][];
			for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -257; i_35_++) {
				is_34_[i_35_] = new byte[is[i_35_]];
				byte i_36_ = 0;
				for (int i_37_ = 0; is_34_[i_35_].length > i_37_;
					 i_37_++) {
					i_36_ += stream.getSignedByte();
					is_34_[i_35_][i_37_] = i_36_;
				}
			}
			aByteArrayArray711 = new byte[65536];
			for (int i_26_ = 0; i_26_ < 256; i_26_++) {
				if (i_26_ != 32 && i_26_ != 160) {
					for (int i_27_ = 0; i_27_ < 256; i_27_++) {
						if (i_27_ != 32 && i_27_ != 160)
							aByteArrayArray711[(i_26_ << 8) + i_27_] = (byte) method625(is_30_, is_34_, is, aByteArray720, is_27_, i_26_, i_27_);
					}
				}
			}
			anInt727 = is[32] + is_27_[32];
		} else {
			anInt727 = stream.getUnsignedByte();
		}
		stream.getUnsignedByte();
		stream.getUnsignedByte();
		stream.getUnsignedByte();
		stream.getUnsignedByte();
	}

	public void method601(RSString rSString, int i, int i_28_, int i_29_,
			int i_30_, int i_31_, int i_32_) {
		if (rSString != null) {
			method602(i_29_, i_30_);
			double d = 7.0 - (double) i_32_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int[] is = new int[rSString.anInt1650];
			for (int i_33_ = 0; i_33_ < rSString.anInt1650; i_33_++)
				is[i_33_] = (int) (Math.sin((double) i_33_ / 1.5
						+ (double) i_31_) * d);
			method618(rSString, i - method617(rSString) / 2, i_28_, null, is);
		}
	}

	public void method602(int i, int i_34_) {
		anInt3876 = -1;
		anInt3902 = -1;
		anInt3881 = anInt3884 = i_34_;
		anInt3883 = anInt3874 = i;
		anInt3882 = anInt3866 = 256;
		anInt3887 = 0;
		anInt3894 = 0;
	}

	public void method603(RSString rSString, int i, int i_35_, int i_36_,
			int i_37_) {
		if (rSString != null) {
			method602(i_36_, i_37_);
			method611(rSString, i - method617(rSString), i_35_);
		}
	}

	public void method604(RSString rSString, int i, int i_38_, int i_39_,
			int i_40_, int i_41_) {
		if (rSString != null) {
			method602(i_39_, i_40_);
			int[] is = new int[rSString.anInt1650];
			for (int i_42_ = 0; i_42_ < rSString.anInt1650; i_42_++)
				is[i_42_] = (int) (Math.sin((double) i_42_ / 2.0
						+ (double) i_41_ / 5.0) * 5.0);
			method618(rSString, i - method617(rSString) / 2, i_38_, null, is);
		}
	}

	public static RSString method605(RSString rSString) {
		int i = rSString.length();
		int i_43_ = 0;
		for (int i_44_ = 0; i_44_ < i; i_44_++) {
			byte i_45_ = rSString.aByteArray1669[i_44_];
			if (i_45_ == 60 || i_45_ == 62)
				i_43_ += 3;
		}
		RSString class16_46_ = new RSString();
		class16_46_.anInt1650 = i + i_43_;
		class16_46_.aByteArray1669 = new byte[class16_46_.anInt1650];
		int i_47_ = 0;
		for (int i_48_ = 0; i_48_ < i; i_48_++) {
			byte i_49_ = rSString.aByteArray1669[i_48_];
			if (i_49_ == 60) {
				class16_46_.aByteArray1669[i_47_++] = (byte) 60;
				class16_46_.aByteArray1669[i_47_++] = (byte) 108;
				class16_46_.aByteArray1669[i_47_++] = (byte) 116;
				class16_46_.aByteArray1669[i_47_++] = (byte) 62;
			} else if (i_49_ == 62) {
				class16_46_.aByteArray1669[i_47_++] = (byte) 60;
				class16_46_.aByteArray1669[i_47_++] = (byte) 103;
				class16_46_.aByteArray1669[i_47_++] = (byte) 116;
				class16_46_.aByteArray1669[i_47_++] = (byte) 62;
			} else
				class16_46_.aByteArray1669[i_47_++] = i_49_;
		}
		return class16_46_;
	}

	public void method606(RSString rSString, int i, int i_50_, int i_51_,
			int i_52_) {
		if (rSString != null) {
			method602(i_51_, i_52_);
			method611(rSString, i - method617(rSString) / 2, i_50_);
		}
	}

	public void method607(RSString rSString, int i, int i_53_, int i_54_,
			int i_55_) {
		if (rSString != null) {
			method602(i_54_, i_55_);
			method611(rSString, i, i_53_);
		}
	}

	public void method608(RSString rSString, int i) {
		int i_56_ = 0;
		boolean bool = false;
		for (int i_57_ = 0; i_57_ < rSString.length(); i_57_++) {
			int i_58_ = rSString.charAt(i_57_);
			if (i_58_ == 60)
				bool = true;
			else if (i_58_ == 62)
				bool = false;
			else if (!bool && i_58_ == 32)
				i_56_++;
		}
		if (i_56_ > 0)
			anInt3887 = (i - method617(rSString) << 8) / i_56_;
	}

	public void method609(RSString rSString, int i, int i_59_, int i_60_,
			int i_61_, int i_62_) {
		if (rSString != null) {
			method602(i_60_, i_61_);
			int[] is = new int[rSString.anInt1650];
			int[] is_63_ = new int[rSString.anInt1650];
			for (int i_64_ = 0; i_64_ < rSString.anInt1650; i_64_++) {
				is[i_64_] = (int) (Math.sin((double) i_64_ / 5.0
						+ (double) i_62_ / 5.0) * 5.0);
				is_63_[i_64_] = (int) (Math.sin((double) i_64_ / 3.0
						+ (double) i_62_ / 5.0) * 5.0);
			}
			method618(rSString, i - method617(rSString) / 2, i_59_, is, is_63_);
		}
	}

	public int method610(RSString rSString, int i, int i_65_, int i_66_,
			int i_67_, Random random, int i_68_) {
		if (rSString == null)
			return 0;
		random.setSeed((long) i_68_);
		method624(i_66_, i_67_, 192 + (random.nextInt() & 0x1f));
		int[] is = new int[rSString.anInt1650];
		int i_69_ = 0;
		for (int i_70_ = 0; i_70_ < rSString.anInt1650; i_70_++) {
			is[i_70_] = i_69_;
			if ((random.nextInt() & 0x3) == 0)
				i_69_++;
		}
		method618(rSString, i, i_65_, is, null);
		return i_69_;
	}

	public void method611(RSString rSString, int i, int i_71_) {
		i_71_ -= anInt727;
		int i_72_ = -1;
		int i_73_ = -1;
		for (int i_74_ = 0; i_74_ < rSString.anInt1650; i_74_++) {
			int i_75_ = rSString.aByteArray1669[i_74_] & 0xff;
			if (i_75_ == 60)
				i_72_ = i_74_;
			else {
				if (i_75_ == 62 && i_72_ != -1) {
					RSString class16_76_ = rSString.method169(0, i_72_ + 1,
							i_74_);
					i_72_ = -1;
					if (class16_76_.equalsRSString(-98, aClass16_3893))
						i_75_ = 60;
					else if (class16_76_.equalsRSString(-89, aClass16_3873))
						i_75_ = 62;
					else {
						if (class16_76_.method165(aClass16_3879, 52)) {
							try {
								int i_77_ = class16_76_.method158(4, -1)
										.method175(8109);
								Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = aClass37_Sub4_Sub9_Sub1Array3875[i_77_];
								class37_sub4_sub9_sub1
										.method597(
												i,
												(i_71_ + anInt727 - class37_sub4_sub9_sub1.anInt3858));
								i += class37_sub4_sub9_sub1.anInt3864;
								i_73_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method627(class16_76_);
						continue;
					}
				}
				if (i_72_ == -1) {
					if (aByteArrayArray711 != null && i_73_ != -1)
						i += aByteArrayArray711[(i_73_ << 8) + i_75_];
					int i_78_ = anIntArray3869[i_75_];
					int i_79_ = anIntArray3899[i_75_];
					if (i_75_ != 32) {
						if (anInt3882 == 256) {
							if (anInt3881 != -1)
								method614(i_75_, i + anIntArray3895[i_75_] + 1,
										i_71_ + anIntArray3888[i_75_] + 1,
										i_78_, i_79_, anInt3881);
							method616(i_75_, i + anIntArray3895[i_75_], i_71_
									+ anIntArray3888[i_75_], i_78_, i_79_,
									anInt3883);
						} else {
							if (anInt3881 != -1)
								method626(i_75_, i + anIntArray3895[i_75_] + 1,
										i_71_ + anIntArray3888[i_75_] + 1,
										i_78_, i_79_, anInt3881, anInt3882);
							method621(i_75_, i + anIntArray3895[i_75_], i_71_
									+ anIntArray3888[i_75_], i_78_, i_79_,
									anInt3883, anInt3882);
						}
					} else if (anInt3887 > 0) {
						anInt3894 += anInt3887;
						i += anInt3894 >> 8;
						anInt3894 &= 0xff;
					}
					int i_80_ = aByteArray720[i_75_];
					if (anInt3876 != -1)
						Graphics2D.method580(i, i_71_
								+ (int) ((double) anInt727 * 0.7), i_80_,
								anInt3876);
					if (anInt3902 != -1)
						Graphics2D.method580(i, i_71_ + anInt727 + 1,
								i_80_, anInt3902);
					i += i_80_;
					i_73_ = i_75_;
				}
			}
		}
	}

	public int method612(RSString rSString, int i) {
		return method599(rSString, new int[] { i }, aClass16Array3892);
	}

	public static void method613() {
		aClass16_3893 = null;
		aClass16_3873 = null;
		aClass16_3879 = null;
		aClass16_3872 = null;
		aClass16_3880 = null;
		aClass16_3890 = null;
		aClass16_3870 = null;
		aClass16_3877 = null;
		aClass16_3868 = null;
		aClass16_3898 = null;
		aClass16_3897 = null;
		aClass16_3867 = null;
		aClass16_3896 = null;
		aClass16_3900 = null;
		aClass16_3885 = null;
		aClass37_Sub4_Sub9_Sub1Array3875 = null;
		aClass16Array3892 = null;
	}

	public void method614(int i, int i_81_, int i_82_, int i_83_, int i_84_,
			int i_85_) {
		int i_86_ = i_81_ + i_82_ * Graphics2D.width;
		int i_87_ = Graphics2D.width - i_83_;
		int i_88_ = 0;
		int i_89_ = 0;
		if (i_82_ < Graphics2D.anInt2663) {
			int i_90_ = Graphics2D.anInt2663 - i_82_;
			i_84_ -= i_90_;
			i_82_ = Graphics2D.anInt2663;
			i_89_ += i_90_ * i_83_;
			i_86_ += i_90_ * Graphics2D.width;
		}
		if (i_82_ + i_84_ > Graphics2D.anInt2664)
			i_84_ -= i_82_ + i_84_ - Graphics2D.anInt2664;
		if (i_81_ < Graphics2D.anInt2661) {
			int i_91_ = Graphics2D.anInt2661 - i_81_;
			i_83_ -= i_91_;
			i_81_ = Graphics2D.anInt2661;
			i_89_ += i_91_;
			i_86_ += i_91_;
			i_88_ += i_91_;
			i_87_ += i_91_;
		}
		if (i_81_ + i_83_ > Graphics2D.anInt2667) {
			int i_92_ = i_81_ + i_83_ - Graphics2D.anInt2667;
			i_83_ -= i_92_;
			i_88_ += i_92_;
			i_87_ += i_92_;
		}
		if (i_83_ > 0 && i_84_ > 0)
			method620(Graphics2D.pixels, aByteArrayArray3878[i],
					i_85_, i_89_, i_86_, i_83_, i_84_, i_87_, i_88_);
	}

	public int method615(int i) {
		return aByteArray720[i & 0xff];
	}

	public abstract void method616(int i, int i_93_, int i_94_, int i_95_,
			int i_96_, int i_97_);

	public int method617(RSString rSString) {
		if (rSString == null)
			return 0;
		int i = -1;
		int i_98_ = -1;
		int i_99_ = 0;
		for (int i_100_ = 0; i_100_ < rSString.anInt1650; i_100_++) {
			int i_101_ = rSString.aByteArray1669[i_100_] & 0xff;
			if (i_101_ == 60)
				i = i_100_;
			else {
				if (i_101_ == 62 && i != -1) {
					RSString class16_102_ = rSString
							.method169(0, i + 1, i_100_);
					i = -1;
					if (class16_102_.equalsRSString(-77, aClass16_3893))
						i_101_ = 60;
					else if (class16_102_.equalsRSString(-98, aClass16_3873))
						i_101_ = 62;
					else {
						if (class16_102_.method165(aClass16_3879, 52)) {
							try {
								int i_103_ = class16_102_.method158(4, -1)
										.method175(8109);
								i_99_ += (aClass37_Sub4_Sub9_Sub1Array3875[i_103_].anInt3864);
								i_98_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_99_ += aByteArray720[i_101_];
					if (aByteArrayArray711 != null && i_98_ != -1)
						i_99_ += aByteArrayArray711[(i_98_ << 8) + i_101_];
					i_98_ = i_101_;
				}
			}
		}
		return i_99_;
	}

	public void method618(RSString rSString, int i, int i_104_, int[] is,
			int[] is_105_) {
		i_104_ -= anInt727;
		int i_106_ = -1;
		int i_107_ = -1;
		int i_108_ = 0;
		for (int i_109_ = 0; i_109_ < rSString.anInt1650; i_109_++) {
			int i_110_ = rSString.aByteArray1669[i_109_] & 0xff;
			if (i_110_ == 60)
				i_106_ = i_109_;
			else {
				if (i_110_ == 62 && i_106_ != -1) {
					RSString class16_111_ = rSString.method169(0, i_106_ + 1,
							i_109_);
					i_106_ = -1;
					if (class16_111_.equalsRSString(-118, aClass16_3893))
						i_110_ = 60;
					else if (class16_111_.equalsRSString(-89, aClass16_3873))
						i_110_ = 62;
					else {
						if (class16_111_.method165(aClass16_3879, 52)) {
							try {
								int i_112_;
								if (is != null)
									i_112_ = is[i_108_];
								else
									i_112_ = 0;
								int i_113_;
								if (is_105_ != null)
									i_113_ = is_105_[i_108_];
								else
									i_113_ = 0;
								i_108_++;
								int i_114_ = class16_111_.method158(4, -1)
										.method175(8109);
								Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = aClass37_Sub4_Sub9_Sub1Array3875[i_114_];
								class37_sub4_sub9_sub1
										.method597(
												i + i_112_,
												(i_104_
														+ anInt727
														- class37_sub4_sub9_sub1.anInt3858 + i_113_));
								i += class37_sub4_sub9_sub1.anInt3864;
								i_107_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method627(class16_111_);
						continue;
					}
				}
				if (i_106_ == -1) {
					if (aByteArrayArray711 != null && i_107_ != -1)
						i += aByteArrayArray711[(i_107_ << 8) + i_110_];
					int i_115_ = anIntArray3869[i_110_];
					int i_116_ = anIntArray3899[i_110_];
					int i_117_;
					if (is != null)
						i_117_ = is[i_108_];
					else
						i_117_ = 0;
					int i_118_;
					if (is_105_ != null)
						i_118_ = is_105_[i_108_];
					else
						i_118_ = 0;
					i_108_++;
					if (i_110_ != 32) {
						if (anInt3882 == 256) {
							if (anInt3881 != -1)
								method614(i_110_, (i + anIntArray3895[i_110_]
										+ 1 + i_117_), (i_104_
										+ anIntArray3888[i_110_] + 1 + i_118_),
										i_115_, i_116_, anInt3881);
							method616(i_110_, i + anIntArray3895[i_110_]
									+ i_117_, i_104_ + anIntArray3888[i_110_]
									+ i_118_, i_115_, i_116_, anInt3883);
						} else {
							if (anInt3881 != -1)
								method626(i_110_, (i + anIntArray3895[i_110_]
										+ 1 + i_117_), (i_104_
										+ anIntArray3888[i_110_] + 1 + i_118_),
										i_115_, i_116_, anInt3881, anInt3882);
							method621(i_110_, i + anIntArray3895[i_110_]
									+ i_117_, i_104_ + anIntArray3888[i_110_]
									+ i_118_, i_115_, i_116_, anInt3883,
									anInt3882);
						}
					} else if (anInt3887 > 0) {
						anInt3894 += anInt3887;
						i += anInt3894 >> 8;
						anInt3894 &= 0xff;
					}
					int i_119_ = aByteArray720[i_110_];
					if (anInt3876 != -1)
						Graphics2D.method580(i, i_104_
								+ (int) ((double) anInt727 * 0.7), i_119_,
								anInt3876);
					if (anInt3902 != -1)
						Graphics2D.method580(i, i_104_ + anInt727,
								i_119_, anInt3902);
					i += i_119_;
					i_107_ = i_110_;
				}
			}
		}
	}

	public int method619(RSString rSString, int i, int i_120_, int i_121_,
			int i_122_, int i_123_, int i_124_, int i_125_, int i_126_,
			int i_127_) {
		return method623(rSString, i, i_120_, i_121_, i_122_, i_123_, i_124_,
				256, i_125_, i_126_, i_127_);
	}

	public static void method620(int[] is, byte[] is_128_, int i, int i_129_,
			int i_130_, int i_131_, int i_132_, int i_133_, int i_134_) {
		int i_135_ = -(i_131_ >> 2);
		i_131_ = -(i_131_ & 0x3);
		for (int i_136_ = -i_132_; i_136_ < 0; i_136_++) {
			for (int i_137_ = i_135_; i_137_ < 0; i_137_++) {
				if (is_128_[i_129_++] != 0)
					is[i_130_++] = i;
				else
					i_130_++;
				if (is_128_[i_129_++] != 0)
					is[i_130_++] = i;
				else
					i_130_++;
				if (is_128_[i_129_++] != 0)
					is[i_130_++] = i;
				else
					i_130_++;
				if (is_128_[i_129_++] != 0)
					is[i_130_++] = i;
				else
					i_130_++;
			}
			for (int i_138_ = i_131_; i_138_ < 0; i_138_++) {
				if (is_128_[i_129_++] != 0)
					is[i_130_++] = i;
				else
					i_130_++;
			}
			i_130_ += i_133_;
			i_129_ += i_134_;
		}
	}

	public abstract void method621(int i, int i_139_, int i_140_, int i_141_,
			int i_142_, int i_143_, int i_144_);

	public static void method622(int[] is, byte[] is_145_, int i, int i_146_,
			int i_147_, int i_148_, int i_149_, int i_150_, int i_151_,
			int i_152_) {
		i = ((i & 0xff00ff) * i_152_ & ~0xff00ff)
				+ ((i & 0xff00) * i_152_ & 0xff0000) >> 8;
		i_152_ = 256 - i_152_;
		for (int i_153_ = -i_149_; i_153_ < 0; i_153_++) {
			for (int i_154_ = -i_148_; i_154_ < 0; i_154_++) {
				if (is_145_[i_146_++] != 0) {
					int i_155_ = is[i_147_];
					is[i_147_++] = ((((i_155_ & 0xff00ff) * i_152_ & ~0xff00ff) + ((i_155_ & 0xff00)
							* i_152_ & 0xff0000)) >> 8)
							+ i;
				} else
					i_147_++;
			}
			i_147_ += i_150_;
			i_146_ += i_151_;
		}
	}

	public int method623(RSString rSString, int i, int i_156_, int i_157_,
			int i_158_, int i_159_, int i_160_, int i_161_, int i_162_,
			int i_163_, int i_164_) {
		if (rSString == null)
			return 0;
		method624(i_159_, i_160_, i_161_);
		if (i_164_ == 0)
			i_164_ = anInt727;
		int[] is = { i_157_ };
		if (i_158_ < anInt3886 + anInt3891 + i_164_ && i_158_ < i_164_ + i_164_)
			is = null;
		int i_165_ = method599(rSString, is, aClass16Array3892);
		if (i_163_ == 3 && i_165_ == 1)
			i_163_ = 1;
		int i_166_;
		if (i_163_ == 0)
			i_166_ = i_156_ + anInt3886;
		else if (i_163_ == 1)
			i_166_ = i_156_ + anInt3886
					+ (i_158_ - anInt3886 - anInt3891 - (i_165_ - 1) * i_164_)
					/ 2;
		else if (i_163_ == 2)
			i_166_ = i_156_ + i_158_ - anInt3891 - (i_165_ - 1) * i_164_;
		else {
			int i_167_ = ((i_158_ - anInt3886 - anInt3891 - (i_165_ - 1)
					* i_164_) / (i_165_ + 1));
			if (i_167_ < 0)
				i_167_ = 0;
			i_166_ = i_156_ + anInt3886 + i_167_;
			i_164_ += i_167_;
		}
		for (int i_168_ = 0; i_168_ < i_165_; i_168_++) {
			if (i_162_ == 0)
				method611(aClass16Array3892[i_168_], i, i_166_);
			else if (i_162_ == 1)
				method611(
						aClass16Array3892[i_168_],
						i
								+ ((i_157_ - method617(aClass16Array3892[i_168_])) / 2),
						i_166_);
			else if (i_162_ == 2)
				method611(aClass16Array3892[i_168_], i + i_157_
						- method617(aClass16Array3892[i_168_]), i_166_);
			else if (i_168_ == i_165_ - 1)
				method611(aClass16Array3892[i_168_], i, i_166_);
			else {
				method608(aClass16Array3892[i_168_], i_157_);
				method611(aClass16Array3892[i_168_], i, i_166_);
				anInt3887 = 0;
			}
			i_166_ += i_164_;
		}
		return i_165_;
	}

	public void method624(int i, int i_169_, int i_170_) {
		anInt3876 = -1;
		anInt3902 = -1;
		anInt3881 = anInt3884 = i_169_;
		anInt3883 = anInt3874 = i;
		anInt3882 = anInt3866 = i_170_;
		anInt3887 = 0;
		anInt3894 = 0;
	}

	public static int method625(byte[][] is, byte[][] is_171_, int[] is_172_,
			int[] is_173_, int[] is_174_, int i, int i_175_) {
		int i_176_ = is_172_[i];
		int i_177_ = i_176_ + is_174_[i];
		int i_178_ = is_172_[i_175_];
		int i_179_ = i_178_ + is_174_[i_175_];
		int i_180_ = i_176_;
		if (i_178_ > i_176_)
			i_180_ = i_178_;
		int i_181_ = i_177_;
		if (i_179_ < i_177_)
			i_181_ = i_179_;
		int i_182_ = is_173_[i];
		if (is_173_[i_175_] < i_182_)
			i_182_ = is_173_[i_175_];
		byte[] is_183_ = is_171_[i];
		byte[] is_184_ = is[i_175_];
		int i_185_ = i_180_ - i_176_;
		int i_186_ = i_180_ - i_178_;
		for (int i_187_ = i_180_; i_187_ < i_181_; i_187_++) {
			int i_188_ = is_183_[i_185_++] + is_184_[i_186_++];
			if (i_188_ < i_182_)
				i_182_ = i_188_;
		}
		return -i_182_;
	}

	public void method626(int i, int i_189_, int i_190_, int i_191_,
			int i_192_, int i_193_, int i_194_) {
		int i_195_ = i_189_ + i_190_ * Graphics2D.width;
		int i_196_ = Graphics2D.width - i_191_;
		int i_197_ = 0;
		int i_198_ = 0;
		if (i_190_ < Graphics2D.anInt2663) {
			int i_199_ = Graphics2D.anInt2663 - i_190_;
			i_192_ -= i_199_;
			i_190_ = Graphics2D.anInt2663;
			i_198_ += i_199_ * i_191_;
			i_195_ += i_199_ * Graphics2D.width;
		}
		if (i_190_ + i_192_ > Graphics2D.anInt2664)
			i_192_ -= i_190_ + i_192_ - Graphics2D.anInt2664;
		if (i_189_ < Graphics2D.anInt2661) {
			int i_200_ = Graphics2D.anInt2661 - i_189_;
			i_191_ -= i_200_;
			i_189_ = Graphics2D.anInt2661;
			i_198_ += i_200_;
			i_195_ += i_200_;
			i_197_ += i_200_;
			i_196_ += i_200_;
		}
		if (i_189_ + i_191_ > Graphics2D.anInt2667) {
			int i_201_ = i_189_ + i_191_ - Graphics2D.anInt2667;
			i_191_ -= i_201_;
			i_197_ += i_201_;
			i_196_ += i_201_;
		}
		if (i_191_ > 0 && i_192_ > 0)
			method622(Graphics2D.pixels, aByteArrayArray3878[i],
					i_193_, i_198_, i_195_, i_191_, i_192_, i_196_, i_197_,
					i_194_);
	}

	public Class37_Sub4_Sub9_Sub2(byte[] is, int[] is_202_, int[] is_203_,
			int[] is_204_, int[] is_205_, int[] is_206_, byte[][] is_207_) {
		aByteArrayArray3878 = new byte[256][];
		anInt727 = 0;
		anIntArray3895 = is_202_;
		anIntArray3888 = is_203_;
		anIntArray3869 = is_204_;
		anIntArray3899 = is_205_;
		method600(is);
		aByteArrayArray3878 = is_207_;
		int i = 2147483647;
		int i_208_ = -2147483648;
		for (int i_209_ = 0; i_209_ < 256; i_209_++) {
			if (anIntArray3888[i_209_] < i && anIntArray3899[i_209_] != 0)
				i = anIntArray3888[i_209_];
			if (anIntArray3888[i_209_] + anIntArray3899[i_209_] > i_208_)
				i_208_ = anIntArray3888[i_209_] + anIntArray3899[i_209_];
		}
		anInt3886 = anInt727 - i;
		anInt3891 = i_208_ - anInt727;
	}

	public void method627(RSString rSString) {
		do {
			try {
				if (rSString.method165(aClass16_3880, 52))
					anInt3883 = rSString.method158(4, -1).method155(1037, 16);
				else if (rSString.equalsRSString(-88, aClass16_3890))
					anInt3883 = anInt3874;
				else if (rSString.method165(aClass16_3896, 52))
					anInt3876 = rSString.method158(4, -1).method155(1037, 16);
				else if (rSString.equalsRSString(-79, aClass16_3900))
					anInt3876 = 8388608;
				else if (rSString.equalsRSString(-99, aClass16_3885))
					anInt3876 = -1;
				else if (rSString.method165(aClass16_3870, 52))
					anInt3902 = rSString.method158(2, -1).method155(1037, 16);
				else if (rSString.equalsRSString(-99, aClass16_3877))
					anInt3902 = 0;
				else if (rSString.equalsRSString(-128, aClass16_3868))
					anInt3902 = -1;
				else if (rSString.method165(aClass16_3898, 52))
					anInt3881 = rSString.method158(5, -1).method155(1037, 16);
				else if (rSString.equalsRSString(-122, aClass16_3897))
					anInt3881 = 0;
				else if (rSString.equalsRSString(-101, aClass16_3867))
					anInt3881 = anInt3884;
				else {
					if (!rSString.equalsRSString(-89, aClass16_3872))
						break;
					method624(anInt3874, anInt3884, anInt3866);
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}

	public int method628(RSString rSString, int i) {
		int i_210_ = method599(rSString, new int[] { i }, aClass16Array3892);
		int i_211_ = 0;
		for (int i_212_ = 0; i_212_ < i_210_; i_212_++) {
			int i_213_ = method617(aClass16Array3892[i_212_]);
			if (i_213_ > i_211_)
				i_211_ = i_213_;
		}
		return i_211_;
	}

	public Class37_Sub4_Sub9_Sub2(byte[] is) {
		aByteArrayArray3878 = new byte[256][];
		anInt727 = 0;
		anInt727 = 0;
		method600(is);
	}

	static {
		anInt3866 = 256;
		anInt3882 = 256;
		aClass16_3885 = Class37_Sub2.create_rsstring(")4str");
		anInt3887 = 0;
		anInt3884 = -1;
		aClass16_3867 = Class37_Sub2.create_rsstring(")4shad");
		aClass16_3890 = Class37_Sub2.create_rsstring(")4col");
		anInt3881 = -1;
		aClass16_3872 = Class37_Sub2.create_rsstring("br");
		aClass16_3893 = Class37_Sub2.create_rsstring("lt");
		aClass16_3896 = Class37_Sub2.create_rsstring("str=");
		anInt3894 = 0;
		aClass16_3879 = Class37_Sub2.create_rsstring("img=");
		aClass16_3873 = Class37_Sub2.create_rsstring("gt");
		aClass16_3898 = Class37_Sub2.create_rsstring("shad=");
		aClass16_3880 = Class37_Sub2.create_rsstring("col=");
		anInt3876 = -1;
		anInt3874 = 0;
		anInt3883 = 0;
		aClass16_3897 = Class37_Sub2.create_rsstring("shad");
		anInt3902 = -1;
		aClass16_3877 = Class37_Sub2.create_rsstring("u");
		aClass16_3900 = Class37_Sub2.create_rsstring("str");
		aClass16Array3892 = new RSString[100];
	}
}
