package org.ie.client;

/* Class37_Sub4_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub13 extends NodeSub {
	public byte aByte2788;
	public static int anInt2789;
	public int anInt2790;
	public static boolean aBoolean2791 = false;
	public static RSString aClass16_2792;
	public static int anInt2793 = 0;
	public static int anInt2794;
	public static int anInt2795;
	public static int anInt2796;
	public static RSInterface aClass18_2797;
	public static RSString aClass16_2798;
	public static boolean aBoolean2799;
	public static int[] anIntArray2800;
	public Class15_Sub1 aClass15_Sub1_2801;

	public static void send_varbit(int i_0_, int i_1_) {
		Class37_Sub4_Sub5 class37_sub4_sub5 = Class37_Sub3_Sub3.method387(i_0_,
				9199);
		int i_2_ = class37_sub4_sub5.anInt2596;
		int i_3_ = class37_sub4_sub5.anInt2598;
		int i_4_ = class37_sub4_sub5.anInt2594;
		int i_5_ = Class37_Sub4_Sub10.anIntArray2689[i_4_ - i_3_];
		if (i_1_ < 0 || i_5_ < i_1_)
			i_1_ = 0;
		i_5_ <<= i_3_;
		Class37_Sub23.varpData[i_2_] = (Class37_Sub9_Sub13.method817(
				Class37_Sub4_Sub7.method490(i_5_ ^ 0xffffffff,
						(Class37_Sub23.varpData[i_2_])),
				Class37_Sub4_Sub7.method490(i_1_ << i_3_, i_5_)));
	}

	public static void method706(int i) {
		aClass16_2792 = null;
		aClass18_2797 = null;
		aClass16_2798 = null;
		anIntArray2800 = null;
	}

	public static void method707(int i) {
		synchronized (Class37_Sub9_Sub13.keyboardHandler) {
			Class37_Sub9_Sub21.currentTypedKeyCachePosition = Node.anInt820;
			if ((Hashtable.heldKeyCachePosition ^ 0xffffffff) > -1) {
				for (int i_6_ = 0; i_6_ < 112; i_6_++)
					Class19.currentHeldKeyCache[i_6_] = false;
				Hashtable.heldKeyCachePosition = Class37_Sub9_Sub26.currentHeldKeyCachePosition;
			} else {
				while (Class37_Sub9_Sub26.currentHeldKeyCachePosition != Hashtable.heldKeyCachePosition) {
					int i_7_ = (Class37_Sub9_Sub19.heldKeyCache[Class37_Sub9_Sub26.currentHeldKeyCachePosition]);
					Class37_Sub9_Sub26.currentHeldKeyCachePosition = Class37_Sub9_Sub26.currentHeldKeyCachePosition + 1 & 0x7f;
					if (i_7_ < 0)
						Class19.currentHeldKeyCache[i_7_ ^ 0xffffffff] = false;
					else
						Class19.currentHeldKeyCache[i_7_] = true;
				}
			}
			Node.anInt820 = Class37_Sub9_Sub16.typedKeyCachePosition;
		}
		anInt2796++;
	}

	public static RSString method708(int i, long l) {
		try {
			anInt2795++;
			if ((l ^ 0xffffffffffffffffL) >= -1L || l >= 6582952005840035281L)
				return null;
			if ((l % (long) i ^ 0xffffffffffffffffL) == -1L)
				return null;
			int i_8_ = 0;
			long l_9_ = l;
			while (l_9_ != 0L) {
				l_9_ /= 37L;
				i_8_++;
			}
			byte[] is = new byte[i_8_];
			while (l != 0L) {
				long l_10_ = l;
				l /= 37L;
				is[--i_8_] = Deque.aByteArray1111[(int) (-(l * 37L) + l_10_)];
			}
			RSString rSString = new RSString();
			rSString.aByteArray1669 = is;
			rSString.anInt1650 = is.length;
			return rSString;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, "q.C(" + i
					+ ',' + l + ')');
		}
	}

	static {
		aClass16_2792 = Class37_Sub2.create_rsstring("Click to switch");
		aClass16_2798 = aClass16_2792;
		aBoolean2799 = false;
		anIntArray2800 = new int[50];
	}
}
