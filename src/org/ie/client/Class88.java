package org.ie.client;

/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;

public class Class88
{
    public static Cache aClass65_1594;
    public static int anInt1595;
    public static RSString aClass16_1596
	= Class37_Sub2.create_rsstring("wishes to trade with you)3");
    public static int anInt1597;
    public static FontMetrics aFontMetrics1598;
    public static int anInt1599;
    public static int currenyTypedKeyChar;
    public static RSString aClass16_1601
	= Class37_Sub2.create_rsstring("Free world");
    public static RSString aClass16_1602;
    public static int anInt1603 = 7759444;
    public static int anInt1604;
    public static Class24 aClass24_1605;
    public static int anInt1606;
    public static RSString aClass16_1607;
    public static RSString aClass16_1608;
    public static RSString aClass16_1609;
    
    public static boolean method1331(int i) {
		if (i < 0)
		    return false;
		int i_1_ = Class37_Sub9_Sub20.anIntArray3300[i];
		if ((i_1_ ^ 0xffffffff) <= -2001)
		    i_1_ -= 2000;
		if (i_1_ == 1006)
		    return true;
		return false;
    }
    
    public static Object method1332(boolean bool, byte[] is, byte i) {
	anInt1606++;
	if (i != 2)
	    aClass16_1607 = null;
	if (is == null)
	    return null;
	if ((is.length ^ 0xffffffff) < -137
	    && !Class37_Sub4_Sub11.aBoolean2736) {
	    try {
		Class68 class68
		    = (Class68) Class.forName("Class68_Sub1").newInstance();
		class68.method1249(is, (byte) -39);
		return class68;
	    } catch (Throwable throwable) {
		Class37_Sub4_Sub11.aBoolean2736 = true;
	    }
	}
	if (!bool)
	    return is;
	return Class39.method1059(is, (byte) 7);
    }
    
    public static void method1333(byte i, Object object, Signlink signlink) {
	do {
	    try {
		anInt1604++;
		if (signlink.anEventQueue1036 != null) {
		    if (i > -69)
			anInt1599 = 87;
		    for (int i_2_ = 0;
			 ((i_2_ ^ 0xffffffff) > -51
			  && signlink.anEventQueue1036.peekEvent() != null);
			 i_2_++)
			Class37_Sub9_Sub20.method846(1L, (byte) 58);
		    if (object == null)
			break;
		    signlink.anEventQueue1036
			.postEvent(new ActionEvent(object, 1001, "dummy"));
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						       ("we.C(" + i + ','
							+ (object != null
							   ? "{...}" : "null")
							+ ','
							+ (signlink != null
							   ? "{...}" : "null")
							+ ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1334(boolean bool) {
	aClass16_1607 = null;
	aClass16_1602 = null;
	aClass24_1605 = null;
	aClass16_1601 = null;
	aClass16_1596 = null;
	aFontMetrics1598 = null;
	aClass16_1608 = null;
	aClass16_1609 = null;
	aClass65_1594 = null;
	if (bool != false)
	    currenyTypedKeyChar = -52;
    }
    
    static {
	anInt1599 = 0;
	aClass16_1607 = aClass16_1596;
	aClass16_1608
	    = Class37_Sub2.create_rsstring("auf der Hautpseite)3");
	aClass16_1602 = aClass16_1601;
	aClass65_1594 = new Cache(64);
	aClass16_1609
	    = Class37_Sub2.create_rsstring(" )2> <col=ff9040>");
    }
}
