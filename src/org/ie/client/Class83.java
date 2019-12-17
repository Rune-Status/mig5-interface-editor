package org.ie.client;

/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83
{
    public static int anInt1512;
    public static Class37_Sub11_Sub1 byteVector;
    public static int anInt1514;
    public static int anInt1515 = 1;
    public static int anInt1516;
    public static int anInt1517;
    public static int anInt1518;
    public static byte aByte1519;
    public static int[] anIntArray1520;
    public static int[] anIntArray1521;
    
    public static void method1311(int i, int i_0_, int i_1_) {
	/*if (i_0_ == 75) {
	    anInt1514++;
	    if ((Class37_Sub9_Sub36.anInt3584 ^ 0xffffffff) == -1
		|| Class37_Sub9_Sub36.anInt3584 == 3) {
		if (Class37_Sub9_Sub28.anInt3440 == 1) {
		    int i_2_ = Class33.anInt764 + -25 - i;
		    int i_3_ = Class37_Sub13.anInt2113 - 5 - i_1_;
		    if (i_2_ >= 0 && (i_3_ ^ 0xffffffff) <= -1 && i_2_ < 146
			&& i_3_ < 151) {
			int i_4_ = ((Class37_Sub9_Sub37.anInt3590
				     + Class37_Sub14.anInt2127)
				    & 0x7ff);
			i_2_ -= 73;
			int i_5_ = Rasterizer.anIntArray3910[i_4_];
			i_3_ -= 75;
			i_5_ = (Class78.anInt1458 + 256) * i_5_ >> 1752269896;
			int i_6_ = Rasterizer.anIntArray3929[i_4_];
			i_6_ = i_6_ * (256 + Class78.anInt1458) >> 277929384;
			int i_7_ = -(i_2_ * i_5_) + i_6_ * i_3_ >> 184914251;
			int i_8_ = i_3_ * i_5_ + i_2_ * i_6_ >> 232472267;
			int i_9_ = (-i_7_ + (Class37_Sub23
					     .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					     .anInt3642)
				    >> 800771143);
			int i_10_
			    = ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
				.anInt3666) + i_8_
			       >> -1046911865);
			boolean bool = (ByteVector_Sub1.method434
					((Class37_Sub23
					  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					  .anIntArray3669[0]),
					 0, i_10_,
					 (Class37_Sub23
					  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					  .anIntArray3651[0]),
					 true, 1, 0, 0, 0, i_9_, 0, 0, true));
			if (bool) {
			    Class42.aClass37_Sub11_Sub1_936.method964(110,
								      i_2_);
			    Class42.aClass37_Sub11_Sub1_936.method964(104,
								      i_3_);
			    Class42.aClass37_Sub11_Sub1_936
				.method965(848881960, Class37_Sub14.anInt2127);
			    Class42.aClass37_Sub11_Sub1_936
				.method964(i_0_ ^ 0x25, 57);
			    Class42.aClass37_Sub11_Sub1_936
				.method964(113, Class37_Sub9_Sub37.anInt3590);
			    Class42.aClass37_Sub11_Sub1_936
				.method964(123, Class78.anInt1458);
			    Class42.aClass37_Sub11_Sub1_936
				.method964(i_0_ + 31, 89);
			    Class42.aClass37_Sub11_Sub1_936.method965
				(848881960, (Class37_Sub23
					     .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					     .anInt3666));
			    Class42.aClass37_Sub11_Sub1_936.method965
				(i_0_ ^ 0x3298e963,
				 (Class37_Sub23
				  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
				  .anInt3642));
			    Class42.aClass37_Sub11_Sub1_936.method964
				(i_0_ ^ 0x37, Class37_Sub9_Sub6.anInt3018);
			    Class42.aClass37_Sub11_Sub1_936.method964(121, 63);
			}
		    }
		}
	    }
	}*/
    }
    
    public static void method1312(int i, int i_11_,
				  Class15_Sub1 class15_sub1) {
	anInt1517++;
	if (Class37_Sub9_Sub27.aClass37_Sub11_3399 != null) {
	    Class37_Sub9_Sub27.aClass37_Sub11_3399.pos = 5 + i_11_ * 8;
	    int i_12_ = Class37_Sub9_Sub27.aClass37_Sub11_3399
			    .getInt();
	    int i_13_ = Class37_Sub9_Sub27.aClass37_Sub11_3399.getInt();
	    class15_sub1.method139((byte) -70, i_12_, i_13_);
	} else {
	    if (i != 10684)
		method1314((byte) -87, -74);
	    Class17.method184(true, 255, 0, i ^ ~0x507dc6f3, null, (byte) 0,
			      255);
	    Class37_Sub4_Sub5.aClass15_Sub1Array2597[i_11_] = class15_sub1;
	}
    }
    
    public static void method1313(int i) {
	anIntArray1520 = null;
	if (i != 73)
	    anInt1518 = -68;
	anIntArray1521 = null;
	byteVector = null;
    }
    
    public static synchronized byte[] method1314(byte i, int i_14_) {
	anInt1512++;
	if (i != 17)
	    method1313(18);
	if (i_14_ == 100 && (Class37_Sub11_Sub1.anInt3625 ^ 0xffffffff) < -1) {
	    byte[] is = (Class37_Sub4_Sub5.aByteArrayArray2604
			 [--Class37_Sub11_Sub1.anInt3625]);
	    Class37_Sub4_Sub5.aByteArrayArray2604[Class37_Sub11_Sub1.anInt3625]
		= null;
	    return is;
	}
	if ((i_14_ ^ 0xffffffff) == -5001 && InterfaceClickMask.anInt1986 > 0) {
	    byte[] is = Class25.aByteArrayArray646[--InterfaceClickMask.anInt1986];
	    Class25.aByteArrayArray646[InterfaceClickMask.anInt1986] = null;
	    return is;
	}
	if (i_14_ == 30000 && Class37_Sub4_Sub7_Sub2.anInt3703 > 0) {
	    byte[] is = (Class37_Sub4_Sub7.aByteArrayArray2626
			 [--Class37_Sub4_Sub7_Sub2.anInt3703]);
	    Class37_Sub4_Sub7.aByteArrayArray2626[(Class37_Sub4_Sub7_Sub2
						   .anInt3703)]
		= null;
	    return is;
	}
	return new byte[i_14_];
    }
    
    static {
	byteVector = new Class37_Sub11_Sub1(5000);
	anIntArray1521 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	anInt1518 = 0;
	anIntArray1520 = new int[50];
    }
}
