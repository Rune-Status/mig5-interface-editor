package org.ie.client;

/* Class37_Sub9_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class37_Sub9_Sub16 extends Class37_Sub9
{
    public static int anInt3183;
    public static int anInt3184;
    public int[] anIntArray3185;
    public int anInt3186;
    public int anInt3187 = 4;
    public int[] anIntArray3188;
    public int[] anIntArray3189;
    public int anInt3190;
    public static RSString aClass16_3191
	= Class37_Sub2.create_rsstring("Bitte starten Sie eine Mitgliedschaft");
    public static int anInt3192;
    public int anInt3193 = 0;
    public static int anInt3194;
    public static RSString aClass16_3195;
    public static int anInt3196;
    public static RSString aClass16_3197
	= Class37_Sub2.create_rsstring("Angreifen");
    public int anInt3198;
    public static int[] anIntArray3199;
    public static int anInt3200;
    public static int anInt3201;
    public static Sprite aClass37_Sub4_Sub9_Sub3_3202;
    public static int anInt3203;
    public static RSString aClass16_3204;
    public static int anInt3205;
    public static RSString aClass16_3206;
    public boolean aBoolean3207;
    public static int typedKeyCachePosition;
    public static int anInt3209;
    
    public int[] method761(int i, int i_0_) {
	anInt3194++;
	int[] is = aClass38_1966.method1049(i_0_, true);
	if (aClass38_1966.aBoolean850) {
	    int i_1_ = anInt3198 << 158173804;
	    int i_2_ = anInt3187 << 1284958828;
	    int i_3_ = Class37_Sub4_Sub16.anIntArray2871[i_0_] * anInt3187;
	    for (int i_4_ = 0;
		 (i_4_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_4_++) {
		int i_5_ = Class84.anIntArray1528[i_4_] * anInt3198;
		int i_6_ = 0;
		for (int i_7_ = 0;
		     (i_7_ ^ 0xffffffff) > (anInt3186 ^ 0xffffffff); i_7_++) {
		    int i_8_ = anIntArray3189[i_7_];
		    int i_9_ = anIntArray3188[i_7_];
		    int i_10_
			= method829((byte) -74, i_2_ * i_8_ >> -1484813940,
				    i_3_ * i_8_ >> 2112750732,
				    i_8_ * i_1_ >> 444884844,
				    i_5_ * i_8_ >> -344447188);
		    i_6_ += i_10_ * i_9_ >> 755516236;
		}
		if (aBoolean3207)
		    i_6_ = 2048 - -(i_6_ >> -1608691967);
		is[i_4_] = i_6_;
	    }
	}
	if (i >= -125)
	    anInt3193 = -16;
	return is;
    }
    
    public void method752(int i) {
	anInt3200++;
	method832(-1484813940);
	method831(i ^ ~0x1b);
	if (i != -2)
	    method829((byte) -76, -6, -32, 104, -59);
    }
    
    public static void method827(boolean bool) {
	if (bool != true)
	    method827(true);
	anInt3196++;
	Class42.aClass37_Sub11_Sub1_936.method989(163);
	Class37_Sub9_Sub15.anInt3177++;
	Class42.aClass37_Sub11_Sub1_936.method949(0L, (byte) -108);
    }
    
    public static void method828(int i, int i_11_, int i_12_, int i_13_,
				 int i_14_, int i_15_, int i_16_, int i_17_) {
	anInt3183++;
	if (i_12_ < 45)
	    method827(false);
	if (i_17_ >= 1 && (i_14_ ^ 0xffffffff) <= -2
	    && (i_17_ ^ 0xffffffff) >= -103 && i_14_ <= 102) {
	    if (!ClientScriptDef.aBoolean2613
		|| ((Class37_Sub9_Sub1.anInt2916 ^ 0xffffffff)
		    == (i_15_ ^ 0xffffffff))) {
		int i_18_ = 0;
		if (i_13_ == 0)
		    i_18_
			= Class38.aClass67_847.method1230(i_15_, i_17_, i_14_);
		int i_19_ = -1;
		boolean bool = false;
		if (i_13_ == 1)
		    i_18_
			= Class38.aClass67_847.method1202(i_15_, i_17_, i_14_);
		boolean bool_20_ = false;
		if ((i_13_ ^ 0xffffffff) == -3)
		    i_18_
			= Class38.aClass67_847.method1228(i_15_, i_17_, i_14_);
		if (i_13_ == 3)
		    i_18_
			= Class38.aClass67_847.method1199(i_15_, i_17_, i_14_);
		if (i_18_ != 0) {
		    i_19_ = i_18_ >> 1550096430 & 0x7fff;
		    int i_21_ = Class38.aClass67_847.method1239(i_15_, i_17_,
								i_14_, i_18_);
		    int i_22_ = i_21_ >> 814091302 & 0x3;
		    int i_23_ = i_21_ & 0x1f;
		    if ((i_13_ ^ 0xffffffff) == -1) {
			Class38.aClass67_847.method1220(i_15_, i_17_, i_14_);
			Class37_Sub4_Sub11 class37_sub4_sub11
			    = Class37_Sub9_Sub8.method794(i_19_, 28067);
			if (class37_sub4_sub11.anInt2740 != 0)
			    Class68.aClass20Array1322[i_15_].method221
				(i_23_, i_14_, i_22_, i_17_,
				 class37_sub4_sub11.aBoolean2700, 106);
		    }
		    if (i_13_ == 1)
			Class38.aClass67_847.method1222(i_15_, i_17_, i_14_);
		    if (i_13_ == 2) {
			Class38.aClass67_847.method1194(i_15_, i_17_, i_14_);
			Class37_Sub4_Sub11 class37_sub4_sub11
			    = Class37_Sub9_Sub8.method794(i_19_, 28067);
			if ((i_17_ + class37_sub4_sub11.anInt2731
			     ^ 0xffffffff) < -104
			    || i_14_ + class37_sub4_sub11.anInt2731 > 103
			    || (i_17_ + class37_sub4_sub11.anInt2743
				^ 0xffffffff) < -104
			    || class37_sub4_sub11.anInt2743 + i_14_ > 103)
			    return;
			if (class37_sub4_sub11.anInt2740 != 0)
			    Class68.aClass20Array1322[i_15_].method226
				(i_17_, class37_sub4_sub11.aBoolean2700, i_22_,
				 class37_sub4_sub11.anInt2731,
				 class37_sub4_sub11.anInt2743, (byte) -73,
				 i_14_);
		    }
		    if (i_13_ == 3) {
			Class38.aClass67_847.method1209(i_15_, i_17_, i_14_);
			Class37_Sub4_Sub11 class37_sub4_sub11
			    = Class37_Sub9_Sub8.method794(i_19_, 28067);
			if (class37_sub4_sub11.anInt2740 == 1)
			    Class68.aClass20Array1322[i_15_]
				.method214(i_17_, i_14_, 123);
		    }
		}
		if ((i_11_ ^ 0xffffffff) <= -1) {
		    int i_24_ = i_15_;
		    if ((i_24_ ^ 0xffffffff) > -4
			&& (Class1.aByteArrayArrayArray63[1][i_17_][i_14_]
			    & 0x2) == 2)
			i_24_++;
		    Class37_Sub25.method1046(i_15_, i, -116, i_24_,
					     Class68.aClass20Array1322[i_15_],
					     i_16_, i_14_, i_11_, i_17_,
					     Class38.aClass67_847);
		}
	    }
	}
    }
    
    public int method829(byte i, int i_25_, int i_26_, int i_27_, int i_28_) {
	anInt3205++;
	int i_29_ = -87 % ((-1 - i) / 54);
	int i_30_ = ~0xfff & i_26_;
	int i_31_ = i_27_ & ~0xfff;
	i_26_ -= i_30_;
	int i_32_ = i_28_ & ~0xfff;
	int i_33_ = i_25_ & ~0xfff;
	i_30_ >>= 12;
	i_28_ -= i_32_;
	int i_34_ = 1 + i_30_;
	i_32_ >>= 12;
	if ((i_33_ >> 754204204 ^ 0xffffffff) >= (i_34_ ^ 0xffffffff))
	    i_34_ = 0;
	i_34_ &= 0xff;
	i_30_ &= 0xff;
	int i_35_ = i_32_ + 1;
	i_32_ &= 0xff;
	int i_36_ = anIntArray3185[anIntArray3185[i_34_] + i_32_] % 4;
	if (i_35_ >= i_31_ >> -899561940)
	    i_35_ = 0;
	int i_37_ = anIntArray3185[anIntArray3185[i_30_] + i_32_] % 4;
	i_35_ &= 0xff;
	int i_38_ = anIntArray3185[anIntArray3185[i_34_] + i_35_] % 4;
	int i_39_ = anIntArray3185[i_35_ - -anIntArray3185[i_30_]] % 4;
	int i_40_ = Class8.method78(Class43.anIntArrayArray953[i_37_], false,
				    i_26_, i_28_);
	int i_41_ = Class8.method78(Class43.anIntArrayArray953[i_39_], false,
				    i_26_, -4096 + i_28_);
	int i_42_ = Class8.method78(Class43.anIntArrayArray953[i_36_], false,
				    i_26_ - 4096, i_28_);
	int i_43_ = Class8.method78(Class43.anIntArrayArray953[i_38_], false,
				    -4096 + i_26_, i_28_ + -4096);
	int i_44_ = Class87.method1329(i_28_, true);
	int i_45_ = Class87.method1329(i_26_, true);
	int i_46_
	    = RuntimeException_Sub1.method1340(i_41_, true, i_44_, i_40_);
	int i_47_
	    = RuntimeException_Sub1.method1340(i_43_, true, i_44_, i_42_);
	return RuntimeException_Sub1.method1340(i_47_, true, i_45_, i_46_);
    }
    
    public static void method830(int i) {
	aClass16_3206 = null;
	aClass16_3191 = null;
	if (i != -13207)
	    method828(8, -100, -126, 63, 52, 88, -64, -107);
	aClass16_3204 = null;
	anIntArray3199 = null;
	aClass16_3197 = null;
	aClass16_3195 = null;
	aClass37_Sub4_Sub9_Sub3_3202 = null;
    }
    
    public Class37_Sub9_Sub16() {
	super(0, true);
	anInt3190 = 1638;
	anInt3186 = 4;
	anIntArray3185 = new int[512];
	anInt3198 = 4;
	aBoolean3207 = true;
    }
    
    public void method831(int i) {
	if (i < 11)
	    method831(-70);
	if (anInt3190 <= 0) {
	    if (anIntArray3188 != null
		&& (anIntArray3188.length ^ 0xffffffff) == (anInt3186
							    ^ 0xffffffff)) {
		anIntArray3189 = new int[anInt3186];
		for (int i_48_ = 0;
		     (i_48_ ^ 0xffffffff) > (anInt3186 ^ 0xffffffff); i_48_++)
		    anIntArray3189[i_48_]
			= (int) (Math.pow(2.0, (double) i_48_) * 4096.0);
	    }
	} else {
	    anIntArray3189 = new int[anInt3186];
	    anIntArray3188 = new int[anInt3186];
	    for (int i_49_ = 0; i_49_ < anInt3186; i_49_++) {
		anIntArray3188[i_49_]
		    = (int) (Math.pow((double) (anInt3190 / 4096),
				      (double) i_49_)
			     * 4096.0);
		anIntArray3189[i_49_]
		    = (int) (4096.0 * Math.pow(2.0, (double) i_49_));
	    }
	}
	anInt3209++;
    }
    
    public void method832(int i) {
	anInt3203++;
	Random random = new Random((long) anInt3193);
	for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > -256; i_50_++)
	    anIntArray3185[i_50_] = -1;
	if (i != -1484813940)
	    method828(-40, 73, 27, 19, 84, -42, -91, -36);
	for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > -256; i_51_++) {
	    int i_52_;
	    do
		i_52_ = Class20.method216(255, random, (byte) -117);
	    while (anIntArray3185[i_52_] != -1);
	    anIntArray3185[i_52_ + 255] = anIntArray3185[i_52_] = i_51_;
	}
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	int i_53_ = i;
    while_76_:
	do {
	while_75_:
	    do {
	    while_74_:
		do {
		while_73_:
		    do {
		    while_72_:
			do {
			    do {
				if (i_53_ != 0) {
				    if ((i_53_ ^ 0xffffffff) != -2) {
					if ((i_53_ ^ 0xffffffff) != -3) {
					    if ((i_53_ ^ 0xffffffff) != -4) {
						if (i_53_ != 4) {
						    if (i_53_ != 5) {
							if (i_53_ == 6)
							    break while_75_;
							break while_76_;
						    }
						} else
						    break while_73_;
						break while_74_;
					    }
					} else
					    break;
					break while_72_;
				    }
				} else {
				    aBoolean3207
					= class37_sub11.getUnsignedByte() == 1;
				    break while_76_;
				}
				anInt3186 = class37_sub11.getUnsignedByte();
				break while_76_;
			    } while (false);
			    anInt3190 = class37_sub11.getShort();
			    if ((anInt3190 ^ 0xffffffff) > -1) {
				anIntArray3188 = new int[anInt3186];
				for (i_53_ = 0;
				     ((anInt3186 ^ 0xffffffff)
				      < (i_53_ ^ 0xffffffff));
				     i_53_++)
				    anIntArray3188[i_53_]
					= class37_sub11.getShort();
			    }
			    break while_76_;
			} while (false);
			anInt3198 = anInt3187 = class37_sub11.getUnsignedByte();
			break while_76_;
		    } while (false);
		    anInt3193 = class37_sub11.getUnsignedByte();
		    break while_76_;
		} while (false);
		anInt3198 = class37_sub11.getUnsignedByte();
		break while_76_;
	    } while (false);
	    anInt3187 = class37_sub11.getUnsignedByte();
	} while (false);
	anInt3184++;
	if (bool != true)
	    aBoolean3207 = false;
    }
    
    static {
	aClass16_3195
	    = Class37_Sub2.create_rsstring("Lade Titelbild )2 ");
	anInt3201 = 0;
	aClass16_3204 = Class37_Sub2.create_rsstring("null");
	anInt3192 = 0;
	aClass16_3206
	    = Class37_Sub2.create_rsstring("W-=hlen Sie eine Welt");
	typedKeyCachePosition = 0;
    }
}
