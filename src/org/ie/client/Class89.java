package org.ie.client;

/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89
{
    public static RSString aClass16_1610;
    public int anInt1611;
    public static RSString aClass16_1612;
    public static RSString aClass16_1613;
    public int anInt1614;
    public static RSString aClass16_1615;
    public static RSString aClass16_1616;
    public int anInt1617;
    public static RSString aClass16_1618
	= Class37_Sub2.create_rsstring("and choose the (Wcreate account(W");
    public static long lastClickTime;
    public static int anInt1620;
    public int anInt1621;
    
    public static void method1335(int i) {
	if (i == 0) {
	    aClass16_1612 = null;
	    aClass16_1616 = null;
	    aClass16_1615 = null;
	    aClass16_1610 = null;
	    aClass16_1618 = null;
	    aClass16_1613 = null;
	}
    }
    
    public static boolean method1336(Class15 class15, int i, int i_0_) {
	anInt1620++;
	byte[] is = class15.method111(i_0_, (byte) 94);
	if (is == null)
	    return false;
	Class49.method1111(false, is);
	if (i <= 55)
	    return false;
	return true;
    }
    
    public Class89() {
	/* empty */
    }
    
    public Class89(Class89 class89_1_) {
	anInt1617 = class89_1_.anInt1617;
	anInt1611 = class89_1_.anInt1611;
	anInt1621 = class89_1_.anInt1621;
	anInt1614 = class89_1_.anInt1614;
    }
    
    static {
	aClass16_1615
	    = (Class37_Sub2.create_rsstring
	       (" steht bereits auf Ihrer Freunde)2Liste(Q"));
	aClass16_1613
	    = Class37_Sub2.create_rsstring("wishes to duel with you)3");
	aClass16_1616 = aClass16_1618;
	aClass16_1610 = aClass16_1613;
	aClass16_1612 = Class37_Sub2.create_rsstring("::");
	lastClickTime = 0L;
    }
}
