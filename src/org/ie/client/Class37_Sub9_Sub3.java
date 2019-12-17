package org.ie.client;

/* Class37_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public class Class37_Sub9_Sub3 extends Class37_Sub9 {
	public static int anInt2938;
	public static RSString aClass16_2939;
	public static Cache aClass65_2940;
	public int anInt2941;
	public int anInt2942 = 0;
	public int anInt2943;
	public int anInt2944;
	public static int anInt2945;
	public static int scriptedSkillLength = 0;
	public static int anInt2947;
	public static int anInt2948;
	public static RSString aClass16_2949 = Class37_Sub2.create_rsstring(
			")2");
	public static int anInt2950;
	public static int anInt2951;
	public static int anInt2952;
	public static int anInt2953;
	public static int anInt2954;
	public static RSString aClass16_2955;
	public static RSString aClass16_2956;

	public static void method768(int i, String string, Throwable throwable) {
		anInt2952++;
		do {
			try {
				String string_0_ = "";
				if (throwable != null)
					string_0_ = client.method35(-93, throwable);
				if (string != null) {
					if (throwable != null)
						string_0_ += " | ";
					string_0_ += (String) string;
				}
				System.out.println("Error: " + string_0_);
				string_0_ = string_0_.replace(':', '.');
				string_0_ = string_0_.replace('@', '_');
				string_0_ = string_0_.replace('&', '_');
				string_0_ = string_0_.replace('#', '_');
				if (Class43.aClass51_958.anApplet1045 != null) {
					Class23 class23 = (Class43.aClass51_958.method1122(
							(byte) 40, new URL(
									Class43.aClass51_958.anApplet1045
											.getCodeBase(),
									("clienterror.ws?c=" + Class85.anInt1552
											+ "&u="
											+ Class37_Sub9_Sub34.aLong3556
											+ "&v1=" + Signlink.aString1039
											+ "&v2=" + Signlink.aString1033
											+ "&e=" + string_0_))));
					while (class23.anInt591 == 0)
						Class37_Sub9_Sub20.method846(1L, (byte) 58);
					if (i > -48)
						aClass65_2940 = null;
					if (class23.anInt591 != 1)
						break;
					DataInputStream datainputstream = (DataInputStream) class23.anObject595;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}

	public static void method769(int i) {
		aClass16_2949 = null;
		aClass65_2940 = null;
		aClass16_2956 = null;
		aClass16_2939 = null;
		if (i != -1950612276)
			method772(null, false);
		aClass16_2955 = null;
	}

	public Class37_Sub9_Sub3() {
		super(0, true);
		anInt2941 = 20;
		anInt2944 = 1365;
		anInt2943 = 0;
	}

	public static Class37_Sub4_Sub9_Sub2_Sub1 method770(Class15 class15, int i,
			byte i_1_, Class15 class15_2_, int i_3_, RSString rSString) {
		if (!Class37_Sub12.method1001(i, class15, (byte) 124, i_3_))
			return null;
		return Class37_Sub4_Sub5.method484(
				class15_2_.getFile(i_3_, i));
	}

	public static void method771(int i,
			Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1, int i_4_) {
		anInt2947++;
		if (Class37_Sub7.loopCycle < class37_sub4_sub7_sub1.firstDistanceSpeed)
			Class37_Sub9_Sub20.method852(class37_sub4_sub7_sub1, true);
		else if ((class37_sub4_sub7_sub1.secondDistanceSpeed ^ 0xffffffff) <= (Class37_Sub7.loopCycle ^ 0xffffffff))
			MouseHandler.method82(class37_sub4_sub7_sub1);
		else
			Class37_Sub4_Sub7_Sub2.method513((byte) 69, class37_sub4_sub7_sub1);
		if (class37_sub4_sub7_sub1.anInt3666 < 128
				|| class37_sub4_sub7_sub1.anInt3642 < 128
				|| (class37_sub4_sub7_sub1.anInt3666 ^ 0xffffffff) <= -13185
				|| class37_sub4_sub7_sub1.anInt3642 >= 13184) {
			class37_sub4_sub7_sub1.secondDistanceSpeed = 0;
			class37_sub4_sub7_sub1.anInt3636 = -1;
			class37_sub4_sub7_sub1.anInt3655 = -1;
			class37_sub4_sub7_sub1.anInt3666 = (class37_sub4_sub7_sub1.anIntArray3651[0] * 128 + 64 * class37_sub4_sub7_sub1.anInt3683);
			class37_sub4_sub7_sub1.anInt3642 = (class37_sub4_sub7_sub1.anInt3683 * 64 + 128 * class37_sub4_sub7_sub1.anIntArray3669[0]);
			class37_sub4_sub7_sub1.firstDistanceSpeed = 0;
			class37_sub4_sub7_sub1.method501(77);
		}
		if ((class37_sub4_sub7_sub1 == Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234)
				&& ((class37_sub4_sub7_sub1.anInt3666 ^ 0xffffffff) > -1537
						|| (class37_sub4_sub7_sub1.anInt3642 ^ 0xffffffff) > -1537
						|| (class37_sub4_sub7_sub1.anInt3666 ^ 0xffffffff) <= -11777 || ((class37_sub4_sub7_sub1.anInt3642 ^ 0xffffffff) <= -11777))) {
			class37_sub4_sub7_sub1.anInt3666 = (64 * class37_sub4_sub7_sub1.anInt3683 + 128 * class37_sub4_sub7_sub1.anIntArray3651[0]);
			class37_sub4_sub7_sub1.anInt3636 = -1;
			class37_sub4_sub7_sub1.anInt3655 = -1;
			class37_sub4_sub7_sub1.firstDistanceSpeed = 0;
			class37_sub4_sub7_sub1.secondDistanceSpeed = 0;
			class37_sub4_sub7_sub1.anInt3642 = (64 * class37_sub4_sub7_sub1.anInt3683 + class37_sub4_sub7_sub1.anIntArray3669[0] * 128);
			class37_sub4_sub7_sub1.method501(123);
		}
		if (i_4_ >= 97) {
			Class39.method1064(class37_sub4_sub7_sub1, (byte) 113);
			Class37_Sub9_Sub6.method785(class37_sub4_sub7_sub1, 8716);
		}
	}

	public static Class37_Sub9 method772(ByteVector class37_sub11, boolean bool) {
		anInt2948++;
		int i = class37_sub11.getUnsignedByte();
		int i_5_ = class37_sub11.getUnsignedByte();
		Class var_class = Class19.method203(i_5_, !bool);
		try {
			Class37_Sub9 class37_sub9 = (Class37_Sub9) var_class.newInstance();
			try {
				if (bool != true)
					return null;
				if (class37_sub9 != null) {
					class37_sub9.anInt1955 = i;
					class37_sub9.anInt1949 = class37_sub11.getUnsignedByte();
					int i_6_ = class37_sub11.getUnsignedByte();
					for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_7_++) {
						int i_8_ = class37_sub11.getUnsignedByte();
						class37_sub9.method750(class37_sub11, i_8_, true);
					}
				}
			} catch (Exception e) {}
			class37_sub9.method752(-2);
			return class37_sub9;
		} catch (IllegalAccessException illegalaccessexception) {
			throw new RuntimeException();
		} catch (InstantiationException instantiationexception) {
			throw new RuntimeException();
		}
	}

	public static void method773(byte i, int i_9_, int i_10_, int i_11_,
			Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2) {
		anInt2951++;
		if ((class37_sub4_sub7_sub1_sub2 != Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234)
				&& Class37_Sub9_Sub13.anInt3134 < 400) {
			RSString rSString;
			if (class37_sub4_sub7_sub1_sub2.anInt3961 == 0)
				rSString = (Class37_Sub9_Sub27
						.method881(
								(new RSString[] {
										class37_sub4_sub7_sub1_sub2.aClass16_3993,
										(Class52
												.method1126(
														-3,
														class37_sub4_sub7_sub1_sub2.anInt3978,
														(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3978))),
										Class37_Sub9_Sub24.aClass16_3370,
										Class79.aClass16_1482,
										(Class37_Sub9_Sub24
												.method870(
														class37_sub4_sub7_sub1_sub2.anInt3978,
														(byte) -114)),
										Class25.aClass16_644 })));
			else
				rSString = (Class37_Sub9_Sub27.method881((new RSString[] {
						class37_sub4_sub7_sub1_sub2.aClass16_3993,
						Class37_Sub9_Sub24.aClass16_3370,
						Class37_Sub9_Sub5.aClass16_2996,
						(Class37_Sub9_Sub24.method870(
								class37_sub4_sub7_sub1_sub2.anInt3961,
								(byte) -114)), Class25.aClass16_644 })));
			if ((Class37_Sub14.anInt2122 ^ 0xffffffff) != -2) {
				if (!Class37_Sub4_Sub5.aBoolean2595) {
					for (int i_12_ = 7; (i_12_ ^ 0xffffffff) <= -1; i_12_--) {
						if (Class75.aClass16Array1413[i_12_] != null) {
							ByteVector.anInt2016++;
							int i_13_ = 0;
							boolean bool = false;
							if (!Class75.aClass16Array1413[i_12_].method159(
									RSInterface.aClass16_330, (byte) 116)) {
								if (Class54.aBooleanArray1058[i_12_])
									i_13_ = 2000;
							} else {
								if (class37_sub4_sub7_sub1_sub2.anInt3978 > (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3978))
									i_13_ = 2000;
								if ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3988) != 0
										&& (class37_sub4_sub7_sub1_sub2.anInt3988 != 0)) {
									if (((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3988) ^ 0xffffffff) != ((class37_sub4_sub7_sub1_sub2.anInt3988) ^ 0xffffffff))
										i_13_ = 0;
									else
										i_13_ = 2000;
								}
							}
							int i_14_ = Class41.anIntArray912[i_12_] - -i_13_;
							method774(i_14_, i_11_,
									Class75.aClass16Array1413[i_12_], i_9_,
									true, (Class37_Sub9_Sub27.method881(new RSString[] {
											Class25.aClass16_636,
											rSString })), i_10_);
						}
					}
				} else if ((0x8 & Class37_Sub4_Sub12.anInt2759 ^ 0xffffffff) == -9) {
					method774(34, i_11_, Class37_Sub9_Sub1.aClass16_2912, i_9_,
							true,
							(Class37_Sub9_Sub27.method881(new RSString[] {
									Class60.aClass16_1142,
									Class54.aClass16_1061, rSString })), i_10_);
					Class72.anInt1373++;
				}
			} else {
				Class14.anInt251++;
				method774(22, i_11_, Class37_Sub9_Sub27.aClass16_3404, i_9_,
						true, (Class37_Sub9_Sub27.method881(new RSString[] { Class64.aClass16_1218,
								Class54.aClass16_1061, rSString })),
						i_10_);
			}
			for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff)); i_15_++) {
				if ((Class37_Sub9_Sub20.anIntArray3300[i_15_] ^ 0xffffffff) == -3) {
					Class37_Sub9_Sub37.aClass16Array3593[i_15_] = Class37_Sub9_Sub27
							.method881((new RSString[] {
									Class25.aClass16_636, rSString }));
					break;
				}
			}
			int i_16_ = 99 / ((54 - i) / 53);
		}
	}

	public static void method774(int i, int i_17_, RSString rSString,
			int i_18_, boolean bool, RSString class16_19_, int i_20_) {
		do {
			try {
				anInt2953++;
				if (bool != true)
					scriptedSkillLength = 57;
				if (!Class37_Sub20.menu_open) {
					if ((Class37_Sub9_Sub13.anInt3134 ^ 0xffffffff) <= -501)
						break;
					Class37_Sub9_Sub14.aClass16Array3151[(Class37_Sub9_Sub13.anInt3134)] = rSString;
					Class37_Sub9_Sub37.aClass16Array3593[(Class37_Sub9_Sub13.anInt3134)] = class16_19_;
					Class37_Sub9_Sub20.anIntArray3300[(Class37_Sub9_Sub13.anInt3134)] = i;
					Class62.anIntArray1183[Class37_Sub9_Sub13.anInt3134] = i_20_;
					Deque.anIntArray1128[Class37_Sub9_Sub13.anInt3134] = i_18_;
					Class37_Sub4_Sub14.anIntArray2809[(Class37_Sub9_Sub13.anInt3134)] = i_17_;
					Class37_Sub9_Sub13.anInt3134++;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						("bg.C(" + i + ',' + i_17_ + ','
								+ (rSString != null ? "{...}" : "null") + ','
								+ i_18_ + ',' + bool + ','
								+ (class16_19_ != null ? "{...}" : "null")
								+ ',' + i_20_ + ')'));
			}
			break;
		} while (false);
	}

	public int[] method761(int i, int i_21_) {
		anInt2945++;
		int[] is = aClass38_1966.method1049(i_21_, true);
		if (aClass38_1966.aBoolean850) {
			for (int i_22_ = 0; i_22_ < Class32.anInt743; i_22_++) {
				int i_23_ = anInt2943
						+ (Class84.anIntArray1528[i_22_] << -88696180)
						/ anInt2944;
				int i_24_ = i_23_;
				int i_25_ = anInt2942
						+ (Class37_Sub4_Sub16.anIntArray2871[i_21_] << 1374709964)
						/ anInt2944;
				int i_26_ = i_25_;
				int i_27_ = i_23_ * i_23_ >> -752951060;
				int i_28_ = i_23_;
				int i_29_ = i_25_;
				int i_30_ = i_25_ * i_25_ >> 2065589516;
				int i_31_;
				for (i_31_ = 0; ((i_27_ - -i_30_ ^ 0xffffffff) > -16385 && i_31_ < anInt2941); i_30_ = i_29_
						* i_29_ >> -473554036) {
					i_31_++;
					i_29_ = 2 * (i_28_ * i_29_ >> 857350380) - -i_26_;
					i_28_ = -i_30_ + (i_27_ - -i_24_);
					i_27_ = i_28_ * i_28_ >> 243997612;
				}
				is[i_22_] = ((-1 + anInt2941 ^ 0xffffffff) >= (i_31_ ^ 0xffffffff) ? 0
						: (i_31_ << -1950612276) / anInt2941);
			}
		}
		if (i >= -125)
			method750(null, -85, true);
		return is;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		int i_32_ = i;
		while_7_: do {
			while_6_: do {
				do {
					if ((i_32_ ^ 0xffffffff) != -1) {
						if (i_32_ != 1) {
							if (i_32_ != 2) {
								if (i_32_ != 3)
									break while_7_;
							} else
								break;
							break while_6_;
						}
					} else {
						anInt2944 = class37_sub11.getUnsignedShort();
						break while_7_;
					}
					anInt2941 = class37_sub11.getUnsignedShort();
					break while_7_;
				} while (false);
				anInt2943 = class37_sub11.getUnsignedShort();
				break while_7_;
			} while (false);
			anInt2942 = class37_sub11.getUnsignedShort();
		} while (false);
		anInt2938++;
	}

	static {
		aClass16_2939 = Class37_Sub2.create_rsstring("null");
		aClass65_2940 = new Cache(64);
		anInt2954 = 1;
		aClass16_2956 = Class37_Sub2.create_rsstring("<br>(X100(U(Y");
		aClass16_2955 = Class37_Sub2.create_rsstring("leuchten2:");
	}
}
