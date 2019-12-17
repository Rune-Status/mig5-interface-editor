package org.ie.client;

/* Class37_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub3_Sub3 extends Class37_Sub3
{
    public static int anInt2336;
    public static int anInt2337;
    public static int anInt2338;
    public static Cache aClass65_2339 = new Cache(64);
    public int[] anIntArray2340 = new int[16];
    public static int anInt2341;
    public static int anInt2342;
    public Hashtable aClass13_2343;
    public static int anInt2344;
    public static int anInt2345;
    public static int anInt2346;
    public static int anInt2347;
    public static int anInt2348;
    public static int anInt2349;
    public int[] anIntArray2350;
    public Class37_Sub12[][] aClass37_Sub12ArrayArray2351;
    public static int anInt2352;
    public static int anInt2353;
    public static int anInt2354;
    public int anInt2355;
    public static int anInt2356;
    public static int anInt2357;
    public static int anInt2358;
    public static int anInt2359;
    public static int anInt2360;
    public static int anInt2361;
    public static int anInt2362;
    public static int anInt2363;
    public int[] anIntArray2364;
    public static int anInt2365;
    public int[] anIntArray2366 = new int[16];
    public static int anInt2367;
    public static int anInt2368;
    public static int anInt2369;
    public int[] anIntArray2370;
    public int[] anIntArray2371;
    public Class37_Sub12[][] aClass37_Sub12ArrayArray2372;
    public int[] anIntArray2373;
    public static int anInt2374;
    public static int anInt2375;
    public int[] anIntArray2376;
    public int anInt2377;
    public static int anInt2378;
    public int[] anIntArray2379;
    public int[] anIntArray2380;
    public static int anInt2381;
    public Class7 aClass7_2382;
    public int[] anIntArray2383;
    public static int anInt2384;
    public int[] anIntArray2385;
    public static int anInt2386;
    public int[] anIntArray2387;
    public static int anInt2388;
    public int[] anIntArray2389;
    public static RSString[] stringScriptArguments;
    public static byte[][][] aByteArrayArrayArray2391;
    public static int anInt2392;
    public static int anInt2393;
    public static Class15 aClass15_2394;
    public static RSString aClass16_2395
	= Class37_Sub2.create_rsstring("(U2");
    public int[] anIntArray2396;
    public static int anInt2397;
    public static int anInt2398;
    public static int anInt2399;
    public boolean aBoolean2400;
    public int anInt2401;
    public int anInt2402;
    public long aLong2403;
    public long aLong2404;
    public Class37_Sub3_Sub1 aClass37_Sub3_Sub1_2405;
    
    public synchronized void method357(int i) {
	if (i == -1) {
	    for (Class37_Sub15 class37_sub15
		     = (Class37_Sub15) aClass13_2343.getFirst();
		 class37_sub15 != null;
		 class37_sub15
		     = (Class37_Sub15) aClass13_2343.getNext())
		class37_sub15.unlink();
	    anInt2399++;
	}
    }
    
    public synchronized Class37_Sub3 method339() {
	anInt2358++;
	return null;
    }
    
    public void method358(int i, int i_0_) {
	anInt2369++;
	if (i != 575)
	    aClass13_2343 = null;
	for (Class37_Sub12 class37_sub12
		 = ((Class37_Sub12)
		    aClass37_Sub3_Sub1_2405.aClass58_2316.getFirst());
	     class37_sub12 != null;
	     class37_sub12
		 = (Class37_Sub12) aClass37_Sub3_Sub1_2405.aClass58_2316
				       .getNext()) {
	    if ((i_0_ < 0 || (i_0_ ^ 0xffffffff) == (class37_sub12.anInt2078
						     ^ 0xffffffff))
		&& class37_sub12.anInt2088 < 0) {
		aClass37_Sub12ArrayArray2372[class37_sub12.anInt2078]
		    [class37_sub12.anInt2099]
		    = null;
		class37_sub12.anInt2088 = 0;
	    }
	}
    }
    
    public synchronized void method338(int[] is, int i, int i_1_) {
	if (aClass7_2382.method76()) {
	    int i_2_ = anInt2355 * aClass7_2382.anInt150 / Class33.anInt765;
	    do {
		long l = aLong2404 + (long) i_2_ * (long) i_1_;
		if ((-l + aLong2403 ^ 0xffffffffffffffffL) <= -1L) {
		    aLong2404 = l;
		    break;
		}
		int i_3_
		    = (int) (((long) i_2_ + (-aLong2404 + (aLong2403 + -1L)))
			     / (long) i_2_);
		i_1_ -= i_3_;
		aLong2404 += (long) i_2_ * (long) i_3_;
		aClass37_Sub3_Sub1_2405.method338(is, i, i_3_);
		i += i_3_;
		method372(79);
	    } while (aClass7_2382.method76());
	}
	anInt2349++;
	aClass37_Sub3_Sub1_2405.method338(is, i, i_1_);
    }
    
    public void method359(int i, byte i_4_) {
	if ((0x4 & anIntArray2383[i] ^ 0xffffffff) != -1) {
	    for (Class37_Sub12 class37_sub12
		     = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					   .aClass58_2316
					   .getFirst();
		 class37_sub12 != null;
		 class37_sub12
		     = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					   .aClass58_2316
					   .getNext()) {
		if (i == class37_sub12.anInt2078)
		    class37_sub12.anInt2102 = 0;
	    }
	}
	anInt2359++;
	if (i_4_ != -51)
	    anInt2401 = 99;
    }
    
    public void method360(int i, int i_5_, int i_6_) {
	anInt2338++;
	if (i_6_ > -122)
	    anIntArray2380 = null;
    }
    
    public void method361(byte i, int i_7_) {
	if ((anIntArray2383[i_7_] & 0x2 ^ 0xffffffff) != -1) {
	    for (Class37_Sub12 class37_sub12
		     = ((Class37_Sub12)
			aClass37_Sub3_Sub1_2405.aClass58_2316.getFirst());
		 class37_sub12 != null;
		 class37_sub12
		     = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					   .aClass58_2316
					   .getNext()) {
		if ((class37_sub12.anInt2078 ^ 0xffffffff) == (i_7_
							       ^ 0xffffffff)
		    && (aClass37_Sub12ArrayArray2372[i_7_]
			[class37_sub12.anInt2099]) == null
		    && (class37_sub12.anInt2088 ^ 0xffffffff) > -1)
		    class37_sub12.anInt2088 = 0;
	    }
	}
	anInt2398++;
	if (i < 75)
	    aClass7_2382 = null;
    }
    
    public void method362(byte i, int i_8_, int i_9_) {
	anIntArray2379[i_9_] = i_8_;
	if (i >= -56)
	    anInt2401 = -94;
	anIntArray2340[i_9_]
	    = (int) (Math.pow(2.0, (double) i_8_ * 5.4931640625E-4) * 2097152.0
		     + 0.5);
	anInt2344++;
    }
    
    public synchronized void method363(int i) {
	if (i < 126)
	    method387(99, -7);
	aClass7_2382.method67();
	anInt2386++;
	method378(false);
    }
    
    public void method364(int i, int i_10_) {
	anInt2336++;
	if ((i_10_ ^ 0xffffffff) > -1) {
	    for (i_10_ = 0; i_10_ < 16; i_10_++)
		method364(32767, i_10_);
	} else {
	    anIntArray2350[i_10_] = 12800;
	    anIntArray2387[i_10_] = 8192;
	    anIntArray2396[i_10_] = 16383;
	    anIntArray2366[i_10_] = 8192;
	    anIntArray2371[i_10_] = 0;
	    anIntArray2364[i_10_] = 8192;
	    method361((byte) 85, i_10_);
	    method359(i_10_, (byte) -51);
	    anIntArray2383[i_10_] = 0;
	    anIntArray2380[i_10_] = i;
	    anIntArray2376[i_10_] = 256;
	    anIntArray2385[i_10_] = 0;
	    method362((byte) -113, 8192, i_10_);
	}
    }
    
    public void method365(int i, int i_11_, byte i_12_, int i_13_) {
	anInt2348++;
	if (i_12_ != -51)
	    method368(118, null);
    }
    
    public void method366(boolean bool, boolean bool_14_,
			  Class37_Sub12 class37_sub12) {
	if (bool_14_ != true)
	    method378(true);
	anInt2374++;
	int i = class37_sub12.aClass37_Sub22_Sub1_2098.aByteArray3632.length;
	int i_15_;
	if (!bool || !class37_sub12.aClass37_Sub22_Sub1_2098.aBoolean3631)
	    i_15_ = (int) (((long) anIntArray2385[class37_sub12.anInt2078]
			    * (long) i)
			   >> 490609990);
	else {
	    int i_16_
		= i + (i + -class37_sub12.aClass37_Sub22_Sub1_2098.anInt3633);
	    i_15_ = (int) (((long) anIntArray2385[class37_sub12.anInt2078]
			    * (long) i_16_)
			   >> 1201221510);
	    i <<= 8;
	    if ((i ^ 0xffffffff) >= (i_15_ ^ 0xffffffff)) {
		class37_sub12.aClass37_Sub3_Sub4_2084.method407(true);
		i_15_ = -1 + i + (i - i_15_);
	    }
	}
	class37_sub12.aClass37_Sub3_Sub4_2084.method410(i_15_);
    }
    
    public static void method367(int i) {
	stringScriptArguments = null;
	aClass16_2395 = null;
	aClass15_2394 = null;
	aByteArrayArrayArray2391 = null;
	if (i == 23171)
	    aClass65_2339 = null;
    }
    
    public boolean method368(int i, Class37_Sub12 class37_sub12) {
	anInt2360++;
	if (class37_sub12.aClass37_Sub3_Sub4_2084 == null) {
	    if (class37_sub12.anInt2088 >= 0) {
		class37_sub12.unlink();
		if (class37_sub12.anInt2076 > 0
		    && class37_sub12 == (aClass37_Sub12ArrayArray2351
					 [class37_sub12.anInt2078]
					 [class37_sub12.anInt2076]))
		    aClass37_Sub12ArrayArray2351[class37_sub12.anInt2078]
			[class37_sub12.anInt2076]
			= null;
	    }
	    return true;
	}
	if (i != 1609320623)
	    method360(-10, -83, -87);
	return false;
    }
    
    public synchronized void method369(Class37_Sub19 class37_sub19, byte i,
				       boolean bool) {
	method363(i + 26);
	aClass7_2382.method65(class37_sub19.aByteArray2202);
	anInt2353++;
	aBoolean2400 = bool;
	aLong2404 = 0L;
	int i_17_ = aClass7_2382.method72();
	for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff);
	     i_18_++) {
	    aClass7_2382.method71(i_18_);
	    aClass7_2382.method74(i_18_);
	    aClass7_2382.method69(i_18_);
	}
	anInt2401 = aClass7_2382.method77();
	anInt2402 = aClass7_2382.anIntArray156[anInt2401];
	if (i != 101)
	    aClass7_2382 = null;
	aLong2403 = aClass7_2382.method63(anInt2402);
    }
    
    public synchronized Class37_Sub3 method343() {
	anInt2384++;
	return aClass37_Sub3_Sub1_2405;
    }
    
    public synchronized void method370(int i, int i_19_, int i_20_) {
	int i_21_ = 120 / ((47 - i_20_) / 48);
	anInt2341++;
	method382(48, i_19_, i);
    }
    
    public int method371(byte i) {
	if (i < 76)
	    return -126;
	anInt2346++;
	return anInt2377;
    }
    
    public void method372(int i) {
	int i_22_ = -61 / ((-23 - i) / 35);
	int i_23_ = anInt2401;
	int i_24_ = anInt2402;
	anInt2368++;
	long l = aLong2403;
	while (i_24_ == anInt2402) {
	    while ((aClass7_2382.anIntArray156[i_23_] ^ 0xffffffff)
		   == (i_24_ ^ 0xffffffff)) {
		aClass7_2382.method71(i_23_);
		int i_25_ = aClass7_2382.method64(i_23_);
		if (i_25_ == 1) {
		    aClass7_2382.method75();
		    aClass7_2382.method69(i_23_);
		    if (aClass7_2382.method68()) {
			if (aBoolean2400 && i_24_ != 0)
			    aClass7_2382.method62(l);
			else {
			    method378(false);
			    aClass7_2382.method67();
			    return;
			}
		    }
		    break;
		}
		if ((0x80 & i_25_ ^ 0xffffffff) != -1)
		    method379(i_25_, -1);
		aClass7_2382.method74(i_23_);
		aClass7_2382.method69(i_23_);
	    }
	    i_23_ = aClass7_2382.method77();
	    i_24_ = aClass7_2382.anIntArray156[i_23_];
	    l = aClass7_2382.method63(i_24_);
	}
	aLong2403 = l;
	anInt2401 = i_23_;
	anInt2402 = i_24_;
    }
    
    public int method373(Class37_Sub12 class37_sub12, int i) {
	Class66 class66 = class37_sub12.aClass66_2096;
	int i_26_ = ((anIntArray2350[class37_sub12.anInt2078]
		      * anIntArray2396[class37_sub12.anInt2078]) - -4096
		     >> 545419245);
	i_26_ = 16384 + i_26_ * i_26_ >> 1609320623;
	anInt2347++;
	i_26_ = class37_sub12.anInt2103 * i_26_ - -16384 >> -899425297;
	i_26_ = 128 + anInt2377 * i_26_ >> -1446850520;
	if (i >= -95)
	    return -76;
	if ((class66.anInt1256 ^ 0xffffffff) < -1)
	    i_26_
		= (int) (0.5 + ((double) i_26_
				* Math.pow(0.5,
					   ((double) class66.anInt1256
					    * ((double) class37_sub12.anInt2080
					       * 1.953125E-5)))));
	if (class66.aByteArray1252 != null) {
	    int i_27_ = class37_sub12.anInt2090;
	    int i_28_ = class66.aByteArray1252[class37_sub12.anInt2092 - -1];
	    if (class37_sub12.anInt2092 < -2 + class66.aByteArray1252.length) {
		int i_29_
		    = (0xff00
		       & (class66.aByteArray1252[class37_sub12.anInt2092 - -2]
			  << 1053696648));
		int i_30_
		    = ((class66.aByteArray1252[class37_sub12.anInt2092] & 0xff)
		       << -812029432);
		i_28_ += (class66.aByteArray1252[class37_sub12.anInt2092 - -3]
			  - i_28_) * (i_27_ + -i_30_) / (i_29_ - i_30_);
	    }
	    i_26_ = 32 + i_28_ * i_26_ >> -218683066;
	}
	if (class37_sub12.anInt2088 > 0 && class66.aByteArray1251 != null) {
	    int i_31_ = class37_sub12.anInt2088;
	    int i_32_ = class66.aByteArray1251[1 + class37_sub12.anInt2095];
	    if ((-2 + class66.aByteArray1251.length ^ 0xffffffff)
		< (class37_sub12.anInt2095 ^ 0xffffffff)) {
		int i_33_
		    = 0xff00 & (class66.aByteArray1251[class37_sub12.anInt2095]
				<< -578046008);
		int i_34_
		    = (0xff00
		       & (class66.aByteArray1251[2 + class37_sub12.anInt2095]
			  << 1241255816));
		i_32_ += ((i_31_ + -i_33_)
			  * (-i_32_ + (class66.aByteArray1251
				       [class37_sub12.anInt2095 + 3]))
			  / (-i_33_ + i_34_));
	    }
	    i_26_ = i_32_ * i_26_ + 32 >> 1929592998;
	}
	return i_26_;
    }
    
    public void method374(int i, byte i_35_, int i_36_) {
	anInt2392++;
	if (i != anIntArray2370[i_36_]) {
	    anIntArray2370[i_36_] = i;
	    for (int i_37_ = 0; i_37_ < 128; i_37_++)
		aClass37_Sub12ArrayArray2351[i_36_][i_37_] = null;
	}
	if (i_35_ != -44)
	    aClass37_Sub12ArrayArray2351 = null;
    }
    
    public boolean method375(int[] is, byte i, int i_38_,
			     Class37_Sub12 class37_sub12, int i_39_) {
	try {
	    class37_sub12.anInt2082 = Class33.anInt765 / 100;
	    anInt2363++;
	    if ((class37_sub12.anInt2088 ^ 0xffffffff) <= -1
		&& (class37_sub12.aClass37_Sub3_Sub4_2084 == null
		    || class37_sub12.aClass37_Sub3_Sub4_2084.method428())) {
		class37_sub12.method1000((byte) 40);
		class37_sub12.unlink();
		if ((class37_sub12.anInt2076 ^ 0xffffffff) < -1
		    && class37_sub12 == (aClass37_Sub12ArrayArray2351
					 [class37_sub12.anInt2078]
					 [class37_sub12.anInt2076]))
		    aClass37_Sub12ArrayArray2351[class37_sub12.anInt2078]
			[class37_sub12.anInt2076]
			= null;
		return true;
	    }
	    if (i < 29)
		method378(false);
	    int i_40_ = class37_sub12.anInt2083;
	    if ((i_40_ ^ 0xffffffff) < -1) {
		i_40_
		    -= (int) (0.5 + 16.0 * Math.pow(2.0,
						    ((double) (anIntArray2364
							       [(class37_sub12
								 .anInt2078)])
						     * 4.921259842519685E-4)));
		if (i_40_ < 0)
		    i_40_ = 0;
		class37_sub12.anInt2083 = i_40_;
	    }
	    class37_sub12.aClass37_Sub3_Sub4_2084
		.method396(method388(class37_sub12, -98));
	    double d = ((double) ((class37_sub12.anInt2099 - 60 << 1429930984)
				  - -((class37_sub12.anInt2083
				       * class37_sub12.anInt2081)
				      >> -294732980))
			* 5.086263020833333E-6);
	    class37_sub12.anInt2085++;
	    Class66 class66 = class37_sub12.aClass66_2096;
	    class37_sub12.anInt2086 += class66.anInt1254;
	    boolean bool = false;
	    if (class66.anInt1256 > 0) {
		if (class66.anInt1260 <= 0)
		    class37_sub12.anInt2080 += 128;
		else
		    class37_sub12.anInt2080
			+= (int) (0.5 + (128.0
					 * Math.pow(2.0,
						    ((double) class66.anInt1260
						     * d))));
		if (class66.anInt1256 * class37_sub12.anInt2080 >= 819200)
		    bool = true;
	    }
	    if (class66.aByteArray1252 != null) {
		if ((class66.anInt1247 ^ 0xffffffff) >= -1)
		    class37_sub12.anInt2090 += 128;
		else
		    class37_sub12.anInt2090
			+= (int) ((128.0
				   * Math.pow(2.0,
					      d * (double) class66.anInt1247))
				  + 0.5);
		for (/**/;
		     (((class37_sub12.anInt2092 ^ 0xffffffff)
		       > (-2 + class66.aByteArray1252.length ^ 0xffffffff))
		      && (0xff00 & ((class66.aByteArray1252
				     [class37_sub12.anInt2092 + 2])
				    << 1256909896)) < class37_sub12.anInt2090);
		     class37_sub12.anInt2092 += 2) {
		    /* empty */
		}
		if (((class37_sub12.anInt2092 ^ 0xffffffff)
		     == (-2 + class66.aByteArray1252.length ^ 0xffffffff))
		    && (class66.aByteArray1252[1 + class37_sub12.anInt2092]
			== 0))
		    bool = true;
	    }
	    if (class37_sub12.anInt2088 >= 0 && class66.aByteArray1251 != null
		&& (anIntArray2383[class37_sub12.anInt2078] & 0x1
		    ^ 0xffffffff) == -1
		&& (class37_sub12.anInt2076 < 0
		    || class37_sub12 != (aClass37_Sub12ArrayArray2351
					 [class37_sub12.anInt2078]
					 [class37_sub12.anInt2076]))) {
		if ((class66.anInt1249 ^ 0xffffffff) >= -1)
		    class37_sub12.anInt2088 += 128;
		else
		    class37_sub12.anInt2088
			+= (int) (0.5
				  + (128.0
				     * Math.pow(2.0,
						d * (double) (class66
							      .anInt1249))));
		for (/**/;
		     ((class66.aByteArray1251.length + -2
		       > class37_sub12.anInt2095)
		      && (class37_sub12.anInt2088
			  > ((0xff & (class66.aByteArray1251
				      [2 + class37_sub12.anInt2095]))
			     << -1097410456)));
		     class37_sub12.anInt2095 += 2) {
		    /* empty */
		}
		if (-2 + class66.aByteArray1251.length
		    == class37_sub12.anInt2095)
		    bool = true;
	    }
	    if (bool) {
		class37_sub12.aClass37_Sub3_Sub4_2084
		    .method400(class37_sub12.anInt2082);
		if (is == null)
		    class37_sub12.aClass37_Sub3_Sub4_2084.method341(i_39_);
		else
		    class37_sub12.aClass37_Sub3_Sub4_2084.method338(is, i_38_,
								    i_39_);
		if (class37_sub12.aClass37_Sub3_Sub4_2084.method406())
		    aClass37_Sub3_Sub1_2405.aClass37_Sub3_Sub2_2331
			.method350(class37_sub12.aClass37_Sub3_Sub4_2084);
		class37_sub12.method1000((byte) -105);
		if (class37_sub12.anInt2088 >= 0) {
		    class37_sub12.unlink();
		    if (class37_sub12.anInt2076 > 0
			&& class37_sub12 == (aClass37_Sub12ArrayArray2351
					     [class37_sub12.anInt2078]
					     [class37_sub12.anInt2076]))
			aClass37_Sub12ArrayArray2351
			    [class37_sub12.anInt2078][class37_sub12.anInt2076]
			    = null;
		}
		return true;
	    }
	    class37_sub12.aClass37_Sub3_Sub4_2084.method413
		(class37_sub12.anInt2082, method373(class37_sub12, -104),
		 method381(class37_sub12, (byte) 97));
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("hd.R("
						    + (is != null ? "{...}"
						       : "null")
						    + ',' + i + ',' + i_38_
						    + ','
						    + (class37_sub12 != null
						       ? "{...}" : "null")
						    + ',' + i_39_ + ')'));
	}
    }
    
    public synchronized int method337() {
	anInt2337++;
	return 0;
    }
    
    public synchronized boolean method376(int i) {
	anInt2381++;
	if (i < 29)
	    method360(3, 98, -5);
	return aClass7_2382.method76();
    }
    
    public static Class52 method377(int i) {
	anInt2375++;
	try {
	    if (i < 100)
		return null;
	    return (Class52) Class.forName("Class52_Sub2").newInstance();
	} catch (Throwable throwable) {
	    return new Class52_Sub1();
	}
    }
    
    public void method378(boolean bool) {
	anInt2393++;
	method383(-1, (byte) 22);
	method364(32767, -1);
	int i = 0;
	if (bool != false)
	    method370(58, -70, -30);
	for (/**/; i < 16; i++)
	    anIntArray2370[i] = anIntArray2373[i];
	for (int i_41_ = 0; i_41_ < 16; i_41_++)
	    anIntArray2389[i_41_]
		= Class37_Sub4_Sub7.method490(-128, anIntArray2373[i_41_]);
    }
    
    public void method379(int i, int i_42_) {
	anInt2352++;
	int i_43_ = 0xf0 & i;
	if ((i_43_ ^ 0xffffffff) == -129) {
	    int i_44_ = i >> -1154338648 & 0x7f;
	    int i_45_ = 0xf & i;
	    int i_46_ = (0x7fa572 & i) >> 1945682736;
	    method389(i_42_ + 26597, i_46_, i_44_, i_45_);
	} else if (i_43_ == 144) {
	    int i_47_ = i & 0xf;
	    int i_48_ = i >> -1167081848 & 0x7f;
	    int i_49_ = (i & 0x7f85ca) >> 1622074032;
	    if ((i_49_ ^ 0xffffffff) >= -1)
		method389(26596, 64, i_48_, i_47_);
	    else
		method380(i_48_, i_49_, 93, i_47_);
	} else if (i_43_ == 160) {
	    int i_50_ = 0xf & i;
	    int i_51_ = 0x7f & i >> 1335453288;
	    int i_52_ = 0x7f & i >> -47317072;
	    method365(i_50_, i_52_, (byte) -51, i_51_);
	} else if ((i_43_ ^ 0xffffffff) == -177) {
	    int i_53_ = i & 0xf;
	    int i_54_ = i >> 977944136 & 0x7f;
	    int i_55_ = (0x7f17c1 & i) >> 1337450032;
	    if (i_54_ == 0)
		anIntArray2389[i_53_]
		    = ((i_55_ << 913246286)
		       + Class37_Sub4_Sub7.method490(-2080769,
						     anIntArray2389[i_53_]));
	    if (i_54_ == 32)
		anIntArray2389[i_53_]
		    = ((i_55_ << -150221305)
		       + Class37_Sub4_Sub7.method490(anIntArray2389[i_53_],
						     -16257));
	    if ((i_54_ ^ 0xffffffff) == -2)
		anIntArray2371[i_53_]
		    = ((i_55_ << -930609817)
		       + Class37_Sub4_Sub7.method490(-16257,
						     anIntArray2371[i_53_]));
	    if ((i_54_ ^ 0xffffffff) == -34)
		anIntArray2371[i_53_]
		    = (Class37_Sub4_Sub7.method490(anIntArray2371[i_53_], -128)
		       - -i_55_);
	    if ((i_54_ ^ 0xffffffff) == -6)
		anIntArray2364[i_53_]
		    = (Class37_Sub4_Sub7.method490(anIntArray2364[i_53_],
						   -16257)
		       - -(i_55_ << 1389175207));
	    if ((i_54_ ^ 0xffffffff) == -38)
		anIntArray2364[i_53_]
		    = (Class37_Sub4_Sub7.method490(anIntArray2364[i_53_], -128)
		       + i_55_);
	    if (i_54_ == 7)
		anIntArray2350[i_53_]
		    = (Class37_Sub4_Sub7.method490(anIntArray2350[i_53_],
						   -16257)
		       - -(i_55_ << -1464055577));
	    if (i_54_ == 39)
		anIntArray2350[i_53_]
		    = (Class37_Sub4_Sub7.method490(anIntArray2350[i_53_], -128)
		       - -i_55_);
	    if ((i_54_ ^ 0xffffffff) == -11)
		anIntArray2387[i_53_]
		    = ((i_55_ << 1109549383)
		       + Class37_Sub4_Sub7.method490(anIntArray2387[i_53_],
						     -16257));
	    if (i_54_ == 42)
		anIntArray2387[i_53_]
		    = (Class37_Sub4_Sub7.method490(-128, anIntArray2387[i_53_])
		       + i_55_);
	    if ((i_54_ ^ 0xffffffff) == -12)
		anIntArray2396[i_53_]
		    = ((i_55_ << 663186087)
		       + Class37_Sub4_Sub7.method490(anIntArray2396[i_53_],
						     -16257));
	    if (i_54_ == 43)
		anIntArray2396[i_53_]
		    = i_55_ + Class37_Sub4_Sub7
				  .method490(-128, anIntArray2396[i_53_]);
	    if (i_54_ == 64) {
		if (i_55_ < 64)
		    anIntArray2383[i_53_]
			= Class37_Sub4_Sub7.method490(anIntArray2383[i_53_],
						      -2);
		else
		    anIntArray2383[i_53_]
			= Class37_Sub9_Sub13.method817(anIntArray2383[i_53_],
						       1);
	    }
	    if (i_54_ == 65) {
		if ((i_55_ ^ 0xffffffff) <= -65)
		    anIntArray2383[i_53_]
			= Class37_Sub9_Sub13.method817(anIntArray2383[i_53_],
						       2);
		else {
		    method361((byte) 125, i_53_);
		    anIntArray2383[i_53_]
			= Class37_Sub4_Sub7.method490(anIntArray2383[i_53_],
						      -3);
		}
	    }
	    if (i_54_ == 99)
		anIntArray2380[i_53_]
		    = (Class37_Sub4_Sub7.method490(127, anIntArray2380[i_53_])
		       - -(i_55_ << -607537433));
	    if ((i_54_ ^ 0xffffffff) == -99)
		anIntArray2380[i_53_]
		    = i_55_ + Class37_Sub4_Sub7
				  .method490(16256, anIntArray2380[i_53_]);
	    if (i_54_ == 101)
		anIntArray2380[i_53_]
		    = ((i_55_ << 993320839) + 16384
		       - -Class37_Sub4_Sub7.method490(127,
						      anIntArray2380[i_53_]));
	    if ((i_54_ ^ 0xffffffff) == -101)
		anIntArray2380[i_53_]
		    = Class37_Sub4_Sub7.method490(anIntArray2380[i_53_],
						  16256) + (16384 + i_55_);
	    if ((i_54_ ^ 0xffffffff) == -121)
		method383(i_53_, (byte) 22);
	    if (i_54_ == 121)
		method364(i_42_ + 32768, i_53_);
	    if ((i_54_ ^ 0xffffffff) == -124)
		method358(i_42_ + 576, i_53_);
	    if ((i_54_ ^ 0xffffffff) == -7) {
		int i_56_ = anIntArray2380[i_53_];
		if (i_56_ == 16384)
		    anIntArray2376[i_53_]
			= (Class37_Sub4_Sub7.method490(-16257,
						       anIntArray2376[i_53_])
			   - -(i_55_ << -1738018585));
	    }
	    if ((i_54_ ^ 0xffffffff) == -39) {
		int i_57_ = anIntArray2380[i_53_];
		if (i_57_ == 16384)
		    anIntArray2376[i_53_]
			= (Class37_Sub4_Sub7.method490(-128,
						       anIntArray2376[i_53_])
			   - -i_55_);
	    }
	    if (i_54_ == 16)
		anIntArray2385[i_53_]
		    = ((i_55_ << -203476985)
		       + Class37_Sub4_Sub7.method490(anIntArray2385[i_53_],
						     -16257));
	    if (i_54_ == 48)
		anIntArray2385[i_53_]
		    = i_55_ + Class37_Sub4_Sub7
				  .method490(-128, anIntArray2385[i_53_]);
	    if (i_54_ == 81) {
		if (i_55_ < 64) {
		    method359(i_53_, (byte) -51);
		    anIntArray2383[i_53_]
			= Class37_Sub4_Sub7.method490(anIntArray2383[i_53_],
						      -5);
		} else
		    anIntArray2383[i_53_]
			= Class37_Sub9_Sub13.method817(anIntArray2383[i_53_],
						       4);
	    }
	    if (i_54_ == 17)
		method362((byte) -77,
			  (i_55_ << -1606166201) + (anIntArray2379[i_53_]
						    & ~0x3f80),
			  i_53_);
	    if (i_54_ == 49)
		method362((byte) -103,
			  (~0x7f & anIntArray2379[i_53_]) - -i_55_, i_53_);
	} else if (i_43_ == 192) {
	    int i_58_ = 0xf & i;
	    int i_59_ = (0x7f4c & i) >> -923966072;
	    method374(anIntArray2389[i_58_] - -i_59_, (byte) -44, i_58_);
	} else if ((i_43_ ^ 0xffffffff) == -209) {
	    int i_60_ = 0xf & i;
	    int i_61_ = i >> -1319399864 & 0x7f;
	    method360(i_60_, i_61_, -126);
	} else if ((i_43_ ^ 0xffffffff) == -225) {
	    int i_62_ = 0xf & i;
	    int i_63_ = (i >> -1074809592 & 0x7f) + (0x3f80 & i >> 1492734345);
	    method390(i_62_, i_63_, i_42_ + 28);
	} else if (i_42_ == -1) {
	    i_43_ = i & 0xff;
	    if ((i_43_ ^ 0xffffffff) == -256)
		method378(false);
	}
    }
    
    public void method380(int i, int i_64_, int i_65_, int i_66_) {
	anInt2397++;
	method389(26596, 64, i, i_66_);
	if ((anIntArray2383[i_66_] & 0x2) != 0) {
	    for (Class37_Sub12 class37_sub12
		     = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					   .aClass58_2316.getLast();
		 class37_sub12 != null;
		 class37_sub12
		     = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					   .aClass58_2316
					   .getPrevious()) {
		if (class37_sub12.anInt2078 == i_66_
		    && class37_sub12.anInt2088 < 0) {
		    aClass37_Sub12ArrayArray2372[i_66_][(class37_sub12
							 .anInt2099)]
			= null;
		    aClass37_Sub12ArrayArray2372[i_66_][i] = class37_sub12;
		    int i_67_
			= ((class37_sub12.anInt2083 * class37_sub12.anInt2081
			    >> -2087559220)
			   + class37_sub12.anInt2079);
		    class37_sub12.anInt2079
			+= -class37_sub12.anInt2099 + i << -92306488;
		    class37_sub12.anInt2099 = i;
		    class37_sub12.anInt2083 = 4096;
		    class37_sub12.anInt2081 = -class37_sub12.anInt2079 + i_67_;
		    return;
		}
	    }
	}
	Class37_Sub15 class37_sub15
	    = ((Class37_Sub15)
	       aClass13_2343.get((long) anIntArray2370[i_66_]));
	if (i_65_ >= 39 && class37_sub15 != null) {
	    Class37_Sub22_Sub1 class37_sub22_sub1
		= class37_sub15.aClass37_Sub22_Sub1Array2138[i];
	    if (class37_sub22_sub1 != null) {
		Class37_Sub12 class37_sub12 = new Class37_Sub12();
		class37_sub12.aClass37_Sub15_2091 = class37_sub15;
		class37_sub12.anInt2078 = i_66_;
		class37_sub12.aClass37_Sub22_Sub1_2098 = class37_sub22_sub1;
		class37_sub12.aClass66_2096
		    = class37_sub15.aClass66Array2145[i];
		class37_sub12.anInt2076 = class37_sub15.aByteArray2135[i];
		class37_sub12.anInt2099 = i;
		class37_sub12.anInt2103
		    = ((class37_sub15.aByteArray2144[i] * i_64_
			* (i_64_ * class37_sub15.anInt2139)) + 1024
		       >> -1360095445);
		class37_sub12.anInt2100
		    = class37_sub15.aByteArray2136[i] & 0xff;
		class37_sub12.anInt2079
		    = (i << -272725272) + -(class37_sub15.aShortArray2147[i]
					    & 0x7fff);
		class37_sub12.anInt2080 = 0;
		class37_sub12.anInt2092 = 0;
		class37_sub12.anInt2095 = 0;
		class37_sub12.anInt2090 = 0;
		class37_sub12.anInt2088 = -1;
		if (anIntArray2385[i_66_] == 0)
		    class37_sub12.aClass37_Sub3_Sub4_2084
			= Class37_Sub3_Sub4.method391(class37_sub22_sub1,
						      method388(class37_sub12,
								44),
						      method373(class37_sub12,
								-112),
						      method381(class37_sub12,
								(byte) 97));
		else {
		    class37_sub12.aClass37_Sub3_Sub4_2084
			= Class37_Sub3_Sub4.method391(class37_sub22_sub1,
						      method388(class37_sub12,
								51),
						      0,
						      method381(class37_sub12,
								(byte) 97));
		    method366(((class37_sub15.aShortArray2147[i] ^ 0xffffffff)
			       > -1),
			      true, class37_sub12);
		}
		if ((class37_sub15.aShortArray2147[i] ^ 0xffffffff) > -1)
		    class37_sub12.aClass37_Sub3_Sub4_2084.method429(-1);
		if (class37_sub12.anInt2076 >= 0) {
		    Class37_Sub12 class37_sub12_68_
			= (aClass37_Sub12ArrayArray2351[i_66_]
			   [class37_sub12.anInt2076]);
		    if (class37_sub12_68_ != null
			&& class37_sub12_68_.anInt2088 < 0) {
			aClass37_Sub12ArrayArray2372[i_66_][(class37_sub12_68_
							     .anInt2099)]
			    = null;
			class37_sub12_68_.anInt2088 = 0;
		    }
		    aClass37_Sub12ArrayArray2351[i_66_][(class37_sub12
							 .anInt2076)]
			= class37_sub12;
		}
		aClass37_Sub3_Sub1_2405.aClass58_2316
		    .addLast(class37_sub12);
		aClass37_Sub12ArrayArray2372[i_66_][i] = class37_sub12;
	    }
	}
    }
    
    public int method381(Class37_Sub12 class37_sub12, byte i) {
	if (i != 97)
	    aLong2404 = 1L;
	anInt2378++;
	int i_69_ = anIntArray2387[class37_sub12.anInt2078];
	if ((i_69_ ^ 0xffffffff) <= -8193)
	    return (16384
		    + -(((16384 + -i_69_) * (128 + -class37_sub12.anInt2100)
			 + 32)
			>> 1894589446));
	return 32 + i_69_ * class37_sub12.anInt2100 >> -113513946;
    }
    
    public void method382(int i, int i_70_, int i_71_) {
	anInt2361++;
	anIntArray2373[i_71_] = i_70_;
	anIntArray2389[i_71_] = Class37_Sub4_Sub7.method490(i_70_, -128);
	if (i < 13)
	    method357(-45);
	method374(i_70_, (byte) -44, i_71_);
    }
    
    public void method383(int i, byte i_72_) {
	Class37_Sub12 class37_sub12
	    = ((Class37_Sub12)
	       aClass37_Sub3_Sub1_2405.aClass58_2316.getFirst());
	if (i_72_ != 22)
	    anIntArray2385 = null;
	for (/**/; class37_sub12 != null;
	     class37_sub12
		 = (Class37_Sub12) aClass37_Sub3_Sub1_2405.aClass58_2316
				       .getNext()) {
	    if ((i ^ 0xffffffff) > -1
		|| (i ^ 0xffffffff) == (class37_sub12.anInt2078
					^ 0xffffffff)) {
		if (class37_sub12.aClass37_Sub3_Sub4_2084 != null) {
		    class37_sub12.aClass37_Sub3_Sub4_2084
			.method400(Class33.anInt765 / 100);
		    if (class37_sub12.aClass37_Sub3_Sub4_2084.method406())
			aClass37_Sub3_Sub1_2405.aClass37_Sub3_Sub2_2331
			    .method350(class37_sub12.aClass37_Sub3_Sub4_2084);
		    class37_sub12.method1000((byte) -95);
		}
		if ((class37_sub12.anInt2088 ^ 0xffffffff) > -1)
		    aClass37_Sub12ArrayArray2372[class37_sub12.anInt2078]
			[class37_sub12.anInt2099]
			= null;
		class37_sub12.unlink();
	    }
	}
	anInt2357++;
    }
    
    public synchronized void method341(int i) {
	anInt2342++;
	if (aClass7_2382.method76()) {
	    int i_73_ = aClass7_2382.anInt150 * anInt2355 / Class33.anInt765;
	    do {
		long l = (long) i * (long) i_73_ + aLong2404;
		if ((aLong2403 - l ^ 0xffffffffffffffffL) <= -1L) {
		    aLong2404 = l;
		    break;
		}
		int i_74_
		    = (int) (((long) i_73_ + (-aLong2404 + (aLong2403 - 1L)))
			     / (long) i_73_);
		i -= i_74_;
		aLong2404 += (long) i_73_ * (long) i_74_;
		aClass37_Sub3_Sub1_2405.method341(i_74_);
		method372(-64);
	    } while (aClass7_2382.method76());
	}
	aClass37_Sub3_Sub1_2405.method341(i);
    }
    
    public synchronized void method384(int i, byte i_75_) {
	anInt2365++;
	anInt2377 = i;
	if (i_75_ <= 67)
	    aClass37_Sub3_Sub1_2405 = null;
    }
    
    public synchronized void method385(int i) {
	for (Class37_Sub15 class37_sub15
		 = (Class37_Sub15) aClass13_2343.getFirst();
	     class37_sub15 != null;
	     class37_sub15
		 = (Class37_Sub15) aClass13_2343.getNext())
	    class37_sub15.method1005(-65);
	int i_76_ = 97 % ((i - 63) / 37);
	anInt2345++;
    }
    
    public synchronized boolean method386
	(Class73 class73, Class37_Sub19 class37_sub19, Class15 class15,
	 boolean bool, int i) {
	try {
	    class37_sub19.method1020();
	    anInt2356++;
	    int[] is = null;
	    boolean bool_77_ = bool;
	    if ((i ^ 0xffffffff) < -1)
		is = new int[] { i };
	    for (Class37_Sub23 class37_sub23
		     = ((Class37_Sub23)
			class37_sub19.aClass13_2203.getFirst());
		 class37_sub23 != null;
		 class37_sub23 = (Class37_Sub23) class37_sub19
						     .aClass13_2203
						     .getNext()) {
		int i_78_ = (int) class37_sub23.hash;
		Class37_Sub15 class37_sub15
		    = ((Class37_Sub15)
		       aClass13_2343.get((long) i_78_));
		if (class37_sub15 == null) {
		    class37_sub15
			= Class1.method40(class15, i_78_, (byte) -64);
		    if (class37_sub15 == null) {
			bool_77_ = false;
			continue;
		    }
		    aClass13_2343.put(class37_sub15, (long) i_78_);
		}
		if (!class37_sub15.method1004(class37_sub23.aByteArray2225, is,
					      24, class73))
		    bool_77_ = false;
	    }
	    if (bool_77_)
		class37_sub19.method1018();
	    return bool_77_;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("hd.A(" + (class73 != null ? "{...}" : "null") + ','
			+ (class37_sub19 != null ? "{...}" : "null") + ','
			+ (class15 != null ? "{...}" : "null") + ',' + bool
			+ ',' + i + ')'));
	}
    }
    
    public static Class37_Sub4_Sub5 method387(int i, int i_79_) {
	anInt2388++;
	Class37_Sub4_Sub5 class37_sub4_sub5
	    = ((Class37_Sub4_Sub5)
	       Class37_Sub4_Sub7_Sub5.aClass65_3805.get((long) i));
	if (class37_sub4_sub5 != null)
	    return class37_sub4_sub5;
	if (i_79_ != 9199)
	    return null;
	byte[] is = Class42.aClass15_919.getFile(14, i);
	class37_sub4_sub5 = new Class37_Sub4_Sub5();
	if (is != null)
	    class37_sub4_sub5.method483(new ByteVector(is), (byte) -80);
	Class37_Sub4_Sub7_Sub5.aClass65_3805
	    .put(class37_sub4_sub5, (long) i);
	return class37_sub4_sub5;
    }
    
    public int method388(Class37_Sub12 class37_sub12, int i) {
	int i_80_ = 125 % ((-10 - i) / 44);
	anInt2362++;
	int i_81_ = ((class37_sub12.anInt2081 * class37_sub12.anInt2083
		      >> -1296817812)
		     + class37_sub12.anInt2079);
	Class66 class66 = class37_sub12.aClass66_2096;
	i_81_ += ((-8192 + anIntArray2366[class37_sub12.anInt2078])
		  * anIntArray2376[class37_sub12.anInt2078]) >> -1704707924;
	if ((class66.anInt1254 ^ 0xffffffff) < -1
	    && (class66.anInt1250 > 0
		|| ((anIntArray2371[class37_sub12.anInt2078] ^ 0xffffffff)
		    < -1))) {
	    int i_82_ = class66.anInt1250 << 341254882;
	    int i_83_ = class66.anInt1245 << 1726722017;
	    if (i_83_ > class37_sub12.anInt2085)
		i_82_ = i_82_ * class37_sub12.anInt2085 / i_83_;
	    i_82_ += anIntArray2371[class37_sub12.anInt2078] >> 1600416743;
	    double d = Math.sin((double) (0x1ff & class37_sub12.anInt2086)
				* 0.01227184630308513);
	    i_81_ += (int) ((double) i_82_ * d);
	}
	int i_84_
	    = (int) (((double) ((class37_sub12.aClass37_Sub22_Sub1_2098
				 .anInt3630)
				* 256)
		      * Math.pow(2.0, 3.255208333333333E-4 * (double) i_81_)
		      / (double) Class33.anInt765)
		     + 0.5);
	if (i_84_ < 1)
	    return 1;
	return i_84_;
    }
    
    public void method389(int i, int i_85_, int i_86_, int i_87_) {
	anInt2367++;
	Class37_Sub12 class37_sub12
	    = aClass37_Sub12ArrayArray2372[i_87_][i_86_];
	if (class37_sub12 != null) {
	    aClass37_Sub12ArrayArray2372[i_87_][i_86_] = null;
	    if ((0x2 & anIntArray2383[i_87_] ^ 0xffffffff) != -1) {
		for (Class37_Sub12 class37_sub12_88_
			 = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					       .aClass58_2316.getFirst();
		     class37_sub12_88_ != null;
		     class37_sub12_88_
			 = (Class37_Sub12) aClass37_Sub3_Sub1_2405
					       .aClass58_2316
					       .getNext()) {
		    if (class37_sub12_88_.anInt2078 == class37_sub12.anInt2078
			&& class37_sub12_88_.anInt2088 < 0
			&& class37_sub12_88_ != class37_sub12) {
			class37_sub12.anInt2088 = 0;
			break;
		    }
		}
	    } else
		class37_sub12.anInt2088 = 0;
	    if (i != 26596)
		aLong2404 = -104L;
	}
    }
    
    public void method390(int i, int i_89_, int i_90_) {
	anIntArray2366[i] = i_89_;
	anInt2354++;
	if (i_90_ < 9)
	    anIntArray2370 = null;
    }
    
    public Class37_Sub3_Sub3() {
	anIntArray2364 = new int[16];
	anIntArray2350 = new int[16];
	anIntArray2371 = new int[16];
	aClass37_Sub12ArrayArray2351 = new Class37_Sub12[16][128];
	anIntArray2379 = new int[16];
	anIntArray2370 = new int[16];
	anInt2355 = 1000000;
	anIntArray2373 = new int[16];
	anIntArray2376 = new int[16];
	anInt2377 = 256;
	anIntArray2389 = new int[16];
	anIntArray2383 = new int[16];
	anIntArray2385 = new int[16];
	anIntArray2387 = new int[16];
	aClass37_Sub12ArrayArray2372 = new Class37_Sub12[16][128];
	anIntArray2396 = new int[16];
	anIntArray2380 = new int[16];
	aClass7_2382 = new Class7();
	aClass37_Sub3_Sub1_2405 = new Class37_Sub3_Sub1(this);
	aClass13_2343 = new Hashtable(128);
	method378(false);
    }
}
