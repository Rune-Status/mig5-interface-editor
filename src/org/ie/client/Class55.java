package org.ie.client;

/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 implements Runnable {
	public static int[] anIntArray1064;
	public static int anInt1065;
	public static RSString aClass16_1066;
	public static RSString aClass16_1067 = Class37_Sub2.create_rsstring(" Sekunde(Xn(Y -Ubertragen)3");
	public static int anInt1068;
	public static RSString aClass16_1069 = Class37_Sub2.create_rsstring("Gegenstand f-Ur Mitglieder");
	public static RSString aClass16_1070;
	public static boolean aBoolean1071 = false;
	public boolean aBoolean1072 = true;
	public Object anObject1073 = new Object();
	public static int anInt1074;
	public static int anInt1075;
	public static Class23 aClass23_1076;
	public static RSString aClass16_1077 = (Class37_Sub2.create_rsstring("Sie befinden sich in einem Mitglieder)2Gebiet(Q"));
	public int[] anIntArray1078;
	public int anInt1079 = 0;
	public int[] anIntArray1080;

	public void run() {
		while (aBoolean1072) {
			synchronized (anObject1073) {
				if (anInt1079 < 500) {
					anIntArray1078[anInt1079] = Class37_Sub4_Sub7_Sub7.lastMouseX;
					anIntArray1080[anInt1079] = Class37_Sub9_Sub1.lastMouseY;
					anInt1079++;
				}
			}
			Class37_Sub9_Sub20.method846(50L, (byte) 58);
		}
		anInt1075++;
	}

	public static void method1141(ByteVector class37_sub11, byte i,
			Signlink signlink, int i_0_) {
		try {
			anInt1074++;
			Class37_Sub20 class37_sub20 = new Class37_Sub20();
			class37_sub20.anInt2205 = class37_sub11.getUnsignedByte();
			class37_sub20.anInt2207 = class37_sub11.getInt();
			class37_sub20.aByteArrayArrayArray2213 = new byte[class37_sub20.anInt2205][][];
			class37_sub20.aClass23Array2206 = new Class23[class37_sub20.anInt2205];
			class37_sub20.anIntArray2204 = new int[class37_sub20.anInt2205];
			class37_sub20.anIntArray2214 = new int[class37_sub20.anInt2205];
			class37_sub20.anIntArray2212 = new int[class37_sub20.anInt2205];
			class37_sub20.aClass23Array2209 = new Class23[class37_sub20.anInt2205];
			if (i == -37) {
				for (int i_1_ = 0; class37_sub20.anInt2205 > i_1_; i_1_++) {
					try {
						int i_2_ = class37_sub11.getUnsignedByte();
						if ((i_2_ ^ 0xffffffff) == -1
								|| (i_2_ ^ 0xffffffff) == -2 || i_2_ == 2) {
							String string = new String(class37_sub11.getRS2String().method179((byte) -103));
							String string_3_ = new String(class37_sub11
									.getRS2String().method179(
											(byte) -103));
							int i_4_ = 0;
							if (i_2_ == 1)
								i_4_ = class37_sub11.getInt();
							class37_sub20.anIntArray2214[i_1_] = i_2_;
							class37_sub20.anIntArray2204[i_1_] = i_4_;
							class37_sub20.aClass23Array2209[i_1_] = (signlink
									.method1124(Class37_Sub9_Sub6.method783(95,
											string), -89, string_3_));
						} else if ((i_2_ ^ 0xffffffff) == -4
								|| (i_2_ ^ 0xffffffff) == -5) {
							String string = new String(class37_sub11.getRS2String().method179((byte) -103));
							String string_5_ = new String(class37_sub11
									.getRS2String()
									.method179((byte) -103));
							int i_6_ = class37_sub11.getUnsignedByte();
							String[] strings = new String[i_6_];
							for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_7_++)
								strings[i_7_] = new String(class37_sub11
										.getRS2String().method179(
												(byte) -103));
							byte[][] is = new byte[i_6_][];
							if ((i_2_ ^ 0xffffffff) == -4) {
								for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
									int i_9_ = class37_sub11.getInt();
									is[i_8_] = new byte[i_9_];
									class37_sub11.method968(0, i_9_, is[i_8_],
											(byte) -53);
								}
							}
							class37_sub20.anIntArray2214[i_1_] = i_2_;
							Class[] var_classes = new Class[i_6_];
							for (int i_10_ = 0; (i_6_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
								var_classes[i_10_] = (Class37_Sub9_Sub6
										.method783(Class37_Sub4_Sub7_Sub1_Sub1
												.method502(i, 88),
												strings[i_10_]));
							class37_sub20.aClass23Array2206[i_1_] = (signlink
									.method1118((byte) 64, string_5_,
											Class37_Sub9_Sub6.method783(i + 59,
													string), var_classes));
							class37_sub20.aByteArrayArrayArray2213[i_1_] = is;
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class37_sub20.anIntArray2212[i_1_] = -1;
					} catch (SecurityException securityexception) {
						class37_sub20.anIntArray2212[i_1_] = -2;
					} catch (NullPointerException nullpointerexception) {
						class37_sub20.anIntArray2212[i_1_] = -3;
					} catch (Exception exception) {
						class37_sub20.anIntArray2212[i_1_] = -4;
					} catch (Throwable throwable) {
						class37_sub20.anIntArray2212[i_1_] = -5;
					}
				}
				Class37_Sub4_Sub7.aClass58_2633.addLast(class37_sub20);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("p.A(" + (class37_sub11 != null ? "{...}" : "null") + ','
							+ i + ',' + (signlink != null ? "{...}" : "null")
							+ ',' + i_0_ + ')'));
		}
	}

	public static void method1142(byte i) {
		anIntArray1064 = null;
		aClass16_1069 = null;
		aClass16_1077 = null;
		if (i > -29)
			method1141(null, (byte) -79, null, 42);
		aClass16_1067 = null;
		aClass16_1070 = null;
		aClass23_1076 = null;
		aClass16_1066 = null;
	}

	public Class55() {
		anIntArray1078 = new int[500];
		anIntArray1080 = new int[500];
	}

	static {
		aClass16_1070 = Class37_Sub2.create_rsstring("Take");
		aClass16_1066 = aClass16_1070;
	}
}
