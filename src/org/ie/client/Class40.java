package org.ie.client;

/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40
{
    public int[] anIntArray875;
    public static int[] anIntArray876 = { 256, 128, 86, 64 };
    public int anInt877;
    public static float[] aFloatArray878
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    public static boolean[] aBooleanArray879;
    public int[] anIntArray880;
    public int[] anIntArray881;
    public int[] anIntArray882;
    public int[] anIntArray883;
    public static int[] anIntArray884;
    public static int[] anIntArray885;
    public int[][] anIntArrayArray886;
    
    public boolean method1065() {
	boolean bool = Class37_Sub24.method1039() != 0;
	if (!bool)
	    return false;
	int i = anIntArray880.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    anIntArray884[i_0_] = anIntArray880[i_0_];
	int i_1_ = anIntArray876[anInt877 - 1];
	int i_2_ = Class68.method1245((byte) 24, i_1_ - 1);
	anIntArray885[0] = Class37_Sub24.method1041(i_2_);
	anIntArray885[1] = Class37_Sub24.method1041(i_2_);
	int i_3_ = 2;
	for (int i_4_ = 0; i_4_ < anIntArray883.length; i_4_++) {
	    int i_5_ = anIntArray883[i_4_];
	    int i_6_ = anIntArray875[i_5_];
	    int i_7_ = anIntArray881[i_5_];
	    int i_8_ = (1 << i_7_) - 1;
	    int i_9_ = 0;
	    if (i_7_ > 0)
		i_9_ = Class37_Sub24.aClass74Array2259[anIntArray882[i_5_]]
			   .method1280();
	    for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
		int i_11_ = anIntArrayArray886[i_5_][i_9_ & i_8_];
		i_9_ >>>= i_7_;
		anIntArray885[i_3_++]
		    = (i_11_ >= 0
		       ? Class37_Sub24.aClass74Array2259[i_11_].method1280()
		       : 0);
	    }
	}
	return true;
    }
    
    public static void method1066() {
	anIntArray876 = null;
	aFloatArray878 = null;
	anIntArray884 = null;
	anIntArray885 = null;
	aBooleanArray879 = null;
    }
    
    public void method1067(int i, int i_12_, int i_13_, int i_14_, float[] fs,
			   int i_15_) {
	int i_16_ = i_14_ - i_12_;
	int i_17_ = i_13_ - i;
	int i_18_ = i_16_ < 0 ? -i_16_ : i_16_;
	int i_19_ = i_16_ / i_17_;
	int i_20_ = i_12_;
	int i_21_ = 0;
	int i_22_ = i_16_ < 0 ? i_19_ - 1 : i_19_ + 1;
	i_18_ = i_18_ - (i_19_ < 0 ? -i_19_ : i_19_) * i_17_;
	fs[i] *= aFloatArray878[i_20_];
	if (i_13_ > i_15_)
	    i_13_ = i_15_;
	for (int i_23_ = i + 1; i_23_ < i_13_; i_23_++) {
	    i_21_ += i_18_;
	    if (i_21_ >= i_17_) {
		i_21_ -= i_17_;
		i_20_ += i_22_;
	    } else
		i_20_ += i_19_;
	    fs[i_23_] *= aFloatArray878[i_20_];
	}
    }
    
    public int method1068(int i, int i_24_, int i_25_, int i_26_, int i_27_) {
	int i_28_ = i_26_ - i_24_;
	int i_29_ = i_25_ - i;
	int i_30_ = i_28_ < 0 ? -i_28_ : i_28_;
	int i_31_ = i_30_ * (i_27_ - i);
	int i_32_ = i_31_ / i_29_;
	if (i_28_ < 0)
	    return i_24_ - i_32_;
	return i_24_ + i_32_;
    }
    
    public void method1069(int i, int i_33_) {
	if (i < i_33_) {
	    int i_34_ = i;
	    int i_35_ = anIntArray884[i_34_];
	    int i_36_ = anIntArray885[i_34_];
	    boolean bool = aBooleanArray879[i_34_];
	    for (int i_37_ = i + 1; i_37_ <= i_33_; i_37_++) {
		int i_38_ = anIntArray884[i_37_];
		if (i_38_ < i_35_) {
		    anIntArray884[i_34_] = i_38_;
		    anIntArray885[i_34_] = anIntArray885[i_37_];
		    aBooleanArray879[i_34_] = aBooleanArray879[i_37_];
		    i_34_++;
		    anIntArray884[i_37_] = anIntArray884[i_34_];
		    anIntArray885[i_37_] = anIntArray885[i_34_];
		    aBooleanArray879[i_37_] = aBooleanArray879[i_34_];
		}
	    }
	    anIntArray884[i_34_] = i_35_;
	    anIntArray885[i_34_] = i_36_;
	    aBooleanArray879[i_34_] = bool;
	    method1069(i, i_34_ - 1);
	    method1069(i_34_ + 1, i_33_);
	}
    }
    
    public static int method1070(int[] is, int i) {
	int i_39_ = is[i];
	int i_40_ = -1;
	int i_41_ = 2147483647;
	for (int i_42_ = 0; i_42_ < i; i_42_++) {
	    int i_43_ = is[i_42_];
	    if (i_43_ > i_39_ && i_43_ < i_41_) {
		i_40_ = i_42_;
		i_41_ = i_43_;
	    }
	}
	return i_40_;
    }
    
    public static int method1071(int[] is, int i) {
	int i_44_ = is[i];
	int i_45_ = -1;
	int i_46_ = -2147483648;
	for (int i_47_ = 0; i_47_ < i; i_47_++) {
	    int i_48_ = is[i_47_];
	    if (i_48_ < i_44_ && i_48_ > i_46_) {
		i_45_ = i_47_;
		i_46_ = i_48_;
	    }
	}
	return i_45_;
    }
    
    public void method1072(float[] fs, int i) {
	int i_49_ = anIntArray880.length;
	int i_50_ = anIntArray876[anInt877 - 1];
	aBooleanArray879[0] = aBooleanArray879[1] = true;
	for (int i_51_ = 2; i_51_ < i_49_; i_51_++) {
	    int i_52_ = method1071(anIntArray884, i_51_);
	    int i_53_ = method1070(anIntArray884, i_51_);
	    int i_54_ = method1068(anIntArray884[i_52_], anIntArray885[i_52_],
				   anIntArray884[i_53_], anIntArray885[i_53_],
				   anIntArray884[i_51_]);
	    int i_55_ = anIntArray885[i_51_];
	    int i_56_ = i_50_ - i_54_;
	    int i_57_ = i_54_;
	    int i_58_ = (i_56_ < i_57_ ? i_56_ : i_57_) << 1;
	    if (i_55_ != 0) {
		aBooleanArray879[i_52_] = aBooleanArray879[i_53_] = true;
		aBooleanArray879[i_51_] = true;
		if (i_55_ >= i_58_)
		    anIntArray885[i_51_]
			= (i_56_ > i_57_ ? i_55_ - i_57_ + i_54_
			   : i_54_ - i_55_ + i_56_ - 1);
		else
		    anIntArray885[i_51_]
			= ((i_55_ & 0x1) != 0 ? i_54_ - (i_55_ + 1) / 2
			   : i_54_ + i_55_ / 2);
	    } else {
		aBooleanArray879[i_51_] = false;
		anIntArray885[i_51_] = i_54_;
	    }
	}
	method1069(0, i_49_ - 1);
	int i_59_ = 0;
	int i_60_ = anIntArray885[0] * anInt877;
	for (int i_61_ = 1; i_61_ < i_49_; i_61_++) {
	    if (aBooleanArray879[i_61_]) {
		int i_62_ = anIntArray884[i_61_];
		int i_63_ = anIntArray885[i_61_] * anInt877;
		method1067(i_59_, i_60_, i_62_, i_63_, fs, i);
		if (i_62_ >= i)
		    return;
		i_59_ = i_62_;
		i_60_ = i_63_;
	    }
	}
	float f = aFloatArray878[i_60_];
	for (int i_64_ = i_59_; i_64_ < i; i_64_++)
	    fs[i_64_] *= f;
    }
    
    public Class40() {
	int i = Class37_Sub24.method1041(16);
	if (i != 1)
	    throw new RuntimeException();
	int i_65_ = Class37_Sub24.method1041(5);
	int i_66_ = 0;
	anIntArray883 = new int[i_65_];
	for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
	    int i_68_ = Class37_Sub24.method1041(4);
	    anIntArray883[i_67_] = i_68_;
	    if (i_68_ >= i_66_)
		i_66_ = i_68_ + 1;
	}
	anIntArray875 = new int[i_66_];
	anIntArray881 = new int[i_66_];
	anIntArray882 = new int[i_66_];
	anIntArrayArray886 = new int[i_66_][];
	for (int i_69_ = 0; i_69_ < i_66_; i_69_++) {
	    anIntArray875[i_69_] = Class37_Sub24.method1041(3) + 1;
	    int i_70_ = anIntArray881[i_69_] = Class37_Sub24.method1041(2);
	    if (i_70_ != 0)
		anIntArray882[i_69_] = Class37_Sub24.method1041(8);
	    i_70_ = 1 << i_70_;
	    int[] is = new int[i_70_];
	    anIntArrayArray886[i_69_] = is;
	    for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
		is[i_71_] = Class37_Sub24.method1041(8) - 1;
	}
	anInt877 = Class37_Sub24.method1041(2) + 1;
	int i_72_ = Class37_Sub24.method1041(4);
	int i_73_ = 2;
	for (int i_74_ = 0; i_74_ < i_65_; i_74_++)
	    i_73_ += anIntArray875[anIntArray883[i_74_]];
	anIntArray880 = new int[i_73_];
	anIntArray880[0] = 0;
	anIntArray880[1] = 1 << i_72_;
	i_73_ = 2;
	for (int i_75_ = 0; i_75_ < i_65_; i_75_++) {
	    int i_76_ = anIntArray883[i_75_];
	    for (int i_77_ = 0; i_77_ < anIntArray875[i_76_]; i_77_++)
		anIntArray880[i_73_++] = Class37_Sub24.method1041(i_72_);
	}
	if (anIntArray884 == null || anIntArray884.length < i_73_) {
	    anIntArray884 = new int[i_73_];
	    anIntArray885 = new int[i_73_];
	    aBooleanArray879 = new boolean[i_73_];
	}
    }
}
