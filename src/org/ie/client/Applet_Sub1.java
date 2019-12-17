package org.ie.client;

/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable,
		FocusListener, WindowListener {
	public static int anInt1;
	public static int anInt2;
	public static RSString aClass16_3 = Class37_Sub2.create_rsstring("huffman");
	public static RSString aClass16_4;
	public static int anInt5;
	public static int anInt6;
	public static int anInt7;
	public static int anInt8;
	public static int anInt9;
	public static int anInt10;
	public static int anInt11;
	public static int anInt12;
	public static int anInt13;
	public static int anInt14;
	public static int anInt15;
	public static int anInt16;
	public static int anInt17;
	public static int anInt18;
	public static int anInt19;
	public static int anInt20;
	public boolean aBoolean21 = false;
	public static int anInt22;
	public static int anInt23;
	public static RSString aClass16_24 = Class37_Sub2.create_rsstring("flash2:");
	public static int anInt25;
	public static int anInt26;
	public static int anInt27;
	public static int anInt28;
	public static int anInt29;
	public static int[] anIntArray30;
	public static int anInt31;
	public static int anInt32;
	public static int anInt33;
	public static int anInt34;
	public static RSString aClass16_35;
	public static Class37_Sub4_Sub7_Sub4[] aClass37_Sub4_Sub7_Sub4Array36;
	public static int anInt37;
	public static Class19 aClass19_38;
	public static int anInt39;
	public static int anInt40;
	public static int anInt41;
	public static int anInt42;
	public static boolean aBoolean43;

	public void update(Graphics graphics) {
		paint(graphics);
		anInt29++;
	}

	public void method14(int i) {
		anInt26++;
		if (i < 37)
			paint(null);
		long l = Class71.method1263();
		long l_0_ = Class37_Sub4_Sub2.aLongArray2528[Class85.anInt1555];
		Class37_Sub4_Sub2.aLongArray2528[Class85.anInt1555] = l;
		Class85.anInt1555 = 0x1f & Class85.anInt1555 - -1;
		synchronized (this) {
			Class78.aBoolean1464 = Class37_Sub9_Sub36.aBoolean3576;
		}
		if ((l_0_ ^ 0xffffffffffffffffL) != -1L && l > l_0_) {
			/* empty */
		}
		method19((byte) -98);
	}

	public void windowIconified(WindowEvent windowevent) {
		anInt37++;
	}

	public void stop() {
		anInt7++;
		if (ByteVector.anApplet_Sub1_2023 == this
				&& !Class37_Sub4_Sub7_Sub3.aBoolean3738)
			Class37_Sub4_Sub2.aLong2521 = 4000L + Class71
					.method1263();
	}

	public URL getDocumentBase() {
		anInt1++;
		if (Class36.aFrame797 != null)
			return null;
		if (Class80.aClass51_1508 != null
				&& Class80.aClass51_1508.anApplet1045 != this)
			return Class80.aClass51_1508.anApplet1045.getDocumentBase();
		return super.getDocumentBase();
	}

	public boolean method15(int i) {
		anInt31++;
		return true;
	}

	public String getParameter(String string) {
		anInt41++;
		if (Class36.aFrame797 != null)
			return null;
		if (Class80.aClass51_1508 != null
				&& this != Class80.aClass51_1508.anApplet1045)
			return Class80.aClass51_1508.anApplet1045.getParameter(string);
		return super.getParameter(string);
	}

	public void focusLost(FocusEvent focusevent) {
		Class37_Sub9_Sub36.aBoolean3576 = false;
		anInt25++;
	}

	public void windowClosed(WindowEvent windowevent) {
		anInt33++;
	}

	public AppletContext getAppletContext() {
		anInt6++;
		if (Class36.aFrame797 != null)
			return null;
		if (Class80.aClass51_1508 != null
				&& this != Class80.aClass51_1508.anApplet1045)
			return Class80.aClass51_1508.anApplet1045.getAppletContext();
		return super.getAppletContext();
	}

	public void method16(String string, int i) {
		anInt10++;
		if (!aBoolean21) {
			aBoolean21 = true;
			System.out.println("error_game_" + string);
			try {
				if (i != 1)
					windowOpened(null);
				getAppletContext()
						.showDocument(
								new URL(getCodeBase(),
										("error_game_" + string + ".ws")),
								"_self");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method17(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		anInt27++;
		try {
			if (ByteVector.anApplet_Sub1_2023 != null) {
				Class1.anInt62++;
				if ((Class1.anInt62 ^ 0xffffffff) <= -4)
					method16("alreadyloaded", 1);
				else
					getAppletContext().showDocument(getDocumentBase(), "_self");
			} else {
				Class46.anInt980 = i_1_;
				Class73.anInt1393 = i_3_;
				Class85.anInt1552 = i;
				if (i_4_ != -17)
					windowDeactivated(null);
				ByteVector.anApplet_Sub1_2023 = this;
				if (Class80.aClass51_1508 == null)
					Class43.aClass51_958 = Class80.aClass51_1508 = new Signlink(
							false, this, i_2_, null, 0);
				Class80.aClass51_1508.method1119(this, 1, (byte) 65);
			}
		} catch (Exception exception) {
			Class37_Sub9_Sub3.method768(i_4_ ^ 0x63, null, exception);
			method16("crash", 1);
		}
	}

	public URL getCodeBase() {
		anInt32++;
		if (Class36.aFrame797 != null)
			return null;
		if (Class80.aClass51_1508 != null
				&& Class80.aClass51_1508.anApplet1045 != this)
			return Class80.aClass51_1508.anApplet1045.getCodeBase();
		return super.getCodeBase();
	}

	public void windowDeiconified(WindowEvent windowevent) {
		anInt42++;
	}

	public void run() {
		anInt16++;
		try {
			if (Signlink.aString1039 != null) {
				String string = Signlink.aString1039.toLowerCase();
				if (string.indexOf("sun") == -1
						&& (string.indexOf("apple") ^ 0xffffffff) == 0) {
					if ((string.indexOf("ibm") ^ 0xffffffff) != 0
							&& (Signlink.aString1033 == null || Signlink.aString1033
									.equals("1.4.2"))) {
						method16("wrongjava", 1);
						return;
					}
				} else {
					String string_5_ = Signlink.aString1033;
					if (string_5_.equals("1.1") || string_5_.startsWith("1.1.")
							|| string_5_.equals("1.2")
							|| string_5_.startsWith("1.2.")) {
						method16("wrongjava", 1);
						return;
					}
					Class86.anInt1583 = 5;
				}
			}
			if (Class80.aClass51_1508.anApplet1045 != null) {
				Method method = Signlink.aMethod1044;
				if (method != null) {
					try {
						method.invoke(Class80.aClass51_1508.anApplet1045,
								new Object[] { Boolean.TRUE });
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			}
			method29((byte) 69);
			KeyboardHandler.aClass32_568 = RuntimeException_Sub1.method1342(
					Class73.anInt1393, Class46.anInt980, (byte) 88,
					Class37_Sub9.aCanvas1967);
			method18((byte) -89);
			Class37_Sub9_Sub35.aClass52_3566 = Class37_Sub3_Sub3.method377(121);
			while (Class37_Sub4_Sub2.aLong2521 == 0L
					|| (Class71.method1263() < Class37_Sub4_Sub2.aLong2521)) {
				Class52_Sub1.anInt2305 = Class37_Sub9_Sub35.aClass52_3566
						.method1129((Class86.anInt1583), (byte) 119,
								(Node.anInt815));
				for (int i = 0; (i ^ 0xffffffff) > (Class52_Sub1.anInt2305 ^ 0xffffffff); i++)
					method14(60);
				method30(-10949);
				Class88.method1333((byte) -86, Class37_Sub9.aCanvas1967,
						Class80.aClass51_1508);
			}
		} catch (Exception exception) {
			Class37_Sub9_Sub3.method768(-113, null, exception);
			method16("crash", 1);
		}
		//method28(0);
	}

	public abstract void method18(byte i);

	public abstract void method19(byte i);

	public void start() {
		anInt14++;
		if (this == ByteVector.anApplet_Sub1_2023
				&& !Class37_Sub4_Sub7_Sub3.aBoolean3738)
			Class37_Sub4_Sub2.aLong2521 = 0L;
	}

	public void windowDeactivated(WindowEvent windowevent) {
		anInt5++;
	}

	public void method20(String string, int i, int i_6_, int i_7_, int i_8_,
			int i_9_, byte i_10_) {
		try {
			Class73.anInt1393 = i_9_;
			Class85.anInt1552 = i_8_;
			ByteVector.anApplet_Sub1_2023 = this;
			Class46.anInt980 = i;
			//Class36.aFrame797 = new Frame();
			//Class36.aFrame797.setTitle("474 Client");
			//Class36.aFrame797.setResizable(false);
			//Class36.aFrame797.addWindowListener(this);
			//Class36.aFrame797.setVisible(true);
			//Class36.aFrame797.toFront();
			Insets insets = Class36.aFrame797.getInsets();
			Class36.aFrame797.setSize(insets.right + insets.left + i_9_,
					insets.bottom + insets.top + i);
			Class43.aClass51_958 = Class80.aClass51_1508 = new Signlink(true,
					null, i_7_, string, i_6_);
			Class80.aClass51_1508.method1119(this, 1, (byte) 65);
		} catch (Exception exception) {
			Class37_Sub9_Sub3.method768(-92, null, exception);
		}
		anInt19++;
	}

	public static void method21(Signlink signlink) {
		anInt22++;
		Class43.aClass51_958 = Class80.aClass51_1508 = signlink;
	}

	public void destroy() {
		anInt15++;
		if (this == ByteVector.anApplet_Sub1_2023
				&& !Class37_Sub4_Sub7_Sub3.aBoolean3738) {
			Class37_Sub4_Sub2.aLong2521 = Class71.method1263();
			Class37_Sub9_Sub20.method846(5000L, (byte) 58);
			Class43.aClass51_958 = null;
			method28(0);
		}
	}

	public static void method22(Class15 class15, byte i, Class15 class15_11_) {
		try {
			if (i != 93)
				method22(null, (byte) -4, null);
			Class73.aClass15_1389 = class15;
			Class14.aClass15_237 = class15_11_;
			anInt2++;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("eb.O("
					+ (class15 != null ? "{...}" : "null") + ',' + i + ','
					+ (class15_11_ != null ? "{...}" : "null") + ')'));
		}
	}

	public abstract void method23(int i);

	public static void method24(int i) {
		aClass16_3 = null;
		aClass37_Sub4_Sub7_Sub4Array36 = null;
		int i_12_ = 39 % ((-51 - i) / 49);
		aClass16_35 = null;
		aClass19_38 = null;
		aClass16_24 = null;
		anIntArray30 = null;
		aClass16_4 = null;
	}

	public abstract void init();

	public abstract void method25(int i);

	public static void method26(boolean bool) {
		anInt39++;
		if (!Class19.currentHeldKeyCache[98]) {
			if (Class19.currentHeldKeyCache[99])
				Class20.anInt542 += (-12 - Class20.anInt542) / 2;
			else
				Class20.anInt542 /= 2;
		} else
			Class20.anInt542 += (12 + -Class20.anInt542) / 2;
		Class76.anInt1439 += Class20.anInt542 / 2;
		if (!Class19.currentHeldKeyCache[96]) {
			if (!Class19.currentHeldKeyCache[97])
				OverridedInterface.anInt1890 /= 2;
			else
				OverridedInterface.anInt1890 += (24 - OverridedInterface.anInt1890) / 2;
		} else
			OverridedInterface.anInt1890 += (-OverridedInterface.anInt1890 + -24) / 2;
		if (bool == false) {
			int i = (Class37_Sub9_Sub9.anInt3077 + (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666));
			if ((Class76.anInt1439 ^ 0xffffffff) > -129)
				Class76.anInt1439 = 128;
			if (Class76.anInt1439 > 383)
				Class76.anInt1439 = 383;
			Class37_Sub14.anInt2127 = OverridedInterface.anInt1890 / 2
					+ Class37_Sub14.anInt2127 & 0x7ff;
			int i_13_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 - -Class37_Sub9_Sub23.anInt3358);
			if ((Class37_Sub15.anInt2132 + -i ^ 0xffffffff) > 499
					|| Class37_Sub15.anInt2132 - i > 500
					|| (-i_13_ + Class37_Sub9_Sub23.anInt3356 ^ 0xffffffff) > 499
					|| Class37_Sub9_Sub23.anInt3356 + -i_13_ > 500) {
				Class37_Sub9_Sub23.anInt3356 = i_13_;
				Class37_Sub15.anInt2132 = i;
			}
			int i_14_ = 0;
			if ((Class37_Sub9_Sub23.anInt3356 ^ 0xffffffff) != (i_13_ ^ 0xffffffff))
				Class37_Sub9_Sub23.anInt3356 += (-Class37_Sub9_Sub23.anInt3356 + i_13_) / 16;
			if ((i ^ 0xffffffff) != (Class37_Sub15.anInt2132 ^ 0xffffffff))
				Class37_Sub15.anInt2132 += (-Class37_Sub15.anInt2132 + i) / 16;
			int i_15_ = Class37_Sub15.anInt2132 >> 951067111;
			int i_16_ = Class37_Sub9_Sub23.anInt3356 >> -1427789305;
			int i_17_ = RSString.method153(Class37_Sub9_Sub1.anInt2916,
					Class37_Sub9_Sub23.anInt3356, Class37_Sub15.anInt2132);
			if ((i_15_ ^ 0xffffffff) < -4 && i_16_ > 3
					&& (i_15_ ^ 0xffffffff) > -101 && i_16_ < 100) {
				for (int i_18_ = i_15_ + -4; (4 + i_15_ ^ 0xffffffff) <= (i_18_ ^ 0xffffffff); i_18_++) {
					for (int i_19_ = -4 + i_16_; 4 + i_16_ >= i_19_; i_19_++) {
						int i_20_ = Class37_Sub9_Sub1.anInt2916;
						if ((i_20_ ^ 0xffffffff) > -4
								&& (Class1.aByteArrayArrayArray63[1][i_18_][i_19_] & 0x2) == 2)
							i_20_++;
						int i_21_ = i_17_
								- (Class64.anIntArrayArrayArray1217[i_20_][i_18_][i_19_]);
						if (i_21_ > i_14_)
							i_14_ = i_21_;
					}
				}
			}
			int i_22_ = 192 * i_14_;
			if ((i_22_ ^ 0xffffffff) < -98049)
				i_22_ = 98048;
			if (i_22_ < 32768)
				i_22_ = 32768;
			if (Class37_Sub9_Sub8.anInt3051 >= i_22_) {
				if ((Class37_Sub9_Sub8.anInt3051 ^ 0xffffffff) < (i_22_ ^ 0xffffffff))
					Class37_Sub9_Sub8.anInt3051 += (i_22_ - Class37_Sub9_Sub8.anInt3051) / 80;
			} else
				Class37_Sub9_Sub8.anInt3051 += (-Class37_Sub9_Sub8.anInt3051 + i_22_) / 24;
		}
	}

	public void windowOpened(WindowEvent windowevent) {
		anInt18++;
	}

	public synchronized void paint(Graphics graphics) {
		anInt11++;
		if (this == ByteVector.anApplet_Sub1_2023
				&& !Class37_Sub4_Sub7_Sub3.aBoolean3738) {
			Class4.aBoolean93 = true;
			if (Signlink.aString1033 != null
					&& Signlink.aString1033.startsWith("1.5")
					&& (-Class49.aLong1003 + Class71.method1263() > 1000L)) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null
						|| (Class73.anInt1393 <= rectangle.width && (rectangle.height ^ 0xffffffff) <= (Class46.anInt980 ^ 0xffffffff)))
					Class37_Sub9_Sub24.aBoolean3376 = true;
			}
		}
	}

	public void focusGained(FocusEvent focusevent) {
		anInt23++;
		Class37_Sub9_Sub36.aBoolean3576 = true;
		Class4.aBoolean93 = true;
	}

	public void windowClosing(WindowEvent windowevent) {
		destroy();
		anInt9++;
	}

	public abstract void method27(int i);

	public synchronized void method28(int i) {
		anInt34++;
		if (!Class37_Sub4_Sub7_Sub3.aBoolean3738) {
			Class37_Sub4_Sub7_Sub3.aBoolean3738 = true;
			if (i == 0) {
				try {
					Class37_Sub9.aCanvas1967.removeFocusListener(this);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					method27(-14749);
				} catch (Exception exception) {
					/* empty */
				}
				if (Class36.aFrame797 != null) {
					try {
						System.exit(0);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				if (Class80.aClass51_1508 != null) {
					try {
						Class80.aClass51_1508.method1125((byte) -111);
					} catch (Exception exception) {
						/* empty */
					}
				}
				method25(43594);
			}
		}
	}

	public synchronized void method29(byte i) {
		Container container;
		if (Class36.aFrame797 != null)
			container = Class36.aFrame797;
		else
			container = Class80.aClass51_1508.anApplet1045;
		if (Class37_Sub9.aCanvas1967 != null) {
			Class37_Sub9.aCanvas1967.removeFocusListener(this);
			container.remove(Class37_Sub9.aCanvas1967);
		}
		Class37_Sub9.aCanvas1967 = new Canvas_Sub1(this);
		anInt40++;
		container.add(Class37_Sub9.aCanvas1967);
		Class37_Sub9.aCanvas1967.setSize(Class73.anInt1393, Class46.anInt980);
		Class37_Sub9.aCanvas1967.setVisible(true);
		if (Class36.aFrame797 != null) {
			Insets insets = Class36.aFrame797.getInsets();
			Class37_Sub9.aCanvas1967.setLocation(insets.left, insets.top);
		} else
			Class37_Sub9.aCanvas1967.setLocation(0, 0);
		Class37_Sub9.aCanvas1967.addFocusListener(this);
		Class37_Sub9.aCanvas1967.requestFocus();
		Class4.aBoolean93 = true;
		int i_23_ = 114 / ((7 - i) / 37);
		Class37_Sub9_Sub24.aBoolean3376 = false;
		Class49.aLong1003 = Class71.method1263();
	}

	public void windowActivated(WindowEvent windowevent) {
		anInt17++;
	}

	public void method30(int i) {
		long l = Class37_Sub4_Sub5.aLongArray2602[Class64.anInt1214];
		if (i != -10949)
			method25(82);
		anInt28++;
		long l_24_ = Class71.method1263();
		Class37_Sub4_Sub5.aLongArray2602[Class64.anInt1214] = l_24_;
		Class64.anInt1214 = 1 + Class64.anInt1214 & 0x1f;
		if ((l ^ 0xffffffffffffffffL) != -1L && l < l_24_) {
			int i_25_ = (int) (-l + l_24_);
			anInt13 = ((i_25_ >> -1925959967) + 32000) / i_25_;
		}
		if ((Class37_Sub1.anInt1806++ ^ 0xffffffff) < -51) {
			Class4.aBoolean93 = true;
			Class37_Sub1.anInt1806 -= 50;
			Class37_Sub9.aCanvas1967.setSize(Class73.anInt1393,
					Class46.anInt980);
			Class37_Sub9.aCanvas1967.setVisible(true);
			//if (Class36.aFrame797 == null)
				Class37_Sub9.aCanvas1967.setLocation(0, 0);
			//else {
			//	Insets insets = Class36.aFrame797.getInsets();
			//	Class37_Sub9.aCanvas1967.setLocation(insets.left, insets.top);
			//}
		}
		method23(22001);
	}

	static {
		aClass16_4 = aClass16_24;
		anInt13 = 0;
		anInt8 = 0;
		aClass37_Sub4_Sub7_Sub4Array36 = new Class37_Sub4_Sub7_Sub4[4];
		anIntArray30 = new int[1000];
		aClass16_35 = aClass16_24;
	}
}
