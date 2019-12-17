package org.ie.client;

/* Class37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NodeSub extends Node {
	public static RSString aClass16_1842;
	public static int anInt1843;
	public static int anInt1844 = 0;
	public static int anInt1845;
	public static int anInt1846;
	public static int anInt1847;
	public static Class37_Sub4_Sub9_Sub2_Sub1 aClass37_Sub4_Sub9_Sub2_Sub1_1848;
	public static RSString aClass16_1849;
	public static int anInt1850;
	public NodeSub nextSub;
	public NodeSub previousSub;
	public static RSString aClass16_1853 = Class37_Sub2.create_rsstring(
			"Error connecting to server)3");
	public static int anInt1854;
	public static int anInt1855;
	public static RSString aClass16_1856;
	public static Deque aClass58_1857;
	public static int anInt1858;
	public static RSString aClass16_1859;
	public static int anInt1860;
	public static int anInt1861;
	public static Class15_Sub1 aClass15_Sub1_1862;

	public static int method431(int i, byte i_0_, int i_1_) {
		anInt1845++;
		int i_2_ = (Class37_Sub9_Sub28.method886(i - 1, i_1_ - 1, (byte) 120) - (-Class37_Sub9_Sub28
				.method886(i + -1, i_1_ - -1, (byte) 122) + (-Class37_Sub9_Sub28
				.method886(1 + i, -1 + i_1_, (byte) 121) + -Class37_Sub9_Sub28
				.method886(1 + i, 1 + i_1_, (byte) 125))));
		int i_3_ = 6 % ((i_0_ - -81) / 33);
		int i_4_ = (Class37_Sub9_Sub28.method886(i, i_1_ - 1, (byte) 122)
				- (-Class37_Sub9_Sub28.method886(i, 1 + i_1_, (byte) 118) - Class37_Sub9_Sub28
						.method886(-1 + i, i_1_, (byte) 120)) + Class37_Sub9_Sub28
				.method886(1 + i, i_1_, (byte) 116));
		int i_5_ = Class37_Sub9_Sub28.method886(i, i_1_, (byte) 116);
		return i_4_ / 8 + i_2_ / 16 - -(i_5_ / 4);
	}

	public static void method432(int i) {
		Class37_Sub16.aClass65_2155.clear();
		if (i == -1) {
			Class37_Sub4_Sub18.aClass65_2891.clear();
			anInt1855++;
		}
	}

	public static Class45 method433(byte i) {
		if (i < 46)
			aClass16_1849 = null;
		anInt1843++;
		try {
			return (Class45) Class.forName("Class45_Sub1").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
	}

	public static boolean method434(int i, int i_6_, int i_7_, int i_8_,
			boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, boolean reset) {
		anInt1847++;
		if (reset) {
			Class42.followPlayer = false;
			Class42.followIndex = -1;
		}
		for (int i_16_ = 0; i_16_ < 104; i_16_++) {
			for (int i_17_ = 0; i_17_ < 104; i_17_++) {
				Class30.anIntArrayArray717[i_16_][i_17_] = 0;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_16_][i_17_] = 99999999;
			}
		}
		Class30.anIntArrayArray717[i_8_][i] = 99;
		Class37_Sub9_Sub27.anIntArrayArray3406[i_8_][i] = i_14_;
		int i_18_ = i_8_;
		int i_19_ = i;
		int i_20_ = 0;
		int i_21_ = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_8_;
		Class37_Sub9_Sub36.anIntArray3572[i_21_++] = i;
		int i_22_ = Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984.length;
		boolean bool_23_ = false;
		int[][] is = (Class68.aClass20Array1322[Class37_Sub9_Sub1.anInt2916].anIntArrayArray554);
		while ((i_21_ ^ 0xffffffff) != (i_20_ ^ 0xffffffff)) {
			i_18_ = Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_20_];
			i_19_ = Class37_Sub9_Sub36.anIntArray3572[i_20_];
			i_20_ = (1 + i_20_) % i_22_;
			if (i_7_ == i_18_ && (i_13_ ^ 0xffffffff) == (i_19_ ^ 0xffffffff)) {
				bool_23_ = true;
				break;
			}
			if ((i_10_ ^ 0xffffffff) != -1) {
				if (i_10_ >= 5
						&& i_10_ != 10
						|| !(Class68.aClass20Array1322[Class37_Sub9_Sub1.anInt2916]
								.method227(i_13_, i_18_, i_7_, i_19_, -3, -1
										+ i_10_, i_12_))) {
					if ((i_10_ ^ 0xffffffff) > -11
							&& (Class68.aClass20Array1322[Class37_Sub9_Sub1.anInt2916]
									.method225(i_12_, i_19_, (byte) -57, i_7_,
											i_13_, -1 + i_10_, i_18_))) {
						bool_23_ = true;
						break;
					}
				} else {
					bool_23_ = true;
					break;
				}
			}
			if (i_15_ != 0
					&& i_11_ != 0
					&& (Class68.aClass20Array1322[Class37_Sub9_Sub1.anInt2916]
							.method219(i_11_, i_6_, i_15_, false, i_18_, i_19_,
									i_13_, i_7_))) {
				bool_23_ = true;
				break;
			}
			int i_24_ = Class37_Sub9_Sub27.anIntArrayArray3406[i_18_][i_19_]
					- -1;
			if (i_18_ > 0
					&& (Class30.anIntArrayArray717[-1 + i_18_][i_19_] ^ 0xffffffff) == -1
					&& (0x12c0108 & is[i_18_ + -1][i_19_]) == 0) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ + -1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = i_19_;
				Class30.anIntArrayArray717[i_18_ + -1][i_19_] = 2;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_ + -1][i_19_] = i_24_;
				i_21_ = (1 + i_21_) % i_22_;
			}
			if (i_18_ < 103
					&& (Class30.anIntArrayArray717[i_18_ - -1][i_19_] ^ 0xffffffff) == -1
					&& (0x12c0180 & is[1 + i_18_][i_19_]) == 0) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ + 1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = i_19_;
				i_21_ = (1 + i_21_) % i_22_;
				Class30.anIntArrayArray717[1 + i_18_][i_19_] = 8;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_ - -1][i_19_] = i_24_;
			}
			if (i_19_ > 0 && Class30.anIntArrayArray717[i_18_][i_19_ - 1] == 0
					&& (0x12c0102 & is[i_18_][i_19_ + -1]) == 0) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = -1 + i_19_;
				Class30.anIntArrayArray717[i_18_][i_19_ + -1] = 1;
				i_21_ = (i_21_ + 1) % i_22_;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_][i_19_ - 1] = i_24_;
			}
			if ((i_19_ ^ 0xffffffff) > -104
					&& ((Class30.anIntArrayArray717[i_18_][i_19_ + 1] ^ 0xffffffff) == -1)
					&& (0x12c0120 & is[i_18_][1 + i_19_]) == 0) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = i_19_ + 1;
				i_21_ = (1 + i_21_) % i_22_;
				Class30.anIntArrayArray717[i_18_][1 + i_19_] = 4;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_][i_19_ + 1] = i_24_;
			}
			if ((i_18_ ^ 0xffffffff) < -1
					&& i_19_ > 0
					&& Class30.anIntArrayArray717[i_18_ + -1][-1 + i_19_] == 0
					&& (is[i_18_ + -1][-1 + i_19_] & 0x12c010e ^ 0xffffffff) == -1
					&& (0x12c0108 & is[-1 + i_18_][i_19_] ^ 0xffffffff) == -1
					&& (is[i_18_][-1 + i_19_] & 0x12c0102 ^ 0xffffffff) == -1) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ + -1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = i_19_ - 1;
				i_21_ = (i_21_ + 1) % i_22_;
				Class30.anIntArrayArray717[-1 + i_18_][-1 + i_19_] = 3;
				Class37_Sub9_Sub27.anIntArrayArray3406[-1 + i_18_][i_19_ - 1] = i_24_;
			}
			if (i_18_ < 103 && (i_19_ ^ 0xffffffff) < -1
					&& Class30.anIntArrayArray717[i_18_ + 1][-1 + i_19_] == 0
					&& (0x12c0183 & is[1 + i_18_][i_19_ + -1]) == 0
					&& (is[i_18_ - -1][i_19_] & 0x12c0180 ^ 0xffffffff) == -1
					&& (is[i_18_][i_19_ - 1] & 0x12c0102 ^ 0xffffffff) == -1) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ - -1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = -1 + i_19_;
				Class30.anIntArrayArray717[1 + i_18_][-1 + i_19_] = 9;
				i_21_ = (1 + i_21_) % i_22_;
				Class37_Sub9_Sub27.anIntArrayArray3406[1 + i_18_][i_19_ + -1] = i_24_;
			}
			if ((i_18_ ^ 0xffffffff) < -1
					&& i_19_ < 103
					&& Class30.anIntArrayArray717[-1 + i_18_][i_19_ + 1] == 0
					&& (0x12c0138 & is[-1 + i_18_][1 + i_19_] ^ 0xffffffff) == -1
					&& (0x12c0108 & is[-1 + i_18_][i_19_]) == 0
					&& (0x12c0120 & is[i_18_][1 + i_19_] ^ 0xffffffff) == -1) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ + -1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = 1 + i_19_;
				Class30.anIntArrayArray717[i_18_ + -1][i_19_ - -1] = 6;
				i_21_ = (i_21_ + 1) % i_22_;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_ - 1][i_19_ - -1] = i_24_;
			}
			if ((i_18_ ^ 0xffffffff) > -104
					&& (i_19_ ^ 0xffffffff) > -104
					&& Class30.anIntArrayArray717[1 + i_18_][1 + i_19_] == 0
					&& (is[1 + i_18_][1 + i_19_] & 0x12c01e0 ^ 0xffffffff) == -1
					&& (is[i_18_ - -1][i_19_] & 0x12c0180 ^ 0xffffffff) == -1
					&& (0x12c0120 & is[i_18_][1 + i_19_]) == 0) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_21_] = i_18_ + 1;
				Class37_Sub9_Sub36.anIntArray3572[i_21_] = 1 + i_19_;
				Class30.anIntArrayArray717[1 + i_18_][1 + i_19_] = 12;
				Class37_Sub9_Sub27.anIntArrayArray3406[i_18_ + 1][1 + i_19_] = i_24_;
				i_21_ = (1 + i_21_) % i_22_;
			}
		}
		Class37_Sub9_Sub6.anInt3018 = 0;
		if (!bool_23_) {
			if (!bool)
				return false;
			int i_25_ = 1000;
			int i_26_ = 100;
			int i_27_ = 10;
			for (int i_28_ = -i_27_ + i_7_; i_28_ <= i_27_ + i_7_; i_28_++) {
				for (int i_29_ = -i_27_ + i_13_; (i_27_ + i_13_ ^ 0xffffffff) <= (i_29_ ^ 0xffffffff); i_29_++) {
					if (i_28_ >= 0
							&& i_29_ >= 0
							&& (i_28_ ^ 0xffffffff) > -105
							&& (i_29_ ^ 0xffffffff) > -105
							&& ((Class37_Sub9_Sub27.anIntArrayArray3406[i_28_][i_29_]) ^ 0xffffffff) > -101) {
						int i_30_ = 0;
						int i_31_ = 0;
						if ((i_13_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)) {
							if (i_29_ > -1 + i_11_ + i_13_)
								i_31_ = 1 - i_11_ - i_13_ + i_29_;
						} else
							i_31_ = i_13_ + -i_29_;
						if ((i_7_ ^ 0xffffffff) >= (i_28_ ^ 0xffffffff)) {
							if (i_28_ > -1 + (i_15_ + i_7_))
								i_30_ = -i_15_ + (-i_7_ + 1 + i_28_);
						} else
							i_30_ = -i_28_ + i_7_;
						int i_32_ = i_30_ * i_30_ + i_31_ * i_31_;
						if ((i_25_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff)
								|| ((i_25_ ^ 0xffffffff) == (i_32_ ^ 0xffffffff) && ((Class37_Sub9_Sub27.anIntArrayArray3406[i_28_][i_29_]) ^ 0xffffffff) > (i_26_ ^ 0xffffffff))) {
							i_18_ = i_28_;
							i_19_ = i_29_;
							i_25_ = i_32_;
							i_26_ = (Class37_Sub9_Sub27.anIntArrayArray3406[i_28_][i_29_]);
						}
					}
				}
			}
			if (i_25_ == 1000)
				return false;
			if ((i_18_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff)
					&& (i ^ 0xffffffff) == (i_19_ ^ 0xffffffff))
				return false;
			Class37_Sub9_Sub6.anInt3018 = 1;
		}
		i_20_ = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_20_] = i_18_;
		Class37_Sub9_Sub36.anIntArray3572[i_20_++] = i_19_;
		int i_34_;
		int i_33_ = i_34_ = Class30.anIntArrayArray717[i_18_][i_19_];
		while ((i_18_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff)
				|| (i_19_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
			if (i_33_ != i_34_) {
				Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_20_] = i_18_;
				Class37_Sub9_Sub36.anIntArray3572[i_20_++] = i_19_;
				i_34_ = i_33_;
			}
			if ((i_33_ & 0x1) != 0)
				i_19_++;
			else if ((i_33_ & 0x4) != 0)
				i_19_--;
			if ((0x2 & i_33_) == 0) {
				if ((i_33_ & 0x8 ^ 0xffffffff) != -1)
					i_18_--;
			} else
				i_18_++;
			i_33_ = Class30.anIntArrayArray717[i_18_][i_19_];
		}
		if ((i_20_ ^ 0xffffffff) < -1) {
			i_22_ = i_20_;
			if (i_22_ > 25)
				i_22_ = 25;
			i_20_--;
			int i_35_ = Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_20_];
			int i_36_ = Class37_Sub9_Sub36.anIntArray3572[i_20_];
			if (i_9_ == 0) {
				Class42.aClass37_Sub11_Sub1_936.method989(46);
				Class42.aClass37_Sub11_Sub1_936.method964(102, i_22_
						- (-i_22_ + -3));
				Class37_Sub9.anInt1961++;
			}
			if (i_9_ == 1) {
				Class42.aClass37_Sub11_Sub1_936.method989(11);
				Class49.anInt1004++;
				Class42.aClass37_Sub11_Sub1_936.method964(i_14_ ^ 0x6e, i_22_
						+ i_22_ - -17);
			}
			if (i_9_ == 2) {
				Class24.anInt598++;
				Class42.aClass37_Sub11_Sub1_936.method989(59);
				Class42.aClass37_Sub11_Sub1_936.method964(99,
						3 + (i_22_ + i_22_));
			}
			Class79.anInt1474 = Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[0];
			Class82.anInt1687 = Class37_Sub9_Sub36.anIntArray3572[0];
			for (int i_37_ = 1; i_22_ > i_37_; i_37_++) {
				i_20_--;
				Class42.aClass37_Sub11_Sub1_936
						.method964(
								97,
								(Class37_Sub4_Sub7_Sub1_Sub2.anIntArray3984[i_20_] - i_35_));
				Class42.aClass37_Sub11_Sub1_936.method946((byte) -85,
						(Class37_Sub9_Sub36.anIntArray3572[i_20_]) + -i_36_);
			}
			Class42.aClass37_Sub11_Sub1_936.method945(i_35_
					+ Class37_Sub18.anInt2200);
			Class42.aClass37_Sub11_Sub1_936.method962(i_36_
					+ Class15_Sub1.anInt1738, false);
			Class42.aClass37_Sub11_Sub1_936.method964(i_14_ + 126,
					!Class19.currentHeldKeyCache[82] ? 0 : 1);
			return true;
		}
		if ((i_9_ ^ 0xffffffff) == -2)
			return false;
		return true;
	}

	public static void method435(int i) {
		aClass16_1853 = null;
		aClass16_1842 = null;
		if (i != 8)
			aClass16_1859 = null;
		aClass16_1849 = null;
		aClass15_Sub1_1862 = null;
		aClass58_1857 = null;
		aClass16_1856 = null;
		aClass16_1859 = null;
		aClass37_Sub4_Sub9_Sub2_Sub1_1848 = null;
	}

	public static void method436(int i) {
		anInt1858++;
		if (Class37_Sub4_Sub5.aBoolean2595) {
			RSInterface rSInterface = Class37_Sub9_Sub35.method914(
					Class32.anInt737, KeyboardHandler.anInt558);
			if (rSInterface != null && rSInterface.spellUsedListener != null) {
				InterfaceListener class37_sub8 = new InterfaceListener();
				class37_sub8.aClass18_1925 = rSInterface;
				class37_sub8.objectData = rSInterface.spellUsedListener;
				Class43.executeScript(class37_sub8);
			}
			Class37_Sub4_Sub5.aBoolean2595 = false;
			Class73.refreshInterface(rSInterface);
		}
	}

	public static void method437(int i, boolean bool) {
		if (i == 151) {
			anInt1850++;
			if (Class43.aClass19_950 != null) {
				try {
					ByteVector class37_sub11 = new ByteVector(4);
					class37_sub11.method964(100, !bool ? 3 : 2);
					class37_sub11.method930(0, -110);
					Class43.aClass19_950.method204(0, (byte) 126,
							(class37_sub11.buf), 4);
				} catch (java.io.IOException ioexception) {
					try {
						Class43.aClass19_950.method209((byte) -128);
					} catch (Exception exception) {
						/* empty */
					}
					Class43.aClass19_950 = null;
					Class37_Sub4_Sub12.anInt2785++;
				}
			}
		}
	}

	public void unlinkSub() {
		if (previousSub != null) {
			previousSub.nextSub = nextSub;
			nextSub.previousSub = previousSub;
			previousSub = null;
			nextSub = null;
		}
	}

	public static void method439(int i, Class15 class15) {
		anInt1861++;
		int i_38_ = -36 / ((-37 - i) / 53);
		Class52.aClass15_1054 = class15;
	}

	public static void method440(int i) {
		Class75.anIntArray1406 = new int[151];
		anInt1854++;
		Class1.anIntArray69 = new int[33];
		Class39.anIntArray871 = new int[151];
		Class37_Sub9_Sub27.anIntArray3401 = new int[33];
		for (int i_39_ = 0; i_39_ < 33; i_39_++) {
			int i_40_ = 0;
			int i_41_ = 999;
			for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -35; i_42_++) {
				if (((Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.aByteArray3860[(i_42_ - -(Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.anInt3865 * i_39_))]) ^ 0xffffffff) == -1) {
					if ((i_41_ ^ 0xffffffff) == -1000)
						i_41_ = i_42_;
				} else if (i_41_ != 999) {
					i_40_ = i_42_;
					break;
				}
			}
			Class1.anIntArray69[i_39_] = i_41_;
			Class37_Sub9_Sub27.anIntArray3401[i_39_] = i_40_ - i_41_;
		}
		if (i != -7274)
			method433((byte) 16);
		for (int i_43_ = 5; i_43_ < 156; i_43_++) {
			int i_44_ = 999;
			int i_45_ = 0;
			for (int i_46_ = 25; i_46_ < 172; i_46_++) {
				if (((Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.aByteArray3860[i_46_
						- -(i_43_ * (Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.anInt3865))]) ^ 0xffffffff) != -1
						|| (i_46_ ^ 0xffffffff) >= -35 && i_43_ <= 34) {
					if (i_44_ != 999) {
						i_45_ = i_46_;
						break;
					}
				} else if ((i_44_ ^ 0xffffffff) == -1000)
					i_44_ = i_46_;
			}
			Class39.anIntArray871[-5 + i_43_] = i_44_ + -25;
			Class75.anIntArray1406[i_43_ + -5] = i_45_ - i_44_;
		}
	}

	static {
		aClass16_1842 = aClass16_1853;
		aClass16_1859 = Class37_Sub2.create_rsstring("World");
		aClass16_1849 = aClass16_1859;
		aClass16_1856 = aClass16_1859;
		aClass58_1857 = new Deque();
	}
}
