package org.ie.client;

/* Class37_Sub4_Sub7_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub1_Sub2 extends Class37_Sub4_Sub7_Sub1 {
	public static RSString aClass16_3960;
	public int anInt3961;
	public int anInt3962;
	public static int anInt3963;
	public int anInt3964;
	public static RSString aClass16_3965;
	public int anInt3966;
	public Class37_Sub4_Sub7_Sub6 aClass37_Sub4_Sub7_Sub6_3967;
	public static int anInt3968;
	public static int anInt3969;
	public static int anInt3970;
	public static RSString aClass16_3971;
	public static int anInt3972;
	public int anInt3973 = -1;
	public static RSString aClass16_3974 = Class37_Sub2.create_rsstring("Loaded textures");
	public int anInt3975;
	public static int anInt3976;
	public static int anInt3977;
	public int anInt3978 = 0;
	public static RSString aClass16_3979;
	public int anInt3980;
	public int anInt3981;
	public int anInt3982;
	public boolean aBoolean3983;
	public static int[] anIntArray3984;
	public Class29 aClass29_3985;
	public static int anInt3986;
	public int anInt3987;
	public int anInt3988;
	public static int anInt3989;
	public static RSString aClass16_3990;
	public static RSString aClass16_3991;
	public static RSString aClass16_3992;
	public RSString aClass16_3993;
	public int anInt3994;
	public int anInt3995;
	public int anInt3996;
	public static int anInt3997;

	public static void method506(boolean bool) {
		if (bool == false) {
			for (int i = 0; (Class76.anInt1436 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				int i_0_ = Class37_Sub4_Sub16.anIntArray2869[i];
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_0_]);
				if (class37_sub4_sub7_sub1_sub1 != null)
					Class37_Sub9_Sub3
							.method771(
									(class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2858),
									class37_sub4_sub7_sub1_sub1, 101);
			}
			anInt3986++;
		}
	}

	public static Sprite method507(int i, int i_1_,
			boolean bool, boolean bool_2_, int i_3_, int i_4_) {
		long l = (long) i
				+ (((long) i_3_ << 650011536) + (((long) i_1_ << -1733983514) - -((long) i_4_ << 1837135080)));
		anInt3968++;
		if (!bool_2_) {
			Sprite class37_sub4_sub9_sub3 = ((Sprite) Class81.aClass65_1509
					.get(l));
			if (class37_sub4_sub9_sub3 != null)
				return class37_sub4_sub9_sub3;
		}
		RSItem class37_sub4_sub1 = Class46.loadItem(i, (byte) 93);
		if (i_3_ > 1 && class37_sub4_sub1.stackIDs != null) {
			int i_5_ = -1;
			for (int i_6_ = 0; i_6_ < 10; i_6_++) {
				if (class37_sub4_sub1.stackAmounts[i_6_] <= i_3_
						&& class37_sub4_sub1.stackAmounts[i_6_] != 0)
					i_5_ = class37_sub4_sub1.stackIDs[i_6_];
			}
			if (i_5_ != -1)
				class37_sub4_sub1 = Class46.loadItem(i_5_, (byte) 100);
		}
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = class37_sub4_sub1
				.method451((byte) -107, 1);
		if (class37_sub4_sub7_sub6 == null)
			return null;
		Sprite class37_sub4_sub9_sub3 = null;
		if (class37_sub4_sub1.certTemplateID != -1) {
			class37_sub4_sub9_sub3 = method507(class37_sub4_sub1.certID, 1,
					false, true, 10, 0);
			if (class37_sub4_sub9_sub3 == null)
				return null;
		}
		int[] is = Graphics2D.pixels;
		int i_7_ = Graphics2D.width;
		int i_8_ = Graphics2D.height;
		int[] is_9_ = new int[4];
		Graphics2D.method594(is_9_);
		Sprite class37_sub4_sub9_sub3_10_ = new Sprite(
				32, 32);
		Graphics2D.method587(class37_sub4_sub9_sub3_10_.pixels,
				32, 32);
		Graphics2D.method579();
		Rasterizer.initDefaultOffsets();
		Rasterizer.method668(16, 16);
		Rasterizer.aBoolean3921 = false;
		int i_11_ = (int) (class37_sub4_sub1.modelZoom / 1.1);
		if (bool_2_)
			i_11_ = (int) (1.5 * (double) i_11_);
		else if ((i_1_ ^ 0xffffffff) == -3)
			i_11_ *= 1.04;
		int i_12_ = ((Rasterizer.anIntArray3910[class37_sub4_sub1.modelRotation1])
				* i_11_ >> 1759013264);
		int i_13_ = (i_11_
				* (Rasterizer.anIntArray3929[class37_sub4_sub1.modelRotation1]) >> 12575824);
		class37_sub4_sub7_sub6.method555();
		class37_sub4_sub7_sub6
				.method544(
						0,
						class37_sub4_sub1.modelRotation2,
						class37_sub4_sub1.anInt2517,
						class37_sub4_sub1.modelRotation1,
						class37_sub4_sub1.modelOffset1,
						(class37_sub4_sub1.modelOffset2 + (i_12_ - -((class37_sub4_sub7_sub6.anInt2627) / 2))),
						i_13_ - -class37_sub4_sub1.modelOffset2);
		if ((i_1_ ^ 0xffffffff) <= -2)
			class37_sub4_sub9_sub3_10_.method629(1);
		if (i_1_ >= 2)
			class37_sub4_sub9_sub3_10_.method629(16777215);
		if (i_4_ != 0)
			class37_sub4_sub9_sub3_10_.method655(i_4_);
		Graphics2D.method587(class37_sub4_sub9_sub3_10_.pixels,
				32, 32);
		if ((class37_sub4_sub1.certTemplateID ^ 0xffffffff) != 0)
			class37_sub4_sub9_sub3.method653(0, 0);
		if (!bool_2_
				&& ((class37_sub4_sub1.stackable ^ 0xffffffff) == -2 || i_3_ != 1)
				&& (i_3_ ^ 0xffffffff) != 0)
			Class39.aClass37_Sub4_Sub9_Sub2_Sub1_855
					.method607(RSItem.formatAmount(i_3_, false), 0, 9,
							16776960, 1);
		if (!bool_2_)
			Class81.aClass65_1509.put(class37_sub4_sub9_sub3_10_, l);
		Graphics2D.method587(is, i_7_, i_8_);
		Graphics2D.method591(is_9_);
		Rasterizer.initDefaultOffsets();
		Rasterizer.aBoolean3921 = true;
		return class37_sub4_sub9_sub3_10_;
	}

	public static void method508(byte i) {
		aClass16_3971 = null;
		aClass16_3979 = null;
		aClass16_3965 = null;
		anIntArray3984 = null;
		aClass16_3974 = null;
		aClass16_3960 = null;
		aClass16_3992 = null;
		aClass16_3991 = null;
		aClass16_3990 = null;
		int i_14_ = -27 / ((i - 35) / 35);
	}

	public void method509(ByteVector class37_sub11, int i) {
		class37_sub11.pos = 0;
		int i_15_ = -1;
		anInt3997++;
		int[] is = new int[12];
		int i_16_ = class37_sub11.getUnsignedByte();
		anInt3973 = class37_sub11.method982((byte) 94);
		anInt3980 = class37_sub11.method982((byte) 111);
		anInt3988 = 0;
		for (int i_17_ = 0; i_17_ < 12; i_17_++) {
			int i_18_ = class37_sub11.getUnsignedByte();
			if (i_18_ == 0)
				is[i_17_] = 0;
			else {
				int i_19_ = class37_sub11.getUnsignedByte();
				is[i_17_] = (i_18_ << 856606760) + i_19_;
				if ((i_17_ ^ 0xffffffff) == -1 && is[0] == 65535) {
					i_15_ = class37_sub11.getUnsignedShort();
					break;
				}
				if (is[i_17_] >= 512) {
					int i_20_ = (Class46.loadItem(-512 + is[i_17_],
							(byte) 112).team);
					if ((i_20_ ^ 0xffffffff) != -1)
						anInt3988 = i_20_;
				}
			}
		}
		int[] is_21_ = new int[5];
		for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -6; i_22_++) {
			int i_23_ = class37_sub11.getUnsignedByte();
			if (i_23_ < 0
					|| (Class37_Sub4_Sub7_Sub1.aShortArrayArray3702[i_22_].length <= i_23_))
				i_23_ = 0;
			is_21_[i_22_] = i_23_;
		}
		anInt3701 = class37_sub11.getUnsignedShort();
		if ((anInt3701 ^ 0xffffffff) == -65536)
			anInt3701 = -1;
		anInt3686 = class37_sub11.getUnsignedShort();
		if ((anInt3686 ^ 0xffffffff) == -65536)
			anInt3686 = -1;
		anInt3696 = anInt3686;
		anInt3657 = class37_sub11.getUnsignedShort();
		if (anInt3657 == 65535)
			anInt3657 = -1;
		anInt3660 = class37_sub11.getUnsignedShort();
		if (anInt3660 == 65535)
			anInt3660 = -1;
		anInt3676 = class37_sub11.getUnsignedShort();
		if (i == anInt3676)
			anInt3676 = -1;
		anInt3678 = class37_sub11.getUnsignedShort();
		if ((anInt3678 ^ 0xffffffff) == -65536)
			anInt3678 = -1;
		anInt3698 = class37_sub11.getUnsignedShort();
		if (anInt3698 == 65535)
			anInt3698 = -1;
		aClass16_3993 = Class37_Sub4_Sub13.method708(i + -65498,
				class37_sub11.getLong(false)).method164(70);
		anInt3978 = class37_sub11.getUnsignedByte();
		anInt3961 = class37_sub11.getUnsignedShort();
		if (aClass29_3985 == null)
			aClass29_3985 = new Class29();
		aClass29_3985.method270(is, i_16_ == 1, (byte) -96, is_21_, i_15_);
	}

	public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
		anInt3970++;
		if (aClass29_3985 == null)
			return null;
		Class37_Sub4_Sub12 class37_sub4_sub12 = ((anInt3655 ^ 0xffffffff) == 0
				|| (anInt3689 ^ 0xffffffff) != -1 ? null : Class37_Sub9_Sub22
				.method861(anInt3655));
		Class37_Sub4_Sub12 class37_sub4_sub12_24_ = ((anInt3647 == -1
				|| aBoolean3983 || anInt3701 == anInt3647
				&& class37_sub4_sub12 != null) ? null : Class37_Sub9_Sub22
				.method861(anInt3647));
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = aClass29_3985
				.method272(class37_sub4_sub12, anInt3638, -256, anInt3677,
						class37_sub4_sub12_24_);
		if (class37_sub4_sub7_sub6 == null)
			return null;
		class37_sub4_sub7_sub6.method555();
		anInt3691 = class37_sub4_sub7_sub6.anInt2627;
		if (!aBoolean3983 && (anInt3636 ^ 0xffffffff) != 0
				&& (anInt3654 ^ 0xffffffff) != 0) {
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_25_ = Class76
					.method1285((byte) 87, anInt3636)
					.method731(anInt3654, bool);
			if (class37_sub4_sub7_sub6_25_ != null) {
				class37_sub4_sub7_sub6_25_.method543(0, -anInt3693, 0);
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6
						.method549(class37_sub4_sub7_sub6_25_);
			}
		}
		if (!aBoolean3983 && aClass37_Sub4_Sub7_Sub6_3967 != null) {
			if ((Class37_Sub7.loopCycle ^ 0xffffffff) <= (anInt3966 ^ 0xffffffff))
				aClass37_Sub4_Sub7_Sub6_3967 = null;
			if (anInt3982 <= Class37_Sub7.loopCycle
					&& Class37_Sub7.loopCycle < anInt3966) {
				Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_26_ = aClass37_Sub4_Sub7_Sub6_3967;
				class37_sub4_sub7_sub6_26_.method543(anInt3987 + -anInt3666,
						anInt3964 - anInt3996, -anInt3642 + anInt3995);
				if ((anInt3681 ^ 0xffffffff) == -513) {
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
				} else if ((anInt3681 ^ 0xffffffff) != -1025) {
					if ((anInt3681 ^ 0xffffffff) == -1537)
						class37_sub4_sub7_sub6_26_.method553();
				} else {
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
				}
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6
						.method549(class37_sub4_sub7_sub6_26_);
				if (anInt3681 == 512)
					class37_sub4_sub7_sub6_26_.method553();
				else if ((anInt3681 ^ 0xffffffff) == -1025) {
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
				} else if (anInt3681 == 1536) {
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
					class37_sub4_sub7_sub6_26_.method553();
				}
				class37_sub4_sub7_sub6_26_.method543(anInt3666 + -anInt3987,
						-anInt3964 + anInt3996, anInt3642 + -anInt3995);
			}
		}
		class37_sub4_sub7_sub6.aBoolean3836 = bool;
		return class37_sub4_sub7_sub6;
	}

	public boolean method497(int i) {
		if (i != 20542)
			method497(-14);
		anInt3972++;
		if (aClass29_3985 == null)
			return false;
		return true;
	}

	public static RSString method510(int i, int i_27_) {
		anInt3963++;
		if (i_27_ <= 45)
			method508((byte) -86);
		if ((Class37_Sub9_Sub37.aClass16Array3593[i].length() ^ 0xffffffff) < -1)
			return Class37_Sub9_Sub27.method881((new RSString[] {
					(Class37_Sub9_Sub14.aClass16Array3151[i]),
					Class38.aClass16_827,
					(Class37_Sub9_Sub37.aClass16Array3593[i]) }));
		return Class37_Sub9_Sub14.aClass16Array3151[i];
	}

	public Class37_Sub4_Sub7_Sub1_Sub2() {
		anInt3966 = 0;
		aBoolean3983 = false;
		anInt3982 = 0;
		anInt3980 = -1;
		anInt3988 = 0;
		anInt3961 = 0;
	}

	static {
		aClass16_3971 = Class37_Sub2.create_rsstring(")3runescape)3com");
		aClass16_3960 = Class37_Sub2.create_rsstring(" )2> ");
		anIntArray3984 = new int[4000];
		aClass16_3992 = Class37_Sub2.create_rsstring(")1p");
		aClass16_3990 = Class37_Sub2.create_rsstring("Anmelde)2Limit -Uberschritten)3");
		aClass16_3991 = Class37_Sub2.create_rsstring("Lade Sprites )2 ");
		aClass16_3965 = aClass16_3974;
		anInt3977 = -1;
		aClass16_3979 = Class37_Sub2.create_rsstring("mod_icons");
	}
}
