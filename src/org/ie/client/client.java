package org.ie.client;

/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.util.GregorianCalendar;

import javax.swing.JPanel;

public class client extends Applet_Sub1 {
	public static int anInt1717;
	public static int anInt1718;
	public static int anInt1719;
	public static int anInt1720;
	public static RSString aClass16_1721;
	public static RSString aClass16_1722 = Class37_Sub2.create_rsstring("cross");
	public static int anInt1723;
	public static int anInt1724;
	public static int anInt1725;
	public static int anInt1726;
	public static RSString aClass16_1727;
	public static Cache aClass65_1728;
	public static int anInt1729;
	public static int anInt1730;
	public static int anInt1731;
	public static int anInt1732;
	public static int anInt1733;
	public static int anInt1734;
	public static boolean aBoolean1735;

	public void method31(int i, boolean bool) {
		if (bool != true)
			method27(112);
		Class37_Sub9_Sub20.aClass19_3298 = null;
		anInt1726++;
		Class72.anInt1376++;
		if ((Class37_Sub4_Sub7_Sub1.anInt3700 ^ 0xffffffff) != (Class37_Sub9_Sub31.anInt3490 ^ 0xffffffff))
			Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
		else
			Class37_Sub4_Sub7_Sub1.anInt3700 = Class22.anInt581;
		Class37_Sub9_Sub20.aClass23_3281 = null;
		Class35.anInt782 = 0;
		if (Class72.anInt1376 < 2 || i != 7 && i != 9) {
			if (Class72.anInt1376 >= 2 && i == 6) {
				this.method16("js5connect_outofdate", 1);
				Class32.anInt740 = 1000;
			} else if (Class72.anInt1376 >= 4) {
				if (Class32.anInt740 > 5)
					Class37_Sub12.anInt2087 = 3000;
				else {
					this.method16("js5connect", 1);
					Class32.anInt740 = 1000;
				}
			}
		} else if ((Class32.anInt740 ^ 0xffffffff) < -6)
			Class37_Sub12.anInt2087 = 3000;
		else {
			this.method16("js5connect_full", 1);
			Class32.anInt740 = 1000;
		}
	}
	
	public client(JPanel pane) {
		Class36.aFrame797 = pane;
	}

