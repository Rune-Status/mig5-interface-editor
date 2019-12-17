package org.ie.client;

/* Class37_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class37_Sub15 extends Node {
	public static RSString aClass16_2130;
	public static int anInt2131;
	public static int anInt2132;
	public static int anInt2133;
	public static RSString aClass16_2134 = Class37_Sub2.create_rsstring(
			"Bitte benutzen Sie eine andere Welt)3");
	public byte[] aByteArray2135;
	public byte[] aByteArray2136;
	public static int anInt2137;
	public Class37_Sub22_Sub1[] aClass37_Sub22_Sub1Array2138;
	public int anInt2139;
	public static int anInt2140;
	public static RSString aClass16_2141 = Class37_Sub2.create_rsstring(
			"Benutzen");
	public static int anInt2142;
	public static int anInt2143;
	public byte[] aByteArray2144;
	public Class66[] aClass66Array2145;
	public int[] anIntArray2146;
	public short[] aShortArray2147;

	public boolean method1004(byte[] is, int[] is_0_, int i, Class73 class73) {
		try {
			anInt2140++;
			boolean bool = true;
			int i_1_ = 0;
			Class37_Sub22_Sub1 class37_sub22_sub1 = null;
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -129; i_2_++) {
				if (is == null || is[i_2_] != 0) {
					int i_3_ = anIntArray2146[i_2_];
					if (i_3_ != 0) {
						if (i_1_ != i_3_) {
							i_1_ = i_3_;
							if ((--i_3_ & 0x1 ^ 0xffffffff) == -1)
								class37_sub22_sub1 = class73.method1277(
										i_3_ >> -606188094, is_0_, (byte) 111);
							else
								class37_sub22_sub1 = class73.method1275(is_0_,
										1023, i_3_ >> 711983042);
							if (class37_sub22_sub1 == null)
								bool = false;
						}
						if (class37_sub22_sub1 != null) {
							aClass37_Sub22_Sub1Array2138[i_2_] = class37_sub22_sub1;
							anIntArray2146[i_2_] = 0;
						}
					}
				}
			}
			int i_4_ = 124 % ((i - -32) / 34);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("nc.A("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_0_ != null ? "{...}" : "null") + ',' + i + ','
					+ (class73 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method1005(int i) {
		if (i != -65)
			aClass66Array2145 = null;
		anIntArray2146 = null;
		anInt2142++;
	}

	public static void method1006(boolean bool) {
		aClass16_2134 = null;
		aClass16_2141 = null;
		if (bool == true)
			aClass16_2130 = null;
	}

	public static void method1007(long l, int i) {
		try {
			try {
				if (i != 256)
					return;
				Thread.sleep(l);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			anInt2137++;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("nc.E("
					+ l + ',' + i + ')'));
		}
	}

	public static void method1008(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt2133++;
		Graphics2D.setBounds(i_8_, i_7_, i_8_ - -i_6_, i_7_ - -i);
		Rasterizer.initDefaultOffsets();
		Class73.anInt1388++;
		//Class84.method1316(true, true);
		//Class82.method1310(i_5_ + -4332, true);
		//Class84.method1316(true, false);
		//Class82.method1310(54, false);
		//Class37_Sub9_Sub27.method879(-1);
		//Class37_Sub9_Sub29.method891((byte) 83);
		/*if (!Class37_Sub4_Sub12.aBoolean2775) {
			int i_9_ = 0x7ff & Class83.anInt1518 + Class37_Sub14.anInt2127;
			int i_10_ = Class76.anInt1439;
			if ((i_10_ ^ 0xffffffff) > (Class37_Sub9_Sub8.anInt3051 / 256 ^ 0xffffffff))
				i_10_ = Class37_Sub9_Sub8.anInt3051 / 256;
			if (Class37_Sub9_Sub30.aBooleanArray3477[4]
					&& i_10_ < 128 + Class82.anIntArray1702[4])
				i_10_ = 128 + Class82.anIntArray1702[4];
			Class37_Sub9_Sub22
					.method858(
							52,
							i_10_ * 3 + 600,
							anInt2132,
							Class37_Sub9_Sub23.anInt3356,
							RSString
									.method153(
											Class37_Sub9_Sub1.anInt2916,
											i_5_ ^ ~0xa1a5f60,
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642),
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666)) - 50,
							i_10_, i_9_);
		}
		int i_11_;
		if (!Class37_Sub4_Sub12.aBoolean2775)
			i_11_ = Class37_Sub4_Sub7_Sub1_Sub1.method503((byte) 41);
		else
			i_11_ = Class37_Sub9_Sub21.method854((byte) 52);*/
		int i_12_ = Class19.anInt483;
		int i_13_ = Class37_Sub4_Sub7_Sub1_Sub2.anInt3969;
		int i_14_ = OverridedInterface.anInt1888;
		int i_15_ = Class37_Sub17.anInt2188;
		int i_16_ = Class37_Sub25.anInt2286;
		for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -6; i_17_++) {
			if (Class37_Sub9_Sub30.aBooleanArray3477[i_17_]) {
				int i_18_ = (int) ((Math.random() * (double) (1 + 2 * (Class37_Sub9_Sub4.anIntArray2982[i_17_])))
						- (double) Class37_Sub9_Sub4.anIntArray2982[i_17_] + (Math
						.sin((double) Deque.anIntArray1126[i_17_]
								* ((double) (Cache.anIntArray1229[i_17_]) / 100.0)) * (double) Class82.anIntArray1702[i_17_]));
				if (i_17_ == 0)
					Class19.anInt483 += i_18_;
				if ((i_17_ ^ 0xffffffff) == -5) {
					Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 += i_18_;
					if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < 128)
						Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 128;
					if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 > 383)
						Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 383;
				}
				if (i_17_ == 1)
					Class37_Sub25.anInt2286 += i_18_;
				if ((i_17_ ^ 0xffffffff) == -4)
					Class37_Sub17.anInt2188 = 0x7ff & Class37_Sub17.anInt2188
							+ i_18_;
				if (i_17_ == 2)
					OverridedInterface.anInt1888 += i_18_;
			}
		}
		int i_19_ = Class37_Sub9_Sub1.lastMouseY;
		int i_20_ = Class37_Sub4_Sub7_Sub7.lastMouseX;
		if ((i_20_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff) || i_8_ + i_6_ <= i_20_
				|| (i_7_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff)
				|| i_19_ >= i_7_ + i) {
			Class37_Sub4_Sub7_Sub6_Sub1.anInt4019 = 0;
			Class37_Sub4_Sub7_Sub6_Sub1.aBoolean4039 = false;
		} else {
			Class37_Sub4_Sub7_Sub6_Sub1.anInt4019 = 0;
			Class37_Sub4_Sub7_Sub6_Sub1.aBoolean4039 = true;
			Class37_Sub4_Sub7_Sub6_Sub1.anInt4024 = -i_7_
					+ Class37_Sub9_Sub1.lastMouseY;
			Class37_Sub4_Sub7_Sub6_Sub1.anInt4037 = -i_8_
					+ Class37_Sub4_Sub7_Sub7.lastMouseX;
		}
		Class72.method1267(2);
		Graphics2D.method578(i_8_, i_7_, i_6_, i, 0);
		Class72.method1267(i_5_ ^ 0x1158);
		//Class38.aClass67_847.method1208(Class19.anInt483,
		//		Class37_Sub25.anInt2286, Class37_Sub6.anInt1888,
		//		Class37_Sub4_Sub7_Sub1_Sub2.anInt3969, Class37_Sub17.anInt2188,
		//		i_11_);
		Class72.method1267(i_5_ ^ 0x1158);
		Class38.aClass67_847.method1224();
		InterfaceListener.method745(i_7_, i_8_, i, -4, i_6_);
		Class42.method1075(i_7_, (byte) -126, i_8_);
		((Class82) Rasterizer.anInterface3_3926).method1306(
				Class37_Sub9_Sub37.anInt3589, false);
		Class37_Sub7.method741(i, i_7_, -124, i_8_, i_6_);
		OverridedInterface.anInt1888 = i_14_;
		Class37_Sub25.anInt2286 = i_16_;
		Class37_Sub17.anInt2188 = i_15_;
		Class19.anInt483 = i_12_;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = i_13_;
		if (Class10.aBoolean197
				&& Class43.method1091((byte) 113, true, false) == 0)
			Class10.aBoolean197 = false;
		if (i_5_ != 4442)
			anInt2132 = -56;
		if (Class10.aBoolean197) {
			Graphics2D.method578(i_8_, i_7_, i_6_, i, 0);
			//Class79.method1298(Class37_Sub4_Sub18.aClass16_2908, false, i_5_
			//		+ -4441);
		}
		if (!Class10.aBoolean197 && !Class37_Sub20.menu_open
				&& i_8_ <= i_20_ && i_6_ + i_8_ > i_20_ && i_7_ <= i_19_
				&& i_7_ + i > i_19_)
			Class39.method1062(i_8_, i_7_, 0, i_20_, i_19_);
	}

	public static void method1009(Class15 class15, Component component, int i,
			Class15 class15_21_) {
		try {
			anInt2131++;
			if (!Class79.aBoolean1488) {
				Graphics2D.method579();
				byte[] is = class15_21_.method126((byte) 108,
						Class37_Sub9_Sub21.aClass16_3312,
						Class37_Sub9_Sub33.aClass16_3524);
				if (i == -3473) {
					Class42.aClass37_Sub4_Sub9_Sub3_923 = new Sprite(
							is, component);
					Class14.aClass37_Sub4_Sub9_Sub3_238 = Class42.aClass37_Sub4_Sub9_Sub3_923
							.method648();
					Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320 = Class30
							.method277(Class37_Sub9_Sub33.aClass16_3524, i
									+ -1094014879, Class50.aClass16_1013,
									class15);
					Class42.aClass37_Sub4_Sub9_Sub1_925 = Class30.method277(
							Class37_Sub9_Sub33.aClass16_3524, -1094018352,
							Class4.aClass16_105, class15);
					Class46.aClass37_Sub4_Sub9_Sub1_987 = Class30.method277(
							Class37_Sub9_Sub33.aClass16_3524, -1094018352,
							Class37_Sub9_Sub19.aClass16_3269, class15);
					Class37_Sub9_Sub33.aClass37_Sub4_Sub9_Sub1Array3523 = Class46
							.method1104(class15,
									Class37_Sub9_Sub33.aClass16_3524,
									i + 1000003472, Class32.aClass16_730);
					Class37_Sub4_Sub7_Sub7.aClass37_Sub4_Sub9_Sub1Array3853 = Class46
							.method1104(class15,
									Class37_Sub9_Sub33.aClass16_3524,
									999999999, Class37_Sub9_Sub21.aClass16_3319);
					Class37_Sub9_Sub28.anIntArray3428 = new int[256];
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -65; i_22_++)
						Class37_Sub9_Sub28.anIntArray3428[i_22_] = i_22_ * 262144;
					for (int i_23_ = 0; i_23_ < 64; i_23_++)
						Class37_Sub9_Sub28.anIntArray3428[64 + i_23_] = 16711680 - -(i_23_ * 1024);
					for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -65; i_24_++)
						Class37_Sub9_Sub28.anIntArray3428[i_24_ - -128] = 4 * i_24_ + 16776960;
					for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -65; i_25_++)
						Class37_Sub9_Sub28.anIntArray3428[i_25_ + 192] = 16777215;
					Class37_Sub9.anIntArray1951 = new int[256];
					for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -65; i_26_++)
						Class37_Sub9.anIntArray1951[i_26_] = 1024 * i_26_;
					for (int i_27_ = 0; i_27_ < 64; i_27_++)
						Class37_Sub9.anIntArray1951[i_27_ + 64] = i_27_ * 4 + 65280;
					for (int i_28_ = 0; i_28_ < 64; i_28_++)
						Class37_Sub9.anIntArray1951[i_28_ - -128] = 65535 - -(i_28_ * 262144);
					for (int i_29_ = 0; i_29_ < 64; i_29_++)
						Class37_Sub9.anIntArray1951[i_29_ + 192] = 16777215;
					Class37_Sub9_Sub33.anIntArray3519 = new int[256];
					for (int i_30_ = 0; i_30_ < 64; i_30_++)
						Class37_Sub9_Sub33.anIntArray3519[i_30_] = 4 * i_30_;
					for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -65; i_31_++)
						Class37_Sub9_Sub33.anIntArray3519[i_31_ - -64] = 255 + 262144 * i_31_;
					for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -65; i_32_++)
						Class37_Sub9_Sub33.anIntArray3519[i_32_ + 128] = i_32_ * 1024 + 16711935;
					for (int i_33_ = 0; i_33_ < 64; i_33_++)
						Class37_Sub9_Sub33.anIntArray3519[i_33_ + 192] = 16777215;
					Class27.anIntArray677 = new int[32768];
					Class22.anIntArray585 = new int[256];
					Class37_Sub9_Sub16.anIntArray3199 = new int[32768];
					Class47.method1109(-4999, null);
					//Class37_Sub9_Sub33.aClass16_3526 = Class37_Sub9_Sub33.aClass16_3524;
					Class37_Sub4_Sub13.aBoolean2799 = false;
					if ((Class37_Sub9_Sub17.anInt3223 ^ 0xffffffff) != -1)
						Class52.aBoolean1050 = false;
					else
						Class52.aBoolean1050 = true;
					Class52_Sub1.anIntArray2298 = new int[32768];
					RSInterface.anInt339 = 0;
					//Class37_Sub9_Sub33.aClass16_3525 = Class37_Sub9_Sub33.aClass16_3524;
					Class33.anIntArray754 = new int[32768];
					if (Class52.aBoolean1050)
						Canvas_Sub1.method37(i ^ 0xdf8, 2);
					else
						Class41.method1074(Class54.aClass15_Sub1_1060, 2,
								false, Class37_Sub9_Sub33.aClass16_3524,
								RSItem.aClass16_2508, 32, 255);
					NodeSub.method437(i ^ ~0xd07, false);
					Class79.aBoolean1488 = true;
					Class42.aClass37_Sub4_Sub9_Sub3_923.method652(0, 0);
					Class14.aClass37_Sub4_Sub9_Sub3_238.method652(382, 0);
					Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320
							.method597(
									382 + -((Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.anInt3865) / 2),
									18);
					Class56.aClass37_Sub4_Sub9_Sub3_1095 = new Sprite(
							128, 254);
					Class64.aClass37_Sub4_Sub9_Sub3_1212 = new Sprite(
							128, 254);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("nc.C("
					+ (class15 != null ? "{...}" : "null") + ','
					+ (component != null ? "{...}" : "null") + ',' + i + ','
					+ (class15_21_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class37_Sub15() {
		/* empty */
	}

	public Class37_Sub15(byte[] is) {
		aByteArray2135 = new byte[128];
		anIntArray2146 = new int[128];
		aByteArray2144 = new byte[128];
		aClass37_Sub22_Sub1Array2138 = new Class37_Sub22_Sub1[128];
		aByteArray2136 = new byte[128];
		aClass66Array2145 = new Class66[128];
		int i = 0;
		aShortArray2147 = new short[128];
		ByteVector class37_sub11;
		for (class37_sub11 = new ByteVector(is); class37_sub11.buf[i
				+ class37_sub11.pos] != 0; i++) {
			/* empty */
		}
		byte[] is_34_ = new byte[i];
		for (int i_35_ = 0; (i ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++)
			is_34_[i_35_] = class37_sub11.method982((byte) 113);
		i++;
		int i_36_ = 0;
		class37_sub11.pos++;
		int i_37_ = class37_sub11.pos;
		for (class37_sub11.pos += i; ((class37_sub11.buf[i_36_
				+ class37_sub11.pos] ^ 0xffffffff) != -1); i_36_++) {
			/* empty */
		}
		byte[] is_38_ = new byte[i_36_];
		for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_39_++)
			is_38_[i_39_] = class37_sub11.method982((byte) 106);
		i_36_++;
		class37_sub11.pos++;
		int i_40_ = class37_sub11.pos;
		int i_41_ = 0;
		for (class37_sub11.pos += i_36_; ((class37_sub11.buf[i_41_
				+ class37_sub11.pos] ^ 0xffffffff) != -1); i_41_++) {
			/* empty */
		}
		byte[] is_42_ = new byte[i_41_];
		for (int i_43_ = 0; i_41_ > i_43_; i_43_++)
			is_42_[i_43_] = class37_sub11.method982((byte) 125);
		byte[] is_44_ = new byte[++i_41_];
		class37_sub11.pos++;
		int i_45_;
		if (i_41_ <= 1)
			i_45_ = i_41_;
		else {
			is_44_[1] = (byte) 1;
			i_45_ = 2;
			int i_46_ = 1;
			for (int i_47_ = 2; i_41_ > i_47_; i_47_++) {
				int i_48_ = class37_sub11.getUnsignedByte();
				if ((i_48_ ^ 0xffffffff) != -1) {
					if (i_48_ <= i_46_)
						i_48_--;
					i_46_ = i_48_;
				} else
					i_46_ = i_45_++;
				is_44_[i_47_] = (byte) i_46_;
			}
		}
		Class66[] class66s = new Class66[i_45_];
		for (int i_49_ = 0; (class66s.length ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
			Class66 class66 = class66s[i_49_] = new Class66();
			int i_50_ = class37_sub11.getUnsignedByte();
			if ((i_50_ ^ 0xffffffff) < -1)
				class66.aByteArray1252 = new byte[2 * i_50_];
			i_50_ = class37_sub11.getUnsignedByte();
			if ((i_50_ ^ 0xffffffff) < -1) {
				class66.aByteArray1251 = new byte[2 + 2 * i_50_];
				class66.aByteArray1251[1] = (byte) 64;
			}
		}
		int i_51_ = class37_sub11.getUnsignedByte();
		byte[] is_52_ = (i_51_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_51_];
		int i_53_ = 0;
		i_51_ = class37_sub11.getUnsignedByte();
		for (/**/; (class37_sub11.buf[class37_sub11.pos - -i_53_] != 0); i_53_++) {
			/* empty */
		}
		byte[] is_54_ = new byte[i_53_];
		byte[] is_55_ = i_51_ > 0 ? new byte[i_51_ * 2] : null;
		for (int i_56_ = 0; i_56_ < i_53_; i_56_++)
			is_54_[i_56_] = class37_sub11.method982((byte) 118);
		class37_sub11.pos++;
		int i_57_ = 0;
		i_53_++;
		for (int i_58_ = 0; i_58_ < 128; i_58_++) {
			i_57_ += class37_sub11.getUnsignedByte();
			aShortArray2147[i_58_] = (short) i_57_;
		}
		i_57_ = 0;
		for (int i_59_ = 0; i_59_ < 128; i_59_++) {
			i_57_ += class37_sub11.getUnsignedByte();
			aShortArray2147[i_59_] += i_57_ << -2113586872;
		}
		int i_60_ = 0;
		int i_61_ = 0;
		int i_62_ = 0;
		for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -129; i_63_++) {
			if (i_60_ == 0) {
				if (i_61_ >= is_54_.length)
					i_60_ = -1;
				else
					i_60_ = is_54_[i_61_++];
				i_62_ = class37_sub11.method974((byte) -124);
			}
			aShortArray2147[i_63_] += Class37_Sub4_Sub7.method490(
					i_62_ - 1 << 874813454, 32768);
			i_60_--;
			anIntArray2146[i_63_] = i_62_;
		}
		int i_64_ = 0;
		i_61_ = 0;
		i_60_ = 0;
		for (int i_65_ = 0; i_65_ < 128; i_65_++) {
			if (anIntArray2146[i_65_] != 0) {
				if ((i_60_ ^ 0xffffffff) == -1) {
					i_64_ = -1 + class37_sub11.buf[i_37_++];
					if (is_34_.length > i_61_)
						i_60_ = is_34_[i_61_++];
					else
						i_60_ = -1;
				}
				i_60_--;
				aByteArray2135[i_65_] = (byte) i_64_;
			}
		}
		i_60_ = 0;
		i_61_ = 0;
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < 128; i_67_++) {
			if ((anIntArray2146[i_67_] ^ 0xffffffff) != -1) {
				if ((i_60_ ^ 0xffffffff) == -1) {
					if ((i_61_ ^ 0xffffffff) > (is_38_.length ^ 0xffffffff))
						i_60_ = is_38_[i_61_++];
					else
						i_60_ = -1;
					i_66_ = (class37_sub11.buf[i_40_++] - -16 << 2016629890);
				}
				aByteArray2136[i_67_] = (byte) i_66_;
				i_60_--;
			}
		}
		i_61_ = 0;
		i_60_ = 0;
		Class66 class66 = null;
		for (int i_68_ = 0; i_68_ < 128; i_68_++) {
			if (anIntArray2146[i_68_] != 0) {
				if (i_60_ == 0) {
					class66 = class66s[is_44_[i_61_]];
					if ((is_42_.length ^ 0xffffffff) < (i_61_ ^ 0xffffffff))
						i_60_ = is_42_[i_61_++];
					else
						i_60_ = -1;
				}
				i_60_--;
				aClass66Array2145[i_68_] = class66;
			}
		}
		i_61_ = 0;
		i_60_ = 0;
		int i_69_ = 0;
		for (int i_70_ = 0; i_70_ < 128; i_70_++) {
			if (i_60_ == 0) {
				if ((is_54_.length ^ 0xffffffff) < (i_61_ ^ 0xffffffff))
					i_60_ = is_54_[i_61_++];
				else
					i_60_ = -1;
				if ((anIntArray2146[i_70_] ^ 0xffffffff) < -1)
					i_69_ = class37_sub11.getUnsignedByte() - -1;
			}
			i_60_--;
			aByteArray2144[i_70_] = (byte) i_69_;
		}
		anInt2139 = 1 + class37_sub11.getUnsignedByte();
		for (int i_71_ = 0; (i_45_ ^ 0xffffffff) < (i_71_ ^ 0xffffffff); i_71_++) {
			Class66 class66_72_ = class66s[i_71_];
			if (class66_72_.aByteArray1252 != null) {
				for (int i_73_ = 1; ((class66_72_.aByteArray1252.length ^ 0xffffffff) < (i_73_ ^ 0xffffffff)); i_73_ += 2)
					class66_72_.aByteArray1252[i_73_] = class37_sub11
							.method982((byte) 125);
			}
			if (class66_72_.aByteArray1251 != null) {
				for (int i_74_ = 3; ((i_74_ ^ 0xffffffff) > (-2
						+ class66_72_.aByteArray1251.length ^ 0xffffffff)); i_74_ += 2)
					class66_72_.aByteArray1251[i_74_] = class37_sub11
							.method982((byte) 124);
			}
		}
		if (is_52_ != null) {
			for (int i_75_ = 1; is_52_.length > i_75_; i_75_ += 2)
				is_52_[i_75_] = class37_sub11.method982((byte) 126);
		}
		if (is_55_ != null) {
			for (int i_76_ = 1; is_55_.length > i_76_; i_76_ += 2)
				is_55_[i_76_] = class37_sub11.method982((byte) 127);
		}
		for (int i_77_ = 0; i_45_ > i_77_; i_77_++) {
			Class66 class66_78_ = class66s[i_77_];
			if (class66_78_.aByteArray1251 != null) {
				i_57_ = 0;
				for (int i_79_ = 2; ((i_79_ ^ 0xffffffff) > (class66_78_.aByteArray1251.length ^ 0xffffffff)); i_79_ += 2) {
					i_57_ -= -1 - class37_sub11.getUnsignedByte();
					class66_78_.aByteArray1251[i_79_] = (byte) i_57_;
				}
			}
		}
		for (int i_80_ = 0; i_45_ > i_80_; i_80_++) {
			Class66 class66_81_ = class66s[i_80_];
			if (class66_81_.aByteArray1252 != null) {
				i_57_ = 0;
				for (int i_82_ = 2; class66_81_.aByteArray1252.length > i_82_; i_82_ += 2) {
					i_57_ = 1 + i_57_ + class37_sub11.getUnsignedByte();
					class66_81_.aByteArray1252[i_82_] = (byte) i_57_;
				}
			}
		}
		if (is_52_ != null) {
			i_57_ = class37_sub11.getUnsignedByte();
			is_52_[0] = (byte) i_57_;
			for (int i_83_ = 2; i_83_ < is_52_.length; i_83_ += 2) {
				i_57_ = class37_sub11.getUnsignedByte() + (i_57_ + 1);
				is_52_[i_83_] = (byte) i_57_;
			}
			int i_84_ = is_52_[1];
			int i_85_ = is_52_[0];
			for (int i_86_ = 0; i_85_ > i_86_; i_86_++)
				aByteArray2144[i_86_] = (byte) (32 + i_84_
						* aByteArray2144[i_86_] >> 203301030);
			int i_87_ = 2;
			while ((is_52_.length ^ 0xffffffff) < (i_87_ ^ 0xffffffff)) {
				int i_88_ = is_52_[i_87_];
				int i_89_ = is_52_[1 + i_87_];
				i_87_ += 2;
				int i_90_ = (-i_85_ + i_88_) * i_84_ - -((-i_85_ + i_88_) / 2);
				for (int i_91_ = i_85_; (i_88_ ^ 0xffffffff) < (i_91_ ^ 0xffffffff); i_91_++) {
					int i_92_ = Queue.method1287(256, -i_85_ + i_88_, i_90_);
					i_90_ += i_89_ + -i_84_;
					aByteArray2144[i_91_] = (byte) (aByteArray2144[i_91_]
							* i_92_ - -32 >> -2000761882);
				}
				i_84_ = i_89_;
				i_85_ = i_88_;
			}
			for (int i_93_ = i_85_; i_93_ < 128; i_93_++)
				aByteArray2144[i_93_] = (byte) (32 + aByteArray2144[i_93_]
						* i_84_ >> 2084994022);
			Object object = null;
		}
		if (is_55_ != null) {
			i_57_ = class37_sub11.getUnsignedByte();
			is_55_[0] = (byte) i_57_;
			for (int i_94_ = 2; (i_94_ ^ 0xffffffff) > (is_55_.length ^ 0xffffffff); i_94_ += 2) {
				i_57_ = class37_sub11.getUnsignedByte() + i_57_ + 1;
				is_55_[i_94_] = (byte) i_57_;
			}
			int i_95_ = is_55_[1] << 2009127105;
			int i_96_ = is_55_[0];
			for (int i_97_ = 0; (i_97_ ^ 0xffffffff) > (i_96_ ^ 0xffffffff); i_97_++) {
				int i_98_ = i_95_ + (0xff & aByteArray2136[i_97_]);
				if ((i_98_ ^ 0xffffffff) > -1)
					i_98_ = 0;
				if ((i_98_ ^ 0xffffffff) < -129)
					i_98_ = 128;
				aByteArray2136[i_97_] = (byte) i_98_;
			}
			int i_99_ = 2;
			while (i_99_ < is_55_.length) {
				int i_100_ = is_55_[i_99_];
				int i_101_ = is_55_[1 + i_99_] << -1863636223;
				int i_102_ = i_95_ * (-i_96_ + i_100_) + (-i_96_ + i_100_) / 2;
				for (int i_103_ = i_96_; i_103_ < i_100_; i_103_++) {
					int i_104_ = Queue.method1287(256, -i_96_ + i_100_,
							i_102_);
					int i_105_ = i_104_ + (0xff & aByteArray2136[i_103_]);
					i_102_ += i_101_ + -i_95_;
					if (i_105_ < 0)
						i_105_ = 0;
					if ((i_105_ ^ 0xffffffff) < -129)
						i_105_ = 128;
					aByteArray2136[i_103_] = (byte) i_105_;
				}
				i_99_ += 2;
				i_95_ = i_101_;
				i_96_ = i_100_;
			}
			for (int i_106_ = i_96_; (i_106_ ^ 0xffffffff) > -129; i_106_++) {
				int i_107_ = i_95_ + (0xff & aByteArray2136[i_106_]);
				if ((i_107_ ^ 0xffffffff) > -1)
					i_107_ = 0;
				if (i_107_ > 128)
					i_107_ = 128;
				aByteArray2136[i_106_] = (byte) i_107_;
			}
			Object object = null;
		}
		for (int i_108_ = 0; i_45_ > i_108_; i_108_++)
			class66s[i_108_].anInt1256 = class37_sub11.getUnsignedByte();
		for (int i_109_ = 0; i_109_ < i_45_; i_109_++) {
			Class66 class66_110_ = class66s[i_109_];
			if (class66_110_.aByteArray1252 != null)
				class66_110_.anInt1247 = class37_sub11.getUnsignedByte();
			if (class66_110_.aByteArray1251 != null)
				class66_110_.anInt1249 = class37_sub11.getUnsignedByte();
			if ((class66_110_.anInt1256 ^ 0xffffffff) < -1)
				class66_110_.anInt1260 = class37_sub11.getUnsignedByte();
		}
		for (int i_111_ = 0; i_45_ > i_111_; i_111_++)
			class66s[i_111_].anInt1254 = class37_sub11.getUnsignedByte();
		for (int i_112_ = 0; i_45_ > i_112_; i_112_++) {
			Class66 class66_113_ = class66s[i_112_];
			if ((class66_113_.anInt1254 ^ 0xffffffff) < -1)
				class66_113_.anInt1250 = class37_sub11.getUnsignedByte();
		}
		for (int i_114_ = 0; (i_45_ ^ 0xffffffff) < (i_114_ ^ 0xffffffff); i_114_++) {
			Class66 class66_115_ = class66s[i_114_];
			if (class66_115_.anInt1250 > 0)
				class66_115_.anInt1245 = class37_sub11.getUnsignedByte();
		}
	}

	static {
		aClass16_2130 = Class37_Sub2.create_rsstring("Update)2Liste geladen)3");
	}
}
