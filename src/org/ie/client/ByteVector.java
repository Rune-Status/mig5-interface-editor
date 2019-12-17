package org.ie.client;

/* Class37_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class ByteVector extends Node {
	public static RSString aClass16_2001;
	public static int anInt2002;
	public static int anInt2003;
	public static int anInt2004;
	public static int anInt2005;
	public static RSString aClass16_2006;
	public static int anInt2007;
	public static int anInt2008;
	public static int anInt2009;
	public static int anInt2010;
	public static int anInt2011;
	public static int anInt2012;
	public static int anInt2013;
	public static int anInt2014 = -1;
	public static int anInt2015;
	public static int anInt2016;
	public static int anInt2017;
	public static RSString aClass16_2018;
	public static int anInt2019;
	public static int anInt2020;
	public static RSString aClass16_2021;
	public static int anInt2022;
	public static Applet_Sub1 anApplet_Sub1_2023;
	public static int anInt2024;
	public static Class15 aClass15_2025;
	public static int anInt2026;
	public static int anInt2027;
	public static int anInt2028;
	public static int anInt2029;
	public static int anInt2030;
	public static int anInt2031;
	public static int anInt2032;
	public static int anInt2033;
	public static int anInt2034;
	public static int anInt2035;
	public static int anInt2036;
	public static int anInt2037;
	public static RSString aClass16_2038;
	public static int anInt2039;
	public static int anInt2040;
	public static RSString[] aClass16Array2041;
	public static int anInt2042;
	public static int anInt2043;
	public static RSString aClass16_2044;
	public static int anInt2045;
	public static int anInt2046;
	public static int anInt2047;
	public static int anInt2048;
	public static int anInt2049;
	public static int anInt2050;
	public static int anInt2051;
	public static int anInt2052;
	public static int anInt2053;
	public static int anInt2054;
	public int pos;
	public static int anInt2056;
	public static int anInt2057;
	public static int anInt2058;
	public static RSString hiddenString;
	public static int anInt2060;
	public static int anInt2061;
	public byte[] buf;
	public static int anInt2063;
	public static int anInt2064;
	public static int anInt2065;
	public static int anInt2066;
	public static int anInt2067;
	public static int anInt2068;
	public static int anInt2069;
	public static int anInt2070;
	public static int anInt2071;
	public static int anInt2072;
	public static int anInt2073;
	public static int anInt2074;

	public void method930(int i, int i_0_) {
		buf[pos++] = (byte) (i >> 515509680);
		if (i_0_ > -93)
			anInt2014 = 31;
		buf[pos++] = (byte) (i >> 1197722312);
		buf[pos++] = (byte) i;
		anInt2019++;
	}

	public int getShort() {
		pos += 2;
		int i_2_ = ((0xff & buf[-1 + pos]) + (0xff00 & buf[-2
				+ pos] << -964924952));
		if ((i_2_ ^ 0xffffffff) < -32768)
			i_2_ -= 65536;
		return i_2_;
	}

	public int getByteC(byte i) {
		anInt2003++;
		if (i <= 14)
			return 86;
		return 0xff & -buf[pos++];
	}

	public int getInt() {
		pos += 4;
		return ((buf[-1 + pos] & 0xff) + ((0xff00 & buf[pos - 2] << -2041557112)
				+ ((0xff & buf[pos + -4]) << 1916375896) + (buf[-3
				+ pos] << -647192592 & 0xff0000)));
	}

	public static void method934(int i, boolean bool) {
		Class37_Sub17.aBoolean2165 = bool;
		if (Class37_Sub17.aBoolean2165) {
			Class83.byteVector.method993(false);
			for (int i_3_ = 0; i_3_ < 4; i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -14; i_4_++) {
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -14; i_5_++) {
						int i_6_ = Class83.byteVector.method996(
								1, 73);
						if (i_6_ == 1)
							Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_3_][i_4_][i_5_] = Class83.byteVector
									.method996(26, 86);
						else
							Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_3_][i_4_][i_5_] = -1;
					}
				}
			}
			Class83.byteVector.method988(true);
			int i_7_ = ((-Class83.byteVector.pos + NodeSub.anInt1844) / 16);
			Class37_Sub9_Sub36.anIntArrayArray3573 = new int[i_7_][4];
			for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
					Class37_Sub9_Sub36.anIntArrayArray3573[i_8_][i_9_] = Class83.byteVector
							.getInt2(82);
			}
			int i_10_ = Class83.byteVector.method956(2);
			int i_11_ = Class83.byteVector.method975(2);
			int i_12_ = Class83.byteVector.method975(2);
			int i_13_ = Class83.byteVector.getUnsignedByte();
			int i_14_ = Class83.byteVector.method984(i
					+ -1739943584);
			Class22.aByteArrayArray569 = new byte[i_7_][];
			Class37_Sub4_Sub11.anIntArray2712 = new int[i_7_];
			Class49.aByteArrayArray1005 = new byte[i_7_][];
			Class37_Sub9_Sub8.anIntArray3061 = new int[i_7_];
			Class66.anIntArray1261 = new int[i_7_];
			i_7_ = 0;
			for (int i_15_ = 0; i_15_ < 4; i_15_++) {
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -14; i_16_++) {
					for (int i_17_ = 0; i_17_ < 13; i_17_++) {
						int i_18_ = (Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_15_][i_16_][i_17_]);
						if ((i_18_ ^ 0xffffffff) != 0) {
							int i_19_ = (i_18_ & 0xffe102) >> -2065348562;
							int i_20_ = i_18_ >> -850334781 & 0x7ff;
							int i_21_ = (i_19_ / 8 << -1958982808) + i_20_ / 8;
							for (int i_22_ = 0; (i_7_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
								if (Class66.anIntArray1261[i_22_] == i_21_) {
									i_21_ = -1;
									break;
								}
							}
							if (i_21_ != -1) {
								Class66.anIntArray1261[i_7_] = i_21_;
								int i_23_ = i_21_ >> -1455900856 & 0xff;
								int i_24_ = i_21_ & 0xff;
								Class37_Sub4_Sub11.anIntArray2712[i_7_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
										.method123(
												(byte) 32,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class86.aClass16_1576,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_23_,
																						(byte) -114)),
																		Class71.aClass16_1359,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_24_,
																						(byte) -114)) })))));
								Class37_Sub9_Sub8.anIntArray3061[i_7_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
										.method123(
												(byte) 32,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class37_Sub9_Sub14.aClass16_3156,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_23_,
																						(byte) -114)),
																		Class71.aClass16_1359,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_24_,
																						(byte) -114)) })))));
								i_7_++;
							}
						}
					}
				}
			}
			Class37_Sub9_Sub22.method859((byte) -128, i_14_, i_10_, i_12_,
					i_13_, i_11_);
		} else {
			int i_25_ = Class83.byteVector.method956(2);
			int i_26_ = Class83.byteVector.getUnsignedByte();
			int i_27_ = Class83.byteVector.getUnsignedShort();
			int i_28_ = ((-Class83.byteVector.pos + NodeSub.anInt1844) / 16);
			Class37_Sub9_Sub36.anIntArrayArray3573 = new int[i_28_][4];
			for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_29_++) {
				for (int i_30_ = 0; i_30_ < 4; i_30_++)
					Class37_Sub9_Sub36.anIntArrayArray3573[i_29_][i_30_] = (Class83.byteVector
							.method979(Class37_Sub4_Sub7_Sub1_Sub1.method502(i,
									-52131576)));
			}
			int i_31_ = Class83.byteVector.method984(-1739943584);
			int i_32_ = Class83.byteVector.getUnsignedShort();
			Class49.aByteArrayArray1005 = new byte[i_28_][];
			Class37_Sub4_Sub11.anIntArray2712 = new int[i_28_];
			Class37_Sub9_Sub8.anIntArray3061 = new int[i_28_];
			Class22.aByteArrayArray569 = new byte[i_28_][];
			Class66.anIntArray1261 = new int[i_28_];
			boolean bool_33_ = false;
			if (((i_27_ / 8 ^ 0xffffffff) == -49 || (i_27_ / 8 ^ 0xffffffff) == -50)
					&& i_32_ / 8 == 48)
				bool_33_ = true;
			if ((i_27_ / 8 ^ 0xffffffff) == -49
					&& (i_32_ / 8 ^ 0xffffffff) == -149)
				bool_33_ = true;
			i_28_ = 0;
			for (int i_34_ = (i_27_ - 6) / 8; i_34_ <= (i_27_ - -6) / 8; i_34_++) {
				for (int i_35_ = (i_32_ + -6) / 8; ((i_32_ - -6) / 8 ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
					int i_36_ = i_35_ + (i_34_ << -398689144);
					if (!bool_33_
							|| ((i_35_ ^ 0xffffffff) != -50
									&& (i_35_ ^ 0xffffffff) != -150
									&& i_35_ != 147
									&& (i_34_ ^ 0xffffffff) != -51 && (i_34_ != 49 || (i_35_ ^ 0xffffffff) != -48))) {
						Class66.anIntArray1261[i_28_] = i_36_;
						Class37_Sub4_Sub11.anIntArray2712[i_28_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
								.method123(
										(byte) 32,
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class86.aClass16_1576,
																Class37_Sub9_Sub24
																		.method870(
																				i_34_,
																				(byte) -114),
																Class71.aClass16_1359,
																Class37_Sub9_Sub24
																		.method870(
																				i_35_,
																				(byte) -114) })))));
						Class37_Sub9_Sub8.anIntArray3061[i_28_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
								.method123(
										(byte) 32,
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class37_Sub9_Sub14.aClass16_3156,
																Class37_Sub9_Sub24
																		.method870(
																				i_34_,
																				(byte) -114),
																Class71.aClass16_1359,
																Class37_Sub9_Sub24
																		.method870(
																				i_35_,
																				(byte) -114) })))));
						i_28_++;
					}
				}
			}
			Class37_Sub9_Sub22.method859((byte) -128, i_32_, i_27_, i_25_,
					i_26_, i_31_);
		}
		if (i != 0)
			method983(30, -59);
		anInt2017++;
	}

	final String readGJString(byte i) {
		byte i_66_ = (buf[pos++]);
		if (i_66_ != 0)
			throw new IllegalStateException("Bad version number in gjstr2");
		int i_67_ = pos;
		while ((buf[pos++]) != 0) {
            /* empty */
		}
		int i_68_ = pos - (i_67_ + 1);
		if (i_68_ == 0)
			return "";
		return null;
	}

	public int getTriByte(int i) {
		pos += 3;
		anInt2008++;
		if (i != -26256544)
			aClass16Array2041 = null;
		return ((0xff & buf[-1 + pos]) + ((buf[pos
				+ -2] << -2586040 & 0xff00) + ((buf[-3 + pos] & 0xff) << -943002096)));
	}

	public int getInt1(int i) {
		if (i != 8191)
			method970(-10);
		anInt2048++;
		pos += 4;
		return ((buf[-3 + pos] & 0xff)
				+ ((0xff & buf[pos + -2]) << 24)
				+ (buf[-1 + pos] << 16 & 0xff0000) + (buf[pos
				+ -4] << 8 & 0xff00));
	}

	public int method937(int i, byte i_37_) {
		anInt2029++;
		int i_38_ = Class85.method1319(buf, i, pos, 448779536);
		method947(i_38_);
		if (i_37_ >= -60)
			return -44;
		return i_38_;
	}

	public byte method938(int i) {
		if (i < 67)
			return (byte) -45;
		anInt2035++;
		return (byte) -buf[pos++];
	}

	public int method939(int i) {
		anInt2013++;
		if (i != -22591)
			return 119;
		pos += 3;
		return (((0xff & buf[-3 + pos]) << 1935007024) - (-((0xff & buf[-1
				+ pos]) << -1972202808) - (buf[-2 + pos] & 0xff)));
	}

	public byte method940(boolean bool) {
		if (bool != true)
			method946((byte) -25, -96);
		anInt2071++;
		return (byte) (-buf[pos++] + 128);
	}

	public byte method941(byte i) {
		if (i < 67)
			aClass16_2044 = null;
		anInt2027++;
		return (byte) (-128 + buf[pos++]);
	}

	public int method942(int i) {
		anInt2028++;
		pos += i;
		int i_39_ = (((buf[pos + -1] & 0xff) << 975321608) + (buf[pos - 2] & 0xff));
		if (i_39_ > 32767)
			i_39_ -= 65536;
		return i_39_;
	}

	public void method943(int i, int i_40_) {
		anInt2064++;
		buf[pos++] = (byte) (i >> 917134568);
		buf[pos++] = (byte) i;
		buf[pos++] = (byte) (i >> -1641702632);
		int i_41_ = -29 / ((i_40_ - 69) / 55);
		buf[pos++] = (byte) (i >> -1646971440);
	}

	public RSString getRS2String() {
		anInt2007++;
		int curOffset = pos;
		while (buf[pos++] != 0) {
		}
		return Class37_Sub12.createRSStringFromBuffer(buf, pos - curOffset - 1, curOffset);
	}

	public void method945(int i_44_) {
		buf[pos++] = (byte) (i_44_ >> -1315578040);
		buf[pos++] = (byte) (i_44_ + 128);
	}

	public void method946(byte i, int i_45_) {
		if (i == -85) {
			anInt2052++;
			buf[pos++] = (byte) (-i_45_ + 128);
		}
	}

	public void method947(int i_46_) {
		buf[pos++] = (byte) (i_46_ >> 1886058264);
		buf[pos++] = (byte) (i_46_ >> 1687119120);
		buf[pos++] = (byte) (i_46_ >> -52131576);
		buf[pos++] = (byte) i_46_;
	}

	public void method948(int i) {
		buf[-i + (pos - 1)] = (byte) i;
	}

	public void method949(long l, byte i) {
		try {
			buf[pos++] = (byte) (int) (l >> 212278328);
			anInt2005++;
			int i_49_ = -87 % ((i - -8) / 42);
			buf[pos++] = (byte) (int) (l >> -1318144592);
			buf[pos++] = (byte) (int) (l >> 727548840);
			buf[pos++] = (byte) (int) (l >> -26256544);
			buf[pos++] = (byte) (int) (l >> -1736685672);
			buf[pos++] = (byte) (int) (l >> 2144842064);
			buf[pos++] = (byte) (int) (l >> -153256952);
			buf[pos++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("hc.BB("
					+ l + ',' + i + ')'));
		}
	}

	public static int method950(int i, int i_50_, int i_51_) {
		anInt2020++;
		int i_52_ = 1;
		while (i_51_ > 1) {
			if ((i_51_ & 0x1) != 0)
				i_52_ *= i_50_;
			i_51_ >>= 1;
			i_50_ *= i_50_;
		}
		if (i < 40)
			aClass16_2018 = null;
		if ((i_51_ ^ 0xffffffff) == -2)
			return i_52_ * i_50_;
		return i_52_;
	}

	public void method951(byte i, int i_53_) {
		anInt2060++;
		if (i_53_ >= 0 && i_53_ < 128)
			method964(104, i_53_);
		else if (i_53_ >= 0 && (i_53_ ^ 0xffffffff) > -32769)
			method965(i_53_ + 32768);
		else {
			if (i != 37)
				anApplet_Sub1_2023 = null;
			throw new IllegalArgumentException();
		}
	}

	public int method952(byte i) {
		anInt2074++;
		return buf[pos++] - 128 & 0xff;
	}

	public void method953(int i, long l) {
		do {
			try {
				method943((int) (l >> 1132103072), 127);
				anInt2024++;
				method943((int) l, 124);
				if (i == 1132103072)
					break;
				method981(-23, -125, (byte) 89, null);
			} catch (RuntimeException runtimeexception) {
				throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						("hc.CB(" + i + ',' + l + ')'));
			}
			break;
		} while (false);
	}

	public void method954(int i, int i_55_, int i_56_, byte[] is) {
		if (i_56_ != 4)
			aClass16Array2041 = null;
		for (int i_57_ = i_55_; (i_57_ ^ 0xffffffff) > (i + i_55_ ^ 0xffffffff); i_57_++)
			buf[pos++] = is[i_57_];
		anInt2042++;
	}

	public RSString method955(int i) {
		if (i != 255)
			getShort();
		anInt2026++;
		if (buf[pos] == 0) {
			pos++;
			return null;
		}
		return getRS2String();
	}

	public int method956(int i) {
		pos += i;
		anInt2067++;
		return (((0xff & buf[pos + -1]) << 1285954248) - -(-128
				+ buf[pos - 2] & 0xff));
	}

	public void method957(boolean bool, int i) {
		buf[pos++] = (byte) (128 + i);
		anInt2022++;
		if (bool == true)
			buf[pos++] = (byte) (i >> 1212891432);
	}

	public void method958(byte i, BigInteger biginteger,
			BigInteger biginteger_58_) {
		try {
			anInt2056++;
			int i_59_ = pos;
			if (i >= -88)
				method977(null, 76);
			pos = 0;
			byte[] is = new byte[i_59_];
			method968(0, i_59_, is, (byte) -53);
			BigInteger biginteger_60_ = new BigInteger(is);
			BigInteger biginteger_61_ = biginteger_60_;// .modPow(biginteger,
														// biginteger_58_);
			byte[] is_62_ = biginteger_61_.toByteArray();
			pos = 0;
			method964(113, is_62_.length);
			method954(is_62_.length, 0, 4, is_62_);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("hc.GB("
					+ i + ',' + (biginteger != null ? "{...}" : "null") + ','
					+ (biginteger_58_ != null ? "{...}" : "null") + ')'));
		}
	}

	public int method959(int i) {
		anInt2073++;
		int i_63_ = 14 / ((i - -66) / 33);
		int i_64_ = buf[pos] & 0xff;
		if ((i_64_ ^ 0xffffffff) <= -129)
			return -49152 + getUnsignedShort();
		return getUnsignedByte() - 64;
	}

	public void method960(byte i, int i_65_) {
		anInt2054++;
		if (i >= -2)
			method968(14, -86, null, (byte) 60);
		buf[-4 + pos + -i_65_] = (byte) (i_65_ >> 1841551704);
		buf[-i_65_ + pos + -3] = (byte) (i_65_ >> -1769798096);
		buf[pos + -i_65_ + -2] = (byte) (i_65_ >> 455591624);
		buf[-1 + pos + -i_65_] = (byte) i_65_;
	}

	public int method961(int i) {
		int i_66_ = i & buf[pos];
		anInt2050++;
		if (i_66_ >= 128)
			return -32768 + getUnsignedShort();
		return getUnsignedByte();
	}

	public void method962(int i, boolean bool) {
		buf[pos++] = (byte) i;
		buf[pos++] = (byte) (i >> -197350840);
		if (bool != false)
			anInt2014 = -77;
		anInt2047++;
	}

	public void method963(byte[] is, int i, int i_68_) {
		for (int id = i_68_ + (i - 1); id >= i_68_; id--)
			is[id] = buf[pos++];
	}

	public void method964(int i, int i_70_) {
		if (i < 94)
			method957(false, 1);
		buf[pos++] = (byte) i_70_;
		anInt2053++;
	}

	public void method965(int i_71_) {
		buf[pos++] = (byte) (i_71_ >> 848881960);
		buf[pos++] = (byte) i_71_;
	}

	public void method966(int i) {
		buf[pos++] = (byte) (i >> 444519440);
		buf[pos++] = (byte) (i >> 1930783512);
		buf[pos++] = (byte) i;
		buf[pos++] = (byte) (i >> -415486136);
	}

	public int method967(int i) {
		if (i != 255)
			aClass16_2044 = null;
		anInt2045++;
		return -buf[pos++] + 128 & 0xff;
	}

	public void method968(int i, int i_72_, byte[] is, byte i_73_) {
		anInt2061++;
		for (int i_74_ = i; i_74_ < i_72_ + i; i_74_++)
			is[i_74_] = buf[pos++];
		if (i_73_ != -53)
			method973(-97, 62);
	}

	public int getInt2(int i) {
		if (i <= 69)
			method964(100, -110);
		pos += 4;
		anInt2072++;
		return ((buf[-2 + pos] & 0xff)
				+ (0xff00 & buf[-1 + pos] << -336951128) + (((buf[pos
				+ -3] & 0xff) << -1404740744) + (buf[pos - 4] << -450265712 & 0xff0000)));
	}

	public int method970(int i) {
		pos += 2;
		anInt2033++;
		if (i != -2453)
			anInt2004 = -7;
		int i_75_ = ((0xff & -128 + buf[-1 + pos]) + (0xff00 & buf[pos
				+ -2] << 921263464));
		if ((i_75_ ^ 0xffffffff) < -32768)
			i_75_ -= 65536;
		return i_75_;
	}

	public long getLong(boolean bool) {
		anInt2066++;
		long l = 0xffffffffL & (long) getInt();
		long l_76_ = 0xffffffffL & (long) getInt();
		if (bool != false)
			return 29L;
		return l_76_ + (l << -1739943584);
	}

	public void method972(int i, int i_77_) {
		buf[pos++] = (byte) -i_77_;
		if (i != 8)
			method973(-42, -64);
		anInt2034++;
	}

	public void method973(int i, int i_78_) {
		if (i_78_ != -1629130328)
			aClass16_2038 = null;
		anInt2070++;
		buf[pos++] = (byte) i;
		buf[pos++] = (byte) (i >> 8);
		buf[pos++] = (byte) (i >> 16);
		buf[pos++] = (byte) (i >> 24);
	}

	public int method974(byte i) {
		anInt2030++;
		if (i >= -82)
			getLong(false);
		int i_79_ = 0;
		int i_80_;
		for (i_80_ = buf[pos++]; i_80_ < 0; i_80_ = buf[pos++])
			i_79_ = (i_79_ | i_80_ & 0x7f) << -1019326105;
		return i_80_ | i_79_;
	}

	public int method975(int i) {
		anInt2051++;
		pos += i;
		return ((0xff00 & buf[pos - 1] << 8) + (0xff & buf[-2
				+ pos]));
	}

	public void method976(int i, byte i_81_) {
		anInt2058++;
		if (i_81_ == 16) {
			if ((i & ~0x7f ^ 0xffffffff) != -1) {
				if ((i & ~0x3fff) != 0) {
					if ((~0x1fffff & i ^ 0xffffffff) != -1) {
						if ((~0xfffffff & i) != 0)
							method964(102, 0x80 | i >>> -1205282660);
						method964(i_81_ + 79, 0x80 | i >>> 341586613);
					}
					method964(127, i >>> 1607471566 | 0x80);
				}
				method964(97, (0x400d | i) >>> 946412423);
			}
			method964(i_81_ ^ 0x76, 0x7f & i);
		}
	}

	public void method977(RSString rSString, int i) {
		anInt2040++;
		pos += rSString.method177(rSString.length(), pos, buf, 0);
		buf[pos++] = (byte) 0;
	}

	public int getUnsignedByte() {
		return 0xff & buf[pos++];
	}

	public byte getSignedByte() {
		return buf[pos++];
	}

	public int method979(int i) {
		if (i != -52131576)
			method952((byte) -30);
		pos += 4;
		anInt2015++;
		return ((buf[-1 + pos] << 1965597560 & ~0xffffff)
				- -((buf[-2 + pos] & 0xff) << -1117009712) + ((buf[pos
				+ -3] << -1854058264 & 0xff00) - -(buf[pos
				+ -4] & 0xff)));
	}

	public int getUnsignedShort() {
		pos += 2;
		anInt2068++;
		return ((0xff00 & buf[-2 + pos] << 1982174056) + (0xff & buf[pos - 1]));
	}

	public int readBigSmart() {
		if(buf[pos] >= 0) {
			int value = getUnsignedShort();
			return value == 32767 ? -1 : value;
		} else {
			return getInt() & 2147483647;
		}
	}

	public void method981(int i, int i_83_, byte i_84_, int[] is) {
		anInt2046++;
		int i_85_ = pos;
		int i_86_ = (i - i_83_) / 8;
		pos = i_83_;
		for (int i_87_ = 0; i_86_ > i_87_; i_87_++) {
			int i_88_ = getInt();
			int i_89_ = getInt();
			int i_90_ = -957401312;
			int i_91_ = -1640531527;
			int i_92_ = 32;
			while (i_92_-- > 0) {
				i_89_ -= (i_88_ + (i_88_ >>> 867048645 ^ i_88_ << 2136205540) ^ is[i_90_ >>> -307927573 & 0x4ba00003]
						+ i_90_);
				i_90_ -= i_91_;
				i_88_ -= i_90_
						- -is[i_90_ & 0x3]
						^ ((i_89_ << -1280432060 ^ i_89_ >>> 481887621) - -i_89_);
			}
			pos -= 8;
			method947(i_88_);
			method947(i_89_);
		}
		if (i_84_ >= -54)
			method968(-71, 52, null, (byte) 29);
		pos = i_85_;
	}

	public byte method982(byte i) {
		if (i < 89)
			method964(-94, 1);
		anInt2012++;
		return buf[pos++];
	}

	public static int method983(int i, int i_93_) {
		Class37_Sub4_Sub5 class37_sub4_sub5 = Class37_Sub3_Sub3.method387(i,
				9199);
		anInt2036++;
		int i_94_ = class37_sub4_sub5.anInt2598;
		int i_95_ = class37_sub4_sub5.anInt2596;
		if (i_93_ < 108)
			method983(46, -110);
		int i_96_ = class37_sub4_sub5.anInt2594;
		int i_97_ = Class37_Sub4_Sub10.anIntArray2689[i_96_ + -i_94_];
		return i_97_ & Class37_Sub23.varpData[i_95_] >> i_94_;
	}

	public int method984(int i) {
		pos += 2;
		anInt2002++;
		if (i != -1739943584)
			method930(107, -126);
		return ((buf[-2 + pos] << -1277201944 & 0xff00) + (0xff & buf[pos
				+ -1]
				+ -128));
	}

	public static void method985(boolean bool) {
		aClass16_2001 = null;
		aClass15_2025 = null;
		hiddenString = null;
		aClass16Array2041 = null;
		aClass16_2006 = null;
		aClass16_2021 = null;
		aClass16_2038 = null;
		aClass16_2044 = null;
		if (bool == false)
			aClass16_2018 = null;
	}

	public ByteVector(int i) {
		buf = Class83.method1314((byte) 17, i);
		pos = 0;
	}

	public ByteVector(byte[] is) {
		pos = 0;
		buf = is;
	}

	public void method1768(int arg0, int arg1, byte arg2, int[] arg3) {
		try {
			for (int i = arg0; i < arg0 + arg1; i++)
				arg3[i] = buf[pos++];
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		anInt2004 = 5063219;
		anInt2032 = 0;
		anApplet_Sub1_2023 = null;
		aClass16_2038 = Class37_Sub2.create_rsstring("<col=ff7000>");
		aClass16_2044 = Class37_Sub2.create_rsstring("Konfig geladen)3");
		aClass16_2021 = Class37_Sub2.create_rsstring("OFF");
		anInt2031 = 3353893;
		aClass16_2001 = Class37_Sub2.create_rsstring("und loggen sich dann erneut ein)3");
		aClass16Array2041 = new RSString[100];
		anInt2009 = 0;
		aClass16_2006 = aClass16_2021;
		aClass16_2018 = Class37_Sub2.create_rsstring("Hidden");
		hiddenString = aClass16_2018;
	}
}
