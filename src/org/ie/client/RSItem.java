package org.ie.client;


/* Class37_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RSItem extends NodeSub {
	public boolean aBoolean2421;
	public static RSString aClass16_2422;
	public static int anInt2423;
	public int certID;
	public static int anInt2425;
	public short[] modifiedModelColors;
	public static int anInt2427;
	public static RSString aClass16_2428;
	public int anInt2429 = -1;
	public static RSString aClass16_2430;
	public int modelRotation2;
	public static int anInt2432;
	public int modelRotation1;
	public static int anInt2434;
	public RSString[] actions;
	public static RSString aClass16_2436;
	public static RSString aClass16_2437;
	public static RSString aClass16_2438;
	public static RSString aClass16_2439;
	public int modelOffset1;
	public static RSString aClass16_2441;
	public static RSString aClass16_2442;
	public static RSString aClass16_2443 = Class37_Sub2.create_rsstring(
			"Verbinde mit Server)3)3)3");
	public static RSString aClass16_2444;
	public static RSString aClass16_2445;
	public int anInt2446;
	public int value;
	public static int anInt2448;
	public int anInt2449;
	public static RSString aClass16_2450;
	public static RSString aClass16_2451;
	public int anInt2452;
	public int anInt2453;
	public static RSString aClass16_2454;
	public static RSString aClass16_2455;
	public static int anInt2456;
	public static RSString aClass16_2457;
	public RSString itemName;
	public RSString[] groundActions;
	public static RSString aClass16_2460;
	public static RSString aClass16_2461;
	public int certTemplateID;
	public static int anInt2463;
	public int anInt2464;
	public int modelID;
	public int anInt2466;
	public int anInt2467;
	public int itemId;
	public int modelZoom;
	public static RSString aClass16_2470;
	public static RSString aClass16_2471;
	public static int anInt2472;
	public static RSString aClass16_2473;
	public static int anInt2474;
	public int[] stackIDs;
	public static RSString aClass16_2476;
	public static RSString aClass16_2477;
	public int[] stackAmounts;
	public int anInt2479;
	public static RSString aClass16_2480;
	public static int anInt2481;
	public int anInt2482;
	public static RSString aClass16_2483;
	public int anInt2484;
	public static RSString aClass16_2485;
	public static int anInt2486;
	public short[] aShortArray2487;
	public static RSString aClass16_2488;
	public static RSString aClass16_2489;
	public static RSString aClass16_2490;
	public static short[] aShortArray2491;
	public static int anInt2492;
	public int stackable;
	public static RSString aClass16_2494;
	public static RSString aClass16_2495;
	public static RSString aClass16_2496;
	public int anInt2497;
	public int anInt2498;
	public int anInt2499;
	public static int anInt2500;
	public static RSString aClass16_2501;
	public int anInt2502;
	public static RSString aClass16_2503;
	public int team;
	public int anInt2505;
	public static RSString aClass16_2506;
	public int modelOffset2;
	public static RSString aClass16_2508 = Class37_Sub2.create_rsstring(
			"scape main");
	public boolean membersObject;
	public short[] originalModelColors;
	public static RSString aClass16_2511;
	public static RSString aClass16_2512;
	public static int anInt2513;
	public int anInt2514;
	public short[] aShortArray2515;
	public static RSString aClass16_2516;
	public int anInt2517;
	static int complete = 0;
	
	static boolean dumped = true;
	public int notedId = -1;

	public void decode(int i, ByteVector byteVector) {
		anInt2423++;
		for (;;) {
			int flag = byteVector.getUnsignedByte();
			if (flag == 0)
				break;
			decode(flag, -30167, byteVector);
		}
		if (i != 2000)
			method451((byte) -120, -63);
	}

	public static RSString formatAmount(int i, boolean bool) {
		if (bool != false)
			return null;
		anInt2425++;
		if (i < 100000)
			return (Class37_Sub9_Sub27.method881(new RSString[] {
					Class37_Sub25.aClass16_2284,
					Class37_Sub9_Sub24.method870(i, (byte) -114),
					Class37_Sub2.aClass16_1811 }));
		if (i < 10000000)
			return (Class37_Sub9_Sub27.method881((new RSString[] {
					Class37_Sub4_Sub14.aClass16_2802,
					Class37_Sub9_Sub24.method870(i / 1000, (byte) -114),
					Class27.aClass16_682, Class37_Sub2.aClass16_1811 })));
		return (Class37_Sub9_Sub27.method881((new RSString[] {
				Class37_Sub9_Sub17.aClass16_3227,
				Class37_Sub9_Sub24.method870(i / 1000000, (byte) -114),
				Cache.aClass16_1235, Class37_Sub2.aClass16_1811 })));
	}

	public void toNote(RSItem originalItem, RSItem newItem, byte i) {
		try {
			membersObject = newItem.membersObject;
			value = newItem.value;
			modelZoom = originalItem.modelZoom;
			modifiedModelColors = originalItem.modifiedModelColors;
			stackable = 1;
			anInt2517 = originalItem.anInt2517;
			modelOffset1 = originalItem.modelOffset1;
			anInt2486++;
			originalModelColors = originalItem.originalModelColors;
			if (i > 114) {
				modelOffset2 = originalItem.modelOffset2;
				modelRotation2 = originalItem.modelRotation2;
				itemName = newItem.itemName;
				modelRotation1 = originalItem.modelRotation1;
				aShortArray2515 = originalItem.aShortArray2515;
				aShortArray2487 = originalItem.aShortArray2487;
				modelID = originalItem.modelID;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("aa.F("
					+ (originalItem != null ? "{...}" : "null") + ','
					+ (newItem != null ? "{...}" : "null") + ','
					+ i + ')'));
		}
	}

	public boolean method444(byte i, boolean bool) {
		anInt2463++;
		int i_3_ = anInt2449;
		int i_4_ = anInt2479;
		int i_5_ = anInt2429;
		if (bool) {
			i_5_ = anInt2498;
			i_3_ = anInt2453;
			i_4_ = anInt2446;
		}
		if (i_3_ == -1)
			return true;
		boolean bool_6_ = true;
		if (!Class52.aClass15_1056.method115(-9350, i_3_, 0))
			bool_6_ = false;
		if (i_4_ != -1 && !Class52.aClass15_1056.method115(-9350, i_4_, 0))
			bool_6_ = false;
		if (i < 110)
			anInt2446 = 61;
		if (i_5_ != -1 && !Class52.aClass15_1056.method115(-9350, i_5_, 0))
			bool_6_ = false;
		return bool_6_;
	}

	
	
	public void decode(int flag, int i_7_, ByteVector byteVector) {
		anInt2481++;
		if (i_7_ == -30167) {
			/*
			 * Begin
			 */