	public void method18(byte i) {
		anInt1732++;
		if ((Class37_Sub9_Sub36.anInt3579 ^ 0xffffffff) != -2) {
			Class37_Sub4_Sub7_Sub1.aShortArrayArray3702 = Class36.aShortArrayArray808;
			Class37_Sub17.aShortArrayArray2159 = ClientScriptDef.aShortArrayArray2612;
			RSItem.aShortArray2491 = Class84.aShortArray1524;
			Class35.aShortArray789 = Class37_Sub4_Sub5.aShortArray2603;
		} else {
			Class37_Sub4_Sub7_Sub1.aShortArrayArray3702 = Class37_Sub2.aShortArrayArray1822;
			RSItem.aShortArray2491 = Class37_Sub9_Sub8.aShortArray3048;
			Class37_Sub17.aShortArrayArray2159 = Class37_Sub25.aShortArrayArray2280;
			Class35.aShortArray789 = Class44.aShortArray966;
		}
		Class37_Sub9_Sub31.anInt3490 = ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) == -1 ? 43594
				: 40000 + Class37_Sub9_Sub19.anInt3272);
		Class22.anInt581 = (Class37_Sub9_Sub17.anInt3219 == 0 ? 443
				: Class37_Sub9_Sub19.anInt3272 + 50000);
		Class37_Sub4_Sub7_Sub1.anInt3700 = Class37_Sub9_Sub31.anInt3490;
		Class38.method1056(true);
		Class37_Sub9_Sub32.method898(i ^ ~0x58, Class37_Sub9.aCanvas1967);
		Class14.method107(89, Class37_Sub9.aCanvas1967);
		if (i == -89) {
			Class24.aClass45_604 = NodeSub.method433((byte) 70);
			if (Class24.aClass45_604 != null)
				Class24.aClass45_604.method1100(Class37_Sub9.aCanvas1967,
						(byte) 92);
			Class88.anInt1595 = Signlink.anInt1041;
			try {
				if (Class80.aClass51_1508.aClass70_1034 != null) {
					Deque.aClass42_1109 = new Class42(
							Class80.aClass51_1508.aClass70_1034, 5200, 0);
					for (int i_0_ = 0; i_0_ < 16; i_0_++)
						Class37_Sub4_Sub7_Sub1.aClass42Array3699[i_0_] = new Class42(
								(Class80.aClass51_1508.aClass70Array1046[i_0_]),
								6000, 0);
					Class37_Sub23.aClass42_2224 = new Class42(
							Class80.aClass51_1508.aClass70_1042, 6000, 0);
					Class10.aClass69_199 = new Class69(255,
							Deque.aClass42_1109, Class37_Sub23.aClass42_2224,
							500000);
					Class71.aClass42_1363 = new Class42(
							Class80.aClass51_1508.aClass70_1037, 24, 0);
					Class80.aClass51_1508.aClass70_1037 = null;
					Class80.aClass51_1508.aClass70_1034 = null;
					Class80.aClass51_1508.aClass70_1042 = null;
					Class80.aClass51_1508.aClass70Array1046 = null;
				}
			} catch (IOException ioexception) {
				Class71.aClass42_1363 = null;
				Deque.aClass42_1109 = null;
				Class10.aClass69_199 = null;
				Class37_Sub23.aClass42_2224 = null;
			}
			if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1)
				Class64.aBoolean1216 = true;
		}
	}

	public void method19(byte i) {
		Class37_Sub7.loopCycle++;
		anInt1729++;
		if (Class37_Sub7.loopCycle % 1000 == 1) {
			GregorianCalendar gregoriancalendar = new GregorianCalendar();
			Class39.anInt874 = (gregoriancalendar.get(11) * 600
					- -(10 * gregoriancalendar.get(12)) + gregoriancalendar
					.get(13) / 6);
			Class33.aRandom751.setSeed((long) Class39.anInt874);
		}
		//method33(1000);
		Class22.method229(true);
		Class17.method182(false);
		Class72.method1267(2);
		Class37_Sub4_Sub13.method707(i ^ ~0x11);
		Class37_Sub9_Sub14.handleMouse();
		if (i != -98)
			aClass16_1722 = null;
		if (Class24.aClass45_604 != null) {
			int i_1_ = Class24.aClass45_604.method1098(0);
			Class37_Sub4_Sub7_Sub1_Sub1.scrollModifier = i_1_;
		}
		if ((Class32.anInt740 ^ 0xffffffff) != -1) {
			if ((Class32.anInt740 ^ 0xffffffff) == -6) {
				Class37_Sub9_Sub15.method823(this, 0);
				Class43.method1089(600);
				Class37_Sub1.method329(i ^ 0x1c28);
			} else if (Class32.anInt740 == 10)
				Class37_Sub9_Sub15.method823(this, 0);
			else if (Class32.anInt740 != 20) {
				if (Class32.anInt740 == 25)
					Deque.method1148((byte) 114);
			} else {
				Class37_Sub9_Sub15.method823(this, 0);
				Class35.method315(-21482);
			}
		} else {
			Class43.method1089(600);
			Class37_Sub1.method329(i + -7144);
		}
		if (Class32.anInt740 != 30) {
			if (Class32.anInt740 == 40)
				Class35.method315(i + -21384);
		} else
			Class42.gameLoop(0);
	}

	public static void method32(byte i) {
		aClass65_1728 = null;
		aClass16_1721 = null;
		if (i == 103) {
			aClass16_1722 = null;
			aClass16_1727 = null;
		}
	}

	public static void main(String[] strings) {
		try {
			if ((strings.length ^ 0xffffffff) != -8)
				Class37_Sub17.method1014(20);
			Class37_Sub9_Sub19.anInt3272 = Integer.parseInt(strings[0]);
			if (!strings[1].equals("live")) {
				if (!strings[1].equals("office")) {
					if (!strings[1].equals("local"))
						Class37_Sub17.method1014(20);
					else
						Class37_Sub9_Sub17.anInt3219 = 2;
				} else
					Class37_Sub9_Sub17.anInt3219 = 1;
			} else
				Class37_Sub9_Sub17.anInt3219 = 0;
			if (!strings[2].equals("live")) {
				if (strings[2].equals("rc"))
					Class37_Sub9_Sub13.anInt3141 = 1;
				else if (!strings[2].equals("wip"))
					Class37_Sub17.method1014(20);
				else
					Class37_Sub9_Sub13.anInt3141 = 2;
			} else
				Class37_Sub9_Sub13.anInt3141 = 0;
			if (strings[3].equals("lowmem"))
				InterfaceListener.method746((byte) 119);
			else if (!strings[3].equals("highmem"))
				Class37_Sub17.method1014(20);
			else
				Class71.method1262((byte) 74);
			if (!strings[4].equals("free")) {
				if (!strings[4].equals("members"))
					Class37_Sub17.method1014(20);
				else
					Class37_Sub4_Sub13.aBoolean2791 = true;
			} else
				Class37_Sub4_Sub13.aBoolean2791 = false;
			if (strings[5].equals("english"))
				Class37_Sub9_Sub25.anInt3382 = 0;
			else if (!strings[5].equals("german"))
				Class37_Sub17.method1014(20);
			else {
				Class37_Sub18.method1016((byte) 74);
				Class37_Sub9_Sub8.aClass16_3056 = Cache.aClass16_1225;
				Class37_Sub9_Sub25.anInt3382 = 1;
			}
			if (!strings[6].equals("game0")) {
				if (strings[6].equals("game1"))
					Class37_Sub9_Sub36.anInt3579 = 1;
				else
					Class37_Sub17.method1014(20);
			} else
				Class37_Sub9_Sub36.anInt3579 = 0;
			InterfaceListener.aString1940 = Signlink.serverIp; //89.46.37.214
			
			//client var_client = new client();
			//var_client.method20("runescape", 503, 16,
			//		Class37_Sub9_Sub13.anInt3141 + 32, 474, 765, (byte) -72);
			//Class36.aFrame797.setLocation(40, 40);
		} catch (Exception exception) {
			Class37_Sub9_Sub3.method768(-49, null, exception);
		}
		anInt1720++;
	}

	public void method33(int i) {
		anInt1723++;
		//if (Class32.anInt740 != i) {
			boolean bool = Class37_Sub9_Sub9.method802(i ^ 0x621b);
		//	if (!bool)
		//		method34((byte) -90);
		//}
	}

	public void init() {
		anInt1733++;
		if (this.method15(11641)) {
			Class37_Sub9_Sub19.anInt3272 = Integer.parseInt(this
					.getParameter("worldid"));
			Class37_Sub9_Sub13.anInt3141 = Integer.parseInt(this
					.getParameter("modewhat"));
			Class37_Sub9_Sub17.anInt3219 = Integer.parseInt(this
					.getParameter("modewhere"));
			String string = this.getParameter("lowmem");
			if (string == null || !string.equals("1"))
				Class71.method1262((byte) 74);
			else
				InterfaceListener.method746((byte) -39);
			String string_2_ = this.getParameter("members");
			if (string_2_ == null || !string_2_.equals("1"))
				Class37_Sub4_Sub13.aBoolean2791 = false;
			else
				Class37_Sub4_Sub13.aBoolean2791 = true;
			String string_3_ = this.getParameter("lang");
			if (string_3_ != null && string_3_.equals("1")) {
				Class37_Sub18.method1016((byte) 74);
				Class37_Sub9_Sub25.anInt3382 = 1;
				Class37_Sub9_Sub8.aClass16_3056 = Cache.aClass16_1225;
			}
			String string_4_ = this.getParameter("game");
			if (string_4_ == null || !string_4_.equals("1"))
				Class37_Sub9_Sub36.anInt3579 = 0;
			else
				Class37_Sub9_Sub36.anInt3579 = 1;
			try {
				Class37_Sub11_Sub1.anInt3610 = Integer.parseInt(this
						.getParameter("js"));
				Class10.anInt193 = Integer.parseInt(this.getParameter("plug"));
			} catch (Exception exception) {
				/* empty */
			}
			InterfaceListener.aString1940 = this.getCodeBase().getHost();
			this.method17(474, 503, Class37_Sub9_Sub13.anInt3141 + 32, 765,
					(byte) -17);
		}
	}

	public void method34(byte i) {
		anInt1718++;
		if (Class37_Sub25.anInt2290 >= 4) {
			this.method16("js5crc", 1);
			Class32.anInt740 = 1000;
		} else {
			if (Class37_Sub4_Sub12.anInt2785 >= 4) {
				if (Class32.anInt740 <= 5) {
					this.method16("js5io", 1);
					Class32.anInt740 = 1000;
					return;
				}
				Class37_Sub4_Sub12.anInt2785 = 3;
				Class37_Sub12.anInt2087 = 3000;
			}
			if ((Class37_Sub12.anInt2087-- ^ 0xffffffff) >= -1) {
				do {
					try {
						if (Class35.anInt782 == 0) {
							Class37_Sub9_Sub20.aClass23_3281 = (Class80.aClass51_1508
									.method1117(InterfaceListener.aString1940,
											Class37_Sub4_Sub7_Sub1.anInt3700,
											true));
							Class35.anInt782++;
						}
						if (i < -76) {
							if (Class35.anInt782 == 1) {
								if (Class37_Sub9_Sub20.aClass23_3281.anInt591 == 2) {
									method31(-1, true);
									break;
								}
								if ((Class37_Sub9_Sub20.aClass23_3281.anInt591 ^ 0xffffffff) == -2)
									Class35.anInt782++;
							}
							if (Class35.anInt782 == 2) {
								Class37_Sub9_Sub20.aClass19_3298 = new Class19(
										(Socket) (Class37_Sub9_Sub20.aClass23_3281.anObject595),
										Class80.aClass51_1508);
								ByteVector class37_sub11 = new ByteVector(
										5);
								class37_sub11.method964(110, 15);
								class37_sub11.method947(474);
								Class37_Sub9_Sub20.aClass19_3298.method204(0,
										(byte) 99,
										class37_sub11.buf, 5);
								Class35.anInt782++;
								Class80.aLong1505 = Class71
										.method1263();
							}
							if ((Class35.anInt782 ^ 0xffffffff) == -4) {
								if (Class32.anInt740 <= 5
										|| (Class37_Sub9_Sub20.aClass19_3298
												.method206(-107) ^ 0xffffffff) < -1) {
									int i_5_ = Class37_Sub9_Sub20.aClass19_3298
											.method205(false);
									if ((i_5_ ^ 0xffffffff) != -1) {
										method31(i_5_, true);
										break;
									}
									Class35.anInt782++;
								} else if (((-Class80.aLong1505 + Class71
										.method1263()) ^ 0xffffffffffffffffL) < -30001L) {
									method31(-2, true);
									break;
								}
							}
							if (Class35.anInt782 != 4)
								break;
							Class64.method1175(
									(Class37_Sub9_Sub20.aClass19_3298), 0,
									((Class32.anInt740 ^ 0xffffffff) < -21));
							Class35.anInt782 = 0;
							Class37_Sub9_Sub20.aClass23_3281 = null;
							Class72.anInt1376 = 0;
							Class37_Sub9_Sub20.aClass19_3298 = null;
						}
					} catch (IOException ioexception) {
						method31(-3, true);
						break;
					}
					break;
				} while (false);
			}
		}
	}

	public void method27(int i) {
		if (i != -14749)
			anInt1719 = -7;
		anInt1725++;
		if (Class37_Sub9_Sub27.aClass55_3417 != null)
			Class37_Sub9_Sub27.aClass55_3417.aBoolean1072 = false;
		Class37_Sub9_Sub27.aClass55_3417 = null;
		if (Applet_Sub1.aClass19_38 != null) {
			Applet_Sub1.aClass19_38.method209((byte) -128);
			Applet_Sub1.aClass19_38 = null;
		}
		Class33.method305(true);
		Class37_Sub3_Sub1.method347(i ^ 0x39f4);
		Class24.aClass45_604 = null;
		if (Class88.aClass24_1605 != null)
			Class88.aClass24_1605.method235(-127);
		if (Class37_Sub4_Sub7.aClass24_2638 != null)
			Class37_Sub4_Sub7.aClass24_2638.method235(-120);
		Class37_Sub4_Sub10.method678(17242);
		Class37_Sub9_Sub26.method876((byte) 84);
		do {
			try {
				if (Deque.aClass42_1109 != null)
					Deque.aClass42_1109.method1079(i ^ ~0x399c);
				if (Class37_Sub4_Sub7_Sub1.aClass42Array3699 != null) {
					for (int i_6_ = 0; ((Class37_Sub4_Sub7_Sub1.aClass42Array3699.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
						if (Class37_Sub4_Sub7_Sub1.aClass42Array3699[i_6_] != null)
							Class37_Sub4_Sub7_Sub1.aClass42Array3699[i_6_]
									.method1079(0);
					}
				}
				if (Class37_Sub23.aClass42_2224 != null)
					Class37_Sub23.aClass42_2224.method1079(0);
				if (Class71.aClass42_1363 == null)
					break;
				Class71.aClass42_1363.method1079(0);
			} catch (IOException ioexception) {
				break;
			}
			break;
		} while (false);
	}

	public void method25(int i) {
		method32((byte) 103);
		RSString.method146((byte) 74);
		Applet_Sub1.method24(-110);
		Class52.method1128(-71);
		Class32.method288(20);
		anInt1730++;
		Class55.method1142((byte) -67);
		ByteVector.method985(false);
		Class19.method207(-3);
		Class15_Sub1.method138(11729);
		Class42.method1086((byte) -120);
		Class69.method1251(false);
		Class37_Sub4_Sub7_Sub1_Sub1.method504(1954378439);
		Class37_Sub11_Sub1.method995(-128);
		Class67.method1237();
		Class20.method220(1);
		RSInterface.method189(i ^ ~0xaa12);
		Class37_Sub4_Sub7_Sub1_Sub2.method508((byte) 119);
		Deque.method1160(8);
		Hashtable.method99(true);
		Class45.method1101(0);
		Class37_Sub18.method1015(-22126);
		Class62.method1170(-127);
		Class24.method250((byte) 96);
		Class30.method276((byte) -107);
		Class29.method269((byte) 55);
		Class37_Sub4_Sub12.method703((byte) -36);
		Class37_Sub4_Sub7_Sub1.method500((byte) -61);
		Class37_Sub2.method333(true);
		Class37_Sub4_Sub15.method713((byte) -26);
		OverridedInterface.method739(0);
		Node.method327(-23867);
		Class4.method49(i + -43587);
		Class88.method1334(false);
		Cache.method1178(115);
		Class37_Sub4_Sub7_Sub6.method554();
		Class37_Sub4_Sub7_Sub4.method522();
		Class36.method320((byte) -27);
		RuntimeException_Sub1.method1341(-1);
		Class44.method1094(i ^ ~0xdbe7);
		Class37_Sub17.method1012(i + -43592);
		Class27.method260((byte) -73);
		Class79.method1297((byte) 58);
		Class37_Sub4_Sub7.method488(-98);
		Class75.method1282(0);
		Class41.method1073(-6321);
		Class39.method1058(i + -43598);
		Class50.method1114(false);
		Class63.method1174();
		Class81.method1302((byte) 113);
		Class54.method1138(false);
		KeyboardHandler.method228(i + -43594);
		MouseHandler.method81();
		Class71.method1261(-19);
		Class8.method80(-55);
		Class2.method44(0);
		Class15.method133(107);
		Class37_Sub3_Sub3.method367(23171);
		Class73.method1271(true);
		Class57.method1147(-10);
		Class22.method233(true);
		Class56.method1145((byte) 125);
		Class47.method1110(2);
		Class87.method1326(true);
		Class1.method41(-1788);
		Queue.method1292(i + -43570);
		Class37_Sub4_Sub13.method706(-4587);
		Class60.method1167(i ^ 0xcb2e);
		Class6.method59(1000000);
		Class59.method1163((byte) 0);
		Graphics2D.method582();
		NodeSub.method435(8);
		Rasterizer.method657();
		Class37_Sub12.method999(16491);
		Class7.method70();
		Class37_Sub3_Sub1.method345(-26088);
		Class37_Sub15.method1006(true);
		Class3.method47((byte) -27);
		Class37_Sub4_Sub8.method576(-50);
		Class37_Sub4_Sub3.method465(122);
		Class37_Sub4_Sub4.method474(true);
		Class37_Sub4_Sub11.method684(6989);
		RSItem.method446(-21294);
		Class37_Sub4_Sub16.method723((byte) -46);
		Class37_Sub4_Sub18.method729(-6);
		Class37_Sub4_Sub5.method486((byte) 103);
		Class37_Sub4_Sub14.method711(500);
		InventoryDef.method728((byte) 92);
		Class37_Sub4_Sub10.method675(50);
		Class37_Sub4_Sub9_Sub2.method613();
		Class82.method1307(-105);
		Class37_Sub4_Sub2.method460(-124);
		Class14.method104((byte) 60);
		Class64.method1176((byte) 25);
		Class43.method1093(20);
		Class84.method1315((byte) -15);
		Class37_Sub13.method1002(-108);
		Class37_Sub7.method743((byte) -117);
		ClientScriptDef.method487(true);
		Class25.method254(-84);
		Class72.method1269(78);
		InterfaceListener.method748(-1);
		Class35.method314(-9);
		Class78.method1294(false);
		Class5.method54();
		Class37_Sub4_Sub7_Sub6_Sub1.method560();
		Class37_Sub4_Sub7_Sub2.method512(i ^ 0xaa4b);
		Class37_Sub4_Sub7_Sub7.method569(6237);
		InterfaceClickMask.method925((byte) 19);
		Class37_Sub4_Sub7_Sub3.method517((byte) 59);
		Class37_Sub4_Sub7_Sub5.method541(-1159911866);
		Class37_Sub1.method331(true);
		Class83.method1313(i ^ 0xaa03);
		Canvas_Sub1.method36(81);
		Class86.method1324((byte) -108);
		Class52_Sub1.method1133(i + -43671);
		Class32_Sub1.method296((byte) -78);
		Class68.method1246((byte) 124);
		if (i == 43594) {
			Class76.method1283(2);
			Class10.method84(74);
			Class26.method256(28345);
			Class89.method1335(0);
			Class24_Sub1.method251();
			Class34.method307();
			Class46.method1103(false);
			Class61.method1169();
			Class37_Sub25.method1047((byte) 121);
			Class37_Sub5.method737(72);
			Class31.method278();
			Class37_Sub23.method1029(true);
			Class66.method1187(-1);
			Class37_Sub24.method1034();
			Class40.method1066();
			Class49.method1112(-193);
			Class17.method187(false);
			Class37_Sub9.method749(17106);
			Class37_Sub20.method1023(-14813);
			Class80.method1301(i + -43561);
			Class37_Sub9_Sub14.method819(4096);
			Class33.method304(i ^ 0xaa75);
			Class38.method1051(-125);
			Class37_Sub9_Sub21.method856((byte) 126);
			Class37_Sub9_Sub37.method921(-107);
			Class37_Sub9_Sub7.method789(124);
			Class37_Sub9_Sub25.method872(false);
			Class37_Sub9_Sub35.method915(-10453);
			Class37_Sub9_Sub4.method777(-90);
			Class37_Sub9_Sub18.method835((byte) -107);
			Class37_Sub9_Sub31.method896((byte) 28);
			Class37_Sub9_Sub29.method890(96);
			Class37_Sub9_Sub15.method825(i + -35989);
			Class37_Sub9_Sub27.method878((byte) 94);
			Class37_Sub9_Sub13.method816(i + -43591);
			Class37_Sub9_Sub28.method887(101);
			Class37_Sub9_Sub11.method809(103);
			Class37_Sub9_Sub33.method904(-1);
			Class37_Sub9_Sub19.method839((byte) 80);
			Class37_Sub9_Sub34.method911((byte) -76);
			Class37_Sub9_Sub24.method867(false);
			Class37_Sub9_Sub20.method849((byte) -86);
			Class37_Sub9_Sub10.method804(-83);
			Class37_Sub9_Sub9.method801((byte) 62);
			Class37_Sub9_Sub1.method763((byte) -22);
			Class37_Sub9_Sub26.method877((byte) -57);
			Class37_Sub9_Sub32.method897(50);
			Class37_Sub9_Sub22.method863(206);
			Class37_Sub9_Sub17.method833(4096);
			Class37_Sub9_Sub36.method917(32258);
			Class37_Sub9_Sub8.method796(i ^ 0xaa27);
			Class37_Sub9_Sub5.method780(-84);
			Class37_Sub9_Sub3.method769(-1950612276);
			Class37_Sub9_Sub6.method784(125);
			Class37_Sub9_Sub2.method766(i + -43562);
			Class37_Sub9_Sub16.method830(-13207);
			Class37_Sub9_Sub23.method866((byte) -122);
			Class37_Sub9_Sub30.method894(2048);
			Class37_Sub9_Sub12.method811((byte) -126);
			Class37_Sub14.method1003((byte) -111);
			Class37_Sub16.method1010((byte) -33);
		}
	}

	public static String method35(int i, Throwable throwable)
			throws IOException {
		String string;
		if (!(throwable instanceof RuntimeException_Sub1))
			string = "";
		else {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			throwable = runtimeexception_sub1.aThrowable1627;
			string = runtimeexception_sub1.aString1625 + " | ";
		}
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		anInt1717++;
		int i_7_ = 38 / ((-7 - i) / 58);
		String string_8_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(
				string_8_));
		String string_9_ = bufferedreader.readLine();
		for (;;) {
			String string_10_ = bufferedreader.readLine();
			if (string_10_ == null)
				break;
			int i_11_ = string_10_.indexOf('(');
			int i_12_ = string_10_.indexOf(')', i_11_ - -1);
			if (i_11_ >= 0 && i_12_ >= 0) {
				String string_13_ = string_10_.substring(1 + i_11_, i_12_);
				int i_14_ = string_13_.indexOf(".java:");
				if (i_14_ >= 0) {
					string_13_ = (string_13_.substring(0, i_14_) + string_13_
							.substring(5 + i_14_));
					string += string_13_ + ' ';
					continue;
				}
				string_10_ = string_10_.substring(0, i_11_);
			}
			string_10_ = string_10_.trim();
			string_10_ = string_10_.substring(1 + string_10_.lastIndexOf(' '));
			string_10_ = string_10_.substring(1 + string_10_.lastIndexOf('\t'));
			string += string_10_ + ' ';
		}
		string += "| " + (String) string_9_;
		return string;
	}

	public void method23(int i) {
		anInt1731++;
		if (i != 22001)
			method32((byte) -88);
		boolean bool = Class37_Sub9_Sub11.method807((byte) 22);
		if (bool && Class55.aBoolean1071 && Class88.aClass24_1605 != null)
			Class88.aClass24_1605.method242((byte) 101);
		if (Class37_Sub9_Sub24.aBoolean3376) {
			Class37_Sub3_Sub1.method348(-1, Class37_Sub9.aCanvas1967);
			Class6.method60(i ^ 0x57a0, Class37_Sub9.aCanvas1967);
			if (Class24.aClass45_604 != null)
				Class24.aClass45_604.method1096(i + -21984,
						Class37_Sub9.aCanvas1967);
			this.method29((byte) -84);
			Class37_Sub9_Sub32.method898(i ^ 0x55f1, Class37_Sub9.aCanvas1967);
			Class14.method107(100, Class37_Sub9.aCanvas1967);
			if (Class24.aClass45_604 != null)
				Class24.aClass45_604.method1100(Class37_Sub9.aCanvas1967,
						(byte) 123);
		}
		if (Class32.anInt740 == 0)
			Class72.method1270(Class37_Sub9_Sub33.aClass16_3522, null, i
					+ -22000, Class37_Sub9_Sub27.anInt3400);
		else if ((Class32.anInt740 ^ 0xffffffff) == -6)
			Class37_Sub9_Sub6.method786(
					(NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848),
					(Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724),
					(byte) 69);
		else if (Class32.anInt740 != 10) {
			if ((Class32.anInt740 ^ 0xffffffff) == -21)
				Class37_Sub9_Sub6
						.method786(
								NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848,
								Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724,
								(byte) 69);
			else if ((Class32.anInt740 ^ 0xffffffff) == -26) {
				/*if ((Class37_Sub9_Sub31.anInt3487 ^ 0xffffffff) != -2) {
					if (Class37_Sub9_Sub31.anInt3487 == 2) {
						if (Class76.anInt1437 > Class37_Sub4_Sub7_Sub1_Sub1.anInt3942)
							Class37_Sub4_Sub7_Sub1_Sub1.anInt3942 = Class76.anInt1437;
						int i_15_ = ((50 * (Class37_Sub4_Sub7_Sub1_Sub1.anInt3942 - Class76.anInt1437) / Class37_Sub4_Sub7_Sub1_Sub1.anInt3942) + 50);
						Class79.method1298((Class37_Sub9_Sub27.method881(-128,
								(new RSString[] {
										Class37_Sub4_Sub18.aClass16_2908,
										Class87.aClass16_1592,
										Class37_Sub9_Sub24.method870(i_15_,
												(byte) -114),
										Class50.aClass16_1011 }))), false, 1);
					} else
						Class79.method1298(Class37_Sub4_Sub18.aClass16_2908,
								false, 1);
				} else {
					if (Class37_Sub9_Sub3.anInt2954 < anInt1734)
						Class37_Sub9_Sub3.anInt2954 = anInt1734;
					int i_16_ = (50 * (Class37_Sub9_Sub3.anInt2954 + -anInt1734) / Class37_Sub9_Sub3.anInt2954);
					Class79.method1298((Class37_Sub9_Sub27
							.method881(-110,
									(new RSString[] {
											Class37_Sub4_Sub18.aClass16_2908,
											Class87.aClass16_1592,
											Class37_Sub9_Sub24.method870(i_16_,
													(byte) -114),
											Class50.aClass16_1011 }))), false,
							1);
				}*/
			} else if ((Class32.anInt740 ^ 0xffffffff) == -31)
				Class37_Sub9_Sub13.method814(i + -21999);
			else if ((Class32.anInt740 ^ 0xffffffff) == -41)
				Class79.method1298((Class37_Sub9_Sub27.method881((new RSString[] { Class35.aClass16_791,
						Class37_Sub9_Sub11.aClass16_3107,
						OverridedInterface.aClass16_1891 }))), false, 1);
		} else
			Class37_Sub9_Sub6.method786(
					(NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848),
					(Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724),
					(byte) 69);
		if (Class32.anInt740 == 30 && Class37_Sub4_Sub13.anInt2793 == 0
				&& !Class4.aBoolean93) {
			try {
				Graphics graphics = Class37_Sub9.aCanvas1967.getGraphics();
				for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (Class37_Sub9_Sub37.anInt3597 ^ 0xffffffff)); i_17_++) {
					if (Class37_Sub9_Sub1.rectClipDraw[i_17_]) {
						KeyboardHandler.aClass32_568.clipDraw(
								Class71.anIntArray1364[i_17_], 64,
								Class37_Sub4_Sub7_Sub7.anIntArray3842[i_17_],
								Class37_Sub11_Sub1.anIntArray3611[i_17_],
								Class43.anIntArray961[i_17_], graphics);
						Class37_Sub9_Sub1.rectClipDraw[i_17_] = false;
					}
				}
			} catch (Exception exception) {
				Class37_Sub9.aCanvas1967.repaint();
			}
		} else {
			if (Class32.anInt740 > 0) {
				try {
					Graphics graphics = Class37_Sub9.aCanvas1967.getGraphics();
					KeyboardHandler.aClass32_568.draw(0, graphics, 0, false);
					Class4.aBoolean93 = false;
					for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (Class37_Sub9_Sub37.anInt3597 ^ 0xffffffff)); i_18_++)
						Class37_Sub9_Sub1.rectClipDraw[i_18_] = false;
				} catch (Exception exception) {
					Class37_Sub9.aCanvas1967.repaint();
				}
			}
		}
	}

	static {
		anInt1719 = 0;
		aClass16_1721 = Class37_Sub2.create_rsstring("nav");
		aClass16_1727 = Class37_Sub2.create_rsstring(")3");
		aClass65_1728 = new Cache(64);
		anInt1734 = 0;
	}
}
