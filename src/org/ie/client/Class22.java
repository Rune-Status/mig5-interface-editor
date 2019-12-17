package org.ie.client;

/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class22 {
	public static byte[][] aByteArrayArray569;
	public static int anInt570;
	public long aLong571;
	public int anInt572;
	public int anInt573;
	public byte[] aByteArray574;
	public static RSString aClass16_575;
	public static int anInt576;
	public Class23 aClass23_577;
	public static int anInt578;
	public static int anInt579 = 0;
	public static int anInt580;
	public static int anInt581;
	public byte[] aByteArray582 = new byte[4];
	public static RSString aClass16_583 = Class37_Sub2.create_rsstring("Loading title screen )2 ");
	public int anInt584;
	public static int[] anIntArray585;
	public static int anInt586;
	public DataInputStream aDataInputStream587;
	public static Sprite[] aClass37_Sub4_Sub9_Sub3Array588 = new Sprite[1000];
	public static int anInt589;

	public static void method229(boolean bool) {
		if (bool != true)
			anInt579 = -94;
		anInt578++;
		for (;;) {
			Class37_Sub5 class37_sub5;
			synchronized (Class37_Sub9_Sub34.aClass58_3557) {
				class37_sub5 = ((Class37_Sub5) Class25.aClass58_642
						.removeFirst());
			}
			if (class37_sub5 == null)
				break;
			class37_sub5.aClass15_Sub1_1868.method142(
					(int) class37_sub5.hash, false, 126,
					class37_sub5.aClass69_1866, class37_sub5.aByteArray1863);
		}
	}

	public static int method230(int i, int i_0_, int i_1_) {
		anInt576++;
		if (i_0_ == -2)
			return 12345678;
		if (i_0_ == -1) {
			if ((i ^ 0xffffffff) <= -3) {
				if (i > 126)
					i = 126;
			} else
				i = 2;
			return i;
		}
		i = i * (i_0_ & 0x7f) / 128;
		if ((i ^ 0xffffffff) <= -3) {
			if (i > 126)
				i = 126;
		} else
			i = 2;
		if (i_1_ != 12108)
			aClass16_583 = null;
		return i + (0xff80 & i_0_);
	}

	public byte[] method231(int i) throws IOException {
		anInt570++;
		if (Class71.method1263() > aLong571)
			throw new IOException("fdt");
		if ((anInt584 ^ 0xffffffff) == -1) {
			if (aClass23_577.anInt591 == 2)
				throw new IOException("fds");
			if (aClass23_577.anInt591 == 1) {
				aDataInputStream587 = (DataInputStream) aClass23_577.anObject595;
				anInt584 = 1;
			}
		}
		if (i != 1)
			aClass16_583 = null;
		if ((anInt584 ^ 0xffffffff) == -2) {
			int i_2_ = aDataInputStream587.available();
			if (i_2_ > 0) {
				if ((i_2_ + anInt573 ^ 0xffffffff) < -5)
					i_2_ = 4 + -anInt573;
				anInt573 += aDataInputStream587.read(aByteArray582, anInt573,
						i_2_);
				if (anInt573 == 4) {
					int i_3_ = new ByteVector(aByteArray582).getInt();
					anInt584 = 2;
					aByteArray574 = new byte[i_3_];
				}
			}
		}
		if ((anInt584 ^ 0xffffffff) == -3) {
			int i_4_ = aDataInputStream587.available();
			if ((i_4_ ^ 0xffffffff) < -1) {
				if (aByteArray574.length < i_4_ - -anInt572)
					i_4_ = aByteArray574.length + -anInt572;
				anInt572 += aDataInputStream587.read(aByteArray574, anInt572,
						i_4_);
				if (anInt572 == aByteArray574.length)
					return aByteArray574;
			}
		}
		return null;
	}

	public static void method232(int i, Class15 class15, boolean bool,
			Class15 class15_5_) {
		try {
			Class37_Sub4_Sub18.aClass15_2907 = class15;
			Class37_Sub9_Sub24.aClass15_3365 = class15_5_;
			Class79.aBoolean1469 = bool;
			if (i > 123)
				anInt586++;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("ge.A(" + i + ',' + (class15 != null ? "{...}" : "null")
							+ ',' + bool + ','
							+ (class15_5_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method233(boolean bool) {
		anIntArray585 = null;
		aByteArrayArray569 = null;
		aClass16_575 = null;
		if (bool == true) {
			aClass37_Sub4_Sub9_Sub3Array588 = null;
			aClass16_583 = null;
		}
	}

	public static void method234(int i,
			Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2, int i_6_,
			int i_7_) {
		if ((i_6_ & 0x10) != 0) {
			int i_8_ = Class83.byteVector.method952((byte) 45);
			byte[] is = new byte[i_8_];
			ByteVector class37_sub11 = new ByteVector(is);
			Class83.byteVector.method968(0, i_8_, is, (byte)-53);
			Class37_Sub9_Sub15.aClass37_Sub11Array3175[i_7_] = class37_sub11;
			class37_sub4_sub7_sub1_sub2.method509(class37_sub11, 65535);
		}
		anInt589++;
		if ((0x100 & i_6_) != 0) {
			class37_sub4_sub7_sub1_sub2.anInt3636 = Class83.byteVector
					.method984(-1739943584);
			int i_9_ = Class83.byteVector.getInt2(127);
			class37_sub4_sub7_sub1_sub2.anInt3693 = i_9_ >> -292312848;
			class37_sub4_sub7_sub1_sub2.anInt3652 = Class37_Sub7.loopCycle
					+ (i_9_ & 0xffff);
			if (class37_sub4_sub7_sub1_sub2.anInt3636 == 65535)
				class37_sub4_sub7_sub1_sub2.anInt3636 = -1;
			class37_sub4_sub7_sub1_sub2.anInt3664 = 0;
			class37_sub4_sub7_sub1_sub2.anInt3654 = 0;
			if (class37_sub4_sub7_sub1_sub2.anInt3652 > Class37_Sub7.loopCycle)
				class37_sub4_sub7_sub1_sub2.anInt3654 = -1;
		}
		if ((0x1 & i_6_) != 0) {
			class37_sub4_sub7_sub1_sub2.anInt3687 = Class83.byteVector
					.method975(2);
			class37_sub4_sub7_sub1_sub2.anInt3679 = Class83.byteVector
					.method956(2);
		}
		if ((0x40 & i_6_) != 0) {
			class37_sub4_sub7_sub1_sub2.aClass16_3694 = Class83.byteVector
					.getRS2String();
			if ((class37_sub4_sub7_sub1_sub2.aClass16_3694.charAt(0) ^ 0xffffffff) != -127) {
				if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 == class37_sub4_sub7_sub1_sub2)
					Class37_Sub4_Sub7_Sub1_Sub1.method505(
							class37_sub4_sub7_sub1_sub2.aClass16_3993, 2,
							class37_sub4_sub7_sub1_sub2.aClass16_3694);
			} else {
				class37_sub4_sub7_sub1_sub2.aClass16_3694 = class37_sub4_sub7_sub1_sub2.aClass16_3694
						.method158(1, -1);
				Class37_Sub4_Sub7_Sub1_Sub1.method505(
						class37_sub4_sub7_sub1_sub2.aClass16_3993, 2,
						class37_sub4_sub7_sub1_sub2.aClass16_3694);
			}
			class37_sub4_sub7_sub1_sub2.anInt3658 = 0;
			class37_sub4_sub7_sub1_sub2.anInt3673 = 0;
			class37_sub4_sub7_sub1_sub2.anInt3662 = 150;
		}
		if ((i_6_ & 0x8) != 0) {
			int i_10_ = Class83.byteVector.method984(-1739943584);
			int i_11_ = Class83.byteVector.getUnsignedByte();
			if (i_10_ == 65535)
				i_10_ = -1;
			Node.method324(class37_sub4_sub7_sub1_sub2, i_11_, i_10_);
		}
		if ((i_6_ & 0x2) != 0) {
			class37_sub4_sub7_sub1_sub2.anInt3653 = Class83.byteVector
					.getUnsignedShort();
			if (class37_sub4_sub7_sub1_sub2.anInt3653 == 65535)
				class37_sub4_sub7_sub1_sub2.anInt3653 = -1;
		}
		if (i >= 43) {
			if ((i_6_ & 0x4 ^ 0xffffffff) != -1) {
				int i_12_ = Class83.byteVector.getUnsignedByte();
				int i_13_ = Class83.byteVector
						.method952((byte) 3);
				class37_sub4_sub7_sub1_sub2.method496(Class37_Sub7.loopCycle, i_12_, (byte) 109, i_13_);
				class37_sub4_sub7_sub1_sub2.anInt3697 = Class37_Sub7.loopCycle
						- -300;
				class37_sub4_sub7_sub1_sub2.anInt3692 = Class83.byteVector
						.method967(255);
				class37_sub4_sub7_sub1_sub2.anInt3690 = Class83.byteVector
						.getByteC((byte) 25);
			}
			if ((i_6_ & 0x80) != 0) {
				int i_14_ = Class83.byteVector.method956(2);
				int i_15_ = Class83.byteVector
						.method952((byte) -124);
				int i_16_ = Class83.byteVector.method967(255);
				int i_17_ = Class83.byteVector.pos;
				if (class37_sub4_sub7_sub1_sub2.aClass16_3993 != null
						&& class37_sub4_sub7_sub1_sub2.aClass29_3985 != null) {
					boolean bool = false;
					long l = class37_sub4_sub7_sub1_sub2.aClass16_3993
							.method152(-100);
					if (i_15_ <= 1) {
						for (int i_18_ = 0; RSInterface.anInt340 > i_18_; i_18_++) {
							if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_18_] ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
					}
					if (!bool && (Class52_Sub1.anInt2303 ^ 0xffffffff) == -1) {
						Class37_Sub9_Sub13.aClass37_Sub11_3140.pos = 0;
						Class83.byteVector
								.method968(
										0,
										i_16_,
										(Class37_Sub9_Sub13.aClass37_Sub11_3140.buf),
										(byte) -53);
						Class37_Sub9_Sub13.aClass37_Sub11_3140.pos = 0;
						RSString rSString = (Class37_Sub4_Sub9_Sub2
								.method605(Class36.method319(
										Class37_Sub9_Sub13.aClass37_Sub11_3140,
										-53).method150(1)));
						class37_sub4_sub7_sub1_sub2.aClass16_3694 = rSString
								.method151();
						class37_sub4_sub7_sub1_sub2.anInt3658 = i_14_ >> 841995400;
						class37_sub4_sub7_sub1_sub2.anInt3673 = 0xff & i_14_;
						class37_sub4_sub7_sub1_sub2.anInt3662 = 150;
						if ((i_15_ ^ 0xffffffff) != -3
								&& (i_15_ ^ 0xffffffff) != -4) {
							if ((i_15_ ^ 0xffffffff) != -2)
								Class37_Sub4_Sub7_Sub1_Sub1
										.method505(
												class37_sub4_sub7_sub1_sub2.aClass16_3993,
												2, rSString);
							else
								Class37_Sub4_Sub7_Sub1_Sub1
										.method505(
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class32.aClass16_741,
																		(class37_sub4_sub7_sub1_sub2.aClass16_3993) }))),
												1, rSString);
						} else
							Class37_Sub4_Sub7_Sub1_Sub1
									.method505(
											(Class37_Sub9_Sub27
													.method881(
															new RSString[] {
																	Class42.aClass16_917,
																	(class37_sub4_sub7_sub1_sub2.aClass16_3993) })),
											1, rSString);
					}
				}
				Class83.byteVector.pos = i_16_ + i_17_;
			}
			if ((0x200 & i_6_ ^ 0xffffffff) != -1) {
				int i_19_ = Class83.byteVector.method967(255);
				int i_20_ = Class83.byteVector.method967(255);
				class37_sub4_sub7_sub1_sub2.method496(Class37_Sub7.loopCycle,
						i_19_, (byte) 126, i_20_);
				class37_sub4_sub7_sub1_sub2.anInt3697 = Class37_Sub7.loopCycle
						- -300;
				class37_sub4_sub7_sub1_sub2.anInt3692 = Class83.byteVector
						.getUnsignedByte();
				class37_sub4_sub7_sub1_sub2.anInt3690 = Class83.byteVector
						.getUnsignedByte();
			}
			if ((i_6_ & 0x400) != 0) {
				class37_sub4_sub7_sub1_sub2.localX = Class83.byteVector.getByteC((byte) 21);
				class37_sub4_sub7_sub1_sub2.localY = Class83.byteVector.method967(255);
				class37_sub4_sub7_sub1_sub2.newLocationX = Class83.byteVector.method967(255);
				class37_sub4_sub7_sub1_sub2.newLocationY = Class83.byteVector.getByteC((byte) 101);
				class37_sub4_sub7_sub1_sub2.firstDistanceSpeed = (Class83.byteVector.getUnsignedShort() - -Class37_Sub7.loopCycle);
				class37_sub4_sub7_sub1_sub2.secondDistanceSpeed = (Class83.byteVector.method984(-1739943584) + Class37_Sub7.loopCycle);
				class37_sub4_sub7_sub1_sub2.walkingFace = Class83.byteVector.getUnsignedByte();
				class37_sub4_sub7_sub1_sub2.anInt3640 = 0;
				class37_sub4_sub7_sub1_sub2.anInt3645 = 1;
			}
		}
	}

	public Class22(Signlink signlink, URL url) {
		try {
			aClass23_577 = signlink.method1122((byte) -110, url);
			anInt584 = 0;
			aLong571 = 30000L + Class71.method1263();
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("ge.<init>(" + (signlink != null ? "{...}" : "null") + ','
							+ (url != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass16_575 = aClass16_583;
		anInt580 = 0;
	}
}
