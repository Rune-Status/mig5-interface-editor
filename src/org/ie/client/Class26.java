package org.ie.client;

/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class26 {
	public int anInt648;
	public static RSString aClass16_649 = Class37_Sub2.create_rsstring("<col=ffb000>");
	public static int anInt650;
	public static RSString aClass16_651 = Class37_Sub2.create_rsstring("Sichtbare Karte vorbereitet)3");
	public static BigInteger aBigInteger652 = (new BigInteger(
			"7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
	public static int anInt653;
	public static int anInt654;
	public int anInt655;
	public int anInt656;
	public static int[] anIntArray657;
	public static RSString aClass16_658 = (Class37_Sub2.create_rsstring("Press (Wchange your password(W on front page)3"));
	public static long aLong659;
	public static RSString aClass16_660;
	public static RSString aClass16_661;
	public static RSString aClass16_662;
	public static RSString aClass16_663;
	public static int[] anIntArray664;
	public static RSString aClass16_665;
	public static RSString aClass16_666;

	public static void method256(int i) {
		aClass16_663 = null;
		anIntArray657 = null;
		aClass16_658 = null;
		aClass16_651 = null;
		aClass16_649 = null;
		if (i != 28345)
			aLong659 = 99L;
		aBigInteger652 = null;
		aClass16_666 = null;
		aClass16_665 = null;
		anIntArray664 = null;
		aClass16_662 = null;
		aClass16_661 = null;
		aClass16_660 = null;
	}

	public static byte[] method257(boolean bool, Object object, int i) {
		anInt650++;
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Class39.method1059(is, (byte) 7);
			return is;
		}
		if (object instanceof Class68) {
			Class68 class68 = (Class68) object;
			return class68.method1247(-1);
		}
		if (i != -9)
			method259(-91, -92, -45);
		throw new IllegalArgumentException();
	}

	protected static void method258(int i, int i_0_, int offsetX, int offsetY, int i_3_,
			int parent, int i_6_, RSInterface[] childs) {
		for (int childId = 0; (childs.length ^ 0xffffffff) < (childId ^ 0xffffffff); childId++) {
			RSInterface child = childs[childId];
			if (child != null && (!child.newFormat || child.type == 0 || child.objectData
							|| RuntimeException_Sub1.get_click_mask(child) != 0 || child == Queue.aClass18_1452)
					&& child.parentId == parent
					&& (!child.newFormat || !Class66.isVisible(child))) {
				int x = offsetX + child.x;
				int y = child.y + offsetY;
				if (Class37_Sub7.presse_child == child) {
					RuntimeException_Sub1.anInt1626 = y;
					Class37_Sub5.anInt1875 = x;
					Class24.aBoolean609 = true;
				}
				int i_11_;
				int i_12_;
				int i_13_;
				int i_14_;
				if ((child.type ^ 0xffffffff) != -3) {
					if ((child.type ^ 0xffffffff) == -10) {
						int i_15_ = y;
						int i_16_ = x;
						int i_17_ = x - -child.width;
						int i_18_ = child.height + y;
						if ((i_16_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
							int i_19_ = i_16_;
							i_16_ = i_17_;
							i_17_ = i_19_;
						}
						i_17_++;
						if (i_15_ > i_18_) {
							int i_20_ = i_15_;
							i_15_ = i_18_;
							i_18_ = i_20_;
						}
						i_13_ = i > i_17_ ? i_17_ : i;
						i_12_ = ((i_15_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff) ? i_0_
								: i_15_);
						i_14_ = i_16_ > i_3_ ? i_16_ : i_3_;
						i_11_ = ((++i_18_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff) ? i_18_
								: i_6_);
					} else {
						i_12_ = ((y ^ 0xffffffff) < (i_0_ ^ 0xffffffff) ? y : i_0_);
						i_14_ = ((x ^ 0xffffffff) < (i_3_ ^ 0xffffffff) ? x : i_3_);
						int i_21_ = child.width + x;
						int i_22_ = child.height + y;
						i_11_ = i_22_ >= i_6_ ? i_6_ : i_22_;
						i_13_ = i <= i_21_ ? i : i_21_;
					}
				} else {
					i_11_ = i_6_;
					i_12_ = i_0_;
					i_13_ = i;
					i_14_ = i_3_;
				}
				if (!child.newFormat
						|| ((i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff) && i_11_ > i_12_)) {
					if ((child.clientCode ^ 0xffffffff) == -1338)
						Class73.refreshInterface(child);
					else if ((child.clientCode ^ 0xffffffff) == -1339)
						Class83.method1311(x, 75, y);
					else {
						if ((child.type ^ 0xffffffff) == -1) {
							if (!child.newFormat
									&& Class66.isVisible(child)
									&& Class42.aClass18_942 != child)
								continue;
							method258(i_13_, i_12_, x - child.horizontalScrollPosition,
									y - child.verticalScrollPosition, i_14_,
									child.bitPacked, i_11_, childs);
							if (child.aClass18Array450 != null)
								method258(i_13_, i_12_, -child.horizontalScrollPosition
										+ x, -child.verticalScrollPosition + y,
										i_14_, child.bitPacked, i_11_,
										child.aClass18Array450);
							OverridedInterface class37_sub6 = ((OverridedInterface) (Class76.overridedInterfaces.get((long) child.bitPacked)));
							if (class37_sub6 != null)
								Class1.method39(i_12_, class37_sub6.interfaceId,
										x, y, i_13_, i_14_, -91, i_11_);
						}
						if (child.newFormat) {
							boolean inDrawingBounds;
							if (((i_14_ ^ 0xffffffff) >= (Class37_Sub4_Sub7_Sub7.lastMouseX ^ 0xffffffff))
									&& Class37_Sub9_Sub1.lastMouseY >= i_12_
									&& i_13_ > Class37_Sub4_Sub7_Sub7.lastMouseX
									&& i_11_ > Class37_Sub9_Sub1.lastMouseY)
								inDrawingBounds = true;
							else
								inDrawingBounds = false;
							boolean buttonClicked = false;
							boolean buttonPressed = false;
							if (Class60.lastMousePress == 1 && inDrawingBounds)
								buttonPressed = true;
							if (Class37_Sub9_Sub28.lastMouseClick == 1
									&& Class33.lastClickX >= i_14_
									&& i_12_ <= Class37_Sub13.lastClickY
									&& i_13_ > Class33.lastClickX
									&& i_11_ > Class37_Sub13.lastClickY)
								buttonClicked = true;
							if (buttonClicked)
								Class37_Sub25.press_child(
										child, (-x + Class33.lastClickX),
										(Class37_Sub13.lastClickY)- y);
							if (Class37_Sub7.presse_child != null
									&& Class37_Sub7.presse_child != child
									&& inDrawingBounds
									&& (Class36.method321(RuntimeException_Sub1.get_click_mask(
											child))))
								Class37_Sub4_Sub12.aClass18_2773 = child;
							if (Queue.aClass18_1452 == child) {
								Class37_Sub4_Sub7_Sub1_Sub2.anInt3977 = x;
								Class32.aBoolean746 = true;
								Class59.anInt1134 = y;
							}
							if (child.objectData) {
								if (inDrawingBounds && Class37_Sub4_Sub7_Sub1_Sub1.scrollModifier != 0 && child.mouseWheelListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.intData1 = Class37_Sub4_Sub7_Sub1_Sub1.scrollModifier;
									class37_sub8.objectData = child.mouseWheelListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (Class37_Sub7.presse_child != null || Class37_Sub25.aClass18_2285 != null || Class37_Sub20.menu_open) {
									inDrawingBounds = false;
									buttonPressed = false;
									buttonClicked = false;
								}
								if (!child.mouseClicked && buttonClicked) {
									child.mouseClicked = true;
									if (child.mouseClickFocusListener != null) {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.objectData = child.mouseClickFocusListener;
										class37_sub8.intData2 = Class33.lastClickX - x;
										class37_sub8.aClass18_1925 = child;
										class37_sub8.intData1 = Class37_Sub13.lastClickY- y;
										Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
									}
								}
								if (child.mouseClicked && buttonPressed && child.mouseClickListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.mouseClickListener;
									class37_sub8.intData1 = Class37_Sub9_Sub1.lastMouseY - y;
									class37_sub8.aClass18_1925 = child;
									class37_sub8.intData2 = (Class37_Sub4_Sub7_Sub7.lastMouseX - x);
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (child.mouseClicked && !buttonPressed) {
									child.mouseClicked = false;
									if (child.mouseClickUnfocusListener != null) {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.intData2 = (Class37_Sub4_Sub7_Sub7.lastMouseX - x);
										class37_sub8.intData1 = (Class37_Sub9_Sub1.lastMouseY - y);
										class37_sub8.aClass18_1925 = child;
										class37_sub8.objectData = child.mouseClickUnfocusListener;
										Class17.aClass58_300.addLast(
												class37_sub8);
									}
								}
								if (buttonPressed && child.mouseDraggedListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.intData2 = (Class37_Sub4_Sub7_Sub7.lastMouseX - x);
									class37_sub8.intData1 = (Class37_Sub9_Sub1.lastMouseY - y);
									class37_sub8.objectData = child.mouseDraggedListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (!child.mouseFocused && inDrawingBounds) {
									child.mouseFocused = true;
									if (child.mouseFocusListener != null) {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.aClass18_1925 = child;
										class37_sub8.objectData = child.mouseFocusListener;
										class37_sub8.intData1 = (Class37_Sub9_Sub1.lastMouseY - y);
										class37_sub8.intData2 = (Class37_Sub4_Sub7_Sub7.lastMouseX - x);
										Class37_Sub9_Sub20.aClass58_3296
												.addLast(class37_sub8);
									}
								}
								if (child.mouseFocused && inDrawingBounds && child.mouseFocusedListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.intData2 = (Class37_Sub4_Sub7_Sub7.lastMouseX - x);
									class37_sub8.aClass18_1925 = child;
									class37_sub8.intData1 = Class37_Sub9_Sub1.lastMouseY - y;
									class37_sub8.objectData = child.mouseFocusedListener;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (child.mouseFocused && !inDrawingBounds) {
									child.mouseFocused = false;
									if (child.mouseUnfocusListener != null) {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.aClass18_1925 = child;
										class37_sub8.intData2 = Class37_Sub4_Sub7_Sub7.lastMouseX - x;
										class37_sub8.objectData = child.mouseUnfocusListener;
										class37_sub8.intData1 = (Class37_Sub9_Sub1.lastMouseY - y);
										Class17.aClass58_300.addLast(class37_sub8);
									}
								}
								if (child.mainLoopListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.mainLoopListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub9.aClass58_3068.addLast(class37_sub8);
								}
								if (child.varpUpdateListener != null
										&& child.scriptedVarpLength < Class24.scriptedVarpLength) {//config script
									if (child.varpListenerValues == null
											|| ((-child.scriptedVarpLength + Class24.scriptedVarpLength) ^ 0xffffffff) < -33) {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.aClass18_1925 = child;
										class37_sub8.objectData = child.varpUpdateListener;
										Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
									} else {
										while_56_: for (int i_25_ = child.scriptedVarpLength; Class24.scriptedVarpLength > i_25_; i_25_++) {
											int i_26_ = (Class37_Sub9_Sub1.scriptedVarp[i_25_ & 0x1f]);
											for (int i_27_ = 0; ((child.varpListenerValues.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff)); i_27_++) {
												if (i_26_ == (child.varpListenerValues[i_27_])) {
													InterfaceListener class37_sub8 = new InterfaceListener();
													class37_sub8.objectData = (child.varpUpdateListener);
													class37_sub8.aClass18_1925 = child;
													Class37_Sub9_Sub20.aClass58_3296
															.addLast(
																	class37_sub8);
													break while_56_;
												}
											}
										}
									}
									child.scriptedVarpLength = Class24.scriptedVarpLength;
								}
								if (child.inventoryUpdateListener != null
										&& (Class37_Sub4_Sub8.scriptedInventoryLength > child.scriptedInventoryLength)) {//inventory script
									if (child.inventoryListenerValues != null
											&& ((-child.scriptedInventoryLength + Class37_Sub4_Sub8.scriptedInventoryLength) ^ 0xffffffff) >= -33) {
										while_57_: for (int i_28_ = child.scriptedInventoryLength; ((Class37_Sub4_Sub8.scriptedInventoryLength ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
											int i_29_ = (Class37_Sub9.scriptedInventory[0x1f & i_28_]);
											for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > ((child.inventoryListenerValues).length ^ 0xffffffff)); i_30_++) {
												if ((child.inventoryListenerValues[i_30_]) == i_29_) {
													InterfaceListener class37_sub8 = new InterfaceListener();
													class37_sub8.objectData = (child.inventoryUpdateListener);
													class37_sub8.aClass18_1925 = child;
													Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
													break while_57_;
												}
											}
										}
									} else {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.objectData = child.inventoryUpdateListener;
										class37_sub8.aClass18_1925 = child;
										Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
									}
									child.scriptedInventoryLength = Class37_Sub4_Sub8.scriptedInventoryLength;
								}
								if (child.skillUpdateListener != null
										&& ((Class37_Sub9_Sub3.scriptedSkillLength ^ 0xffffffff) < (child.scriptedSkillLength ^ 0xffffffff))) {//skill script
									if (child.skillListenerValues != null
											&& ((-child.scriptedSkillLength + Class37_Sub9_Sub3.scriptedSkillLength) <= 32)) {
										while_58_: for (int i_31_ = child.scriptedSkillLength; ((Class37_Sub9_Sub3.scriptedSkillLength ^ 0xffffffff) < (i_31_ ^ 0xffffffff)); i_31_++) {
											int i_32_ = (Class37_Sub9_Sub30.scriptedSkills[0x1f & i_31_]);
											for (int i_33_ = 0; (i_33_ < (child.skillListenerValues).length); i_33_++) {
												if (i_32_ == (child.skillListenerValues[i_33_])) {
													InterfaceListener class37_sub8 = new InterfaceListener();
													class37_sub8.aClass18_1925 = child;
													class37_sub8.objectData = (child.skillUpdateListener);
													Class37_Sub9_Sub20.aClass58_3296
															.addLast(
																	class37_sub8);
													break while_58_;
												}
											}
										}
									} else {
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.objectData = child.skillUpdateListener;
										class37_sub8.aClass18_1925 = child;
										Class37_Sub9_Sub20.aClass58_3296
												.addLast(class37_sub8);
									}
									child.scriptedSkillLength = Class37_Sub9_Sub3.scriptedSkillLength;
								}
								if (Queue.anInt1447 > child.anInt435 && child.messageReceivedListener != null) {//messages received script or some crap
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.messageReceivedListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if ((child.anInt435 < Class37_Sub9_Sub32.anInt3509) && child.privateChatUpdateListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.privateChatUpdateListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (Class42.anInt931 > child.anInt435 && child.clanUpdateListener != null) {
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.aClass18_1925 = child;
									class37_sub8.objectData = child.clanUpdateListener;
									Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
								}
								if (OverridedInterface.anInt1889 > child.anInt435 && child.grandExchangeItemListener != null) {//grand exchange item update script?
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.grandExchangeItemListener;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296
											.addLast(class37_sub8);
								}
								if ((Class37_Sub9_Sub37.anInt3602 > child.anInt435) && child.anObjectArray352 != null) {//only called on system update, weight change, energy change
									InterfaceListener class37_sub8 = new InterfaceListener();
									class37_sub8.objectData = child.anObjectArray352;
									class37_sub8.aClass18_1925 = child;
									Class37_Sub9_Sub20.aClass58_3296
											.addLast(class37_sub8);
								}
								child.anInt435 = Class83.anInt1515;
								if (child.keyPressedListener != null) {
									for (int i_34_ = 0; Class39.keyPressAmount > i_34_; i_34_++) {//looks like key script, not sure
										InterfaceListener class37_sub8 = new InterfaceListener();
										class37_sub8.aClass18_1925 = child;
										class37_sub8.keyCode = RSString.scriptKeyCodeCache[i_34_];
										class37_sub8.keyChar = Class37_Sub9_Sub10.scriptKeyCharCache[i_34_];
										class37_sub8.objectData = child.keyPressedListener;
										Class37_Sub9_Sub20.aClass58_3296.addLast(class37_sub8);
									}
								}
							}
						}
						if (!child.newFormat) {
							if (Class37_Sub7.presse_child != null
									|| Class37_Sub25.aClass18_2285 != null
									|| Class37_Sub20.menu_open)
								break;
							if ((child.mouseOverId >= 0 || (child.disabledMouseOverColor ^ 0xffffffff) != -1)
									&& i_14_ <= Class37_Sub4_Sub7_Sub7.lastMouseX
									&& i_12_ <= Class37_Sub9_Sub1.lastMouseY
									&& Class37_Sub4_Sub7_Sub7.lastMouseX < i_13_
									&& ((i_11_ ^ 0xffffffff) < (Class37_Sub9_Sub1.lastMouseY ^ 0xffffffff))) {
								if (child.mouseOverId >= 0)
									Class42.aClass18_942 = childs[child.mouseOverId];
								else
									Class42.aClass18_942 = child;
							}
							if ((child.type ^ 0xffffffff) == -9
									&& (Class37_Sub4_Sub7_Sub7.lastMouseX ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)
									&& Class37_Sub9_Sub1.lastMouseY >= i_12_
									&& Class37_Sub4_Sub7_Sub7.lastMouseX < i_13_
									&& ((Class37_Sub9_Sub1.lastMouseY ^ 0xffffffff) > (i_11_ ^ 0xffffffff)))
								Class19.aClass18_491 = child;
							if (child.maxScrollVertical > child.height)
								Class85.method1320(child, child.width + x, child.height, child.maxScrollVertical,
										Class37_Sub4_Sub7_Sub7.lastMouseX,
										y,
										Class37_Sub9_Sub1.lastMouseY);
						}
					}
				}
			}
		}
	}

	public static void method259(int i, int i_35_, int i_36_) {
		anInt653++;
		if (InterfaceClickMask.loadExists(i) && i_36_ < -123)
			Class37_Sub9_Sub37.method923(-7251,
					(Class37_Sub9_Sub29.mainInterfaceArray[i]), i_35_);
	}

	static {
		anIntArray657 = new int[2048];
		aClass16_660 = Class37_Sub2.create_rsstring("Unexpected server response)3");
		aClass16_663 = aClass16_660;
		aClass16_662 = Class37_Sub2.create_rsstring("mapmarker");
		aClass16_661 = Class37_Sub2.create_rsstring("Suche nach Updates )2 ");
		aLong659 = 0L;
		aClass16_665 = aClass16_658;
		anIntArray664 = new int[5];
		aClass16_666 = Class37_Sub2.create_rsstring("gleiten:");
	}
}
