package org.ie.client;

/* Class37_Sub9_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class37_Sub9_Sub37 extends Class37_Sub9
{
    public static RSString aClass16_3588;
    public static int anInt3589;
    public static int anInt3590;
    public static boolean aBoolean3591 = false;
    public static RSString aClass16_3592;
    public static RSString[] aClass16Array3593;
    public int anInt3594 = -1;
    public static int anInt3595;
    public static RSString aClass16_3596
	= Class37_Sub2.create_rsstring("flash1:");
    public static int anInt3597;
    public int anInt3598;
    public int anInt3599;
    public static int anInt3600;
    public static int anInt3601;
    public static int anInt3602;
    public static int anInt3603;
    public int[] anIntArray3604;
    public static int anInt3605;
    public static Font aFont3606;
    public static int anInt3607;
    public static RSString aClass16_3608;
    
    public Class37_Sub9_Sub37() {
	super(0, false);
    }
    
    public static void method921(int i) {
	aClass16_3596 = null;
	aClass16_3608 = null;
	if (i >= -91)
	    aClass16_3596 = null;
	aClass16_3592 = null;
	aClass16_3588 = null;
	aClass16Array3593 = null;
	aFont3606 = null;
    }
    
    public int method758(int i) {
	if (i != -30563)
	    return -78;
	anInt3605++;
	return anInt3594;
    }
    
    public boolean method922(int i) {
	anInt3607++;
	if (anIntArray3604 != null)
	    return true;
	if (i <= 50)
	    return false;
	if ((anInt3594 ^ 0xffffffff) <= -1) {
	    int i_0_
		= (!Class37_Sub9_Sub19.anInterface3_3265.method8(-113,
								 anInt3594)
		   ? 128 : 64);
	    anIntArray3604
		= Class37_Sub9_Sub19.anInterface3_3265.method7((byte) -106,
							       anInt3594);
	    anInt3598 = i_0_;
	    anInt3599 = i_0_;
	    if (anIntArray3604 == null)
		return false;
	    return true;
	}
	return false;
    }
    
    public static void method923(int i, RSInterface[] class18s, int i_1_) {
	if (i != -7251)
	    anInt3597 = -71;
	for (int i_2_ = 0; class18s.length > i_2_; i_2_++) {
	    RSInterface rSInterface = class18s[i_2_];
	    if (rSInterface != null) {
		if ((rSInterface.type ^ 0xffffffff) == -1) {
		    if (rSInterface.aClass18Array450 != null)
			method923(-7251, rSInterface.aClass18Array450, i_1_);
		    OverridedInterface class37_sub6
			= ((OverridedInterface)
			   Class76.overridedInterfaces
			       .get((long) rSInterface.bitPacked));
		    if (class37_sub6 != null)
			Class26.method259(class37_sub6.interfaceId, i_1_,
					  i ^ 0x1c2f);
		}
		if (i_1_ == 0 && rSInterface.anObjectArray333 != null) {
		    InterfaceListener class37_sub8 = new InterfaceListener();
		    class37_sub8.aClass18_1925 = rSInterface;
		    class37_sub8.objectData = rSInterface.anObjectArray333;
		    Class43.executeScript(class37_sub8);
		}
		if ((i_1_ ^ 0xffffffff) == -2
		    && rSInterface.anObjectArray407 != null) {
		    if ((rSInterface.anInt334 ^ 0xffffffff) <= -1) {
			RSInterface class18_3_
			    = Class37_Sub9_Sub14.getInterface(rSInterface.bitPacked);
			if (class18_3_ == null
			    || class18_3_.aClass18Array450 == null
			    || ((class18_3_.aClass18Array450.length
				 ^ 0xffffffff)
				>= (rSInterface.anInt334 ^ 0xffffffff))
			    || (class18_3_.aClass18Array450[rSInterface.anInt334]
				!= rSInterface))
			    continue;
		    }
		    InterfaceListener class37_sub8 = new InterfaceListener();
		    class37_sub8.objectData = rSInterface.anObjectArray407;
		    class37_sub8.aClass18_1925 = rSInterface;
		    Class43.executeScript(class37_sub8);
		}
	    }
	}
	anInt3603++;
    }
    
    public static RSString method924(RSInterface rSInterface, byte i) {
	anInt3595++;
	if ((Class10.method85(RuntimeException_Sub1.get_click_mask(rSInterface),
			      false)
	     ^ 0xffffffff)
	    == -1)
	    return null;
	if (rSInterface.selectedActionName == null
	    || (rSInterface.selectedActionName.method151().length()
		^ 0xffffffff) == -1) {
	    if (Class37_Sub3_Sub1.qaoptest)
		return Class37_Sub9_Sub11.aClass16_3095;
	    return null;
	}
	int i_4_ = 0 % ((i - 15) / 41);
	return rSInterface.selectedActionName;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	anInt3600++;
	if (bool == true) {
	    if (i == 0)
		anInt3594 = class37_sub11.getUnsignedShort();
	}
    }
    
    public int[][] method759(byte i, int i_5_) {
	anInt3601++;
	int[][] is = aClass33_1946.method298(false, i_5_);
	if (aClass33_1946.aBoolean767 && method922(118)) {
	    int i_6_ = ((Class37_Sub14.anInt2121 == anInt3598 ? i_5_
			 : i_5_ * anInt3598 / Class37_Sub14.anInt2121)
			* anInt3599);
	    int[] is_7_ = is[0];
	    int[] is_8_ = is[2];
	    int[] is_9_ = is[1];
	    if (anInt3599 == Class32.anInt743) {
		for (int i_10_ = 0; Class32.anInt743 > i_10_; i_10_++) {
		    int i_11_ = anIntArray3604[i_6_++];
		    is_8_[i_10_] = (Class37_Sub4_Sub7.method490(255, i_11_)
				    << -858600444);
		    is_9_[i_10_] = (Class37_Sub4_Sub7.method490(65280, i_11_)
				    >> 1892842148);
		    is_7_[i_10_]
			= Class37_Sub4_Sub7.method490(i_11_ >> -284068532,
						      4080);
		}
	    } else {
		for (int i_12_ = 0; Class32.anInt743 > i_12_; i_12_++) {
		    int i_13_ = anInt3599 * i_12_ / Class32.anInt743;
		    int i_14_ = anIntArray3604[i_13_ + i_6_];
		    is_8_[i_12_] = (Class37_Sub4_Sub7.method490(255, i_14_)
				    << 1548203268);
		    is_9_[i_12_]
			= Class37_Sub4_Sub7.method490(4080,
						      i_14_ >> -2119705340);
		    is_7_[i_12_]
			= Class37_Sub4_Sub7.method490(i_14_ >> 844129676,
						      4080);
		}
	    }
	}
	if (i < 111)
	    aClass16_3596 = null;
	return is;
    }
    
    static {
	aClass16Array3593 = new RSString[500];
	anInt3589 = 0;
	aClass16_3592 = aClass16_3596;
	anInt3590 = 0;
	anInt3602 = 0;
	aClass16_3588 = aClass16_3596;
	anInt3597 = 0;
	aClass16_3608 = Class37_Sub2.create_rsstring("VOLL");
    }
}
