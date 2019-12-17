package org.ie.client;

/* Class37_Sub9_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub10 extends Class37_Sub9
{
    public static RSString aClass16_3082;
    public static int anInt3083;
    public static int anInt3084;
    public static int anInt3085;
    public static int anInt3086;
    public static RSString aClass16_3087
	= Class37_Sub2.create_rsstring("k");
    public static int anInt3088;
    public static int anInt3089;
    public static RSString aClass16_3090;
    public static int[] scriptKeyCharCache;
    public int anInt3092 = 32768;
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	int i_0_ = i;
	do {
	    if ((i_0_ ^ 0xffffffff) != -1) {
		if (i_0_ != 1)
		    break;
	    } else {
		anInt3092 = class37_sub11.getUnsignedShort() << 468966756;
		break;
	    }
	    aBoolean1943 = (class37_sub11.getUnsignedByte() ^ 0xffffffff) == -2;
	} while (false);
	if (bool != true)
	    aClass16_3087 = null;
	anInt3086++;
    }
    
    public Class37_Sub9_Sub10() {
	super(3, false);
    }
    
    public static void method803(int i, int i_1_, int i_2_) {
	if (i_2_ != Class32.anInt743) {
	    Class84.anIntArray1528 = new int[i_2_];
	    for (int i_3_ = 0; i_2_ > i_3_; i_3_++)
		Class84.anIntArray1528[i_3_] = (i_3_ << -288502516) / i_2_;
	    Applet_Sub1.anInt12 = -1 + i_2_;
	    Class32.anInt743 = i_2_;
	}
	if ((Class37_Sub14.anInt2121 ^ 0xffffffff) != (i ^ 0xffffffff)) {
	    Class37_Sub4_Sub16.anIntArray2871 = new int[i];
	    for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
		Class37_Sub4_Sub16.anIntArray2871[i_4_]
		    = (i_4_ << -124742836) / i;
	    Class37_Sub14.anInt2121 = i;
	    Class37_Sub4_Sub7_Sub1_Sub2.anInt3989 = -1 + i;
	}
	if (i_1_ < -59)
	    anInt3089++;
    }
    
    public static void method804(int i) {
	if (i < -30) {
	    aClass16_3082 = null;
	    scriptKeyCharCache = null;
	    aClass16_3090 = null;
	    aClass16_3087 = null;
	}
    }
    
    public static void method805(byte i, int i_5_) {
	if (i != -75)
	    method803(-36, 67, -25);
	anInt3085++;
	if ((i_5_ ^ 0xffffffff) != 0 || Class55.aBoolean1071) {
	    if ((i_5_ ^ 0xffffffff) != 0
		&& ((Queue.anInt1442 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)
		    || !Class37_Sub9.method756(127))
		&& (Class37_Sub9_Sub17.anInt3223 ^ 0xffffffff) != -1
		&& !Class55.aBoolean1071)
		Class37_Sub4_Sub4.method476(2, Class54.aClass15_Sub1_1060,
					    i_5_, Class37_Sub9_Sub17.anInt3223,
					    false, true, 0);
	} else
	    Class37_Sub9_Sub4.method778(false);
	Queue.anInt1442 = i_5_;
    }
    
    public int[] method761(int i, int i_6_) {
	if (i >= -125)
	    return null;
	anInt3084++;
	int[] is = aClass38_1966.method1049(i_6_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_7_ = this.method760(i_6_, 1, -81);
	    int[] is_8_ = this.method760(i_6_, 2, -85);
	    for (int i_9_ = 0; Class32.anInt743 > i_9_; i_9_++) {
		int i_10_ = is_7_[i_9_] >> -1746462396 & 0xff;
		int i_11_ = anInt3092 * is_8_[i_9_] >> 155846028;
		int i_12_ = i_11_ * Hashtable.anIntArray226[i_10_] >> 1674936012;
		int i_13_
		    = (i_11_ * Class37_Sub4_Sub7_Sub2.anIntArray3711[i_10_]
		       >> -1559384596);
		int i_14_
		    = Applet_Sub1.anInt12 & i_9_ - -(i_13_ >> -146964724);
		int i_15_ = (Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
			     & i_6_ - -(i_12_ >> 2063736364));
		int[] is_16_ = this.method760(i_15_, 0, -47);
		is[i_9_] = is_16_[i_14_];
	    }
	}
	return is;
    }
    
    public int[][] method759(byte i, int i_17_) {
	anInt3083++;
	int[][] is = aClass33_1946.method298(false, i_17_);
	if (i < 111)
	    aClass16_3082 = null;
	if (aClass33_1946.aBoolean767) {
	    int[] is_18_ = this.method760(i_17_, 1, -60);
	    int[] is_19_ = this.method760(i_17_, 2, -122);
	    int[] is_20_ = is[2];
	    int[] is_21_ = is[0];
	    int[] is_22_ = is[1];
	    for (int i_23_ = 0; i_23_ < Class32.anInt743; i_23_++) {
		int i_24_ = is_18_[i_23_] * 255 >> -943391508 & 0xff;
		int i_25_ = anInt3092 * is_19_[i_23_] >> 834769292;
		int i_26_
		    = (Class37_Sub4_Sub7_Sub2.anIntArray3711[i_24_] * i_25_
		       >> 1807020);
		int i_27_ = i_25_ * Hashtable.anIntArray226[i_24_] >> -619004692;
		int i_28_
		    = i_23_ - -(i_26_ >> -1481110164) & Applet_Sub1.anInt12;
		int i_29_ = (Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
			     & i_17_ + (i_27_ >> -853848084));
		int[][] is_30_ = this.method762(0, i_29_, (byte) -79);
		is_21_[i_23_] = is_30_[0][i_28_];
		is_22_[i_23_] = is_30_[1][i_28_];
		is_20_[i_23_] = is_30_[2][i_28_];
	    }
	}
	return is;
    }
    
    public void method752(int i) {
	anInt3088++;
	Class37_Sub9_Sub28.method884(-71);
	if (i != -2)
	    aClass16_3082 = null;
    }
    
    static {
	aClass16_3082
	    = (Class37_Sub2.create_rsstring
	       ("Press (Wrecover a locked account(W on front page)3"));
	aClass16_3090 = aClass16_3082;
	scriptKeyCharCache = new int[128];
    }
}
