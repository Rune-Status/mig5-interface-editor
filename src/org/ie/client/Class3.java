package org.ie.client;

/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3
{
    public static int anInt84;
    public static int anInt85;
    public static RSString aClass16_86
	= Class37_Sub2.create_rsstring("Benutzername: ");
    public static RSString aClass16_87 = Class37_Sub2.create_rsstring("");
    public static int anInt88;
    public static int anInt89;
    public static int anInt90;
    
	public static void method45(Class15 class15, Class15 class15_0_, Class15 class15_1_) {
		anInt88++;
		Class52.aClass15_1053 = class15_1_;
		Class37_Sub9_Sub14.aClass15_3145 = class15_0_;
		Class6.aClass15_147 = class15;
	}
    
    public static void method46(Class20[] class20s, Class67 class67, int i) {
	try {
	    anInt90++;
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5; i_2_++) {
		for (int i_3_ = 0; i_3_ < 104; i_3_++) {
		    for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -105; i_4_++) {
			if ((Class1.aByteArrayArrayArray63[i_2_][i_3_][i_4_]
			     & 0x1)
			    == 1) {
			    int i_5_ = i_2_;
			    if ((0x2 & (Class1.aByteArrayArrayArray63[1][i_3_]
					[i_4_])
				 ^ 0xffffffff)
				== -3)
				i_5_--;
			    if (i_5_ >= 0)
				class20s[i_5_].method218(i_4_, -4, i_3_);
			}
		    }
		}
	    }
	    RSString.anInt1664 += (int) (5.0 * Math.random()) + -2;
	    Class45.anInt970 += (int) (Math.random() * 5.0) + -2;
	    if (RSString.anInt1664 < -16)
		RSString.anInt1664 = -16;
	    if ((Class45.anInt970 ^ 0xffffffff) > 7)
		Class45.anInt970 = -8;
	    if (Class45.anInt970 > 8)
		Class45.anInt970 = 8;
	    if (RSString.anInt1664 > 16)
		RSString.anInt1664 = 16;
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5; i_6_++) {
		byte[][] is
		    = Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_6_];
		int i_7_ = (int) Math.sqrt(5100.0);
		int i_8_ = 768 * i_7_ >> -1140505400;
		for (int i_9_ = 1; i_9_ < 103; i_9_++) {
		    for (int i_10_ = 1; (i_10_ ^ 0xffffffff) > -104; i_10_++) {
			int i_11_ = ((Class64.anIntArrayArrayArray1217[i_6_]
				      [i_10_ - -1][i_9_])
				     - (Class64.anIntArrayArrayArray1217[i_6_]
					[-1 + i_10_][i_9_]));
			int i_12_ = ((Class64.anIntArrayArrayArray1217[i_6_]
				      [i_10_][1 + i_9_])
				     + -(Class64.anIntArrayArrayArray1217[i_6_]
					 [i_10_][-1 + i_9_]));
			int i_13_ = (int) Math.sqrt((double) (i_12_ * i_12_
							      + (i_11_ * i_11_
								 + 65536)));
			int i_14_ = 65536 / i_13_;
			int i_15_ = (i_11_ << -1630591864) / i_13_;
			int i_16_
			    = ((is[i_10_][i_9_ - -1] >> -388442173)
			       + ((is[i_10_][-1 + i_9_] >> -172619006)
				  + ((is[1 + i_10_][i_9_] >> 2131071203)
				     + ((is[i_10_ + -1][i_9_] >> -1586459742)
					- -(is[i_10_][i_9_] >> 1854208289)))));
			int i_17_ = (i_12_ << -1183591512) / i_13_;
			int i_18_ = ((i_15_ * -50
				      - (-(i_14_ * -10) - i_17_ * -50)) / i_8_
				     + 96);
			Class68.anIntArrayArray1329[i_10_][i_9_]
			    = -i_16_ + i_18_;
		    }
		}
		for (int i_19_ = 0; i_19_ < 104; i_19_++) {
		    Class10.anIntArray196[i_19_] = 0;
		    Class55.anIntArray1064[i_19_] = 0;
		    Class37_Sub9_Sub12.anIntArray3113[i_19_] = 0;
		    InventoryDef.anIntArray2872[i_19_] = 0;
		    Class81.anIntArray1510[i_19_] = 0;
		}
		for (int i_20_ = -5; i_20_ < 109; i_20_++) {
		    for (int i_21_ = 0; i_21_ < 104; i_21_++) {
			int i_22_ = i_20_ - -5;
			if ((i_22_ ^ 0xffffffff) <= -1 && i_22_ < 104) {
			    int i_23_ = ((Class84.aByteArrayArrayArray1526
					  [i_6_][i_22_][i_21_])
					 & 0xff);
			    if (i_23_ > 0) {
				Class37_Sub4_Sub3 class37_sub4_sub3
				    = Class37_Sub4_Sub12.method697(-1 + i_23_,
								   (byte) -92);
				Class10.anIntArray196[i_21_]
				    += class37_sub4_sub3.anInt2555;
				Class55.anIntArray1064[i_21_]
				    += class37_sub4_sub3.anInt2557;
				Class37_Sub9_Sub12.anIntArray3113[i_21_]
				    += class37_sub4_sub3.anInt2545;
				InventoryDef.anIntArray2872[i_21_]
				    += class37_sub4_sub3.anInt2549;
				Class81.anIntArray1510[i_21_]++;
			    }
			}
			int i_24_ = i_20_ + -5;
			if (i_24_ >= 0 && i_24_ < 104) {
			    int i_25_
				= 0xff & (Class84.aByteArrayArrayArray1526
					  [i_6_][i_24_][i_21_]);
			    if (i_25_ > 0) {
				Class37_Sub4_Sub3 class37_sub4_sub3
				    = Class37_Sub4_Sub12.method697(i_25_ - 1,
								   (byte) -92);
				Class10.anIntArray196[i_21_]
				    -= class37_sub4_sub3.anInt2555;
				Class55.anIntArray1064[i_21_]
				    -= class37_sub4_sub3.anInt2557;
				Class37_Sub9_Sub12.anIntArray3113[i_21_]
				    -= class37_sub4_sub3.anInt2545;
				InventoryDef.anIntArray2872[i_21_]
				    -= class37_sub4_sub3.anInt2549;
				Class81.anIntArray1510[i_21_]--;
			    }
			}
		    }
		    if (i_20_ >= 1 && i_20_ < 103) {
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			int i_30_ = 0;
			for (int i_31_ = -5; i_31_ < 109; i_31_++) {
			    int i_32_ = 5 + i_31_;
			    if ((i_32_ ^ 0xffffffff) <= -1 && i_32_ < 104) {
				i_28_ += (InventoryDef.anIntArray2872
					  [i_32_]);
				i_30_ += Class81.anIntArray1510[i_32_];
				i_27_ += Class55.anIntArray1064[i_32_];
				i_26_ += Class10.anIntArray196[i_32_];
				i_29_ += (Class37_Sub9_Sub12.anIntArray3113
					  [i_32_]);
			    }
			    int i_33_ = i_31_ + -5;
			    if ((i_33_ ^ 0xffffffff) <= -1
				&& (i_33_ ^ 0xffffffff) > -105) {
				i_27_ -= Class55.anIntArray1064[i_33_];
				i_28_ -= (InventoryDef.anIntArray2872
					  [i_33_]);
				i_29_ -= (Class37_Sub9_Sub12.anIntArray3113
					  [i_33_]);
				i_30_ -= Class81.anIntArray1510[i_33_];
				i_26_ -= Class10.anIntArray196[i_33_];
			    }
			    if ((i_31_ ^ 0xffffffff) <= -2
				&& (i_31_ ^ 0xffffffff) > -104
				&& (!ClientScriptDef.aBoolean2613
				    || ((Class1.aByteArrayArrayArray63[0]
					 [i_20_][i_31_])
					& 0x2) != 0
				    || (((Class1.aByteArrayArrayArray63[i_6_]
					  [i_20_][i_31_]) & 0x10
					 ^ 0xffffffff) == -1
					&& ((Class37_Sub17.method1013(114,
								      i_6_,
								      i_20_,
								      i_31_)
					     ^ 0xffffffff)
					    == (Class44.anInt963
						^ 0xffffffff))))) {
				if ((Class42.anInt944 ^ 0xffffffff)
				    < (i_6_ ^ 0xffffffff))
				    Class42.anInt944 = i_6_;
				int i_34_
				    = 0xff & (Class84.aByteArrayArrayArray1526
					      [i_6_][i_20_][i_31_]);
				int i_35_
				    = 0xff & (Class15.aByteArrayArrayArray283
					      [i_6_][i_20_][i_31_]);
				if (i_34_ > 0 || i_35_ > 0) {
				    int i_36_
					= (Class64.anIntArrayArrayArray1217
					   [i_6_][i_20_][i_31_]);
				    int i_37_
					= (Class64.anIntArrayArrayArray1217
					   [i_6_][i_20_ + 1][i_31_ + 1]);
				    int i_38_ = (Class68.anIntArrayArray1329
						 [i_20_][i_31_]);
				    int i_39_ = (Class68.anIntArrayArray1329
						 [i_20_ - -1][i_31_]);
				    int i_40_
					= (Class64.anIntArrayArrayArray1217
					   [i_6_][i_20_][1 + i_31_]);
				    int i_41_ = (Class68.anIntArrayArray1329
						 [i_20_][i_31_ - -1]);
				    int i_42_ = -1;
				    int i_43_
					= (Class64.anIntArrayArrayArray1217
					   [i_6_][1 + i_20_][i_31_]);
				    int i_44_ = -1;
				    int i_45_ = (Class68.anIntArrayArray1329
						 [i_20_ + 1][1 + i_31_]);
				    if (i_34_ > 0) {
					int i_46_ = 256 * i_26_ / i_28_;
					int i_47_ = i_27_ / i_30_;
					int i_48_ = i_29_ / i_30_;
					i_42_
					    = Class49.method1113(-125, i_48_,
								 i_47_, i_46_);
					i_48_ += RSString.anInt1664;
					if (i_48_ < 0)
					    i_48_ = 0;
					else if ((i_48_ ^ 0xffffffff) < -256)
					    i_48_ = 255;
					i_46_
					    = Class45.anInt970 + i_46_ & 0xff;
					i_44_
					    = Class49.method1113(-122, i_48_,
								 i_47_, i_46_);
				    }
				    if (i_6_ > 0) {
					boolean bool = true;
					if ((i_34_ ^ 0xffffffff) == -1
					    && ((Class52_Sub1
						 .aByteArrayArrayArray2306
						 [i_6_][i_20_][i_31_])
						^ 0xffffffff) != -1)
					    bool = false;
					if (i_35_ > 0 && !(Class25.method255
							   (true, -1 + i_35_)
							   .aBoolean2658))
					    bool = false;
					if (bool && i_43_ == i_36_
					    && i_37_ == i_36_
					    && ((i_36_ ^ 0xffffffff)
						== (i_40_ ^ 0xffffffff)))
					    Class37_Sub9_Sub1
						.anIntArrayArrayArray2924[i_6_]
						[i_20_][i_31_]
						= (Class37_Sub9_Sub13.method817
						   ((Class37_Sub9_Sub1
						     .anIntArrayArrayArray2924
						     [i_6_][i_20_][i_31_]),
						    2340));
				    }
				    int i_49_ = 0;
				    if ((i_44_ ^ 0xffffffff) != 0)
					i_49_
					    = (Rasterizer
					       .anIntArray3930
					       [RSInterface.method191(i_44_,
								  96)]);
				    if (i_35_ == 0)
					class67.method1213
					    (i_6_, i_20_, i_31_, 0, 0, -1,
					     i_36_, i_43_, i_37_, i_40_,
					     RSInterface.method191(i_42_,
							       i_38_),
					     RSInterface.method191(i_42_,
							       i_39_),
					     RSInterface.method191(i_42_,
							       i_45_),
					     RSInterface.method191(i_42_,
							       i_41_),
					     0, 0, 0, 0, i_49_, 0);
				    else {
					int i_50_
					    = 1 + (Class52_Sub1
						   .aByteArrayArrayArray2306
						   [i_6_][i_20_][i_31_]);
					byte i_51_ = (Class37_Sub3_Sub3
						      .aByteArrayArrayArray2391
						      [i_6_][i_20_][i_31_]);
					Class37_Sub4_Sub8 class37_sub4_sub8
					    = Class25.method255(true,
								i_35_ - 1);
					int i_52_
					    = class37_sub4_sub8.anInt2645;
					if ((i_52_ ^ 0xffffffff) <= -1
					    && !Rasterizer
						    .anInterface3_3926
						    .method12(i_52_, -79))
					    i_52_ = -1;
					int i_53_;
					int i_54_;
					if ((i_52_ ^ 0xffffffff) <= -1) {
					    i_53_ = -1;
					    i_54_ = (Rasterizer
							 .anInterface3_3926
							 .method11
						     ((byte) -29, i_52_));
					} else if (class37_sub4_sub8.anInt2649
						   == 16711935) {
					    i_53_ = -2;
					    i_54_ = -2;
					    i_52_ = -1;
					} else {
					    i_53_ = (Class49.method1113
						     (-126,
						      (class37_sub4_sub8
						       .anInt2652),
						      (class37_sub4_sub8
						       .anInt2651),
						      (class37_sub4_sub8
						       .anInt2660)));
					    int i_55_ = ((Class45.anInt970
							  + (class37_sub4_sub8
							     .anInt2660))
							 & 0xff);
					    int i_56_
						= (class37_sub4_sub8.anInt2652
						   - -RSString.anInt1664);
					    if (i_56_ < 0)
						i_56_ = 0;
					    else if ((i_56_ ^ 0xffffffff)
						     < -256)
						i_56_ = 255;
					    i_54_ = (Class49.method1113
						     (-125, i_56_,
						      (class37_sub4_sub8
						       .anInt2651),
						      i_55_));
					}
					int i_57_ = 0;
					if ((i_54_ ^ 0xffffffff) != 1)
					    i_57_
						= (Rasterizer
						   .anIntArray3930
						   [Class22.method230(96,
								      i_54_,
								      12108)]);
					if (class37_sub4_sub8.anInt2656
					    != -1) {
					    int i_58_ = (RSString.anInt1664
							 + (class37_sub4_sub8
							    .anInt2650));
					    int i_59_ = ((Class45.anInt970
							  + (class37_sub4_sub8
							     .anInt2654))
							 & 0xff);
					    if ((i_58_ ^ 0xffffffff) > -1)
						i_58_ = 0;
					    else if ((i_58_ ^ 0xffffffff)
						     < -256)
						i_58_ = 255;
					    i_54_ = (Class49.method1113
						     (-122, i_58_,
						      (class37_sub4_sub8
						       .anInt2659),
						      i_59_));
					    i_57_
						= (Rasterizer
						   .anIntArray3930
						   [Class22.method230(96,
								      i_54_,
								      12108)]);
					}
					class67.method1213
					    (i_6_, i_20_, i_31_, i_50_, i_51_,
					     i_52_, i_36_, i_43_, i_37_, i_40_,
					     RSInterface.method191(i_42_,
							       i_38_),
					     RSInterface.method191(i_42_,
							       i_39_),
					     RSInterface.method191(i_42_,
							       i_45_),
					     RSInterface.method191(i_42_,
							       i_41_),
					     Class22.method230(i_38_, i_53_,
							       12108),
					     Class22.method230(i_39_, i_53_,
							       12108),
					     Class22.method230(i_45_, i_53_,
							       12108),
					     Class22.method230(i_41_, i_53_,
							       12108),
					     i_49_, i_57_);
				    }
				}
			    }
			}
		    }
		}
		for (int i_60_ = 1; i_60_ < 103; i_60_++) {
		    for (int i_61_ = 1; (i_61_ ^ 0xffffffff) > -104; i_61_++)
			class67.method1219(i_6_, i_61_, i_60_,
					   Class37_Sub17.method1013(104, i_6_,
								    i_61_,
								    i_60_));
		}
		Class84.aByteArrayArrayArray1526[i_6_] = null;
		Class15.aByteArrayArrayArray283[i_6_] = null;
		Class52_Sub1.aByteArrayArrayArray2306[i_6_] = null;
		Class37_Sub3_Sub3.aByteArrayArrayArray2391[i_6_] = null;
		Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_6_] = null;
	    }
	    class67.method1195(-50, -10, -50);
	    for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > -105; i_62_++) {
		for (int i_63_ = 0; i_63_ < 104; i_63_++) {
		    if ((Class1.aByteArrayArrayArray63[1][i_62_][i_63_] & 0x2)
			== 2)
			class67.method1211(i_62_, i_63_);
		}
	    }
	    int i_64_ = 1;
	    int i_65_ = 2;
	    int i_66_ = 4;
	    if (i >= -94)
		aClass16_87 = null;
	    for (int i_67_ = 0; i_67_ < 4; i_67_++) {
		if (i_67_ > 0) {
		    i_66_ <<= 3;
		    i_65_ <<= 3;
		    i_64_ <<= 3;
		}
		for (int i_68_ = 0; i_68_ <= i_67_; i_68_++) {
		    for (int i_69_ = 0; (i_69_ ^ 0xffffffff) >= -105;
			 i_69_++) {
			for (int i_70_ = 0; i_70_ <= 104; i_70_++) {
			    if (((Class37_Sub9_Sub1.anIntArrayArrayArray2924
				  [i_68_][i_70_][i_69_]) & i_64_
				 ^ 0xffffffff)
				!= -1) {
				int i_71_;
				for (i_71_ = i_69_;
				     (i_71_ > 0
				      && ((Class37_Sub9_Sub1
					   .anIntArrayArrayArray2924[i_68_]
					   [i_70_][-1 + i_71_]) & i_64_
					  ^ 0xffffffff) != -1);
				     i_71_--) {
				    /* empty */
				}
				int i_72_;
				for (i_72_ = i_69_;
				     (i_72_ < 104
				      && (i_64_ & (Class37_Sub9_Sub1
						   .anIntArrayArrayArray2924
						   [i_68_][i_70_][i_72_ + 1])
					  ^ 0xffffffff) != -1);
				     i_72_++) {
				    /* empty */
				}
				int i_73_ = i_68_;
				int i_74_;
			    while_0_:
				for (i_74_ = i_68_; (i_74_ ^ 0xffffffff) < -1;
				     i_74_--) {
				    for (int i_75_ = i_71_;
					 ((i_72_ ^ 0xffffffff)
					  <= (i_75_ ^ 0xffffffff));
					 i_75_++) {
					if ((((Class37_Sub9_Sub1
					       .anIntArrayArrayArray2924
					       [i_74_ + -1][i_70_][i_75_])
					      & i_64_)
					     ^ 0xffffffff)
					    == -1)
					    break while_0_;
				    }
				}
			    while_1_:
				for (/**/; ((i_73_ ^ 0xffffffff)
					    > (i_67_ ^ 0xffffffff)); i_73_++) {
				    for (int i_76_ = i_71_;
					 ((i_76_ ^ 0xffffffff)
					  >= (i_72_ ^ 0xffffffff));
					 i_76_++) {
					if ((((Class37_Sub9_Sub1
					       .anIntArrayArrayArray2924
					       [i_73_ + 1][i_70_][i_76_])
					      & i_64_)
					     ^ 0xffffffff)
					    == -1)
					    break while_1_;
				    }
				}
				int i_77_ = ((-i_74_ + i_73_ + 1)
					     * (-i_71_ + (i_72_ - -1)));
				if ((i_77_ ^ 0xffffffff) <= -9) {
				    int i_78_ = 240;
				    int i_79_
					= ((Class64.anIntArrayArrayArray1217
					    [i_73_][i_70_][i_71_])
					   + -i_78_);
				    int i_80_
					= (Class64.anIntArrayArrayArray1217
					   [i_74_][i_70_][i_71_]);
				    Class67.method1233(i_67_, 1, i_70_ * 128,
						       i_70_ * 128,
						       128 * i_71_,
						       i_72_ * 128 - -128,
						       i_79_, i_80_);
				    for (int i_81_ = i_74_;
					 ((i_73_ ^ 0xffffffff)
					  <= (i_81_ ^ 0xffffffff));
					 i_81_++) {
					for (int i_82_ = i_71_; i_82_ <= i_72_;
					     i_82_++)
					    Class37_Sub9_Sub1
						.anIntArrayArrayArray2924
						[i_81_][i_70_][i_82_]
						= (Class37_Sub4_Sub7.method490
						   ((Class37_Sub9_Sub1
						     .anIntArrayArrayArray2924
						     [i_81_][i_70_][i_82_]),
						    i_64_ ^ 0xffffffff));
				    }
				}
			    }
			    if (((Class37_Sub9_Sub1.anIntArrayArrayArray2924
				  [i_68_][i_70_][i_69_])
				 & i_65_)
				!= 0) {
				int i_83_ = i_70_;
				int i_84_;
				for (i_84_ = i_70_; (i_84_ ^ 0xffffffff) < -1;
				     i_84_--) {
				    if ((i_65_ & (Class37_Sub9_Sub1
						  .anIntArrayArrayArray2924
						  [i_68_][i_84_ + -1][i_69_]))
					== 0)
					break;
				}
				for (/**/;
				     ((i_83_ ^ 0xffffffff) > -105
				      && ((Class37_Sub9_Sub1
					   .anIntArrayArrayArray2924[i_68_]
					   [1 + i_83_][i_69_]) & i_65_
					  ^ 0xffffffff) != -1);
				     i_83_++) {
				    /* empty */
				}
				int i_85_ = i_68_;
				int i_86_ = i_68_;
			    while_2_:
				for (/**/; i_85_ > 0; i_85_--) {
				    for (int i_87_ = i_84_; i_87_ <= i_83_;
					 i_87_++) {
					if (((Class37_Sub9_Sub1
					      .anIntArrayArrayArray2924
					      [i_85_ - 1][i_87_][i_69_])
					     & i_65_)
					    == 0)
					    break while_2_;
				    }
				}
			    while_3_:
				for (/**/; i_67_ > i_86_; i_86_++) {
				    for (int i_88_ = i_84_; i_88_ <= i_83_;
					 i_88_++) {
					if ((i_65_ & (Class37_Sub9_Sub1
						      .anIntArrayArrayArray2924
						      [i_86_ - -1][i_88_]
						      [i_69_])
					     ^ 0xffffffff)
					    == -1)
					    break while_3_;
				    }
				}
				int i_89_ = ((i_86_ - (-1 - -i_85_))
					     * (-i_84_ + i_83_ - -1));
				if ((i_89_ ^ 0xffffffff) <= -9) {
				    int i_90_ = 240;
				    int i_91_
					= (Class64.anIntArrayArrayArray1217
					   [i_85_][i_84_][i_69_]);
				    int i_92_
					= (-i_90_
					   + (Class64.anIntArrayArrayArray1217
					      [i_86_][i_84_][i_69_]));
				    Class67.method1233(i_67_, 2, i_84_ * 128,
						       128 + 128 * i_83_,
						       128 * i_69_,
						       i_69_ * 128, i_92_,
						       i_91_);
				    for (int i_93_ = i_85_;
					 ((i_93_ ^ 0xffffffff)
					  >= (i_86_ ^ 0xffffffff));
					 i_93_++) {
					for (int i_94_ = i_84_;
					     ((i_94_ ^ 0xffffffff)
					      >= (i_83_ ^ 0xffffffff));
					     i_94_++)
					    Class37_Sub9_Sub1
						.anIntArrayArrayArray2924
						[i_93_][i_94_][i_69_]
						= (Class37_Sub4_Sub7.method490
						   ((Class37_Sub9_Sub1
						     .anIntArrayArrayArray2924
						     [i_93_][i_94_][i_69_]),
						    i_65_ ^ 0xffffffff));
				    }
				}
			    }
			    if ((i_66_
				 & (Class37_Sub9_Sub1.anIntArrayArrayArray2924
				    [i_68_][i_70_][i_69_]))
				!= 0) {
				int i_95_ = i_70_;
				int i_96_ = i_69_;
				int i_97_ = i_70_;
				for (/**/;
				     ((i_96_ ^ 0xffffffff) < -1
				      && ((Class37_Sub9_Sub1
					   .anIntArrayArrayArray2924[i_68_]
					   [i_70_][i_96_ + -1]) & i_66_
					  ^ 0xffffffff) != -1);
				     i_96_--) {
				    /* empty */
				}
				int i_98_;
				for (i_98_ = i_69_; i_98_ < 104; i_98_++) {
				    if ((i_66_ & (Class37_Sub9_Sub1
						  .anIntArrayArrayArray2924
						  [i_68_][i_70_][i_98_ + 1])
					 ^ 0xffffffff)
					== -1)
					break;
				}
			    while_4_:
				for (/**/; i_95_ > 0; i_95_--) {
				    for (int i_99_ = i_96_;
					 ((i_99_ ^ 0xffffffff)
					  >= (i_98_ ^ 0xffffffff));
					 i_99_++) {
					if ((i_66_
					     & (Class37_Sub9_Sub1
						.anIntArrayArrayArray2924
						[i_68_][i_95_ - 1][i_99_]))
					    == 0)
					    break while_4_;
				    }
				}
			    while_5_:
				for (/**/; (i_97_ ^ 0xffffffff) > -105;
				     i_97_++) {
				    for (int i_100_ = i_96_;
					 ((i_98_ ^ 0xffffffff)
					  <= (i_100_ ^ 0xffffffff));
					 i_100_++) {
					if (((Class37_Sub9_Sub1
					      .anIntArrayArrayArray2924[i_68_]
					      [1 + i_97_][i_100_]) & i_66_
					     ^ 0xffffffff)
					    == -1)
					    break while_5_;
				    }
				}
				if (((-i_95_ + i_97_ + 1) * (i_98_ - i_96_ + 1)
				     ^ 0xffffffff)
				    <= -5) {
				    int i_101_
					= (Class64.anIntArrayArrayArray1217
					   [i_68_][i_95_][i_96_]);
				    Class67.method1233(i_67_, 4, i_95_ * 128,
						       128 * i_97_ + 128,
						       128 * i_96_,
						       128 + i_98_ * 128,
						       i_101_, i_101_);
				    for (int i_102_ = i_95_; i_97_ >= i_102_;
					 i_102_++) {
					for (int i_103_ = i_96_;
					     i_103_ <= i_98_; i_103_++)
					    Class37_Sub9_Sub1
						.anIntArrayArrayArray2924
						[i_68_][i_102_][i_103_]
						= (Class37_Sub4_Sub7.method490
						   ((Class37_Sub9_Sub1
						     .anIntArrayArrayArray2924
						     [i_68_][i_102_][i_103_]),
						    i_66_ ^ 0xffffffff));
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ag.C("
						    + (class20s != null
						       ? "{...}" : "null")
						    + ','
						    + (class67 != null
						       ? "{...}" : "null")
						    + ',' + i + ')'));
	}
    }
    
    public static void method47(byte i) {
	aClass16_87 = null;
	aClass16_86 = null;
	int i_104_ = -128 / ((40 - i) / 46);
    }
    
    public static void method48(byte i, long l) {
	try {
	    if (i != 117)
		anInt89 = 73;
	    anInt85++;
	    if (l != 0L) {
		Class42.aClass37_Sub11_Sub1_936.method989(163);
		Class42.aClass37_Sub11_Sub1_936.method949(l, (byte) 40);
		Class37_Sub9_Sub15.anInt3177++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ag.B(" + i + ',' + l
						    + ')'));
	}
    }
}
