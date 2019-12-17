package org.ie.client;

/* Class37_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;
import java.util.Random;

public class Class37_Sub9_Sub4 extends Class37_Sub9 {
	public int[] anIntArray2957;
	public int anInt2958;
	public int[][] anIntArrayArray2959;
	public static int anInt2960;
	public static int anInt2961;
	public int[][] anIntArrayArray2962;
	public static int anInt2963;
	public static int anInt2964;
	public int anInt2965;
	public int anInt2966;
	public static RSString aClass16_2967 = Class37_Sub2.create_rsstring("Schlie-8en");
	public int anInt2968;
	public static int anInt2969;
	public int anInt2970;
	public int anInt2971 = 4;
	public int anInt2972;
	public static Cache aClass65_2973;
	public static int anInt2974;
	public static RSString aClass16_2975 = Class37_Sub2.create_rsstring("Lade Eingabe)2Steuerungsprogramm)3)3)3");
	public static int anInt2976;
	public int anInt2977;
	public int anInt2978;
	public int anInt2979;
	public int anInt2980;
	public static int[] anIntArray2981;
	public static int[] anIntArray2982;
	public static int[] anIntArray2983;
	public static RSString aClass16_2984;

	public Class37_Sub9_Sub4() {
		super(0, true);
		anInt2958 = 409;
		anInt2972 = 81;
		anInt2977 = 1024;
		anInt2978 = 0;
		anInt2965 = 8;
		anInt2979 = 1024;
		anInt2966 = 204;
	}

	public int[] method761(int i, int i_0_) {
		anInt2963++;
		int[] is = aClass38_1966.method1049(i_0_, true);
		if (aClass38_1966.aBoolean850) {
			int i_1_;
			for (i_1_ = Class37_Sub4_Sub16.anIntArray2871[i_0_] + anInt2978; (i_1_ ^ 0xffffffff) > -1; i_1_ += 4096) {
				/* empty */
			}
			int i_2_ = 0;
			for (/**/; i_1_ > 4096; i_1_ -= 4096) {
				/* empty */
			}
			for (/**/; i_2_ < anInt2965; i_2_++) {
				if ((i_1_ ^ 0xffffffff) > (anIntArray2957[i_2_] ^ 0xffffffff))
					break;
			}
			float f = (float) anIntArray2957[i_2_];
			float f_3_ = (float) anIntArray2957[i_2_ - 1];
			if (!((float) anInt2970 + f_3_ < (float) i_1_)
					|| !(f - (float) anInt2970 > (float) i_1_))
				Class53.method1134(is, 0, Class32.anInt743, 0);
			else {
				for (int i_4_ = 0; i_4_ < Class32.anInt743; i_4_++) {
					int i_5_ = 0;
					int i_6_ = i_2_ % 2 != 0 ? -anInt2977 : anInt2977;
					int i_7_;
					for (i_7_ = ((i_6_ * anInt2968 >> -807841428) + Class84.anIntArray1528[i_4_]); (i_7_ ^ 0xffffffff) > -1; i_7_ += 4096) {
						/* empty */
					}
					for (/**/; i_7_ > 4096; i_7_ -= 4096) {
						/* empty */
					}
					for (/**/; anInt2971 > i_5_; i_5_++) {
						if ((i_7_ ^ 0xffffffff) > (anIntArrayArray2962[i_2_
								+ -1][i_5_] ^ 0xffffffff))
							break;
					}
					float f_8_ = (float) anIntArrayArray2962[i_2_ + -1][i_5_];
					float f_9_ = (float) anIntArrayArray2962[-1 + i_2_][-1
							+ i_5_];
					if (f_9_ + (float) anInt2970 < (float) i_7_
							&& (float) i_7_ < (float) -anInt2970 + f_8_)
						is[i_4_] = anIntArrayArray2959[i_2_ + -1][-1 + i_5_];
					else
						is[i_4_] = 0;
				}
			}
		}
		if (i >= -125)
			anInt2978 = 25;
		return is;
	}

	public void method775(byte i) {
		anInt2961++;
		Random random = new Random((long) anInt2965);
		anIntArrayArray2959 = new int[anInt2965][anInt2971];
		anInt2970 = anInt2972 / 2;
		if (i != -55)
			aClass65_2973 = null;
		anInt2980 = 4096 / anInt2965;
		anIntArrayArray2962 = new int[anInt2965][1 + anInt2971];
		anIntArray2957 = new int[1 + anInt2965];
		anIntArray2957[0] = 0;
		int i_10_ = anInt2980 / 2;
		anInt2968 = 4096 / anInt2971;
		int i_11_ = anInt2968 / 2;
		for (int i_12_ = 0; i_12_ < anInt2965; i_12_++) {
			if (i_12_ > 0) {
				int i_13_ = anInt2980;
				int i_14_ = (((-2048 + Class20.method216(4096, random,
						(byte) -118)) * anInt2966) >> -1292583892);
				i_13_ += i_10_ * i_14_ >> -223772084;
				anIntArray2957[i_12_] = i_13_ + anIntArray2957[i_12_ - 1];
			}
			anIntArrayArray2962[i_12_][0] = 0;
			for (int i_15_ = 0; anInt2971 > i_15_; i_15_++) {
				if ((i_15_ ^ 0xffffffff) < -1) {
					int i_16_ = anInt2968;
					int i_17_ = ((-2048 + Class20.method216(4096, random,
							(byte) -108))
							* anInt2958 >> -662697140);
					i_16_ += i_11_ * i_17_ >> 1928009836;
					anIntArrayArray2962[i_12_][i_15_] = anIntArrayArray2962[i_12_][i_15_ - 1]
							+ i_16_;
				}
				anIntArrayArray2959[i_12_][i_15_] = 4096 - Class20.method216(
						anInt2979, random, (byte) -56);
			}
			anIntArrayArray2962[i_12_][anInt2971] = 4096;
		}
		anIntArray2957[anInt2965] = 4096;
	}

	public static void executeScript(InterfaceListener listener, int i_18_) {
		anInt2976++;
		Object[] scriptArgs = listener.objectData;
		int scriptId = ((Integer) scriptArgs[0]).intValue();
		ClientScriptDef class37_sub4_sub6 = Class37_Sub9_Sub20.list(true, scriptId);
		if (class37_sub4_sub6 != null) {
			Class37_Sub9_Sub29.anInt3457 = 0;
				int intStackCount = 0;
				int stringStackCount = 0;
				int index = -1;
				int[] opcodes = class37_sub4_sub6.opcodes;
				int[] values = class37_sub4_sub6.values;
				int opcode = -1;
				try {
					Class37_Sub3_Sub3.stringScriptArguments = new RSString[class37_sub4_sub6.anInt2616];
					int i_25_ = 0;
					RSInterface.intScriptArguments = new int[class37_sub4_sub6.anInt2614];
					int i_26_ = 0;
					for (int i_27_ = 1; (scriptArgs.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
						if (!(scriptArgs[i_27_] instanceof Integer)) {
							if (scriptArgs[i_27_] instanceof RSString) {
								RSString rSString = (RSString) scriptArgs[i_27_];
								if (rSString
										.equalsRSString(-79, Class32.aClass16_729))
									rSString = listener.aClass16_1937;
								Class37_Sub3_Sub3.stringScriptArguments[i_26_++] = rSString;
							}
						} else {
							int i_28_ = ((Integer) scriptArgs[i_27_]).intValue();
							if (i_28_ == -2147483647)
								i_28_ = listener.intData2;
							if (i_28_ == -2147483646)
								i_28_ = listener.intData1;
							if (i_28_ == -2147483645)
								i_28_ = (listener.aClass18_1925 != null ? listener.aClass18_1925.bitPacked : -1);
							if (i_28_ == -2147483644)
								i_28_ = listener.anInt1936;
							if (i_28_ == -2147483643)
								i_28_ = (listener.aClass18_1925 != null ? listener.aClass18_1925.anInt334 : -1);
							if (i_28_ == -2147483642)
								i_28_ = (listener.aClass18_1922 != null ? listener.aClass18_1922.bitPacked : -1);
							if (i_28_ == -2147483641)
								i_28_ = (listener.aClass18_1922 == null ? -1 : listener.aClass18_1922.anInt334);
							if (i_28_ == -2147483640)
								i_28_ = listener.keyCode;
							if (i_28_ == -2147483639)
								i_28_ = listener.keyChar;
							RSInterface.intScriptArguments[i_25_++] = i_28_;
						}
					}
					int i_29_ = 0;
					for (;;) {
						if ((++i_29_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
							throw new RuntimeException("slow");
						opcode = opcodes[++index];
						if (opcode < 100) {
							if (opcode == 0) {
								Class14.intStack[intStackCount++] = values[index];
								continue;
							}
							if (opcode == 1) {
								int i_30_ = values[index];
								Class14.intStack[intStackCount++] = Class37_Sub23.varpData[i_30_];
								continue;
							}
							if (opcode == 2) {
								int i_31_ = values[index];
								Class37_Sub23.varpData[i_31_] = Class14.intStack[--intStackCount];
								continue;
							}
							if (opcode == 3) {
								Class60.stringStack[stringStackCount++] = (class37_sub4_sub6.aClass16Array2617[index]);
								continue;
							}
							if (opcode == 6) {
								index += values[index];
								continue;
							}
							if (opcode == 7) {
								intStackCount -= 2;
								if (Class14.intStack[intStackCount] != Class14.intStack[intStackCount
										- -1])
									index += values[index];
								continue;
							}
							if (opcode == 8) {
								intStackCount -= 2;
								if (Class14.intStack[intStackCount + 1] == Class14.intStack[intStackCount])
									index += values[index];
								continue;
							}
							if (opcode == 9) {
								intStackCount -= 2;
								if ((Class14.intStack[intStackCount] ^ 0xffffffff) > (Class14.intStack[intStackCount
										- -1] ^ 0xffffffff))
									index += values[index];
								continue;
							}
							if (opcode == 10) {
								intStackCount -= 2;
								if (Class14.intStack[intStackCount] > Class14.intStack[1 + intStackCount])
									index += values[index];
								continue;
							}
							if (opcode == 21) {
								if (Class37_Sub9_Sub29.anInt3457 != 0) {
									Class78 class78 = (Class37_Sub1.aClass78Array1807[--Class37_Sub9_Sub29.anInt3457]);
									Class37_Sub3_Sub3.stringScriptArguments = class78.aClass16Array1463;
									RSInterface.intScriptArguments = class78.anIntArray1457;
									index = class78.anInt1465;
									class37_sub4_sub6 = class78.aClass37_Sub4_Sub6_1455;
									opcodes = class37_sub4_sub6.opcodes;
									values = class37_sub4_sub6.values;
									continue;
								}
								return;
							}
							if (opcode == 25) {
								int i_32_ = values[index];
								Class14.intStack[intStackCount++] = ByteVector
										.method983(i_32_, 117);
								continue;
							}
							if (opcode == 27) {
								int i_33_ = values[index];
								Class37_Sub4_Sub13.send_varbit(i_33_, (Class14.intStack[--intStackCount]));
								continue;
							}
							if (opcode == 31) {
								intStackCount -= 2;
								if ((Class14.intStack[intStackCount] ^ 0xffffffff) >= (Class14.intStack[intStackCount + 1] ^ 0xffffffff))
									index += values[index];
								continue;
							}
							if (opcode == 32) {
								intStackCount -= 2;
								if ((Class14.intStack[1 + intStackCount] ^ 0xffffffff) >= (Class14.intStack[intStackCount] ^ 0xffffffff))
									index += values[index];
								continue;
							}
							if (opcode == 33) {
								Class14.intStack[intStackCount++] = RSInterface.intScriptArguments[values[index]];
								continue;
							}
							if (opcode == 34) {
								RSInterface.intScriptArguments[values[index]] = Class14.intStack[--intStackCount];
								continue;
							}
							if (opcode == 35) {
								Class60.stringStack[stringStackCount++] = (Class37_Sub3_Sub3.stringScriptArguments[values[index]]);
								continue;
							}
							if (opcode == 36) {
								Class37_Sub3_Sub3.stringScriptArguments[(values[index])] = Class60.stringStack[--stringStackCount];
								continue;
							}
							if (opcode == 37) {
								int i_34_ = values[index];
								stringStackCount -= i_34_;
								RSString rSString = Class43.method1090(stringStackCount, i_34_, Class60.stringStack);
								Class60.stringStack[stringStackCount++] = rSString;
								continue;
							}
							if (opcode == 38) {
								intStackCount--;
								continue;
							}
							if (opcode == 39) {
								stringStackCount--;
								continue;
							}
							if (opcode == 40) {
								int i_35_ = values[index];
								ClientScriptDef class37_sub4_sub6_36_ = Class37_Sub9_Sub20
										.list(true, i_35_);
								int[] is_37_ = new int[class37_sub4_sub6_36_.anInt2614];
								RSString[] class16s = (new RSString[class37_sub4_sub6_36_.anInt2616]);
								for (int i_38_ = 0; class37_sub4_sub6_36_.anInt2623 > i_38_; i_38_++)
									is_37_[i_38_] = (Class14.intStack[i_38_
											+ (-(class37_sub4_sub6_36_.anInt2623) + intStackCount)]);
								for (int i_39_ = 0; ((i_39_ ^ 0xffffffff) > (class37_sub4_sub6_36_.anInt2618 ^ 0xffffffff)); i_39_++)
									class16s[i_39_] = (Class60.stringStack[(i_39_
											+ stringStackCount - (class37_sub4_sub6_36_.anInt2618))]);
								intStackCount -= class37_sub4_sub6_36_.anInt2623;
								stringStackCount -= class37_sub4_sub6_36_.anInt2618;
								Class78 class78 = new Class78();
								class78.anIntArray1457 = RSInterface.intScriptArguments;
								class78.aClass37_Sub4_Sub6_1455 = class37_sub4_sub6;
								class37_sub4_sub6 = class37_sub4_sub6_36_;
								class78.anInt1465 = index;
								class78.aClass16Array1463 = Class37_Sub3_Sub3.stringScriptArguments;
								Class37_Sub1.aClass78Array1807[Class37_Sub9_Sub29.anInt3457++] = class78;
								Class37_Sub3_Sub3.stringScriptArguments = class16s;
								index = -1;
								opcodes = class37_sub4_sub6.opcodes;
								RSInterface.intScriptArguments = is_37_;
								values = class37_sub4_sub6.values;
								continue;
							}
							if (opcode == 42) {
								Class14.intStack[intStackCount++] = (InterfaceListener.anIntArray1939[values[index]]);
								continue;
							}
							if (opcode == 43) {
								InterfaceListener.anIntArray1939[values[index]] = Class14.intStack[--intStackCount];
								continue;
							}
							if (opcode == 44) {
								int i_40_ = values[index] >> 827420080;
								int i_41_ = values[index] & 0xffff;
								int i_42_ = Class14.intStack[--intStackCount];
								if (i_42_ < 0 || i_42_ > 5000)
									throw new RuntimeException();
								Class26.anIntArray664[i_40_] = i_42_;
								int i_43_ = -1;
								if ((i_41_ ^ 0xffffffff) == -106)
									i_43_ = 0;
								for (int i_44_ = 0; ((i_44_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff)); i_44_++)
									Node.anIntArrayArray813[i_40_][i_44_] = i_43_;
								continue;
							}
							if (opcode == 45) {
								int i_45_ = Class14.intStack[--intStackCount];
								int i_46_ = values[index];
								if ((i_45_ ^ 0xffffffff) > -1
										|| Class26.anIntArray664[i_46_] <= i_45_)
									throw new RuntimeException();
								Class14.intStack[intStackCount++] = Node.anIntArrayArray813[i_46_][i_45_];
								continue;
							}
							if (opcode == 46) {
								intStackCount -= 2;
								int i_47_ = values[index];
								int i_48_ = Class14.intStack[intStackCount];
								if (i_48_ < 0
										|| (Class26.anIntArray664[i_47_] ^ 0xffffffff) >= (i_48_ ^ 0xffffffff))
									throw new RuntimeException();
								Node.anIntArrayArray813[i_47_][i_48_] = Class14.intStack[intStackCount
										- -1];
								continue;
							}
							if (opcode == 47) {
								RSString rSString = Class84.aClass16Array1532[values[index]];
								if (rSString == null)
									rSString = Class37_Sub14.aClass16_2123;
								Class60.stringStack[stringStackCount++] = rSString;
								continue;
							}
							if (opcode == 48) {
								Class84.aClass16Array1532[values[index]] = Class60.stringStack[--stringStackCount];
								continue;
							}
						}
						boolean bool;
						if (values[index] == 1)
							bool = true;
						else
							bool = false;
						if (opcode >= 1000) {
							if ((opcode < 1000 || opcode >= 1100)
									&& ((opcode ^ 0xffffffff) > -2001 || opcode >= 2100)) {
								if (((opcode ^ 0xffffffff) > -1101 || opcode >= 1200)
										&& (opcode < 2100 || (opcode ^ 0xffffffff) <= -2201)) {
									if (((opcode ^ 0xffffffff) <= -1201 && (opcode ^ 0xffffffff) > -1301)
											|| (opcode >= 2200 && (opcode ^ 0xffffffff) > -2301)) {
										RSInterface rSInterface;
										if (opcode >= 2000) {
											rSInterface = (Class37_Sub9_Sub14
													.getInterface(
															(Class14.intStack[--intStackCount])));
											opcode -= 1000;
										} else
											rSInterface = (!bool ? Class47.aClass18_995
													: Class1.aClass18_61);
										Class73.refreshInterface(rSInterface);
										if (opcode == 1200) {
											intStackCount -= 2;
											int i_49_ = (Class14.intStack[intStackCount + 1]);
											int i_50_ = Class14.intStack[intStackCount];
											rSInterface.itemZoom = i_49_;
											rSInterface.itemId = i_50_;
											RSItem class37_sub4_sub1 = (Class46.loadItem(i_50_, (byte) 88));
											rSInterface.offsetY = class37_sub4_sub1.modelOffset2;
											rSInterface.rotateX = class37_sub4_sub1.modelRotation1;
											rSInterface.rotateY = class37_sub4_sub1.modelRotation2;
											rSInterface.offsetX = class37_sub4_sub1.modelOffset1;
											rSInterface.zoom = class37_sub4_sub1.modelZoom;
											if (rSInterface.width > 0)
												rSInterface.zoom = (rSInterface.zoom * 32 / rSInterface.width);
											rSInterface.rotateZ = class37_sub4_sub1.anInt2517;
										} else if ((opcode ^ 0xffffffff) == -1202) {
											rSInterface.modelTypeDisabled = 2;
											rSInterface.mediaIdDisabled = (Class14.intStack[--intStackCount]);
										} else {
											if (opcode != 1202)
												break;
											rSInterface.modelTypeDisabled = 3;
											rSInterface.mediaIdDisabled = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985
													.method268(4);
										}
									} else if (((opcode ^ 0xffffffff) > -1301 || opcode >= 1400)
											&& ((opcode ^ 0xffffffff) > -2301 || ((opcode ^ 0xffffffff) <= -2401))) {
										if (opcode >= 1400
												&& opcode < 1500
												|| ((opcode ^ 0xffffffff) <= -2401 && ((opcode ^ 0xffffffff) > -2501))) {
											RSInterface component;
											if (opcode >= 2000) {
												opcode -= 1000;
												component = (Class37_Sub9_Sub14
														.getInterface(
																(Class14.intStack[--intStackCount])));
											} else
												component = (!bool ? Class47.aClass18_995 : Class1.aClass18_61);
											RSString rSString = Class60.stringStack[--stringStackCount];
											int[] is_51_ = null;
											if (rSString.length() > 0
													&& rSString.charAt(rSString.length() - 1) == 89) {//Y
												int i_52_ = (Class14.intStack[--intStackCount]);
												if ((i_52_ ^ 0xffffffff) < -1) {
													is_51_ = new int[i_52_];
													while ((i_52_-- ^ 0xffffffff) < -1)
														is_51_[i_52_] = (Class14.intStack[--intStackCount]);
												}
												rSString = (rSString
														.method169(
																0,
																0,
																-1
																		+ (rSString
																				.length())));
											}
											Object[] objects_53_ = (new Object[(rSString
													.length() + 1)]);
											for (int i_54_ = -1
													+ objects_53_.length; i_54_ >= 1; i_54_--) {
												if (((rSString.charAt(-1
														+ i_54_)) ^ 0xffffffff) != -116)
													objects_53_[i_54_] = (new Integer(
															Class14.intStack[--intStackCount]));
												else
													objects_53_[i_54_] = (Class60.stringStack[--stringStackCount]);
											}
											int i_55_ = (Class14.intStack[--intStackCount]);
											if (i_55_ == -1)
												objects_53_ = null;
											else
												objects_53_[0] = new Integer(
														i_55_);
											if (opcode == 1406)
												component.spellUsedListener = objects_53_;
											if (opcode == 1417)
												component.mouseWheelListener = objects_53_;
											if (opcode == 1403)
												component.mouseFocusListener = objects_53_;
											if (opcode == 1420)
												component.privateChatUpdateListener = objects_53_;
											if (opcode == 1401)
												component.mouseDraggedListener = objects_53_;
											if (opcode == 1421)
												component.clanUpdateListener = objects_53_;
											if (opcode == 1410)
												component.anObjectArray456 = objects_53_;
											if (opcode == 1424)
												component.anObjectArray407 = objects_53_;
											if (opcode == 1419)
												component.keyPressedListener = objects_53_;
											if (opcode == 1423)
												component.anObjectArray333 = objects_53_;
											if (opcode == 1414) {
												component.inventoryUpdateListener = objects_53_;
												component.inventoryListenerValues = is_51_;
											}
											if (opcode == 1412)
												component.mouseFocusedListener = objects_53_;
											if (opcode == 1407) {//TODO scripts
												component.varpListenerValues = is_51_;
												component.varpUpdateListener = objects_53_;
											}
											if (opcode == 1425)
												component.grandExchangeItemListener = objects_53_;
											if (opcode == 1422)
												component.anObjectArray352 = objects_53_;
											if (opcode == 1408)
												component.mainLoopListener = objects_53_;
											if (opcode == 1416)
												component.spellUsedOnItemListener = objects_53_;
											if (opcode == 1415) {
												component.skillUpdateListener = objects_53_;
												component.skillListenerValues = is_51_;
											}
											if (opcode == 1404)
												component.mouseUnfocusListener = objects_53_;
											if (opcode == 1402)
												component.mouseClickUnfocusListener = objects_53_;
											if (opcode == 1411)
												component.mouseClickListener = objects_53_;
											component.objectData = true;
											if (opcode == 1418)
												component.messageReceivedListener = objects_53_;
											if (opcode == 1400)
												component.mouseClickFocusListener = objects_53_;
											if (opcode == 1409)
												component.anObjectArray363 = objects_53_;
											if (opcode == 1405)
												component.anObjectArray409 = objects_53_;
										} else if ((opcode ^ 0xffffffff) <= -1601) {
											if ((opcode ^ 0xffffffff) <= -1701) {
												if (opcode >= 1800) {
													if ((opcode ^ 0xffffffff) <= -1901) {
														if ((opcode ^ 0xffffffff) <= -2601) {
															if (opcode < 2700) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.intStack[--intStackCount])));
																if (opcode == 2600)
																	Class14.intStack[intStackCount++] = (rSInterface.horizontalScrollPosition);
																else if (opcode == 2601)
																	Class14.intStack[intStackCount++] = (rSInterface.verticalScrollPosition);
																else if (opcode == 2602)
																	Class60.stringStack[stringStackCount++] = (rSInterface.disabledText);
																else if (opcode == 2603)
																	Class14.intStack[intStackCount++] = (rSInterface.maxScrollHorizontal);
																else if (opcode == 2604)
																	Class14.intStack[intStackCount++] = (rSInterface.maxScrollVertical);
																else if ((opcode ^ 0xffffffff) == -2606)
																	Class14.intStack[intStackCount++] = (rSInterface.zoom);
																else if ((opcode ^ 0xffffffff) == -2607)
																	Class14.intStack[intStackCount++] = (rSInterface.rotateX);
																else if (opcode == 2607)
																	Class14.intStack[intStackCount++] = (rSInterface.rotateZ);
																else {
																	if ((opcode ^ 0xffffffff) != -2609)
																		break;
																	Class14.intStack[intStackCount++] = (rSInterface.rotateY);
																}
															} else if (opcode >= 2800) {
																if ((opcode ^ 0xffffffff) > -2901) {
																	RSInterface rSInterface = (Class37_Sub9_Sub14
																			.getInterface(
																					(Class14.intStack[--intStackCount])));
																	if ((opcode ^ 0xffffffff) == -2801)
																		Class14.intStack[intStackCount++] = Class10
																				.method85(
																						RuntimeException_Sub1
																								.get_click_mask(
																										rSInterface),
																						false);
																	else if (opcode == 2801) {
																		int i_56_ = Class14.intStack[--intStackCount];
																		i_56_--;
																		if ((rSInterface.niActions == null)
																				|| (rSInterface.niActions.length ^ 0xffffffff) >= (i_56_ ^ 0xffffffff)
																				|| rSInterface.niActions[i_56_] == null)
																			Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																		else
																			Class60.stringStack[stringStackCount++] = rSInterface.niActions[i_56_];
																	} else {
																		if ((opcode ^ 0xffffffff) != -2803)
																			break;
																		if (rSInterface.action_name == null)
																			Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																		else
																			Class60.stringStack[stringStackCount++] = rSInterface.action_name;
																	}
																} else if (opcode < 3200) {
																	if ((opcode ^ 0xffffffff) == -3101) {
																		RSString rSString = Class60.stringStack[--stringStackCount];
																		Class37_Sub4_Sub7_Sub1_Sub1
																				.method505(
																						Class3.aClass16_87,
																						0,
																						rSString);
																	} else if ((opcode ^ 0xffffffff) == -3102) {
																		intStackCount -= 2;
																		Node
																				.method324(
																						Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234,
																						Class14.intStack[intStackCount + 1],
																						Class14.intStack[intStackCount]);
																	} else if (opcode == 3103)
																		Class62
																				.method1173();
																	else if ((opcode ^ 0xffffffff) == -3105) {
																		Class2.anInt76++;
																		RSString rSString = Class60.stringStack[--stringStackCount];
																		int i_57_ = 0;
																		if (rSString.method145(-63))
																			i_57_ = rSString.method175(8109);
																		Class42.aClass37_Sub11_Sub1_936.method989(249);
																		Class42.aClass37_Sub11_Sub1_936.method947(i_57_);
																	} else if (opcode == 3105) {
																		Class83.anInt1516++;
																		RSString rSString = Class60.stringStack[--stringStackCount];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						82);
																		Class42.aClass37_Sub11_Sub1_936
																				.method949(
																						rSString
																								.method152(-69),
																						(byte) -57);
																	} else if (opcode == 3106) {
																		Class82.anInt1709++;
																		RSString rSString = Class60.stringStack[--stringStackCount];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						88);
																		Class42.aClass37_Sub11_Sub1_936
																				.method964(
																						126,
																						rSString
																								.length()
																								- -1);
																		Class42.aClass37_Sub11_Sub1_936
																				.method977(
																						rSString,
																						0);
																	} else if ((opcode ^ 0xffffffff) == -3108) {
																		int i_58_ = Class14.intStack[--intStackCount];
																		RSString rSString = Class60.stringStack[--stringStackCount];
																		Class2
																				.method43(
																						i_58_,
																						rSString,
																						-128);
																	} else if ((opcode ^ 0xffffffff) == -3109) {
																		intStackCount -= 3;
																		int i_59_ = Class14.intStack[1 + intStackCount];
																		int i_60_ = Class14.intStack[intStackCount];
																		int i_61_ = Class14.intStack[2 + intStackCount];
																		RSInterface rSInterface = Class37_Sub9_Sub14
																				.getInterface(
																						i_61_);
																		Class37_Sub25
																				.press_child(
																						rSInterface,
																						i_60_,
																						i_59_);
																	} else if ((opcode ^ 0xffffffff) == -3110) {
																		intStackCount -= 2;
																		int i_62_ = Class14.intStack[intStackCount];
																		int i_63_ = Class14.intStack[intStackCount
																				- -1];
																		RSInterface rSInterface = bool ? Class1.aClass18_61
																				: Class47.aClass18_995;
																		Class37_Sub25
																				.press_child(
																						rSInterface,
																						i_62_,
																						i_63_);
																	} else {
																		if ((opcode ^ 0xffffffff) != -3111)
																			break;
																		Class37_Sub9_Sub24.anInt3372++;
																		int i_64_ = Class14.intStack[--intStackCount];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						171);
																		Class42.aClass37_Sub11_Sub1_936
																				.method965(
																						i_64_);
																	}
																} else if (opcode >= 3300) {
																	if ((opcode ^ 0xffffffff) <= -3401) {
																		if ((opcode ^ 0xffffffff) > -3501) {
																			if (opcode == 3400) {
																				intStackCount -= 2;
																				int i_65_ = Class14.intStack[intStackCount + 1];
																				int i_66_ = Class14.intStack[intStackCount];
																				Class37_Sub4_Sub10 class37_sub4_sub10 = Class84
																						.method1317(i_66_);
																				for (int i_67_ = 0; class37_sub4_sub10.anInt2676 > i_67_; i_67_++) {
																					if (i_65_ == class37_sub4_sub10.anIntArray2683[i_67_]) {
																						Class60.stringStack[stringStackCount++] = class37_sub4_sub10.aClass16Array2675[i_67_];
																						class37_sub4_sub10 = null;
																						break;
																					}
																				}
																				if (class37_sub4_sub10 != null)
																					Class60.stringStack[stringStackCount++] = class37_sub4_sub10.aClass16_2673;
																			} else {
																				if ((opcode ^ 0xffffffff) != -3409)
																					break;
																				intStackCount -= 4;
																				int i_68_ = Class14.intStack[intStackCount];
																				int i_69_ = Class14.intStack[1 + intStackCount];
																				int i_70_ = Class14.intStack[2 + intStackCount];
																				int i_71_ = Class14.intStack[3 + intStackCount];
																				Class37_Sub4_Sub10 class37_sub4_sub10 = Class84
																						.method1317(
																								i_70_);
																				if ((class37_sub4_sub10.anInt2668 ^ 0xffffffff) != (i_68_ ^ 0xffffffff)
																						|| i_69_ != class37_sub4_sub10.anInt2682) {
																					if ((i_69_ ^ 0xffffffff) == -116)
																						Class60.stringStack[stringStackCount++] = Class37_Sub14.aClass16_2123;
																					else
																						Class14.intStack[intStackCount++] = 0;
																				} else {
																					for (int i_72_ = 0; (class37_sub4_sub10.anInt2676 ^ 0xffffffff) < (i_72_ ^ 0xffffffff); i_72_++) {
																						if (class37_sub4_sub10.anIntArray2683[i_72_] == i_71_) {
																							if ((i_69_ ^ 0xffffffff) != -116)
																								Class14.intStack[intStackCount++] = class37_sub4_sub10.anIntArray2684[i_72_];
																							else
																								Class60.stringStack[stringStackCount++] = class37_sub4_sub10.aClass16Array2675[i_72_];
																							class37_sub4_sub10 = null;
																							break;
																						}
																					}
																					if (class37_sub4_sub10 != null) {
																						if (i_69_ == 115)
																							Class60.stringStack[stringStackCount++] = class37_sub4_sub10.aClass16_2673;
																						else
																							Class14.intStack[intStackCount++] = class37_sub4_sub10.anInt2680;
																					}
																				}
																			}
																		} else if ((opcode ^ 0xffffffff) > -3701) {
																			if ((opcode ^ 0xffffffff) == -3601) {
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) != -1) {
																					if (Class37_Sub4_Sub12.anInt2783 != 1)
																						Class14.intStack[intStackCount++] = MouseHandler.anInt173;
																					else
																						Class14.intStack[intStackCount++] = -1;
																				} else
																					Class14.intStack[intStackCount++] = -2;
																			} else if ((opcode ^ 0xffffffff) == -3602) {
																				int i_73_ = Class14.intStack[--intStackCount];
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) != -3
																						|| MouseHandler.anInt173 <= i_73_)
																					Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				else
																					Class60.stringStack[stringStackCount++] = Class69.aClass16Array1342[i_73_];
																			} else if ((opcode ^ 0xffffffff) == -3603) {
																				int i_74_ = Class14.intStack[--intStackCount];
																				if (Class37_Sub4_Sub12.anInt2783 == 2
																						&& (MouseHandler.anInt173 ^ 0xffffffff) < (i_74_ ^ 0xffffffff))
																					Class14.intStack[intStackCount++] = MouseHandler.anIntArray176[i_74_];
																				else
																					Class14.intStack[intStackCount++] = 0;
																			} else if (opcode == 3603) {
																				int i_75_ = Class14.intStack[--intStackCount];
																				if (Class37_Sub4_Sub12.anInt2783 != 2
																						|| (MouseHandler.anInt173 ^ 0xffffffff) >= (i_75_ ^ 0xffffffff))
																					Class14.intStack[intStackCount++] = 0;
																				else
																					Class14.intStack[intStackCount++] = Class37_Sub9_Sub31.anIntArray3484[i_75_];
																			} else if (opcode == 3604) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				int i_76_ = Class14.intStack[--intStackCount];
																				Class37_Sub2
																						.method336(
																								31613,
																								rSString,
																								i_76_);
																			} else if ((opcode ^ 0xffffffff) == -3606) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class37_Sub9_Sub8
																						.method797(
																								rSString
																										.method152(-62),
																								false);
																			} else if ((opcode ^ 0xffffffff) == -3607) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class72
																						.method1268(
																								rSString
																										.method152(-78),
																								122);
																			} else if (opcode == 3607) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class80
																						.method1299(
																								0,
																								rSString
																										.method152(-105));
																			} else if (opcode == 3608) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class37_Sub9_Sub30
																						.method895(
																								-108,
																								rSString
																										.method152(-41));
																			} else if (opcode == 3609) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				if (rSString
																						.method165(
																								Class37_Sub7.aClass16_1906,
																								52)
																						|| rSString
																								.method165(
																										Class42.aClass16_945,
																										52))
																					rSString = rSString
																							.method158(
																									7,
																									-1);
																				Class14.intStack[intStackCount++] = !Class87
																						.method1327(
																								rSString,
																								-91) ? 0
																						: 1;
																			} else if (opcode == 3611) {
																				if (Class14.aClass16_252 == null)
																					Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				else
																					Class60.stringStack[stringStackCount++] = Class14.aClass16_252
																							.method164(70);
																			} else if (opcode == 3612) {
																				if (Class14.aClass16_252 == null)
																					Class14.intStack[intStackCount++] = 0;
																				else
																					Class14.intStack[intStackCount++] = Class35.anInt783;
																			} else if ((opcode ^ 0xffffffff) == -3614) {
																				int i_77_ = Class14.intStack[--intStackCount];
																				if (Class14.aClass16_252 == null
																						|| (Class35.anInt783 ^ 0xffffffff) >= (i_77_ ^ 0xffffffff))
																					Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				else
																					Class60.stringStack[stringStackCount++] = Class14.aClass37_Sub18Array240[i_77_].aClass16_2197
																							.method164(70);
																			} else if ((opcode ^ 0xffffffff) == -3615) {
																				int i_78_ = Class14.intStack[--intStackCount];
																				if (Class14.aClass16_252 != null
																						&& Class35.anInt783 > i_78_)
																					Class14.intStack[intStackCount++] = Class14.aClass37_Sub18Array240[i_78_].anInt2192;
																				else
																					Class14.intStack[intStackCount++] = 0;
																			} else if ((opcode ^ 0xffffffff) == -3616) {
																				int i_79_ = Class14.intStack[--intStackCount];
																				if (Class14.aClass16_252 != null
																						&& (Class35.anInt783 ^ 0xffffffff) < (i_79_ ^ 0xffffffff))
																					Class14.intStack[intStackCount++] = Class14.aClass37_Sub18Array240[i_79_].aByte2194;
																				else
																					Class14.intStack[intStackCount++] = 0;
																			} else if (opcode == 3616)
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub4.aByte2573;
																			else if ((opcode ^ 0xffffffff) == -3618) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class37_Sub23
																						.method1027(
																								rSString,
																								0);
																			} else if ((opcode ^ 0xffffffff) == -3619)
																				Class14.intStack[intStackCount++] = Class83.aByte1519;
																			else if (opcode == 3619) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				Class3
																						.method48(
																								(byte) 117,
																								rSString
																										.method152(-118));
																			} else if (opcode == 3620)
																				Class37_Sub9_Sub16
																						.method827(true);
																			else if (opcode == 3621) {
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) == -1)
																					Class14.intStack[intStackCount++] = -1;
																				else
																					Class14.intStack[intStackCount++] = RSInterface.anInt340;
																			} else if (opcode == 3622) {
																				int i_80_ = Class14.intStack[--intStackCount];
																				if (Class37_Sub4_Sub12.anInt2783 != 0
																						&& RSInterface.anInt340 > i_80_)
																					Class60.stringStack[stringStackCount++] = Class37_Sub4_Sub13
																							.method708(
																									37,
																									Class80.aLongArray1504[i_80_])
																							.method164(
																									70);
																				else
																					Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																			} else if (opcode == 3623) {
																				RSString rSString = Class60.stringStack[--stringStackCount];
																				if (rSString
																						.method165(
																								Class37_Sub7.aClass16_1906,
																								52)
																						|| rSString
																								.method165(
																										Class42.aClass16_945,
																										52))
																					rSString = rSString
																							.method158(
																									7,
																									-1);
																				Class14.intStack[intStackCount++] = !Class37_Sub4_Sub3
																						.method467(
																								(byte) -35,
																								rSString) ? 0
																						: 1;
																			} else if (opcode == 3624) {
																				int i_81_ = Class14.intStack[--intStackCount];
																				if (Class14.aClass37_Sub18Array240 == null
																						|| i_81_ >= Class35.anInt783
																						|| !Class14.aClass37_Sub18Array240[i_81_].aClass16_2197
																								.method159(
																										Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993,
																										(byte) 125))
																					Class14.intStack[intStackCount++] = 0;
																				else
																					Class14.intStack[intStackCount++] = 1;
																			} else {
																				if ((opcode ^ 0xffffffff) != -3626)
																					break;
																				if (Class37_Sub9_Sub1.aClass16_2911 == null)
																					Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				else
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub1.aClass16_2911
																							.method164(70);
																			}
																		} else if ((opcode ^ 0xffffffff) > -4001) {
																			if (opcode == 3903) {
																				int i_82_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_82_]
																						.method1172((byte) 55);
																			} else if ((opcode ^ 0xffffffff) == -3905) {
																				int i_83_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_83_].anInt1182;
																			} else if ((opcode ^ 0xffffffff) == -3906) {
																				int i_84_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_84_].anInt1173;
																			} else if ((opcode ^ 0xffffffff) == -3907) {
																				int i_85_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_85_].anInt1186;
																			} else if ((opcode ^ 0xffffffff) == -3908) {
																				int i_86_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_86_].anInt1184;
																			} else if (opcode == 3908) {
																				int i_87_ = Class14.intStack[--intStackCount];
																				Class14.intStack[intStackCount++] = Class37_Sub4_Sub8.aClass62Array2643[i_87_].anInt1178;
																			} else if ((opcode ^ 0xffffffff) == -3911) {
																				int i_88_ = Class14.intStack[--intStackCount];
																				int i_89_ = Class37_Sub4_Sub8.aClass62Array2643[i_88_]
																						.method1171(1);
																				Class14.intStack[intStackCount++] = (i_89_ ^ 0xffffffff) != -1 ? 0
																						: 1;
																			} else if (opcode == 3911) {
																				int i_90_ = Class14.intStack[--intStackCount];
																				int i_91_ = Class37_Sub4_Sub8.aClass62Array2643[i_90_]
																						.method1171(1);
																				Class14.intStack[intStackCount++] = (i_91_ ^ 0xffffffff) != -3 ? 0
																						: 1;
																			} else {
																				if ((opcode ^ 0xffffffff) != -3913)
																					break;
																				int i_92_ = Class14.intStack[--intStackCount];
																				int i_93_ = Class37_Sub4_Sub8.aClass62Array2643[i_92_]
																						.method1171(1);
																				Class14.intStack[intStackCount++] = i_93_ != 5 ? 0
																						: 1;
																			}
																		} else if (opcode >= 4100) {
																			if ((opcode ^ 0xffffffff) > -4201) {
																				if ((opcode ^ 0xffffffff) == -4101) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					int i_94_ = Class14.intStack[--intStackCount];
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub27
																							.method881(
																									new RSString[] {
																											rSString,
																											Class37_Sub9_Sub24
																													.method870(
																															i_94_,
																															(byte) -114) });
																				} else if ((opcode ^ 0xffffffff) == -4102) {
																					stringStackCount -= 2;
																					RSString rSString = Class60.stringStack[stringStackCount];
																					RSString class16_95_ = Class60.stringStack[1 + stringStackCount];
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub27
																							.method881(
																									new RSString[] {
																											rSString,
																											class16_95_ });
																				} else if ((opcode ^ 0xffffffff) == -4103) {
																					int i_96_ = Class14.intStack[--intStackCount];
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub27
																							.method881(
																									new RSString[] {
																											rSString,
																											Class37_Sub9_Sub27
																													.method882(
																															i_96_,
																															true,
																															10) });
																				} else if ((opcode ^ 0xffffffff) == -4104) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					Class60.stringStack[stringStackCount++] = rSString
																							.method147(12131);
																				} else if (opcode == 4104) {
																					int i_97_ = Class14.intStack[--intStackCount];
																					long l = 86400000L * (long) i_97_ + 1014768000000L;
																					Class37_Sub4_Sub12.aCalendar2782
																							.setTime(new Date(
																									l));
																					int i_98_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(5);
																					int i_99_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(2);
																					int i_100_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(1);
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub27
																							.method881(
																									new RSString[] {
																											Class37_Sub9_Sub24
																													.method870(
																															i_98_,
																															(byte) -114),
																											Class37_Sub9_Sub3.aClass16_2949,
																											Class37_Sub4_Sub7_Sub1_Sub1.aClass16Array3951[i_99_],
																											Class37_Sub9_Sub3.aClass16_2949,
																											Class37_Sub9_Sub24
																													.method870(
																															i_100_,
																															(byte) -114) });
																				} else if (opcode == 4105) {
																					stringStackCount -= 2;
																					RSString rSString = Class60.stringStack[stringStackCount + 1];
																					RSString class16_101_ = Class60.stringStack[stringStackCount];
																					if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985 == null
																							|| !Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985.aBoolean700)
																						Class60.stringStack[stringStackCount++] = class16_101_;
																					else
																						Class60.stringStack[stringStackCount++] = rSString;
																				} else if (opcode == 4106) {
																					int i_102_ = Class14.intStack[--intStackCount];
																					Class60.stringStack[stringStackCount++] = Class37_Sub9_Sub24
																							.method870(
																									i_102_,
																									(byte) -114);
																				} else if (opcode == 4107) {
																					stringStackCount -= 2;
																					Class14.intStack[intStackCount++] = Class60.stringStack[stringStackCount]
																							.method170(
																									true,
																									Class60.stringStack[stringStackCount
																											- -1]);
																				} else if (opcode == 4108) {
																					intStackCount -= 2;
																					int i_103_ = Class14.intStack[intStackCount];
																					int i_104_ = Class14.intStack[1 + intStackCount];
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					byte[] is_105_ = Class37_Sub9_Sub2.aClass15_Sub1_2932
																							.getFile(
																									i_104_,
																									0);
																					Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = new Class37_Sub4_Sub9_Sub2_Sub1(
																							is_105_);
																					Class14.intStack[intStackCount++] = class37_sub4_sub9_sub2_sub1
																							.method612(
																									rSString,
																									i_103_);
																				} else if (opcode == 4109) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					intStackCount -= 2;
																					int i_106_ = Class14.intStack[1 + intStackCount];
																					int i_107_ = Class14.intStack[intStackCount];
																					byte[] is_108_ = Class37_Sub9_Sub2.aClass15_Sub1_2932
																							.getFile(
																									i_106_,
																									0);
																					Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = new Class37_Sub4_Sub9_Sub2_Sub1(
																							is_108_);
																					Class14.intStack[intStackCount++] = class37_sub4_sub9_sub2_sub1
																							.method628(
																									rSString,
																									i_107_);
																				} else if (opcode == 4110) {
																					stringStackCount -= 2;
																					RSString rSString = Class60.stringStack[1 + stringStackCount];
																					RSString class16_109_ = Class60.stringStack[stringStackCount];
																					if ((Class14.intStack[--intStackCount] ^ 0xffffffff) != -2)
																						Class60.stringStack[stringStackCount++] = rSString;
																					else
																						Class60.stringStack[stringStackCount++] = class16_109_;
																				} else if ((opcode ^ 0xffffffff) == -4112) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					Class60.stringStack[stringStackCount++] = Class37_Sub4_Sub9_Sub2
																							.method605(rSString);
																				} else if ((opcode ^ 0xffffffff) == -4113) {
																					int i_110_ = Class14.intStack[--intStackCount];
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					Class60.stringStack[stringStackCount++] = rSString
																							.method144(
																									i_110_,
																									false);
																				} else if (opcode == 4113) {
																					int i_111_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = Class37_Sub25
																							.method1045(
																									i_111_,
																									-127) ? 1
																							: 0;
																				} else if ((opcode ^ 0xffffffff) == -4115) {
																					int i_112_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = !Class66
																							.method1192(
																									-115,
																									i_112_) ? 0
																							: 1;
																				} else if (opcode == 4115) {
																					int i_113_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = !Class19
																							.method202(
																									i_113_,
																									65) ? 0
																							: 1;
																				} else if (opcode == 4116) {
																					int i_114_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = Class37_Sub9_Sub22
																							.method862(
																									i_114_,
																									false) ? 1
																							: 0;
																				} else if (opcode == 4117) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					if (rSString == null)
																						Class14.intStack[intStackCount++] = 0;
																					else
																						Class14.intStack[intStackCount++] = rSString.length();
																				} else if ((opcode ^ 0xffffffff) == -4119) {
																					intStackCount -= 2;
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					int i_115_ = Class14.intStack[intStackCount];
																					int i_116_ = Class14.intStack[1 + intStackCount];
																					Class60.stringStack[stringStackCount++] = rSString
																							.method169(
																									0,
																									i_115_,
																									i_116_);
																				} else if ((opcode ^ 0xffffffff) == -4120) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					RSString class16_117_ = Class37_Sub4_Sub7
																							.method491(
																									rSString
																											.length(),
																									0);
																					boolean bool_118_ = false;
																					for (int i_119_ = 0; (i_119_ ^ 0xffffffff) > (rSString
																							.length() ^ 0xffffffff); i_119_++) {
																						int i_120_ = rSString
																								.charAt(
																										i_119_);
																						if (i_120_ != 60) {
																							if (i_120_ == 62)
																								bool_118_ = false;
																							else if (!bool_118_)
																								class16_117_
																										.method154(
																												0,
																												i_120_);
																						} else
																							bool_118_ = true;
																					}
																					class16_117_
																							.method173();
																					Class60.stringStack[stringStackCount++] = class16_117_;
																				} else if (opcode == 4120) {
																					intStackCount -= 2;
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					int i_121_ = Class14.intStack[intStackCount];
																					int i_122_ = Class14.intStack[intStackCount + 1];
																					Class14.intStack[intStackCount++] = rSString
																							.method160(
																									i_122_,
																									i_121_,
																									25356);
																				} else {
																					if ((opcode ^ 0xffffffff) != -4122)
																						break;
																					stringStackCount -= 2;
																					RSString rSString = Class60.stringStack[stringStackCount];
																					int i_123_ = Class14.intStack[--intStackCount];
																					RSString class16_124_ = Class60.stringStack[1 + stringStackCount];
																					Class14.intStack[intStackCount++] = rSString
																							.method168(
																									(byte) 58,
																									class16_124_,
																									i_123_);
																				}
																			} else if ((opcode ^ 0xffffffff) > -4301) {
																				if (opcode == 4200) {
																					int i_125_ = Class14.intStack[--intStackCount];
																					Class60.stringStack[stringStackCount++] = Class46
																							.loadItem(
																									i_125_,
																									(byte) 91).itemName;
																				} else if ((opcode ^ 0xffffffff) == -4202) {
																					intStackCount -= 2;
																					int i_126_ = Class14.intStack[intStackCount];
																					int i_127_ = Class14.intStack[1 + intStackCount];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_126_,
																									(byte) 99);
																					if ((i_127_ ^ 0xffffffff) <= -2
																							&& i_127_ <= 5
																							&& class37_sub4_sub1.groundActions[-1
																									+ i_127_] != null)
																						Class60.stringStack[stringStackCount++] = class37_sub4_sub1.groundActions[i_127_ - 1];
																					else
																						Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				} else if (opcode == 4202) {
																					intStackCount -= 2;
																					int i_128_ = Class14.intStack[intStackCount];
																					int i_129_ = Class14.intStack[1 + intStackCount];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_128_,
																									(byte) 105);
																					if ((i_129_ ^ 0xffffffff) <= -2
																							&& (i_129_ ^ 0xffffffff) >= -6
																							&& class37_sub4_sub1.actions[-1
																									+ i_129_] != null)
																						Class60.stringStack[stringStackCount++] = class37_sub4_sub1.actions[i_129_ - 1];
																					else
																						Class60.stringStack[stringStackCount++] = Class3.aClass16_87;
																				} else if (opcode == 4203) {
																					int i_130_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = Class46
																							.loadItem(
																									i_130_,
																									(byte) 89).value;
																				} else if ((opcode ^ 0xffffffff) == -4205) {
																					int i_131_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = (Class46
																							.loadItem(
																									i_131_,
																									(byte) 125).stackable ^ 0xffffffff) == -2 ? 1
																							: 0;
																				} else if ((opcode ^ 0xffffffff) == -4206) {
																					int i_132_ = Class14.intStack[--intStackCount];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_132_,
																									(byte) 107);
																					if (class37_sub4_sub1.certTemplateID == -1
																							&& class37_sub4_sub1.certID >= 0)
																						Class14.intStack[intStackCount++] = class37_sub4_sub1.certID;
																					else
																						Class14.intStack[intStackCount++] = i_132_;
																				} else if (opcode == 4206) {
																					int i_133_ = Class14.intStack[--intStackCount];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_133_,
																									(byte) 108);
																					if ((class37_sub4_sub1.certTemplateID ^ 0xffffffff) <= -1
																							&& class37_sub4_sub1.certID >= 0)
																						Class14.intStack[intStackCount++] = class37_sub4_sub1.certID;
																					else
																						Class14.intStack[intStackCount++] = i_133_;
																				} else if ((opcode ^ 0xffffffff) == -4208) {
																					int i_134_ = Class14.intStack[--intStackCount];
																					Class14.intStack[intStackCount++] = !Class46
																							.loadItem(
																									i_134_,
																									(byte) 108).membersObject ? 0
																							: 1;
																				} else if (opcode == 4210) {
																					int i_135_ = Class14.intStack[--intStackCount];
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					Class86
																							.method1323(
																									(byte) 103,
																									rSString,
																									i_135_ == 1);
																					Class14.intStack[intStackCount++] = InterfaceClickMask.anInt1980;
																				} else if (opcode == 4211) {
																					if (Class78.aShortArray1459 != null
																							&& (InterfaceClickMask.anInt1980 ^ 0xffffffff) < (MouseHandler.anInt172 ^ 0xffffffff))
																						Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																								.method490(
																										Class78.aShortArray1459[MouseHandler.anInt172++],
																										65535);
																					else
																						Class14.intStack[intStackCount++] = -1;
																				} else {
																					if ((opcode ^ 0xffffffff) != -4213)
																						break;
																					MouseHandler.anInt172 = 0;
																				}
																			} else {
																				if ((opcode ^ 0xffffffff) <= -5101)
																					break;
																				if (opcode == 5000)
																					Class14.intStack[intStackCount++] = Class37_Sub9_Sub24.anInt3361;
																				else if ((opcode ^ 0xffffffff) == -5002) {
																					intStackCount -= 3;
																					Class37_Sub9_Sub24.anInt3361 = Class14.intStack[intStackCount];
																					Class8.anInt165 = Class14.intStack[1 + intStackCount];
																					Class37_Sub9_Sub15.anInt3169 = Class14.intStack[intStackCount + 2];
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									251);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									119,
																									Class37_Sub9_Sub24.anInt3361);
																					Class2.anInt73++;
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									105,
																									Class8.anInt165);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									108,
																									Class37_Sub9_Sub15.anInt3169);
																				} else if (opcode == 5002) {
																					intStackCount -= 2;
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					int i_136_ = Class14.intStack[intStackCount
																							- -1];
																					Class87.anInt1591++;
																					int i_137_ = Class14.intStack[intStackCount];
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									198);
																					Class42.aClass37_Sub11_Sub1_936
																							.method949(
																									rSString
																											.method152(-96),
																									(byte) -93);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									124,
																									i_137_ - 1);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									108,
																									i_136_);
																				} else if ((opcode ^ 0xffffffff) == -5004) {
																					int i_138_ = Class14.intStack[--intStackCount];
																					RSString rSString = null;
																					if (i_138_ < 100)
																						rSString = ByteVector.aClass16Array2041[i_138_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.stringStack[stringStackCount++] = rSString;
																				} else if (opcode == 5004) {
																					int i_139_ = Class14.intStack[--intStackCount];
																					int i_140_ = -1;
																					if (i_139_ < 100
																							&& ByteVector.aClass16Array2041[i_139_] != null)
																						i_140_ = Class41.anIntArray902[i_139_];
																					Class14.intStack[intStackCount++] = i_140_;
																				} else if ((opcode ^ 0xffffffff) == -5006)
																					Class14.intStack[intStackCount++] = Class8.anInt165;
																				else if (opcode == 5008) {
																					RSString rSString = Class60.stringStack[--stringStackCount];
																					if (rSString
																							.method165(
																									Class89.aClass16_1612,
																									52))
																						Class37_Sub9_Sub22
																								.method860(
																										rSString,
																										false);
																					else {
																						Class78.anInt1460++;
																						RSString class16_141_ = rSString
																								.method147(12131);
																						int i_142_ = 0;
																						int i_143_ = 0;
																						if (!class16_141_
																								.method165(
																										Class37_Sub9_Sub15.aClass16_3181,
																										52)) {
																							if (!class16_141_
																									.method165(
																											InventoryDef.aClass16_2878,
																											52)) {
																								if (!class16_141_
																										.method165(
																												Class37_Sub9_Sub18.aClass16_3235,
																												52)) {
																									if (!class16_141_
																											.method165(
																													Class37_Sub5.aClass16_1873,
																													52)) {
																										if (class16_141_
																												.method165(
																														Class37_Sub9_Sub18.aClass16_3243,
																														52)) {
																											i_142_ = 4;
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub18.aClass16_3243
																																	.length(),
																															-1);
																										} else if (class16_141_
																												.method165(
																														Class20.aClass16_539,
																														52)) {
																											rSString = rSString
																													.method158(
																															Class20.aClass16_539
																																	.length(),
																															-1);
																											i_142_ = 5;
																										} else if (class16_141_
																												.method165(
																														Class37_Sub9_Sub37.aClass16_3592,
																														52)) {
																											i_142_ = 6;
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub37.aClass16_3592
																																	.length(),
																															-1);
																										} else if (class16_141_
																												.method165(
																														Applet_Sub1.aClass16_35,
																														52)) {
																											rSString = rSString
																													.method158(
																															Applet_Sub1.aClass16_35
																																	.length(),
																															-1);
																											i_142_ = 7;
																										} else if (class16_141_
																												.method165(
																														Class73.aClass16_1386,
																														52)) {
																											i_142_ = 8;
																											rSString = rSString
																													.method158(
																															Class73.aClass16_1386
																																	.length(),
																															-1);
																										} else if (!class16_141_
																												.method165(
																														Class37_Sub9_Sub7.aClass16_3030,
																														52)) {
																											if (!class16_141_
																													.method165(
																															Class17.aClass16_310,
																															52)) {
																												if (!class16_141_
																														.method165(
																																Deque.aClass16_1115,
																																52)) {
																													if (Class37_Sub9_Sub25.anInt3382 != 0) {
																														if (class16_141_
																																.method165(
																																		Class37_Sub9_Sub15.aClass16_3178,
																																		52)) {
																															rSString = rSString
																																	.method158(
																																			Class37_Sub9_Sub15.aClass16_3178
																																					.length(),
																																			-1);
																															i_142_ = 0;
																														} else if (!class16_141_
																																.method165(
																																		InventoryDef.aClass16_2882,
																																		52)) {
																															if (class16_141_
																																	.method165(
																																			Class37_Sub9_Sub18.aClass16_3230,
																																			52)) {
																																i_142_ = 2;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub9_Sub18.aClass16_3230
																																						.length(),
																																				-1);
																															} else if (class16_141_
																																	.method165(
																																			Class37_Sub5.aClass16_1872,
																																			52)) {
																																i_142_ = 3;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub5.aClass16_1872
																																						.length(),
																																				-1);
																															} else if (!class16_141_
																																	.method165(
																																			Class37_Sub9_Sub18.aClass16_3234,
																																			52)) {
																																if (!class16_141_
																																		.method165(
																																				Class20.aClass16_557,
																																				52)) {
																																	if (!class16_141_
																																			.method165(
																																					Class37_Sub9_Sub37.aClass16_3588,
																																					52)) {
																																		if (class16_141_
																																				.method165(
																																						Applet_Sub1.aClass16_4,
																																						52)) {
																																			i_142_ = 7;
																																			rSString = rSString
																																					.method158(
																																							Applet_Sub1.aClass16_4
																																									.length(),
																																							-1);
																																		} else if (class16_141_
																																				.method165(
																																						Class73.aClass16_1392,
																																						52)) {
																																			rSString = rSString
																																					.method158(
																																							Class73.aClass16_1392
																																									.length(),
																																							-1);
																																			i_142_ = 8;
																																		} else if (!class16_141_
																																				.method165(
																																						Class37_Sub9_Sub7.aClass16_3042,
																																						52)) {
																																			if (class16_141_
																																					.method165(
																																							Class17.aClass16_311,
																																							52)) {
																																				rSString = rSString
																																						.method158(
																																								Class17.aClass16_311
																																										.length(),
																																								-1);
																																				i_142_ = 10;
																																			} else if (class16_141_
																																					.method165(
																																							Deque.aClass16_1104,
																																							52)) {
																																				i_142_ = 11;
																																				rSString = rSString
																																						.method158(
																																								Deque.aClass16_1104
																																										.length(),
																																								-1);
																																			}
																																		} else {
																																			rSString = rSString
																																					.method158(
																																							Class37_Sub9_Sub7.aClass16_3042
																																									.length(),
																																							-1);
																																			i_142_ = 9;
																																		}
																																	} else {
																																		rSString = rSString
																																				.method158(
																																						Class37_Sub9_Sub37.aClass16_3588
																																								.length(),
																																						-1);
																																		i_142_ = 6;
																																	}
																																} else {
																																	rSString = rSString
																																			.method158(
																																					Class20.aClass16_557
																																							.length(),
																																					-1);
																																	i_142_ = 5;
																																}
																															} else {
																																i_142_ = 4;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub9_Sub18.aClass16_3234
																																						.length(),
																																				-1);
																															}
																														} else {
																															i_142_ = 1;
																															rSString = rSString
																																	.method158(
																																			InventoryDef.aClass16_2882
																																					.length(),
																																			-1);
																														}
																													}
																												} else {
																													i_142_ = 11;
																													rSString = rSString
																															.method158(
																																	Deque.aClass16_1115
																																			.length(),
																																	-1);
																												}
																											} else {
																												i_142_ = 10;
																												rSString = rSString
																														.method158(
																																Class17.aClass16_310
																																		.length(),
																																-1);
																											}
																										} else {
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub7.aClass16_3030
																																	.length(),
																															-1);
																											i_142_ = 9;
																										}
																									} else {
																										i_142_ = 3;
																										rSString = rSString
																												.method158(
																														Class37_Sub5.aClass16_1873
																																.length(),
																														-1);
																									}
																								} else {
																									rSString = rSString
																											.method158(
																													Class37_Sub9_Sub18.aClass16_3235
																															.length(),
																													-1);
																									i_142_ = 2;
																								}
																							} else {
																								rSString = rSString
																										.method158(
																												InventoryDef.aClass16_2878
																														.length(),
																												-1);
																								i_142_ = 1;
																							}
																						} else {
																							rSString = rSString
																									.method158(
																											Class37_Sub9_Sub15.aClass16_3181
																													.length(),
																											-1);
																							i_142_ = 0;
																						}
																						class16_141_ = rSString
																								.method147(12131);
																						if (!class16_141_
																								.method165(
																										Class37_Sub4_Sub15.aClass16_2827,
																										52)) {
																							if (class16_141_
																									.method165(
																											Class60.aClass16_1159,
																											52)) {
																								i_143_ = 2;
																								rSString = rSString
																										.method158(
																												Class60.aClass16_1159
																														.length(),
																												-1);
																							} else if (class16_141_
																									.method165(
																											Class37_Sub9_Sub6.aClass16_3017,
																											52)) {
																								i_143_ = 3;
																								rSString = rSString
																										.method158(
																												Class37_Sub9_Sub6.aClass16_3017
																														.length(),
																												-1);
																							} else if (class16_141_
																									.method165(
																											Class6.aClass16_140,
																											52)) {
																								i_143_ = 4;
																								rSString = rSString
																										.method158(
																												Class6.aClass16_140
																														.length(),
																												-1);
																							} else if (class16_141_
																									.method165(
																											InterfaceClickMask.aClass16_1983,
																											52)) {
																								i_143_ = 5;
																								rSString = rSString
																										.method158(
																												InterfaceClickMask.aClass16_1983
																														.length(),
																												-1);
																							} else if ((Class37_Sub9_Sub25.anInt3382 ^ 0xffffffff) != -1) {
																								if (class16_141_
																										.method165(
																												Class37_Sub4_Sub15.aClass16_2816,
																												52)) {
																									i_143_ = 1;
																									rSString = rSString
																											.method158(
																													Class37_Sub4_Sub15.aClass16_2816
																															.length(),
																													-1);
																								} else if (!class16_141_
																										.method165(
																												Class60.aClass16_1147,
																												52)) {
																									if (class16_141_
																											.method165(
																													Class37_Sub9_Sub6.aClass16_3024,
																													52)) {
																										rSString = rSString
																												.method158(
																														Class37_Sub9_Sub6.aClass16_3024
																																.length(),
																														-1);
																										i_143_ = 3;
																									} else if (!class16_141_
																											.method165(
																													Class6.aClass16_134,
																													52)) {
																										if (class16_141_
																												.method165(
																														InterfaceClickMask.aClass16_1999,
																														52)) {
																											rSString = rSString
																													.method158(
																															InterfaceClickMask.aClass16_1999
																																	.length(),
																															-1);
																											i_143_ = 5;
																										}
																									} else {
																										i_143_ = 4;
																										rSString = rSString
																												.method158(
																														Class6.aClass16_134
																																.length(),
																														-1);
																									}
																								} else {
																									i_143_ = 2;
																									rSString = rSString
																											.method158(
																													Class60.aClass16_1147
																															.length(),
																													-1);
																								}
																							}
																						} else {
																							i_143_ = 1;
																							rSString = rSString
																									.method158(
																											Class37_Sub4_Sub15.aClass16_2827
																													.length(),
																											-1);
																						}
																						Class42.aClass37_Sub11_Sub1_936
																								.method989(
																										52);
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										124,
																										0);
																						int i_144_ = Class42.aClass37_Sub11_Sub1_936.pos;
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										103,
																										i_142_);
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										120,
																										i_143_);
																						Class37_Sub9_Sub18
																								.method837(
																										Class42.aClass37_Sub11_Sub1_936,
																										1,
																										rSString);
																						Class42.aClass37_Sub11_Sub1_936
																								.method948(
																										-i_144_
																												+ Class42.aClass37_Sub11_Sub1_936.pos);
																					}
																				} else if ((opcode ^ 0xffffffff) == -5010) {
																					stringStackCount -= 2;
																					RSString rSString = Class60.stringStack[stringStackCount + 1];
																					RSString class16_145_ = Class60.stringStack[stringStackCount];
																					Class37_Sub9_Sub36.anInt3581++;
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									252);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									101,
																									0);
																					int i_146_ = Class42.aClass37_Sub11_Sub1_936.pos;
																					Class42.aClass37_Sub11_Sub1_936
																							.method949(
																									class16_145_
																											.method152(-89),
																									(byte) -104);
																					Class37_Sub9_Sub18
																							.method837(
																									Class42.aClass37_Sub11_Sub1_936,
																									1,
																									rSString);
																					Class42.aClass37_Sub11_Sub1_936
																							.method948(
																									-i_146_
																											+ Class42.aClass37_Sub11_Sub1_936.pos);
																				} else if (opcode == 5010) {
																					int i_147_ = Class14.intStack[--intStackCount];
																					RSString rSString = null;
																					if ((i_147_ ^ 0xffffffff) > -101)
																						rSString = Class37_Sub9_Sub29.aClass16Array3450[i_147_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.stringStack[stringStackCount++] = rSString;
																				} else if (opcode == 5011) {
																					int i_148_ = Class14.intStack[--intStackCount];
																					RSString rSString = null;
																					if (i_148_ < 100)
																						rSString = Class37_Sub12.aClass16Array2093[i_148_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.stringStack[stringStackCount++] = rSString;
																				} else if (opcode == 5015) {
																					RSString rSString;
																					if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 != null
																							&& Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993 != null)
																						rSString = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993;
																					else
																						rSString = Class37_Sub9_Sub33.aClass16_3526;
																					Class60.stringStack[stringStackCount++] = rSString;
																				} else if (opcode == 5016)
																					Class14.intStack[intStackCount++] = Class37_Sub9_Sub15.anInt3169;
																				else {
																					if (opcode != 5017)
																						break;
																					Class14.intStack[intStackCount++] = Class8.anInt168;
																				}
																			}
																		} else if ((opcode ^ 0xffffffff) == -4001) {
																			intStackCount -= 2;
																			int i_149_ = Class14.intStack[intStackCount];
																			int i_150_ = Class14.intStack[intStackCount
																					- -1];
																			Class14.intStack[intStackCount++] = i_150_
																					+ i_149_;
																		} else if ((opcode ^ 0xffffffff) == -4002) {
																			intStackCount -= 2;
																			int i_151_ = Class14.intStack[1 + intStackCount];
																			int i_152_ = Class14.intStack[intStackCount];
																			Class14.intStack[intStackCount++] = -i_151_
																					+ i_152_;
																		} else if ((opcode ^ 0xffffffff) == -4003) {
																			intStackCount -= 2;
																			int i_153_ = Class14.intStack[intStackCount];
																			int i_154_ = Class14.intStack[1 + intStackCount];
																			Class14.intStack[intStackCount++] = i_154_
																					* i_153_;
																		} else if (opcode == 4003) {
																			intStackCount -= 2;
																			int i_155_ = Class14.intStack[1 + intStackCount];
																			int i_156_ = Class14.intStack[intStackCount];
																			Class14.intStack[intStackCount++] = i_156_
																					/ i_155_;
																		} else if ((opcode ^ 0xffffffff) == -4005) {
																			int i_157_ = Class14.intStack[--intStackCount];
																			Class14.intStack[intStackCount++] = (int) (Math
																					.random() * (double) i_157_);
																		} else if ((opcode ^ 0xffffffff) == -4006) {
																			int i_158_ = Class14.intStack[--intStackCount];
																			Class14.intStack[intStackCount++] = (int) (Math
																					.random() * (double) (1 + i_158_));
																		} else if (opcode == 4006) {
																			intStackCount -= 5;
																			int i_159_ = Class14.intStack[intStackCount];
																			int i_160_ = Class14.intStack[2 + intStackCount];
																			int i_161_ = Class14.intStack[intStackCount
																					- -1];
																			int i_162_ = Class14.intStack[3 + intStackCount];
																			int i_163_ = Class14.intStack[intStackCount + 4];
																			Class14.intStack[intStackCount++] = (-i_159_ + i_161_)
																					* (i_163_ - i_160_)
																					/ (i_162_ - i_160_)
																					+ i_159_;
																		} else if (opcode == 4007) {
																			intStackCount -= 2;
																			int i_164_ = Class14.intStack[intStackCount];
																			int i_165_ = Class14.intStack[intStackCount
																					- -1];
																			Class14.intStack[intStackCount++] = i_164_
																					+ i_164_
																					* i_165_
																					/ 100;
																		} else if ((opcode ^ 0xffffffff) == -4009) {
																			intStackCount -= 2;
																			int i_166_ = Class14.intStack[intStackCount];
																			int i_167_ = Class14.intStack[intStackCount + 1];
																			Class14.intStack[intStackCount++] = Class37_Sub9_Sub13
																					.method817(
																							i_166_,
																							1 << i_167_);
																		} else if ((opcode ^ 0xffffffff) == -4010) {
																			intStackCount -= 2;
																			int i_168_ = Class14.intStack[intStackCount];
																			int i_169_ = Class14.intStack[1 + intStackCount];
																			Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																					.method490(
																							i_168_,
																							-(1 << i_169_)
																									+ -1);
																		} else if (opcode == 4010) {
																			intStackCount -= 2;
																			int i_170_ = Class14.intStack[intStackCount];
																			int i_171_ = Class14.intStack[1 + intStackCount];
																			Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																					.method490(
																							1 << i_171_,
																							i_170_) == 0 ? 0
																					: 1;
																		} else if ((opcode ^ 0xffffffff) == -4012) {
																			intStackCount -= 2;
																			int i_172_ = Class14.intStack[intStackCount
																					- -1];
																			int i_173_ = Class14.intStack[intStackCount];
																			Class14.intStack[intStackCount++] = i_173_
																					% i_172_;
																		} else if (opcode == 4012) {
																			intStackCount -= 2;
																			int i_174_ = Class14.intStack[intStackCount];
																			int i_175_ = Class14.intStack[1 + intStackCount];
																			if (i_174_ == 0)
																				Class14.intStack[intStackCount++] = 0;
																			else
																				Class14.intStack[intStackCount++] = (int) Math
																						.pow(
																								(double) i_174_,
																								(double) i_175_);
																		} else if ((opcode ^ 0xffffffff) == -4014) {
																			intStackCount -= 2;
																			int i_176_ = Class14.intStack[intStackCount
																					- -1];
																			int i_177_ = Class14.intStack[intStackCount];
																			if (i_177_ != 0) {
																				if ((i_176_ ^ 0xffffffff) == -1)
																					Class14.intStack[intStackCount++] = 2147483647;
																				else
																					Class14.intStack[intStackCount++] = (int) Math
																							.pow(
																									(double) i_177_,
																									1.0 / (double) i_176_);
																			} else
																				Class14.intStack[intStackCount++] = 0;
																		} else if ((opcode ^ 0xffffffff) == -4015) {
																			intStackCount -= 2;
																			int i_178_ = Class14.intStack[intStackCount];
																			int i_179_ = Class14.intStack[1 + intStackCount];
																			Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																					.method490(
																							i_178_,
																							i_179_);
																		} else if ((opcode ^ 0xffffffff) == -4016) {
																			intStackCount -= 2;
																			int i_180_ = Class14.intStack[intStackCount];
																			int i_181_ = Class14.intStack[intStackCount + 1];
																			Class14.intStack[intStackCount++] = Class37_Sub9_Sub13
																					.method817(
																							i_180_,
																							i_181_);
																		} else if ((opcode ^ 0xffffffff) == -4017) {
																			intStackCount -= 2;
																			int i_182_ = Class14.intStack[intStackCount
																					- -1];
																			int i_183_ = Class14.intStack[intStackCount];
																			Class14.intStack[intStackCount++] = i_182_ > i_183_ ? i_183_
																					: i_182_;
																		} else if ((opcode ^ 0xffffffff) == -4018) {
																			intStackCount -= 2;
																			int i_184_ = Class14.intStack[1 + intStackCount];
																			int i_185_ = Class14.intStack[intStackCount];
																			Class14.intStack[intStackCount++] = i_184_ >= i_185_ ? i_184_
																					: i_185_;
																		} else {
																			if ((opcode ^ 0xffffffff) != -4019)
																				break;
																			intStackCount -= 3;
																			long l = (long) Class14.intStack[intStackCount];
																			long l_186_ = (long) Class14.intStack[intStackCount
																					- -1];
																			long l_187_ = (long) Class14.intStack[intStackCount + 2];
																			Class14.intStack[intStackCount++] = (int) (l
																					* l_187_ / l_186_);
																		}
																	} else if (opcode == 3300)
																		Class14.intStack[intStackCount++] = Class37_Sub7.loopCycle;
																	else if ((opcode ^ 0xffffffff) == -3302) {
																		intStackCount -= 2;
																		int i_188_ = Class14.intStack[intStackCount];
																		int i_189_ = Class14.intStack[1 + intStackCount];
																		Class14.intStack[intStackCount++] = Class37_Sub9_Sub36
																				.method919(
																						i_189_,
																						i_188_,
																						-32594);
																	} else if ((opcode ^ 0xffffffff) == -3303) {
																		intStackCount -= 2;
																		int i_190_ = Class14.intStack[1 + intStackCount];
																		int i_191_ = Class14.intStack[intStackCount];
																		Class14.intStack[intStackCount++] = Class66
																				.method1189(
																						i_191_,
																						true,
																						i_190_);
																	} else if ((opcode ^ 0xffffffff) == -3304) {
																		intStackCount -= 2;
																		int i_192_ = Class14.intStack[intStackCount + 1];
																		int i_193_ = Class14.intStack[intStackCount];
																		Class14.intStack[intStackCount++] = Hashtable
																				.method95(
																						i_193_,
																						i_192_);
																	} else if ((opcode ^ 0xffffffff) == -3305) {
																		int i_194_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class17
																				.list(
																						i_194_).size;
																	} else if (opcode == 3305) {
																		int i_195_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class82.anIntArray1696[i_195_];
																	} else if ((opcode ^ 0xffffffff) == -3307) {
																		int i_196_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class68.anIntArray1324[i_196_];
																	} else if ((opcode ^ 0xffffffff) == -3308) {
																		int i_197_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class37_Sub12.anIntArray2104[i_197_];
																	} else if ((opcode ^ 0xffffffff) == -3309) {
																		int i_198_ = Class37_Sub9_Sub1.anInt2916;
																		int i_199_ = Class37_Sub18.anInt2200;
																				//+ (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> -651563033);
																		int i_200_ =  Class15_Sub1.anInt1738;
																		//(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> 1281074887)//TODO contains player stuff so i disabled it
																		Class14.intStack[intStackCount++] = (i_199_ << -329142386)
																				+ ((i_198_ << 2035032892) + i_200_);
																	} else if (opcode == 3309) {
																		int i_201_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																				.method490(
																						268423538,
																						i_201_) >> -733611250;
																	} else if ((opcode ^ 0xffffffff) == -3311) {
																		int i_202_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = i_202_ >> -1791349668;
																	} else if ((opcode ^ 0xffffffff) == -3312) {
																		int i_203_ = Class14.intStack[--intStackCount];
																		Class14.intStack[intStackCount++] = Class37_Sub4_Sub7
																				.method490(
																						i_203_,
																						16383);
																	} else if ((opcode ^ 0xffffffff) == -3313)
																		Class14.intStack[intStackCount++] = !Class37_Sub4_Sub13.aBoolean2791 ? 0
																				: 1;
																	else if (opcode == 3313) {
																		intStackCount -= 2;
																		int i_204_ = Class14.intStack[intStackCount] + 32768;
																		int i_205_ = Class14.intStack[intStackCount + 1];
																		Class14.intStack[intStackCount++] = Class37_Sub9_Sub36
																				.method919(
																						i_205_,
																						i_204_,
																						-32594);
																	} else if ((opcode ^ 0xffffffff) == -3315) {
																		intStackCount -= 2;
																		int i_206_ = 32768 + Class14.intStack[intStackCount];
																		int i_207_ = Class14.intStack[1 + intStackCount];
																		Class14.intStack[intStackCount++] = Class66
																				.method1189(
																						i_206_,
																						true,
																						i_207_);
																	} else if ((opcode ^ 0xffffffff) == -3316) {
																		intStackCount -= 2;
																		int i_208_ = Class14.intStack[intStackCount + 1];
																		int i_209_ = Class14.intStack[intStackCount]
																				- -32768;
																		Class14.intStack[intStackCount++] = Hashtable
																				.method95(
																						i_209_,
																						i_208_);
																	} else if (opcode == 3316) {
																		if ((Class37_Sub9_Sub20.anInt3301 ^ 0xffffffff) > -3)
																			Class14.intStack[intStackCount++] = 0;
																		else
																			Class14.intStack[intStackCount++] = Class37_Sub9_Sub20.anInt3301;
																	} else if ((opcode ^ 0xffffffff) == -3318)
																		Class14.intStack[intStackCount++] = Class37_Sub9_Sub16.anInt3201;
																	else if ((opcode ^ 0xffffffff) == -3319)
																		Class14.intStack[intStackCount++] = Class37_Sub9_Sub19.anInt3272;
																	else if ((opcode ^ 0xffffffff) == -3322)
																		Class14.intStack[intStackCount++] = Class37_Sub4_Sub16.anInt2864;
																	else if (opcode == 3322)
																		Class14.intStack[intStackCount++] = Class33.anInt761;
																	else if (opcode == 3323) {
																		if ((Class37_Sub9_Sub20.anInt3301 ^ 0xffffffff) == -2)
																			Class14.intStack[intStackCount++] = 1;
																		else
																			Class14.intStack[intStackCount++] = 0;
																	} else {
																		if (opcode != 3325)
																			break;
																		if (Class37_Sub12.anInt2077 > 0)
																			Class14.intStack[intStackCount++] = 1;
																		else
																			Class14.intStack[intStackCount++] = 0;
																	}
																} else if (opcode == 3200) {
																	intStackCount -= 3;
																	Class66
																			.method1190(
																					(byte) -100,
																					(Class14.intStack[2 + intStackCount]),
																					(Class14.intStack[1 + intStackCount]),
																					(Class14.intStack[intStackCount]));
																} else if (opcode == 3201)
																	Class37_Sub9_Sub10
																			.method805(
																					(byte) -75,
																					(Class14.intStack[--intStackCount]));
																else {
																	if ((opcode ^ 0xffffffff) != -3203)
																		break;
																	intStackCount -= 2;
																	Class37_Sub4_Sub8
																			.method574(
																					(Class14.intStack[1 + intStackCount]),
																					true,
																					(Class14.intStack[intStackCount]));
																}
															} else if ((opcode ^ 0xffffffff) == -2701) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.intStack[--intStackCount])));
																Class14.intStack[intStackCount++] = (rSInterface.itemId);
															} else if (opcode == 2701) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.intStack[--intStackCount])));
																if ((rSInterface.itemId) == -1)
																	Class14.intStack[intStackCount++] = 0;
																else
																	Class14.intStack[intStackCount++] = (rSInterface.itemZoom);
															} else if (opcode == 2702) {
																int i_210_ = (Class14.intStack[--intStackCount]);
																OverridedInterface class37_sub6 = ((OverridedInterface) (Class76.overridedInterfaces.get((long) i_210_)));
																if (class37_sub6 != null)
																	Class14.intStack[intStackCount++] = 1;
																else
																	Class14.intStack[intStackCount++] = 0;
															} else {
																if ((opcode ^ 0xffffffff) != -2704)
																	break;
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.intStack[--intStackCount])));
																if ((rSInterface.aClass18Array450) == null)
																	Class14.intStack[intStackCount++] = 0;
																else {
																	int i_211_ = (rSInterface.aClass18Array450).length;
																	for (int i_212_ = 0; (i_212_ < rSInterface.aClass18Array450.length); i_212_++) {
																		if ((rSInterface.aClass18Array450[i_212_]) == null) {
																			i_211_ = i_212_;
																			break;
																		}
																	}
																	Class14.intStack[intStackCount++] = i_211_;
																}
															}
														} else {
															RSInterface rSInterface = (Class37_Sub9_Sub14
																	.getInterface(
																			(Class14.intStack[--intStackCount])));
															if (opcode == 2500)
																Class14.intStack[intStackCount++] = (rSInterface.x);
															else if (opcode == 2501)
																Class14.intStack[intStackCount++] = (rSInterface.y);
															else if (opcode == 2502)
																Class14.intStack[intStackCount++] = (rSInterface.width);
															else if (opcode == 2503)
																Class14.intStack[intStackCount++] = (rSInterface.height);
															else if (opcode == 2504)
																Class14.intStack[intStackCount++] = (rSInterface.hidden ? 1 : 0);
															else {
																if (opcode != 2505)
																	break;
																Class14.intStack[intStackCount++] = (rSInterface.parentId);
															}
														}
													} else {
														RSInterface rSInterface = (bool ? (Class1.aClass18_61)
																: (Class47.aClass18_995));
														if ((opcode ^ 0xffffffff) == -1801)
															Class14.intStack[intStackCount++] = (Class10
																	.method85(
																			(RuntimeException_Sub1
																					.get_click_mask(
																							rSInterface)),
																			false));
														else if (opcode == 1801) {
															int i_213_ = (Class14.intStack[--intStackCount]);
															i_213_--;
															if (((rSInterface.niActions) != null)
																	&& ((rSInterface.niActions).length > i_213_)
																	&& ((rSInterface.niActions[i_213_]) != null))
																Class60.stringStack[stringStackCount++] = (rSInterface.niActions[i_213_]);
															else
																Class60.stringStack[stringStackCount++] = (Class3.aClass16_87);
														} else {
															if ((opcode ^ 0xffffffff) != -1803)
																break;
															if ((rSInterface.action_name) != null)
																Class60.stringStack[stringStackCount++] = (rSInterface.action_name);
															else
																Class60.stringStack[stringStackCount++] = (Class3.aClass16_87);
														}
													}
												} else {
													RSInterface rSInterface = (bool ? Class1.aClass18_61
															: (Class47.aClass18_995));
													if (opcode == 1700)
														Class14.intStack[intStackCount++] = rSInterface.itemId;
													else if ((opcode ^ 0xffffffff) == -1702) {
														if (rSInterface.itemId == -1)
															Class14.intStack[intStackCount++] = 0;
														else
															Class14.intStack[intStackCount++] = (rSInterface.itemZoom);
													} else {
														if ((opcode ^ 0xffffffff) != -1703)
															break;
														Class14.intStack[intStackCount++] = rSInterface.anInt334;
													}
												}
											} else {
												RSInterface rSInterface = (!bool ? Class47.aClass18_995
														: Class1.aClass18_61);
												if (opcode == 1600)
													Class14.intStack[intStackCount++] = rSInterface.horizontalScrollPosition;
												else if (opcode == 1601)
													Class14.intStack[intStackCount++] = rSInterface.verticalScrollPosition;
												else if (opcode == 1602)
													Class60.stringStack[stringStackCount++] = rSInterface.disabledText;
												else if (opcode == 1603)
													Class14.intStack[intStackCount++] = rSInterface.maxScrollHorizontal;
												else if (opcode == 1604)
													Class14.intStack[intStackCount++] = rSInterface.maxScrollVertical;
												else if (opcode == 1605)
													Class14.intStack[intStackCount++] = rSInterface.zoom;
												else if (opcode == 1606)
													Class14.intStack[intStackCount++] = rSInterface.rotateX;
												else if (opcode == 1607)
													Class14.intStack[intStackCount++] = rSInterface.rotateZ;
												else {
													if ((opcode ^ 0xffffffff) != -1609)
														break;
													Class14.intStack[intStackCount++] = rSInterface.rotateY;
												}
											}
										} else {
											RSInterface rSInterface = (bool ? Class1.aClass18_61
													: Class47.aClass18_995);
											if (opcode == 1500)
												Class14.intStack[intStackCount++] = rSInterface.x;
											else if (opcode == 1501)
												Class14.intStack[intStackCount++] = rSInterface.y;
											else if (opcode == 1502)
												Class14.intStack[intStackCount++] = rSInterface.width;
											else if (opcode == 1503)
												Class14.intStack[intStackCount++] = rSInterface.height;
											else if (opcode == 1504)
												Class14.intStack[intStackCount++] = rSInterface.hidden ? 1 : 0;
											else {
												if (opcode != 1505)
													break;
												Class14.intStack[intStackCount++] = rSInterface.parentId;
											}
										}
									} else {
										RSInterface rSInterface;
										if ((opcode ^ 0xffffffff) <= -2001) {
											opcode -= 1000;
											int id = Class14.intStack[--intStackCount];
											rSInterface = (Class37_Sub9_Sub14
													.getInterface(id));
										} else
											rSInterface = (bool ? Class1.aClass18_61
													: Class47.aClass18_995);
										if (opcode == 1300) {
											int i_214_ = (Class14.intStack[--intStackCount]) - 1;
											RSString string = Class60.stringStack[--stringStackCount];
											if (i_214_ < 0 || i_214_ > 9)
												stringStackCount--;
											else {
												rSInterface.addAction(string, i_214_);
											}
										} else if (opcode == 1301) {
											intStackCount -= 2;
											int i_215_ = (Class14.intStack[intStackCount + 1]);
											int i_216_ = Class14.intStack[intStackCount];
											rSInterface.aClass18_413 = (Class37_Sub9_Sub35
													.method914(i_216_,
															i_215_));
										} else if (opcode == 1302)
											rSInterface.modifyDraggingAlpha = (Class14.intStack[--intStackCount]) == 1;
										else if (opcode == 1303)
											rSInterface.anInt378 = (Class14.intStack[--intStackCount]);
										else if (opcode == 1304)
											rSInterface.anInt350 = (Class14.intStack[--intStackCount]);
										else if (opcode == 1305)
											rSInterface.action_name = (Class60.stringStack[--stringStackCount]);
										else if (opcode == 1306)
											rSInterface.selectedActionName = (Class60.stringStack[--stringStackCount]);
										else {
											if (opcode != 1307)
												break;
											rSInterface.niActions = null;
										}
									}
								} else {
									RSInterface rSInterface;
									if (opcode < 2000)
										rSInterface = (bool ? Class1.aClass18_61
												: Class47.aClass18_995);
									else {
										opcode -= 1000;
										rSInterface = (Class37_Sub9_Sub14
												.getInterface(
														Class14.intStack[--intStackCount]));
									}
									if (opcode == 1100) {
										intStackCount -= 2;
										rSInterface.horizontalScrollPosition = Class14.intStack[intStackCount];
										if ((rSInterface.horizontalScrollPosition ^ 0xffffffff) < ((-rSInterface.width + rSInterface.maxScrollHorizontal) ^ 0xffffffff))
											rSInterface.horizontalScrollPosition = (-rSInterface.width + rSInterface.maxScrollHorizontal);
										if (rSInterface.horizontalScrollPosition < 0)
											rSInterface.horizontalScrollPosition = 0;
										rSInterface.verticalScrollPosition = Class14.intStack[1 + intStackCount];
										if (((-rSInterface.height + rSInterface.maxScrollVertical) ^ 0xffffffff) > (rSInterface.verticalScrollPosition ^ 0xffffffff))
											rSInterface.verticalScrollPosition = (rSInterface.maxScrollVertical + -rSInterface.height);
										if ((rSInterface.verticalScrollPosition ^ 0xffffffff) > -1)
											rSInterface.verticalScrollPosition = 0;
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1101) {
										rSInterface.disabledColor = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1102) {
										rSInterface.filled = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1103) {
										rSInterface.alpha = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1104) {
										rSInterface.thickness = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1105) {
										rSInterface.disabledSprite = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1106) {
										rSInterface.rotation = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1107) {
										rSInterface.gridOriginal = (Class14.intStack[--intStackCount] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1108) {
										rSInterface.modelTypeDisabled = 1;
										rSInterface.mediaIdDisabled = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1109) {
										intStackCount -= 6;
										rSInterface.offsetX = Class14.intStack[intStackCount];
										rSInterface.offsetY = (Class14.intStack[intStackCount
												- -1]);
										rSInterface.rotateX = Class14.intStack[2 + intStackCount];
										rSInterface.rotateY = Class14.intStack[intStackCount + 3];
										rSInterface.rotateZ = Class14.intStack[intStackCount + 4];
										rSInterface.zoom = Class14.intStack[intStackCount + 5];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1110) {
										int i_217_ = Class14.intStack[--intStackCount];
										if ((i_217_ ^ 0xffffffff) != (rSInterface.disabledAnim ^ 0xffffffff)) {
											rSInterface.disabledAnim = i_217_;
											rSInterface.anInt323 = 0;
											rSInterface.anInt443 = 0;
											Class73.refreshInterface(rSInterface);
										}
									} else if (opcode == 1111) {
										rSInterface.aBoolean364 = (Class14.intStack[--intStackCount] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1112) {
										RSString rSString = (Class60.stringStack[--stringStackCount]);
										if (!rSString.equalsRSString(-112,
												rSInterface.disabledText)) {//TODO text
											rSInterface.disabledText = rSString;
											Class73.refreshInterface(rSInterface);
										}
									} else if (opcode == 1113) {
										rSInterface.font = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1114) {
										intStackCount -= 3;
										rSInterface.horizontalAlignment = Class14.intStack[intStackCount];
										rSInterface.verticalAlignment = Class14.intStack[1 + intStackCount];
										rSInterface.verticalSpacing = Class14.intStack[2 + intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1115) {
										rSInterface.shaded = (Class14.intStack[--intStackCount] == 1);
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1116) {
										rSInterface.outline = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1117) {
										rSInterface.shadow = Class14.intStack[--intStackCount];
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1118) {
										rSInterface.flipVertical = (Class14.intStack[--intStackCount] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface);
									} else if (opcode == 1119) {
										rSInterface.flipHorizontal = (Class14.intStack[--intStackCount] == 1);
										Class73.refreshInterface(rSInterface);
									} else {
										if (opcode != 1120)
											break;
										intStackCount -= 2;
										rSInterface.maxScrollHorizontal = Class14.intStack[intStackCount];
										rSInterface.maxScrollVertical = Class14.intStack[intStackCount + 1];
										Class73.refreshInterface(rSInterface);
									}
								}
							} else {
								RSInterface rSInterface;
								if (opcode >= 2000) {
									opcode -= 1000;
									rSInterface = (Class37_Sub9_Sub14.getInterface(
											Class14.intStack[--intStackCount]));
								} else
									rSInterface = (!bool ? Class47.aClass18_995
											: Class1.aClass18_61);
								if (opcode == 1000) {
									intStackCount -= 2;
									rSInterface.x = Class14.intStack[intStackCount];
									rSInterface.y = Class14.intStack[1 + intStackCount];
									Class73.refreshInterface(rSInterface);
								} else if (opcode == 1001) {
									intStackCount -= 2;
									rSInterface.width = Class14.intStack[intStackCount];
									rSInterface.height = Class14.intStack[intStackCount + 1];
									Class73.refreshInterface(rSInterface);
								} else {
									if (opcode != 1003)
										break;
									boolean bool_218_ = Class14.intStack[--intStackCount] == 1;
									if (bool_218_ != rSInterface.hidden) {
										//rSInterface.hidden = bool_218_;
										//Class73.refreshInterface(rSInterface);
									}
								}
							}
						} else if (opcode == 100) {
							intStackCount -= 3;
							int i_219_ = Class14.intStack[intStackCount];
							int i_220_ = Class14.intStack[1 + intStackCount];
							int i_221_ = Class14.intStack[intStackCount + 2];
							if ((i_220_ ^ 0xffffffff) == -1)
								throw new RuntimeException();
							RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(
									i_219_);
							if (rSInterface.aClass18Array450 == null)
								rSInterface.aClass18Array450 = new RSInterface[1 + i_221_];
							if (rSInterface.aClass18Array450.length <= i_221_) {
								RSInterface[] class18s = new RSInterface[1 + i_221_];
								for (int i_222_ = 0; ((rSInterface.aClass18Array450.length ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++)
									class18s[i_222_] = rSInterface.aClass18Array450[i_222_];
								rSInterface.aClass18Array450 = class18s;
							}
							if (i_221_ > 0 && rSInterface.aClass18Array450[i_221_ - 1] == null)
								throw new RuntimeException("Gap at:" + (i_221_ - 1));
							RSInterface class18_223_ = new RSInterface();
							class18_223_.anInt334 = i_221_;
							class18_223_.type = i_220_;
							class18_223_.newFormat = true;
							class18_223_.parentId = class18_223_.bitPacked = rSInterface.bitPacked;
							rSInterface.aClass18Array450[i_221_] = class18_223_;
							if (bool)
								Class1.aClass18_61 = class18_223_;
							else
								Class47.aClass18_995 = class18_223_;
							Class73.refreshInterface(rSInterface);
						} else if (opcode == 101) {
							RSInterface rSInterface = (bool ? Class1.aClass18_61
									: Class47.aClass18_995);
							RSInterface class18_224_ = Class37_Sub9_Sub14
									.getInterface(rSInterface.bitPacked);
							class18_224_.aClass18Array450[rSInterface.anInt334] = null;
							Class73.refreshInterface(class18_224_);
						} else if (opcode == 102) {
							RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(Class14.intStack[--intStackCount]);
							rSInterface.aClass18Array450 = null;
							Class73.refreshInterface(rSInterface);
						} else {
							if (opcode != 200)
								break;
							intStackCount -= 2;
							int i_225_ = Class14.intStack[intStackCount + 1];
							int i_226_ = Class14.intStack[intStackCount];
							RSInterface rSInterface = Class37_Sub9_Sub35.method914(
									i_226_, i_225_);
							if (rSInterface != null && (i_225_ ^ 0xffffffff) != 0) {
								Class14.intStack[intStackCount++] = 1;
								if (!bool)
									Class47.aClass18_995 = rSInterface;
								else
									Class1.aClass18_61 = rSInterface;
							} else
								Class14.intStack[intStackCount++] = 0;
						}
					}
					throw new IllegalStateException();
				} catch (Exception exception) {
					if (class37_sub4_sub6.name == null) {
						if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1)
							Class37_Sub4_Sub7_Sub1_Sub1.method505(
									Class3.aClass16_87, 0,
									Class37_Sub4_Sub14.aClass16_2806);
						Class37_Sub9_Sub3.method768(-73,
								("CS2 - scr:" + (class37_sub4_sub6.hash)
										+ " op:" + opcode), exception);
					} else {
						RSString rSString = Class37_Sub4_Sub7.method491(30, 0);
						rSString.method157(Class37_Sub16.aClass16_2150, -20035)
								.method157(class37_sub4_sub6.name,
										-20035);
						for (int i_227_ = Class37_Sub9_Sub29.anInt3457 - 1; i_227_ >= 0; i_227_--)
							rSString
									.method157(Class25.aClass16_638, -20035)
									.method157(
											(Class37_Sub1.aClass78Array1807[i_227_].aClass37_Sub4_Sub6_1455.name),
											-20035);
						if ((opcode ^ 0xffffffff) == -41) {
							int i_228_ = values[index];
							rSString.method157(Class76.aClass16_1421, -20035)
									.method157(
											Class37_Sub9_Sub24.method870(
													i_228_, (byte) -114),
											-20035);
						}
						if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1)
							Class37_Sub4_Sub7_Sub1_Sub1
									.method505(
											Class3.aClass16_87,
											0,
											(Class37_Sub9_Sub27
													.method881(
															(new RSString[] {
																	Class15_Sub1.aClass16_1763,
																	class37_sub4_sub6.name }))));
						Class37_Sub9_Sub3.method768(-52,
								("CS2 - scr:" + class37_sub4_sub6.hash
										+ " op:" + opcode + new String(rSString
										.method179((byte) -103))), exception);
					}
				}
			//}
		}
	}

	public static void method777(int i) {
		aClass16_2975 = null;
		aClass16_2967 = null;
		anIntArray2983 = null;
		anIntArray2982 = null;
		anIntArray2981 = null;
		aClass16_2984 = null;
		aClass65_2973 = null;
		if (i != -90)
			method778(false);
	}

	public static void method778(boolean bool) {
		anInt2964++;
		Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
		Class84.aClass15_1534 = null;
		Class37_Sub7.anInt1904 = 1;
		if (bool != false)
			aClass16_2984 = null;
	}

	public void method752(int i) {
		anInt2969++;
		method775((byte) -55);
		if (i != -2)
			method777(80);
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt2974++;
		int i_229_ = i;
		while_13_: do {
			while_12_: do {
				while_11_: do {
					while_10_: do {
						while_9_: do {
							while_8_: do {
								do {
									if (i_229_ != 0) {
										if (i_229_ != 1) {
											if ((i_229_ ^ 0xffffffff) != -3) {
												if ((i_229_ ^ 0xffffffff) != -4) {
													if (i_229_ != 4) {
														if ((i_229_ ^ 0xffffffff) != -6) {
															if ((i_229_ ^ 0xffffffff) != -7) {
																if (i_229_ != 7)
																	break while_13_;
															} else
																break while_11_;
															break while_12_;
														}
													} else
														break while_9_;
													break while_10_;
												}
											} else
												break;
											break while_8_;
										}
									} else {
										anInt2971 = class37_sub11
												.getUnsignedByte();
										break while_13_;
									}
									anInt2965 = class37_sub11.getUnsignedByte();
									break while_13_;
								} while (false);
								anInt2958 = class37_sub11.getUnsignedShort();
								break while_13_;
							} while (false);
							anInt2966 = class37_sub11.getUnsignedShort();
							break while_13_;
						} while (false);
						anInt2977 = class37_sub11.getUnsignedShort();
						break while_13_;
					} while (false);
					anInt2978 = class37_sub11.getUnsignedShort();
					break while_13_;
				} while (false);
				anInt2972 = class37_sub11.getUnsignedShort();
				break while_13_;
			} while (false);
			anInt2979 = class37_sub11.getUnsignedShort();
		} while (false);
		if (bool != true)
			method777(70);
	}

	static {
		aClass65_2973 = new Cache(64);
		anIntArray2981 = (new int[] { 5, 0, 0, 0, 20, 1, 0, 5, 0, 0, 6, 0, 0,
				0, 0, 3, 0, 7, 14, 0, 0, 0, 4, 0, 0, 0, 0, 0, 3, 0, 1, 0, 11,
				6, 0, -1, 10, 0, 15, 0, 0, 0, 1, 0, 6, 0, 0, 0, 6, 6, 0, 0, 0,
				0, 24, 4, -2, -1, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0,
				0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6,
				0, 0, -1, 0, -2, 0, 2, 0, 0, 0, 0, 0, 6, -2, 0, 0, 0, 0, 12, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 0, 4, 0,
				0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, 0, 6, 2, 2, 0, 0, 0, -2, 4,
				-2, 0, 0, 8, 6, 0, 0, 0, 0, 5, 0, 0, -2, 4, 0, 0, 7, 0, 0, 0,
				0, 6, 0, 0, 0, 11, 0, 0, 0, 0, 5, 0, 2, 0, -1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 0, 0, 0, 0, -1, 0, 0, 0, 0, 3, -2, 0, 0, 0,
				0, 4, -2, -2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 10, 0, 2, 0, 3, 0,
				6 });
		anIntArray2982 = new int[5];
		anIntArray2983 = new int[] { 0, -1, 0, 1 };
		aClass16_2984 = Class37_Sub2.create_rsstring("jolt");
	}
}
