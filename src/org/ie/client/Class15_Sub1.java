package org.ie.client;

/* Class15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class15_Sub1 extends Class15
{
    public static int anInt1736;
    public Class69 aClass69_1737;
    public static int anInt1738;
    public static int anInt1739;
    public static int anInt1740;
    public static CRC32 aCRC32_1741 = new CRC32();
    public volatile boolean[] aBooleanArray1742;
    public Class69 aClass69_1743;
    public static int anInt1744;
    public static int anInt1745;
    public static Class14 aClass14_1746;
    public int anInt1747;
    public static int anInt1748;
    public static int anInt1749;
    public boolean aBoolean1750 = false;
    public volatile boolean aBoolean1751 = false;
    public static int anInt1752;
    public static int anInt1753;
    public static boolean[] aBooleanArray1754;
    public static int anInt1755;
    public static int anInt1756;
    public static RSString aClass16_1757
	= Class37_Sub2.create_rsstring("rect_debug=");
    public int anInt1758;
    public static int anInt1759;
    public int anInt1760;
    public int anInt1761 = -1;
    public static int anInt1762 = 0;
    public static RSString aClass16_1763
	= Class37_Sub2.create_rsstring("Clientscript error in: ");
    
    public int method134(int i, int i_0_) {
	anInt1749++;
	if (anObjectArray278[i_0_] != null)
	    return 100;
	if (i != -1)
	    return 87;
	if (aBooleanArray1742[i_0_])
	    return 100;
	return Class37_Sub9_Sub21.method857(-44866364, i_0_, anInt1747);
    }
    
    public void method117(int i, byte i_1_) {
	if (i_1_ >= -42)
	    aClass69_1737 = null;
	anInt1756++;
	Class85.method1321(i, anInt1747, (byte) 3);
    }
    
    public void method118(int i, int i_2_) {
	anInt1759++;
	if (aClass69_1743 != null && aBooleanArray1742 != null
	    && aBooleanArray1742[i])
	    Class37_Sub9_Sub33.method901(aClass69_1743, i, this, false);
	else
	    Class17.method184(true, i, anIntArray277[i], i_2_ + -1350430543,
			      this, (byte) 2, anInt1747);
	if (i_2_ != -1)
	    anInt1747 = -31;
    }
    
    public Class15_Sub1(Class69 class69, Class69 class69_3_, int i,
			boolean bool, boolean bool_4_, boolean bool_5_) {
	super(bool, bool_4_);
	try {
	    aBoolean1750 = bool_5_;
	    aClass69_1737 = class69_3_;
	    anInt1747 = i;
	    aClass69_1743 = class69;
	    Class83.method1312(10684, anInt1747, this);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ob.<init>("
						    + (class69 != null
						       ? "{...}" : "null")
						    + ','
						    + (class69_3_ != null
						       ? "{...}" : "null")
						    + ',' + i + ',' + bool
						    + ',' + bool_4_ + ','
						    + bool_5_ + ')'));
	}
    }
    
    public int method135(byte i) {
	anInt1740++;
	if (aBoolean1751)
	    return 100;
	if (anObjectArray278 != null)
	    return 99;
	if (i <= 47)
	    aBooleanArray1754 = null;
	int i_6_ = Class37_Sub9_Sub21.method857(-44866364, anInt1747, 255);
	if ((i_6_ ^ 0xffffffff) <= -101)
	    i_6_ = 99;
	return i_6_;
    }
    
    public int method136(byte i) {
	int i_7_ = 0;
	anInt1752++;
	int i_8_ = 0;
	for (int i_9_ = 0; i_9_ < anObjectArray278.length; i_9_++) {
	    if (anIntArray256[i_9_] > 0) {
		i_8_ += method134(-1, i_9_);
		i_7_ += 100;
	    }
	}
	if (i != -16)
	    method137(95, (byte) -83, null, true, true);
	if (i_7_ == 0)
	    return 100;
	int i_10_ = 100 * i_8_ / i_7_;
	return i_10_;
    }
    
    public void method137(int i, byte i_11_, byte[] is, boolean bool,
			  boolean bool_12_) {
	anInt1736++;
	if (i_11_ == 97) {
	    if (!bool) {
		is[-2 + is.length] = (byte) (anIntArray263[i] >> -43524472);
		is[-1 + is.length] = (byte) anIntArray263[i];
		if (aClass69_1743 != null) {
		    Class37_Sub4_Sub3.method471(true, is, i, aClass69_1743);
		    aBooleanArray1742[i] = true;
		}
		if (bool_12_)
		    anObjectArray278[i]
			= Class88.method1332(false, is, (byte) 2);
	    } else {
		if (aBoolean1751)
		    throw new RuntimeException();
		if (aClass69_1737 != null)
		    Class37_Sub4_Sub3.method471(true, is, anInt1747,
						aClass69_1737);
		this.method109(is, 29725);
		method141(99);
	    }
	}
    }
    
    public static void method138(int i) {
	aClass16_1757 = null;
	if (i == 11729) {
	    aClass16_1763 = null;
	    aCRC32_1741 = null;
	    aClass14_1746 = null;
	    aBooleanArray1754 = null;
	}
    }
    
    public void method139(byte i, int i_13_, int i_14_) {
	anInt1760 = i_14_;
	anInt1755++;
	anInt1758 = i_13_;
	//if (aClass69_1737 == null)
	 //   Class17.method184(true, anInt1747, anInt1758, -1350430544, this,
	//		      (byte) 0, 255);
	//else
	   Class37_Sub9_Sub33.method901(aClass69_1737, anInt1747, this,
					 false);
    }
    
    public static Class37_Sub4_Sub9_Sub1[] method140
	(int i, int i_15_, byte i_16_, Class15 class15) {
	if (i_16_ != 0)
	    return null;
	anInt1739++;
	if (!Class37_Sub12.method1001(i_15_, class15, (byte) 124, i))
	    return null;
	return Class37_Sub4_Sub12.method698(i_16_ ^ ~0x13b7);
    }
    
    public void method141(int i) {
	aBooleanArray1742 = new boolean[anObjectArray278.length];
	int i_17_ = 0;
	if (i > 82) {
	    for (/**/; aBooleanArray1742.length > i_17_; i_17_++)
		aBooleanArray1742[i_17_] = false;
	    anInt1745++;
	    if (aClass69_1743 == null)
		aBoolean1751 = true;
	    else {
		anInt1761 = -1;
		for (int i_18_ = 0; ((aBooleanArray1742.length ^ 0xffffffff)
				     < (i_18_ ^ 0xffffffff)); i_18_++) {
		    if (anIntArray256[i_18_] > 0) {
			Class35.method313(i_18_, this, aClass69_1743, 1);
			anInt1761 = i_18_;
		    }
		}
		if ((anInt1761 ^ 0xffffffff) == 0)
		    aBoolean1751 = true;
	    }
	}
    }
    
    public void method142(int i, boolean bool, int i_19_, Class69 class69,
			  byte[] is) {
	do {
	    try {
		anInt1744++;
		int i_20_ = 13 / ((i_19_ - 47) / 42);
		if (class69 == aClass69_1737) {
		    if (aBoolean1751)
			throw new RuntimeException();
		    if (is == null)
			Class17.method184(true, anInt1747, anInt1758,
					  -1350430544, this, (byte) 0, 255);
		    else {
			aCRC32_1741.reset();
			aCRC32_1741.update(is, 0, is.length);
			int i_21_ = (int) aCRC32_1741.getValue();
			ByteVector class37_sub11
			    = new ByteVector(Class35.method312(is,
								  (byte) 106));
			int i_22_ = class37_sub11.getUnsignedByte();
			if (i_22_ != 5 && i_22_ != 6 && i_22_ != 7)
			    throw new RuntimeException("Incorrect JS5 protocol number: " + i_22_);
			int i_23_ = 0;
			if (i_22_ >= 6)
			    i_23_ = class37_sub11.getInt();
			//if ((anInt1758 ^ 0xffffffff) != (i_21_ ^ 0xffffffff)
			//    || (anInt1760 ^ 0xffffffff) != (i_23_
			//				    ^ 0xffffffff))
			///    Class17.method184(true, anInt1747, anInt1758,
			//		      -1350430544, this, (byte) 0,
			//		      255);
			//else {
			    this.method109(is, 29725);
			    method141(119);
			//}
		    }
		} else {
		    if (!bool && anInt1761 == i)
			aBoolean1751 = true;
		    if (is == null || is.length <= 2) {
			aBooleanArray1742[i] = false;
			if (aBoolean1750 || bool)
			    Class17.method184(bool, i, anIntArray277[i],
					      -1350430544, this, (byte) 2,
					      anInt1747);
		    } else {
			aCRC32_1741.reset();
			aCRC32_1741.update(is, 0, is.length - 2);
			int i_24_ = (int) aCRC32_1741.getValue();
			int i_25_ = ((is[is.length + -2] << 966560136 & 0xff00)
				     - -(is[is.length - 1] & 0xff));
			/*if (i_24_ != anIntArray277[i]
			    || anIntArray263[i] != i_25_) {
			    aBooleanArray1742[i] = false;
			    if (aBoolean1750 || bool)
				Class17.method184(bool, i, anIntArray277[i],
						  -1350430544, this, (byte) 2,
						  anInt1747);
			} else {*/
			    aBooleanArray1742[i] = true;
			    if (!bool)
				break;
			    anObjectArray278[i]
				= Class88.method1332(false, is, (byte) 2);
			//}
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class37_Sub4_Sub7_Sub3.method516
			  (runtimeexception,
			   ("ob.KA(" + i + ',' + bool + ',' + i_19_ + ','
			    + (class69 != null ? "{...}" : "null") + ','
			    + (is != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
}
