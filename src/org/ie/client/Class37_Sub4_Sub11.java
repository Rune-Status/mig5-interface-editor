package org.ie.client;

/* Class37_Sub4_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub11 extends NodeSub {
	public RSString[] aClass16Array2691;
	public int anInt2692;
	public int anInt2693;
	public boolean aBoolean2694 = true;
	public static int anInt2695;
	public int anInt2696;
	public static int anInt2697;
	public int anInt2698;
	public int anInt2699;
	public boolean aBoolean2700;
	public int[] anIntArray2701;
	public int[] anIntArray2702;
	public static int anInt2703;
	public static RSString aClass16_2704;
	public int anInt2705;
	public int anInt2706;
	public int anInt2707;
	public int anInt2708;
	public int anInt2709;
	public static int anInt2710;
	public short[] aShortArray2711;
	public static int[] anIntArray2712;
	public int anInt2713;
	public int[] anIntArray2714;
	public short[] aShortArray2715;
	public static int anInt2716;
	public int anInt2717;
	public short[] aShortArray2718;
	public int anInt2719;
	public static int anInt2720;
	public static int anInt2721;
	public static int anInt2722;
	public static RSString aClass16_2723 = Class37_Sub2.create_rsstring(
			"gelb:");
	public static int anInt2724;
	public int anInt2725;
	public int anInt2726;
	public int anInt2727;
	public boolean aBoolean2728;
	public static int anInt2729;
	public int anInt2730;
	public int anInt2731;
	public int[] anIntArray2732;
	public int anInt2733;
	public static int anInt2734;
	public static Class37_Sub19 aClass37_Sub19_2735;
	public static boolean aBoolean2736 = false;
	public boolean aBoolean2737;
	public int anInt2738;
	public int anInt2739;
	public int anInt2740;
	public short[] aShortArray2741;
	public static int anInt2742;
	public int anInt2743;
	public boolean aBoolean2744;
	public RSString aClass16_2745;
	public int anInt2746;
	public boolean aBoolean2747;
	public static int anInt2748;
	public int anInt2749;
	public boolean aBoolean2750;
	public int anInt2751;
	public static RSString aClass16_2752;

	public Class37_Sub4_Sub11 method681(byte i) {
		int i_0_ = -1;
		anInt2729++;
		if ((anInt2707 ^ 0xffffffff) == 0) {
			if (anInt2693 != -1)
				i_0_ = Class37_Sub23.varpData[anInt2693];
		} else
			i_0_ = ByteVector.method983(anInt2707, 111);
		if (i <= 88)
			method685(53);
		if ((i_0_ ^ 0xffffffff) > -1 || anIntArray2702.length <= i_0_
				|| anIntArray2702[i_0_] == -1)
			return null;
		return Class37_Sub9_Sub8.method794(anIntArray2702[i_0_], 28067);
	}

	public Class37_Sub4_Sub7_Sub6 method682(int i, int i_1_, int i_2_,
			int i_3_, int[][] is, int i_4_, int i_5_,
			Class37_Sub4_Sub12 class37_sub4_sub12, int i_6_) {
		try {
			anInt2748++;
			long l;
			if (anIntArray2732 != null)
				l = (long) ((anInt2746 << -1667699286) - -(i_2_ << -2059436253) + i_6_);
			else
				l = (long) ((anInt2746 << 1009862442) + i_6_);
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class37_Sub4_Sub12.aClass65_2770
					.get(l));
			if (i_5_ <= 5)
				aClass16Array2691 = null;
			if (class37_sub4_sub7_sub6 == null) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_2_,
						-76, i_6_);
				if (class37_sub4_sub7_sub4 == null)
					return null;
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
						anInt2717 + 64, 5 * anInt2739 + 768, -50, -10, -50,
						true, true);
				Class37_Sub4_Sub12.aClass65_2770.put(class37_sub4_sub7_sub6, l);
			}
			if (class37_sub4_sub12 == null && anInt2698 == -1)
				return class37_sub4_sub7_sub6;
			if (class37_sub4_sub12 != null)
				class37_sub4_sub7_sub6 = class37_sub4_sub12.method694(i_3_,
						i_6_, 1524262960, class37_sub4_sub7_sub6);
			else
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method559(true);
			if (anInt2698 >= 0)
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method548(is,
						i_1_, i_4_, i, false, anInt2698);
			return class37_sub4_sub7_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("lh.J("
					+ i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_
					+ ',' + (class37_sub4_sub12 != null ? "{...}" : "null")
					+ ',' + i_6_ + ')'));
		}
	}

	public Class37_Sub4_Sub7_Sub6 method683(int i, int[][] is, int i_7_,
			int i_8_, int i_9_, boolean bool, int i_10_) {
		long l;
		if (anIntArray2732 != null)
			l = (long) (i + ((i_10_ << -201244381) + (anInt2746 << 1728420074)));
		else
			l = (long) (i + (anInt2746 << 471355402));
		anInt2722++;
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class72.aClass65_1371
				.get(l));
		if (class37_sub4_sub7_sub6 == null) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_10_,
					-91, i);
			if (class37_sub4_sub7_sub4 == null)
				return null;
			class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
					64 - -anInt2717, 5 * anInt2739 + 768, -50, -10, -50,
					((anInt2698 ^ 0xffffffff) <= -1), false);
			Class72.aClass65_1371.put(class37_sub4_sub7_sub6, l);
		}
		if (bool != true)
			anInt2727 = -69;
		if (anInt2698 >= 0)
			class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6.method548(is, i_7_,
					i_8_, i_9_, true, anInt2698);
		return class37_sub4_sub7_sub6;
	}

	public static void method684(int i) {
		aClass37_Sub19_2735 = null;
		anIntArray2712 = null;
		aClass16_2704 = null;
		if (i != 6989)
			aClass16_2723 = null;
		aClass16_2723 = null;
		aClass16_2752 = null;
	}

	public void method685(int i) {
		if ((anInt2726 ^ 0xffffffff) == 0) {
			anInt2726 = 0;
			if (anIntArray2701 != null
					&& (anIntArray2732 == null || anIntArray2732[0] == 10))
				anInt2726 = 1;
			for (int i_11_ = 0; i_11_ < 5; i_11_++) {
				if (aClass16Array2691[i_11_] != null)
					anInt2726 = 1;
			}
		}
		if (anInt2719 == -1)
			anInt2719 = anInt2740 != 0 ? 1 : 0;
		int i_12_ = -113 % ((i - -10) / 47);
		anInt2695++;
	}

	public boolean method686(int i, int i_13_) {
		anInt2724++;
		if (i_13_ != -13979)
			method682(-71, 71, -113, -14, null, -123, 68, null, 26);
		if (anIntArray2732 == null) {
			if (anIntArray2701 == null)
				return true;
			if ((i ^ 0xffffffff) != -11)
				return true;
			boolean bool = true;
			for (int i_14_ = 0; anIntArray2701.length > i_14_; i_14_++)
				bool &= (Class37_Sub9_Sub24.aClass15_3365.method115(-9350,
						anIntArray2701[i_14_] & 0xffff, 0));
			return bool;
		}
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (anIntArray2732.length ^ 0xffffffff); i_15_++) {
			if ((anIntArray2732[i_15_] ^ 0xffffffff) == (i ^ 0xffffffff))
				return (Class37_Sub9_Sub24.aClass15_3365.method115(
						i_13_ + 4629, anIntArray2701[i_15_] & 0xffff, 0));
		}
		return true;
	}

	public boolean method687(int i) {
		anInt2716++;
		if (anIntArray2702 == null) {
			if (anInt2709 == -1 && anIntArray2714 == null)
				return false;
			return true;
		}
		if (i != -9383)
			anInt2708 = -42;
		for (int i_16_ = 0; (anIntArray2702.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
			if (anIntArray2702[i_16_] != -1) {
				Class37_Sub4_Sub11 class37_sub4_sub11_17_ = Class37_Sub9_Sub8
						.method794(anIntArray2702[i_16_], 28067);
				if ((class37_sub4_sub11_17_.anInt2709 ^ 0xffffffff) != 0
						|| class37_sub4_sub11_17_.anIntArray2714 != null)
					return true;
			}
		}
		return false;
	}

	public Class37_Sub4_Sub7 method688(int i, int i_18_, int i_19_, int i_20_,
			int i_21_, int[][] is, int i_22_) {
		anInt2742++;
		long l;
		if (anIntArray2732 == null)
			l = (long) ((anInt2746 << 1836452042) + i_22_);
		else
			l = (long) (i_22_ + (i_19_ << -1947126301) + (anInt2746 << -818655158));
		Class37_Sub4_Sub7 class37_sub4_sub7 = ((Class37_Sub4_Sub7) Class39.aClass65_867
				.get(l));
		if (i_18_ != 64)
			return null;
		if (class37_sub4_sub7 == null) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = method689(i_19_,
					i_18_ + -182, i_22_);
			if (class37_sub4_sub7_sub4 == null)
				return null;
			if (aBoolean2737) {
				class37_sub4_sub7_sub4.aShort3760 = (short) (anInt2717 + 64);
				class37_sub4_sub7_sub4.aShort3793 = (short) (5 * anInt2739 + 768);
				class37_sub4_sub7 = class37_sub4_sub7_sub4;
				class37_sub4_sub7_sub4.method538();
			} else
				class37_sub4_sub7 = class37_sub4_sub7_sub4.method518(
						anInt2717 + 64, anInt2739 * 5 + 768, -50, -10, -50,
						anInt2698 >= 0, false);
			Class39.aClass65_867
					.put(class37_sub4_sub7, l);
		}
		if (aBoolean2737)
			class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub4) class37_sub4_sub7)
					.method532();
		if ((anInt2698 ^ 0xffffffff) <= -1) {
			if (!(class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub6)) {
				if (class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub4)
					class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub4) class37_sub4_sub7)
							.method531(is, i_21_, i_20_, i, true, anInt2698);
			} else
				class37_sub4_sub7 = ((Class37_Sub4_Sub7_Sub6) class37_sub4_sub7)
						.method548(is, i_21_, i_20_, i, true, anInt2698);
		}
		return class37_sub4_sub7;
	}

	public Class37_Sub4_Sub7_Sub4 method689(int i, int i_23_, int i_24_) {
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = null;
		anInt2703++;
		if (anIntArray2732 != null) {
			int i_25_ = -1;
			for (int i_26_ = 0; anIntArray2732.length > i_26_; i_26_++) {
				if (anIntArray2732[i_26_] == i) {
					i_25_ = i_26_;
					break;
				}
			}
			if ((i_25_ ^ 0xffffffff) == 0)
				return null;
			int i_27_ = anIntArray2701[i_25_];
			boolean bool = i_24_ > 3 ^ aBoolean2750;
			if (bool)
				i_27_ += 65536;
			class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) Class37_Sub9_Sub23.aClass65_3346
					.get((long) i_27_));
			if (class37_sub4_sub7_sub4 == null) {
				class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4.method529(
						(Class37_Sub9_Sub24.aClass15_3365), i_27_ & 0xffff, 0);
				if (class37_sub4_sub7_sub4 == null)
					return null;
				if (bool)
					class37_sub4_sub7_sub4.method539();
				Class37_Sub9_Sub23.aClass65_3346.put(class37_sub4_sub7_sub4, (long) i_27_);
			}
		} else {
			if ((i ^ 0xffffffff) != -11)
				return null;
			if (anIntArray2701 == null)
				return null;
			boolean bool = aBoolean2750;
			if ((i ^ 0xffffffff) == -3 && i_24_ > 3)
				bool = !bool;
			int i_28_ = anIntArray2701.length;
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = anIntArray2701[i_29_];
				if (bool)
					i_30_ += 65536;
				class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) Class37_Sub9_Sub23.aClass65_3346
						.get((long) i_30_));
				if (class37_sub4_sub7_sub4 == null) {
					class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4.method529(
							(Class37_Sub9_Sub24.aClass15_3365), i_30_ & 0xffff,
							0);
					if (class37_sub4_sub7_sub4 == null)
						return null;
					if (bool)
						class37_sub4_sub7_sub4.method539();
					Class37_Sub9_Sub23.aClass65_3346.put(class37_sub4_sub7_sub4,
							(long) i_30_);
				}
				if ((i_28_ ^ 0xffffffff) < -2)
					Applet_Sub1.aClass37_Sub4_Sub7_Sub4Array36[i_29_] = class37_sub4_sub7_sub4;
			}
			if ((i_28_ ^ 0xffffffff) < -2)
				class37_sub4_sub7_sub4 = (new Class37_Sub4_Sub7_Sub4(
						Applet_Sub1.aClass37_Sub4_Sub7_Sub4Array36, i_28_));
		}
		if (i_23_ >= -32)
			aClass16_2723 = null;
		boolean bool;
		if (anInt2751 == 128 && (anInt2733 ^ 0xffffffff) == -129
				&& (anInt2696 ^ 0xffffffff) == -129)
			bool = false;
		else
			bool = true;
		boolean bool_31_;
		if (anInt2713 == 0 && anInt2738 == 0 && anInt2749 == 0)
			bool_31_ = false;
		else
			bool_31_ = true;
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_32_ = new Class37_Sub4_Sub7_Sub4(
				class37_sub4_sub7_sub4, i_24_ == 0 && !bool && !bool_31_,
				aShortArray2718 == null, aShortArray2741 == null, true);
		if ((i ^ 0xffffffff) == -5 && i_24_ > 3) {
			class37_sub4_sub7_sub4_32_.method524(256);
			class37_sub4_sub7_sub4_32_.method520(45, 0, -45);
		}
		i_24_ &= 0x3;
		if ((i_24_ ^ 0xffffffff) == -2)
			class37_sub4_sub7_sub4_32_.method521();
		else if (i_24_ == 2)
			class37_sub4_sub7_sub4_32_.method533();
		else if (i_24_ == 3)
			class37_sub4_sub7_sub4_32_.method519();
		if (aShortArray2718 != null) {
			for (int i_33_ = 0; i_33_ < aShortArray2718.length; i_33_++)
				class37_sub4_sub7_sub4_32_.method535(aShortArray2718[i_33_],
						aShortArray2715[i_33_]);
		}
		if (aShortArray2741 != null) {
			for (int i_34_ = 0; i_34_ < aShortArray2741.length; i_34_++)
				class37_sub4_sub7_sub4_32_.method525(aShortArray2741[i_34_],
						aShortArray2711[i_34_]);
		}
		if (bool)
			class37_sub4_sub7_sub4_32_.method534(anInt2751, anInt2733,
					anInt2696);
		if (bool_31_)
			class37_sub4_sub7_sub4_32_.method520(anInt2713, anInt2738,
					anInt2749);
		return class37_sub4_sub7_sub4_32_;
	}

	public void method690(int i, int i_35_, ByteVector class37_sub11) {
		if ((i_35_ ^ 0xffffffff) == -2) {
			int i_36_ = class37_sub11.getUnsignedByte();
			if ((i_36_ ^ 0xffffffff) < -1) {
				if (anIntArray2701 != null && !Class79.aBoolean1469)
					class37_sub11.pos += i_36_ * 3;
				else {
					anIntArray2701 = new int[i_36_];
					anIntArray2732 = new int[i_36_];
					for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_37_++) {
						anIntArray2701[i_37_] = (class37_sub11
								.getUnsignedShort());
						anIntArray2732[i_37_] = class37_sub11
								.getUnsignedByte();
					}
				}
			}
		} else if ((i_35_ ^ 0xffffffff) != -3) {
			if ((i_35_ ^ 0xffffffff) == -6) {
				int i_38_ = class37_sub11.getUnsignedByte();
				if ((i_38_ ^ 0xffffffff) < -1) {
					if (anIntArray2701 != null && !Class79.aBoolean1469)
						class37_sub11.pos += i_38_ * 2;
					else {
						anIntArray2732 = null;
						anIntArray2701 = new int[i_38_];
						for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
							anIntArray2701[i_39_] = class37_sub11
									.getUnsignedShort();
					}
				}
			} else if ((i_35_ ^ 0xffffffff) != -15) {
				if (i_35_ == 15)
					anInt2743 = class37_sub11.getUnsignedByte();
				else if (i_35_ != 17) {
					if ((i_35_ ^ 0xffffffff) == -19)
						aBoolean2700 = false;
					else if (i_35_ != 19) {
						if ((i_35_ ^ 0xffffffff) == -22)
							anInt2698 = 0;
						else if ((i_35_ ^ 0xffffffff) == -23)
							aBoolean2737 = true;
						else if (i_35_ != 23) {
							if (i_35_ != 24) {
								if ((i_35_ ^ 0xffffffff) == -28)
									anInt2740 = 1;
								else if ((i_35_ ^ 0xffffffff) == -29)
									anInt2725 = class37_sub11
											.getUnsignedByte();
								else if ((i_35_ ^ 0xffffffff) == -30)
									anInt2717 = class37_sub11
											.method982((byte) 124);
								else if ((i_35_ ^ 0xffffffff) != -40) {
									if ((i_35_ ^ 0xffffffff) > -31
											|| i_35_ >= 35) {
										if ((i_35_ ^ 0xffffffff) != -41) {
											if (i_35_ != 41) {
												if (i_35_ == 60)
													anInt2699 = class37_sub11
															.getUnsignedShort();
												else if ((i_35_ ^ 0xffffffff) == -63)
													aBoolean2750 = true;
												else if ((i_35_ ^ 0xffffffff) == -65)
													aBoolean2694 = false;
												else if (i_35_ != 65) {
													if (i_35_ != 66) {
														if ((i_35_ ^ 0xffffffff) == -68)
															anInt2696 = (class37_sub11
																	.getUnsignedShort());
														else if ((i_35_ ^ 0xffffffff) != -69) {
															if ((i_35_ ^ 0xffffffff) == -70)
																anInt2708 = (class37_sub11
																		.getUnsignedByte());
															else if (i_35_ == 70)
																anInt2713 = (class37_sub11
																		.getShort());
															else if (i_35_ != 71) {
																if ((i_35_ ^ 0xffffffff) == -73)
																	anInt2749 = (class37_sub11
																			.getShort());
																else if (i_35_ == 73)
																	aBoolean2728 = true;
																else if ((i_35_ ^ 0xffffffff) != -75) {
																	if (i_35_ == 75)
																		anInt2719 = class37_sub11
																				.getUnsignedByte();
																	else if (i_35_ != 77) {
																		if (i_35_ == 78) {
																			anInt2709 = class37_sub11
																					.getUnsignedShort();
																			anInt2705 = class37_sub11
																					.getUnsignedByte();
																		} else if (i_35_ == 79) {
																			anInt2727 = class37_sub11
																					.getUnsignedShort();
																			anInt2692 = class37_sub11
																					.getUnsignedShort();
																			anInt2705 = class37_sub11
																					.getUnsignedByte();
																			int i_40_ = class37_sub11
																					.getUnsignedByte();
																			anIntArray2714 = new int[i_40_];
																			for (int i_41_ = 0; (i_40_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++)
																				anIntArray2714[i_41_] = class37_sub11
																						.getUnsignedShort();
																		} else if (i_35_ == 81)
																			anInt2698 = 256 * class37_sub11
																					.getUnsignedByte();
																	} else {
																		anInt2707 = class37_sub11
																				.getUnsignedShort();
																		if (anInt2707 == 65535)
																			anInt2707 = -1;
																		anInt2693 = class37_sub11
																				.getUnsignedShort();
																		if (anInt2693 == 65535)
																			anInt2693 = -1;
																		int i_42_ = class37_sub11
																				.getUnsignedByte();
																		anIntArray2702 = new int[i_42_ + 1];
																		for (int i_43_ = 0; (i_42_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff); i_43_++) {
																			anIntArray2702[i_43_] = class37_sub11
																					.getUnsignedShort();
																			if ((anIntArray2702[i_43_] ^ 0xffffffff) == -65536)
																				anIntArray2702[i_43_] = -1;
																		}
																	}
																} else
																	aBoolean2744 = true;
															} else
																anInt2738 = (class37_sub11
																		.getShort());
														} else
															anInt2706 = (class37_sub11
																	.getUnsignedShort());
													} else
														anInt2733 = (class37_sub11
																.getUnsignedShort());
												} else
													anInt2751 = class37_sub11
															.getUnsignedShort();
											} else {
												int i_44_ = class37_sub11
														.getUnsignedByte();
												aShortArray2711 = new short[i_44_];
												aShortArray2741 = new short[i_44_];
												for (int i_45_ = 0; ((i_44_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff)); i_45_++) {
													aShortArray2741[i_45_] = (short) (class37_sub11
															.getUnsignedShort());
													aShortArray2711[i_45_] = (short) (class37_sub11
															.getUnsignedShort());
												}
											}
										} else {
											int i_46_ = class37_sub11
													.getUnsignedByte();
											aShortArray2715 = new short[i_46_];
											aShortArray2718 = new short[i_46_];
											for (int i_47_ = 0; ((i_47_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff)); i_47_++) {
												aShortArray2718[i_47_] = (short) (class37_sub11
														.getUnsignedShort());
												aShortArray2715[i_47_] = (short) (class37_sub11
														.getUnsignedShort());
											}
										}
									} else {
										aClass16Array2691[i_35_ + -30] = class37_sub11
												.getRS2String();
										if (aClass16Array2691[-30 + i_35_]
												.method159(
														ByteVector.hiddenString,
														(byte) 113))
											aClass16Array2691[-30 + i_35_] = null;
									}
								} else
									anInt2739 = 5 * class37_sub11
											.method982((byte) 100);
							} else {
								anInt2730 = class37_sub11.getUnsignedShort();
								if ((anInt2730 ^ 0xffffffff) == -65536)
									anInt2730 = -1;
							}
						} else
							aBoolean2747 = true;
					} else
						anInt2726 = class37_sub11.getUnsignedByte();
				} else {
					aBoolean2700 = false;
					anInt2740 = 0;
				}
			} else
				anInt2731 = class37_sub11.getUnsignedByte();
		} else
			aClass16_2745 = class37_sub11.getRS2String();
		anInt2721++;
		if (i != 19276)
			anInt2749 = 117;
	}

	public void method691(ByteVector class37_sub11, byte i) {
		if (i != 46)
			method688(-41, 114, -124, -23, 52, null, 67);
		for (;;) {
			int i_48_ = class37_sub11.getUnsignedByte();
			if (i_48_ == 0)
				break;
			method690(19276, i_48_, class37_sub11);
		}
		anInt2720++;
	}

	public boolean method692(int i) {
		anInt2710++;
		if (anIntArray2701 == null)
			return true;
		boolean bool = true;
		int i_49_ = -59 % ((14 - i) / 53);
		for (int i_50_ = 0; (anIntArray2701.length ^ 0xffffffff) < (i_50_ ^ 0xffffffff); i_50_++)
			bool &= Class37_Sub9_Sub24.aClass15_3365.method115(-9350,
					anIntArray2701[i_50_] & 0xffff, 0);
		return bool;
	}

	public Class37_Sub4_Sub11() {
		aClass16Array2691 = new RSString[5];
		anInt2707 = -1;
		anInt2705 = 0;
		anInt2698 = -1;
		anInt2713 = 0;
		anInt2719 = -1;
		anInt2696 = 128;
		anInt2706 = -1;
		anInt2692 = 0;
		anInt2693 = -1;
		aBoolean2700 = true;
		anInt2708 = 0;
		anInt2725 = 16;
		anInt2733 = 128;
		aBoolean2728 = false;
		anInt2731 = 1;
		anInt2726 = -1;
		anInt2727 = 0;
		anInt2709 = -1;
		anInt2738 = 0;
		anInt2699 = -1;
		aBoolean2737 = false;
		anInt2740 = 2;
		anInt2717 = 0;
		anInt2739 = 0;
		anInt2743 = 1;
		aBoolean2744 = false;
		anInt2730 = -1;
		aBoolean2747 = false;
		aClass16_2745 = Class37_Sub9_Sub16.aClass16_3204;
		anInt2749 = 0;
		aBoolean2750 = false;
		anInt2751 = 128;
	}

	static {
		anInt2734 = 0;
		aClass16_2752 = Class37_Sub2.create_rsstring(" from your ignore list first)3");
		aClass16_2704 = aClass16_2752;
	}
}
