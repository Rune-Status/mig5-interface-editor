package org.ie.client;

/* Class37_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class37_Sub3_Sub1 extends Class37_Sub3
{
    public static int anInt2312;
    public static int anInt2313;
    public static int anInt2314;
    public static int anInt2315;
    public Deque aClass58_2316 = new Deque();
    public Class37_Sub3_Sub3 aClass37_Sub3_Sub3_2317;
    public static int anInt2318;
    public static int anInt2319;
    public static RSString aClass16_2320;
    public static int anInt2321;
    public static int anInt2322;
    public static int anInt2323;
    public static RSString aClass16_2324
	= Class37_Sub2.create_rsstring("Bitte warten Sie eine Minute");
    public static int anInt2325;
    public static RSString aClass16_2326;
    public static RSString aClass16_2327;
    public static boolean qaoptest;
    public static int anInt2329;
    public static int anInt2330;
    public Class37_Sub3_Sub2 aClass37_Sub3_Sub2_2331 = new Class37_Sub3_Sub2();
    
    public Class37_Sub3 method339() {
	anInt2318++;
	Class37_Sub12 class37_sub12;
	do {
	    class37_sub12
		= (Class37_Sub12) aClass58_2316.getNext();
	    if (class37_sub12 == null)
		return null;
	} while (class37_sub12.aClass37_Sub3_Sub4_2084 == null);
	return class37_sub12.aClass37_Sub3_Sub4_2084;
    }
    
    public void method344(int i, byte i_0_, int[] is, int i_1_, int i_2_,
			  Class37_Sub12 class37_sub12) {
	try {
	    int i_3_ = -71 / ((-63 - i_0_) / 40);
	    if (((aClass37_Sub3_Sub3_2317.anIntArray2383
		  [class37_sub12.anInt2078]) & 0x4
		 ^ 0xffffffff) != -1
		&& (class37_sub12.anInt2088 ^ 0xffffffff) > -1) {
		int i_4_ = ((aClass37_Sub3_Sub3_2317.anIntArray2340
			     [class37_sub12.anInt2078])
			    / Class33.anInt765);
		for (;;) {
		    int i_5_
			= (i_4_ + (1048575 + -class37_sub12.anInt2102)) / i_4_;
		    if ((i_5_ ^ 0xffffffff) < (i ^ 0xffffffff))
			break;
		    i -= i_5_;
		    class37_sub12.aClass37_Sub3_Sub4_2084.method338(is, i_1_,
								    i_5_);
		    int i_6_ = Class33.anInt765 / 100;
		    class37_sub12.anInt2102 += -1048576 + i_5_ * i_4_;
		    Class37_Sub3_Sub4 class37_sub3_sub4
			= class37_sub12.aClass37_Sub3_Sub4_2084;
		    i_1_ += i_5_;
		    int i_7_ = 262144 / i_4_;
		    if ((i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
			i_6_ = i_7_;
		    if ((aClass37_Sub3_Sub3_2317.anIntArray2385
			 [class37_sub12.anInt2078])
			== 0)
			class37_sub12.aClass37_Sub3_Sub4_2084
			    = (Class37_Sub3_Sub4.method391
			       (class37_sub12.aClass37_Sub22_Sub1_2098,
				class37_sub3_sub4.method420(),
				class37_sub3_sub4.method417(),
				class37_sub3_sub4.method425()));
		    else {
			class37_sub12.aClass37_Sub3_Sub4_2084
			    = (Class37_Sub3_Sub4.method391
			       (class37_sub12.aClass37_Sub22_Sub1_2098,
				class37_sub3_sub4.method420(), 0,
				class37_sub3_sub4.method425()));
			aClass37_Sub3_Sub3_2317.method366((class37_sub12
							   .aClass37_Sub15_2091
							   .aShortArray2147
							   [(class37_sub12
							     .anInt2099)]) < 0,
							  true, class37_sub12);
			class37_sub12.aClass37_Sub3_Sub4_2084
			    .method401(i_6_, class37_sub3_sub4.method417());
		    }
		    if ((class37_sub12.aClass37_Sub15_2091.aShortArray2147
			 [class37_sub12.anInt2099])
			< 0)
			class37_sub12.aClass37_Sub3_Sub4_2084.method429(-1);
		    class37_sub3_sub4.method400(i_6_);
		    class37_sub3_sub4.method338(is, i_1_, -i_1_ + i_2_);
		    if (class37_sub3_sub4.method406())
			aClass37_Sub3_Sub2_2331.method350(class37_sub3_sub4);
		}
		class37_sub12.anInt2102 += i_4_ * i;
	    }
	    class37_sub12.aClass37_Sub3_Sub4_2084.method338(is, i_1_, i);
	    anInt2313++;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("e.B(" + i + ',' + i_0_
						    + ','
						    + (is != null ? "{...}"
						       : "null")
						    + ',' + i_1_ + ',' + i_2_
						    + ','
						    + (class37_sub12 != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    public void method341(int i) {
	aClass37_Sub3_Sub2_2331.method341(i);
    while_15_:
	for (Class37_Sub12 class37_sub12
		 = (Class37_Sub12) aClass58_2316.getFirst();
	     class37_sub12 != null;
	     class37_sub12
		 = (Class37_Sub12) aClass58_2316.getNext()) {
	    if (!aClass37_Sub3_Sub3_2317.method368(1609320623,
						   class37_sub12)) {
		int i_8_ = i;
		while (i_8_ > class37_sub12.anInt2082) {
		    method346(-125, class37_sub12, class37_sub12.anInt2082);
		    i_8_ -= class37_sub12.anInt2082;
		    if (aClass37_Sub3_Sub3_2317.method375(null, (byte) 35, 0,
							  class37_sub12, i_8_))
			continue while_15_;
		}
		method346(-97, class37_sub12, i_8_);
		class37_sub12.anInt2082 -= i_8_;
	    }
	}
	anInt2322++;
    }
    
    public void method338(int[] is, int i, int i_9_) {
	anInt2314++;
	aClass37_Sub3_Sub2_2331.method338(is, i, i_9_);
    while_17_:
	for (Class37_Sub12 class37_sub12
		 = (Class37_Sub12) aClass58_2316.getFirst();
	     class37_sub12 != null;
	     class37_sub12
		 = (Class37_Sub12) aClass58_2316.getNext()) {
	    if (!aClass37_Sub3_Sub3_2317.method368(1609320623,
						   class37_sub12)) {
		int i_10_ = i;
		int i_11_ = i_9_;
		while ((i_11_ ^ 0xffffffff)
		       < (class37_sub12.anInt2082 ^ 0xffffffff)) {
		    method344(class37_sub12.anInt2082, (byte) 24, is, i_10_,
			      i_10_ - -i_11_, class37_sub12);
		    i_10_ += class37_sub12.anInt2082;
		    i_11_ -= class37_sub12.anInt2082;
		    if (aClass37_Sub3_Sub3_2317.method375(is, (byte) 92, i_10_,
							  class37_sub12,
							  i_11_))
			continue while_17_;
		}
		method344(i_11_, (byte) -127, is, i_10_, i_10_ - -i_11_,
			  class37_sub12);
		class37_sub12.anInt2082 -= i_11_;
	    }
	}
    }
    
    public static void method345(int i) {
	if (i == -26088) {
	    aClass16_2324 = null;
	    aClass16_2327 = null;
	    aClass16_2320 = null;
	    aClass16_2326 = null;
	}
    }
    
    public void method346(int i, Class37_Sub12 class37_sub12, int i_12_) {
	if ((0x4 & (aClass37_Sub3_Sub3_2317.anIntArray2383
		    [class37_sub12.anInt2078])
	     ^ 0xffffffff) != -1
	    && (class37_sub12.anInt2088 ^ 0xffffffff) > -1) {
	    int i_13_ = ((aClass37_Sub3_Sub3_2317.anIntArray2340
			  [class37_sub12.anInt2078])
			 / Class33.anInt765);
	    int i_14_ = (i_13_ + (1048575 - class37_sub12.anInt2102)) / i_13_;
	    class37_sub12.anInt2102
		= 0xfffff & i_13_ * i_12_ + class37_sub12.anInt2102;
	    if (i_14_ <= i_12_) {
		if ((aClass37_Sub3_Sub3_2317.anIntArray2385
		     [class37_sub12.anInt2078])
		    == 0)
		    class37_sub12.aClass37_Sub3_Sub4_2084
			= (Class37_Sub3_Sub4.method391
			   (class37_sub12.aClass37_Sub22_Sub1_2098,
			    class37_sub12.aClass37_Sub3_Sub4_2084.method420(),
			    class37_sub12.aClass37_Sub3_Sub4_2084.method417(),
			    class37_sub12.aClass37_Sub3_Sub4_2084
				.method425()));
		else {
		    class37_sub12.aClass37_Sub3_Sub4_2084
			= (Class37_Sub3_Sub4.method391
			   (class37_sub12.aClass37_Sub22_Sub1_2098,
			    class37_sub12.aClass37_Sub3_Sub4_2084.method420(),
			    0,
			    class37_sub12.aClass37_Sub3_Sub4_2084
				.method425()));
		    aClass37_Sub3_Sub3_2317.method366((class37_sub12
						       .aClass37_Sub15_2091
						       .aShortArray2147
						       [(class37_sub12
							 .anInt2099)]) < 0,
						      true, class37_sub12);
		}
		if ((class37_sub12.aClass37_Sub15_2091.aShortArray2147
		     [class37_sub12.anInt2099])
		    < 0)
		    class37_sub12.aClass37_Sub3_Sub4_2084.method429(-1);
		i_12_ = class37_sub12.anInt2102 / i_13_;
	    }
	}
	class37_sub12.aClass37_Sub3_Sub4_2084.method341(i_12_);
	anInt2312++;
	if (i >= -63)
	    method338(null, 106, -112);
    }
    
    public static void method347(int i) {
	if (Cache.mouseHandler != null) {
	    synchronized (Cache.mouseHandler) {
		Cache.mouseHandler = null;
	    }
	}
	int i_15_ = -92 % ((i - -45) / 49);
	anInt2319++;
    }
    
    public static void method348(int i, Component component) {
	component.removeKeyListener(Class37_Sub9_Sub13.keyboardHandler);
	anInt2323++;
	component.removeFocusListener(Class37_Sub9_Sub13.keyboardHandler);
	Hashtable.heldKeyCachePosition = i;
    }
    
    public static void method349(byte i) {
	if (i <= -80) {
	    OverridedInterface.anImage1885 = null;
	    Class37_Sub9_Sub37.aFont3606 = null;
	    Class88.aFontMetrics1598 = null;
	    anInt2330++;
	}
    }
    
    public Class37_Sub3 method343() {
	anInt2315++;
	Class37_Sub12 class37_sub12
	    = (Class37_Sub12) aClass58_2316.getFirst();
	if (class37_sub12 == null)
	    return null;
	if (class37_sub12.aClass37_Sub3_Sub4_2084 != null)
	    return class37_sub12.aClass37_Sub3_Sub4_2084;
	return method339();
    }
    
    public Class37_Sub3_Sub1(Class37_Sub3_Sub3 class37_sub3_sub3) {
	aClass37_Sub3_Sub3_2317 = class37_sub3_sub3;
    }
    
    public int method337() {
	anInt2325++;
	return 0;
    }
    
    static {
	anInt2321 = -1;
	aClass16_2320
	    = Class37_Sub2.create_rsstring("Your profile will be transferred in:");
	aClass16_2326 = Class37_Sub2.create_rsstring(": ");
	qaoptest = false;
	anInt2329 = 0;
	aClass16_2327 = aClass16_2320;
    }
}
