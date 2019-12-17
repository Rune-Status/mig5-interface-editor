package org.ie.client;

/* Class37_Sub9_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub20 extends Class37_Sub9 {
	public static int anInt3275;
	public static int anInt3276;
	public static int anInt3277;
	public int anInt3278 = 0;
	public int anInt3279;
	public static int anInt3280;
	public static Class23 aClass23_3281;
	public int anInt3282 = 0;
	public int anInt3283;
	public static int anInt3284;
	public int anInt3285;
	public int anInt3286;
	public int anInt3287;
	public static int anInt3288;
	public static int anInt3289;
	public static int anInt3290;
	public static int anInt3291;
	public int anInt3292;
	public static int anInt3293;
	public static int anInt3294;
	public int anInt3295 = 0;
	public static Deque aClass58_3296 = new Deque();
	public static Hashtable aClass13_3297;
	public static Class19 aClass19_3298;
	public static RSString aClass16_3299 = Class37_Sub2.create_rsstring("Ihr Charakter)2Profil wird in:");
	public static int[] anIntArray3300 = new int[500];
	public static int anInt3301 = 0;
	public static Sprite[] aClass37_Sub4_Sub9_Sub3Array3302;

	public static Class37_Sub4_Sub2 method844(byte i) {
		int i_0_ = 85 % ((33 - i) / 62);
		anInt3289++;
		if (Class37_Sub2.aClass37_Sub4_Sub2_1826 == null)
			Class37_Sub2.aClass37_Sub4_Sub2_1826 = new Class37_Sub4_Sub2();
		return Class37_Sub2.aClass37_Sub4_Sub2_1826;
	}

	public Class37_Sub9_Sub20() {
		super(1, false);
	}

	public int[][] method759(byte i, int i_1_) {
		anInt3280++;
		int[][] is = aClass33_1946.method298(false, i_1_);
		if (i <= 111)
			return null;
		if (aClass33_1946.aBoolean767) {
			int[][] is_2_ = this.method762(0, i_1_, (byte) -111);
			int[] is_3_ = is_2_[0];
			int[] is_4_ = is_2_[1];
			int[] is_5_ = is_2_[2];
			int[] is_6_ = is[0];
			int[] is_7_ = is[1];
			int[] is_8_ = is[2];
			for (int i_9_ = 0; (Class32.anInt743 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				method851(is_4_[i_9_], is_5_[i_9_], (byte) 125, is_3_[i_9_]);
				for (anInt3292 += anInt3295; anInt3292 < 0; anInt3292 += 4096) {
					/* empty */
				}
				anInt3283 += anInt3282;
				anInt3279 += anInt3278;
				for (/**/; (anInt3292 ^ 0xffffffff) < -4097; anInt3292 -= 4096) {
					/* empty */
				}
				if ((anInt3283 ^ 0xffffffff) > -1)
					anInt3283 = 0;
				if ((anInt3283 ^ 0xffffffff) < -4097)
					anInt3283 = 4096;
				if ((anInt3279 ^ 0xffffffff) > -1)
					anInt3279 = 0;
				if (anInt3279 > 4096)
					anInt3279 = 4096;
				method845(anInt3283, anInt3279, anInt3292, -8729);
				is_6_[i_9_] = anInt3286;
				is_7_[i_9_] = anInt3287;
				is_8_[i_9_] = anInt3285;
			}
		}
		return is;
	}

	public void method845(int i, int i_10_, int i_11_, int i_12_) {
		anInt3293++;
		int i_13_ = (i > 2048 ? -(i * i_10_ >> -1109094484) + (i + i_10_) : i
				* (4096 + i_10_) >> 718840332);
		if (i_12_ != -8729)
			anIntArray3300 = null;
		if ((i_13_ ^ 0xffffffff) >= -1)
			anInt3286 = anInt3287 = anInt3285 = i;
		else {
			i_11_ *= 6;
			int i_14_ = i - (-i - -i_13_);
			int i_15_ = i_11_ >> -452763060;
			int i_16_ = (i_13_ - i_14_ << 1425185164) / i_13_;
			int i_17_ = i_11_ + -(i_15_ << -1262278164);
			int i_18_ = i_13_;
			i_18_ = i_18_ * i_16_ >> -1507498100;
			i_18_ = i_18_ * i_17_ >> -853656660;
			int i_19_ = i_18_ + i_14_;
			int i_20_ = -i_18_ + i_13_;
			int i_21_ = i_15_;
			while_84_: do {
				while_83_: do {
					while_82_: do {
						while_81_: do {
							do {
								if ((i_21_ ^ 0xffffffff) != -1) {
									if (i_21_ != 1) {
										if (i_21_ != 2) {
											if (i_21_ != 3) {
												if (i_21_ != 4) {
													if (i_21_ != 5)
														break while_84_;
												} else
													break while_82_;
												break while_83_;
											}
										} else
											break;
										break while_81_;
									}
								} else {
									anInt3285 = i_14_;
									anInt3287 = i_19_;
									anInt3286 = i_13_;
									return;
								}
								anInt3285 = i_14_;
								anInt3286 = i_20_;
								anInt3287 = i_13_;
								return;
							} while (false);
							anInt3285 = i_19_;
							anInt3287 = i_13_;
							anInt3286 = i_14_;
							return;
						} while (false);
						anInt3286 = i_14_;
						anInt3287 = i_20_;
						anInt3285 = i_13_;
						return;
					} while (false);
					anInt3285 = i_13_;
					anInt3286 = i_19_;
					anInt3287 = i_14_;
					return;
				} while (false);
				anInt3286 = i_13_;
				anInt3287 = i_14_;
				anInt3285 = i_20_;
			} while (false);
		}
	}

	public static void method846(long l, byte i) {
		try {
			anInt3291++;
			if ((l ^ 0xffffffffffffffffL) < -1L && i == 58) {
				if (l % 10L == 0L) {
					Class37_Sub15.method1007(-1L + l, 256);
					Class37_Sub15.method1007(1L, i ^ 0x13a);
				} else
					Class37_Sub15.method1007(l, 256);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("og.B("
					+ l + ',' + i + ')'));
		}
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if (bool != true)
			anInt3295 = -8;
		int i_22_ = i;
		while_85_: do {
			do {
				if (i_22_ != 0) {
					if ((i_22_ ^ 0xffffffff) != -2) {
						if ((i_22_ ^ 0xffffffff) == -3)
							break;
						break while_85_;
					}
				} else {
					anInt3295 = class37_sub11.getShort();
					break while_85_;
				}
				anInt3278 = (class37_sub11.method982((byte) 92) << 1097188876) / 100;
				break while_85_;
			} while (false);
			anInt3282 = (class37_sub11.method982((byte) 96) << 260563564) / 100;
		} while (false);
		anInt3276++;
	}

	public static void method847(byte i,
			Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1,
			Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1_23_) {
		try {
			if (Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809 == null)
				Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809 = Class33
						.method302(112, Class37_Sub9_Sub27.aClass16_3415,
								Class37_Sub9_Sub33.aClass16_3524,
								Class60.aClass15_Sub1_1151);
			if (Class37_Sub9_Sub13.aClass37_Sub4_Sub9_Sub1Array3139 == null)
				Class37_Sub9_Sub13.aClass37_Sub4_Sub9_Sub1Array3139 = Class46
						.method1104(Class60.aClass15_Sub1_1151,
								Class37_Sub9_Sub33.aClass16_3524, 999999999,
								Class37_Sub9_Sub32.aClass16_3508);
			if (Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158 == null)
				Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158 = Class46
						.method1104(Class60.aClass15_Sub1_1151,
								Class37_Sub9_Sub33.aClass16_3524, 999999999,
								Class47.aClass16_998);
			anInt3284++;
			if (Class59.aClass37_Sub4_Sub9_Sub1Array1131 == null)
				Class59.aClass37_Sub4_Sub9_Sub1Array1131 = Class46.method1104(
						Class60.aClass15_Sub1_1151,
						Class37_Sub9_Sub33.aClass16_3524, 999999999,
						Class37_Sub9_Sub7.aClass16_3033);
			Graphics2D.method578(0, 23, 765, 480, 0);
			Graphics2D.method583(0, 0, 125, 23, 12425273, 9135624);
			Graphics2D.method583(125, 0, 640, 23, 5197647, 2697513);
			class37_sub4_sub9_sub2_sub1.method606(
					Class37_Sub9_Sub11.aClass16_3103, 62, 15, 0, -1);
			if (Class59.aClass37_Sub4_Sub9_Sub1Array1131 != null) {
				Class59.aClass37_Sub4_Sub9_Sub1Array1131[1].method597(140, 1);
				class37_sub4_sub9_sub2_sub1_23_.method607(
						Class60.aClass16_1153, 152, 10, 16777215, -1);
				Class59.aClass37_Sub4_Sub9_Sub1Array1131[0].method597(140, 12);
				class37_sub4_sub9_sub2_sub1_23_.method607(
						Class88.aClass16_1602, 152, 21, 16777215, -1);
			}
			if (Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158 != null) {
				int i_24_ = 280;
				int i_25_ = 390;
				if ((Class87.anIntArray1587[0] ^ 0xffffffff) == -1
						&& (Class37_Sub12.anIntArray2097[0] ^ 0xffffffff) == -1)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[2]
							.method597(i_24_, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[0]
							.method597(i_24_, 4);
				if (Class87.anIntArray1587[0] == 0
						&& Class37_Sub12.anIntArray2097[0] == 1)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[3]
							.method597(i_24_ - -15, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[1]
							.method597(i_24_ - -15, 4);
				class37_sub4_sub9_sub2_sub1.method607(
						(NodeSub.aClass16_1856), 32 + i_24_, 17, 16777215,
						-1);
				int i_26_ = 610;
				int i_27_ = 500;
				if (Class87.anIntArray1587[0] == 1
						&& Class37_Sub12.anIntArray2097[0] == 0)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[2]
							.method597(i_25_, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[0]
							.method597(i_25_, 4);
				if ((Class87.anIntArray1587[0] ^ 0xffffffff) != -2
						|| (Class37_Sub12.anIntArray2097[0] ^ 0xffffffff) != -2)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[1]
							.method597(i_25_ - -15, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[3]
							.method597(15 + i_25_, 4);
				class37_sub4_sub9_sub2_sub1.method607(
						(Class37_Sub9_Sub29.aClass16_3443), 32 + i_25_, 17,
						16777215, -1);
				if ((Class87.anIntArray1587[0] ^ 0xffffffff) == -3
						&& (Class37_Sub12.anIntArray2097[0] ^ 0xffffffff) == -1)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[2]
							.method597(i_27_, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[0]
							.method597(i_27_, 4);
				if (Class87.anIntArray1587[0] == 2
						&& Class37_Sub12.anIntArray2097[0] == 1)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[3]
							.method597(15 + i_27_, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[1]
							.method597(15 + i_27_, 4);
				class37_sub4_sub9_sub2_sub1.method607(
						(Class37_Sub9_Sub24.aClass16_3371), i_27_ - -32, 17,
						16777215, -1);
				if (Class87.anIntArray1587[0] == 3
						&& Class37_Sub12.anIntArray2097[0] == 0)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[2]
							.method597(i_26_, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[0]
							.method597(i_26_, 4);
				if ((Class87.anIntArray1587[0] ^ 0xffffffff) != -4
						|| Class37_Sub12.anIntArray2097[0] != 1)
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[1]
							.method597(i_26_ + 15, 4);
				else
					Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158[3]
							.method597(15 + i_26_, 4);
				class37_sub4_sub9_sub2_sub1.method607(
						(Class37_Sub4_Sub4.aClass16_2568), i_26_ - -32, 17,
						16777215, -1);
			}
			Graphics2D.method578(708, 4, 50, 16, 0);
			class37_sub4_sub9_sub2_sub1_23_.method606(
					(Class37_Sub9_Sub23.aClass16_3347), 733, 16, 16777215, -1);
			Class37_Sub9_Sub17.anInt3218 = -1;
			if (Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809 != null) {
				int i_28_ = 88;
				int i_29_ = 19;
				int i_30_ = 765 / (i_28_ + 1);
				int i_31_ = 480 / (1 + i_29_);
				int i_32_;
				int i_33_;
				do {
					i_32_ = i_31_;
					i_33_ = i_30_;
					if ((i_31_ * (-1 + i_30_) ^ 0xffffffff) <= (Class37_Sub14.anInt2129 ^ 0xffffffff))
						i_30_--;
					if (i_30_ * (-1 + i_31_) >= Class37_Sub14.anInt2129)
						i_31_--;
					if ((Class37_Sub14.anInt2129 ^ 0xffffffff) >= ((-1 + i_31_)
							* i_30_ ^ 0xffffffff))
						i_31_--;
				} while ((i_32_ ^ 0xffffffff) != (i_31_ ^ 0xffffffff)
						|| i_33_ != i_30_);
				i_32_ = (-(i_30_ * i_28_) + 765) / (i_30_ - -1);
				if ((i_32_ ^ 0xffffffff) < -6)
					i_32_ = 5;
				i_33_ = (480 + -(i_29_ * i_31_)) / (1 + i_31_);
				if ((i_33_ ^ 0xffffffff) < -6)
					i_33_ = 5;
				int i_34_ = (-(i_31_ * i_29_) + (480 - (i_31_ + -1) * i_33_)) / 2;
				int i_35_ = i_34_ + 23;
				int i_36_ = (-((-1 + i_30_) * i_32_) + (765 - i_28_ * i_30_)) / 2;
				int i_37_ = i_36_;
				int i_38_ = 0;
				for (int i_39_ = 0; i_39_ < Class37_Sub14.anInt2129; i_39_++) {
					Class56 class56 = InterfaceListener.aClass56Array1933[i_39_];
					RSString rSString = Class37_Sub9_Sub24.method870(
							class56.anInt1093, (byte) -114);
					boolean bool = true;
					if ((class56.anInt1093 ^ 0xffffffff) == 0) {
						bool = false;
						rSString = ByteVector.aClass16_2006;
					} else if ((class56.anInt1093 ^ 0xffffffff) < -1981) {
						rSString = Class37_Sub25.aClass16_2275;
						bool = false;
					}
					if (((i_37_ ^ 0xffffffff) < (Class37_Sub4_Sub7_Sub7.lastMouseX ^ 0xffffffff))
							|| ((Class37_Sub9_Sub1.lastMouseY ^ 0xffffffff) > (i_35_ ^ 0xffffffff))
							|| i_28_ + i_37_ <= Class37_Sub4_Sub7_Sub7.lastMouseX
							|| ((Class37_Sub9_Sub1.lastMouseY ^ 0xffffffff) <= (i_35_
									+ i_29_ ^ 0xffffffff)) || !bool)
						Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809[class56.aBoolean1082 ? 1
								: 0].method652(i_37_, i_35_);
					else {
						Class37_Sub9_Sub17.anInt3218 = i_39_;
						Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809[class56.aBoolean1082 ? 1
								: 0].method637(i_37_, i_35_, 128, 16777215);
					}
					if (Class37_Sub9_Sub13.aClass37_Sub4_Sub9_Sub1Array3139 != null)
						Class37_Sub9_Sub13.aClass37_Sub4_Sub9_Sub1Array3139[class56.anInt1090
								+ (!class56.aBoolean1082 ? 0 : 8)].method597(
								29 + i_37_, i_35_);
					class37_sub4_sub9_sub2_sub1.method606(Class37_Sub9_Sub24
							.method870(class56.anInt1089, (byte) -114),
							i_37_ + 15, 5 + (i_35_ - -(i_29_ / 2)), 0, -1);
					class37_sub4_sub9_sub2_sub1_23_.method606(rSString,
							60 + i_37_, 5 + (i_35_ + (i_29_ / 2)), 268435455,
							-1);
					i_35_ += i_29_ + i_33_;
					if (++i_38_ >= i_31_) {
						i_35_ = i_34_ + 23;
						i_37_ += i_32_ - -i_28_;
						i_38_ = 0;
					}
				}
			}
			int i_40_ = -3 / ((-6 - i) / 51);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("og.I("
					+ i
					+ ','
					+ (class37_sub4_sub9_sub2_sub1 != null ? "{...}" : "null")
					+ ','
					+ (class37_sub4_sub9_sub2_sub1_23_ != null ? "{...}"
							: "null") + ')'));
		}
	}

	public static int method848(Class15 class15, int i, Class15 class15_41_) {
		try {
			anInt3275++;
			int i_42_ = 0;
			if (class15.method130(Class37_Sub9_Sub21.aClass16_3312,
					Class37_Sub9_Sub33.aClass16_3524, -113))
				i_42_++;
			if (class15_41_.method130(Class50.aClass16_1013,
					Class37_Sub9_Sub33.aClass16_3524, -100))
				i_42_++;
			if (class15_41_.method130(Class4.aClass16_105,
					Class37_Sub9_Sub33.aClass16_3524, -104))
				i_42_++;
			if (class15_41_.method130(Class37_Sub9_Sub19.aClass16_3269,
					Class37_Sub9_Sub33.aClass16_3524, -98))
				i_42_++;
			int i_43_ = 94 % ((i - -67) / 43);
			if (class15_41_.method130(Class32.aClass16_730,
					Class37_Sub9_Sub33.aClass16_3524, -110))
				i_42_++;
			if (class15_41_.method130(Class37_Sub9_Sub21.aClass16_3319,
					Class37_Sub9_Sub33.aClass16_3524, -93))
				i_42_++;
			class15_41_.method130(Class37_Sub9_Sub27.aClass16_3415,
					Class37_Sub9_Sub33.aClass16_3524, -124);
			class15_41_.method130(Class37_Sub9_Sub32.aClass16_3508,
					Class37_Sub9_Sub33.aClass16_3524, -126);
			class15_41_.method130(Class47.aClass16_998,
					Class37_Sub9_Sub33.aClass16_3524, -103);
			class15_41_.method130(Class37_Sub9_Sub7.aClass16_3033,
					Class37_Sub9_Sub33.aClass16_3524, -118);
			class15_41_.method130(Class37_Sub4_Sub10.aClass16_2678,
					Class37_Sub9_Sub33.aClass16_3524, -69);
			return i_42_;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("og.K("
					+ (class15 != null ? "{...}" : "null") + ',' + i + ','
					+ (class15_41_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method849(byte i) {
		aClass58_3296 = null;
		aClass19_3298 = null;
		if (i != -86)
			aClass23_3281 = null;
		aClass13_3297 = null;
		aClass37_Sub4_Sub9_Sub3Array3302 = null;
		aClass16_3299 = null;
		aClass23_3281 = null;
		anIntArray3300 = null;
	}

	public static ClientScriptDef list(boolean bool, int i) {
		System.out.println("fetching script: "+i);
		anInt3294++;
		ClientScriptDef class37_sub4_sub6 = ((ClientScriptDef) RuntimeException_Sub1.aClass65_1632.get((long) i));
		if (bool != true)
			return null;
		if (class37_sub4_sub6 != null)
			return class37_sub4_sub6;
		byte[] is = Class37_Sub9_Sub34.aClass15_Sub1_3555.getFile(i, 0);
		if (is == null)
			return null;
		class37_sub4_sub6 = new ClientScriptDef();
		ByteVector buffer = new ByteVector(is);
		buffer.pos = -2 + buffer.buf.length;
		int len = buffer.getUnsignedShort();
		int i_20_ = -14 + buffer.buf.length - len;
		buffer.pos = i_20_;
		int i_21_ = buffer.getInt();
		class37_sub4_sub6.anInt2614 = buffer.getUnsignedShort();
		class37_sub4_sub6.anInt2616 = buffer.getUnsignedShort();
		class37_sub4_sub6.anInt2623 = buffer.getUnsignedShort();
		class37_sub4_sub6.anInt2618 = buffer.getUnsignedShort();
		int i_22_ = buffer.getUnsignedByte();
		if (i_22_ > 0) {
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_23_++) {
				int i_24_ = buffer.getShort();
				while ((i_24_-- ^ 0xffffffff) < -1) {
					int i_25_ = buffer.getInt();
					int optionMask = buffer.getInt();
				}
			}
		}
		buffer.pos = 0;
		class37_sub4_sub6.name = buffer.method955(255);
		class37_sub4_sub6.aClass16Array2617 = new RSString[i_21_];
		class37_sub4_sub6.values = new int[i_21_];
		class37_sub4_sub6.opcodes = new int[i_21_];
		int i_27_ = 0;
		while (i_20_ > buffer.pos) {
			int opcode = buffer.getUnsignedShort();
			if (opcode == 3)
				class37_sub4_sub6.aClass16Array2617[i_27_] = buffer.getRS2String();
			else if (opcode < 100 && opcode != 21 && (opcode ^ 0xffffffff) != -39 && (opcode ^ 0xffffffff) != -40)
				class37_sub4_sub6.values[i_27_] = buffer.getInt();
			else
				class37_sub4_sub6.values[i_27_] = buffer.getUnsignedByte();
			class37_sub4_sub6.opcodes[i_27_++] = opcode;
		}
		RuntimeException_Sub1.aClass65_1632.put(class37_sub4_sub6, (long) i);
		return class37_sub4_sub6;
	}

	public void method851(int i, int i_47_, byte i_48_, int i_49_) {
		if (i_48_ < 116)
			method849((byte) 15);
		anInt3288++;
		int i_50_ = (i ^ 0xffffffff) <= (i_49_ ^ 0xffffffff) ? i : i_49_;
		i_50_ = i_47_ > i_50_ ? i_47_ : i_50_;
		int i_51_ = (i_49_ ^ 0xffffffff) > (i ^ 0xffffffff) ? i_49_ : i;
		i_51_ = i_51_ > i_47_ ? i_47_ : i_51_;
		anInt3283 = (i_50_ + i_51_) / 2;
		int i_52_ = -i_51_ + i_50_;
		if (i_52_ > 0) {
			if ((anInt3283 ^ 0xffffffff) < -1
					&& (anInt3283 ^ 0xffffffff) > -4097)
				anInt3279 = (i_52_ << -421234420)
						/ (anInt3283 > 2048 ? -(2 * anInt3283) + 8192
								: 2 * anInt3283);
			int i_53_ = (i_50_ + -i_49_ << 1156941964) / i_52_;
			int i_54_ = (i_50_ + -i << -24878260) / i_52_;
			int i_55_ = (i_50_ - i_47_ << -1619677972) / i_52_;
			if (i_50_ == i_49_)
				anInt3292 = i_51_ == i ? i_55_ + 20480 : -i_54_ + 4096;
			else if ((i_50_ ^ 0xffffffff) == (i ^ 0xffffffff))
				anInt3292 = i_47_ == i_51_ ? 4096 + i_53_ : 12288 - i_55_;
			else
				anInt3292 = ((i_51_ ^ 0xffffffff) == (i_49_ ^ 0xffffffff) ? 12288 - -i_54_
						: 20480 + -i_53_);
			anInt3292 /= 6;
		}
	}

	public static void method852(Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1,
			boolean bool) {
		if (bool != true)
			method844((byte) 75);
		class37_sub4_sub7_sub1.anInt3665 = 0;
		int i = class37_sub4_sub7_sub1.firstDistanceSpeed - Class37_Sub7.loopCycle;
		int i_56_ = (class37_sub4_sub7_sub1.anInt3683 * 64 + 128 * class37_sub4_sub7_sub1.localX);
		class37_sub4_sub7_sub1.anInt3666 += (-class37_sub4_sub7_sub1.anInt3666 + i_56_) / i;
		anInt3290++;
		int i_57_ = (class37_sub4_sub7_sub1.anInt3683 * 64 + class37_sub4_sub7_sub1.localY * 128);
		class37_sub4_sub7_sub1.anInt3642 += (i_57_ + -class37_sub4_sub7_sub1.anInt3642) / i;
		if (class37_sub4_sub7_sub1.walkingFace == 0)
			class37_sub4_sub7_sub1.anInt3681 = 1024;
		if (class37_sub4_sub7_sub1.walkingFace == 1)
			class37_sub4_sub7_sub1.anInt3681 = 1536;
		if (class37_sub4_sub7_sub1.walkingFace == 2)
			class37_sub4_sub7_sub1.anInt3681 = 0;
		if (class37_sub4_sub7_sub1.walkingFace == 3)
			class37_sub4_sub7_sub1.anInt3681 = 512;
	}

	static {
		aClass13_3297 = new Hashtable(4096);
	}
}
