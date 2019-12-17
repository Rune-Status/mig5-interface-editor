package org.ie.client;

import org.ie.Main;
import org.ie.gui.GUI;

/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54 {
	public static boolean[] aBooleanArray1058 = new boolean[8];
	public static int anInt1059;
	public static Class15_Sub1 aClass15_Sub1_1060;
	public static RSString aClass16_1061 = Class37_Sub2.create_rsstring(
			" )2> <col=ffffff>");
	public static int anInt1062;
	public static int anInt1063;

	public static void method1138(boolean bool) {
		aBooleanArray1058 = null;
		if (bool != false)
			aClass15_Sub1_1060 = null;
		aClass15_Sub1_1060 = null;
		aClass16_1061 = null;
	}

	public static void method1139(int i, int i_0_, RSInterface[] class18s,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int interfaceId) {
		Graphics2D.setBounds(i_3_, i_1_, i_6_, i_2_);
		Rasterizer.initDefaultOffsets();
		for (int childId = 0; class18s.length > childId; childId++) {
			RSInterface child = class18s[childId];
			if (child != null && (child.parentId == i_7_ || (i_7_ == -1412584499 && child == Class37_Sub7.presse_child))) {
				int i_9_;
				if (i_0_ == -1) {
					Class71.anIntArray1364[Class37_Sub9_Sub37.anInt3597] = child.x + i;
					Class43.anIntArray961[Class37_Sub9_Sub37.anInt3597] = child.y + i_5_;
					Class37_Sub11_Sub1.anIntArray3611[(Class37_Sub9_Sub37.anInt3597)] = child.width;
					Class37_Sub4_Sub7_Sub7.anIntArray3842[(Class37_Sub9_Sub37.anInt3597)] = child.height;
					i_9_ = Class37_Sub9_Sub37.anInt3597++;
				} else
					i_9_ = i_0_;
				child.lastDrawCycle = Class37_Sub7.loopCycle;
				child.redrawId = i_9_;
				if (!child.newFormat || !Class66.isVisible(child)) {
					if (child.clientCode > 0)
						Class46.configureInterfaceConfigs(child);
					//System.out.println("here"+child.alpha);
					int i_10_ = i + child.x;
					int i_11_ = child.alpha;
					int i_12_ = child.y + i_5_;
					if (child == Class37_Sub7.presse_child) {
						if (i_7_ != -1412584499 && !child.modifyDraggingAlpha) {
							Class32.anInt742 = i_5_;
							Class78.aClass18Array1456 = class18s;
							Class37_Sub4_Sub4.anInt2588 = i;
							continue;
						}
						if (!child.modifyDraggingAlpha)
							i_11_ = 128;
						if (Class37_Sub9_Sub37.aBoolean3591 && Class32.aBoolean746) {
							int i_13_ = Class37_Sub4_Sub7_Sub7.lastMouseX;
							i_13_ -= Class37_Sub4_Sub7_Sub1_Sub1.pressed_childs_x;
							if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
								i_13_ = Class37_Sub4_Sub7_Sub1_Sub2.anInt3977;
							int i_14_ = Class37_Sub9_Sub1.lastMouseY;
							if ((i_13_ + child.width ^ 0xffffffff) < ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 + Queue.aClass18_1452.width) ^ 0xffffffff))
								i_13_ = (-child.width + (Queue.aClass18_1452.width + (Class37_Sub4_Sub7_Sub1_Sub2.anInt3977)));
							i_10_ = i_13_;
							i_14_ -= Class37_Sub9_Sub15.pressed_childs_y;
							if (Class59.anInt1134 > i_14_)
								i_14_ = Class59.anInt1134;
							if (child.height + i_14_ > (Class59.anInt1134 + Queue.aClass18_1452.height))
								i_14_ = (Class59.anInt1134 + Queue.aClass18_1452.height - child.height);
							i_12_ = i_14_;
						}
					}
					int i_15_;
					int i_16_;
					int i_17_;
					int i_18_;
					if ((child.type ^ 0xffffffff) != -3) {
						if ((child.type ^ 0xffffffff) == -10) {
							int i_19_ = i_10_;
							int i_20_ = i_12_;
							int i_21_ = i_10_ + child.width;
							if (i_19_ > i_21_) {
								int i_22_ = i_19_;
								i_19_ = i_21_;
								i_21_ = i_22_;
							}
							i_16_ = ((i_19_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) ? i_3_ : i_19_);
							i_15_ = ((++i_21_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff) ? i_6_ : i_21_);
							int i_23_ = i_12_ + child.height;
							if ((i_23_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
								int i_24_ = i_20_;
								i_20_ = i_23_;
								i_23_ = i_24_;
							}
							i_23_++;
							i_18_ = i_2_ > i_23_ ? i_23_ : i_2_;
							i_17_ = ((i_20_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff) ? i_20_ : i_1_);
						} else {
							i_16_ = ((i_10_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) ? i_3_ : i_10_);
							i_17_ = ((i_12_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff) ? i_12_ : i_1_);
							int i_25_ = i_10_ + child.width;
							i_15_ = i_6_ > i_25_ ? i_25_ : i_6_;
							int i_26_ = child.height + i_12_;
							i_18_ = i_2_ <= i_26_ ? i_2_ : i_26_;
						}
					} else {
						i_15_ = i_6_;
						i_16_ = i_3_;
						i_17_ = i_1_;
						i_18_ = i_2_;
					}
					if (!child.newFormat || ((i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff) && i_17_ < i_18_)) {
						if ((child.clientCode ^ 0xffffffff) != -1) {
							if (child.clientCode == 1337) {
								Class84.anInt1531 = i_10_;
								Class60.anInt1154 = i_12_;
								Class37_Sub15.method1008(child.height, i_4_ ^ ~0x79f8, child.width, i_12_, i_10_);
								Graphics2D.setBounds(i_3_, i_1_, i_6_,
										i_2_);
								continue;
							}
							if (child.clientCode == 1338) {
								//Class77.method1290(i_9_, i_12_, i_10_, 6853);
								//Class37_Sub4_Sub9.method589(i_3_, i_1_, i_6_,
								//		i_2_);
								continue;
							}
						}
						int i_27_ = Class37_Sub4_Sub7_Sub7.lastMouseX;
						int i_28_ = Class37_Sub9_Sub1.lastMouseY;
						if (!Class37_Sub20.menu_open
								&& (i_16_ ^ 0xffffffff) >= (i_27_ ^ 0xffffffff)
								&& i_28_ >= i_17_ && i_27_ < i_15_
								&& (i_18_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff))
							Class39.method1061(child, false, i_27_
									- i_10_, i_28_ - i_12_);
						if (child.type == 0) {
							if (!child.newFormat
									&& Class66.isVisible(child)
									&& Class42.aClass18_942 != child)
								continue;
							if (!child.newFormat) {
								if (child.verticalScrollPosition > child.maxScrollVertical
										- child.height)
									child.verticalScrollPosition = -child.height
											+ child.maxScrollVertical;
								if (child.verticalScrollPosition < 0)
									child.verticalScrollPosition = 0;
							}
							method1139(i_10_ - child.horizontalScrollPosition, i_9_,
									class18s, i_17_, i_18_, i_16_, -26787,
									-child.verticalScrollPosition + i_12_, i_15_,
									child.bitPacked, interfaceId);
							if (child.aClass18Array450 != null)
								method1139(i_10_ - child.horizontalScrollPosition, i_9_,
										child.aClass18Array450, i_17_,
										i_18_, i_16_, -26787,
										-child.verticalScrollPosition + i_12_, i_15_,
										child.bitPacked, interfaceId);
							OverridedInterface class37_sub6 = ((OverridedInterface) (Class76.overridedInterfaces
									.get((long) child.bitPacked)));
							if (class37_sub6 != null) {
								if ((class37_sub6.type ^ 0xffffffff) == -1
										&& (Class37_Sub4_Sub7_Sub7.lastMouseX ^ 0xffffffff) <= (i_16_ ^ 0xffffffff)
										&& Class37_Sub9_Sub1.lastMouseY >= i_17_
										&& Class37_Sub4_Sub7_Sub7.lastMouseX < i_15_
										&& (Class37_Sub9_Sub1.lastMouseY ^ 0xffffffff) > (i_18_ ^ 0xffffffff)
										&& !Class37_Sub20.menu_open
										&& !Class37_Sub3_Sub1.qaoptest) {
									Class37_Sub9_Sub13.anInt3134 = 1;
									Class37_Sub9_Sub14.aClass16Array3151[0] = Class37_Sub9_Sub23.aClass16_3347;
									Class37_Sub9_Sub20.anIntArray3300[0] = 1004;
									Class37_Sub9_Sub37.aClass16Array3593[0] = Class37_Sub9_Sub8.aClass16_3045;
								}
								Class37_Sub23.method1030(i_10_,
										(class37_sub6.interfaceId), i_15_, i_17_,
										(byte) 111, i_12_, i_9_, i_18_, i_16_);
							}
							Graphics2D.setBounds(i_3_, i_1_, i_6_, i_2_);
							Rasterizer.initDefaultOffsets();
						}
						if (Class37_Sub9_Sub36.aBooleanArray3587[i_9_]
								|| ((Class37_Sub4_Sub13.anInt2793 ^ 0xffffffff) < -2)) {
							if (child.type == 0
									&& !child.newFormat
									&& child.maxScrollVertical > child.height)
								Class32_Sub1.drawScroller(child.verticalScrollPosition,
										(child.width + i_10_),
										child.maxScrollVertical, i_12_,
										child.height);
							if (child.type != 1) {
								if ((child.type ^ 0xffffffff) == -3) {
									int i_29_ = 0;
									for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (child.height ^ 0xffffffff)); i_30_++) {
										for (int i_31_ = 0; i_31_ < child.width; i_31_++) {
											int i_32_ = (i_31_
													* (32 + child.invSpritePadX) + i_10_);
											int i_33_ = (i_12_ - -(i_30_ * (32 - -(child.invSpritePadY))));
											if ((i_29_ ^ 0xffffffff) > -21) {
												i_33_ += (child.spriteY[i_29_]);
												i_32_ += (child.spriteX[i_29_]);
											}
											if (child.inv[i_29_] <= 0) {
												if ((child.spriteId != null)
														&& ((i_29_ ^ 0xffffffff) > -21)) {
													Sprite class37_sub4_sub9_sub3 = (child
															.method198(i_29_,
																	(byte) -107));
													if (class37_sub4_sub9_sub3 != null)
														class37_sub4_sub9_sub3
																.method653(
																		i_32_,
																		i_33_);
													else if (Class27.aBoolean672)
														Class73
																.refreshInterface(
																		child);
												}
											} else {
												boolean bool = false;
												int i_34_ = ((child.inv[i_29_]) + -1);
												boolean bool_35_ = false;
												if ((i_3_ < 32 + i_32_
														&& ((i_6_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
														&& i_1_ < 32 + i_33_ && ((i_2_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff)))
														|| ((child == (Class37_Sub25.aClass18_2285)) && ((Class37_Sub9.anInt1979) == i_29_))) {
													Sprite class37_sub4_sub9_sub3;
													if (((Class37_Sub14.anInt2122) ^ 0xffffffff) != -2
															|| ((MouseHandler.anInt174 ^ 0xffffffff) != (i_29_ ^ 0xffffffff))
															|| ((Class37_Sub9_Sub21.anInt3317) != (child.bitPacked)))
														class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2
																.method507(
																		i_34_,
																		1,
																		false,
																		false,
																		(child.invStackSize[i_29_]),
																		3153952));
													else
														class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2
																.method507(
																		i_34_,
																		2,
																		false,
																		false,
																		(child.invStackSize[i_29_]),
																		0));
													if (class37_sub4_sub9_sub3 != null) {
														if (((Class37_Sub25.aClass18_2285) != child)
																|| (i_29_ != (Class37_Sub9.anInt1979))) {
															if ((child == (Class37_Sub4_Sub13.aClass18_2797))
																	&& ((Class2.anInt75) == i_29_))
																class37_sub4_sub9_sub3
																		.method634(
																				i_32_,
																				i_33_,
																				128);
															else
																class37_sub4_sub9_sub3
																		.method653(
																				i_32_,
																				i_33_);
														} else {
															int i_36_ = (-(ByteVector.anInt2009) + (Class37_Sub4_Sub7_Sub7.lastMouseX));
															if (((i_36_ ^ 0xffffffff) > -6)
																	&& i_36_ > -5)
																i_36_ = 0;
															int i_37_ = (-(Class37_Sub4_Sub12.anInt2784) + (Class37_Sub9_Sub1.lastMouseY));
															if (((i_37_ ^ 0xffffffff) > -6)
																	&& ((i_37_ ^ 0xffffffff) < 4))
																i_37_ = 0;
															if ((Class79.anInt1495) < 5) {
																i_37_ = 0;
																i_36_ = 0;
															}
															class37_sub4_sub9_sub3
																	.method634(
																			i_36_
																					+ i_32_,
																			i_37_
																					+ i_33_,
																			128);
															if (i_7_ != -1) {
																RSInterface class18_38_ = (class18s[(i_7_ & 0xffff)]);
																int i_39_ = (Graphics2D.anInt2664);
																int i_40_ = (Graphics2D.anInt2663);
																if ((((i_37_ + i_33_) ^ 0xffffffff) > (i_40_ ^ 0xffffffff))
																		&& (((class18_38_.verticalScrollPosition) ^ 0xffffffff) < -1)) {
																	int i_41_ = ((Class37_Sub9_Sub37.anInt3589)
																			* (-i_33_
																					+ i_40_ + -i_37_) / 3);
																	if (((Class37_Sub9_Sub37.anInt3589) * 10) < i_41_)
																		i_41_ = 10 * Class37_Sub9_Sub37.anInt3589;
																	if ((class18_38_.verticalScrollPosition) < i_41_)
																		i_41_ = class18_38_.verticalScrollPosition;
																	Class37_Sub4_Sub12.anInt2784 += i_41_;
																	class18_38_.verticalScrollPosition -= i_41_;
																	Class73
																			.refreshInterface(
																					class18_38_);
																}
																if ((((32 + (i_37_ + i_33_)) ^ 0xffffffff) < (i_39_ ^ 0xffffffff))
																		&& ((class18_38_.verticalScrollPosition) < ((class18_38_.maxScrollVertical) + -class18_38_.height))) {
																	int i_42_ = ((-i_39_
																			+ (32 + i_33_) - -i_37_)
																			* Class37_Sub9_Sub37.anInt3589 / 3);
																	if ((10 * (Class37_Sub9_Sub37.anInt3589)) < i_42_)
																		i_42_ = 10 * Class37_Sub9_Sub37.anInt3589;
																	if (((class18_38_.maxScrollVertical) + (-class18_38_.height + -class18_38_.verticalScrollPosition)) < i_42_)
																		i_42_ = class18_38_.maxScrollVertical
																				+ -class18_38_.height
																				- class18_38_.verticalScrollPosition;
																	class18_38_.verticalScrollPosition += i_42_;
																	Class37_Sub4_Sub12.anInt2784 -= i_42_;
																	Class73
																			.refreshInterface(
																					class18_38_);
																}
															}
														}
													} else
														Class73
																.refreshInterface(
																		child);
												}
											}
											i_29_++;
										}
									}
								} else if (child.type == 3) {
									int i_43_;
									if (!Class37_Sub4_Sub3.method470(
											child, 4)) {
										i_43_ = child.disabledColor;
										if (Class42.aClass18_942 == child
												&& child.disabledMouseOverColor != 0)
											i_43_ = child.disabledMouseOverColor;
									} else {
										i_43_ = child.enabledColor;
										if (Class42.aClass18_942 == child
												&& child.enabledMouseOverColor != 0)
											i_43_ = child.enabledMouseOverColor;
									}
									if ((i_11_ ^ 0xffffffff) == -1) {
										if (child.filled == 0)
											Graphics2D
													.method595(
															i_10_,
															i_12_,
															child.width,
															child.height,
															i_43_);
										else
											Graphics2D
													.method578(
															i_10_,
															i_12_,
															child.width,
															child.height,
															i_43_);
									} else if (child.filled == 1)
										Graphics2D.method586(i_10_,
												i_12_, child.width,
												child.height, i_43_,
												256 - (0xff & i_11_));
									else
										Graphics2D.method588(i_10_,
												i_12_, child.width,
												child.height, i_43_,
												256 - (i_11_ & 0xff));
								} else if (child.type == 4) {
									Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = child.method200(i_4_ ^ 0x68df);
									if (class37_sub4_sub9_sub2_sub1 == null) {
										if (Class27.aBoolean672)
											Class73.refreshInterface(child);
									} else {
										RSString rSString = child.disabledText;
										int i_44_;
										if (!Class37_Sub4_Sub3.method470(
												child, 4)) {
											i_44_ = child.disabledColor;
											if (child == Class42.aClass18_942
													&& (child.disabledMouseOverColor ^ 0xffffffff) != -1)
												i_44_ = child.disabledMouseOverColor;
										} else {
											i_44_ = child.enabledColor;
											if (Class42.aClass18_942 == child
													&& child.enabledMouseOverColor != 0)
												i_44_ = child.enabledMouseOverColor;
											if (child.enabledText
													.length() > 0)
												rSString = child.enabledText;
										}
										if (child.newFormat
												&& ((child.itemId ^ 0xffffffff) != 0)) {
											RSItem class37_sub4_sub1 = (Class46
													.loadItem(
															child.itemId,
															(byte) 100));
											rSString = (class37_sub4_sub1.itemName);
											if (rSString == null)
												rSString = (Class37_Sub9_Sub17.aClass16_3226);
											if (((class37_sub4_sub1.stackable == 1) || child.itemZoom != 1)
													&& child.itemZoom != -1)
												rSString = (Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		(Class37_Sub4_Sub2.aClass16_2537),
																		rSString,
																		(Class37_Sub9_Sub23.aClass16_3350),
																		(Class37_Sub11_Sub1
																				.method994(
																						child.itemZoom,
																						3)) })));
										}
										if (Class79.aClass18_1489 == child) {
											i_44_ = child.disabledColor;
											rSString = Class14.aClass16_234;
										}
										if (!child.newFormat)
											rSString = (Class37_Sub9_Sub25
													.method873((byte) -88,
															child,
															rSString));
										class37_sub4_sub9_sub2_sub1.method619(
												rSString, i_10_, i_12_,
												child.width,
												child.height, i_44_,
												!child.shaded ? -1 : 0,
												child.horizontalAlignment,
												child.verticalAlignment,
												child.verticalSpacing);
									}
								} else if (child.type == 5) {
									if (child.newFormat) {
										Sprite class37_sub4_sub9_sub3;
										if ((child.itemId ^ 0xffffffff) == 0)
											class37_sub4_sub9_sub3 = child
													.get_sprite(false);
										else
											class37_sub4_sub9_sub3 = (Class37_Sub4_Sub7_Sub1_Sub2
													.method507(
															child.itemId,
															child.outline,
															false,
															false,
															child.itemZoom,
															child.shadow));
										if (class37_sub4_sub9_sub3 != null) {
											int i_45_ = (class37_sub4_sub9_sub3.anInt3906);
											int i_46_ = (class37_sub4_sub9_sub3.anInt3905);
											if(i_45_ == 0) {
												i_45_ = class37_sub4_sub9_sub3.width;
												System.out.println("broken sprite, make sure to repack="+child.disabledSprite);
											}
											if(i_46_ == 0) {
												i_46_ = class37_sub4_sub9_sub3.height;
												System.out.println("broken sprite, make sure to repack="+child.disabledSprite);
											}
											if (child.gridOriginal) {
												Graphics2D
														.method592(
																i_10_,
																i_12_,
																i_10_
																		+ child.width,
																child.height
																		+ i_12_);
												int i_47_ = ((child.height
														+ i_46_ - 1) / i_46_);
												int i_48_ = ((-1 - -i_45_ + child.width) / i_45_);
												for (int i_49_ = 0; i_48_ > i_49_; i_49_++) {
													for (int i_50_ = 0; ((i_47_ ^ 0xffffffff) < (i_50_ ^ 0xffffffff)); i_50_++) {
														if (child.rotation == 0) {
															if ((i_11_ ^ 0xffffffff) == -1)
																class37_sub4_sub9_sub3
																		.method653(
																				(i_10_ + (i_45_ * i_49_)),
																				(i_12_ + (i_46_ * i_50_)));
															else
																class37_sub4_sub9_sub3
																		.method634(
																				(i_10_ - -(i_45_ * i_49_)),
																				(i_12_ - -(i_46_ * i_50_)),
																				(256 + -(i_11_ & 0xff)));
														} else
															class37_sub4_sub9_sub3
																	.method646(
																			(i_10_
																					+ (i_45_ * i_49_) + i_45_ / 2),
																			(i_46_ / 2 + ((i_50_ * i_46_) + i_12_)),
																			(child.rotation),
																			4096);
													}
												}
												Graphics2D.setBounds(
														i_3_, i_1_, i_6_, i_2_);
											} else {
												int i_51_ = (child.width * 4096 / i_45_);
												if (child.rotation != 0)
													class37_sub4_sub9_sub3
															.method646(
																	(i_10_ - -(child.width / 2)),
																	(i_12_ + (child.height / 2)),
																	child.rotation,
																	i_51_);
												else if (i_11_ == 0) {
													if (((i_45_ ^ 0xffffffff) == (child.width ^ 0xffffffff))
															&& ((child.height ^ 0xffffffff) == (i_46_ ^ 0xffffffff)))
														class37_sub4_sub9_sub3
																.method653(
																		i_10_,
																		i_12_);
													else
														class37_sub4_sub9_sub3
																.method638(
																		i_10_,
																		i_12_,
																		child.width,
																		child.height);
												} else
													class37_sub4_sub9_sub3
															.method636(
																	i_10_,
																	i_12_,
																	child.width,
																	child.height,
																	(-(i_11_ & 0xff) + 256));
											}
										} else if (Class27.aBoolean672)
											Class73.refreshInterface(
													child);
									} else {
										Sprite class37_sub4_sub9_sub3 = (child
												.get_sprite(Class37_Sub4_Sub3
														.method470(child,
																4)));
										if (class37_sub4_sub9_sub3 == null) {
											if (Class27.aBoolean672)
												Class73.refreshInterface(
														child);
										} else
											class37_sub4_sub9_sub3.method653(
													i_10_, i_12_);
									}
								} else if (child.type == 6) {
									int i_52_ = 0;
									boolean bool = Class37_Sub4_Sub3.method470(
											child, 4);
									Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = null;
									int i_53_;
									if (!bool)
										i_53_ = child.disabledAnim;
									else
										i_53_ = child.enabledAnim;
									if ((child.itemId ^ 0xffffffff) != 0) {
										RSItem class37_sub4_sub1 = Class46
												.loadItem(
														(child.itemId),
														(byte) 84);
										if (class37_sub4_sub1 != null) {
											class37_sub4_sub1 = (class37_sub4_sub1
													.method453(
															child.itemZoom,
															-78));
											class37_sub4_sub7_sub6 = (class37_sub4_sub1
													.method451((byte) -114, 1));
											if (class37_sub4_sub7_sub6 == null)
												Class73.refreshInterface(
														child);
											else {
												class37_sub4_sub7_sub6
														.method555();
												i_52_ = (class37_sub4_sub7_sub6.anInt2627) / 2;
											}
										}
									} else if (child.modelTypeDisabled != 5) {
										if ((i_53_ ^ 0xffffffff) == 0) {
											class37_sub4_sub7_sub6 = (child
													.method190(
															i_4_ + 26908,
															-1,
															null,
															bool,
															null));
											if (class37_sub4_sub7_sub6 == null
													&& Class27.aBoolean672)
												Class73.refreshInterface(
														child);
										} else {
											Class37_Sub4_Sub12 class37_sub4_sub12 = (Class37_Sub9_Sub22
													.method861(i_53_));
											class37_sub4_sub7_sub6 = (child
													.method190(
															124,
															child.anInt443,
															class37_sub4_sub12,
															bool,
															null));
											if (class37_sub4_sub7_sub6 == null
													&& Class27.aBoolean672)
												Class73.refreshInterface(
														child);
										}
									} else if (child.mediaIdDisabled != 0) {
										//class37_sub4_sub7_sub6 = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
										//		.method493(true);
										//System.out.println("Should be player, but skipping");
									} else
										class37_sub4_sub7_sub6 = (Class57.aClass29_1098
												.method272(null, -1, -256, -1,
														null));
									if (class37_sub4_sub7_sub6 != null) {
										Rasterizer
												.method668(
														(child.width / 2 + (i_10_ + child.translateX)),
														(child.translateY
																+ child.height
																/ 2 + i_12_));
										int i_54_ = ((child.zoom * (Rasterizer.anIntArray3910[child.rotateX])) >> -1428547440);
										int i_55_ = (((Rasterizer.anIntArray3929[child.rotateX]) * child.zoom) >> 1523352048);
										if (!child.newFormat)
											class37_sub4_sub7_sub6.method544(0,
													child.rotateY, 0,
													child.rotateX, 0,
													i_54_, i_55_);
										else if (!child.aBoolean364)
											class37_sub4_sub7_sub6
													.method544(
															0,
															child.rotateY,
															child.rotateZ,
															child.rotateX,
															child.offsetX,
															child.offsetY + (i_54_ + i_52_),
															i_55_ - -child.offsetY);
										else
											class37_sub4_sub7_sub6
													.method557(
															0,
															child.rotateY,
															child.rotateZ,
															child.rotateX,
															child.offsetX,
															i_54_ - (-i_52_ - child.offsetY),
															child.offsetY + i_55_,
															child.zoom);
										Rasterizer.method659();
									}
								} else {
									if (child.type == 7) {
										Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = child
												.method200(i_4_ ^ 0x68ec);
										if (class37_sub4_sub9_sub2_sub1 == null) {
											if (Class27.aBoolean672)
												Class73.refreshInterface(
														child);
											continue;
										}
										int i_56_ = 0;
										for (int i_57_ = 0; ((child.height ^ 0xffffffff) < (i_57_ ^ 0xffffffff)); i_57_++) {
											for (int i_58_ = 0; child.width > i_58_; i_58_++) {
												if ((child.inv[i_56_]) > 0) {
													RSItem class37_sub4_sub1 = (Class46
															.loadItem(
																	(child.inv[i_56_]) - 1,
																	(byte) 108));
													RSString rSString;
													if (((class37_sub4_sub1.stackable) ^ 0xffffffff) == -2
															|| (child.invStackSize[i_56_]) != 1)
														rSString = (Class37_Sub9_Sub27
																.method881(
																		(new RSString[] {
																				(Class37_Sub4_Sub2.aClass16_2537),
																				(class37_sub4_sub1.itemName),
																				(Class37_Sub9_Sub23.aClass16_3350),
																				(Class37_Sub11_Sub1
																						.method994(
																								(child.invStackSize[i_56_]),
																								3)) })));
													else
														rSString = (Class37_Sub9_Sub27
																.method881(
																		(new RSString[] {
																				(Class37_Sub4_Sub2.aClass16_2537),
																				(class37_sub4_sub1.itemName),
																				(Class37_Sub9_Sub22.aClass16_3332) })));
													int i_59_ = ((i_58_ * (child.invSpritePadX + 115)) + i_10_);
													int i_60_ = ((i_57_ * (12 + (child.invSpritePadY))) + i_12_);
													if ((child.horizontalAlignment ^ 0xffffffff) != -1) {
														if ((child.horizontalAlignment ^ 0xffffffff) != -2)
															class37_sub4_sub9_sub2_sub1
																	.method603(
																			rSString,
																			(-1 + (i_59_ + (child.width))),
																			i_60_,
																			(child.disabledColor),
																			(!(child.shaded) ? -1
																					: 0));
														else
															class37_sub4_sub9_sub2_sub1
																	.method606(
																			rSString,
																			(i_59_ + ((child.width) / 2)),
																			i_60_,
																			(child.disabledColor),
																			(!(child.shaded) ? -1
																					: 0));
													} else
														class37_sub4_sub9_sub2_sub1
																.method607(
																		rSString,
																		i_59_,
																		i_60_,
																		child.disabledColor,
																		((child.shaded) ? 0
																				: -1));
												}
												i_56_++;
											}
										}
									}
									if ((child.type ^ 0xffffffff) == -9
											&& Class19.aClass18_491 == child
											&& ((Cache.anInt1241 ^ 0xffffffff) == (Class37_Sub9_Sub2.anInt2935 ^ 0xffffffff))) {
										int i_61_ = 0;
										Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = (Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315);
										RSString rSString = child.disabledText;
										rSString = (Class37_Sub9_Sub25
												.method873((byte) -80,
														child, rSString));
										int i_62_ = 0;
										while (rSString.length() > 0) {
											int i_63_ = (rSString
													.method156(
															-122,
															(Class37_Sub9_Sub11.aClass16_3107)));
											RSString class16_64_;
											if (i_63_ != -1) {
												class16_64_ = rSString
														.method169(0, 0, i_63_);
												rSString = (rSString
														.method158(i_63_ + 4,
																i_4_ + 26786));
											} else {
												class16_64_ = rSString;
												rSString = (Class37_Sub9_Sub8.aClass16_3045);
											}
											int i_65_ = class37_sub4_sub9_sub2_sub1
													.method617(class16_64_);
											if ((i_65_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff))
												i_61_ = i_65_;
											i_62_ += (1 + (class37_sub4_sub9_sub2_sub1.anInt727));
										}
										int i_66_ = 5 + i_12_
												- -child.height;
										i_62_ += 7;
										if (i_66_ + i_62_ > i_2_)
											i_66_ = -i_62_ + i_2_;
										i_61_ += 6;
										int i_67_ = (i_10_
												+ (child.width + -5) - i_61_);
										if ((5 + i_10_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff))
											i_67_ = 5 + i_10_;
										if ((i_61_ + i_67_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
											i_67_ = i_6_ - i_61_;
										Graphics2D.method578(i_67_,
												i_66_, i_61_, i_62_, 16777120);
										Graphics2D.method595(i_67_,
												i_66_, i_61_, i_62_, 0);
										rSString = child.disabledText;
										int i_68_ = (i_66_ + ((class37_sub4_sub9_sub2_sub1.anInt727) - -2));
										rSString = (Class37_Sub9_Sub25
												.method873((byte) -46,
														child, rSString));
										while ((rSString.length() ^ 0xffffffff) < -1) {
											int i_69_ = (rSString
													.method156(
															106,
															(Class37_Sub9_Sub11.aClass16_3107)));
											RSString class16_70_;
											if (i_69_ == -1) {
												class16_70_ = rSString;
												rSString = (Class37_Sub9_Sub8.aClass16_3045);
											} else {
												class16_70_ = rSString
														.method169(0, 0, i_69_);
												rSString = (rSString.method158(
														i_69_ - -4,
														i_4_ ^ 0x68a2));
											}
											class37_sub4_sub9_sub2_sub1
													.method607(class16_70_,
															i_67_ - -3, i_68_,
															0, -1);
											i_68_ += (class37_sub4_sub9_sub2_sub1.anInt727)
													- -1;
										}
									}
									if (child.type == 9) {
										if (child.thickness != 1) {
											int i_71_ = (child.width < 0 ? -child.width
													: child.width);
											int i_72_ = i_71_;
											int i_73_ = ((child.height ^ 0xffffffff) <= -1 ? child.height
													: -child.height);
											if (i_72_ < i_73_)
												i_72_ = i_73_;
											if ((i_72_ ^ 0xffffffff) != -1) {
												int i_74_ = ((child.height << 1335405680) / i_72_);
												int i_75_ = i_12_ + -i_1_;
												int i_76_ = ((child.width << 311118480) / i_72_);
												if (i_76_ >= i_74_)
													i_76_ = -i_76_;
												else
													i_74_ = -i_74_;
												int i_77_ = (1 + (i_76_ * child.thickness) >> 1330221105);
												int i_78_ = i_10_ + -i_3_;
												int i_79_ = (i_74_
														* child.thickness >> -1786251023);
												int i_80_ = (child.thickness
														* i_76_ >> -2072552239);
												int i_81_ = (child.width + (i_78_ - -i_79_));
												int i_82_ = i_79_ + i_78_;
												int i_83_ = (child.thickness
														* i_74_ + 1) >> -1394709167;
												int i_84_ = -i_83_ + i_78_;
												int i_85_ = i_80_ + i_75_;
												int i_86_ = (child.width + (i_78_ - i_83_));
												int i_87_ = i_75_ + -i_77_;
												int i_88_ = (child.height + (i_75_ - i_77_));
												int i_89_ = i_75_
														+ (child.height + i_80_);
												Rasterizer
														.method665(i_82_,
																i_84_, i_86_);
												Rasterizer
														.method670(
																i_85_,
																i_87_,
																i_88_,
																i_82_,
																i_84_,
																i_86_,
																child.disabledColor);
												Rasterizer
														.method665(i_82_,
																i_86_, i_81_);
												Rasterizer
														.method670(
																i_85_,
																i_88_,
																i_89_,
																i_82_,
																i_86_,
																i_81_,
																child.disabledColor);
											}
										} else
											Graphics2D
													.method577(
															i_10_,
															i_12_,
															i_10_
																	+ child.width,
															i_12_
																	- -child.height,
															child.disabledColor);
									}
								}
							}
						}
						//Class60.lastMousePress == 1
						//Class37_Sub4_Sub7_Sub7.lastMouseX
						//Class37_Sub9_Sub1.lastMouseY
						if (child == GUI.selectedChildInterface) {
							//System.out.println((child.anInt394&0xffff)+":"+(i_7_&0xffff));
							Graphics2D.method595(i_10_, i_12_, child.width, child.height, 0xff0000);
							boolean canmove = false;
							if(Class60.lastMousePress == 1) {
								if ((Class37_Sub4_Sub7_Sub7.lastMouseX >= i_10_ && Class37_Sub4_Sub7_Sub7.lastMouseX <= i_10_
										+ child.width)
										&& (Class37_Sub9_Sub1.lastMouseY >= i_12_ && Class37_Sub9_Sub1.lastMouseY <= i_12_
												+ child.height))
									canmove = true;
							}
							int x2 = Class37_Sub4_Sub7_Sub7.lastMouseX;
							int y2 = Class37_Sub9_Sub1.lastMouseY;

							x10 = x10 - x2;
							y10 = y10 - y2;

							if (canmove) {
								child.x -= x10;
								child.y -= y10;
							}

							x10 = Class37_Sub4_Sub7_Sub7.lastMouseX;
							y10 = Class37_Sub9_Sub1.lastMouseY;
						}
					}
				}
			}
		}
	}
	
	static int x10;
	static int y10;

	public static void method1140(int i) {
		Class37_Sub9_Sub27.aClass55_3417.anInt1079 = 0;
		Class37_Sub9_Sub16.anInt3192 = 0;
		Class37_Sub9_Sub19.aLong3250 = 0L;
		Class37_Sub20.aBoolean2217 = true;
		Class78.aBoolean1464 = true;
		anInt1059++;
		Class37_Sub23.method1028(-101);
		Class37_Sub9_Sub13.anInt3134 = 0;
		Class37_Sub16.anInt2151 = -1;
		Class37_Sub9_Sub30.anInt3480 = 0;
		Class37_Sub9_Sub17.anInt3225 = -1;
		Class37_Sub20.menu_open = false;
		RSInterface.anInt438 = 0;
		Class37_Sub4_Sub12.anInt2767 = 0;
		Class37_Sub3_Sub3.anInt2388 = 0;
		Class88.anInt1604 = 0;
		Hashtable.anInt224 = 0;
		client.anInt1726 = 0;
		Class37_Sub9_Sub1.anInt2913 = 0;
		Class37_Sub7.anInt1899 = 0;
		Class80.anInt1502 = 0;
		Class42.anInt947 = 0;
		Class39.anInt869 = 0;
		ByteVector.anInt2069 = 0;
		Class37_Sub23.anInt2236 = 0;
		Class37_Sub9_Sub2.anInt2936 = 0;
		Class37_Sub4_Sub15.anInt2839 = 0;
		Class37_Sub9_Sub32.anInt3501 = 0;
		Class37_Sub4_Sub15.anInt2840 = 0;
		Class37_Sub9_Sub20.anInt3280 = 0;
		Class37_Sub9_Sub7.anInt3043 = 0;
		Cache.anInt1223 = 0;
		Class37_Sub9_Sub19.anInt3259 = 0;
		Class37_Sub4_Sub7_Sub5.anInt3815 = 0;
		RSItem.anInt2513 = 0;
		Class71.anInt1366 = 0;
		RSString.anInt1678 = 0;
		Class37_Sub9_Sub6.anInt3019 = 0;
		Class37_Sub9_Sub34.anInt3540 = 0;
		Class80.anInt1506 = 0;
		Class87.anInt1591 = 0;
		Class42.anInt918 = 0;
		MouseHandler.anInt185 = 0;
		Class76.anInt1425 = 0;
		Class15_Sub1.anInt1745 = 0;
		Class14.anInt249 = 0;
		InventoryDef.anInt2884 = 0;
		InventoryDef.anInt2876 = 0;
		Class37_Sub3_Sub1.anInt2330 = 0;
		Class37_Sub4_Sub10.anInt2669 = 0;
		Class37_Sub9_Sub8.anInt3050 = 0;
		RSString.anInt1647 = 0;
		Class37_Sub9_Sub33.anInt3513 = 0;
		RSString.anInt1671 = 0;
		Class3.anInt85 = 0;
		Class15_Sub1.anInt1740 = 0;
		Class37_Sub9_Sub2.anInt2925 = 0;
		Class36.anInt806 = 0;
		Class42.anInt915 = 0;
		Class88.anInt1606 = 0;
		Class46.anInt984 = 0;
		Class37_Sub9.anInt1953 = 0;
		Class14.anInt251 = 0;
		Class35.anInt794 = 0;
		Class37_Sub3_Sub3.anInt2378 = 0;
		Class37_Sub9_Sub15.anInt3166 = 0;
		Class37_Sub9_Sub4.anInt2976 = 0;
		Class15_Sub1.anInt1744 = 0;
		Class37_Sub3_Sub3.anInt2362 = 0;
		Class56.anInt1091 = 0;
		Class37_Sub9_Sub16.anInt3200 = 0;
		Class26.anInt654 = 0;
		Class37_Sub4_Sub11.anInt2703 = 0;
		Applet_Sub1.anInt29 = 0;
		RSString.anInt1668 = 0;
		Deque.anInt1116 = 0;
		Class68.anInt1326 = 0;
		RSString.anInt1673 = 0;
		Applet_Sub1.anInt23 = 0;
		Class15.anInt295 = 0;
		Class37_Sub4_Sub4.anInt2589 = 0;
		Class37_Sub4_Sub12.anInt2764 = 0;
		Class37_Sub12.anInt2094 = 0;
		Applet_Sub1.anInt42 = 0;
		Class37_Sub9_Sub28.anInt3423 = 0;
		Class82.anInt1707 = 0;
		Class37_Sub7.anInt1915 = 0;
		Class24.anInt621 = 0;
		MouseHandler.anInt189 = 0;
		RSString.anInt1667 = 0;
		Class66.anInt1248 = 0;
		Class37_Sub25.anInt2276 = 0;
		client.anInt1733 = 0;
		Class15.anInt289 = 0;
		RSInterface.anInt384 = 0;
		ByteVector.anInt2060 = 0;
		Class32_Sub1.anInt1776 = 0;
		Class15.anInt258 = 0;
		Class37_Sub9_Sub8.anInt3049 = 0;
		client.anInt1729 = 0;
		Cache.anInt1239 = 0;
		Class37_Sub17.anInt2166 = 0;
		Class37_Sub3_Sub3.anInt2356 = 0;
		Class15.anInt268 = 0;
		Class37_Sub3_Sub3.anInt2349 = 0;
		RSItem.anInt2456 = 0;
		Class42.anInt937 = 0;
		Class37_Sub9_Sub27.anInt3412 = 0;
		RSString.anInt1658 = 0;
		ByteVector.anInt2054 = 0;
		Class32_Sub1.anInt1775 = 0;
		Class37_Sub4_Sub11.anInt2716 = 0;
		Class37_Sub3_Sub3.anInt2384 = 0;
		Class25.anInt639 = 0;
		Class37_Sub9_Sub34.anInt3543 = 0;
		MouseHandler.anInt188 = 0;
		Applet_Sub1.anInt32 = 0;
		InterfaceListener.anInt1934 = 0;
		Class6.anInt137 = 0;
		Class37_Sub9_Sub26.anInt3394 = 0;
		Class37_Sub4_Sub3.anInt2544 = 0;
		Class87.anInt1584 = 0;
		Class37_Sub9_Sub18.anInt3231 = 0;
		Class82.anInt1699 = 0;
		Class37_Sub3_Sub1.anInt2313 = 0;
		Class62.anInt1175 = 0;
		Class37_Sub9_Sub16.anInt3194 = 0;
		Class37_Sub9_Sub22.anInt3335 = 0;
		Class85.anInt1540 = 0;
		Class60.anInt1139 = 0;
		Class37_Sub9_Sub30.anInt3474 = 0;
		Class37_Sub9_Sub12.anInt3124 = 0;
		Class14.anInt236 = 0;
		Class37_Sub9_Sub8.anInt3047 = 0;
		Class37_Sub9_Sub1.anInt2922 = 0;
		ByteVector.anInt2058 = 0;
		Class32.anInt731 = 0;
		Class37_Sub4_Sub11.anInt2695 = 0;
		RSItem.anInt2486 = 0;
		Class15.anInt281 = 0;
		ByteVector.anInt2034 = 0;
		Class37_Sub4_Sub2.anInt2518 = 0;
		NodeSub.anInt1860 = 0;
		client.anInt1724 = 0;
		Class37_Sub9_Sub13.anInt3138 = 0;
		Class37_Sub9_Sub9.anInt3074 = 0;
		Class37_Sub9_Sub37.anInt3601 = 0;
		Class37_Sub9_Sub31.anInt3483 = 0;
		Class37_Sub9_Sub2.anInt2926 = 0;
		Class37_Sub9_Sub33.anInt3515 = 0;
		Class33.anInt747 = 0;
		ByteVector.anInt2049 = 0;
		RSString.anInt1676 = 0;
		Class37_Sub3_Sub3.anInt2375 = 0;
		Class37_Sub3_Sub3.anInt2367 = 0;
		RSItem.anInt2463 = 0;
		Class37_Sub9_Sub28.anInt3426 = 0;
		Class37_Sub9_Sub37.anInt3595 = 0;
		Class72.anInt1373 = 0;
		Class62.anInt1176 = 0;
		Class15_Sub1.anInt1759 = 0;
		Class19.anInt477 = 0;
		Class37_Sub9_Sub26.anInt3393 = 0;
		Class37_Sub9_Sub34.anInt3534 = 0;
		Class29.anInt703 = 0;
		Class50.anInt1024 = 0;
		Class37_Sub4_Sub16.anInt2867 = 0;
		Class25.anInt643 = 0;
		Class37_Sub9.anInt1976 = 0;
		Class42.anInt914 = 0;
		Class37_Sub3_Sub3.anInt2337 = 0;
		Hashtable.anInt217 = 0;
		Class37_Sub3_Sub3.anInt2365 = 0;
		Class37_Sub9_Sub14.anInt3155 = 0;
		Class37_Sub3_Sub3.anInt2354 = 0;
		Class37_Sub9_Sub8.anInt3060 = 0;
		Class37_Sub9.anInt1962 = 0;
		Class20.anInt533 = 0;
		Class37_Sub3_Sub3.anInt2338 = 0;
		Class84.anInt1533 = 0;
		Class37_Sub9_Sub22.anInt3322 = 0;
		Class89.anInt1620 = 0;
		Class3.anInt90 = 0;
		Class42.anInt946 = 0;
		Class37_Sub9.anInt1977 = 0;
		Applet_Sub1.anInt27 = 0;
		ByteVector.anInt2045 = 0;
		Class15.anInt292 = 0;
		Class8.anInt167 = 0;
		Class37_Sub9_Sub3.anInt2945 = 0;
		Class87.anInt1589 = 0;
		Class37_Sub9_Sub3.anInt2948 = 0;
		Class37_Sub9.anInt1958 = 0;
		Class37_Sub4_Sub7_Sub2.anInt3707 = 0;
		RSString.anInt1644 = 0;
		Class37_Sub9_Sub31.anInt3486 = 0;
		Applet_Sub1.anInt20 = 0;
		Class20.anInt537 = 0;
		Class39.anInt870 = 0;
		Class37_Sub4_Sub7_Sub2.anInt3719 = 0;
		RSString.anInt1666 = 0;
		Class37_Sub4_Sub3.anInt2546 = 0;
		ByteVector.anInt2050 = 0;
		Class37_Sub9.anInt1944 = 0;
		Applet_Sub1.anInt17 = 0;
		NodeSub.anInt1843 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3997 = 0;
		Class35.anInt778 = 0;
		Class20.anInt546 = 0;
		Class2.anInt74 = 0;
		Class37_Sub9.anInt1974 = 0;
		NodeSub.anInt1861 = 0;
		NodeSub.anInt1855 = 0;
		ByteVector.anInt2037 = 0;
		Applet_Sub1.anInt6 = 0;
		Class17.anInt305 = 0;
		Class17.anInt302 = 0;
		Node.anInt816 = 0;
		KeyboardHandler.anInt564 = 0;
		Class22.anInt576 = 0;
		Class37_Sub3_Sub3.anInt2357 = 0;
		Deque.anInt1127 = 0;
		Class32_Sub1.anInt1783 = 0;
		Class37_Sub9_Sub6.anInt3016 = 0;
		Class37_Sub4_Sub15.anInt2843 = 0;
		Class37_Sub9_Sub2.anInt2937 = 0;
		Class37_Sub9_Sub4.anInt2964 = 0;
		Class37_Sub9_Sub34.anInt3548 = 0;
		NodeSub.anInt1854 = 0;
		Class37_Sub9_Sub36.anInt3575 = 0;
		RSString.anInt1662 = 0;
		Class19.anInt482 = 0;
		RSItem.anInt2432 = 0;
		Class37_Sub9_Sub29.anInt3446 = 0;
		Class37_Sub9_Sub4.anInt2974 = 0;
		Class41.anInt888 = 0;
		Class37_Sub12.anInt2089 = 0;
		Class3.anInt84 = 0;
		Class37_Sub9_Sub20.anInt3277 = 0;
		Class52_Sub1.anInt2308 = 0;
		Class37_Sub9_Sub11.anInt3096 = 0;
		ByteVector.anInt2047 = 0;
		RSString.anInt1681 = 0;
		Class37_Sub9_Sub22.anInt3331 = 0;
		NodeSub.anInt1850 = 0;
		Class37_Sub9_Sub6.anInt3014 = 0;
		RSString.anInt1656 = 0;
		Class69.anInt1340 = 0;
		Class39.anInt853 = 0;
		Class72.anInt1374 = 0;
		Class37_Sub9_Sub19.anInt3270 = 0;
		Class85.anInt1574 = 0;
		Class38.anInt826 = 0;
		Applet_Sub1.anInt28 = 0;
		Class37_Sub9_Sub21.anInt3316 = 0;
		Class37_Sub9_Sub16.anInt3184 = 0;
		Class37_Sub12.anInt2075 = 0;
		NodeSub.anInt1846 = 0;
		Applet_Sub1.anInt7 = 0;
		Class69.anInt1337 = 0;
		Canvas_Sub1.anInt52 = 0;
		Class15.anInt275 = 0;
		ByteVector.anInt2042 = 0;
		MouseHandler.anInt179 = 0;
		Class79.anInt1485 = 0;
		Class15_Sub1.anInt1756 = 0;
		Node.anInt823 = 0;
		RSInterface.anInt361 = 0;
		Node.anInt811 = 0;
		Class37_Sub9_Sub8.anInt3046 = 0;
		RSString.anInt1637 = 0;
		Class55.anInt1075 = 0;
		Class37_Sub1.anInt1799 = 0;
		Class33.anInt760 = 0;
		Class20.anInt541 = 0;
		Class37_Sub3_Sub3.anInt2397 = 0;
		Class55.anInt1068 = 0;
		Class83.anInt1517 = 0;
		ByteVector.anInt2019 = 0;
		Class38.anInt829 = 0;
		Class43.anInt952 = 0;
		Class37_Sub3_Sub3.anInt2368 = 0;
		Class15.anInt280 = 0;
		Class32_Sub1.anInt1771 = 0;
		NodeSub.anInt1847 = 0;
		Class37_Sub4_Sub10.anInt2671 = 0;
		Class37_Sub3_Sub3.anInt2363 = 0;
		Class37_Sub4_Sub4.anInt2567 = 0;
		Class60.anInt1158 = 0;
		client.anInt1720 = 0;
		Class37_Sub3_Sub1.anInt2314 = 0;
		client.anInt1725 = 0;
		Class37_Sub9_Sub16.anInt3205 = 0;
		Class37_Sub9_Sub20.anInt3288 = 0;
		ByteVector.anInt2005 = 0;
		Class37_Sub4_Sub11.anInt2722 = 0;
		Applet_Sub1.anInt14 = 0;
		Class37_Sub3_Sub3.anInt2345 = 0;
		KeyboardHandler.anInt567 = 0;
		Class39.anInt860 = 0;
		Queue.anInt1441 = 0;
		Class37_Sub9_Sub36.anInt3570 = 0;
		Class37_Sub3_Sub3.anInt2361 = 0;
		Class15.anInt288 = 0;
		Class37_Sub4_Sub8.anInt2653 = 0;
		InterfaceListener.anInt1930 = 0;
		ByteVector.anInt2057 = 0;
		Class20.anInt549 = 0;
		Class37_Sub9_Sub20.anInt3290 = 0;
		Class15.anInt264 = 0;
		Class37_Sub4_Sub7.anInt2630 = 0;
		Class78.anInt1461 = 0;
		Class37_Sub4_Sub7_Sub7.anInt3841 = 0;
		ByteVector.anInt2052 = 0;
		Class37_Sub9_Sub32.anInt3498 = 0;
		Class37_Sub4_Sub13.anInt2795 = 0;
		Class37_Sub9_Sub15.anInt3180 = 0;
		Class15.anInt267 = 0;
		Class37_Sub3_Sub3.anInt2360 = 0;
		client.anInt1717 = 0;
		ByteVector.anInt2003 = 0;
		Class37_Sub3_Sub3.anInt2393 = 0;
		Class37_Sub9_Sub34.anInt3532 = 0;
		Class37_Sub9_Sub12.anInt3120 = 0;
		Class37_Sub9_Sub29.anInt3441 = 0;
		Class37_Sub9_Sub15.anInt3176 = 0;
		Class37_Sub9_Sub15.anInt3177 = 0;
		Class37_Sub4_Sub12.anInt2771 = 0;
		Class42.anInt922 = 0;
		Class37_Sub9_Sub5.anInt2993 = 0;
		Class71.anInt1357 = 0;
		Class37_Sub4_Sub13.anInt2796 = 0;
		Class37_Sub4_Sub10.anInt2670 = 0;
		Class37_Sub3_Sub3.anInt2353 = 0;
		Class37_Sub4_Sub13.anInt2789 = 0;
		Class85.anInt1546 = 0;
		Class37_Sub9_Sub28.anInt3424 = 0;
		Class37_Sub5.anInt1869 = 0;
		Class37_Sub4_Sub7_Sub5.anInt3809 = 0;
		Class71.anInt1368 = 0;
		Class37_Sub9_Sub19.anInt3256 = 0;
		Class37_Sub9_Sub7.anInt3036 = 0;
		Class37_Sub4_Sub7_Sub7.anInt3845 = 0;
		Class69.anInt1348 = 0;
		Class37_Sub9_Sub17.anInt3210 = 0;
		Class46.anInt979 = 0;
		Class37_Sub9_Sub13.anInt3127 = 0;
		Class22.anInt589 = 0;
		Queue.anInt1451 = 0;
		Class73.anInt1387 = 0;
		anInt1063 = 0;
		ByteVector.anInt2074 = 0;
		Class37_Sub4_Sub3.anInt2551 = 0;
		Class37_Sub9_Sub9.anInt3079 = i;
		Class37_Sub4_Sub7.anInt2634 = 0;
		NodeSub.anInt1858 = 0;
		Class37_Sub9_Sub23.anInt3349 = 0;
		ByteVector.anInt2027 = 0;
		Class15.anInt285 = 0;
		Class38.anInt848 = 0;
		RSString.anInt1670 = 0;
		Class37_Sub9_Sub27.anInt3398 = 0;
		Class19.anInt461 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3656 = 0;
		Applet_Sub1.anInt2 = 0;
		RSString.anInt1675 = 0;
		Class37_Sub9_Sub22.anInt3323 = 0;
		Class37_Sub9_Sub36.anInt3586 = 0;
		Class37_Sub11_Sub1.anInt3629 = 0;
		Class37_Sub9_Sub3.anInt2950 = 0;
		Class88.anInt1597 = 0;
		Class45.anInt976 = 0;
		KeyboardHandler.anInt566 = 0;
		ByteVector.anInt2002 = 0;
		KeyboardHandler.anInt563 = 0;
		Class37_Sub4_Sub18.anInt2894 = 0;
		Deque.anInt1118 = 0;
		Class37_Sub9_Sub4.anInt2969 = 0;
		Class37_Sub9_Sub11.anInt3097 = 0;
		Class87.anInt1593 = 0;
		Applet_Sub1.anInt1 = 0;
		ByteVector.anInt2065 = 0;
		Class10.anInt190 = 0;
		InterfaceListener.anInt1935 = 0;
		Class37_Sub9_Sub22.anInt3343 = 0;
		Class49.anInt1007 = 0;
		RSItem.anInt2481 = 0;
		Class37_Sub9_Sub4.anInt2961 = 0;
		Class37_Sub9_Sub14.anInt3152 = 0;
		Class68.anInt1328 = 0;
		InterfaceClickMask.anInt1993 = 0;
		ByteVector.anInt2020 = 0;
		Class37_Sub9_Sub6.anInt3026 = 0;
		Class37_Sub9_Sub26.anInt3392 = 0;
		Class37_Sub16.anInt2153 = 0;
		Class37_Sub9_Sub30.anInt3471 = 0;
		Class68.anInt1321 = 0;
		Class37_Sub5.anInt1870 = 0;
		RSString.anInt1641 = 0;
		Class37_Sub9_Sub24.anInt3363 = 0;
		RSItem.anInt2448 = 0;
		Class38.anInt833 = 0;
		Class37_Sub4_Sub7_Sub3.anInt3753 = 0;
		ByteVector.anInt2043 = 0;
		Class79.anInt1468 = 0;
		Class24.anInt614 = 0;
		Class83.anInt1512 = 0;
		Class82.anInt1708 = 0;
		Class37_Sub9_Sub8.anInt3065 = 0;
		Class37_Sub4_Sub11.anInt2724 = 0;
		Class37_Sub9_Sub20.anInt3291 = 0;
		Class32_Sub1.anInt1772 = 0;
		Class37_Sub9_Sub36.anInt3574 = 0;
		Class32_Sub1.anInt1777 = 0;
		Class37_Sub9_Sub27.anInt3408 = 0;
		Class37_Sub5.anInt1864 = 0;
		Class37_Sub9_Sub29.anInt3445 = 0;
		Class37_Sub9_Sub16.anInt3209 = 0;
		Class37_Sub9_Sub10.anInt3088 = 0;
		RSString.anInt1636 = 0;
		Cache.anInt1234 = 0;
		Class82.anInt1706 = 0;
		Class37_Sub17.anInt2162 = 0;
		ByteVector.anInt2039 = 0;
		Class39.anInt856 = 0;
		Class82.anInt1704 = 0;
		Class37_Sub9_Sub31.anInt3481 = 0;
		Class76.anInt1424 = 0;
		Class19.anInt465 = 0;
		Class64.anInt1215 = 0;
		anInt1062 = 0;
		Hashtable.anInt223 = 0;
		Class15_Sub1.anInt1755 = 0;
		Class37_Sub9_Sub33.anInt3517 = 0;
		InterfaceClickMask.anInt1989 = 0;
		ByteVector.anInt2068 = 0;
		Class83.anInt1516 = 0;
		Class37_Sub9_Sub13.anInt3125 = 0;
		Class37_Sub4_Sub16.anInt2866 = 0;
		Class79.anInt1477 = 0;
		Class37_Sub9_Sub24.anInt3366 = 0;
		Class24.anInt599 = 0;
		Class33.anInt750 = 0;
		Class37_Sub3_Sub3.anInt2369 = 0;
		Class37_Sub9_Sub37.anInt3607 = 0;
		Class37_Sub4_Sub7_Sub2.anInt3709 = 0;
		Class37_Sub9_Sub16.anInt3203 = 0;
		Class37_Sub4_Sub12.anInt2768 = 0;
		Class24.anInt619 = 0;
		Class37_Sub9_Sub36.anInt3571 = 0;
		Class24.anInt608 = 0;
		Class37_Sub23.anInt2231 = 0;
		Class37_Sub9_Sub35.anInt3569 = 0;
		RSString.anInt1680 = 0;
		Deque.anInt1122 = 0;
		Class1.anInt60 = 0;
		Class37_Sub9_Sub16.anInt3196 = 0;
		Class37_Sub9_Sub33.anInt3510 = 0;
		Class55.anInt1074 = 0;
		Class37_Sub3_Sub1.anInt2323 = 0;
		Applet_Sub1.anInt18 = 0;
		ByteVector.anInt2040 = 0;
		Class37_Sub12.anInt2101 = 0;
		Class37_Sub9_Sub34.anInt3542 = 0;
		Class37_Sub9_Sub15.anInt3174 = 0;
		Class37_Sub25.anInt2281 = 0;
		Class42.anInt930 = 0;
		Canvas_Sub1.anInt51 = 0;
		Class69.anInt1334 = 0;
		Class37_Sub4_Sub12.anInt2765 = 0;
		RSString.anInt1649 = 0;
		Class37_Sub9_Sub10.anInt3086 = 0;
		Class37_Sub4_Sub2.anInt2522 = 0;
		Class22.anInt586 = 0;
		Class37_Sub9_Sub20.anInt3289 = 0;
		Class37_Sub9_Sub21.anInt3318 = 0;
		RSString.anInt1654 = 0;
		Class37_Sub4_Sub15.anInt2817 = 0;
		RSItem.anInt2492 = 0;
		InterfaceClickMask.anInt1995 = 0;
		Class59.anInt1137 = 0;
		Class33.anInt757 = 0;
		Applet_Sub1.anInt26 = 0;
		Class37_Sub9_Sub27.anInt3419 = 0;
		Class8.anInt159 = 0;
		Class39.anInt854 = 0;
		Class38.anInt852 = 0;
		Class37_Sub3_Sub1.anInt2319 = 0;
		Class37_Sub7.anInt1893 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3644 = 0;
		Class62.anInt1174 = 0;
		Class52.anInt1052 = 0;
		Class32.anInt739 = 0;
		Class83.anInt1514 = 0;
		Class37_Sub9_Sub3.anInt2947 = 0;
		ByteVector.anInt2048 = 0;
		RSString.anInt1642 = 0;
		ByteVector.anInt2072 = 0;
		Class37_Sub9_Sub5.anInt2989 = 0;
		Class82.anInt1712 = 0;
		Applet_Sub1.anInt25 = 0;
		Class37_Sub4_Sub12.anInt2772 = 0;
		Class37_Sub9_Sub17.anInt3220 = 0;
		RSString.anInt1672 = 0;
		Class66.anInt1257 = 0;
		Cache.anInt1227 = 0;
		Class19.anInt464 = 0;
		RSString.anInt1640 = 0;
		Class30.anInt722 = 0;
		Class26.anInt653 = 0;
		Class37_Sub3_Sub3.anInt2352 = 0;
		Class37_Sub9_Sub14.anInt3147 = 0;
		Class76.anInt1434 = 0;
		Class73.anInt1383 = 0;
		Class24.anInt607 = 0;
		Class37_Sub4_Sub3.anInt2550 = 0;
		Class46.anInt982 = 0;
		Class64.anInt1211 = 0;
		Class37_Sub9_Sub20.anInt3276 = 0;
		Class24.anInt601 = 0;
		Class37_Sub9.anInt1965 = 0;
		Class37_Sub9_Sub3.anInt2953 = 0;
		Class19.anInt467 = 0;
		Class37_Sub4_Sub5.anInt2600 = 0;
		Class15.anInt279 = 0;
		Class15.anInt291 = 0;
		Class37_Sub9_Sub25.anInt3383 = 0;
		Class33.anInt763 = 0;
		Class37_Sub23.anInt2226 = 0;
		Class37_Sub15.anInt2131 = 0;
		Class37_Sub9_Sub20.anInt3294 = 0;
		Class37_Sub9_Sub34.anInt3536 = 0;
		RSItem.anInt2500 = 0;
		RSString.anInt1683 = 0;
		Class38.anInt825 = 0;
		Class15_Sub1.anInt1748 = 0;
		RuntimeException_Sub1.anInt1630 = 0;
		RuntimeException_Sub1.anInt1631 = 0;
		Class4.anInt106 = 0;
		Class32_Sub1.anInt1781 = 0;
		Class37_Sub9_Sub37.anInt3600 = 0;
		Class37_Sub3_Sub1.anInt2318 = 0;
		RSString.anInt1635 = 0;
		MouseHandler.anInt184 = 0;
		Class52_Sub1.anInt2301 = 0;
		Class37_Sub3_Sub3.anInt2348 = 0;
		client.anInt1723 = 0;
		Deque.anInt1123 = 0;
		Class32_Sub1.anInt1773 = 0;
		ByteVector.anInt2026 = 0;
		Deque.anInt1112 = 0;
		RSInterface.anInt437 = 0;
		RSInterface.anInt373 = 0;
		Class37_Sub14.anInt2124 = 0;
		Class37_Sub9_Sub36.anInt3581 = 0;
		Class39.anInt862 = 0;
		Class37_Sub16.anInt2149 = 0;
		Class37_Sub9_Sub14.anInt3146 = 0;
		Class37_Sub9_Sub21.anInt3307 = 0;
		Class14.anInt239 = 0;
		Class87.anInt1585 = 0;
		OverridedInterface.anInt1883 = 0;
		Class37_Sub3_Sub3.anInt2344 = 0;
		RSItem.anInt2427 = 0;
		Class2.anInt73 = 0;
		Class37_Sub11_Sub1.anInt3616 = 0;
		Class73.anInt1381 = 0;
		Class37_Sub9_Sub3.anInt2938 = 0;
		Class84.anInt1529 = 0;
		Class37_Sub9_Sub27.anInt3409 = 0;
		Class37_Sub2.anInt1812 = 0;
		Class37_Sub7.anInt1911 = 0;
		Class36.anInt801 = 0;
		Class37_Sub3_Sub3.anInt2359 = 0;
		Class45.anInt971 = 0;
		Class37_Sub4_Sub8.anInt2647 = 0;
		Class42.anInt924 = 0;
		Class37_Sub9_Sub19.anInt3268 = 0;
		Class24.anInt622 = 0;
		RSItem.anInt2472 = 0;
		Class42.anInt916 = 0;
		Class37_Sub4_Sub18.anInt2888 = 0;
		Class37_Sub9_Sub1.anInt2921 = 0;
		Class52.anInt1049 = 0;
		Class37_Sub15.anInt2142 = 0;
		Class15.anInt287 = 0;
		Class24.anInt610 = 0;
		RSInterface.anInt392 = 0;
		Deque.anInt1107 = 0;
		Class37_Sub4_Sub4.anInt2580 = 0;
		MouseHandler.anInt175 = 0;
		Class37_Sub4_Sub7_Sub1_Sub1.anInt3958 = 0;
		ByteVector.anInt2051 = 0;
		MouseHandler.anInt170 = 0;
		Class82.anInt1695 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3968 = 0;
		Class37_Sub4_Sub18.anInt2898 = 0;
		Class37_Sub9_Sub26.anInt3386 = 0;
		ByteVector.anInt2036 = 0;
		Class17.anInt296 = 0;
		Class37_Sub4_Sub4.anInt2563 = 0;
		Class37_Sub9_Sub15.anInt3167 = 0;
		Class37_Sub9_Sub32.anInt3500 = 0;
		Class37_Sub9.anInt1975 = 0;
		RSString.anInt1651 = 0;
		Hashtable.anInt218 = 0;
		Class72.anInt1372 = 0;
		Deque.anInt1105 = 0;
		ByteVector.anInt2056 = 0;
		Class37_Sub9_Sub32.anInt3502 = 0;
		RSString.anInt1652 = 0;
		ByteVector.anInt2029 = 0;
		Class73.anInt1390 = 0;
		Class37_Sub4_Sub7_Sub2.anInt3716 = 0;
		Class37_Sub9_Sub23.anInt3353 = 0;
		Class37_Sub9_Sub29.anInt3451 = 0;
		Class37_Sub4_Sub2.anInt2529 = 0;
		Class37_Sub3_Sub3.anInt2381 = 0;
		InterfaceListener.anInt1924 = 0;
		Class22.anInt578 = 0;
		Class37_Sub9_Sub21.anInt3304 = 0;
		Class72.anInt1370 = 0;
		Class37_Sub9_Sub12.anInt3114 = 0;
		Class37_Sub9_Sub25.anInt3384 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3672 = 0;
		Class6.anInt142 = 0;
		Class29.anInt706 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3986 = 0;
		Class37_Sub4_Sub7_Sub1_Sub1.anInt3946 = 0;
		Class36.anInt804 = 0;
		Class37_Sub9_Sub5.anInt2990 = 0;
		Applet_Sub1.anInt33 = 0;
		Class37_Sub4_Sub8.anInt2655 = 0;
		Class37_Sub9_Sub12.anInt3122 = 0;
		Class37_Sub25.anInt2289 = 0;
		Class71.anInt1361 = 0;
		Class37_Sub9_Sub15.anInt3171 = 0;
		ByteVector.anInt2013 = 0;
		ByteVector.anInt2010 = 0;
		Class38.anInt834 = 0;
		Class37_Sub4_Sub8.anInt2646 = 0;
		Class20.anInt536 = 0;
		Class37_Sub9_Sub28.anInt3432 = 0;
		Class37_Sub2.anInt1824 = 0;
		Class30.anInt723 = 0;
		Class37_Sub11_Sub1.anInt3612 = 0;
		KeyboardHandler.anInt562 = 0;
		Deque.anInt1120 = 0;
		RSString.anInt1657 = 0;
		Applet_Sub1.anInt39 = 0;
		Class14.anInt244 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3963 = 0;
		Class56.anInt1085 = 0;
		Class38.anInt839 = 0;
		Canvas_Sub1.anInt49 = 0;
		Class37_Sub9_Sub17.anInt3221 = 0;
		Class29.anInt698 = 0;
		Class37_Sub9_Sub27.anInt3413 = 0;
		Class15.anInt265 = 0;
		Class45.anInt975 = 0;
		Class1.anInt58 = 0;
		ByteVector.anInt2053 = 0;
		Class37_Sub2.anInt1835 = 0;
		Class37_Sub9_Sub4.anInt2960 = 0;
		MouseHandler.anInt187 = 0;
		Class60.anInt1143 = 0;
		RSInterface.anInt351 = 0;
		Cache.anInt1220 = 0;
		Class37_Sub11_Sub1.anInt3617 = 0;
		Hashtable.anInt222 = 0;
		Class37_Sub9_Sub11.anInt3104 = 0;
		Class29.anInt715 = 0;
		Class71.anInt1355 = 0;
		Class30.anInt718 = 0;
		Class37_Sub4_Sub15.anInt2826 = 0;
		Cache.anInt1222 = 0;
		RSString.anInt1653 = 0;
		Class24.anInt598 = 0;
		Class37_Sub9_Sub28.anInt3421 = 0;
		Class15.anInt274 = 0;
		RSString.anInt1665 = 0;
		Class37_Sub9.anInt1950 = 0;
		Class82.anInt1697 = 0;
		Class37_Sub9_Sub6.anInt3015 = 0;
		Class37_Sub4_Sub5.anInt2593 = 0;
		Class84.anInt1535 = 0;
		Class37_Sub9_Sub5.anInt2992 = 0;
		Class37_Sub3_Sub3.anInt2358 = 0;
		Class37_Sub9_Sub29.anInt3458 = 0;
		Cache.anInt1224 = 0;
		Class86.anInt1580 = 0;
		Class15.anInt282 = 0;
		InterfaceClickMask.anInt1991 = 0;
		Hashtable.anInt219 = 0;
		Class37_Sub4_Sub7_Sub1_Sub1.anInt3939 = 0;
		Class37_Sub7.anInt1897 = 0;
		Class3.anInt88 = 0;
		Class20.anInt547 = 0;
		Class52_Sub1.anInt2296 = 0;
		Hashtable.anInt228 = 0;
		Class36.anInt798 = 0;
		Class37_Sub9_Sub19.anInt3267 = 0;
		Applet_Sub1.anInt34 = 0;
		Class32_Sub1.anInt1787 = 0;
		Class37_Sub3_Sub3.anInt2386 = 0;
		Node.anInt812 = 0;
		Class37_Sub9_Sub28.anInt3429 = 0;
		Class37_Sub9.anInt1961 = 0;
		Class37_Sub4_Sub4.anInt2566 = 0;
		Class36.anInt802 = 0;
		RuntimeException_Sub1.anInt1629 = 0;
		Class37_Sub4_Sub12.anInt2753 = 0;
		Class37_Sub9_Sub19.anInt3251 = 0;
		ByteVector.anInt2064 = 0;
		Queue.anInt1443 = 0;
		Class37_Sub9_Sub23.anInt3352 = 0;
		Class37_Sub9_Sub6.anInt3007 = 0;
		Applet_Sub1.anInt31 = 0;
		Class19.anInt478 = 0;
		ByteVector.anInt2024 = 0;
		Class37_Sub1.anInt1805 = 0;
		Class37_Sub9_Sub10.anInt3084 = 0;
		Class37_Sub9_Sub19.anInt3266 = 0;
		Node.anInt822 = 0;
		ByteVector.anInt2007 = 0;
		Class15.anInt261 = 0;
		InterfaceClickMask.anInt1992 = 0;
		Applet_Sub1.anInt22 = 0;
		Hashtable.anInt227 = 0;
		Class37_Sub9_Sub13.anInt3132 = 0;
		Class37_Sub4_Sub2.anInt2532 = 0;
		Class37_Sub9_Sub18.anInt3241 = 0;
		Class37_Sub9_Sub30.anInt3478 = 0;
		Class47.anInt990 = 0;
		Class29.anInt694 = 0;
		Class82.anInt1711 = 0;
		Class37_Sub9.anInt1960 = 0;
		Class37_Sub4_Sub5.anInt2592 = 0;
		RSString.anInt1685 = 0;
		Class37_Sub3_Sub1.anInt2315 = 0;
		KeyboardHandler.anInt565 = 0;
		Class37_Sub3_Sub3.anInt2347 = 0;
		Class14.anInt246 = 0;
		Class37_Sub9_Sub11.anInt3105 = 0;
		Class22.anInt570 = 0;
		Class37_Sub20.anInt2208 = 0;
		Class82.anInt1716 = 0;
		Class66.anInt1253 = 0;
		Class4.anInt99 = 0;
		Class37_Sub3_Sub3.anInt2392 = 0;
		Class37_Sub9_Sub7.anInt3038 = 0;
		Class37_Sub9_Sub30.anInt3469 = 0;
		Class4.anInt95 = 0;
		Class15_Sub1.anInt1739 = 0;
		Class37_Sub9_Sub29.anInt3456 = 0;
		Class37_Sub4_Sub12.anInt2779 = 0;
		Class37_Sub7.anInt1900 = 0;
		Class37_Sub4_Sub18.anInt2892 = 0;
		Class37_Sub4_Sub2.anInt2530 = 0;
		Class37_Sub3_Sub1.anInt2325 = 0;
		Class37_Sub9_Sub6.anInt3008 = 0;
		Class15.anInt257 = 0;
		Class37_Sub9_Sub3.anInt2951 = 0;
		Class38.anInt845 = 0;
		Class15.anInt293 = 0;
		Class37_Sub9_Sub8.anInt3062 = 0;
		RSString.anInt1674 = 0;
		Class37_Sub9.anInt1963 = 0;
		Class37_Sub9_Sub34.anInt3550 = 0;
		Class37_Sub4_Sub11.anInt2729 = 0;
		Class37_Sub9_Sub8.anInt3067 = 0;
		Class20.anInt532 = 0;
		Class37_Sub2.anInt1820 = 0;
		Class37_Sub4_Sub4.anInt2569 = 0;
		Class37_Sub4_Sub7_Sub3.anInt3742 = 0;
		Applet_Sub1.anInt41 = 0;
		Class37_Sub4_Sub12.anInt2781 = 0;
		RuntimeException_Sub1.anInt1623 = 0;
		Applet_Sub1.anInt15 = 0;
		Class37_Sub4_Sub4.anInt2577 = 0;
		Class42.anInt935 = 0;
		Class35.anInt792 = 0;
		Class37_Sub9_Sub20.anInt3275 = 0;
		Class15.anInt272 = 0;
		Class37_Sub1.anInt1800 = 0;
		Class37_Sub9_Sub13.anInt3136 = 0;
		Class19.anInt476 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3976 = 0;
		Class82.anInt1709 = 0;
		Class37_Sub23.anInt2223 = 0;
		Class29.anInt704 = 0;
		Class37_Sub4_Sub8.anInt2648 = 0;
		Class37_Sub9_Sub37.anInt3603 = 0;
		Class62.anInt1171 = 0;
		Class30.anInt725 = 0;
		MouseHandler.anInt186 = 0;
		Class37_Sub3_Sub1.anInt2322 = 0;
		Applet_Sub1.anInt9 = 0;
		Class37_Sub5.anInt1865 = 0;
		Class73.anInt1394 = 0;
		Class37_Sub4_Sub14.anInt2803 = 0;
		Class20.anInt544 = 0;
		Class37_Sub4_Sub15.anInt2838 = 0;
		RSItem.anInt2474 = 0;
		Class24.anInt602 = 0;
		Class37_Sub4_Sub14.anInt2807 = 0;
		Class37_Sub4_Sub11.anInt2710 = 0;
		Class37_Sub7.anInt1919 = 0;
		Class33.anInt758 = 0;
		Class37_Sub9_Sub4.anInt2963 = 0;
		RSString.anInt1655 = 0;
		Node.anInt819 = 0;
		Class37_Sub9_Sub19.anInt3264 = 0;
		Class1.anInt64 = 0;
		Class37_Sub9_Sub27.anInt3403 = 0;
		Class37_Sub13.anInt2107 = 0;
		Class37_Sub4_Sub3.anInt2559 = 0;
		Class49.anInt1009 = 0;
		ByteVector.anInt2066 = 0;
		ByteVector.anInt2022 = 0;
		Class46.anInt983 = 0;
		Class37_Sub9_Sub17.anInt3214 = 0;
		Class37_Sub4_Sub11.anInt2742 = 0;
		Class37_Sub9_Sub34.anInt3531 = 0;
		RSInterface.anInt412 = 0;
		Class37_Sub4_Sub15.anInt2850 = 0;
		Class2.anInt76 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3972 = 0;
		Class82.anInt1705 = 0;
		Class37_Sub9_Sub5.anInt2985 = 0;
		Applet_Sub1.anInt11 = 0;
		Class37_Sub11_Sub1.anInt3622 = 0;
		ByteVector.anInt2063 = 0;
		Class37_Sub9_Sub22.anInt3338 = 0;
		Class37_Sub9_Sub13.anInt3133 = 0;
		InterfaceClickMask.anInt1987 = 0;
		Class42.anInt948 = 0;
		Deque.anInt1103 = 0;
		Class42.anInt933 = 0;
		Class37_Sub9_Sub18.anInt3232 = 0;
		Class49.anInt1004 = 0;
		RSString.anInt1677 = 0;
		Class35.anInt793 = 0;
		Class37_Sub9_Sub20.anInt3293 = 0;
		Class87.anInt1586 = 0;
		Class37_Sub9_Sub18.anInt3229 = 0;
		Class29.anInt716 = 0;
		Class37_Sub9_Sub15.anInt3163 = 0;
		Class37_Sub9_Sub19.anInt3249 = 0;
		Class37_Sub9_Sub34.anInt3529 = 0;
		Applet_Sub1.anInt5 = 0;
		Class37_Sub9_Sub27.anInt3405 = 0;
		RSString.anInt1684 = 0;
		Class25.anInt635 = 0;
		Class37_Sub11_Sub1.anInt3619 = 0;
		Class37_Sub4_Sub7_Sub3.anInt3743 = 0;
		Class37_Sub4_Sub7_Sub7.anInt3852 = 0;
		Class37_Sub11_Sub1.anInt3624 = 0;
		Class37_Sub9_Sub22.anInt3339 = 0;
		Deque.anInt1119 = 0;
		ByteVector.anInt2046 = 0;
		Class85.anInt1543 = 0;
		Class37_Sub4_Sub16.anInt2868 = 0;
		Class37_Sub25.anInt2288 = 0;
		Class37_Sub23.anInt2229 = 0;
		RuntimeException_Sub1.anInt1628 = 0;
		Class37_Sub9_Sub21.anInt3311 = 0;
		Class33.anInt755 = 0;
		Class20.anInt550 = 0;
		RSItem.anInt2423 = 0;
		Class49.anInt1010 = 0;
		Class37_Sub9_Sub2.anInt2929 = 0;
		Class37_Sub9_Sub22.anInt3328 = 0;
		ByteVector.anInt2070 = 0;
		Class43.anInt955 = 0;
		Class15_Sub1.anInt1736 = 0;
		Class37_Sub2.anInt1814 = 0;
		Class14.anInt243 = 0;
		Class37_Sub4_Sub7_Sub3.anInt3744 = 0;
		Cache.anInt1233 = 0;
		NodeSub.anInt1845 = 0;
		Class37_Sub9_Sub17.anInt3213 = 0;
		Class43.anInt954 = 0;
		Class37_Sub9_Sub9.anInt3078 = 0;
		Class32_Sub1.anInt1784 = 0;
		Class82.anInt1694 = 0;
		Class32_Sub1.anInt1788 = 0;
		Class20.anInt552 = 0;
		Queue.anInt1453 = 0;
		Class37_Sub11_Sub1.anInt3615 = 0;
		Class76.anInt1422 = 0;
		Class37_Sub9_Sub10.anInt3083 = 0;
		Class37_Sub9_Sub7.anInt3039 = 0;
		RSString.anInt1661 = 0;
		Class20.anInt534 = 0;
		Class10.anInt192 = 0;
		Class73.anInt1382 = 0;
		ByteVector.anInt2008 = 0;
		Class15.anInt286 = 0;
		Class20.anInt538 = 0;
		Class37_Sub4_Sub3.anInt2547 = 0;
		Class26.anInt650 = 0;
		Class37_Sub15.anInt2143 = 0;
		ByteVector.anInt2016 = 0;
		Class37_Sub4_Sub15.anInt2845 = 0;
		Class37_Sub4_Sub10.anInt2687 = 0;
		RuntimeException_Sub1.anInt1622 = 0;
		InventoryDef.anInt2881 = 0;
		Class37_Sub20.anInt2211 = 0;
		Class47.anInt992 = 0;
		Class37_Sub9_Sub24.anInt3362 = 0;
		Class37_Sub9_Sub24.anInt3375 = 0;
		Class37_Sub9_Sub7.anInt3044 = 0;
		Class37_Sub9_Sub25.anInt3378 = 0;
		Class37_Sub3_Sub3.anInt2346 = 0;
		ByteVector.anInt2011 = 0;
		Class62.anInt1172 = 0;
		Deque.anInt1124 = 0;
		Node.anInt817 = 0;
		Class66.anInt1244 = 0;
		Applet_Sub1.anInt10 = 0;
		Class8.anInt164 = 0;
		Class37_Sub4_Sub11.anInt2721 = 0;
		Class37_Sub9_Sub9.anInt3075 = 0;
		Class78.anInt1460 = 0;
		Class37_Sub9_Sub30.anInt3473 = 0;
		RSItem.anInt2425 = 0;
		Class76.anInt1426 = 0;
		Class24.anInt612 = 0;
		Class37_Sub7.anInt1916 = 0;
		Class37_Sub4_Sub12.anInt2763 = 0;
		Class37_Sub4_Sub3.anInt2543 = 0;
		Class71.anInt1367 = 0;
		Class37_Sub9_Sub22.anInt3341 = 0;
		Class37_Sub9_Sub29.anInt3448 = 0;
		Class37_Sub3_Sub3.anInt2342 = 0;
		Class37_Sub3_Sub1.anInt2312 = 0;
		InterfaceListener.anInt1942 = 0;
		Class20.anInt540 = 0;
		Class37_Sub4_Sub3.anInt2548 = 0;
		Class37_Sub9_Sub20.anInt3284 = 0;
		Class55.anInt1065 = 0;
		Class37_Sub9_Sub33.anInt3514 = 0;
		Class37_Sub9_Sub11.anInt3109 = 0;
		Class37_Sub18.anInt2195 = 0;
		Class20.anInt531 = 0;
		ByteVector.anInt2012 = 0;
		client.anInt1732 = 0;
		Class37_Sub9_Sub24.anInt3373 = 0;
		Class6.anInt136 = 0;
		Class32_Sub1.anInt1778 = 0;
		Class37_Sub4_Sub10.anInt2685 = 0;
		Class37_Sub9_Sub11.anInt3102 = 0;
		Class37_Sub9.anInt1978 = 0;
		Class37_Sub9_Sub9.anInt3070 = 0;
		Class37_Sub9_Sub33.anInt3511 = 0;
		Class37_Sub9.anInt1972 = 0;
		Class37_Sub9_Sub30.anInt3467 = 0;
		Class37_Sub9_Sub15.anInt3173 = 0;
		Class19.anInt469 = 0;
		Class37_Sub9.anInt1952 = 0;
		Class37_Sub3_Sub3.anInt2399 = 0;
		Class37_Sub9_Sub14.anInt3153 = 0;
		Class37_Sub11_Sub1.anInt3621 = 0;
		Class37_Sub4_Sub4.anInt2587 = 0;
		Class37_Sub4_Sub7.anInt2629 = 0;
		Class10.anInt195 = 0;
		Class37_Sub9_Sub18.anInt3246 = 0;
		Class24.anInt611 = 0;
		Class37_Sub9_Sub26.anInt3395 = 0;
		Class37_Sub9_Sub9.anInt3073 = 0;
		Class37_Sub9_Sub13.anInt3128 = 0;
		Class82.anInt1703 = 0;
		Class37_Sub1.anInt1801 = 0;
		ByteVector.anInt2033 = 0;
		Class37_Sub9_Sub9.anInt3071 = 0;
		Queue.anInt1448 = 0;
		Class37_Sub9_Sub18.anInt3242 = 0;
		Queue.anInt1446 = 0;
		Class37_Sub4_Sub3.anInt2553 = 0;
		Class17.anInt303 = 0;
		Class37_Sub9_Sub6.anInt3021 = 0;
		Class24.anInt620 = 0;
		Class37_Sub18.anInt2199 = 0;
		Class68.anInt1325 = 0;
		Class37_Sub9_Sub32.anInt3497 = 0;
		Applet_Sub1.anInt40 = 0;
		Class15.anInt266 = 0;
		Class37_Sub9_Sub36.anInt3578 = 0;
		Class36.anInt805 = 0;
		Class50.anInt1019 = 0;
		Canvas_Sub1.anInt48 = 0;
		Class37_Sub4_Sub8.anInt2644 = 0;
		MouseHandler.anInt182 = 0;
		Class86.anInt1582 = 0;
		Class37_Sub9_Sub7.anInt3035 = 0;
		ByteVector.anInt2035 = 0;
		Class17.anInt306 = 0;
		Class19.anInt473 = 0;
		Class37_Sub9_Sub10.anInt3085 = 0;
		Class37_Sub4_Sub15.anInt2812 = 0;
		Class37_Sub9_Sub32.anInt3499 = 0;
		Class32_Sub1.anInt1774 = 0;
		Class29.anInt708 = 0;
		Class66.anInt1264 = 0;
		Class37_Sub4_Sub7_Sub1_Sub2.anInt3970 = 0;
		Class45.anInt973 = 0;
		Class24.anInt600 = 0;
		client.anInt1730 = 0;
		Class37_Sub9_Sub33.anInt3516 = 0;
		Class37_Sub4_Sub15.anInt2841 = 0;
		Class85.anInt1571 = 0;
		Class37_Sub4_Sub7_Sub1_Sub1.anInt3949 = 0;
		Class37_Sub3_Sub3.anInt2398 = 0;
		Class46.anInt986 = 0;
		Class37_Sub4_Sub7.anInt2631 = 0;
		client.anInt1718 = 0;
		Class37_Sub4_Sub4.anInt2574 = 0;
		Class41.anInt901 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3695 = 0;
		Class37_Sub4_Sub7_Sub1_Sub1.anInt3941 = 0;
		Class82.anInt1700 = 0;
		Class37_Sub15.anInt2140 = 0;
		MouseHandler.anInt181 = 0;
		ByteVector.anInt2067 = 0;
		anInt1059 = 0;
		ByteVector.anInt2030 = 0;
		Class52_Sub1.anInt2294 = 0;
		Class15.anInt262 = 0;
		Class15.anInt269 = 0;
		Class37_Sub9_Sub34.anInt3553 = 0;
		Class37_Sub4_Sub11.anInt2720 = 0;
		Class37_Sub9_Sub21.anInt3303 = 0;
		Class43.anInt951 = 0;
		ByteVector.anInt2061 = 0;
		RSInterface.anInt388 = 0;
		Class37_Sub9_Sub2.anInt2934 = 0;
		ByteVector.anInt2015 = 0;
		Class37_Sub9_Sub1.anInt2915 = 0;
		MouseHandler.anInt183 = 0;
		Class37_Sub9_Sub26.anInt3388 = 0;
		Class37_Sub9_Sub3.anInt2952 = 0;
		Class37_Sub9_Sub5.anInt2987 = 0;
		Class37_Sub9_Sub34.anInt3535 = 0;
		Class37_Sub4_Sub3.anInt2542 = 0;
		Class37_Sub9_Sub24.anInt3368 = 0;
		Class37_Sub25.anInt2287 = 0;
		ByteVector.anInt2073 = 0;
		Applet_Sub1.anInt19 = 0;
		ByteVector.anInt2017 = 0;
		Class37_Sub11_Sub1.anInt3623 = 0;
		client.anInt1731 = 0;
		Class8.anInt163 = 0;
		Class37_Sub9_Sub30.anInt3463 = 0;
		RSString.anInt1663 = 0;
		Class37_Sub15.anInt2133 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3671 = 0;
		Class66.anInt1246 = 0;
		RSString.anInt1648 = 0;
		Class29.anInt712 = 0;
		Class4.anInt100 = 0;
		Class37_Sub4_Sub10.anInt2679 = 0;
		Class32_Sub1.anInt1791 = 0;
		Cache.anInt1230 = 0;
		RSInterface.anInt459 = 0;
		RSString.anInt1643 = 0;
		Class29.anInt701 = 0;
		Class36.anInt795 = 0;
		Class37_Sub9_Sub37.anInt3605 = 0;
		Class37_Sub9_Sub24.anInt3372 = 0;
		Class37_Sub3_Sub3.anInt2336 = 0;
		Class79.anInt1490 = 0;
		Deque.anInt1108 = 0;
		Deque.anInt1113 = 0;
		Class15_Sub1.anInt1749 = 0;
		Class43.anInt960 = 0;
		Class37_Sub9_Sub21.anInt3310 = 0;
		Class37_Sub3_Sub3.anInt2374 = 0;
		Class37_Sub9_Sub13.anInt3137 = 0;
		Class57.anInt1100 = 0;
		ByteVector.anInt2028 = 0;
		Class37_Sub15.anInt2137 = 0;
		Class37_Sub4_Sub15.anInt2848 = 0;
		Class17.anInt299 = 0;
		Deque.anInt1121 = 0;
		Class37_Sub4_Sub7_Sub1.anInt3685 = 0;
		Class15_Sub1.anInt1752 = 0;
		Class10.anInt200 = 0;
		Class37_Sub4_Sub12.anInt2778 = 0;
		Class37_Sub4_Sub2.anInt2538 = 0;
		Applet_Sub1.anInt37 = 0;
		Class37_Sub9_Sub7.anInt3028 = 0;
		Class20.anInt530 = 0;
		Node.anInt810 = 0;
		Class37_Sub9_Sub6.anInt3011 = 0;
		Class37_Sub9_Sub25.anInt3379 = 0;
		Class37_Sub9_Sub10.anInt3089 = 0;
		ByteVector.anInt2071 = 0;
		Class17.anInt304 = 0;
		RSItem.anInt2434 = 0;
		Class37_Sub4_Sub5.anInt2591 = 0;
		Class46.anInt981 = 0;
		Class37_Sub9_Sub16.anInt3183 = 0;
		Class37_Sub23.anInt2230 = 0;
		Class60.anInt1157 = 0;
		Class37_Sub4_Sub7.anInt2632 = 0;
		Class4.anInt101 = 0;
		Class37_Sub3_Sub3.anInt2341 = 0;
		Applet_Sub1.anInt16 = 0;
		Class37_Sub9_Sub12.anInt3118 = 0;
		Class37_Sub9_Sub35.anInt3565 = 0;
		Class69.anInt1344 = 0;
		Class37_Sub4_Sub11.anInt2748 = 0;
		Class37_Sub9_Sub27.anInt3418 = -1;
		Class37_Sub4_Sub11.anInt2734 = 0;
		Class37_Sub9_Sub16.anInt3201 = 0;
		Class45.anInt977 = -1;
		Class37_Sub9_Sub21.anInt3321 = 0;
		Class42.aClass37_Sub11_Sub1_936.pos = 0;
		Class83.byteVector.pos = 0;
		Deque.method1156(8, 0);
		for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > -101; i_90_++)
			ByteVector.aClass16Array2041[i_90_] = null;
		Class19.anInt487 = 0;
		Class37_Sub9_Sub36.anInt3584 = 0;
		Class37_Sub3_Sub1.anInt2329 = 0;
		Class37_Sub14.anInt2122 = 0;
		Class79.anInt1474 = 0;
		Class37_Sub9_Sub9.anInt3077 = (int) (Math.random() * 100.0) + -50;
		Class37_Sub4_Sub5.aBoolean2595 = false;
		Class37_Sub9_Sub23.anInt3358 = (int) (Math.random() * 110.0) + -55;
		Class37_Sub14.anInt2127 = 0x7ff & (int) (20.0 * Math.random()) + -10;
		Class8.anInt168 = 0;
		Class37_Sub9_Sub37.anInt3590 = (int) (120.0 * Math.random()) - 60;
		Class78.anInt1458 = (int) (Math.random() * 30.0) - 20;
		Class76.anInt1436 = 0;
		Class37_Sub9_Sub35.anInt3564 = -1;
		Class83.anInt1518 = (int) (Math.random() * 80.0) + -40;
		Class82.anInt1687 = 0;
		for (int i_91_ = 0; (i_91_ ^ 0xffffffff) > -2049; i_91_++) {
			Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_91_] = null;
			Class37_Sub9_Sub15.aClass37_Sub11Array3175[i_91_] = null;
		}
		for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > -32769; i_92_++)
			Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_92_] = null;
		Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[2047] = new Class37_Sub4_Sub7_Sub1_Sub2();
		Class37_Sub9_Sub5.aClass58_2994.clear();
		Class19.aClass58_481.clear();
		for (int i_93_ = 0; i_93_ < 4; i_93_++) {
			for (int i_94_ = 0; (i_94_ ^ 0xffffffff) > -105; i_94_++) {
				for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > -105; i_95_++)
					Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[i_93_][i_94_][i_95_] = null;
			}
		}
		Class37_Sub9_Sub28.aClass58_3427 = new Deque();
		Class37_Sub4_Sub12.anInt2783 = 0;
		MouseHandler.anInt173 = 0;
		for (int i_96_ = 0; i_96_ < Class1.anInt65; i_96_++) {
			Class37_Sub4_Sub14 class37_sub4_sub14 = Class37_Sub4_Sub18
					.method730(-9094, i_96_);
			if (class37_sub4_sub14 != null && class37_sub4_sub14.anInt2808 == 0) {
				Class80.anIntArray1503[i_96_] = 0;
				Class37_Sub23.varpData[i_96_] = 0;
			}
		}
		for (int i_97_ = 0; ((i_97_ ^ 0xffffffff) > (InterfaceListener.anIntArray1939.length ^ 0xffffffff)); i_97_++)
			InterfaceListener.anIntArray1939[i_97_] = -1;
		if ((Main.gamepanel ^ 0xffffffff) != 0)
			Class37_Sub9_Sub24.uncacheInterface(Main.gamepanel);
		for (OverridedInterface class37_sub6 = (OverridedInterface) Class76.overridedInterfaces
				.getFirst(); class37_sub6 != null; class37_sub6 = (OverridedInterface) Class76.overridedInterfaces
				.getNext())
			Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, true);
		Main.gamepanel = -1;
		Class76.overridedInterfaces = new Hashtable(8);
		Class37_Sub9_Sub13.anInt3134 = 0;
		Class79.aClass18_1489 = null;
		Class37_Sub20.menu_open = false;
		Class57.aClass29_1098
				.method270(null, false, (byte) -96, new int[5], -1);
		for (int i_98_ = 0; (i_98_ ^ 0xffffffff) > -9; i_98_++) {
			Class75.aClass16Array1413[i_98_] = null;
			aBooleanArray1058[i_98_] = false;
		}
		Class87.method1328(true);
		Class10.aBoolean197 = true;
		for (int i_99_ = 0; (i_99_ ^ 0xffffffff) > -101; i_99_++)
			Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_99_] = true;
		Class14.aClass37_Sub18Array240 = null;
		Class35.anInt783 = 0;
		Class14.aClass16_252 = null;
		for (int i_100_ = 0; i_100_ < 6; i_100_++)
			Class37_Sub4_Sub8.aClass62Array2643[i_100_] = new Class62();
	}
}
