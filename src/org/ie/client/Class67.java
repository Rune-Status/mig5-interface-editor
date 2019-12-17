package org.ie.client;

/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67 {
	public static int anInt1265;
	public static int anInt1266;
	public static boolean aBoolean1267 = false;
	public Class37_Sub17[][][] aClass37_Sub17ArrayArrayArray1268;
	public int anInt1269 = 0;
	public int anInt1270;
	public static int anInt1271;
	public static int anInt1272;
	public int anInt1273;
	public static int anInt1274 = 0;
	public static Class79[] aClass79Array1275;
	public static int anInt1276;
	public static int anInt1277;
	public int[][][] anIntArrayArrayArray1278;
	public static int anInt1279;
	public static int anInt1280;
	public Class27[] aClass27Array1281 = new Class27[5000];
	public static boolean aBoolean1282;
	public static int anInt1283 = 0;
	public static int anInt1284;
	public static Deque aClass58_1285;
	public static int anInt1286;
	public static Class27[] aClass27Array1287;
	public static int anInt1288;
	public static int anInt1289;
	public static Class79[][] aClass79ArrayArray1290;
	public static int anInt1291;
	public static int anInt1292;
	public static int anInt1293;
	public static int anInt1294;
	public static int anInt1295;
	public static int anInt1296;
	public static int anInt1297;
	public int[][][] anIntArrayArrayArray1298;
	public int anInt1299;
	public static int anInt1300;
	public static int[] anIntArray1301;
	public int anInt1302;
	public int[][] anIntArrayArray1303;
	public static int anInt1304;
	public static int[] anIntArray1305;
	public static int[] anIntArray1306;
	public static int[] anIntArray1307;
	public static int anInt1308;
	public static int[] anIntArray1309;
	public static int anInt1310;
	public static boolean[][][][] aBooleanArrayArrayArrayArray1311;
	public int[][] anIntArrayArray1312;
	public static int anInt1313;
	public static int anInt1314;
	public static int[] anIntArray1315;
	public static int anInt1316;
	public static int[] anIntArray1317;
	public static int anInt1318;
	public static int[] anIntArray1319;
	public static boolean[][] aBooleanArrayArray1320;

	public void method1193(int i, int i_0_, int i_1_, int i_2_,
			Class37_Sub4_Sub7 class37_sub4_sub7,
			Class37_Sub4_Sub7 class37_sub4_sub7_3_, int i_4_, int i_5_,
			int i_6_, int i_7_) {
		if (class37_sub4_sub7 != null || class37_sub4_sub7_3_ != null) {
			Class75 class75 = new Class75();
			class75.anInt1411 = i_6_;
			class75.anInt1405 = i_7_;
			class75.anInt1408 = i_0_ * 128 + 64;
			class75.anInt1412 = i_1_ * 128 + 64;
			class75.anInt1416 = i_2_;
			class75.aClass37_Sub4_Sub7_1404 = class37_sub4_sub7;
			class75.aClass37_Sub4_Sub7_1407 = class37_sub4_sub7_3_;
			class75.anInt1417 = i_4_;
			class75.anInt1403 = i_5_;
			for (int i_8_ = i; i_8_ >= 0; i_8_--) {
				if (aClass37_Sub17ArrayArrayArray1268[i_8_][i_0_][i_1_] == null)
					aClass37_Sub17ArrayArrayArray1268[i_8_][i_0_][i_1_] = new Class37_Sub17(
							i_8_, i_0_, i_1_);
			}
			aClass37_Sub17ArrayArrayArray1268[i][i_0_][i_1_].aClass75_2170 = class75;
		}
	}

	public void method1194(int i, int i_9_, int i_10_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_9_][i_10_];
		if (class37_sub17 != null) {
			for (int i_11_ = 0; i_11_ < class37_sub17.anInt2180; i_11_++) {
				Class27 class27 = class37_sub17.aClass27Array2186[i_11_];
				if ((class27.anInt673 >> 29 & 0x3) == 2
						&& class27.anInt678 == i_9_
						&& class27.anInt674 == i_10_) {
					method1215(class27);
					break;
				}
			}
		}
	}

	public void method1195(int i, int i_12_, int i_13_) {
		for (int i_14_ = 0; i_14_ < anInt1270; i_14_++) {
			for (int i_15_ = 0; i_15_ < anInt1299; i_15_++) {
				for (int i_16_ = 0; i_16_ < anInt1302; i_16_++) {
					Class37_Sub17 class37_sub17 = (aClass37_Sub17ArrayArrayArray1268[i_14_][i_15_][i_16_]);
					if (class37_sub17 != null) {
						Class75 class75 = class37_sub17.aClass75_2170;
						if (class75 != null
								&& (class75.aClass37_Sub4_Sub7_1404 instanceof Class37_Sub4_Sub7_Sub4)) {
							Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) class75.aClass37_Sub4_Sub7_1404);
							method1218(class37_sub4_sub7_sub4, i_14_, i_15_,
									i_16_, 1, 1);
							if (class75.aClass37_Sub4_Sub7_1407 instanceof Class37_Sub4_Sub7_Sub4) {
								Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_17_ = ((Class37_Sub4_Sub7_Sub4) class75.aClass37_Sub4_Sub7_1407);
								method1218(class37_sub4_sub7_sub4_17_, i_14_,
										i_15_, i_16_, 1, 1);
								Class37_Sub4_Sub7_Sub4.method530(
										class37_sub4_sub7_sub4,
										class37_sub4_sub7_sub4_17_, 0, 0, 0,
										false);
								class75.aClass37_Sub4_Sub7_1407 = (class37_sub4_sub7_sub4_17_
										.method518(
												class37_sub4_sub7_sub4_17_.aShort3760,
												class37_sub4_sub7_sub4_17_.aShort3793,
												i, i_12_, i_13_, false, false));
							}
							class75.aClass37_Sub4_Sub7_1404 = (class37_sub4_sub7_sub4
									.method518(
											class37_sub4_sub7_sub4.aShort3760,
											class37_sub4_sub7_sub4.aShort3793,
											i, i_12_, i_13_, false, false));
						}
						for (int i_18_ = 0; i_18_ < class37_sub17.anInt2180; i_18_++) {
							Class27 class27 = class37_sub17.aClass27Array2186[i_18_];
							if (class27 != null
									&& (class27.aClass37_Sub4_Sub7_670 instanceof Class37_Sub4_Sub7_Sub4)) {
								Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) class27.aClass37_Sub4_Sub7_670);
								method1218(
										class37_sub4_sub7_sub4,
										i_14_,
										i_15_,
										i_16_,
										(class27.anInt684 - class27.anInt678 + 1),
										(class27.anInt668 - class27.anInt674 + 1));
								class27.aClass37_Sub4_Sub7_670 = (class37_sub4_sub7_sub4
										.method518(
												class37_sub4_sub7_sub4.aShort3760,
												class37_sub4_sub7_sub4.aShort3793,
												i, i_12_, i_13_, false, false));
							}
						}
						Class39 class39 = class37_sub17.aClass39_2178;
						if (class39 != null
								&& (class39.aClass37_Sub4_Sub7_857 instanceof Class37_Sub4_Sub7_Sub4)) {
							Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = ((Class37_Sub4_Sub7_Sub4) class39.aClass37_Sub4_Sub7_857);
							method1206(class37_sub4_sub7_sub4, i_14_, i_15_,
									i_16_);
							class39.aClass37_Sub4_Sub7_857 = (class37_sub4_sub7_sub4
									.method518(
											class37_sub4_sub7_sub4.aShort3760,
											class37_sub4_sub7_sub4.aShort3793,
											i, i_12_, i_13_, false, false));
						}
					}
				}
			}
		}
	}

	public boolean method1196(int i, int i_19_, int i_20_) {
		int i_21_ = anIntArrayArrayArray1278[i][i_19_][i_20_];
		if (i_21_ == -anInt1289)
			return false;
		if (i_21_ == anInt1289)
			return true;
		int i_22_ = i_19_ << 7;
		int i_23_ = i_20_ << 7;
		if (method1210(i_22_ + 1, anIntArrayArrayArray1298[i][i_19_][i_20_],
				i_23_ + 1)
				&& method1210(i_22_ + 128 - 1,
						anIntArrayArrayArray1298[i][i_19_ + 1][i_20_],
						i_23_ + 1)
				&& method1210(i_22_ + 128 - 1,
						anIntArrayArrayArray1298[i][i_19_ + 1][i_20_ + 1],
						i_23_ + 128 - 1)
				&& method1210(i_22_ + 1,
						anIntArrayArrayArray1298[i][i_19_][i_20_ + 1],
						i_23_ + 128 - 1)) {
			anIntArrayArrayArray1278[i][i_19_][i_20_] = anInt1289;
			return true;
		}
		anIntArrayArrayArray1278[i][i_19_][i_20_] = -anInt1289;
		return false;
	}

	public void method1197(int i, int i_24_, int i_25_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_24_][i_25_];
		if (class37_sub17 != null)
			class37_sub17.aClass76_2183 = null;
	}

	public boolean method1198(int i, int i_26_, int i_27_, int i_28_,
			int i_29_, int i_30_) {
		if (i_26_ == i_27_ && i_28_ == i_29_) {
			if (!method1196(i, i_26_, i_28_))
				return false;
			int i_31_ = i_26_ << 7;
			int i_32_ = i_28_ << 7;
			if (method1210(i_31_ + 1, anIntArrayArrayArray1298[i][i_26_][i_28_]
					- i_30_, i_32_ + 1)
					&& method1210(
							i_31_ + 128 - 1,
							(anIntArrayArrayArray1298[i][i_26_ + 1][i_28_] - i_30_),
							i_32_ + 1)
					&& method1210(i_31_ + 128 - 1,
							(anIntArrayArrayArray1298[i][i_26_ + 1][i_28_ + 1])
									- i_30_, i_32_ + 128 - 1)
					&& method1210(
							i_31_ + 1,
							(anIntArrayArrayArray1298[i][i_26_][i_28_ + 1] - i_30_),
							i_32_ + 128 - 1))
				return true;
			return false;
		}
		for (int i_33_ = i_26_; i_33_ <= i_27_; i_33_++) {
			for (int i_34_ = i_28_; i_34_ <= i_29_; i_34_++) {
				if (anIntArrayArrayArray1278[i][i_33_][i_34_] == -anInt1289)
					return false;
			}
		}
		int i_35_ = (i_26_ << 7) + 1;
		int i_36_ = (i_28_ << 7) + 2;
		int i_37_ = anIntArrayArrayArray1298[i][i_26_][i_28_] - i_30_;
		if (!method1210(i_35_, i_37_, i_36_))
			return false;
		int i_38_ = (i_27_ << 7) - 1;
		if (!method1210(i_38_, i_37_, i_36_))
			return false;
		int i_39_ = (i_29_ << 7) - 1;
		if (!method1210(i_35_, i_37_, i_39_))
			return false;
		if (!method1210(i_38_, i_37_, i_39_))
			return false;
		return true;
	}

	public int method1199(int i, int i_40_, int i_41_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_40_][i_41_];
		if (class37_sub17 == null || class37_sub17.aClass39_2178 == null)
			return 0;
		return class37_sub17.aClass39_2178.anInt868;
	}

	public void method1200(int i, int i_42_, int i_43_, int i_44_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_42_][i_43_];
		if (class37_sub17 != null) {
			Class41 class41 = class37_sub17.aClass41_2174;
			if (class41 != null) {
				class41.anInt896 = class41.anInt896 * i_44_ / 16;
				class41.anInt890 = class41.anInt890 * i_44_ / 16;
			}
		}
	}

	public void method1201(int i, int i_45_, int i_46_, int i_47_,
			Class37_Sub4_Sub7 class37_sub4_sub7,
			Class37_Sub4_Sub7 class37_sub4_sub7_48_, int i_49_, int i_50_,
			int i_51_, int i_52_, int i_53_, int i_54_) {
		if (class37_sub4_sub7 != null) {
			Class41 class41 = new Class41();
			class41.anInt911 = i_53_;
			class41.anInt903 = i_54_;
			class41.anInt907 = i_45_ * 128 + 64;
			class41.anInt897 = i_46_ * 128 + 64;
			class41.anInt891 = i_47_;
			class41.aClass37_Sub4_Sub7_892 = class37_sub4_sub7;
			class41.aClass37_Sub4_Sub7_887 = class37_sub4_sub7_48_;
			class41.anInt904 = i_49_;
			class41.anInt908 = i_50_;
			class41.anInt896 = i_51_;
			class41.anInt890 = i_52_;
			for (int i_55_ = i; i_55_ >= 0; i_55_--) {
				if (aClass37_Sub17ArrayArrayArray1268[i_55_][i_45_][i_46_] == null)
					aClass37_Sub17ArrayArrayArray1268[i_55_][i_45_][i_46_] = new Class37_Sub17(
							i_55_, i_45_, i_46_);
			}
			aClass37_Sub17ArrayArrayArray1268[i][i_45_][i_46_].aClass41_2174 = class41;
		}
	}

	public int method1202(int i, int i_56_, int i_57_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_56_][i_57_];
		if (class37_sub17 == null || class37_sub17.aClass41_2174 == null)
			return 0;
		return class37_sub17.aClass41_2174.anInt911;
	}

	public boolean method1203(int i, int i_58_, int i_59_, int i_60_,
			int i_61_, int i_62_, Class37_Sub4_Sub7 class37_sub4_sub7,
			int i_63_, int i_64_, int i_65_) {
		if (class37_sub4_sub7 == null)
			return true;
		int i_66_ = i_58_ * 128 + 64 * i_61_;
		int i_67_ = i_59_ * 128 + 64 * i_62_;
		return method1242(i, i_58_, i_59_, i_61_, i_62_, i_66_, i_67_, i_60_,
				class37_sub4_sub7, i_63_, false, i_64_, i_65_);
	}

	public void method1204(int i, int i_68_, int i_69_) {
		aBoolean1267 = true;
		anInt1283 = i;
		anInt1288 = i_68_;
		anInt1294 = i_69_;
		anInt1291 = -1;
		anInt1279 = -1;
	}

	public void method1205(Class63 class63, int i, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_) {
		int i_75_ = class63.anIntArray1208.length;
		for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
			int i_77_ = class63.anIntArray1208[i_76_] - anInt1271;
			int i_78_ = class63.anIntArray1188[i_76_] - anInt1272;
			int i_79_ = class63.anIntArray1191[i_76_] - anInt1293;
			int i_80_ = i_79_ * i_71_ + i_77_ * i_72_ >> 16;
			i_79_ = i_79_ * i_72_ - i_77_ * i_71_ >> 16;
			i_77_ = i_80_;
			i_80_ = i_78_ * i_70_ - i_79_ * i >> 16;
			i_79_ = i_78_ * i + i_79_ * i_70_ >> 16;
			i_78_ = i_80_;
			if (i_79_ < 50)
				return;
			if (class63.anIntArray1200 != null) {
				Class63.anIntArray1206[i_76_] = i_77_;
				Class63.anIntArray1203[i_76_] = i_78_;
				Class63.anIntArray1202[i_76_] = i_79_;
			}
			Class63.anIntArray1197[i_76_] = Rasterizer.anInt3911
					+ (i_77_ << 9) / i_79_;
			Class63.anIntArray1207[i_76_] = Rasterizer.anInt3924
					+ (i_78_ << 9) / i_79_;
		}
		Rasterizer.anInt3925 = 0;
		i_75_ = class63.anIntArray1194.length;
		for (int i_81_ = 0; i_81_ < i_75_; i_81_++) {
			int i_82_ = class63.anIntArray1194[i_81_];
			int i_83_ = class63.anIntArray1201[i_81_];
			int i_84_ = class63.anIntArray1199[i_81_];
			int i_85_ = Class63.anIntArray1197[i_82_];
			int i_86_ = Class63.anIntArray1197[i_83_];
			int i_87_ = Class63.anIntArray1197[i_84_];
			int i_88_ = Class63.anIntArray1207[i_82_];
			int i_89_ = Class63.anIntArray1207[i_83_];
			int i_90_ = Class63.anIntArray1207[i_84_];
			if ((i_85_ - i_86_) * (i_90_ - i_89_) - (i_88_ - i_89_)
					* (i_87_ - i_86_) > 0) {
				Rasterizer.aBoolean3922 = false;
				if (i_85_ < 0 || i_86_ < 0 || i_87_ < 0
						|| i_85_ > Rasterizer.anInt3918
						|| i_86_ > Rasterizer.anInt3918
						|| i_87_ > Rasterizer.anInt3918)
					Rasterizer.aBoolean3922 = true;
				if (aBoolean1267
						&& method1221(anInt1288, anInt1294, i_88_, i_89_,
								i_90_, i_85_, i_86_, i_87_)) {
					anInt1291 = i_73_;
					anInt1279 = i_74_;
				}
				if (class63.anIntArray1200 == null
						|| class63.anIntArray1200[i_81_] == -1) {
					if (class63.anIntArray1204[i_81_] != 12345678)
						Rasterizer.method656(i_88_, i_89_, i_90_,
								i_85_, i_86_, i_87_,
								class63.anIntArray1204[i_81_],
								class63.anIntArray1205[i_81_],
								class63.anIntArray1193[i_81_]);
				} else if (!aBoolean1282) {
					if (class63.aBoolean1195)
						Rasterizer.method664(i_88_, i_89_, i_90_,
								i_85_, i_86_, i_87_,
								class63.anIntArray1204[i_81_],
								class63.anIntArray1205[i_81_],
								class63.anIntArray1193[i_81_],
								Class63.anIntArray1206[0],
								Class63.anIntArray1206[1],
								Class63.anIntArray1206[3],
								Class63.anIntArray1203[0],
								Class63.anIntArray1203[1],
								Class63.anIntArray1203[3],
								Class63.anIntArray1202[0],
								Class63.anIntArray1202[1],
								Class63.anIntArray1202[3],
								class63.anIntArray1200[i_81_]);
					else
						Rasterizer.method664(i_88_, i_89_, i_90_,
								i_85_, i_86_, i_87_,
								class63.anIntArray1204[i_81_],
								class63.anIntArray1205[i_81_],
								class63.anIntArray1193[i_81_],
								Class63.anIntArray1206[i_82_],
								Class63.anIntArray1206[i_83_],
								Class63.anIntArray1206[i_84_],
								Class63.anIntArray1203[i_82_],
								Class63.anIntArray1203[i_83_],
								Class63.anIntArray1203[i_84_],
								Class63.anIntArray1202[i_82_],
								Class63.anIntArray1202[i_83_],
								Class63.anIntArray1202[i_84_],
								class63.anIntArray1200[i_81_]);
				} else {
					int i_91_ = (Rasterizer.anInterface3_3926
							.method11((byte) -29, class63.anIntArray1200[i_81_]));
					Rasterizer.method656(i_88_, i_89_, i_90_,
							i_85_, i_86_, i_87_, method1240(i_91_,
									class63.anIntArray1204[i_81_]), method1240(
									i_91_, class63.anIntArray1205[i_81_]),
							method1240(i_91_, class63.anIntArray1193[i_81_]));
				}
			}
		}
	}

	public void method1206(Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4,
			int i, int i_92_, int i_93_) {
		if (i_92_ < anInt1299) {
			Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_92_ + 1][i_93_];
			if (class37_sub17 != null
					&& class37_sub17.aClass39_2178 != null
					&& (class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857 instanceof Class37_Sub4_Sub7_Sub4)) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_94_ = ((Class37_Sub4_Sub7_Sub4) class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857);
				Class37_Sub4_Sub7_Sub4.method530(class37_sub4_sub7_sub4,
						class37_sub4_sub7_sub4_94_, 128, 0, 0, true);
			}
		}
		if (i_93_ < anInt1299) {
			Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_92_][i_93_ + 1];
			if (class37_sub17 != null
					&& class37_sub17.aClass39_2178 != null
					&& (class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857 instanceof Class37_Sub4_Sub7_Sub4)) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_95_ = ((Class37_Sub4_Sub7_Sub4) class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857);
				Class37_Sub4_Sub7_Sub4.method530(class37_sub4_sub7_sub4,
						class37_sub4_sub7_sub4_95_, 0, 0, 128, true);
			}
		}
		if (i_92_ < anInt1299 && i_93_ < anInt1302) {
			Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_92_ + 1][i_93_ + 1];
			if (class37_sub17 != null
					&& class37_sub17.aClass39_2178 != null
					&& (class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857 instanceof Class37_Sub4_Sub7_Sub4)) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_96_ = ((Class37_Sub4_Sub7_Sub4) class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857);
				Class37_Sub4_Sub7_Sub4.method530(class37_sub4_sub7_sub4,
						class37_sub4_sub7_sub4_96_, 128, 0, 128, true);
			}
		}
		if (i_92_ < anInt1299 && i_93_ > 0) {
			Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_92_ + 1][i_93_ - 1];
			if (class37_sub17 != null
					&& class37_sub17.aClass39_2178 != null
					&& (class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857 instanceof Class37_Sub4_Sub7_Sub4)) {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_97_ = ((Class37_Sub4_Sub7_Sub4) class37_sub17.aClass39_2178.aClass37_Sub4_Sub7_857);
				Class37_Sub4_Sub7_Sub4.method530(class37_sub4_sub7_sub4,
						class37_sub4_sub7_sub4_97_, 128, 0, -128, true);
			}
		}
	}

	public Class27 method1207(int i, int i_98_, int i_99_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_98_][i_99_];
		if (class37_sub17 == null)
			return null;
		for (int i_100_ = 0; i_100_ < class37_sub17.anInt2180; i_100_++) {
			Class27 class27 = class37_sub17.aClass27Array2186[i_100_];
			if ((class27.anInt673 >> 29 & 0x3) == 2
					&& class27.anInt678 == i_98_ && class27.anInt674 == i_99_)
				return class27;
		}
		return null;
	}

	public void method1208(int i, int i_101_, int i_102_, int i_103_,
			int i_104_, int i_105_) {
		if (i < 0)
			i = 0;
		else if (i >= anInt1299 * 128)
			i = anInt1299 * 128 - 1;
		if (i_102_ < 0)
			i_102_ = 0;
		else if (i_102_ >= anInt1302 * 128)
			i_102_ = anInt1302 * 128 - 1;
		anInt1289++;
		anInt1277 = Rasterizer.anIntArray3910[i_103_];
		anInt1292 = Rasterizer.anIntArray3929[i_103_];
		anInt1297 = Rasterizer.anIntArray3910[i_104_];
		anInt1295 = Rasterizer.anIntArray3929[i_104_];
		aBooleanArrayArray1320 = (aBooleanArrayArrayArrayArray1311[(i_103_ - 128) / 32][i_104_ / 64]);
		anInt1271 = i;
		anInt1272 = i_101_;
		anInt1293 = i_102_;
		anInt1280 = i / 128;
		anInt1300 = i_102_ / 128;
		anInt1274 = i_105_;
		anInt1266 = anInt1280 - 25;
		if (anInt1266 < 0)
			anInt1266 = 0;
		anInt1286 = anInt1300 - 25;
		if (anInt1286 < 0)
			anInt1286 = 0;
		anInt1296 = anInt1280 + 25;
		if (anInt1296 > anInt1299)
			anInt1296 = anInt1299;
		anInt1265 = anInt1300 + 25;
		if (anInt1265 > anInt1302)
			anInt1265 = anInt1302;
		method1227();
		anInt1304 = 0;
		for (int i_106_ = anInt1273; i_106_ < anInt1270; i_106_++) {
			Class37_Sub17[][] class37_sub17s = aClass37_Sub17ArrayArrayArray1268[i_106_];
			for (int i_107_ = anInt1266; i_107_ < anInt1296; i_107_++) {
				for (int i_108_ = anInt1286; i_108_ < anInt1265; i_108_++) {
					Class37_Sub17 class37_sub17 = class37_sub17s[i_107_][i_108_];
					if (class37_sub17 != null) {
						if (class37_sub17.anInt2173 > i_105_
								|| (!(aBooleanArrayArray1320[i_107_ - anInt1280
										+ 25][i_108_ - anInt1300 + 25]) && (anIntArrayArrayArray1298[i_106_][i_107_][i_108_])
										- i_101_ < 2000)) {
							class37_sub17.aBoolean2168 = false;
							class37_sub17.aBoolean2172 = false;
							class37_sub17.anInt2181 = 0;
						} else {
							class37_sub17.aBoolean2168 = true;
							class37_sub17.aBoolean2172 = true;
							if (class37_sub17.anInt2180 > 0)
								class37_sub17.aBoolean2184 = true;
							else
								class37_sub17.aBoolean2184 = false;
							anInt1304++;
						}
					}
				}
			}
		}
		for (int i_109_ = anInt1273; i_109_ < anInt1270; i_109_++) {
			Class37_Sub17[][] class37_sub17s = aClass37_Sub17ArrayArrayArray1268[i_109_];
			for (int i_110_ = -25; i_110_ <= 0; i_110_++) {
				int i_111_ = anInt1280 + i_110_;
				int i_112_ = anInt1280 - i_110_;
				if (i_111_ >= anInt1266 || i_112_ < anInt1296) {
					for (int i_113_ = -25; i_113_ <= 0; i_113_++) {
						int i_114_ = anInt1300 + i_113_;
						int i_115_ = anInt1300 - i_113_;
						if (i_111_ >= anInt1266) {
							if (i_114_ >= anInt1286) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_111_][i_114_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, true);
							}
							if (i_115_ < anInt1265) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_111_][i_115_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, true);
							}
						}
						if (i_112_ < anInt1296) {
							if (i_114_ >= anInt1286) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_112_][i_114_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, true);
							}
							if (i_115_ < anInt1265) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_112_][i_115_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, true);
							}
						}
						if (anInt1304 == 0) {
							aBoolean1267 = false;
							return;
						}
					}
				}
			}
		}
		for (int i_116_ = anInt1273; i_116_ < anInt1270; i_116_++) {
			Class37_Sub17[][] class37_sub17s = aClass37_Sub17ArrayArrayArray1268[i_116_];
			for (int i_117_ = -25; i_117_ <= 0; i_117_++) {
				int i_118_ = anInt1280 + i_117_;
				int i_119_ = anInt1280 - i_117_;
				if (i_118_ >= anInt1266 || i_119_ < anInt1296) {
					for (int i_120_ = -25; i_120_ <= 0; i_120_++) {
						int i_121_ = anInt1300 + i_120_;
						int i_122_ = anInt1300 - i_120_;
						if (i_118_ >= anInt1266) {
							if (i_121_ >= anInt1286) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_118_][i_121_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, false);
							}
							if (i_122_ < anInt1265) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_118_][i_122_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, false);
							}
						}
						if (i_119_ < anInt1296) {
							if (i_121_ >= anInt1286) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_119_][i_121_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, false);
							}
							if (i_122_ < anInt1265) {
								Class37_Sub17 class37_sub17 = class37_sub17s[i_119_][i_122_];
								if (class37_sub17 != null
										&& class37_sub17.aBoolean2168)
									method1229(class37_sub17, false);
							}
						}
						if (anInt1304 == 0) {
							aBoolean1267 = false;
							return;
						}
					}
				}
			}
		}
		aBoolean1267 = false;
	}

	public void method1209(int i, int i_123_, int i_124_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_123_][i_124_];
		if (class37_sub17 != null)
			class37_sub17.aClass39_2178 = null;
	}

	public boolean method1210(int i, int i_125_, int i_126_) {
		for (int i_127_ = 0; i_127_ < anInt1284; i_127_++) {
			Class79 class79 = aClass79Array1275[i_127_];
			if (class79.anInt1480 == 1) {
				int i_128_ = class79.anInt1472 - i;
				if (i_128_ > 0) {
					int i_129_ = (class79.anInt1470 + (class79.anInt1467
							* i_128_ >> 8));
					int i_130_ = (class79.anInt1479 + (class79.anInt1484
							* i_128_ >> 8));
					int i_131_ = (class79.anInt1493 + (class79.anInt1500
							* i_128_ >> 8));
					int i_132_ = (class79.anInt1476 + (class79.anInt1475
							* i_128_ >> 8));
					if (i_126_ >= i_129_ && i_126_ <= i_130_
							&& i_125_ >= i_131_ && i_125_ <= i_132_)
						return true;
				}
			} else if (class79.anInt1480 == 2) {
				int i_133_ = i - class79.anInt1472;
				if (i_133_ > 0) {
					int i_134_ = (class79.anInt1470 + (class79.anInt1467
							* i_133_ >> 8));
					int i_135_ = (class79.anInt1479 + (class79.anInt1484
							* i_133_ >> 8));
					int i_136_ = (class79.anInt1493 + (class79.anInt1500
							* i_133_ >> 8));
					int i_137_ = (class79.anInt1476 + (class79.anInt1475
							* i_133_ >> 8));
					if (i_126_ >= i_134_ && i_126_ <= i_135_
							&& i_125_ >= i_136_ && i_125_ <= i_137_)
						return true;
				}
			} else if (class79.anInt1480 == 3) {
				int i_138_ = class79.anInt1470 - i_126_;
				if (i_138_ > 0) {
					int i_139_ = (class79.anInt1472 + (class79.anInt1496
							* i_138_ >> 8));
					int i_140_ = (class79.anInt1498 + (class79.anInt1499
							* i_138_ >> 8));
					int i_141_ = (class79.anInt1493 + (class79.anInt1500
							* i_138_ >> 8));
					int i_142_ = (class79.anInt1476 + (class79.anInt1475
							* i_138_ >> 8));
					if (i >= i_139_ && i <= i_140_ && i_125_ >= i_141_
							&& i_125_ <= i_142_)
						return true;
				}
			} else if (class79.anInt1480 == 4) {
				int i_143_ = i_126_ - class79.anInt1470;
				if (i_143_ > 0) {
					int i_144_ = (class79.anInt1472 + (class79.anInt1496
							* i_143_ >> 8));
					int i_145_ = (class79.anInt1498 + (class79.anInt1499
							* i_143_ >> 8));
					int i_146_ = (class79.anInt1493 + (class79.anInt1500
							* i_143_ >> 8));
					int i_147_ = (class79.anInt1476 + (class79.anInt1475
							* i_143_ >> 8));
					if (i >= i_144_ && i <= i_145_ && i_125_ >= i_146_
							&& i_125_ <= i_147_)
						return true;
				}
			} else if (class79.anInt1480 == 5) {
				int i_148_ = i_125_ - class79.anInt1493;
				if (i_148_ > 0) {
					int i_149_ = (class79.anInt1472 + (class79.anInt1496
							* i_148_ >> 8));
					int i_150_ = (class79.anInt1498 + (class79.anInt1499
							* i_148_ >> 8));
					int i_151_ = (class79.anInt1470 + (class79.anInt1467
							* i_148_ >> 8));
					int i_152_ = (class79.anInt1479 + (class79.anInt1484
							* i_148_ >> 8));
					if (i >= i_149_ && i <= i_150_ && i_126_ >= i_151_
							&& i_126_ <= i_152_)
						return true;
				}
			}
		}
		return false;
	}

	public void method1211(int i, int i_153_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[0][i][i_153_];
		for (int i_154_ = 0; i_154_ < 3; i_154_++) {
			Class37_Sub17 class37_sub17_155_ = (aClass37_Sub17ArrayArrayArray1268[i_154_][i][i_153_] = aClass37_Sub17ArrayArrayArray1268[i_154_ + 1][i][i_153_]);
			if (class37_sub17_155_ != null) {
				class37_sub17_155_.anInt2175--;
				for (int i_156_ = 0; i_156_ < class37_sub17_155_.anInt2180; i_156_++) {
					Class27 class27 = class37_sub17_155_.aClass27Array2186[i_156_];
					if ((class27.anInt673 >> 29 & 0x3) == 2
							&& class27.anInt678 == i
							&& class27.anInt674 == i_153_)
						class27.anInt685--;
				}
			}
		}
		if (aClass37_Sub17ArrayArrayArray1268[0][i][i_153_] == null)
			aClass37_Sub17ArrayArrayArray1268[0][i][i_153_] = new Class37_Sub17(
					0, i, i_153_);
		aClass37_Sub17ArrayArrayArray1268[0][i][i_153_].aClass37_Sub17_2189 = class37_sub17;
		aClass37_Sub17ArrayArrayArray1268[3][i][i_153_] = null;
	}

	public boolean method1212(int i, int i_157_, int i_158_, int i_159_) {
		if (!method1196(i, i_157_, i_158_))
			return false;
		int i_160_ = i_157_ << 7;
		int i_161_ = i_158_ << 7;
		int i_162_ = anIntArrayArrayArray1298[i][i_157_][i_158_] - 1;
		int i_163_ = i_162_ - 120;
		int i_164_ = i_162_ - 230;
		int i_165_ = i_162_ - 238;
		if (i_159_ < 16) {
			if (i_159_ == 1) {
				if (i_160_ > anInt1271) {
					if (!method1210(i_160_, i_162_, i_161_))
						return false;
					if (!method1210(i_160_, i_162_, i_161_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1210(i_160_, i_163_, i_161_))
						return false;
					if (!method1210(i_160_, i_163_, i_161_ + 128))
						return false;
				}
				if (!method1210(i_160_, i_164_, i_161_))
					return false;
				if (!method1210(i_160_, i_164_, i_161_ + 128))
					return false;
				return true;
			}
			if (i_159_ == 2) {
				if (i_161_ < anInt1293) {
					if (!method1210(i_160_, i_162_, i_161_ + 128))
						return false;
					if (!method1210(i_160_ + 128, i_162_, i_161_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1210(i_160_, i_163_, i_161_ + 128))
						return false;
					if (!method1210(i_160_ + 128, i_163_, i_161_ + 128))
						return false;
				}
				if (!method1210(i_160_, i_164_, i_161_ + 128))
					return false;
				if (!method1210(i_160_ + 128, i_164_, i_161_ + 128))
					return false;
				return true;
			}
			if (i_159_ == 4) {
				if (i_160_ < anInt1271) {
					if (!method1210(i_160_ + 128, i_162_, i_161_))
						return false;
					if (!method1210(i_160_ + 128, i_162_, i_161_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1210(i_160_ + 128, i_163_, i_161_))
						return false;
					if (!method1210(i_160_ + 128, i_163_, i_161_ + 128))
						return false;
				}
				if (!method1210(i_160_ + 128, i_164_, i_161_))
					return false;
				if (!method1210(i_160_ + 128, i_164_, i_161_ + 128))
					return false;
				return true;
			}
			if (i_159_ == 8) {
				if (i_161_ > anInt1293) {
					if (!method1210(i_160_, i_162_, i_161_))
						return false;
					if (!method1210(i_160_ + 128, i_162_, i_161_))
						return false;
				}
				if (i > 0) {
					if (!method1210(i_160_, i_163_, i_161_))
						return false;
					if (!method1210(i_160_ + 128, i_163_, i_161_))
						return false;
				}
				if (!method1210(i_160_, i_164_, i_161_))
					return false;
				if (!method1210(i_160_ + 128, i_164_, i_161_))
					return false;
				return true;
			}
		}
		if (!method1210(i_160_ + 64, i_165_, i_161_ + 64))
			return false;
		if (i_159_ == 16) {
			if (!method1210(i_160_, i_164_, i_161_ + 128))
				return false;
			return true;
		}
		if (i_159_ == 32) {
			if (!method1210(i_160_ + 128, i_164_, i_161_ + 128))
				return false;
			return true;
		}
		if (i_159_ == 64) {
			if (!method1210(i_160_ + 128, i_164_, i_161_))
				return false;
			return true;
		}
		if (i_159_ == 128) {
			if (!method1210(i_160_, i_164_, i_161_))
				return false;
			return true;
		}
		return true;
	}

	public void method1213(int i, int i_166_, int i_167_, int i_168_,
			int i_169_, int i_170_, int i_171_, int i_172_, int i_173_,
			int i_174_, int i_175_, int i_176_, int i_177_, int i_178_,
			int i_179_, int i_180_, int i_181_, int i_182_, int i_183_,
			int i_184_) {
		if (i_168_ == 0) {
			Class50 class50 = new Class50(i_175_, i_176_, i_177_, i_178_, -1,
					i_183_, false);
			for (int i_185_ = i; i_185_ >= 0; i_185_--) {
				if (aClass37_Sub17ArrayArrayArray1268[i_185_][i_166_][i_167_] == null)
					aClass37_Sub17ArrayArrayArray1268[i_185_][i_166_][i_167_] = new Class37_Sub17(
							i_185_, i_166_, i_167_);
			}
			aClass37_Sub17ArrayArrayArray1268[i][i_166_][i_167_].aClass50_2167 = class50;
		} else if (i_168_ == 1) {
			Class50 class50 = new Class50(i_179_, i_180_, i_181_, i_182_,
					i_170_, i_184_,
					(i_171_ == i_172_ && i_171_ == i_173_ && i_171_ == i_174_));
			for (int i_186_ = i; i_186_ >= 0; i_186_--) {
				if (aClass37_Sub17ArrayArrayArray1268[i_186_][i_166_][i_167_] == null)
					aClass37_Sub17ArrayArrayArray1268[i_186_][i_166_][i_167_] = new Class37_Sub17(
							i_186_, i_166_, i_167_);
			}
			aClass37_Sub17ArrayArrayArray1268[i][i_166_][i_167_].aClass50_2167 = class50;
		} else {
			Class63 class63 = new Class63(i_168_, i_169_, i_170_, i_166_,
					i_167_, i_171_, i_172_, i_173_, i_174_, i_175_, i_176_,
					i_177_, i_178_, i_179_, i_180_, i_181_, i_182_, i_183_,
					i_184_);
			for (int i_187_ = i; i_187_ >= 0; i_187_--) {
				if (aClass37_Sub17ArrayArrayArray1268[i_187_][i_166_][i_167_] == null)
					aClass37_Sub17ArrayArrayArray1268[i_187_][i_166_][i_167_] = new Class37_Sub17(
							i_187_, i_166_, i_167_);
			}
			aClass37_Sub17ArrayArrayArray1268[i][i_166_][i_167_].aClass63_2176 = class63;
		}
	}

	public Class41 method1214(int i, int i_188_, int i_189_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_188_][i_189_];
		if (class37_sub17 == null)
			return null;
		return class37_sub17.aClass41_2174;
	}

	public void method1215(Class27 class27) {
		for (int i = class27.anInt678; i <= class27.anInt684; i++) {
			for (int i_190_ = class27.anInt674; i_190_ <= class27.anInt668; i_190_++) {
				Class37_Sub17 class37_sub17 = (aClass37_Sub17ArrayArrayArray1268[class27.anInt685][i][i_190_]);
				if (class37_sub17 != null) {
					for (int i_191_ = 0; i_191_ < class37_sub17.anInt2180; i_191_++) {
						if (class37_sub17.aClass27Array2186[i_191_] == class27) {
							class37_sub17.anInt2180--;
							for (int i_192_ = i_191_; i_192_ < class37_sub17.anInt2180; i_192_++) {
								class37_sub17.aClass27Array2186[i_192_] = (class37_sub17.aClass27Array2186[i_192_ + 1]);
								class37_sub17.anIntArray2187[i_192_] = class37_sub17.anIntArray2187[i_192_ + 1];
							}
							class37_sub17.aClass27Array2186[(class37_sub17.anInt2180)] = null;
							break;
						}
					}
					class37_sub17.anInt2169 = 0;
					for (int i_193_ = 0; i_193_ < class37_sub17.anInt2180; i_193_++)
						class37_sub17.anInt2169 |= class37_sub17.anIntArray2187[i_193_];
				}
			}
		}
	}

	public void method1216(int[] is, int i, int i_194_, int i_195_, int i_196_,
			int i_197_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i_195_][i_196_][i_197_];
		if (class37_sub17 != null) {
			Class50 class50 = class37_sub17.aClass50_2167;
			if (class50 != null) {
				int i_198_ = class50.anInt1029;
				if (i_198_ != 0) {
					for (int i_199_ = 0; i_199_ < 4; i_199_++) {
						is[i] = i_198_;
						is[i + 1] = i_198_;
						is[i + 2] = i_198_;
						is[i + 3] = i_198_;
						i += i_194_;
					}
				}
			} else {
				Class63 class63 = class37_sub17.aClass63_2176;
				if (class63 != null) {
					int i_200_ = class63.anInt1189;
					int i_201_ = class63.anInt1190;
					int i_202_ = class63.anInt1192;
					int i_203_ = class63.anInt1198;
					int[] is_204_ = anIntArrayArray1303[i_200_];
					int[] is_205_ = anIntArrayArray1312[i_201_];
					int i_206_ = 0;
					if (i_202_ != 0) {
						for (int i_207_ = 0; i_207_ < 4; i_207_++) {
							is[i] = (is_204_[is_205_[i_206_++]] == 0 ? i_202_
									: i_203_);
							is[i + 1] = (is_204_[is_205_[i_206_++]] == 0 ? i_202_
									: i_203_);
							is[i + 2] = (is_204_[is_205_[i_206_++]] == 0 ? i_202_
									: i_203_);
							is[i + 3] = (is_204_[is_205_[i_206_++]] == 0 ? i_202_
									: i_203_);
							i += i_194_;
						}
					} else {
						for (int i_208_ = 0; i_208_ < 4; i_208_++) {
							if (is_204_[is_205_[i_206_++]] != 0)
								is[i] = i_203_;
							if (is_204_[is_205_[i_206_++]] != 0)
								is[i + 1] = i_203_;
							if (is_204_[is_205_[i_206_++]] != 0)
								is[i + 2] = i_203_;
							if (is_204_[is_205_[i_206_++]] != 0)
								is[i + 3] = i_203_;
							i += i_194_;
						}
					}
				}
			}
		}
	}

	public boolean method1217(int i, int i_209_, int i_210_, int i_211_,
			int i_212_, Class37_Sub4_Sub7 class37_sub4_sub7, int i_213_,
			int i_214_, int i_215_, int i_216_, int i_217_, int i_218_) {
		if (class37_sub4_sub7 == null)
			return true;
		return method1242(i, i_215_, i_216_, i_217_ - i_215_ + 1, i_218_
				- i_216_ + 1, i_209_, i_210_, i_211_, class37_sub4_sub7,
				i_213_, true, i_214_, 0);
	}

	public void method1218(Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4,
			int i, int i_219_, int i_220_, int i_221_, int i_222_) {
		boolean bool = true;
		int i_223_ = i_219_;
		int i_224_ = i_219_ + i_221_;
		int i_225_ = i_220_ - 1;
		int i_226_ = i_220_ + i_222_;
		for (int i_227_ = i; i_227_ <= i + 1; i_227_++) {
			if (i_227_ != anInt1270) {
				for (int i_228_ = i_223_; i_228_ <= i_224_; i_228_++) {
					if (i_228_ >= 0 && i_228_ < anInt1299) {
						for (int i_229_ = i_225_; i_229_ <= i_226_; i_229_++) {
							if (i_229_ >= 0
									&& i_229_ < anInt1302
									&& (!bool || i_228_ >= i_224_
											|| i_229_ >= i_226_ || i_229_ < i_220_
											&& i_228_ != i_219_)) {
								Class37_Sub17 class37_sub17 = (aClass37_Sub17ArrayArrayArray1268[i_227_][i_228_][i_229_]);
								if (class37_sub17 != null) {
									int i_230_ = (((anIntArrayArrayArray1298[i_227_][i_228_][i_229_])
											+ (anIntArrayArrayArray1298[i_227_][i_228_ + 1][i_229_])
											+ (anIntArrayArrayArray1298[i_227_][i_228_][i_229_ + 1]) + (anIntArrayArrayArray1298[i_227_][i_228_ + 1][i_229_ + 1])) / 4 - (((anIntArrayArrayArray1298[i][i_219_][i_220_])
											+ (anIntArrayArrayArray1298[i][i_219_ + 1][i_220_])
											+ (anIntArrayArrayArray1298[i][i_219_][i_220_ + 1]) + (anIntArrayArrayArray1298[i][i_219_ + 1][i_220_ + 1])) / 4));
									Class75 class75 = class37_sub17.aClass75_2170;
									if (class75 != null) {
										if (class75.aClass37_Sub4_Sub7_1404 instanceof Class37_Sub4_Sub7_Sub4) {
											Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_231_ = ((Class37_Sub4_Sub7_Sub4) (class75.aClass37_Sub4_Sub7_1404));
											Class37_Sub4_Sub7_Sub4
													.method530(
															class37_sub4_sub7_sub4,
															class37_sub4_sub7_sub4_231_,
															((i_228_ - i_219_) * 128 + (1 - i_221_) * 64),
															i_230_,
															((i_229_ - i_220_) * 128 + (1 - i_222_) * 64),
															bool);
										}
										if (class75.aClass37_Sub4_Sub7_1407 instanceof Class37_Sub4_Sub7_Sub4) {
											Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_232_ = ((Class37_Sub4_Sub7_Sub4) (class75.aClass37_Sub4_Sub7_1407));
											Class37_Sub4_Sub7_Sub4
													.method530(
															class37_sub4_sub7_sub4,
															class37_sub4_sub7_sub4_232_,
															((i_228_ - i_219_) * 128 + (1 - i_221_) * 64),
															i_230_,
															((i_229_ - i_220_) * 128 + (1 - i_222_) * 64),
															bool);
										}
									}
									for (int i_233_ = 0; i_233_ < class37_sub17.anInt2180; i_233_++) {
										Class27 class27 = (class37_sub17.aClass27Array2186[i_233_]);
										if (class27 != null
												&& (class27.aClass37_Sub4_Sub7_670 instanceof Class37_Sub4_Sub7_Sub4)) {
											Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_234_ = ((Class37_Sub4_Sub7_Sub4) (class27.aClass37_Sub4_Sub7_670));
											int i_235_ = (class27.anInt684
													- class27.anInt678 + 1);
											int i_236_ = (class27.anInt668
													- class27.anInt674 + 1);
											Class37_Sub4_Sub7_Sub4
													.method530(
															class37_sub4_sub7_sub4,
															class37_sub4_sub7_sub4_234_,
															(((class27.anInt678 - i_219_) * 128) + (i_235_ - i_221_) * 64),
															i_230_,
															(((class27.anInt674 - i_220_) * 128) + (i_236_ - i_222_) * 64),
															bool);
										}
									}
								}
							}
						}
					}
				}
				i_223_--;
				bool = false;
			}
		}
	}

	public void method1219(int i, int i_237_, int i_238_, int i_239_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_237_][i_238_];
		if (class37_sub17 != null)
			aClass37_Sub17ArrayArrayArray1268[i][i_237_][i_238_].anInt2173 = i_239_;
	}

	public void method1220(int i, int i_240_, int i_241_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_240_][i_241_];
		if (class37_sub17 != null)
			class37_sub17.aClass75_2170 = null;
	}

	public boolean method1221(int i, int i_242_, int i_243_, int i_244_,
			int i_245_, int i_246_, int i_247_, int i_248_) {
		if (i_242_ < i_243_ && i_242_ < i_244_ && i_242_ < i_245_)
			return false;
		if (i_242_ > i_243_ && i_242_ > i_244_ && i_242_ > i_245_)
			return false;
		if (i < i_246_ && i < i_247_ && i < i_248_)
			return false;
		if (i > i_246_ && i > i_247_ && i > i_248_)
			return false;
		int i_249_ = ((i_242_ - i_243_) * (i_247_ - i_246_) - (i - i_246_)
				* (i_244_ - i_243_));
		int i_250_ = ((i_242_ - i_245_) * (i_246_ - i_248_) - (i - i_248_)
				* (i_243_ - i_245_));
		int i_251_ = ((i_242_ - i_244_) * (i_248_ - i_247_) - (i - i_247_)
				* (i_245_ - i_244_));
		if (i_249_ * i_251_ > 0 && i_251_ * i_250_ > 0)
			return true;
		return false;
	}

	public void method1222(int i, int i_252_, int i_253_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_252_][i_253_];
		if (class37_sub17 != null)
			class37_sub17.aClass41_2174 = null;
	}

	public Class39 method1223(int i, int i_254_, int i_255_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_254_][i_255_];
		if (class37_sub17 == null || class37_sub17.aClass39_2178 == null)
			return null;
		return class37_sub17.aClass39_2178;
	}

	public void method1224() {
		for (int i = 0; i < anInt1269; i++) {
			Class27 class27 = aClass27Array1281[i];
			method1215(class27);
			aClass27Array1281[i] = null;
		}
		anInt1269 = 0;
	}

	public void method1225(int i, int i_256_, int i_257_, int i_258_,
			Class37_Sub4_Sub7 class37_sub4_sub7, int i_259_, int i_260_) {
		if (class37_sub4_sub7 != null) {
			Class39 class39 = new Class39();
			class39.aClass37_Sub4_Sub7_857 = class37_sub4_sub7;
			class39.anInt866 = i_256_ * 128 + 64;
			class39.anInt861 = i_257_ * 128 + 64;
			class39.anInt863 = i_258_;
			class39.anInt868 = i_259_;
			class39.anInt864 = i_260_;
			if (aClass37_Sub17ArrayArrayArray1268[i][i_256_][i_257_] == null)
				aClass37_Sub17ArrayArrayArray1268[i][i_256_][i_257_] = new Class37_Sub17(
						i, i_256_, i_257_);
			aClass37_Sub17ArrayArrayArray1268[i][i_256_][i_257_].aClass39_2178 = class39;
		}
	}

	public boolean method1226(int i, int i_261_, int i_262_, int i_263_) {
		if (!method1196(i, i_261_, i_262_))
			return false;
		int i_264_ = i_261_ << 7;
		int i_265_ = i_262_ << 7;
		if (method1210(i_264_ + 1, anIntArrayArrayArray1298[i][i_261_][i_262_]
				- i_263_, i_265_ + 1)
				&& method1210(
						i_264_ + 128 - 1,
						(anIntArrayArrayArray1298[i][i_261_ + 1][i_262_] - i_263_),
						i_265_ + 1)
				&& method1210(
						i_264_ + 128 - 1,
						(anIntArrayArrayArray1298[i][i_261_ + 1][i_262_ + 1] - i_263_),
						i_265_ + 128 - 1)
				&& method1210(
						i_264_ + 1,
						(anIntArrayArrayArray1298[i][i_261_][i_262_ + 1] - i_263_),
						i_265_ + 128 - 1))
			return true;
		return false;
	}

	public void method1227() {
		int i = anIntArray1301[anInt1274];
		Class79[] class79s = aClass79ArrayArray1290[anInt1274];
		anInt1284 = 0;
		for (int i_266_ = 0; i_266_ < i; i_266_++) {
			Class79 class79 = class79s[i_266_];
			if (class79.anInt1471 == 1) {
				int i_267_ = class79.anInt1483 - anInt1280 + 25;
				if (i_267_ >= 0 && i_267_ <= 50) {
					int i_268_ = class79.anInt1486 - anInt1300 + 25;
					if (i_268_ < 0)
						i_268_ = 0;
					int i_269_ = class79.anInt1487 - anInt1300 + 25;
					if (i_269_ > 50)
						i_269_ = 50;
					boolean bool = false;
					while (i_268_ <= i_269_) {
						if (aBooleanArrayArray1320[i_267_][i_268_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_270_ = anInt1271 - class79.anInt1472;
						if (i_270_ > 32)
							class79.anInt1480 = 1;
						else {
							if (i_270_ >= -32)
								continue;
							class79.anInt1480 = 2;
							i_270_ = -i_270_;
						}
						class79.anInt1467 = (class79.anInt1470 - anInt1293 << 8)
								/ i_270_;
						class79.anInt1484 = (class79.anInt1479 - anInt1293 << 8)
								/ i_270_;
						class79.anInt1500 = (class79.anInt1493 - anInt1272 << 8)
								/ i_270_;
						class79.anInt1475 = (class79.anInt1476 - anInt1272 << 8)
								/ i_270_;
						aClass79Array1275[anInt1284++] = class79;
					}
				}
			} else if (class79.anInt1471 == 2) {
				int i_271_ = class79.anInt1486 - anInt1300 + 25;
				if (i_271_ >= 0 && i_271_ <= 50) {
					int i_272_ = class79.anInt1483 - anInt1280 + 25;
					if (i_272_ < 0)
						i_272_ = 0;
					int i_273_ = class79.anInt1491 - anInt1280 + 25;
					if (i_273_ > 50)
						i_273_ = 50;
					boolean bool = false;
					while (i_272_ <= i_273_) {
						if (aBooleanArrayArray1320[i_272_++][i_271_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_274_ = anInt1293 - class79.anInt1470;
						if (i_274_ > 32)
							class79.anInt1480 = 3;
						else {
							if (i_274_ >= -32)
								continue;
							class79.anInt1480 = 4;
							i_274_ = -i_274_;
						}
						class79.anInt1496 = (class79.anInt1472 - anInt1271 << 8)
								/ i_274_;
						class79.anInt1499 = (class79.anInt1498 - anInt1271 << 8)
								/ i_274_;
						class79.anInt1500 = (class79.anInt1493 - anInt1272 << 8)
								/ i_274_;
						class79.anInt1475 = (class79.anInt1476 - anInt1272 << 8)
								/ i_274_;
						aClass79Array1275[anInt1284++] = class79;
					}
				}
			} else if (class79.anInt1471 == 4) {
				int i_275_ = class79.anInt1493 - anInt1272;
				if (i_275_ > 128) {
					int i_276_ = class79.anInt1486 - anInt1300 + 25;
					if (i_276_ < 0)
						i_276_ = 0;
					int i_277_ = class79.anInt1487 - anInt1300 + 25;
					if (i_277_ > 50)
						i_277_ = 50;
					if (i_276_ <= i_277_) {
						int i_278_ = class79.anInt1483 - anInt1280 + 25;
						if (i_278_ < 0)
							i_278_ = 0;
						int i_279_ = class79.anInt1491 - anInt1280 + 25;
						if (i_279_ > 50)
							i_279_ = 50;
						boolean bool = false;
						while_91_: for (int i_280_ = i_278_; i_280_ <= i_279_; i_280_++) {
							for (int i_281_ = i_276_; i_281_ <= i_277_; i_281_++) {
								if (aBooleanArrayArray1320[i_280_][i_281_]) {
									bool = true;
									break while_91_;
								}
							}
						}
						if (bool) {
							class79.anInt1480 = 5;
							class79.anInt1496 = (class79.anInt1472 - anInt1271 << 8)
									/ i_275_;
							class79.anInt1499 = (class79.anInt1498 - anInt1271 << 8)
									/ i_275_;
							class79.anInt1467 = (class79.anInt1470 - anInt1293 << 8)
									/ i_275_;
							class79.anInt1484 = (class79.anInt1479 - anInt1293 << 8)
									/ i_275_;
							aClass79Array1275[anInt1284++] = class79;
						}
					}
				}
			}
		}
	}

	public int method1228(int i, int i_282_, int i_283_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_282_][i_283_];
		if (class37_sub17 == null)
			return 0;
		for (int i_284_ = 0; i_284_ < class37_sub17.anInt2180; i_284_++) {
			Class27 class27 = class37_sub17.aClass27Array2186[i_284_];
			if ((class27.anInt673 >> 29 & 0x3) == 2
					&& class27.anInt678 == i_282_ && class27.anInt674 == i_283_)
				return class27.anInt673;
		}
		return 0;
	}

	public void method1229(Class37_Sub17 class37_sub17, boolean bool) {
		aClass58_1285.addLast(class37_sub17);
		for (;;) {
			Class37_Sub17 class37_sub17_285_ = (Class37_Sub17) aClass58_1285
					.removeFirst();
			if (class37_sub17_285_ == null)
				break;
			if (class37_sub17_285_.aBoolean2172) {
				int i = class37_sub17_285_.anInt2190;
				int i_286_ = class37_sub17_285_.anInt2171;
				int i_287_ = class37_sub17_285_.anInt2175;
				int i_288_ = class37_sub17_285_.anInt2182;
				Class37_Sub17[][] class37_sub17s = aClass37_Sub17ArrayArrayArray1268[i_287_];
				if (class37_sub17_285_.aBoolean2168) {
					if (bool) {
						if (i_287_ > 0) {
							Class37_Sub17 class37_sub17_289_ = (aClass37_Sub17ArrayArrayArray1268[i_287_ - 1][i][i_286_]);
							if (class37_sub17_289_ != null
									&& class37_sub17_289_.aBoolean2172)
								continue;
						}
						if (i <= anInt1280 && i > anInt1266) {
							Class37_Sub17 class37_sub17_290_ = class37_sub17s[i - 1][i_286_];
							if (class37_sub17_290_ != null
									&& class37_sub17_290_.aBoolean2172
									&& (class37_sub17_290_.aBoolean2168 || ((class37_sub17_285_.anInt2169 & 0x1) == 0)))
								continue;
						}
						if (i >= anInt1280 && i < anInt1296 - 1) {
							Class37_Sub17 class37_sub17_291_ = class37_sub17s[i + 1][i_286_];
							if (class37_sub17_291_ != null
									&& class37_sub17_291_.aBoolean2172
									&& (class37_sub17_291_.aBoolean2168 || ((class37_sub17_285_.anInt2169 & 0x4) == 0)))
								continue;
						}
						if (i_286_ <= anInt1300 && i_286_ > anInt1286) {
							Class37_Sub17 class37_sub17_292_ = class37_sub17s[i][i_286_ - 1];
							if (class37_sub17_292_ != null
									&& class37_sub17_292_.aBoolean2172
									&& (class37_sub17_292_.aBoolean2168 || ((class37_sub17_285_.anInt2169 & 0x8) == 0)))
								continue;
						}
						if (i_286_ >= anInt1300 && i_286_ < anInt1265 - 1) {
							Class37_Sub17 class37_sub17_293_ = class37_sub17s[i][i_286_ + 1];
							if (class37_sub17_293_ != null
									&& class37_sub17_293_.aBoolean2172
									&& (class37_sub17_293_.aBoolean2168 || ((class37_sub17_285_.anInt2169 & 0x2) == 0)))
								continue;
						}
					} else
						bool = true;
					class37_sub17_285_.aBoolean2168 = false;
					if (class37_sub17_285_.aClass37_Sub17_2189 != null) {
						Class37_Sub17 class37_sub17_294_ = class37_sub17_285_.aClass37_Sub17_2189;
						if (class37_sub17_294_.aClass50_2167 != null) {
							if (!method1196(0, i, i_286_))
								method1243(class37_sub17_294_.aClass50_2167, 0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, i, i_286_);
						} else if (class37_sub17_294_.aClass63_2176 != null
								&& !method1196(0, i, i_286_))
							method1205(class37_sub17_294_.aClass63_2176,
									anInt1277, anInt1292, anInt1297, anInt1295,
									i, i_286_);
						Class75 class75 = class37_sub17_294_.aClass75_2170;
						if (class75 != null)
							class75.aClass37_Sub4_Sub7_1404.method494(0,
									anInt1277, anInt1292, anInt1297, anInt1295,
									class75.anInt1408 - anInt1271,
									class75.anInt1416 - anInt1272,
									class75.anInt1412 - anInt1293,
									class75.anInt1411);
						for (int i_295_ = 0; i_295_ < class37_sub17_294_.anInt2180; i_295_++) {
							Class27 class27 = class37_sub17_294_.aClass27Array2186[i_295_];
							if (class27 != null)
								class27.aClass37_Sub4_Sub7_670.method494(
										class27.anInt675, anInt1277, anInt1292,
										anInt1297, anInt1295, class27.anInt671
												- anInt1271, class27.anInt680
												- anInt1272, class27.anInt679
												- anInt1293, class27.anInt673);
						}
					}
					boolean bool_296_ = false;
					if (class37_sub17_285_.aClass50_2167 != null) {
						if (!method1196(i_288_, i, i_286_)) {
							bool_296_ = true;
							if ((class37_sub17_285_.aClass50_2167.anInt1018 != 12345678)
									|| aBoolean1267 && i_287_ <= anInt1283)
								method1243(class37_sub17_285_.aClass50_2167,
										i_288_, anInt1277, anInt1292,
										anInt1297, anInt1295, i, i_286_);
						}
					} else if (class37_sub17_285_.aClass63_2176 != null
							&& !method1196(i_288_, i, i_286_)) {
						bool_296_ = true;
						method1205(class37_sub17_285_.aClass63_2176, anInt1277,
								anInt1292, anInt1297, anInt1295, i, i_286_);
					}
					int i_297_ = 0;
					int i_298_ = 0;
					Class75 class75 = class37_sub17_285_.aClass75_2170;
					Class41 class41 = class37_sub17_285_.aClass41_2174;
					if (class75 != null || class41 != null) {
						if (anInt1280 == i)
							i_297_++;
						else if (anInt1280 < i)
							i_297_ += 2;
						if (anInt1300 == i_286_)
							i_297_ += 3;
						else if (anInt1300 > i_286_)
							i_297_ += 6;
						i_298_ = anIntArray1307[i_297_];
						class37_sub17_285_.anInt2185 = anIntArray1309[i_297_];
					}
					if (class75 != null) {
						if ((class75.anInt1417 & anIntArray1306[i_297_]) != 0) {
							if (class75.anInt1417 == 16) {
								class37_sub17_285_.anInt2181 = 3;
								class37_sub17_285_.anInt2179 = anIntArray1305[i_297_];
								class37_sub17_285_.anInt2177 = 3 - class37_sub17_285_.anInt2179;
							} else if (class75.anInt1417 == 32) {
								class37_sub17_285_.anInt2181 = 6;
								class37_sub17_285_.anInt2179 = anIntArray1319[i_297_];
								class37_sub17_285_.anInt2177 = 6 - class37_sub17_285_.anInt2179;
							} else if (class75.anInt1417 == 64) {
								class37_sub17_285_.anInt2181 = 12;
								class37_sub17_285_.anInt2179 = anIntArray1315[i_297_];
								class37_sub17_285_.anInt2177 = 12 - class37_sub17_285_.anInt2179;
							} else {
								class37_sub17_285_.anInt2181 = 9;
								class37_sub17_285_.anInt2179 = anIntArray1317[i_297_];
								class37_sub17_285_.anInt2177 = 9 - class37_sub17_285_.anInt2179;
							}
						} else
							class37_sub17_285_.anInt2181 = 0;
						if ((class75.anInt1417 & i_298_) != 0
								&& !method1212(i_288_, i, i_286_,
										class75.anInt1417))
							class75.aClass37_Sub4_Sub7_1404.method494(0,
									anInt1277, anInt1292, anInt1297, anInt1295,
									class75.anInt1408 - anInt1271,
									class75.anInt1416 - anInt1272,
									class75.anInt1412 - anInt1293,
									class75.anInt1411);
						if ((class75.anInt1403 & i_298_) != 0
								&& !method1212(i_288_, i, i_286_,
										class75.anInt1403))
							class75.aClass37_Sub4_Sub7_1407.method494(0,
									anInt1277, anInt1292, anInt1297, anInt1295,
									class75.anInt1408 - anInt1271,
									class75.anInt1416 - anInt1272,
									class75.anInt1412 - anInt1293,
									class75.anInt1411);
					}
					if (class41 != null
							&& !method1226(i_288_, i, i_286_,
									(class41.aClass37_Sub4_Sub7_892.anInt2627))) {
						if ((class41.anInt904 & i_298_) != 0)
							class41.aClass37_Sub4_Sub7_892
									.method494(
											0,
											anInt1277,
											anInt1292,
											anInt1297,
											anInt1295,
											(class41.anInt907 - anInt1271 + class41.anInt896),
											class41.anInt891 - anInt1272,
											(class41.anInt897 - anInt1293 + class41.anInt890),
											class41.anInt911);
						else if (class41.anInt904 == 256) {
							int i_299_ = class41.anInt907 - anInt1271;
							int i_300_ = class41.anInt891 - anInt1272;
							int i_301_ = class41.anInt897 - anInt1293;
							int i_302_ = class41.anInt908;
							int i_303_;
							if (i_302_ == 1 || i_302_ == 2)
								i_303_ = -i_299_;
							else
								i_303_ = i_299_;
							int i_304_;
							if (i_302_ == 2 || i_302_ == 3)
								i_304_ = -i_301_;
							else
								i_304_ = i_301_;
							if (i_304_ < i_303_)
								class41.aClass37_Sub4_Sub7_892.method494(0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, i_299_ + class41.anInt896,
										i_300_, i_301_ + class41.anInt890,
										class41.anInt911);
							else if (class41.aClass37_Sub4_Sub7_887 != null)
								class41.aClass37_Sub4_Sub7_887.method494(0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, i_299_, i_300_, i_301_,
										class41.anInt911);
						}
					}
					if (bool_296_) {
						Class39 class39 = class37_sub17_285_.aClass39_2178;
						if (class39 != null)
							class39.aClass37_Sub4_Sub7_857.method494(0,
									anInt1277, anInt1292, anInt1297, anInt1295,
									class39.anInt866 - anInt1271,
									class39.anInt863 - anInt1272,
									class39.anInt861 - anInt1293,
									class39.anInt868);
						Class76 class76 = class37_sub17_285_.aClass76_2183;
						if (class76 != null && class76.anInt1420 == 0) {
							if (class76.aClass37_Sub4_Sub7_1419 != null)
								class76.aClass37_Sub4_Sub7_1419.method494(0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, class76.anInt1427
												- anInt1271, class76.anInt1418
												- anInt1272, class76.anInt1430
												- anInt1293, class76.anInt1433);
							if (class76.aClass37_Sub4_Sub7_1428 != null)
								class76.aClass37_Sub4_Sub7_1428.method494(0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, class76.anInt1427
												- anInt1271, class76.anInt1418
												- anInt1272, class76.anInt1430
												- anInt1293, class76.anInt1433);
							if (class76.aClass37_Sub4_Sub7_1429 != null)
								class76.aClass37_Sub4_Sub7_1429.method494(0,
										anInt1277, anInt1292, anInt1297,
										anInt1295, class76.anInt1427
												- anInt1271, class76.anInt1418
												- anInt1272, class76.anInt1430
												- anInt1293, class76.anInt1433);
						}
					}
					int i_305_ = class37_sub17_285_.anInt2169;
					if (i_305_ != 0) {
						if (i < anInt1280 && (i_305_ & 0x4) != 0) {
							Class37_Sub17 class37_sub17_306_ = class37_sub17s[i + 1][i_286_];
							if (class37_sub17_306_ != null
									&& class37_sub17_306_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_306_);
						}
						if (i_286_ < anInt1300 && (i_305_ & 0x2) != 0) {
							Class37_Sub17 class37_sub17_307_ = class37_sub17s[i][i_286_ + 1];
							if (class37_sub17_307_ != null
									&& class37_sub17_307_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_307_);
						}
						if (i > anInt1280 && (i_305_ & 0x1) != 0) {
							Class37_Sub17 class37_sub17_308_ = class37_sub17s[i - 1][i_286_];
							if (class37_sub17_308_ != null
									&& class37_sub17_308_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_308_);
						}
						if (i_286_ > anInt1300 && (i_305_ & 0x8) != 0) {
							Class37_Sub17 class37_sub17_309_ = class37_sub17s[i][i_286_ - 1];
							if (class37_sub17_309_ != null
									&& class37_sub17_309_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_309_);
						}
					}
				}
				if (class37_sub17_285_.anInt2181 != 0) {
					boolean bool_310_ = true;
					for (int i_311_ = 0; i_311_ < class37_sub17_285_.anInt2180; i_311_++) {
						if ((class37_sub17_285_.aClass27Array2186[i_311_].anInt686) != anInt1289
								&& ((class37_sub17_285_.anIntArray2187[i_311_] & class37_sub17_285_.anInt2181) == class37_sub17_285_.anInt2179)) {
							bool_310_ = false;
							break;
						}
					}
					if (bool_310_) {
						Class75 class75 = class37_sub17_285_.aClass75_2170;
						if (!method1212(i_288_, i, i_286_, class75.anInt1417))
							class75.aClass37_Sub4_Sub7_1404.method494(0,
									anInt1277, anInt1292, anInt1297, anInt1295,
									class75.anInt1408 - anInt1271,
									class75.anInt1416 - anInt1272,
									class75.anInt1412 - anInt1293,
									class75.anInt1411);
						class37_sub17_285_.anInt2181 = 0;
					}
				}
				if (class37_sub17_285_.aBoolean2184) {
					try {
						int i_312_ = class37_sub17_285_.anInt2180;
						class37_sub17_285_.aBoolean2184 = false;
						int i_313_ = 0;
						while_93_: for (int i_314_ = 0; i_314_ < i_312_; i_314_++) {
							Class27 class27 = class37_sub17_285_.aClass27Array2186[i_314_];
							if (class27.anInt686 != anInt1289) {
								for (int i_315_ = class27.anInt678; i_315_ <= class27.anInt684; i_315_++) {
									for (int i_316_ = class27.anInt674; i_316_ <= class27.anInt668; i_316_++) {
										Class37_Sub17 class37_sub17_317_ = class37_sub17s[i_315_][i_316_];
										if (class37_sub17_317_.aBoolean2168) {
											class37_sub17_285_.aBoolean2184 = true;
											continue while_93_;
										}
										if (class37_sub17_317_.anInt2181 != 0) {
											int i_318_ = 0;
											if (i_315_ > class27.anInt678)
												i_318_++;
											if (i_315_ < class27.anInt684)
												i_318_ += 4;
											if (i_316_ > class27.anInt674)
												i_318_ += 8;
											if (i_316_ < class27.anInt668)
												i_318_ += 2;
											if ((i_318_ & (class37_sub17_317_.anInt2181)) == (class37_sub17_285_.anInt2177)) {
												class37_sub17_285_.aBoolean2184 = true;
												continue while_93_;
											}
										}
									}
								}
								aClass27Array1287[i_313_++] = class27;
								int i_319_ = anInt1280 - class27.anInt678;
								int i_320_ = class27.anInt684 - anInt1280;
								if (i_320_ > i_319_)
									i_319_ = i_320_;
								int i_321_ = anInt1300 - class27.anInt674;
								int i_322_ = class27.anInt668 - anInt1300;
								if (i_322_ > i_321_)
									class27.anInt669 = i_319_ + i_322_;
								else
									class27.anInt669 = i_319_ + i_321_;
							}
						}
						while (i_313_ > 0) {
							int i_323_ = -50;
							int i_324_ = -1;
							for (int i_325_ = 0; i_325_ < i_313_; i_325_++) {
								Class27 class27 = aClass27Array1287[i_325_];
								if (class27.anInt686 != anInt1289) {
									if (class27.anInt669 > i_323_) {
										i_323_ = class27.anInt669;
										i_324_ = i_325_;
									} else if (class27.anInt669 == i_323_) {
										int i_326_ = class27.anInt671
												- anInt1271;
										int i_327_ = class27.anInt679
												- anInt1293;
										int i_328_ = ((aClass27Array1287[i_324_].anInt671) - anInt1271);
										int i_329_ = ((aClass27Array1287[i_324_].anInt679) - anInt1293);
										if (i_326_ * i_326_ + i_327_ * i_327_ > (i_328_
												* i_328_ + i_329_ * i_329_))
											i_324_ = i_325_;
									}
								}
							}
							if (i_324_ == -1)
								break;
							Class27 class27 = aClass27Array1287[i_324_];
							class27.anInt686 = anInt1289;
							if (!method1198(i_288_, class27.anInt678,
									class27.anInt684, class27.anInt674,
									class27.anInt668,
									(class27.aClass37_Sub4_Sub7_670.anInt2627)))
								class27.aClass37_Sub4_Sub7_670.method494(
										class27.anInt675, anInt1277, anInt1292,
										anInt1297, anInt1295, class27.anInt671
												- anInt1271, class27.anInt680
												- anInt1272, class27.anInt679
												- anInt1293, class27.anInt673);
							for (int i_330_ = class27.anInt678; i_330_ <= class27.anInt684; i_330_++) {
								for (int i_331_ = class27.anInt674; i_331_ <= class27.anInt668; i_331_++) {
									Class37_Sub17 class37_sub17_332_ = class37_sub17s[i_330_][i_331_];
									if (class37_sub17_332_.anInt2181 != 0)
										aClass58_1285.addLast(class37_sub17_332_);
									else if ((i_330_ != i || i_331_ != i_286_)
											&& (class37_sub17_332_.aBoolean2172))
										aClass58_1285.addLast(class37_sub17_332_);
								}
							}
						}
						if (class37_sub17_285_.aBoolean2184)
							continue;
					} catch (Exception exception) {
						class37_sub17_285_.aBoolean2184 = false;
					}
				}
				if (class37_sub17_285_.aBoolean2172) {
					if (class37_sub17_285_.anInt2181 == 0) {
						if (i <= anInt1280 && i > anInt1266) {
							Class37_Sub17 class37_sub17_333_ = class37_sub17s[i - 1][i_286_];
							if (class37_sub17_333_ != null
									&& class37_sub17_333_.aBoolean2172)
								continue;
						}
						if (i >= anInt1280 && i < anInt1296 - 1) {
							Class37_Sub17 class37_sub17_334_ = class37_sub17s[i + 1][i_286_];
							if (class37_sub17_334_ != null
									&& class37_sub17_334_.aBoolean2172)
								continue;
						}
						if (i_286_ <= anInt1300 && i_286_ > anInt1286) {
							Class37_Sub17 class37_sub17_335_ = class37_sub17s[i][i_286_ - 1];
							if (class37_sub17_335_ != null
									&& class37_sub17_335_.aBoolean2172)
								continue;
						}
						if (i_286_ >= anInt1300 && i_286_ < anInt1265 - 1) {
							Class37_Sub17 class37_sub17_336_ = class37_sub17s[i][i_286_ + 1];
							if (class37_sub17_336_ != null
									&& class37_sub17_336_.aBoolean2172)
								continue;
						}
						class37_sub17_285_.aBoolean2172 = false;
						anInt1304--;
						Class76 class76 = class37_sub17_285_.aClass76_2183;
						if (class76 != null && class76.anInt1420 != 0) {
							if (class76.aClass37_Sub4_Sub7_1419 != null)
								class76.aClass37_Sub4_Sub7_1419
										.method494(
												0,
												anInt1277,
												anInt1292,
												anInt1297,
												anInt1295,
												class76.anInt1427 - anInt1271,
												(class76.anInt1418 - anInt1272 - class76.anInt1420),
												class76.anInt1430 - anInt1293,
												class76.anInt1433);
							if (class76.aClass37_Sub4_Sub7_1428 != null)
								class76.aClass37_Sub4_Sub7_1428
										.method494(
												0,
												anInt1277,
												anInt1292,
												anInt1297,
												anInt1295,
												class76.anInt1427 - anInt1271,
												(class76.anInt1418 - anInt1272 - class76.anInt1420),
												class76.anInt1430 - anInt1293,
												class76.anInt1433);
							if (class76.aClass37_Sub4_Sub7_1429 != null)
								class76.aClass37_Sub4_Sub7_1429
										.method494(
												0,
												anInt1277,
												anInt1292,
												anInt1297,
												anInt1295,
												class76.anInt1427 - anInt1271,
												(class76.anInt1418 - anInt1272 - class76.anInt1420),
												class76.anInt1430 - anInt1293,
												class76.anInt1433);
						}
						if (class37_sub17_285_.anInt2185 != 0) {
							Class41 class41 = class37_sub17_285_.aClass41_2174;
							if (class41 != null
									&& !method1226(
											i_288_,
											i,
											i_286_,
											(class41.aClass37_Sub4_Sub7_892.anInt2627))) {
								if ((class41.anInt904 & class37_sub17_285_.anInt2185) != 0)
									class41.aClass37_Sub4_Sub7_892
											.method494(
													0,
													anInt1277,
													anInt1292,
													anInt1297,
													anInt1295,
													(class41.anInt907
															- anInt1271 + class41.anInt896),
													class41.anInt891
															- anInt1272,
													(class41.anInt897
															- anInt1293 + class41.anInt890),
													class41.anInt911);
								else if (class41.anInt904 == 256) {
									int i_337_ = class41.anInt907 - anInt1271;
									int i_338_ = class41.anInt891 - anInt1272;
									int i_339_ = class41.anInt897 - anInt1293;
									int i_340_ = class41.anInt908;
									int i_341_;
									if (i_340_ == 1 || i_340_ == 2)
										i_341_ = -i_337_;
									else
										i_341_ = i_337_;
									int i_342_;
									if (i_340_ == 2 || i_340_ == 3)
										i_342_ = -i_339_;
									else
										i_342_ = i_339_;
									if (i_342_ >= i_341_)
										class41.aClass37_Sub4_Sub7_892
												.method494(
														0,
														anInt1277,
														anInt1292,
														anInt1297,
														anInt1295,
														i_337_
																+ class41.anInt896,
														i_338_,
														i_339_
																+ class41.anInt890,
														class41.anInt911);
									else if (class41.aClass37_Sub4_Sub7_887 != null)
										class41.aClass37_Sub4_Sub7_887
												.method494(0, anInt1277,
														anInt1292, anInt1297,
														anInt1295, i_337_,
														i_338_, i_339_,
														class41.anInt911);
								}
							}
							Class75 class75 = class37_sub17_285_.aClass75_2170;
							if (class75 != null) {
								if ((class75.anInt1403 & class37_sub17_285_.anInt2185) != 0
										&& !method1212(i_288_, i, i_286_,
												class75.anInt1403))
									class75.aClass37_Sub4_Sub7_1407.method494(
											0, anInt1277, anInt1292, anInt1297,
											anInt1295, class75.anInt1408
													- anInt1271,
											class75.anInt1416 - anInt1272,
											class75.anInt1412 - anInt1293,
											class75.anInt1411);
								if ((class75.anInt1417 & class37_sub17_285_.anInt2185) != 0
										&& !method1212(i_288_, i, i_286_,
												class75.anInt1417))
									class75.aClass37_Sub4_Sub7_1404.method494(
											0, anInt1277, anInt1292, anInt1297,
											anInt1295, class75.anInt1408
													- anInt1271,
											class75.anInt1416 - anInt1272,
											class75.anInt1412 - anInt1293,
											class75.anInt1411);
							}
						}
						if (i_287_ < anInt1270 - 1) {
							Class37_Sub17 class37_sub17_343_ = (aClass37_Sub17ArrayArrayArray1268[i_287_ + 1][i][i_286_]);
							if (class37_sub17_343_ != null
									&& class37_sub17_343_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_343_);
						}
						if (i < anInt1280) {
							Class37_Sub17 class37_sub17_344_ = class37_sub17s[i + 1][i_286_];
							if (class37_sub17_344_ != null
									&& class37_sub17_344_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_344_);
						}
						if (i_286_ < anInt1300) {
							Class37_Sub17 class37_sub17_345_ = class37_sub17s[i][i_286_ + 1];
							if (class37_sub17_345_ != null
									&& class37_sub17_345_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_345_);
						}
						if (i > anInt1280) {
							Class37_Sub17 class37_sub17_346_ = class37_sub17s[i - 1][i_286_];
							if (class37_sub17_346_ != null
									&& class37_sub17_346_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_346_);
						}
						if (i_286_ > anInt1300) {
							Class37_Sub17 class37_sub17_347_ = class37_sub17s[i][i_286_ - 1];
							if (class37_sub17_347_ != null
									&& class37_sub17_347_.aBoolean2172)
								aClass58_1285.addLast(class37_sub17_347_);
						}
					}
				}
			}
		}
	}

	public int method1230(int i, int i_348_, int i_349_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_348_][i_349_];
		if (class37_sub17 == null || class37_sub17.aClass75_2170 == null)
			return 0;
		return class37_sub17.aClass75_2170.anInt1411;
	}

	public void method1231(int i, int i_350_, int i_351_, int i_352_,
			Class37_Sub4_Sub7 class37_sub4_sub7, int i_353_,
			Class37_Sub4_Sub7 class37_sub4_sub7_354_,
			Class37_Sub4_Sub7 class37_sub4_sub7_355_) {
		Class76 class76 = new Class76();
		class76.aClass37_Sub4_Sub7_1429 = class37_sub4_sub7;
		class76.anInt1427 = i_350_ * 128 + 64;
		class76.anInt1430 = i_351_ * 128 + 64;
		class76.anInt1418 = i_352_;
		class76.anInt1433 = i_353_;
		class76.aClass37_Sub4_Sub7_1419 = class37_sub4_sub7_354_;
		class76.aClass37_Sub4_Sub7_1428 = class37_sub4_sub7_355_;
		int i_356_ = 0;
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_350_][i_351_];
		if (class37_sub17 != null) {
			for (int i_357_ = 0; i_357_ < class37_sub17.anInt2180; i_357_++) {
				if (((class37_sub17.aClass27Array2186[i_357_].anInt683 & 0x100) == 256)
						&& ((class37_sub17.aClass27Array2186[i_357_].aClass37_Sub4_Sub7_670) instanceof Class37_Sub4_Sub7_Sub6)) {
					Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) (class37_sub17.aClass27Array2186[i_357_].aClass37_Sub4_Sub7_670));
					class37_sub4_sub7_sub6.method555();
					if (class37_sub4_sub7_sub6.anInt2627 > i_356_)
						i_356_ = class37_sub4_sub7_sub6.anInt2627;
				}
			}
		}
		class76.anInt1420 = i_356_;
		if (aClass37_Sub17ArrayArrayArray1268[i][i_350_][i_351_] == null)
			aClass37_Sub17ArrayArrayArray1268[i][i_350_][i_351_] = new Class37_Sub17(
					i, i_350_, i_351_);
		aClass37_Sub17ArrayArrayArray1268[i][i_350_][i_351_].aClass76_2183 = class76;
	}

	public Class75 method1232(int i, int i_358_, int i_359_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_358_][i_359_];
		if (class37_sub17 == null)
			return null;
		return class37_sub17.aClass75_2170;
	}

	public static void method1233(int i, int i_360_, int i_361_, int i_362_,
			int i_363_, int i_364_, int i_365_, int i_366_) {
		Class79 class79 = new Class79();
		class79.anInt1483 = i_361_ / 128;
		class79.anInt1491 = i_362_ / 128;
		class79.anInt1486 = i_363_ / 128;
		class79.anInt1487 = i_364_ / 128;
		class79.anInt1471 = i_360_;
		class79.anInt1472 = i_361_;
		class79.anInt1498 = i_362_;
		class79.anInt1470 = i_363_;
		class79.anInt1479 = i_364_;
		class79.anInt1493 = i_365_;
		class79.anInt1476 = i_366_;
		aClass79ArrayArray1290[i][anIntArray1301[i]++] = class79;
	}

	public void method1234(int i) {
		anInt1273 = i;
		for (int i_367_ = 0; i_367_ < anInt1299; i_367_++) {
			for (int i_368_ = 0; i_368_ < anInt1302; i_368_++) {
				if (aClass37_Sub17ArrayArrayArray1268[i][i_367_][i_368_] == null)
					aClass37_Sub17ArrayArrayArray1268[i][i_367_][i_368_] = new Class37_Sub17(
							i, i_367_, i_368_);
			}
		}
	}

	public static boolean method1235(int i, int i_369_, int i_370_) {
		int i_371_ = i_370_ * anInt1297 + i * anInt1295 >> 16;
		int i_372_ = i_370_ * anInt1295 - i * anInt1297 >> 16;
		int i_373_ = i_369_ * anInt1277 + i_372_ * anInt1292 >> 16;
		int i_374_ = i_369_ * anInt1292 - i_372_ * anInt1277 >> 16;
		if (i_373_ < 50 || i_373_ > 3500)
			return false;
		int i_375_ = anInt1310 + (i_371_ << 9) / i_373_;
		int i_376_ = anInt1318 + (i_374_ << 9) / i_373_;
		if (i_375_ < anInt1314 || i_375_ > anInt1308 || i_376_ < anInt1313
				|| i_376_ > anInt1316)
			return false;
		return true;
	}

	public static void method1236(int[] is, int i, int i_377_, int i_378_,
			int i_379_) {
		anInt1314 = 0;
		anInt1313 = 0;
		anInt1308 = i_378_;
		anInt1316 = i_379_;
		anInt1310 = i_378_ / 2;
		anInt1318 = i_379_ / 2;
		boolean[][][][] bools = new boolean[9][32][53][53];
		for (int i_380_ = 128; i_380_ <= 384; i_380_ += 32) {
			for (int i_381_ = 0; i_381_ < 2048; i_381_ += 64) {
				anInt1277 = Rasterizer.anIntArray3910[i_380_];
				anInt1292 = Rasterizer.anIntArray3929[i_380_];
				anInt1297 = Rasterizer.anIntArray3910[i_381_];
				anInt1295 = Rasterizer.anIntArray3929[i_381_];
				int i_382_ = (i_380_ - 128) / 32;
				int i_383_ = i_381_ / 64;
				for (int i_384_ = -26; i_384_ <= 26; i_384_++) {
					for (int i_385_ = -26; i_385_ <= 26; i_385_++) {
						int i_386_ = i_384_ * 128;
						int i_387_ = i_385_ * 128;
						boolean bool = false;
						for (int i_388_ = -i; i_388_ <= i_377_; i_388_ += 128) {
							if (method1235(i_386_, is[i_382_] + i_388_, i_387_)) {
								bool = true;
								break;
							}
						}
						bools[i_382_][i_383_][i_384_ + 25 + 1][i_385_ + 25 + 1] = bool;
					}
				}
			}
		}
		for (int i_389_ = 0; i_389_ < 8; i_389_++) {
			for (int i_390_ = 0; i_390_ < 32; i_390_++) {
				for (int i_391_ = -25; i_391_ < 25; i_391_++) {
					for (int i_392_ = -25; i_392_ < 25; i_392_++) {
						boolean bool = false;
						while_94_: for (int i_393_ = -1; i_393_ <= 1; i_393_++) {
							for (int i_394_ = -1; i_394_ <= 1; i_394_++) {
								if (bools[i_389_][i_390_][i_391_ + i_393_ + 25
										+ 1][i_392_ + i_394_ + 25 + 1]) {
									bool = true;
									break while_94_;
								}
								if (bools[i_389_][(i_390_ + 1) % 31][i_391_
										+ i_393_ + 25 + 1][i_392_ + i_394_ + 25
										+ 1]) {
									bool = true;
									break while_94_;
								}
								if (bools[i_389_ + 1][i_390_][i_391_ + i_393_
										+ 25 + 1][i_392_ + i_394_ + 25 + 1]) {
									bool = true;
									break while_94_;
								}
								if (bools[i_389_ + 1][(i_390_ + 1) % 31][i_391_
										+ i_393_ + 25 + 1][i_392_ + i_394_ + 25
										+ 1]) {
									bool = true;
									break while_94_;
								}
							}
						}
						aBooleanArrayArrayArrayArray1311[i_389_][i_390_][i_391_ + 25][i_392_ + 25] = bool;
					}
				}
			}
		}
	}

	public static void method1237() {
		aClass27Array1287 = null;
		anIntArray1301 = null;
		aClass79ArrayArray1290 = null;
		aClass79Array1275 = null;
		aClass58_1285 = null;
		anIntArray1307 = null;
		anIntArray1306 = null;
		anIntArray1309 = null;
		anIntArray1305 = null;
		anIntArray1319 = null;
		anIntArray1315 = null;
		anIntArray1317 = null;
		aBooleanArrayArrayArrayArray1311 = null;
		aBooleanArrayArray1320 = null;
	}

	public boolean method1238(int i, int i_395_, int i_396_, int i_397_,
			int i_398_, Class37_Sub4_Sub7 class37_sub4_sub7, int i_399_,
			int i_400_, boolean bool) {
		if (class37_sub4_sub7 == null)
			return true;
		int i_401_ = i_395_ - i_398_;
		int i_402_ = i_396_ - i_398_;
		int i_403_ = i_395_ + i_398_;
		int i_404_ = i_396_ + i_398_;
		if (bool) {
			if (i_399_ > 640 && i_399_ < 1408)
				i_404_ += 128;
			if (i_399_ > 1152 && i_399_ < 1920)
				i_403_ += 128;
			if (i_399_ > 1664 || i_399_ < 384)
				i_402_ -= 128;
			if (i_399_ > 128 && i_399_ < 896)
				i_401_ -= 128;
		}
		i_401_ /= 128;
		i_402_ /= 128;
		i_403_ /= 128;
		i_404_ /= 128;
		return method1242(i, i_401_, i_402_, i_403_ - i_401_ + 1, i_404_
				- i_402_ + 1, i_395_, i_396_, i_397_, class37_sub4_sub7,
				i_399_, true, i_400_, 0);
	}

	public int method1239(int i, int i_405_, int i_406_, int i_407_) {
		Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_405_][i_406_];
		if (class37_sub17 == null)
			return -1;
		if (class37_sub17.aClass75_2170 != null
				&& class37_sub17.aClass75_2170.anInt1411 == i_407_)
			return class37_sub17.aClass75_2170.anInt1405 & 0xff;
		if (class37_sub17.aClass41_2174 != null
				&& class37_sub17.aClass41_2174.anInt911 == i_407_)
			return class37_sub17.aClass41_2174.anInt903 & 0xff;
		if (class37_sub17.aClass39_2178 != null
				&& class37_sub17.aClass39_2178.anInt868 == i_407_)
			return class37_sub17.aClass39_2178.anInt864 & 0xff;
		for (int i_408_ = 0; i_408_ < class37_sub17.anInt2180; i_408_++) {
			if (class37_sub17.aClass27Array2186[i_408_].anInt673 == i_407_)
				return class37_sub17.aClass27Array2186[i_408_].anInt683 & 0xff;
		}
		return -1;
	}

	public static int method1240(int i, int i_409_) {
		i_409_ = i_409_ * (i & 0x7f) >> 7;
		if (i_409_ < 2)
			i_409_ = 2;
		else if (i_409_ > 126)
			i_409_ = 126;
		return (i & 0xff80) + i_409_;
	}

	public void method1241() {
		for (int i = 0; i < anInt1270; i++) {
			for (int i_410_ = 0; i_410_ < anInt1299; i_410_++) {
				for (int i_411_ = 0; i_411_ < anInt1302; i_411_++)
					aClass37_Sub17ArrayArrayArray1268[i][i_410_][i_411_] = null;
			}
		}
		for (int i = 0; i < anInt1276; i++) {
			for (int i_412_ = 0; i_412_ < anIntArray1301[i]; i_412_++)
				aClass79ArrayArray1290[i][i_412_] = null;
			anIntArray1301[i] = 0;
		}
		for (int i = 0; i < anInt1269; i++)
			aClass27Array1281[i] = null;
		anInt1269 = 0;
		for (int i = 0; i < aClass27Array1287.length; i++)
			aClass27Array1287[i] = null;
	}

	public Class67(int i, int i_413_, int i_414_, int[][][] is) {
		anInt1273 = 0;
		anIntArrayArray1303 = new int[][] { new int[16],
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
				{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
		anIntArrayArray1312 = (new int[][] {
				{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
				{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
				{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
				{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
		anInt1270 = i;
		anInt1299 = i_413_;
		anInt1302 = i_414_;
		aClass37_Sub17ArrayArrayArray1268 = new Class37_Sub17[i][i_413_][i_414_];
		anIntArrayArrayArray1278 = new int[i][i_413_ + 1][i_414_ + 1];
		anIntArrayArrayArray1298 = is;
		method1241();
	}

	public boolean method1242(int i, int i_415_, int i_416_, int i_417_,
			int i_418_, int i_419_, int i_420_, int i_421_,
			Class37_Sub4_Sub7 class37_sub4_sub7, int i_422_, boolean bool,
			int i_423_, int i_424_) {
		for (int i_425_ = i_415_; i_425_ < i_415_ + i_417_; i_425_++) {
			for (int i_426_ = i_416_; i_426_ < i_416_ + i_418_; i_426_++) {
				if (i_425_ < 0 || i_426_ < 0 || i_425_ >= anInt1299
						|| i_426_ >= anInt1302)
					return false;
				Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_425_][i_426_];
				if (class37_sub17 != null && class37_sub17.anInt2180 >= 5)
					return false;
			}
		}
		Class27 class27 = new Class27();
		class27.anInt673 = i_423_;
		class27.anInt683 = i_424_;
		class27.anInt685 = i;
		class27.anInt671 = i_419_;
		class27.anInt679 = i_420_;
		class27.anInt680 = i_421_;
		class27.aClass37_Sub4_Sub7_670 = class37_sub4_sub7;
		class27.anInt675 = i_422_;
		class27.anInt678 = i_415_;
		class27.anInt674 = i_416_;
		class27.anInt684 = i_415_ + i_417_ - 1;
		class27.anInt668 = i_416_ + i_418_ - 1;
		for (int i_427_ = i_415_; i_427_ < i_415_ + i_417_; i_427_++) {
			for (int i_428_ = i_416_; i_428_ < i_416_ + i_418_; i_428_++) {
				int i_429_ = 0;
				if (i_427_ > i_415_)
					i_429_++;
				if (i_427_ < i_415_ + i_417_ - 1)
					i_429_ += 4;
				if (i_428_ > i_416_)
					i_429_ += 8;
				if (i_428_ < i_416_ + i_418_ - 1)
					i_429_ += 2;
				for (int i_430_ = i; i_430_ >= 0; i_430_--) {
					if ((aClass37_Sub17ArrayArrayArray1268[i_430_][i_427_][i_428_]) == null)
						aClass37_Sub17ArrayArrayArray1268[i_430_][i_427_][i_428_] = new Class37_Sub17(
								i_430_, i_427_, i_428_);
				}
				Class37_Sub17 class37_sub17 = aClass37_Sub17ArrayArrayArray1268[i][i_427_][i_428_];
				class37_sub17.aClass27Array2186[class37_sub17.anInt2180] = class27;
				class37_sub17.anIntArray2187[class37_sub17.anInt2180] = i_429_;
				class37_sub17.anInt2169 |= i_429_;
				class37_sub17.anInt2180++;
			}
		}
		if (bool)
			aClass27Array1281[anInt1269++] = class27;
		return true;
	}

	public void method1243(Class50 class50, int i, int i_431_, int i_432_,
			int i_433_, int i_434_, int i_435_, int i_436_) {
		int i_438_;
		int i_437_ = i_438_ = (i_435_ << 7) - anInt1271;
		int i_440_;
		int i_439_ = i_440_ = (i_436_ << 7) - anInt1293;
		int i_442_;
		int i_441_ = i_442_ = i_437_ + 128;
		int i_444_;
		int i_443_ = i_444_ = i_439_ + 128;
		int i_445_ = anIntArrayArrayArray1298[i][i_435_][i_436_] - anInt1272;
		int i_446_ = anIntArrayArrayArray1298[i][i_435_ + 1][i_436_]
				- anInt1272;
		int i_447_ = anIntArrayArrayArray1298[i][i_435_ + 1][i_436_ + 1]
				- anInt1272;
		int i_448_ = anIntArrayArrayArray1298[i][i_435_][i_436_ + 1]
				- anInt1272;
		int i_449_ = i_439_ * i_433_ + i_437_ * i_434_ >> 16;
		i_439_ = i_439_ * i_434_ - i_437_ * i_433_ >> 16;
		i_437_ = i_449_;
		i_449_ = i_445_ * i_432_ - i_439_ * i_431_ >> 16;
		i_439_ = i_445_ * i_431_ + i_439_ * i_432_ >> 16;
		i_445_ = i_449_;
		if (i_439_ >= 50) {
			i_449_ = i_440_ * i_433_ + i_441_ * i_434_ >> 16;
			i_440_ = i_440_ * i_434_ - i_441_ * i_433_ >> 16;
			i_441_ = i_449_;
			i_449_ = i_446_ * i_432_ - i_440_ * i_431_ >> 16;
			i_440_ = i_446_ * i_431_ + i_440_ * i_432_ >> 16;
			i_446_ = i_449_;
			if (i_440_ >= 50) {
				i_449_ = i_443_ * i_433_ + i_442_ * i_434_ >> 16;
				i_443_ = i_443_ * i_434_ - i_442_ * i_433_ >> 16;
				i_442_ = i_449_;
				i_449_ = i_447_ * i_432_ - i_443_ * i_431_ >> 16;
				i_443_ = i_447_ * i_431_ + i_443_ * i_432_ >> 16;
				i_447_ = i_449_;
				if (i_443_ >= 50) {
					i_449_ = i_444_ * i_433_ + i_438_ * i_434_ >> 16;
					i_444_ = i_444_ * i_434_ - i_438_ * i_433_ >> 16;
					i_438_ = i_449_;
					i_449_ = i_448_ * i_432_ - i_444_ * i_431_ >> 16;
					i_444_ = i_448_ * i_431_ + i_444_ * i_432_ >> 16;
					i_448_ = i_449_;
					if (i_444_ >= 50) {
						int i_450_ = (Rasterizer.anInt3911 + (i_437_ << 9)
								/ i_439_);
						int i_451_ = (Rasterizer.anInt3924 + (i_445_ << 9)
								/ i_439_);
						int i_452_ = (Rasterizer.anInt3911 + (i_441_ << 9)
								/ i_440_);
						int i_453_ = (Rasterizer.anInt3924 + (i_446_ << 9)
								/ i_440_);
						int i_454_ = (Rasterizer.anInt3911 + (i_442_ << 9)
								/ i_443_);
						int i_455_ = (Rasterizer.anInt3924 + (i_447_ << 9)
								/ i_443_);
						int i_456_ = (Rasterizer.anInt3911 + (i_438_ << 9)
								/ i_444_);
						int i_457_ = (Rasterizer.anInt3924 + (i_448_ << 9)
								/ i_444_);
						Rasterizer.anInt3925 = 0;
						if (((i_454_ - i_456_) * (i_453_ - i_457_) - (i_455_ - i_457_)
								* (i_452_ - i_456_)) > 0) {
							Rasterizer.aBoolean3922 = false;
							if (i_454_ < 0
									|| i_456_ < 0
									|| i_452_ < 0
									|| i_454_ > Rasterizer.anInt3918
									|| i_456_ > Rasterizer.anInt3918
									|| i_452_ > Rasterizer.anInt3918)
								Rasterizer.aBoolean3922 = true;
							if (aBoolean1267
									&& method1221(anInt1288, anInt1294, i_455_,
											i_457_, i_453_, i_454_, i_456_,
											i_452_)) {
								anInt1291 = i_435_;
								anInt1279 = i_436_;
							}
							if (class50.anInt1012 == -1) {
								if (class50.anInt1018 != 12345678)
									Rasterizer.method656(i_455_,
											i_457_, i_453_, i_454_, i_456_,
											i_452_, class50.anInt1018,
											class50.anInt1017,
											class50.anInt1026);
							} else if (!aBoolean1282) {
								if (class50.aBoolean1021)
									Rasterizer.method664(i_455_,
											i_457_, i_453_, i_454_, i_456_,
											i_452_, class50.anInt1018,
											class50.anInt1017,
											class50.anInt1026, i_437_, i_441_,
											i_438_, i_445_, i_446_, i_448_,
											i_439_, i_440_, i_444_,
											class50.anInt1012);
								else
									Rasterizer.method664(i_455_,
											i_457_, i_453_, i_454_, i_456_,
											i_452_, class50.anInt1018,
											class50.anInt1017,
											class50.anInt1026, i_442_, i_438_,
											i_441_, i_447_, i_448_, i_446_,
											i_443_, i_444_, i_440_,
											class50.anInt1012);
							} else {
								int i_458_ = (Rasterizer.anInterface3_3926
										.method11((byte) -29, class50.anInt1012));
								Rasterizer.method656(i_455_,
										i_457_, i_453_, i_454_, i_456_, i_452_,
										method1240(i_458_, class50.anInt1018),
										method1240(i_458_, class50.anInt1017),
										method1240(i_458_, class50.anInt1026));
							}
						}
						if (((i_450_ - i_452_) * (i_457_ - i_453_) - (i_451_ - i_453_)
								* (i_456_ - i_452_)) > 0) {
							Rasterizer.aBoolean3922 = false;
							if (i_450_ < 0
									|| i_452_ < 0
									|| i_456_ < 0
									|| i_450_ > Rasterizer.anInt3918
									|| i_452_ > Rasterizer.anInt3918
									|| i_456_ > Rasterizer.anInt3918)
								Rasterizer.aBoolean3922 = true;
							if (aBoolean1267
									&& method1221(anInt1288, anInt1294, i_451_,
											i_453_, i_457_, i_450_, i_452_,
											i_456_)) {
								anInt1291 = i_435_;
								anInt1279 = i_436_;
							}
							if (class50.anInt1012 == -1) {
								if (class50.anInt1025 != 12345678)
									Rasterizer.method656(i_451_,
											i_453_, i_457_, i_450_, i_452_,
											i_456_, class50.anInt1025,
											class50.anInt1026,
											class50.anInt1017);
							} else if (!aBoolean1282)
								Rasterizer.method664(i_451_,
										i_453_, i_457_, i_450_, i_452_, i_456_,
										class50.anInt1025, class50.anInt1026,
										class50.anInt1017, i_437_, i_441_,
										i_438_, i_445_, i_446_, i_448_, i_439_,
										i_440_, i_444_, class50.anInt1012);
							else {
								int i_459_ = (Rasterizer.anInterface3_3926
										.method11((byte) -29, class50.anInt1012));
								Rasterizer.method656(i_451_,
										i_453_, i_457_, i_450_, i_452_, i_456_,
										method1240(i_459_, class50.anInt1025),
										method1240(i_459_, class50.anInt1026),
										method1240(i_459_, class50.anInt1017));
							}
						}
					}
				}
			}
		}
	}

	static {
		anInt1279 = -1;
		anInt1276 = 4;
		anInt1291 = -1;
		anInt1288 = 0;
		aClass79ArrayArray1290 = new Class79[anInt1276][500];
		anInt1284 = 0;
		anInt1294 = 0;
		anIntArray1301 = new int[anInt1276];
		aClass27Array1287 = new Class27[100];
		aBoolean1282 = true;
		aClass79Array1275 = new Class79[500];
		anInt1304 = 0;
		aClass58_1285 = new Deque();
		anIntArray1306 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		aBooleanArrayArrayArrayArray1311 = new boolean[8][32][51][51];
		anIntArray1309 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		anIntArray1305 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray1307 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray1315 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray1317 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		anIntArray1319 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	}
}
