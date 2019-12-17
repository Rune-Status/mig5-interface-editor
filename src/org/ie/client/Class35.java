package org.ie.client;

/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class35 {
	public static RSString aClass16_776;
	public static RSString aClass16_777;
	public static int anInt778;
	public static byte[] aByteArray779;
	public static RSString aClass16_780;
	public static int anInt781;
	public static int anInt782;
	public static int anInt783;
	public static RSString aClass16_784 = Class37_Sub2.create_rsstring("Hierhin gehen");
	public static int anInt785;
	public static RSString aClass16_786;
	public static RSString aClass16_787;
	public static int anInt788;
	public static short[] aShortArray789;
	public static RSString aClass16_790;
	public static RSString aClass16_791;
	public static int anInt792;
	public static int anInt793;
	public static int anInt794;

	public static byte[] method312(byte[] is, byte i) {
		ByteVector class37_sub11 = new ByteVector(is);
		if (i != 106)
			method315(25);
		int i_0_ = class37_sub11.getUnsignedByte();
		anInt792++;
		int i_1_ = class37_sub11.getInt();
		if ((i_1_ ^ 0xffffffff) > -1 || Class15_Sub1.anInt1762 != 0
				&& Class15_Sub1.anInt1762 < i_1_)
			throw new RuntimeException();
		if (i_0_ != 0) {
			int i_2_ = class37_sub11.getInt();
			if (i_2_ < 0
					|| ((Class15_Sub1.anInt1762 ^ 0xffffffff) != -1 && (Class15_Sub1.anInt1762 ^ 0xffffffff) > (i_2_ ^ 0xffffffff))) {
				return new byte[100];
				//throw new RuntimeException();
			}
			if (i_2_ >= 2000000) {
				return new byte[100];
			}
			byte[] is_3_ = new byte[i_2_];
			if (i_0_ != 1)
				Class37_Sub4_Sub3.aClass6_2552.method58((byte) 126, is_3_,
						class37_sub11);
			else
				Class31.method286(is_3_, i_2_, is, i_1_, 9);
			return is_3_;
		}
		byte[] is_4_ = new byte[i_1_];
		class37_sub11.method968(0, i_1_, is_4_, (byte) -53);
		return is_4_;
	}

	public static void method313(int i, Class15_Sub1 class15_sub1,
			Class69 class69, int i_5_) {
		try {
			anInt793++;
			Class37_Sub5 class37_sub5 = new Class37_Sub5();
			class37_sub5.aClass69_1866 = class69;
			class37_sub5.aClass15_Sub1_1868 = class15_sub1;
			class37_sub5.anInt1867 = i_5_;
			class37_sub5.hash = (long) i;
			synchronized (Class37_Sub9_Sub34.aClass58_3557) {
				Class37_Sub9_Sub34.aClass58_3557.addLast(class37_sub5);
			}
			InterfaceClickMask.method926(true);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("kf.B("
					+ i + ',' + (class15_sub1 != null ? "{...}" : "null") + ','
					+ (class69 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	public static void method314(int i) {
		if (i != -9)
			anInt788 = 26;
		aShortArray789 = null;
		aClass16_776 = null;
		aClass16_791 = null;
		aClass16_787 = null;
		aClass16_790 = null;
		aByteArray779 = null;
		aClass16_777 = null;
		aClass16_780 = null;
		aClass16_786 = null;
		aClass16_784 = null;
	}

	public static void method315(int i) {
		anInt794++;
		try {
			if ((Class22.anInt580 ^ 0xffffffff) == -1) {
				if (Applet_Sub1.aClass19_38 != null) {
					Applet_Sub1.aClass19_38.method209((byte) -128);
					Applet_Sub1.aClass19_38 = null;
				}
				Class37_Sub18.aBoolean2201 = false;
				anInt781 = 0;
				Class22.anInt580 = 1;
				Class55.aClass23_1076 = null;
			}
			if (Class22.anInt580 == 1) {
				if (Class55.aClass23_1076 == null)
					Class55.aClass23_1076 = (Class80.aClass51_1508.method1117(
							InterfaceListener.aString1940,
							Class37_Sub4_Sub7_Sub1.anInt3700, true));
				if ((Class55.aClass23_1076.anInt591 ^ 0xffffffff) == -3)
					throw new IOException();
				if (Class55.aClass23_1076.anInt591 == 1) {
					Applet_Sub1.aClass19_38 = new Class19(
							((Socket) Class55.aClass23_1076.anObject595),
							Class80.aClass51_1508);
					Class22.anInt580 = 2;
					Class55.aClass23_1076 = null;
				}
			}
			if (i != -21482)
				method312(null, (byte) 0);
			if (Class22.anInt580 == 2) {
				long l = (Class37_Sub9_Sub34.aLong3556 = Class37_Sub9_Sub33.aClass16_3526
						.method152(-53));
				int i_6_ = (int) (0x1fL & l >> -356845744);
				Class42.aClass37_Sub11_Sub1_936.pos = 0;
				Class42.aClass37_Sub11_Sub1_936.method964(101, 14);
				Class42.aClass37_Sub11_Sub1_936.method964(99, i_6_);
				Applet_Sub1.aClass19_38.method204(0, (byte) 101,
						(Class42.aClass37_Sub11_Sub1_936.buf), 2);
				Class83.byteVector.pos = 0;
				Class22.anInt580 = 3;
			}
			if ((Class22.anInt580 ^ 0xffffffff) == -4) {
				if (Class88.aClass24_1605 != null)
					Class88.aClass24_1605.method243(false);
				if (Class37_Sub4_Sub7.aClass24_2638 != null)
					Class37_Sub4_Sub7.aClass24_2638.method243(false);
				int i_7_ = Applet_Sub1.aClass19_38.method205(false);
				if (Class88.aClass24_1605 != null)
					Class88.aClass24_1605.method243(false);
				if (Class37_Sub4_Sub7.aClass24_2638 != null)
					Class37_Sub4_Sub7.aClass24_2638.method243(false);
				if ((i_7_ ^ 0xffffffff) != -1) {
					RuntimeException_Sub1.method1338(i_7_, (byte) 59);
					return;
				}
				Class83.byteVector.pos = 0;
				Class22.anInt580 = 4;
			}
			if ((Class22.anInt580 ^ 0xffffffff) == -5) {
				if (Class83.byteVector.pos < 8) {
					int i_8_ = Applet_Sub1.aClass19_38.method206(-106);
					if ((i_8_ ^ 0xffffffff) < (8 - Class83.byteVector.pos ^ 0xffffffff))
						i_8_ = 8 + -Class83.byteVector.pos;
					if ((i_8_ ^ 0xffffffff) < -1) {
						Applet_Sub1.aClass19_38
								.method208(
										i_8_,
										Class83.byteVector.pos,
										122,
										Class83.byteVector.buf);
						Class83.byteVector.pos += i_8_;
					}
				}
				if (Class83.byteVector.pos == 8) {
					Class83.byteVector.pos = 0;
					Class26.aLong659 = Class83.byteVector
							.getLong(false);
					Class22.anInt580 = 5;
				}
			}
			if (Class22.anInt580 == 5) {
				int[] is = new int[4];
				is[0] = (int) (Math.random() * 9.9999999E7);
				is[3] = (int) Class26.aLong659;
				is[2] = (int) (Class26.aLong659 >> -311437664);
				Class42.aClass37_Sub11_Sub1_936.pos = 0;
				is[1] = (int) (9.9999999E7 * Math.random());
				Class42.aClass37_Sub11_Sub1_936.method964(i ^ ~0x5394, 10);
				Class42.aClass37_Sub11_Sub1_936.method947(is[0]);
				Class42.aClass37_Sub11_Sub1_936.method947(is[1]);
				Class42.aClass37_Sub11_Sub1_936.method947(is[2]);
				Class42.aClass37_Sub11_Sub1_936.method947(is[3]);
				Class42.aClass37_Sub11_Sub1_936.method949(
						Class37_Sub9_Sub33.aClass16_3526.method152(i ^ 0x53be),
						(byte) 108);
				Class42.aClass37_Sub11_Sub1_936.method977(
						Class37_Sub9_Sub33.password, 0);
				// Class42.aClass37_Sub11_Sub1_936.method958((byte) -91,
				// (Class37_Sub20
				// .aBigInteger2210),
				// (Class26
				// .aBigInteger652));
				Deque.aClass37_Sub11_Sub1_1106.pos = 0;
				if (Class32.anInt740 != 40)
					Deque.aClass37_Sub11_Sub1_1106.method964(118, 16);
				else
					Deque.aClass37_Sub11_Sub1_1106.method964(i ^ ~0x5383,
							18);
				Deque.aClass37_Sub11_Sub1_1106.method964(106,
						Class42.aClass37_Sub11_Sub1_936.pos + 93);
				Deque.aClass37_Sub11_Sub1_1106.method947(474);
				Deque.aClass37_Sub11_Sub1_1106.method964(124,
						ClientScriptDef.aBoolean2613 ? 1 : 0);
				Class25.method253(Deque.aClass37_Sub11_Sub1_1106, -107);
				Deque.aClass37_Sub11_Sub1_1106.method947(Class69.aClass15_Sub1_1335.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947(Class69.aClass15_Sub1_1330.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947(Class14.aClass15_Sub1_242.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947((Canvas_Sub1.aClass15_Sub1_46.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((NodeSub.aClass15_Sub1_1862.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947(Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947(Class54.aClass15_Sub1_1060.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947(Class29.aClass15_Sub1_711.anInt255);
				Deque.aClass37_Sub11_Sub1_1106.method947((Class60.aClass15_Sub1_1151.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class37_Sub11_Sub1.aClass15_Sub1_3609.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class52_Sub1.aClass15_Sub1_2309.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class36.aClass15_Sub1_796.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class37_Sub9_Sub34.aClass15_Sub1_3555.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class37_Sub9_Sub2.aClass15_Sub1_2932.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class37_Sub20.aClass15_Sub1_2216.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method947((Class37_Sub17.aClass15_Sub1_2164.anInt255));
				Deque.aClass37_Sub11_Sub1_1106.method954(
						Class42.aClass37_Sub11_Sub1_936.pos, 0,
						i + 21486,
						Class42.aClass37_Sub11_Sub1_936.buf);
				Applet_Sub1.aClass19_38.method204(0, (byte) 102,
						Deque.aClass37_Sub11_Sub1_1106.buf,
						Deque.aClass37_Sub11_Sub1_1106.pos);
				Class42.aClass37_Sub11_Sub1_936.method990(false, is);
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
					is[i_9_] += 50;
				Class83.byteVector.method990(false, is);
				Class22.anInt580 = 6;
			}
			if ((Class22.anInt580 ^ 0xffffffff) == -7
					&& ((Applet_Sub1.aClass19_38.method206(-112) ^ 0xffffffff) < -1)) {
				int i_10_ = Applet_Sub1.aClass19_38.method205(false);
				if ((i_10_ ^ 0xffffffff) == -22 && Class32.anInt740 == 20)
					Class22.anInt580 = 7;
				else if (i_10_ != 2) {
					if (i_10_ == 15 && Class32.anInt740 == 40) {
						Class37_Sub9_Sub9.method799(i + 26512);
						return;
					}
					if ((i_10_ ^ 0xffffffff) == -24
							&& Class37_Sub9_Sub23.anInt3355 < 1) {
						Class37_Sub9_Sub23.anInt3355++;
						Class22.anInt580 = 0;
					} else {
						RuntimeException_Sub1.method1338(i_10_, (byte) 59);
						return;
					}
				} else
					Class22.anInt580 = 9;
			}
			if (Class22.anInt580 == 7
					&& Applet_Sub1.aClass19_38.method206(-107) > 0) {
				MouseHandler.anInt178 = 60 * Applet_Sub1.aClass19_38.method205(false) + 180;
				Class22.anInt580 = 8;
			}
			if ((Class22.anInt580 ^ 0xffffffff) == -9) {
				anInt781 = 0;
				Class32_Sub1.method293((byte) -120, (Class37_Sub9_Sub27
						.method881((new RSString[] {
								Class37_Sub9_Sub24.method870(
										MouseHandler.anInt178 / 60, (byte) -114),
								Class37_Sub9_Sub8.aClass16_3066 }))),
						Class37_Sub9_Sub35.aClass16_3568,
						Class37_Sub3_Sub1.aClass16_2327);
				if (--MouseHandler.anInt178 <= 0)
					Class22.anInt580 = 0;
			} else {
				if (Class22.anInt580 == 9
						&& Applet_Sub1.aClass19_38.method206(-110) >= 8) {
					Class37_Sub9_Sub20.anInt3301 = Applet_Sub1.aClass19_38
							.method205(false);
					Class37_Sub13.aBoolean2109 = (Applet_Sub1.aClass19_38
							.method205(false) ^ 0xffffffff) == -2;
					Class37_Sub9_Sub5.anInt2998 = Applet_Sub1.aClass19_38
							.method205(false);
					Class37_Sub9_Sub5.anInt2998 <<= 8;
					Class37_Sub9_Sub5.anInt2998 += Applet_Sub1.aClass19_38
							.method205(false);
					Class37_Sub12.anInt2077 = Applet_Sub1.aClass19_38
							.method205(false);
					Applet_Sub1.aClass19_38.method208(1, 0, 122,
							Class83.byteVector.buf);
					Class83.byteVector.pos = 0;
					Class37_Sub9_Sub17.anInt3225 = Class83.byteVector
							.method986(7);
					Applet_Sub1.aClass19_38.method208(2, 0, i + 21604,
							Class83.byteVector.buf);
					Class83.byteVector.pos = 0;
					NodeSub.anInt1844 = Class83.byteVector
							.getUnsignedShort();
					Class22.anInt580 = 10;
				}
				if ((Class22.anInt580 ^ 0xffffffff) == -11) {
					if ((Applet_Sub1.aClass19_38.method206(-124) ^ 0xffffffff) <= (NodeSub.anInt1844 ^ 0xffffffff)) {
						Class83.byteVector.pos = 0;
						Applet_Sub1.aClass19_38
								.method208(
										NodeSub.anInt1844,
										0,
										122,
										Class83.byteVector.buf);
						Class54.method1140(0);
						InterfaceClickMask.anInt1985 = -1;
						ByteVector.method934(0, false);
						Class37_Sub9_Sub17.anInt3225 = -1;
					}
				} else {
					anInt781++;
					if (anInt781 > 2000) {
						if ((Class37_Sub9_Sub23.anInt3355 ^ 0xffffffff) > -2) {
							if (Class37_Sub4_Sub7_Sub1.anInt3700 == Class37_Sub9_Sub31.anInt3490)
								Class37_Sub4_Sub7_Sub1.anInt3700 = Class22.anInt581;
							else
								Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
							Class22.anInt580 = 0;
							Class37_Sub9_Sub23.anInt3355++;
						} else
							RuntimeException_Sub1.method1338(-3, (byte) 59);
					}
				}
			}
		} catch (IOException ioexception) {
			if (Class37_Sub9_Sub23.anInt3355 < 1) {
				if ((Class37_Sub9_Sub31.anInt3490 ^ 0xffffffff) != (Class37_Sub4_Sub7_Sub1.anInt3700 ^ 0xffffffff))
					Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
				else
					Class37_Sub4_Sub7_Sub1.anInt3700 = Class22.anInt581;
				Class37_Sub9_Sub23.anInt3355++;
				Class22.anInt580 = 0;
			} else
				RuntimeException_Sub1.method1338(-2, (byte) 59);
		}
	}

	static {
		aClass16_777 = Class37_Sub2.create_rsstring("Connection lost)3");
		aClass16_786 = Class37_Sub2.create_rsstring("lila:");
		aClass16_776 = Class37_Sub2.create_rsstring("Please enter your username)3");
		anInt782 = 0;
		aClass16_780 = Class37_Sub2.create_rsstring("blaugr-Un:");
		anInt781 = 0;
		aClass16_787 = aClass16_776;
		aClass16_790 = Class37_Sub2.create_rsstring("Null");
		aClass16_791 = aClass16_777;
		aByteArray779 = new byte[520];
	}
}
