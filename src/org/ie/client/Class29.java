package org.ie.client;

/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class29 {
	public static int anInt694;
	public static int anInt695 = 2;
	public int anInt696;
	public int[] anIntArray697;
	public static int anInt698;
	public long aLong699;
	public boolean aBoolean700;
	public static int anInt701;
	public int[] anIntArray702;
	public static int anInt703;
	public static int anInt704;
	public static RSString aClass16_705 = Class37_Sub2.create_rsstring("und Ihr Passwort ein)3");
	public static int anInt706;
	public static RSString aClass16_707;
	public static int anInt708;
	public static RSString aClass16_709 = Class37_Sub2.create_rsstring("Try again in 60 secs)3)3)3");
	public static RSString aClass16_710 = aClass16_709;
	public static Class15_Sub1 aClass15_Sub1_711;
	public static int anInt712;
	public static RSString aClass16_713;
	public long aLong714;
	public static int anInt715;
	public static int anInt716;

	public Class37_Sub4_Sub7_Sub4 method262(boolean bool) {
		anInt712++;
		if ((anInt696 ^ 0xffffffff) != 0)
			return Class37_Sub9_Sub34.method912(-86, anInt696).method720(-1);
		boolean bool_0_ = bool;
		for (int i = 0; i < 12; i++) {
			int i_1_ = anIntArray702[i];
			if (i_1_ >= 256
					&& i_1_ < 512
					&& !Class37_Sub9_Sub36.method918(8237, i_1_ + -256)
							.method480(-6))
				bool_0_ = true;
			if ((i_1_ ^ 0xffffffff) <= -513
					&& !Class46.loadItem(i_1_ + -512, (byte) 79).method450(
							aBoolean700, 20274))
				bool_0_ = true;
		}
		if (bool_0_)
			return null;
		Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = new Class37_Sub4_Sub7_Sub4[12];
		int i = 0;
		for (int i_2_ = 0; i_2_ < 12; i_2_++) {
			int i_3_ = anIntArray702[i_2_];
			if ((i_3_ ^ 0xffffffff) <= -257 && (i_3_ ^ 0xffffffff) > -513) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub9_Sub36
						.method918(8237, -256 + i_3_).method479((byte) -103);
				if (class37_sub4_sub7_sub4 != null)
					class37_sub4_sub7_sub4s[i++] = class37_sub4_sub7_sub4;
			}
			if (i_3_ >= 512) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class46
						.loadItem(-512 + i_3_, (byte) 100).method448(
								(byte) -119, aBoolean700);
				if (class37_sub4_sub7_sub4 != null)
					class37_sub4_sub7_sub4s[i++] = class37_sub4_sub7_sub4;
			}
		}
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
				class37_sub4_sub7_sub4s, i);
		for (int i_4_ = 0; i_4_ < 5; i_4_++) {
			if (Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i_4_].length > anIntArray697[i_4_])
				class37_sub4_sub7_sub4
						.method535(
								(RSItem.aShortArray2491[i_4_]),
								(Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i_4_][anIntArray697[i_4_]]));
			if ((anIntArray697[i_4_] ^ 0xffffffff) > (Class37_Sub17.aShortArrayArray2159[i_4_].length ^ 0xffffffff))
				class37_sub4_sub7_sub4
						.method535(
								Class35.aShortArray789[i_4_],
								(Class37_Sub17.aShortArrayArray2159[i_4_][anIntArray697[i_4_]]));
		}
		return class37_sub4_sub7_sub4;
	}

	public void method263(byte i, boolean bool) {
		anInt694++;
		if (i != 55)
			aClass16_709 = null;
		if (aBoolean700 != bool)
			method270(null, bool, (byte) -96, anIntArray697, -1);
	}

	public void method264(ByteVector class37_sub11, int i) {
		class37_sub11.method964(98, aBoolean700 ? 1 : 0);
		for (int i_5_ = 0; i_5_ < 7; i_5_++) {
			int i_6_ = anIntArray702[Class83.anIntArray1521[i_5_]];
			if ((i_6_ ^ 0xffffffff) != -1)
				class37_sub11.method964(i ^ ~0x7c, -256 + i_6_);
			else
				class37_sub11.method964(107, -1);
		}
		int i_7_ = 0;
		if (i != -1)
			aClass16_713 = null;
		for (/**/; (i_7_ ^ 0xffffffff) > -6; i_7_++)
			class37_sub11.method964(i + 101, anIntArray697[i_7_]);
		anInt715++;
	}

	public static boolean method265(int i, byte[] is, int i_8_, byte i_9_) {
		boolean bool = true;
		anInt704++;
		if (i_9_ <= 68)
			method269((byte) -32);
		ByteVector class37_sub11 = new ByteVector(is);
		int i_10_ = -1;
		for (;;) {
			int i_11_ = class37_sub11.method961(255);
			if (i_11_ == 0)
				break;
			i_10_ += i_11_;
			int i_12_ = 0;
			boolean bool_13_ = false;
			for (;;) {
				if (!bool_13_) {
					int i_14_ = class37_sub11.method961(255);
					if (i_14_ == 0)
						break;
					i_12_ += -1 + i_14_;
					int i_15_ = i_12_ >> 749388806 & 0x3f;
					int i_16_ = i_15_ + i_8_;
					int i_17_ = class37_sub11.getUnsignedByte() >> -191501438;
					int i_18_ = i_12_ & 0x3f;
					int i_19_ = i + i_18_;
					if (i_16_ > 0 && (i_19_ ^ 0xffffffff) < -1
							&& (i_16_ ^ 0xffffffff) > -104 && i_19_ < 103) {
						Class37_Sub4_Sub11 class37_sub4_sub11 = Class37_Sub9_Sub8
								.method794(i_10_, 28067);
						if (i_17_ != 22
								|| !ClientScriptDef.aBoolean2613
								|| ((class37_sub4_sub11.anInt2726 ^ 0xffffffff) != -1)
								|| ((class37_sub4_sub11.anInt2740 ^ 0xffffffff) == -2)
								|| class37_sub4_sub11.aBoolean2728) {
							bool_13_ = true;
							if (!class37_sub4_sub11.method692(74)) {
								bool = false;
								Class76.anInt1437++;
							}
						}
					}
				} else {
					int i_20_ = class37_sub11.method961(255);
					if ((i_20_ ^ 0xffffffff) == -1)
						break;
					class37_sub11.getUnsignedByte();
				}
			}
		}
		return bool;
	}

	public void method266(int i) {
		anInt706++;
		long l = aLong699;
		aLong699 = 0L;
		int i_21_ = anIntArray702[9];
		if (i >= -65)
			aClass16_709 = null;
		int i_22_ = anIntArray702[5];
		anIntArray702[9] = i_22_;
		anIntArray702[5] = i_21_;
		for (int i_23_ = 0; i_23_ < 12; i_23_++) {
			aLong699 <<= 4;
			if (anIntArray702[i_23_] >= 256)
				aLong699 += (long) (anIntArray702[i_23_] + -256);
		}
		if (anIntArray702[0] >= 256)
			aLong699 += (long) (-256 + anIntArray702[0] >> 1282914340);
		if (anIntArray702[1] >= 256)
			aLong699 += (long) (-256 + anIntArray702[1] >> -90838904);
		for (int i_24_ = 0; i_24_ < 5; i_24_++) {
			aLong699 <<= 3;
			aLong699 += (long) anIntArray697[i_24_];
		}
		anIntArray702[5] = i_22_;
		aLong699 <<= 1;
		anIntArray702[9] = i_21_;
		Class29 class29_25_ = this;
		class29_25_.aLong699 = class29_25_.aLong699
				+ (long) (!aBoolean700 ? 0 : 1);
		if ((l ^ 0xffffffffffffffffL) != -1L
				&& (l ^ 0xffffffffffffffffL) != (aLong699 ^ 0xffffffffffffffffL))
			Class32_Sub1.aClass65_1780.remove(l);
	}

	public void method267(int i, boolean bool, byte i_26_) {
		int i_27_ = anIntArray697[i];
		int i_28_ = -102 % ((i_26_ - -24) / 32);
		if (bool) {
			if (++i_27_ >= Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i].length)
				i_27_ = 0;
		} else if (--i_27_ < 0)
			i_27_ = -1 + Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i].length;
		anInt703++;
		anIntArray697[i] = i_27_;
		method266(-72);
	}

	public int method268(int i) {
		if (i != 4)
			return -115;
		anInt701++;
		if (anInt696 == -1)
			return ((anIntArray702[8] << 880417162)
					+ ((anIntArray697[4] << -354228012)
							+ (anIntArray697[0] << -1180927719) + (anIntArray702[0] << -1847093137)) - (-(anIntArray702[11] << 1107408485) - anIntArray702[1]));
		return (305419896 + Class37_Sub9_Sub34.method912(56, anInt696).anInt2842);
	}

	public static void method269(byte i) {
		aClass16_709 = null;
		aClass15_Sub1_711 = null;
		aClass16_705 = null;
		aClass16_707 = null;
		aClass16_713 = null;
		aClass16_710 = null;
		int i_29_ = -43 % ((i - 2) / 44);
	}

	public void method270(int[] is, boolean bool, byte i, int[] is_30_,
			int i_31_) {
		try {
			anInt716++;
			if (is == null) {
				is = new int[12];
				for (int i_32_ = 0; i_32_ < 7; i_32_++) {
					for (int i_33_ = 0; Class37_Sub2.anInt1832 > i_33_; i_33_++) {
						Class37_Sub4_Sub4 class37_sub4_sub4 = Class37_Sub9_Sub36
								.method918(8237, i_33_);
						if (class37_sub4_sub4 != null
								&& !class37_sub4_sub4.aBoolean2570
								&& (class37_sub4_sub4.anInt2584 == (bool ? 7
										: 0)
										+ i_32_)) {
							is[Class83.anIntArray1521[i_32_]] = i_33_ + 256;
							break;
						}
					}
				}
			}
			anIntArray697 = is_30_;
			if (i != -96)
				method265(-71, null, -29, (byte) -62);
			aBoolean700 = bool;
			anIntArray702 = is;
			anInt696 = i_31_;
			method266(-75);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3
					.method516(runtimeexception,
							("ia.E(" + (is != null ? "{...}" : "null") + ','
									+ bool + ',' + i + ','
									+ (is_30_ != null ? "{...}" : "null") + ','
									+ i_31_ + ')'));
		}
	}

	public void method271(int i, boolean bool, int i_34_) {
		anInt708++;
		if ((i_34_ ^ 0xffffffff) != -2 || !aBoolean700) {
			int i_35_ = anIntArray702[Class83.anIntArray1521[i_34_]];
			if (i_35_ != 0 && i < -38) {
				i_35_ -= 256;
				Class37_Sub4_Sub4 class37_sub4_sub4;
				do {
					if (bool) {
						i_35_++;
						if ((Class37_Sub2.anInt1832 ^ 0xffffffff) >= (i_35_ ^ 0xffffffff))
							i_35_ = 0;
					} else if (--i_35_ < 0)
						i_35_ = -1 + Class37_Sub2.anInt1832;
					class37_sub4_sub4 = Class37_Sub9_Sub36.method918(8237,
							i_35_);
				} while (class37_sub4_sub4 == null
						|| class37_sub4_sub4.aBoolean2570
						|| ((class37_sub4_sub4.anInt2584 ^ 0xffffffff) != (i_34_
								- -(!aBoolean700 ? 0 : 7) ^ 0xffffffff)));
				anIntArray702[Class83.anIntArray1521[i_34_]] = i_35_ + 256;
				method266(-86);
			}
		}
	}

	public Class37_Sub4_Sub7_Sub6 method272(
			Class37_Sub4_Sub12 class37_sub4_sub12, int i, int i_36_, int i_37_,
			Class37_Sub4_Sub12 class37_sub4_sub12_38_) {
		try {
			anInt698++;
			if (i_36_ != -256)
				return null;
			if ((anInt696 ^ 0xffffffff) != 0)
				return (Class37_Sub9_Sub34.method912(-78, anInt696).method715(
						class37_sub4_sub12_38_, class37_sub4_sub12, i_37_, i,
						(byte) 114));
			long l = aLong699;
			int[] is = anIntArray702;
			if (class37_sub4_sub12 != null
					&& (class37_sub4_sub12.anInt2769 >= 0 || class37_sub4_sub12.anInt2758 >= 0)) {
				is = new int[12];
				for (int i_39_ = 0; i_39_ < 12; i_39_++)
					is[i_39_] = anIntArray702[i_39_];
				if ((class37_sub4_sub12.anInt2769 ^ 0xffffffff) <= -1) {
					l += (long) ((-anIntArray702[5] + class37_sub4_sub12.anInt2769) << 1987488712);
					is[5] = class37_sub4_sub12.anInt2769;
				}
				if ((class37_sub4_sub12.anInt2758 ^ 0xffffffff) <= -1) {
					l += (long) ((-anIntArray702[3] + class37_sub4_sub12.anInt2758) << 259414192);
					is[3] = class37_sub4_sub12.anInt2758;
				}
			}
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class32_Sub1.aClass65_1780
					.get(l));
			if (class37_sub4_sub7_sub6 == null) {
				boolean bool = false;
				for (int i_40_ = 0; i_40_ < 12; i_40_++) {
					int i_41_ = is[i_40_];
					if ((i_41_ ^ 0xffffffff) <= -257
							&& i_41_ < 512
							&& !Class37_Sub9_Sub36
									.method918(8237, -256 + i_41_).method477(
											(byte) 4))
						bool = true;
					if (i_41_ >= 512
							&& !Class46.loadItem(i_41_ - 512, (byte) 113)
									.method444((byte) 117, aBoolean700))
						bool = true;
				}
				if (bool) {
					if ((aLong714 ^ 0xffffffffffffffffL) != 0L)
						class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class32_Sub1.aClass65_1780
								.get(aLong714));
					if (class37_sub4_sub7_sub6 == null)
						return null;
				}
				if (class37_sub4_sub7_sub6 == null) {
					Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = new Class37_Sub4_Sub7_Sub4[12];
					int i_42_ = 0;
					for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -13; i_43_++) {
						int i_44_ = is[i_43_];
						if (i_44_ >= 256 && (i_44_ ^ 0xffffffff) > -513) {
							Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub9_Sub36
									.method918(8237, i_44_ - 256).method478(0);
							if (class37_sub4_sub7_sub4 != null)
								class37_sub4_sub7_sub4s[i_42_++] = class37_sub4_sub7_sub4;
						}
						if ((i_44_ ^ 0xffffffff) <= -513) {
							Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class46
									.loadItem(-512 + i_44_, (byte) 91)
									.method447(-109, aBoolean700);
							if (class37_sub4_sub7_sub4 != null)
								class37_sub4_sub7_sub4s[i_42_++] = class37_sub4_sub7_sub4;
						}
					}
					Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
							class37_sub4_sub7_sub4s, i_42_);
					for (int i_45_ = 0; i_45_ < 5; i_45_++) {
						if (anIntArray697[i_45_] < (Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i_45_]).length)
							class37_sub4_sub7_sub4
									.method535(
											RSItem.aShortArray2491[i_45_],
											(Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i_45_][anIntArray697[i_45_]]));
						if (anIntArray697[i_45_] < Class37_Sub17.aShortArrayArray2159[i_45_].length)
							class37_sub4_sub7_sub4
									.method535(
											Class35.aShortArray789[i_45_],
											(Class37_Sub17.aShortArrayArray2159[i_45_][anIntArray697[i_45_]]));
					}
					class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
							64, 850, -30, -50, -30, true, true);
					Class32_Sub1.aClass65_1780.put(class37_sub4_sub7_sub6, l);
					aLong714 = l;
				}
			}
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_46_;
			if (class37_sub4_sub12 != null || class37_sub4_sub12_38_ != null) {
				if (class37_sub4_sub12 == null
						|| class37_sub4_sub12_38_ == null) {
					if (class37_sub4_sub12 != null)
						class37_sub4_sub7_sub6_46_ = (class37_sub4_sub12
								.method704(class37_sub4_sub7_sub6, i_37_, 65535));
					else
						class37_sub4_sub7_sub6_46_ = class37_sub4_sub12_38_
								.method704(class37_sub4_sub7_sub6, i, 65535);
				} else
					class37_sub4_sub7_sub6_46_ = class37_sub4_sub12.method701(
							i_37_, class37_sub4_sub7_sub6, (byte) -77,
							class37_sub4_sub12_38_, i);
			} else
				return class37_sub4_sub7_sub6;
			return class37_sub4_sub7_sub6_46_;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("ia.D("
							+ (class37_sub4_sub12 != null ? "{...}" : "null")
							+ ','
							+ i
							+ ','
							+ i_36_
							+ ','
							+ i_37_
							+ ','
							+ (class37_sub4_sub12_38_ != null ? "{...}"
									: "null") + ')'));
		}
	}

	static {
		aClass16_707 = Class37_Sub2.create_rsstring("ams");
		aClass16_713 = Class37_Sub2.create_rsstring("leuchten3:");
	}
}