//			if (flag == 1) {
//				modelID = byteVector.getUnsignedShort();
//			} else if (flag == 2) {
//				itemName = byteVector.getRS2String();
//			} else if (flag == 4) {
//				modelZoom = byteVector.getUnsignedShort();
//			} else if (flag == 5) {
//				modelRotation1 = byteVector.getUnsignedShort();
//			} else if (flag == 6) {
//				modelRotation2 = byteVector.getUnsignedShort();
//			} else if (flag == 7) {
//				modelOffset1 = byteVector.getUnsignedShort();
//				if (modelOffset1 > 32767) {
//					modelOffset1 -= 0x10000;
//				}
//			} else if (flag == 8) {
//				modelOffset2 = byteVector.getUnsignedShort();
//				if (modelOffset2 > 32767) {
//					modelOffset2 -= 0x10000;
//				}
//			} else if (flag == 10) {
//				
//			} else if (flag == 11) {
//				stackable = 1;
//			} else if (flag == 12) {
//				value = byteVector.getInt(-73);
//			}
			
			
			
			
			if (flag == 1)
				modelID = byteVector.getUnsignedShort();
			else if (flag == 2) {
				itemName = byteVector.getRS2String();
			} else if (flag != 4) {
				if (flag == 5)
					modelRotation1 = byteVector.getUnsignedShort();
				else if ((flag ^ 0xffffffff) == -7)
					modelRotation2 = byteVector.getUnsignedShort();
				else if ((flag ^ 0xffffffff) != -8) {
					if ((flag ^ 0xffffffff) == -9) {
						modelOffset2 = byteVector
								.getUnsignedShort();
						if ((modelOffset2 ^ 0xffffffff) < -32768)
							modelOffset2 -= 65536;
					} else if (flag != 11) {
						if (flag == 12)
							value = byteVector.getInt();
						else if ((flag ^ 0xffffffff) != -17) {
							if ((flag ^ 0xffffffff) != -24) {
								if ((flag ^ 0xffffffff) == -25)
									anInt2479 = byteVector
											.getUnsignedShort();
								else if (flag == 25) {
									anInt2453 = byteVector
											.getUnsignedShort();
									anInt2499 = byteVector.getUnsignedByte();
								} else if (flag != 26) {
									if ((flag ^ 0xffffffff) <= -31
											&& (flag ^ 0xffffffff) > -36) {
										groundActions[flag - 30] = byteVector
												.getRS2String();
										if (groundActions[flag + -30]
												.method159(
														ByteVector.hiddenString,
														(byte) 78))
											groundActions[flag - 30] = null;
									} else if ((flag ^ 0xffffffff) <= -36
											&& flag < 40)
										actions[flag - 35] = byteVector
												.getRS2String();
									else if (flag != 40) {
										if (flag != 41) {
											if ((flag ^ 0xffffffff) != -66) {
												if (flag != 78) {
													if (flag == 79)
														anInt2498 = (byteVector
																.getUnsignedShort());
													else if (flag == 90)
														anInt2505 = (byteVector
																.getUnsignedShort());
													else if ((flag ^ 0xffffffff) != -92) {
														if ((flag ^ 0xffffffff) == -93)
															anInt2502 = (byteVector
																	.getUnsignedShort());
														else if (flag == 93)
															anInt2466 = (byteVector
																	.getUnsignedShort());
														else if (flag == 95)
															anInt2517 = (byteVector
																	.getUnsignedShort());
														else if ((flag ^ 0xffffffff) == -98)
															certID = (byteVector
																	.getUnsignedShort());
														else if ((flag ^ 0xffffffff) != -99) {
															if (((flag ^ 0xffffffff) > -101)
																	|| ((flag ^ 0xffffffff) <= -111)) {
																if ((flag ^ 0xffffffff) != -111) {
																	if (flag == 111)
																		anInt2482 = byteVector
																				.getUnsignedShort();
																	else if ((flag ^ 0xffffffff) != -113) {
																		if ((flag ^ 0xffffffff) != -114) {
																			if (flag == 114)
																				anInt2464 = byteVector
																						.method982((byte) 116) * 5;
																			else if ((flag ^ 0xffffffff) == -116)
																				team = byteVector
																						.getUnsignedByte();
																		} else
																			anInt2484 = byteVector
																					.method982((byte) 110);
																	} else
																		anInt2514 = byteVector
																				.getUnsignedShort();
																} else
																	anInt2467 = (byteVector
																			.getUnsignedShort());
															} else {
																if (stackIDs == null) {
																	stackAmounts = (new int[10]);
																	stackIDs = (new int[10]);
																}
																stackIDs[flag
																		+ -100] = (byteVector
																		.getUnsignedShort());
																stackAmounts[-100
																		+ flag] = (byteVector
																		.getUnsignedShort());
															}
														} else
															certTemplateID = (byteVector
																	.getUnsignedShort());
													} else
														anInt2452 = (byteVector
																.getUnsignedShort());
												} else
													anInt2429 = byteVector
															.getUnsignedShort();
											} else
												aBoolean2421 = true;
										} else {
											int i_8_ = byteVector
													.getUnsignedByte();
											modifiedModelColors = new short[i_8_];
											originalModelColors = new short[i_8_];
											for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)); i_9_++) {
												modifiedModelColors[i_9_] = (short) (byteVector
														.getUnsignedShort());
												originalModelColors[i_9_] = (short) (byteVector
														.getUnsignedShort());
											}
										}
									} else {
										int i_10_ = byteVector
												.getUnsignedByte();
										aShortArray2515 = new short[i_10_];
										aShortArray2487 = new short[i_10_];
										for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
											aShortArray2487[i_11_] = (short) byteVector
													.getUnsignedShort();
											aShortArray2515[i_11_] = (short) (byteVector
													.getUnsignedShort());
										}
									}
								} else
									anInt2446 = byteVector
											.getUnsignedShort();
							} else {
								anInt2449 = byteVector
										.getUnsignedShort();
								anInt2497 = byteVector.getUnsignedByte();
							}
						} else
							membersObject = true;
					} else
						stackable = 1;
				} else {
					modelOffset1 = byteVector.getUnsignedShort();
					if ((modelOffset1 ^ 0xffffffff) < -32768)
						modelOffset1 -= 65536;
				}
			} else
				modelZoom = byteVector.getUnsignedShort();
		}
	}

	public static void method446(int i) {
		aClass16_2436 = null;
		aClass16_2476 = null;
		aClass16_2471 = null;
		aClass16_2512 = null;
		aClass16_2445 = null;
		aClass16_2506 = null;
		aClass16_2488 = null;
		aClass16_2477 = null;
		aClass16_2430 = null;
		aClass16_2450 = null;
		aClass16_2454 = null;
		aClass16_2442 = null;
		aClass16_2516 = null;
		aClass16_2460 = null;
		aClass16_2508 = null;
		aClass16_2451 = null;
		aClass16_2480 = null;
		aClass16_2501 = null;
		aClass16_2439 = null;
		aClass16_2483 = null;
		aClass16_2473 = null;
		aClass16_2437 = null;
		aClass16_2511 = null;
		aClass16_2485 = null;
		aClass16_2503 = null;
		aClass16_2490 = null;
		aShortArray2491 = null;
		aClass16_2457 = null;
		aClass16_2495 = null;
		aClass16_2470 = null;
		aClass16_2496 = null;
		aClass16_2422 = null;
		aClass16_2461 = null;
		aClass16_2494 = null;
		aClass16_2455 = null;
		aClass16_2489 = null;
		aClass16_2428 = null;
		aClass16_2438 = null;
		aClass16_2443 = null;
		aClass16_2441 = null;
		aClass16_2444 = null;
		if (i != -21294)
			aClass16_2489 = null;
	}

	public Class37_Sub4_Sub7_Sub4 method447(int i, boolean bool) {
		anInt2434++;
		int i_12_ = anInt2449;
		int i_13_ = anInt2479;
		if (i > -59)
			method454(67);
		int i_14_ = anInt2429;
		if (bool) {
			i_13_ = anInt2446;
			i_14_ = anInt2498;
			i_12_ = anInt2453;
		}
		if (i_12_ == -1)
			return null;
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4
				.method529(Class52.aClass15_1056, i_12_, 0);
		if (i_13_ != -1) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_15_ = Class37_Sub4_Sub7_Sub4
					.method529(Class52.aClass15_1056, i_13_, 0);
			if (i_14_ == -1) {
				Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = {
						class37_sub4_sub7_sub4, class37_sub4_sub7_sub4_15_ };
				class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
						class37_sub4_sub7_sub4s, 2);
			} else {
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_16_ = Class37_Sub4_Sub7_Sub4
						.method529(Class52.aClass15_1056, i_14_, 0);
				Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = {
						class37_sub4_sub7_sub4, class37_sub4_sub7_sub4_15_,
						class37_sub4_sub7_sub4_16_ };
				class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
						class37_sub4_sub7_sub4s, 3);
			}
		}
		if (!bool && (anInt2497 ^ 0xffffffff) != -1)
			class37_sub4_sub7_sub4.method520(0, anInt2497, 0);
		if (bool && anInt2499 != 0)
			class37_sub4_sub7_sub4.method520(0, anInt2499, 0);
		if (aShortArray2487 != null) {
			for (int i_17_ = 0; i_17_ < aShortArray2487.length; i_17_++)
				class37_sub4_sub7_sub4.method535(aShortArray2487[i_17_],
						aShortArray2515[i_17_]);
		}
		if (modifiedModelColors != null) {
			for (int i_18_ = 0; i_18_ < modifiedModelColors.length; i_18_++)
				class37_sub4_sub7_sub4.method525(modifiedModelColors[i_18_],
						originalModelColors[i_18_]);
		}
		return class37_sub4_sub7_sub4;
	}

	public Class37_Sub4_Sub7_Sub4 method448(byte i, boolean bool) {
		anInt2474++;
		int i_19_ = anInt2505;
		if (i >= -47)
			return null;
		int i_20_ = anInt2502;
		if (bool) {
			i_20_ = anInt2466;
			i_19_ = anInt2452;
		}
		if (i_19_ == -1)
			return null;
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4
				.method529(Class52.aClass15_1056, i_19_, 0);
		if (i_20_ != -1) {
			Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4_21_ = Class37_Sub4_Sub7_Sub4
					.method529(Class52.aClass15_1056, i_20_, 0);
			Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = {
					class37_sub4_sub7_sub4, class37_sub4_sub7_sub4_21_ };
			class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
					class37_sub4_sub7_sub4s, 2);
		}
		if (aShortArray2487 != null) {
			for (int i_22_ = 0; aShortArray2487.length > i_22_; i_22_++)
				class37_sub4_sub7_sub4.method535(aShortArray2487[i_22_],
						aShortArray2515[i_22_]);
		}
		if (modifiedModelColors != null) {
			for (int i_23_ = 0; (modifiedModelColors.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++)
				class37_sub4_sub7_sub4.method525(modifiedModelColors[i_23_],
						originalModelColors[i_23_]);
		}
		return class37_sub4_sub7_sub4;
	}

	public Class37_Sub4_Sub7_Sub6 method449(byte i, int i_24_) {
		anInt2432++;
		if (stackIDs != null && (i_24_ ^ 0xffffffff) < -2) {
			int i_25_ = -1;
			for (int i_26_ = 0; i_26_ < 10; i_26_++) {
				if ((i_24_ ^ 0xffffffff) <= (stackAmounts[i_26_] ^ 0xffffffff)
						&& stackAmounts[i_26_] != 0)
					i_25_ = stackIDs[i_26_];
			}
			if ((i_25_ ^ 0xffffffff) != 0)
				return Class46.loadItem(i_25_, (byte) 107).method449(
						(byte) -97, 1);
		}
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4
				.method529(Class52.aClass15_1056, modelID, 0);
		if (class37_sub4_sub7_sub4 == null)
			return null;
		if (aShortArray2487 != null) {
			for (int i_27_ = 0; aShortArray2487.length > i_27_; i_27_++)
				class37_sub4_sub7_sub4.method535(aShortArray2487[i_27_],
						aShortArray2515[i_27_]);
		}
		if (i >= -74)
			method452((byte) 92);
		if (modifiedModelColors != null) {
			for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (modifiedModelColors.length ^ 0xffffffff); i_28_++)
				class37_sub4_sub7_sub4.method525(modifiedModelColors[i_28_],
						originalModelColors[i_28_]);
		}
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4
				.method518(anInt2484 + 64, anInt2464 + 768, -50, -10, -50,
						true, true);
		if (anInt2467 != 128 || (anInt2482 ^ 0xffffffff) != -129
				|| (anInt2514 ^ 0xffffffff) != -129)
			class37_sub4_sub7_sub4.method534(anInt2467, anInt2482, anInt2514);
		return class37_sub4_sub7_sub6;
	}

	public boolean method450(boolean bool, int i) {
		anInt2472++;
		int i_29_ = anInt2505;
		int i_30_ = anInt2502;
		if (bool) {
			i_30_ = anInt2466;
			i_29_ = anInt2452;
		}
		if (i_29_ == -1)
			return true;
		if (i != 20274)
			method447(71, false);
		boolean bool_31_ = true;
		if (!Class52.aClass15_1056.method115(-9350, i_29_, 0))
			bool_31_ = false;
		if (i_30_ != -1 && !Class52.aClass15_1056.method115(-9350, i_30_, 0))
			bool_31_ = false;
		return bool_31_;
	}

	public Class37_Sub4_Sub7_Sub6 method451(byte i, int i_32_) {
		anInt2427++;
		if (stackIDs != null && i_32_ > 1) {
			int i_33_ = -1;
			for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -11; i_34_++) {
				if ((i_32_ ^ 0xffffffff) <= (stackAmounts[i_34_] ^ 0xffffffff)
						&& stackAmounts[i_34_] != 0)
					i_33_ = stackIDs[i_34_];
			}
			if ((i_33_ ^ 0xffffffff) != 0)
				return Class46.loadItem(i_33_, (byte) 110).method451(
						(byte) -118, 1);
		}
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class37_Sub9_Sub34.aClass65_3546
				.get((long) itemId));
		if (i >= -98)
			return null;
		if (class37_sub4_sub7_sub6 != null)
			return class37_sub4_sub7_sub6;
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub4_Sub7_Sub4
				.method529(Class52.aClass15_1056, modelID, 0);
		if (class37_sub4_sub7_sub4 == null)
			return null;
		if (aShortArray2487 != null) {
			for (int i_35_ = 0; i_35_ < aShortArray2487.length; i_35_++)
				class37_sub4_sub7_sub4.method535(aShortArray2487[i_35_],
						aShortArray2515[i_35_]);
		}
		if (modifiedModelColors != null) {
			for (int i_36_ = 0; (modifiedModelColors.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++)
				class37_sub4_sub7_sub4.method525(modifiedModelColors[i_36_],
						originalModelColors[i_36_]);
		}
		class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
				64 + anInt2484, 768 - -anInt2464, -50, -10, -50, false, false);
		if ((anInt2467 ^ 0xffffffff) != -129 || anInt2482 != 128
				|| (anInt2514 ^ 0xffffffff) != -129)
			class37_sub4_sub7_sub4.method534(anInt2467, anInt2482, anInt2514);
		class37_sub4_sub7_sub6.aBoolean3836 = true;
		Class37_Sub9_Sub34.aClass65_3546.put(class37_sub4_sub7_sub6, (long) itemId);
		return class37_sub4_sub7_sub6;
	}

	public void method452(byte i) {
		if (i > 115)
			anInt2500++;
	}

	public RSItem method453(int i, int i_37_) {
		if (i_37_ > -55)
			itemName = null;
		anInt2456++;
		if (stackIDs != null && (i ^ 0xffffffff) < -2) {
			int i_38_ = -1;
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -11; i_39_++) {
				if (stackAmounts[i_39_] <= i && stackAmounts[i_39_] != 0)
					i_38_ = stackIDs[i_39_];
			}
			if ((i_38_ ^ 0xffffffff) != 0)
				return Class46.loadItem(i_38_, (byte) 104);
		}
		return this;
	}

	public static void method454(int i) {
		if (i != 128)
			method454(9);
		anInt2492++;
		for (Class37_Sub2 class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
				.getFirst(); class37_sub2 != null; class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
				.getNext()) {
			if ((class37_sub2.anInt1828 ^ 0xffffffff) != 0)
				class37_sub2.unlink();
			else {
				class37_sub2.anInt1816 = 0;
				Class37_Sub4_Sub7.method489(class37_sub2, (byte) -26);
			}
		}
	}

	public RSItem() {
		certID = -1;
		modelOffset1 = 0;
		anInt2453 = -1;
		value = 1;
		modelRotation2 = 0;
		modelRotation1 = 0;
		groundActions = new RSString[] { null, null, Class55.aClass16_1066,
				null, null };
		anInt2467 = 128;
		anInt2464 = 0;
		certTemplateID = -1;
		anInt2446 = -1;
		modelZoom = 2000;
		itemName = Class37_Sub4_Sub4.aClass16_2590;
		anInt2466 = -1;
		anInt2452 = -1;
		anInt2482 = 128;
		anInt2479 = -1;
		anInt2484 = 0;
		anInt2449 = -1;
		anInt2499 = 0;
		aBoolean2421 = false;
		anInt2502 = -1;
		anInt2498 = -1;
		anInt2505 = -1;
		team = 0;
		modelOffset2 = 0;
		anInt2497 = 0;
		actions = new RSString[] { null, null, null, null,
				Class37_Sub1.aClass16_1796 };
		stackable = 0;
		membersObject = false;
		anInt2514 = 128;
		anInt2517 = 0;
	}

	static {
		aClass16_2506 = Class37_Sub2.create_rsstring("");
		aClass16_2444 = aClass16_2506;
		aClass16_2445 = aClass16_2506;
		aClass16_2494 = aClass16_2506;
		aClass16_2430 = aClass16_2506;
		aClass16_2503 = aClass16_2506;
		aClass16_2473 = aClass16_2506;
		aClass16_2437 = aClass16_2506;
		aClass16_2501 = aClass16_2506;
		aClass16_2471 = aClass16_2506;
		aClass16_2438 = aClass16_2506;
		aClass16_2476 = aClass16_2506;
		aClass16_2428 = aClass16_2506;
		aClass16_2489 = aClass16_2506;
		aClass16_2441 = aClass16_2506;
		aClass16_2422 = aClass16_2506;
		aClass16_2512 = aClass16_2506;
		aClass16_2495 = aClass16_2506;
		aClass16_2436 = aClass16_2506;
		aClass16_2461 = aClass16_2506;
		aClass16_2439 = aClass16_2506;
		aClass16_2450 = aClass16_2506;
		aClass16_2454 = aClass16_2506;
		aClass16_2455 = aClass16_2506;
		aClass16_2516 = aClass16_2506;
		aClass16_2460 = aClass16_2506;
		aClass16_2490 = aClass16_2506;
		aClass16_2483 = aClass16_2506;
		aClass16_2488 = aClass16_2506;
		aClass16_2480 = aClass16_2506;
		aClass16_2477 = aClass16_2506;
		aClass16_2442 = aClass16_2506;
		aClass16_2451 = aClass16_2506;
		aClass16_2485 = aClass16_2506;
		aClass16_2496 = aClass16_2506;
		aClass16_2511 = aClass16_2506;
		aClass16_2457 = aClass16_2506;
		aClass16_2470 = aClass16_2506;
	}
}
