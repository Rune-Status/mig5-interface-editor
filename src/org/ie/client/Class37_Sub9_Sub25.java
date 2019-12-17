package org.ie.client;

/* Class37_Sub9_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub25 extends Class37_Sub9
{
    public static int anInt3378;
    public static int anInt3379;
    public static RSString aClass16_3380
	= Class37_Sub2.create_rsstring("Nehmen");
    public static RSString aClass16_3381
	= Class37_Sub2.create_rsstring("Bitte laden Sie die Seite neu)3");
    public static int anInt3382 = 0;
    public static int anInt3383;
    public static int anInt3384;
    public static RSString aClass16_3385
	= Class37_Sub2.create_rsstring("bevor Sie den Vorgang wiederholen)3");
    
    public static void method872(boolean bool) {
	aClass16_3380 = null;
	aClass16_3381 = null;
	aClass16_3385 = null;
	if (bool != false)
	    aClass16_3381 = null;
    }
    
    public static RSString method873(byte i, RSInterface rSInterface, RSString rSString) {
	try {
	    if ((rSString.method156(-119, Class37_Sub4_Sub4.aClass16_2582)
		 ^ 0xffffffff)
		!= 0) {
		for (;;) {
		    int i_0_ = rSString.method156(125, Class79.aClass16_1473);
		    if ((i_0_ ^ 0xffffffff) == 0)
			break;
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString.method169(0, 0, i_0_),
			   Class46.method1105(Class38.method1050(-29842, 0,
							     rSInterface),
					  (byte) -117),
			   rSString.method158(2 + i_0_, -1) })));
		}
		for (;;) {
		    int i_1_
			= rSString.method156(-106,
					    Class37_Sub3_Sub3.aClass16_2395);
		    if (i_1_ == -1)
			break;
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString.method169(0, 0, i_1_),
			   Class46.method1105(Class38.method1050(-29842, 1,
							     rSInterface),
					  (byte) -120),
			   rSString.method158(i_1_ - -2, -1) })));
		}
		for (;;) {
		    int i_2_
			= rSString.method156(103,
					    Class37_Sub9_Sub34.aClass16_3537);
		    if ((i_2_ ^ 0xffffffff) == 0)
			break;
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString.method169(0, 0, i_2_),
			   Class46.method1105(Class38.method1050(-29842, 2,
							     rSInterface),
					  (byte) -125),
			   rSString.method158(i_2_ + 2, -1) })));
		}
		for (;;) {
		    int i_3_ = rSString.method156(-105, Class30.aClass16_721);
		    if (i_3_ == -1)
			break;
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString.method169(0, 0, i_3_),
			   Class46.method1105(Class38.method1050(-29842, 3,
							     rSInterface),
					  (byte) -128),
			   rSString.method158(i_3_ - -2, -1) })));
		}
		for (;;) {
		    int i_4_
			= rSString.method156(42, Class37_Sub13.aClass16_2110);
		    if ((i_4_ ^ 0xffffffff) == 0)
			break;
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString.method169(0, 0, i_4_),
			   Class46.method1105(Class38.method1050(-29842, 4,
							     rSInterface),
					  (byte) -123),
			   rSString.method158(i_4_ - -2, -1) })));
		}
		for (;;) {
		    int i_5_
			= rSString.method156(-111,
					    Class37_Sub9_Sub19.aClass16_3257);
		    if ((i_5_ ^ 0xffffffff) == 0)
			break;
		    RSString class16_6_ = Class37_Sub9_Sub8.aClass16_3045;
		    if (Class37_Sub9_Sub33.aClass23_3527 != null) {
			class16_6_
			    = Class36.method318(-21952,
						(Class37_Sub9_Sub33
						 .aClass23_3527.anInt590));
			try {
			    if (Class37_Sub9_Sub33.aClass23_3527.anObject595
				!= null) {
				byte[] is
				    = ((String) (Class37_Sub9_Sub33
						 .aClass23_3527.anObject595))
					  .getBytes("ISO-8859-1");
				class16_6_
				    = Class37_Sub12.createRSStringFromBuffer(is,
							      is.length, 0);
			    }
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			    /* empty */
			}
		    }
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
				  { rSString.method169(0, 0, i_5_), class16_6_,
				    rSString.method158(4 + i_5_, -1) })));
		}
	    }
	    anInt3378++;
	    if (i > -20)
		return null;
	    return rSString;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("rf.C(" + i + ','
						    + (rSInterface != null
						       ? "{...}" : "null")
						    + ','
						    + (rSString != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    public int[] method761(int i, int i_7_) {
	anInt3383++;
	int[] is = aClass38_1966.method1049(i_7_, true);
	if (aClass38_1966.aBoolean850) {
	    for (int i_8_ = 0;
		 (i_8_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff); i_8_++)
		is[i_8_] = Class84.anIntArray1528[i_8_];
	}
	if (i > -125)
	    return null;
	return is;
    }
    
    public Class37_Sub9_Sub25() {
	super(0, true);
    }
    
    public static RSInterface method874(RSInterface rSInterface) {
    	RSInterface class18_9_ = Class37_Sub9_Sub17.method834(rSInterface);
    	if (class18_9_ == null)
    		class18_9_ = rSInterface.aClass18_413;
    	return class18_9_;
    }
}
