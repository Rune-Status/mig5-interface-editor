package org.ie.client;

/* RSInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RSInterface {
	public Object[] mainLoopListener;
	public int rotateX;
	public int alpha;
	public int filled;
	public int click_mask;
	public int anInt323;
	public int maxScrollHorizontal = 0;
	public int mediaTypeEnabled;
	public int xOffset;
	public Object[] grandExchangeItemListener;
	public Object[] privateChatUpdateListener;
	public int x;
	public static RSString aClass16_330;
	public int[] inventoryListenerValues;
	public static RSString[] aClass16Array332 = new RSString[100];
	public Object[] anObjectArray333;
	public int anInt334;
	public int shadow;
	public boolean gridOriginal;
	public boolean extraBoolean;
	public int thickness = 1;
	public int font;
	public static int anInt339 = 0;
	public static int anInt340;
	public static int[] intScriptArguments;
	public int[] spriteId;
	public int lastDrawCycle;
	public int anInt344;
	public Object[] inventoryUpdateListener;
	public Object[] varpUpdateListener;
	public int maxScrollVertical;
	public Object[] keyPressedListener;
	public int anInt350;
	public static int anInt351;
	public Object[] anObjectArray352;
	public int height;
	public int type;
	public Object[] mouseUnfocusListener;
	public int[] inv;
	public Object[] clanUpdateListener;
	public Object[] spellUsedListener;
	public int rotateZ;
	public RSString selectedActionName;
	public static int anInt361;
	public Object[] messageReceivedListener;
	public Object[] anObjectArray363;
	public boolean aBoolean364;
	public static RSString aClass16_365 = Class37_Sub2.create_rsstring("Attack");
	public Object[] mouseFocusedListener;
	public int itemId;
	public int itemZoom;
	public int mediaIdDisabled;
	public int[] valueCompareType;
	public int horizontalScrollPosition;
	public boolean modifyDraggingAlpha;
	public static int anInt373;
	public boolean newFormat;
	public int[] skillListenerValues;
	public int clientCode;
	public RSString enabledText;
	public int anInt378;
	public int verticalAlignment;
	public int translateX;
	public int actionType;
	public int scriptedVarpLength;
	public RSString[] oiActions;
	public static int anInt384;
	public int disabledSprite;
	public Object[] spellUsedOnItemListener;
	public int zoom;
	public static int anInt388;
	public boolean flipVertical;
	public int disabledAnim;
	public RSString action_name;
	public static int anInt392;
	public Object[] mouseClickListener;
	public int parentId;
	public int offsetX;
	public int disabledMouseOverColor;
	public int yOffset;
	public int rotation;
	public int scriptedSkillLength;
	public int enabledSprite;
	public boolean flipHorizontal;
	public int bitPacked;
	public boolean shaded;
	public int enabledColor;
	public int rotateY;
	public int horizontalAlignment;
	public Object[] anObjectArray407;
	public int modelTypeDisabled;
	public Object[] anObjectArray409;
	public int offsetY;
	public RSString disabledText;
	public static int anInt412;
	public RSInterface aClass18_413;
	public int mouseOverId;
	public int y;
	public Object[] skillUpdateListener;
	public int enabledMouseOverColor;
	public Object[] mouseClickUnfocusListener;
	public int enabledAnim;
	public int verticalSpacing;
	public RSString tooltip;
	public int[] invStackSize;
	public int invSpritePadX;
	public int[] spriteY;
	public Object[] mouseDraggedListener;
	public int invSpritePadY;
	public boolean mouseClicked;
	public int scriptedInventoryLength;
	public Object[] mouseFocusListener;
	public Object[] mouseClickFocusListener;
	public int translateY;
	public int verticalScrollPosition;
	public Object[] onStartListener;
	public int[][] cs1opcodes;
	public int anInt435;
	public RSString spellName;
	public static int anInt437;
	public static int anInt438;
	public boolean mouseFocused;
	public static RSString aClass16_440;
	public int width;
	public int disabledColor;
	public int anInt443;
	public int[] varpListenerValues;
	public int[] newListener1Values;
	public int[] newListener2Values;
	public boolean hidden;
	public static RSString aClass16_447;
	public int[] spriteX;
	public int outline;
	public RSInterface[] aClass18Array450;
	public int[] requiredValues;
	public boolean objectData;
	public RSString[] niActions;
	public static RSString aClass16_454;
	public Object[] mouseWheelListener;
	public Object[] newListener1;
	public Object[] newListener2;
	public Object[] anObjectArray456;
	public int mediaIdEnabled;
	public int redrawId;
	public static int anInt459;

	public static void method189(int i) {
		aClass16_330 = null;
		intScriptArguments = null;
		aClass16_447 = null;
		aClass16Array332 = null;
		if (i > -88)
			method191(108, 38);
		aClass16_365 = null;
		aClass16_454 = null;
		aClass16_440 = null;
	}

	public Class37_Sub4_Sub7_Sub6 method190(int i, int i_0_,
			Class37_Sub4_Sub12 class37_sub4_sub12, boolean bool, Class29 class29) {
			Class27.aBoolean672 = false;
			int i_1_;
			int i_2_;
			if (!bool) {
				i_1_ = modelTypeDisabled;
				i_2_ = mediaIdDisabled;
			} else {
				i_1_ = mediaTypeEnabled;
				i_2_ = mediaIdEnabled;
			}
			if (i_1_ == 0)
				return null;
			if (i_1_ == 1 && i_2_ == -1)
				return null;
			if (i_1_ == 2) {
				Class37_Sub4_Sub15 class37_sub4_sub15 = Class37_Sub9_Sub34
						.method912(29, i_2_).method719((byte) 41);
				if (class37_sub4_sub15 != null)
					i_2_ = class37_sub4_sub15.anInt2842;
			}
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class17.aClass65_312
					.get((long) ((i_1_ << -1123863600) + i_2_)));
			if (class37_sub4_sub7_sub6 == null) {
				if (i_1_ == 1) {
					Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = (Class37_Sub4_Sub7_Sub4
							.method529(Class37_Sub4_Sub7_Sub7.aClass15_3837,
									i_2_, 0));
					if (class37_sub4_sub7_sub4 == null) {
						Class27.aBoolean672 = true;
						return null;
					}
					class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
							64, 768, -50, -10, -50, true, true);
				}
				if (i_1_ == 2) {
					Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = Class37_Sub9_Sub34
							.method912(-93, i_2_).method720(-1);
					if (class37_sub4_sub7_sub4 == null) {
						Class27.aBoolean672 = true;
						return null;
					}
					class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
							64, 768, -50, -10, -50, true, true);
				}
				if (i_1_ == 3) {
					if (class29 == null)
						return null;
					Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4 = class29
							.method262(false);
					if (class37_sub4_sub7_sub4 == null) {
						Class27.aBoolean672 = true;
						return null;
					}
					class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
							64, 768, -50, -10, -50, true, true);
				}
				if (i_1_ == 4) {
					RSItem class37_sub4_sub1 = Class46.loadItem(
							i_2_, (byte) 85);
					class37_sub4_sub7_sub6 = class37_sub4_sub1.method449(
							(byte) -113, 10);
					if (class37_sub4_sub7_sub6 == null) {
						Class27.aBoolean672 = true;
						return null;
					}
				}
				Class17.aClass65_312.put(
						class37_sub4_sub7_sub6, (long) (i_2_ + (i_1_ << 359839792)));
			}
			if (class37_sub4_sub12 != null)
				class37_sub4_sub7_sub6 = class37_sub4_sub12.method702(i_0_,
						class37_sub4_sub7_sub6, 44);
			return class37_sub4_sub7_sub6;
	}

	public static int method191(int i_3_, int i_4_) {
		anInt351++;
		if (i_3_ == -1)
			return 12345678;
		i_4_ = i_4_ * (i_3_ & 0x7f) / 128;
		if (i_4_ < 2)
			i_4_ = 2;
		else if ((i_4_ ^ 0xffffffff) < -127)
			i_4_ = 126;
		return (0xff80 & i_3_) - -i_4_;
	}

	public static void method192(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (Class37_Sub7 class37_sub7 = (Class37_Sub7) NodeSub.aClass58_1857
				.getFirst(); class37_sub7 != null; class37_sub7 = (Class37_Sub7) NodeSub.aClass58_1857
				.getNext()) {
			if ((class37_sub7.anInt1910 ^ 0xffffffff) != 0
					|| class37_sub7.anIntArray1895 != null) {
				int i_9_ = 0;
				if (class37_sub7.anInt1913 >= i) {
					if ((class37_sub7.anInt1892 ^ 0xffffffff) < (i ^ 0xffffffff))
						i_9_ += -i + class37_sub7.anInt1892;
				} else
					i_9_ += i + -class37_sub7.anInt1913;
				if (class37_sub7.anInt1907 >= i_8_) {
					if ((class37_sub7.anInt1914 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
						i_9_ += class37_sub7.anInt1914 - i_8_;
				} else
					i_9_ += i_8_ - class37_sub7.anInt1907;
				if ((class37_sub7.anInt1905 ^ 0xffffffff) > (i_9_ - 64 ^ 0xffffffff)
						|| (Class43.anInt957 ^ 0xffffffff) == -1
						|| class37_sub7.anInt1903 != i_5_) {
					if (class37_sub7.aClass37_Sub3_Sub4_1896 != null) {
						Class1.aClass37_Sub3_Sub2_59
								.method353(class37_sub7.aClass37_Sub3_Sub4_1896);
						class37_sub7.aClass37_Sub3_Sub4_1896 = null;
					}
					if (class37_sub7.aClass37_Sub3_Sub4_1917 != null) {
						Class1.aClass37_Sub3_Sub2_59
								.method353(class37_sub7.aClass37_Sub3_Sub4_1917);
						class37_sub7.aClass37_Sub3_Sub4_1917 = null;
					}
				} else {
					i_9_ -= 64;
					if (i_9_ < 0)
						i_9_ = 0;
					int i_10_ = (Class43.anInt957
							* (class37_sub7.anInt1905 + -i_9_) / class37_sub7.anInt1905);
					if (class37_sub7.aClass37_Sub3_Sub4_1896 != null)
						class37_sub7.aClass37_Sub3_Sub4_1896.method409(i_10_);
					else if (class37_sub7.anInt1910 >= 0) {
						Class11 class11 = Class11.method88(
								NodeSub.aClass15_Sub1_1862,
								class37_sub7.anInt1910, 0);
						if (class11 != null) {
							Class37_Sub22_Sub1 class37_sub22_sub1 = class11
									.method86().method1026(
											Class86.aClass30_1579);
							Class37_Sub3_Sub4 class37_sub3_sub4 = (Class37_Sub3_Sub4
									.method392(class37_sub22_sub1, 100, i_10_));
							class37_sub3_sub4.method429(-1);
							Class1.aClass37_Sub3_Sub2_59
									.method350(class37_sub3_sub4);
							class37_sub7.aClass37_Sub3_Sub4_1896 = class37_sub3_sub4;
						}
					}
					if (class37_sub7.aClass37_Sub3_Sub4_1917 == null) {
						if (class37_sub7.anIntArray1895 != null
								&& (class37_sub7.anInt1918 -= i_6_) <= 0) {
							int i_11_ = (int) ((double) (class37_sub7.anIntArray1895).length * Math
									.random());
							Class11 class11 = Class11.method88(
									(NodeSub.aClass15_Sub1_1862),
									(class37_sub7.anIntArray1895[i_11_]), 0);
							if (class11 != null) {
								Class37_Sub22_Sub1 class37_sub22_sub1 = class11
										.method86().method1026(
												Class86.aClass30_1579);
								Class37_Sub3_Sub4 class37_sub3_sub4 = (Class37_Sub3_Sub4
										.method392(class37_sub22_sub1, 100,
												i_10_));
								class37_sub3_sub4.method429(0);
								Class1.aClass37_Sub3_Sub2_59
										.method350(class37_sub3_sub4);
								class37_sub7.anInt1918 = (class37_sub7.anInt1908 + (int) (Math
										.random() * (double) (-(class37_sub7.anInt1908) + (class37_sub7.anInt1909))));
								class37_sub7.aClass37_Sub3_Sub4_1917 = class37_sub3_sub4;
							}
						}
					} else {
						class37_sub7.aClass37_Sub3_Sub4_1917.method409(i_10_);
						if (!class37_sub7.aClass37_Sub3_Sub4_1917
								.previousExists())
							class37_sub7.aClass37_Sub3_Sub4_1917 = null;
					}
				}
			}
		}
		if (i_7_ >= 15)
			anInt384++;
	}

	public void method193(int i, byte i_12_, int i_13_) {
		if (i_12_ >= 26) {
			int i_14_ = inv[i];
			inv[i] = inv[i_13_];
			anInt459++;
			inv[i_13_] = i_14_;
			i_14_ = invStackSize[i];
			invStackSize[i] = invStackSize[i_13_];
			invStackSize[i_13_] = i_14_;
		}
	}

	public Sprite get_sprite(boolean enabled) {
		Class27.aBoolean672 = false;
		int i_15_;
		if (enabled)
			i_15_ = enabledSprite;
		else
			i_15_ = disabledSprite;
		if ((i_15_ ^ 0xffffffff) == 0)
			return null;
		long l = (((long) shadow << 1937882088)
				+ ((long) outline << 118274660) + ((long) i_15_
				+ ((!flipVertical ? 0L : 1L) << -782842970) + ((flipHorizontal ? 1L
				: 0L) << 1805028711)));
		Sprite class37_sub4_sub9_sub3 = ((Sprite) Class37_Sub9_Sub33.aClass65_3512
				.get(l));
		if (class37_sub4_sub9_sub3 != null)
			return class37_sub4_sub9_sub3;
		class37_sub4_sub9_sub3 = Class6.method61(i_15_, 0, Class80.aClass15_1507);
		if (class37_sub4_sub9_sub3 == null) {
			Class27.aBoolean672 = true;
			return null;
		}
		if (flipVertical)
			class37_sub4_sub9_sub3.flip_vertical();
		if (flipHorizontal)
			class37_sub4_sub9_sub3.flip_horizontal();
		if (outline > 0)
			class37_sub4_sub9_sub3.method649(outline);
		if (outline >= 1)
			class37_sub4_sub9_sub3.method629(1);
		if ((outline ^ 0xffffffff) <= -3)
			class37_sub4_sub9_sub3.method629(16777215);
		if ((shadow ^ 0xffffffff) != -1)
			class37_sub4_sub9_sub3.method655(shadow);
		Class37_Sub9_Sub33.aClass65_3512.put(class37_sub4_sub9_sub3, l);
		return class37_sub4_sub9_sub3;
	}

	public void addAction(RSString action, int id) {
		if (niActions == null
				|| (id ^ 0xffffffff) <= (niActions.length ^ 0xffffffff)) {
			RSString[] class16s = new RSString[id - -1];
			if (niActions != null) {
				for (int i_17_ = 0; ((niActions.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++)
					class16s[i_17_] = niActions[i_17_];
			}
			niActions = class16s;
		}
		niActions[id] = action;
	}

	public void parseOld(byte i, ByteVector buffer) {
		anInt361++;
		newFormat = false;
		type = buffer.getUnsignedByte();
		actionType = buffer.getUnsignedByte();
		clientCode = buffer.getUnsignedShort();
		xOffset = x = buffer.getShort();
		yOffset = y = buffer.getShort();
		width = buffer.getUnsignedShort();
		height = buffer.getUnsignedShort();
		v_pos_mode = (byte) 0;
		h_size_mode = (byte) 0;
		h_pos_mode = (byte) 0;
		v_size_mode = (byte) 0;
		alpha = buffer.getUnsignedByte();
		parentId = buffer.getUnsignedShort();
		if (parentId == 65535)
			parentId = -1;
		else
			parentId = parentId + (~0xffff & bitPacked);
		//System.out.println(parent+":"+hash+":"+(hash&0xffff)+":"+(~0xffff & hash));
		mouseOverId = buffer.getUnsignedShort();
		if (mouseOverId == 65535)
			mouseOverId = -1;
		int valueCompareCount = buffer.getUnsignedByte();
		if (valueCompareCount > 0) {
			requiredValues = new int[valueCompareCount];
			valueCompareType = new int[valueCompareCount];
			for (int id = 0; id < valueCompareCount; id++) {
				valueCompareType[id] = buffer.getUnsignedByte();
				requiredValues[id] = buffer.getUnsignedShort();
			}
		}
		int cs1length = buffer.getUnsignedByte();
		if (cs1length > 0) {
			cs1opcodes = new int[cs1length][];
			for (int blockIdx = 0; blockIdx < cs1length; blockIdx++) {
				int cs1blocklength = buffer.getUnsignedShort();
				cs1opcodes[blockIdx] = new int[cs1blocklength];
				for (int i_24_ = 0; i_24_ < cs1blocklength; i_24_++) {
					cs1opcodes[blockIdx][i_24_] = buffer
							.getUnsignedShort();
					if (cs1opcodes[blockIdx][i_24_] == 65535)
						cs1opcodes[blockIdx][i_24_] = -1;
				}
			}
		}
		if (type == 0) {
			maxScrollVertical = buffer.getUnsignedShort();
			hidden = buffer.getUnsignedByte() == 1;
		}
		if (type == 1) {
			buffer.getUnsignedShort();
			buffer.getUnsignedByte();
		}
		if (type == 2) {
			System.out.println("jake is right");
			inv = new int[height * width];
			invStackSize = new int[height * width];
			someHashModifier = buffer.getUnsignedByte();
			if (someHashModifier == 1)
				click_mask |= 0x10000000;
			someHash1Modifier = buffer.getUnsignedByte();
			if (someHash1Modifier == 1)
				click_mask |= 0x40000000;
			someHash2Modifier = buffer.getUnsignedByte();
			if (someHash2Modifier == 1)
				click_mask |= ~0x7fffffff;
			someHash3Modifier = buffer.getUnsignedByte();
			if (someHash3Modifier == 1)
				click_mask |= 0x20000000;
			invSpritePadX = buffer.getUnsignedByte();
			invSpritePadY = buffer.getUnsignedByte();
			spriteY = new int[20];
			spriteX = new int[20];
			spriteId = new int[20];
			for (int idx = 0; idx < 20; idx++) {
				int spriteEnabled = buffer.getUnsignedByte();
				if (spriteEnabled != 1)
					spriteId[idx] = -1;
				else {
					spriteX[idx] = buffer.getShort();
					spriteY[idx] = buffer.getShort();
					spriteId[idx] = buffer.getInt();
				}
			}
			oiActions = new RSString[5];
			for (int idx = 0; idx < 5; idx++) {
				RSString action = buffer.getRS2String();
				if (action.length() > 0) {
					oiActions[idx] = action;
					click_mask |= 1 << idx + 23;
				}
			}
		}
		if (type == 3)
			filled = buffer.getUnsignedByte();
		if (type == 4 || type == 1) {
			horizontalAlignment = buffer.getUnsignedByte();
			verticalAlignment = buffer.getUnsignedByte();
			verticalSpacing = buffer.getUnsignedByte();
			font = buffer.getUnsignedShort();
			if (font == 65535)
				font = -1;
			shaded = buffer.getUnsignedByte() == 1;
		}
		if (type == 4) {
			disabledText = buffer.getRS2String();
			enabledText = buffer.getRS2String();
		}
		if (type == 1 || type == 3 || type == 4)
			disabledColor = buffer.getInt();
		if (type == 3 || type == 4) {
			enabledColor = buffer.getInt();
			disabledMouseOverColor = buffer.getInt();
			enabledMouseOverColor = buffer.getInt();
		}
		if (type == 5) {
			disabledSprite = buffer.getInt();
			enabledSprite = buffer.getInt();
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = buffer.getUnsignedShort();
			mediaTypeEnabled = 1;
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			mediaIdEnabled = buffer.getUnsignedShort();
			if (mediaIdEnabled == 65535)
				mediaIdEnabled = -1;
			disabledAnim = buffer.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			enabledAnim = buffer.getUnsignedShort();
			if (enabledAnim == 65535)
				enabledAnim = -1;
			zoom = buffer.getUnsignedShort();
			rotateX = buffer.getUnsignedShort();
			rotateY = buffer.getUnsignedShort();
		}
		if (type == 7) {
			inv = new int[height * width];
			invStackSize = new int[height * width];
			horizontalAlignment = buffer.getUnsignedByte();
			font = buffer.getUnsignedShort();
			if (font == 65535)
				font = -1;
			shaded = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
			invSpritePadX = buffer.getShort();
			invSpritePadY = buffer.getShort();
			someHash6Modifier = buffer.getUnsignedByte();
			if (someHash6Modifier == 1)
				click_mask |= 0x40000000;
			oiActions = new RSString[5];
			for (int i_33_ = 0; i_33_ < 5; i_33_++) {
				RSString rSString = buffer.getRS2String();
				if (rSString.length() > 0) {
					oiActions[i_33_] = rSString;
					click_mask |= 1 << 23 + i_33_;
				}
			}
		}
		if (type == 8) {
			disabledText = buffer.getRS2String();
		}
		if (i == 0) {
			if (actionType == 2 || type == 2) {
				selectedActionName = buffer.getRS2String();
				spellName = buffer.getRS2String();
				someSpellModifier = buffer.getUnsignedShort();
				click_mask |= someSpellModifier << 11;
			}
			if (actionType == 1 || actionType == 4 || actionType == 5
					|| actionType == 6) {
				tooltip = buffer.getRS2String();
				if (tooltip.length() == 0) {
					if (actionType == 1)
						tooltip = Class37_Sub9_Sub5.ok;
					if (actionType == 4)
						tooltip = Class84.select;
					if (actionType == 5)
						tooltip = Class84.select;
					if (actionType == 6)
						tooltip = Class71.continueString;
				}
			}
			if (actionType == 1 || actionType == 4 || actionType == 5)
				click_mask |= 0x400000;
			if (actionType == 6)
				click_mask |= 0x1;
		}
	}
	
	public int someSpellModifier = 0;
	public int someHashModifier = 0;
	public int someHash1Modifier = 0;
	public int someHash2Modifier = 0;
	public int someHash3Modifier = 0;
	public int someHash4Modifier = 0;
	public int someHash5Modifier = 0;
	public int someHash6Modifier = 0;

	public Object[] method197(ByteVector class37_sub11, int i) {
		anInt392++;
		int i_35_ = class37_sub11.getUnsignedByte();
		if (i_35_ == 0)
			return null;
		if (i != 29002)
			method192(-28, 22, 56, -40, -73);
		Object[] objects = new Object[i_35_];
		for (int i_36_ = 0; (i_35_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++) {
			int i_37_ = class37_sub11.getUnsignedByte();
			if ((i_37_ ^ 0xffffffff) != -1) {
				if (i_37_ == 1) {
					objects[i_36_] = class37_sub11.getRS2String();
					//System.out.println(new String( ((RSString) objects[i_36_]).aByteArray1669));
				}
			} else
				objects[i_36_] = new Integer(class37_sub11.getInt());
		}
		objectData = true;
		return objects;
	}

	public Sprite method198(int i, byte i_38_) {
		anInt437++;
		Class27.aBoolean672 = false;
		if (i < 0 || (spriteId.length ^ 0xffffffff) >= (i ^ 0xffffffff))
			return null;
		if (i_38_ != -107)
			method192(-49, 85, 59, 8, 22);
		int i_39_ = spriteId[i];
		if (i_39_ == -1)
			return null;
		Sprite class37_sub4_sub9_sub3 = ((Sprite) Class37_Sub9_Sub33.aClass65_3512
				.get((long) i_39_));
		if (class37_sub4_sub9_sub3 != null)
			return class37_sub4_sub9_sub3;
		class37_sub4_sub9_sub3 = Class6.method61(i_39_, 0, Class80.aClass15_1507);
		if (class37_sub4_sub9_sub3 != null)
			Class37_Sub9_Sub33.aClass65_3512.put(class37_sub4_sub9_sub3, (long) i_39_);
		else
			Class27.aBoolean672 = true;
		return class37_sub4_sub9_sub3;
	}

	public int[] method199(int i, ByteVector class37_sub11) {
		anInt412++;
		int i_40_ = class37_sub11.getUnsignedByte();
		if (i_40_ == 0)
			return null;
		int[] is = new int[i_40_];
		for (int i_41_ = i; i_41_ < i_40_; i_41_++)
			is[i_41_] = class37_sub11.getInt();
		return is;
	}

	public Class37_Sub4_Sub9_Sub2_Sub1 method200(int i) {
		anInt438++;
		Class27.aBoolean672 = false;
		if (font == -1)
			return null;
		Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = ((Class37_Sub4_Sub9_Sub2_Sub1) Class37_Sub17.aClass65_2163
				.get((long) font));
		if (class37_sub4_sub9_sub2_sub1 != null)
			return class37_sub4_sub9_sub2_sub1;
		class37_sub4_sub9_sub2_sub1 = Class37_Sub9_Sub3.method770(
				Class80.aClass15_1507, 0, (byte) 119,
				ByteVector.aClass15_2025, font, null);
		if (class37_sub4_sub9_sub2_sub1 == null)
			Class27.aBoolean672 = true;
		else
			Class37_Sub17.aClass65_2163.put(class37_sub4_sub9_sub2_sub1, (long) font);
		return class37_sub4_sub9_sub2_sub1;
	}

	public void parseNew498(ByteVector class37_sub11) {
		class37_sub11.getUnsignedByte();
		anInt373++;
		newFormat = true;
		type = class37_sub11.getUnsignedByte();
		clientCode = class37_sub11.getUnsignedShort();
		xOffset = x = class37_sub11.getShort();
		yOffset = y = class37_sub11.getShort();
		width = class37_sub11.getUnsignedShort();
		height = class37_sub11.getUnsignedShort();
		h_size_mode =  class37_sub11.getSignedByte();
		v_size_mode = class37_sub11.getSignedByte();
		h_pos_mode = class37_sub11.getSignedByte();
		v_pos_mode = class37_sub11.getSignedByte();
		parentId = class37_sub11.getUnsignedShort();
		if ((parentId ^ 0xffffffff) != -65536)
			parentId = (bitPacked & ~0xffff) + parentId;
		else
			parentId = -1;
		hidden = class37_sub11.getUnsignedByte() == 1;
		if (type == 0) {
			maxScrollHorizontal = class37_sub11.getUnsignedShort();
			maxScrollVertical = class37_sub11.getUnsignedShort();
			aBoolean1150 = class37_sub11.getUnsignedByte() == 1;
		}
		if (type == 5) {
			disabledSprite = class37_sub11.getInt();
			rotation = class37_sub11.getUnsignedShort();
			gridOriginal = class37_sub11.getUnsignedByte() == 1;
			alpha = class37_sub11.getUnsignedByte();
			outline = class37_sub11.getUnsignedByte();
			shadow = class37_sub11.getInt();
			flipVertical = class37_sub11.getUnsignedByte() == 1;
			flipHorizontal = class37_sub11.getUnsignedByte() == 1;
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = class37_sub11.getUnsignedShort();
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			translateX = class37_sub11.getShort();//translate x/y
			translateY = class37_sub11.getShort();//trasnlate x/y
			rotateX = class37_sub11.getUnsignedShort();
			rotateY = class37_sub11.getUnsignedShort();
			rotateZ = class37_sub11.getUnsignedShort();//rotateZ
			zoom = class37_sub11.getUnsignedShort();
			disabledAnim = class37_sub11.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			aBoolean364 = class37_sub11.getUnsignedByte() == 1;
			class37_sub11.getUnsignedShort();
			if (h_size_mode != 0) {
				anInt1018 = class37_sub11.getUnsignedShort();
			}
			if (v_size_mode != 0) {
				anInt1076 = class37_sub11.getUnsignedShort();
			}
		}
		if (type == 4) {
			font = class37_sub11.getUnsignedShort();
			if (font == 65535)
				font = -1;
			disabledText = class37_sub11.getRS2String();
			verticalSpacing = class37_sub11.getUnsignedByte();
			horizontalAlignment = class37_sub11.getUnsignedByte();
			verticalAlignment = class37_sub11.getUnsignedByte();
			shaded = class37_sub11.getUnsignedByte() == 1;
			disabledColor = class37_sub11.getInt();
		}
		if (type == 3) {
			disabledColor = class37_sub11.getInt();
			filled = class37_sub11.getUnsignedByte();
			alpha = class37_sub11.getUnsignedByte();
		}
		if (type == 9) {
			thickness = class37_sub11.getUnsignedByte();
			disabledColor = class37_sub11.getInt();
			standardVerticalOrientation = class37_sub11.getUnsignedByte() == 1;
		}
		click_mask = class37_sub11.getTriByte(-26256544);
		action_name = class37_sub11.getRS2String();
		int i = class37_sub11.getUnsignedByte();
		if ((i ^ 0xffffffff) < -1) {
			niActions = new RSString[i];
			for (int i_42_ = 0; i_42_ < i; i_42_++)
				niActions[i_42_] = class37_sub11.getRS2String();
		} else {
			niActions = new RSString[i];
		}
		anInt378 = class37_sub11.getUnsignedByte();
		anInt350 = class37_sub11.getUnsignedByte();
		modifyDraggingAlpha = class37_sub11.getUnsignedByte() == 1;
		selectedActionName = class37_sub11.getRS2String();
		
		onStartListener = method197(class37_sub11, 29002);
		mouseFocusListener = method197(class37_sub11, 29002);
		mouseUnfocusListener = method197(class37_sub11, 29002);
		spellUsedListener = method197(class37_sub11, 29002);//used on entity
		spellUsedOnItemListener = method197(class37_sub11, 29002);//used on item
		varpUpdateListener = method197(class37_sub11, 29002);
		inventoryUpdateListener = method197(class37_sub11, 29002);
		skillUpdateListener = method197(class37_sub11, 29002);
		mainLoopListener = method197(class37_sub11, 29002);
		anObjectArray363 = method197(class37_sub11, 29002);
		mouseFocusedListener = method197(class37_sub11, 29002);
		mouseClickFocusListener = method197(class37_sub11, 29002);
		mouseClickListener = method197(class37_sub11, 29002);
		mouseClickUnfocusListener = method197(class37_sub11, 29002);//not applied to any interface
		mouseDraggedListener = method197(class37_sub11, 29002);//not applied to any interface
		anObjectArray409 = method197(class37_sub11, 29002);//not applied to any interface
		anObjectArray456 = method197(class37_sub11, 29002);//not applied to any interface
		mouseWheelListener = method197(class37_sub11, 29002);
		varpListenerValues = method199(0, class37_sub11);//config array idk name
		inventoryListenerValues = method199(0, class37_sub11);//inventory array
		skillListenerValues = method199(0, class37_sub11);//skill array
	}

	public void parseNew508(ByteVector class37_sub11) {
		class37_sub11.getUnsignedByte();
		anInt373++;
		newFormat = true;
		//System.out.println("chris is right");
		type = class37_sub11.getUnsignedByte();
		clientCode = class37_sub11.getUnsignedShort();
		xOffset = x = class37_sub11.getShort();
		yOffset = y = class37_sub11.getShort();
		width = class37_sub11.getUnsignedShort();
		height = class37_sub11.getUnsignedShort();
		h_size_mode =  class37_sub11.getSignedByte();
		v_size_mode = class37_sub11.getSignedByte();
		h_pos_mode = class37_sub11.getSignedByte();
		v_pos_mode = class37_sub11.getSignedByte();
		parentId = class37_sub11.getUnsignedShort();
		if ((parentId ^ 0xffffffff) != -65536)
			parentId = (bitPacked & ~0xffff) + parentId;
		else
			parentId = -1;
		hidden = class37_sub11.getUnsignedByte() == 1;
		if (type == 0) {
			maxScrollHorizontal = class37_sub11.getUnsignedShort();
			maxScrollVertical = class37_sub11.getUnsignedShort();
			aBoolean1150 = class37_sub11.getUnsignedByte() == 1;
		}
		if (type == 5) {
			disabledSprite = class37_sub11.getInt();
			rotation = class37_sub11.getUnsignedShort();
			gridOriginal = class37_sub11.getUnsignedByte() == 1;
			alpha = class37_sub11.getUnsignedByte();
			outline = class37_sub11.getUnsignedByte();
			shadow = class37_sub11.getInt();
			flipVertical = class37_sub11.getUnsignedByte() == 1;
			flipHorizontal = class37_sub11.getUnsignedByte() == 1;
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = class37_sub11.getUnsignedShort();
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			translateX = class37_sub11.getShort();//translate x/y
			translateY = class37_sub11.getShort();//trasnlate x/y
			rotateX = class37_sub11.getUnsignedShort();
			rotateY = class37_sub11.getUnsignedShort();
			rotateZ = class37_sub11.getUnsignedShort();//rotateZ
			zoom = class37_sub11.getUnsignedShort();
			disabledAnim = class37_sub11.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			aBoolean364 = class37_sub11.getUnsignedByte() == 1;
			class37_sub11.getUnsignedShort();
			class37_sub11.getUnsignedShort();
			class37_sub11.getUnsignedByte();
			if (h_size_mode != 0) {
				anInt1018 = class37_sub11.getUnsignedShort();
			}
			if (v_size_mode != 0) {
				anInt1076 = class37_sub11.getUnsignedShort();
			}
		}
		if (type == 4) {
			font = class37_sub11.getUnsignedShort();
			if (font == 65535)
				font = -1;
			disabledText = class37_sub11.getRS2String();
			verticalSpacing = class37_sub11.getUnsignedByte();
			horizontalAlignment = class37_sub11.getUnsignedByte();
			verticalAlignment = class37_sub11.getUnsignedByte();
			shaded = class37_sub11.getUnsignedByte() == 1;
			disabledColor = class37_sub11.getInt();
		}
		if (type == 3) {
			disabledColor = class37_sub11.getInt();
			filled = class37_sub11.getUnsignedByte();
			alpha = class37_sub11.getUnsignedByte();
		}
		if (type == 9) {
			thickness = class37_sub11.getUnsignedByte();
			disabledColor = class37_sub11.getInt();
			standardVerticalOrientation = class37_sub11.getUnsignedByte() == 1;
		}
		click_mask = class37_sub11.getTriByte(-26256544);
		int i2 = class37_sub11.getUnsignedByte();
		if ((i2) > 0) {
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i2 ^ 0xffffffff); i_2_++)
				class37_sub11.getSignedByte();
		}
		action_name = class37_sub11.getRS2String();
		int i = class37_sub11.getUnsignedByte();
		if ((i ^ 0xffffffff) < -1) {
			niActions = new RSString[i];
			for (int i_42_ = 0; i_42_ < i; i_42_++)
				niActions[i_42_] = class37_sub11
						.getRS2String();
		}  else {
			niActions = new RSString[i];
		}
		anInt378 = class37_sub11.getUnsignedByte();
		anInt350 = class37_sub11.getUnsignedByte();
		modifyDraggingAlpha = class37_sub11.getUnsignedByte() == 1;
		selectedActionName = class37_sub11.getRS2String();


		onStartListener = method197(class37_sub11, 29002);
		mouseFocusListener = method197(class37_sub11, 29002);
		mouseUnfocusListener = method197(class37_sub11, 29002);
		spellUsedListener = method197(class37_sub11, 29002);//used on entity
		spellUsedOnItemListener = method197(class37_sub11, 29002);//used on item


		varpUpdateListener = method197(class37_sub11, 29002);
		inventoryUpdateListener = method197(class37_sub11, 29002);
		skillUpdateListener = method197(class37_sub11, 29002);
		mainLoopListener = method197(class37_sub11, 29002);
		anObjectArray363 = method197(class37_sub11, 29002);


		mouseFocusedListener = method197(class37_sub11, 29002);
		mouseClickFocusListener = method197(class37_sub11, 29002);
		mouseClickListener = method197(class37_sub11, 29002);
		mouseClickUnfocusListener = method197(class37_sub11, 29002);//not applied to any interface
		mouseDraggedListener = method197(class37_sub11, 29002);//not applied to any interface


		anObjectArray409 = method197(class37_sub11, 29002);//not applied to any interface
		anObjectArray456 = method197(class37_sub11, 29002);//not applied to any interface
		mouseWheelListener = method197(class37_sub11, 29002);

		method197(class37_sub11, 29002);
		method197(class37_sub11, 29002);

		varpListenerValues = method199(0, class37_sub11);//config array idk name
		inventoryListenerValues = method199(0, class37_sub11);//inventory array
		skillListenerValues = method199(0, class37_sub11);//skill array

		method199(0, class37_sub11);
		method199(0, class37_sub11);

	}

	public void parseNew530(ByteVector buffer) {
		buffer.getUnsignedByte();
		anInt373++;
		newFormat = true;
		//System.out.println("chris is right");
		type = buffer.getUnsignedByte();
		if(-1 != ~(128 & this.type)) {
			this.type &= 127;
			buffer.getRS2String();
		}
		clientCode = buffer.getUnsignedShort();
		xOffset = x = buffer.getShort();
		yOffset = y = buffer.getShort();
		width = buffer.getUnsignedShort();
		height = buffer.getUnsignedShort();
		h_size_mode =  buffer.getSignedByte();
		v_size_mode = buffer.getSignedByte();
		h_pos_mode = buffer.getSignedByte();
		v_pos_mode = buffer.getSignedByte();
		parentId = buffer.getUnsignedShort();
		if ((parentId ^ 0xffffffff) != -65536)
			parentId = (bitPacked & ~0xffff) + parentId;
		else
			parentId = -1;
		hidden = buffer.getUnsignedByte() == 1;
		if (type == 0) {
			maxScrollHorizontal = buffer.getUnsignedShort();
			maxScrollVertical = buffer.getUnsignedShort();
			aBoolean1150 = buffer.getUnsignedByte() == 1;
		}
		int var3;
		if (type == 5) {
			disabledSprite = buffer.getInt();
			rotation = buffer.getUnsignedShort();
			var3 = buffer.getUnsignedByte();
			gridOriginal = ~(1 & var3) != -1;
			alpha = buffer.getUnsignedByte();
			outline = buffer.getUnsignedByte();
			shadow = buffer.getInt();
			flipVertical = buffer.getUnsignedByte() == 1;
			flipHorizontal = buffer.getUnsignedByte() == 1;
			//disabledColor = buffer.getInt();
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = buffer.getUnsignedShort();
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			translateX = buffer.getShort();//translate x/y
			translateY = buffer.getShort();//trasnlate x/y
			rotateX = buffer.getUnsignedShort();
			rotateY = buffer.getUnsignedShort();
			rotateZ = buffer.getUnsignedShort();//rotateZ
			zoom = buffer.getUnsignedShort();
			disabledAnim = buffer.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			aBoolean364 = buffer.getUnsignedByte() == 1;
			buffer.getUnsignedShort();
			buffer.getUnsignedShort();
			buffer.getUnsignedByte();
			if (h_size_mode != 0) {
				anInt1018 = buffer.getUnsignedShort();
			}
			if (v_size_mode != 0) {
				anInt1076 = buffer.getUnsignedShort();
			}
		}
		if (type == 4) {
			font = buffer.getUnsignedShort();
			if (font == 65535)
				font = -1;
			disabledText = buffer.getRS2String();
			verticalSpacing = buffer.getUnsignedByte();
			horizontalAlignment = buffer.getUnsignedByte();
			verticalAlignment = buffer.getUnsignedByte();
			shaded = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
		}
		if (type == 3) {
			disabledColor = buffer.getInt();
			filled = buffer.getUnsignedByte();
			alpha = buffer.getUnsignedByte();
		}
		if (type == 9) {
			thickness = buffer.getUnsignedByte();
			disabledColor = buffer.getInt();
			standardVerticalOrientation = buffer.getUnsignedByte() == 1;
		}
		click_mask = buffer.getTriByte(-26256544);
		int i2 = buffer.getUnsignedByte();
		int var5;
		if ((i2) > 0) {
			int[] anIntArray299 = new int[10];
			byte[] aByteArray263 = new byte[10];

			for(byte[] aByteArray231 = new byte[10]; ~i2 != -1; i2 = buffer.getUnsignedByte()) {
				var5 = (i2 >> 4) - 1;
				i2 = buffer.getUnsignedByte() | i2 << 8;
				i2 &= 4095;
				if(4095 == i2) {
					anIntArray299[var5] = -1;
				} else {
					anIntArray299[var5] = i2;
				}

				aByteArray263[var5] = buffer.getSignedByte();
				aByteArray231[var5] = buffer.getSignedByte();
			}
		}
		action_name = buffer.getRS2String();
		var5 = buffer.getUnsignedByte();
		int var6 = var5 & 15;
		if (0 < var6) {
			niActions = new RSString[var6];
			for (int i_42_ = 0; i_42_ < var6; i_42_++)
				niActions[i_42_] = buffer
						.getRS2String();
		}  else {
			niActions = new RSString[var6];
		}

		int var7 = var5 >> 4;
		int var8;
		if(var7 > 0) {
			var8 = buffer.getUnsignedByte();
			int[] anIntArray249 = new int[var8 + 1];

			for(int var9 = 0; var9 < anIntArray249.length; ++var9) {
				anIntArray249[var9] = -1;
			}

			anIntArray249[var8] = buffer.getUnsignedShort();
		}

		if(1 < var7) {
			var8 = buffer.getUnsignedByte();
			buffer.getUnsignedShort();
		}
		//buffer.getRS2String();
		anInt378 = buffer.getUnsignedByte();
		anInt350 = buffer.getUnsignedByte();
		modifyDraggingAlpha = buffer.getUnsignedByte() == 1;
		selectedActionName = buffer.getRS2String();
		var8 = -1;
		if(0 != getClickMask(click_mask)) {
			var8 = buffer.getUnsignedShort();
			int v34 = buffer.getUnsignedShort();
			if(-65536 == ~var8) {
				var8 = -1;
			}

			if('\uffff' == v34) {
				v34 = -1;
			}

			int anInt238 = buffer.getUnsignedShort();
			if(anInt238 == '\uffff') {
				anInt238 = -1;
			}
		}
		onStartListener = method197(buffer, 29002);
		mouseFocusListener = method197(buffer, 29002);
		mouseUnfocusListener = method197(buffer, 29002);
		spellUsedListener = method197(buffer, 29002);//used on entity
		spellUsedOnItemListener = method197(buffer, 29002);//used on item


		varpUpdateListener = method197(buffer, 29002);
		inventoryUpdateListener = method197(buffer, 29002);
		skillUpdateListener = method197(buffer, 29002);
		mainLoopListener = method197(buffer, 29002);
		anObjectArray363 = method197(buffer, 29002);


		mouseFocusedListener = method197(buffer, 29002);
		mouseClickFocusListener = method197(buffer, 29002);
		mouseClickListener = method197(buffer, 29002);
		mouseClickUnfocusListener = method197(buffer, 29002);//not applied to any interface
		mouseDraggedListener = method197(buffer, 29002);//not applied to any interface


		anObjectArray409 = method197(buffer, 29002);//not applied to any interface
		anObjectArray456 = method197(buffer, 29002);//not applied to any interface
		mouseWheelListener = method197(buffer, 29002);

		newListener1 = method197(buffer, 29002);
		newListener2 = method197(buffer, 29002);

		varpListenerValues = method199(0, buffer);//config array idk name
		inventoryListenerValues = method199(0, buffer);//inventory array
		skillListenerValues = method199(0, buffer);//skill array

		newListener1Values = method199(0, buffer);
		newListener2Values = method199(0, buffer);

	}

	public void parseNew562(ByteVector buffer) {
		buffer.getUnsignedByte();
		anInt373++;
		newFormat = true;
		//System.out.println("chris is right");
		type = buffer.getUnsignedByte();
		if(-1 != ~(128 & this.type)) {
			this.type &= 127;
			buffer.getRS2String();
		}
		clientCode = buffer.getUnsignedShort();
		xOffset = x = buffer.getShort();
		yOffset = y = buffer.getShort();
		width = buffer.getUnsignedShort();
		height = buffer.getUnsignedShort();
		h_size_mode =  buffer.getSignedByte();
		v_size_mode = buffer.getSignedByte();
		h_pos_mode = buffer.getSignedByte();
		v_pos_mode = buffer.getSignedByte();
		parentId = buffer.getUnsignedShort();
		if ((parentId ^ 0xffffffff) != -65536)
			parentId = (bitPacked & ~0xffff) + parentId;
		else
			parentId = -1;
		hidden = buffer.getUnsignedByte() == 1;
		if (type == 0) {
			maxScrollHorizontal = buffer.getUnsignedShort();
			maxScrollVertical = buffer.getUnsignedShort();
			aBoolean1150 = buffer.getUnsignedByte() == 1;
		}
		int var3;
		if (type == 5) {
			disabledSprite = buffer.getInt();
			rotation = buffer.getUnsignedShort();
			var3 = buffer.getUnsignedByte();
			extraBoolean = 0 != (var3 & 0x2);
			gridOriginal = ~(1 & var3) != -1;
			alpha = buffer.getUnsignedByte();
			outline = buffer.getUnsignedByte();
			shadow = buffer.getInt();
			flipVertical = buffer.getUnsignedByte() == 1;
			flipHorizontal = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = buffer.getUnsignedShort();
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			translateX = buffer.getShort();//translate x/y
			translateY = buffer.getShort();//trasnlate x/y
			rotateX = buffer.getUnsignedShort();
			rotateY = buffer.getUnsignedShort();
			rotateZ = buffer.getUnsignedShort();//rotateZ
			zoom = buffer.getUnsignedShort();
			disabledAnim = buffer.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			aBoolean364 = buffer.getUnsignedByte() == 1;
			buffer.getUnsignedShort();
			buffer.getUnsignedShort();
			buffer.getUnsignedByte();
			if (h_size_mode != 0) {
				anInt1018 = buffer.getUnsignedShort();
			}
			if (v_size_mode != 0) {
				anInt1076 = buffer.getUnsignedShort();
			}
		}
		if (type == 4) {
			font = buffer.getUnsignedShort();
			if (font == 65535)
				font = -1;
			disabledText = buffer.getRS2String();
			verticalSpacing = buffer.getUnsignedByte();
			horizontalAlignment = buffer.getUnsignedByte();
			verticalAlignment = buffer.getUnsignedByte();
			shaded = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
		}
		if (type == 3) {
			disabledColor = buffer.getInt();
			filled = buffer.getUnsignedByte();
			alpha = buffer.getUnsignedByte();
		}
		if (type == 9) {
			thickness = buffer.getUnsignedByte();
			disabledColor = buffer.getInt();
			standardVerticalOrientation = buffer.getUnsignedByte() == 1;
		}
		click_mask = buffer.getTriByte(-26256544);
		int i2 = buffer.getUnsignedByte();
		int var5;
		if ((i2) > 0) {
			int[] anIntArray299 = new int[10];
			byte[] aByteArray263 = new byte[10];

			for(byte[] aByteArray231 = new byte[10]; ~i2 != -1; i2 = buffer.getUnsignedByte()) {
				var5 = (i2 >> 4) - 1;
				i2 = buffer.getUnsignedByte() | i2 << 8;
				i2 &= 4095;
				if(4095 == i2) {
					anIntArray299[var5] = -1;
				} else {
					anIntArray299[var5] = i2;
				}

				aByteArray263[var5] = buffer.getSignedByte();
				aByteArray231[var5] = buffer.getSignedByte();
			}
		}
		action_name = buffer.getRS2String();
		var5 = buffer.getUnsignedByte();
		int var6 = var5 & 15;
		if (0 < var6) {
			niActions = new RSString[var6];
			for (int i_42_ = 0; i_42_ < var6; i_42_++)
				niActions[i_42_] = buffer
						.getRS2String();
		}  else {
			niActions = new RSString[var6];
		}

		int var7 = var5 >> 4;
		int var8;
		if(var7 > 0) {
			var8 = buffer.getUnsignedByte();
			int[] anIntArray249 = new int[var8 + 1];

			for(int var9 = 0; var9 < anIntArray249.length; ++var9) {
				anIntArray249[var9] = -1;
			}

			anIntArray249[var8] = buffer.getUnsignedShort();
		}

		if(1 < var7) {
			var8 = buffer.getUnsignedByte();
			buffer.getUnsignedShort();
		}
		buffer.getRS2String();
		anInt378 = buffer.getUnsignedByte();
		anInt350 = buffer.getUnsignedByte();
		modifyDraggingAlpha = buffer.getUnsignedByte() == 1;
		selectedActionName = buffer.getRS2String();
		var8 = -1;
		if(0 != getClickMask(click_mask)) {
			var8 = buffer.getUnsignedShort();
			int v34 = buffer.getUnsignedShort();
			if(-65536 == ~var8) {
				var8 = -1;
			}

			if('\uffff' == v34) {
				v34 = -1;
			}

			int anInt238 = buffer.getUnsignedShort();
			if(anInt238 == '\uffff') {
				anInt238 = -1;
			}
		}
		onStartListener = method197(buffer, 29002);
		mouseFocusListener = method197(buffer, 29002);
		mouseUnfocusListener = method197(buffer, 29002);
		spellUsedListener = method197(buffer, 29002);//used on entity
		spellUsedOnItemListener = method197(buffer, 29002);//used on item


		varpUpdateListener = method197(buffer, 29002);
		inventoryUpdateListener = method197(buffer, 29002);
		skillUpdateListener = method197(buffer, 29002);
		mainLoopListener = method197(buffer, 29002);
		anObjectArray363 = method197(buffer, 29002);


		mouseFocusedListener = method197(buffer, 29002);
		mouseClickFocusListener = method197(buffer, 29002);
		mouseClickListener = method197(buffer, 29002);
		mouseClickUnfocusListener = method197(buffer, 29002);//not applied to any interface
		mouseDraggedListener = method197(buffer, 29002);//not applied to any interface


		anObjectArray409 = method197(buffer, 29002);//not applied to any interface
		anObjectArray456 = method197(buffer, 29002);//not applied to any interface
		mouseWheelListener = method197(buffer, 29002);

		newListener1 = method197(buffer, 29002);
		newListener2 = method197(buffer, 29002);

		varpListenerValues = method199(0, buffer);//config array idk name
		inventoryListenerValues = method199(0, buffer);//inventory array
		skillListenerValues = method199(0, buffer);//skill array

		newListener1Values = method199(0, buffer);
		newListener2Values = method199(0, buffer);

	}

	public void parseNew614(ByteVector buffer) {
		anInt373++;
		int i_11_ = buffer.getUnsignedByte();
		if (i_11_ == 255)
			i_11_ = -1;
		newFormat = true;
		//System.out.println("chris is right");
		type = buffer.getUnsignedByte();
		if(-1 != ~(128 & this.type)) {
			this.type &= 127;
			buffer.getRS2String();
		}
		clientCode = buffer.getUnsignedShort();
		xOffset = x = buffer.getShort();
		yOffset = y = buffer.getShort();
		width = buffer.getUnsignedShort();
		height = buffer.getUnsignedShort();
		h_size_mode =  buffer.getSignedByte();
		v_size_mode = buffer.getSignedByte();
		h_pos_mode = buffer.getSignedByte();
		v_pos_mode = buffer.getSignedByte();
		parentId = buffer.getUnsignedShort();
		if ((parentId ^ 0xffffffff) != -65536)
			parentId = (bitPacked & ~0xffff) + parentId;
		else
			parentId = -1;
		hidden = buffer.getUnsignedByte() == 1;
		if (type == 0) {
			maxScrollHorizontal = buffer.getUnsignedShort();
			maxScrollVertical = buffer.getUnsignedShort();
			if(i_11_ < 0)
				aBoolean1150 = buffer.getUnsignedByte() == 1;
		}
		int var3;
		if (type == 5) {
			disabledSprite = buffer.getInt();
			rotation = buffer.getUnsignedShort();
			var3 = buffer.getUnsignedByte();
			gridOriginal = ~(1 & var3) != -1;
			alpha = buffer.getUnsignedByte();
			outline = buffer.getUnsignedByte();
			shadow = buffer.getInt();
			flipVertical = buffer.getUnsignedByte() == 1;
			flipHorizontal = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
		}
		if (type == 6) {
			modelTypeDisabled = 1;
			mediaIdDisabled = buffer.getUnsignedShort();
			if (mediaIdDisabled == 65535)
				mediaIdDisabled = -1;
			translateX = buffer.getShort();//translate x/y
			translateY = buffer.getShort();//trasnlate x/y
			rotateX = buffer.getUnsignedShort();
			rotateY = buffer.getUnsignedShort();
			rotateZ = buffer.getUnsignedShort();//rotateZ
			zoom = buffer.getUnsignedShort();
			disabledAnim = buffer.getUnsignedShort();
			if (disabledAnim == 65535)
				disabledAnim = -1;
			aBoolean364 = buffer.getUnsignedByte() == 1;
			buffer.getUnsignedShort();
			buffer.getUnsignedShort();
			buffer.getUnsignedByte();
			if (h_size_mode != 0) {
				anInt1018 = buffer.getUnsignedShort();
			}
			if (v_size_mode != 0) {
				anInt1076 = buffer.getUnsignedShort();
			}
		}
		if (type == 4) {
			font = buffer.getUnsignedShort();
			if (font == 65535)
				font = -1;
			disabledText = buffer.getRS2String();
			verticalSpacing = buffer.getUnsignedByte();
			horizontalAlignment = buffer.getUnsignedByte();
			verticalAlignment = buffer.getUnsignedByte();
			shaded = buffer.getUnsignedByte() == 1;
			disabledColor = buffer.getInt();
			alpha = buffer.getUnsignedByte();
			if(i_11_ >= 0)
				buffer.getUnsignedByte();
		}
		if (type == 3) {
			disabledColor = buffer.getInt();
			filled = buffer.getUnsignedByte();
			alpha = buffer.getUnsignedByte();
		}
		if (type == 9) {
			thickness = buffer.getUnsignedByte();
			disabledColor = buffer.getInt();
			standardVerticalOrientation = buffer.getUnsignedByte() == 1;
		}
		click_mask = buffer.getTriByte(-26256544);
		int i2 = buffer.getUnsignedByte();
		int var5;
		if ((i2) > 0) {
			int[] anIntArray299 = new int[11];
			byte[] aByteArray263 = new byte[11];

			for(byte[] aByteArray231 = new byte[11]; ~i2 != -1; i2 = buffer.getUnsignedByte()) {
				var5 = (i2 >> 4) - 1;
				i2 = buffer.getUnsignedByte() | i2 << 8;
				i2 &= 4095;
				if(4095 == i2) {
					anIntArray299[var5] = -1;
				} else {
					anIntArray299[var5] = i2;
				}

				aByteArray263[var5] = buffer.getSignedByte();
				aByteArray231[var5] = buffer.getSignedByte();
			}
		}
		action_name = buffer.getRS2String();
		var5 = buffer.getUnsignedByte();
		int var6 = var5 & 15;
		if (0 < var6) {
			niActions = new RSString[var6];
			for (int i_42_ = 0; i_42_ < var6; i_42_++)
				niActions[i_42_] = buffer
						.getRS2String();
		}  else {
			niActions = new RSString[var6];
		}

		int var7 = var5 >> 4;
		int var8;
		if(var7 > 0) {
			var8 = buffer.getUnsignedByte();
			int[] anIntArray249 = new int[var8 + 1];

			for(int var9 = 0; var9 < anIntArray249.length; ++var9) {
				anIntArray249[var9] = -1;
			}

			anIntArray249[var8] = buffer.getUnsignedShort();
		}

		if(1 < var7) {
			var8 = buffer.getUnsignedByte();
			buffer.getUnsignedShort();
		}
		buffer.getRS2String();
		anInt378 = buffer.getUnsignedByte();
		anInt350 = buffer.getUnsignedByte();
		modifyDraggingAlpha = buffer.getUnsignedByte() == 1;
		selectedActionName = buffer.getRS2String();
		var8 = -1;
		if(0 != getClickMask(click_mask)) {
			var8 = buffer.getUnsignedShort();
			int v34 = buffer.getUnsignedShort();
			if(-65536 == ~var8) {
				var8 = -1;
			}

			if('\uffff' == v34) {
				v34 = -1;
			}

			int anInt238 = buffer.getUnsignedShort();
			if(anInt238 == '\uffff') {
				anInt238 = -1;
			}
		}
		if (i_11_ >= 0) {
			buffer.getUnsignedShort();
		}
		if (i_11_ >= 0) {
			int i_27_ = buffer.getUnsignedByte();
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				int i_29_ = buffer.getTriByte(-26256544);
				int i_30_ = buffer.getInt();
			}
			int i_31_ = buffer.getUnsignedByte();
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				int i_33_ = buffer.getTriByte(-26256544);
				String string = buffer.readGJString((byte) 116);
			}
		}
		onStartListener = method197(buffer, 29002);
		mouseFocusListener = method197(buffer, 29002);
		mouseUnfocusListener = method197(buffer, 29002);
		spellUsedListener = method197(buffer, 29002);//used on entity
		spellUsedOnItemListener = method197(buffer, 29002);//used on item


		varpUpdateListener = method197(buffer, 29002);
		inventoryUpdateListener = method197(buffer, 29002);
		skillUpdateListener = method197(buffer, 29002);
		mainLoopListener = method197(buffer, 29002);
		anObjectArray363 = method197(buffer, 29002);

		if(i_11_ > 0)
			method197(buffer, 29002);


		mouseFocusedListener = method197(buffer, 29002);
		mouseClickFocusListener = method197(buffer, 29002);
		mouseClickListener = method197(buffer, 29002);
		mouseClickUnfocusListener = method197(buffer, 29002);//not applied to any interface
		mouseDraggedListener = method197(buffer, 29002);//not applied to any interface


		anObjectArray409 = method197(buffer, 29002);//not applied to any interface
		anObjectArray456 = method197(buffer, 29002);//not applied to any interface
		mouseWheelListener = method197(buffer, 29002);

		method197(buffer, 29002);
		method197(buffer, 29002);

		varpListenerValues = method199(0, buffer);//config array idk name
		inventoryListenerValues = method199(0, buffer);//inventory array
		skillListenerValues = method199(0, buffer);//skill array

		method199(0, buffer);
		method199(0, buffer);

	}

	static final int getClickMask(int var1) {
		int value = 0;
		try {
			value = 127 & var1 >> 11;
		} catch (RuntimeException var3) {
			var3.printStackTrace();
		}
		return value;
	}

	public Object[] unknown;
	public Object[] unknown2;
	public int[] unknow3;
	public int[] unknown4;

	public byte h_size_mode;
	public byte v_size_mode;
	public byte h_pos_mode;
	public byte v_pos_mode;
	public boolean aBoolean1150;
	public int anInt1018;
	public int anInt1076;
	public boolean standardVerticalOrientation;

	public RSInterface() {
		h_size_mode = (byte) 0;
		v_size_mode = (byte) 0;
		h_pos_mode = (byte) 0;
		v_pos_mode = (byte) 0;
		aBoolean1150 = false;
		standardVerticalOrientation = false;
		anInt1018 = 0;
		anInt1076 = 0;
		rotateX = 0;
		gridOriginal = false;
		aBoolean364 = false;
		modifyDraggingAlpha = false;
		itemZoom = 0;
		horizontalScrollPosition = 0;
		lastDrawCycle = -1;
		anInt378 = 0;
		x = 0;
		height = 0;
		verticalAlignment = 0;
		bitPacked = -1;
		itemId = -1;
		rotation = 0;
		zoom = 100;
		anInt334 = -1;
		filled = 0;
		offsetX = 0;
		action_name = Class39.aClass16_873;
		aClass18_413 = null;
		translateX = 0;
		enabledSprite = -1;
		disabledSprite = -1;
		enabledText = Class39.aClass16_873;
		xOffset = 0;
		invSpritePadX = 0;
		disabledMouseOverColor = 0;
		parentId = -1;
		maxScrollVertical = 0;
		anInt323 = 0;
		mouseClicked = false;
		mediaTypeEnabled = 1;
		mediaIdDisabled = -1;
		disabledAnim = -1;
		rotateZ = 0;
		enabledAnim = -1;
		anInt344 = 0;
		tooltip = Class37_Sub9_Sub5.ok;
		alpha = 0;
		click_mask = 0;
		scriptedVarpLength = 0;
		y = 0;
		rotateY = 0;
		spellName = Class39.aClass16_873;
		shaded = false;
		anInt350 = 0;
		verticalSpacing = 0;
		font = -1;
		width = 0;
		enabledColor = 0;
		disabledColor = 0;
		hidden = false;
		horizontalAlignment = 0;
		scriptedSkillLength = 0;
		verticalScrollPosition = 0;
		offsetY = 0;
		scriptedInventoryLength = 0;
		outline = 0;
		translateY = 0;
		modelTypeDisabled = 1;
		clientCode = 0;
		anInt435 = -1;
		selectedActionName = Class39.aClass16_873;
		shadow = 0;
		yOffset = 0;
		mouseOverId = -1;
		mouseFocused = false;
		newFormat = false;
		invSpritePadY = 0;
		enabledMouseOverColor = 0;
		redrawId = -1;
		objectData = false;
		disabledText = Class39.aClass16_873;
		anInt443 = 0;
		actionType = 0;
		mediaIdEnabled = -1;
	}

	static {
		anInt340 = 0;
		aClass16_330 = aClass16_365;
		aClass16_447 = (Class37_Sub2
				.create_rsstring("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
		aClass16_454 = Class37_Sub2.create_rsstring("No reply from loginserver)3");
		aClass16_440 = aClass16_454;
	}
}
