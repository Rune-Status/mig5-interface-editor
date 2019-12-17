package org.ie.client;

/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Cache {
	public NodeSub aClass37_Sub4_1219 = new NodeSub();
	public static int anInt1220;
	public static MouseHandler mouseHandler;
	public static int anInt1222;
	public static int anInt1223;
	public static int anInt1224;
	public static RSString aClass16_1225 = Class37_Sub2.create_rsstring(
			")4lang)4de");
	public static RSString aClass16_1226 = Class37_Sub2.create_rsstring(
			"M");
	public static int anInt1227;
	public static RSString aClass16_1228 = aClass16_1226;
	public static int[] anIntArray1229 = new int[5];
	public static int anInt1230;
	public static int anInt1231;
	public static RSString aClass16_1232;
	public static int anInt1233;
	public static int anInt1234;
	public static RSString aClass16_1235 = aClass16_1226;
	public Hashtable cache;
	public Queue recent = new Queue();
	public int capacity;
	public static int anInt1239;
	public int srcCapacity;
	public static int anInt1241;
	public static RSString aClass16_1242;

	public Node getNext() {
		return cache.getNext();
	}

	public static void method1178(int i) {
		anIntArray1229 = null;
		aClass16_1235 = null;
		if (i <= 41)
			anInt1241 = -111;
		aClass16_1226 = null;
		mouseHandler = null;
		aClass16_1228 = null;
		aClass16_1242 = null;
		aClass16_1225 = null;
		aClass16_1232 = null;
	}

	public void put(NodeSub node, long hash) {
		if (capacity != 0)
			capacity--;
		else {
			NodeSub sub = recent.popFront();
			sub.unlink();
			sub.unlinkSub();
			if (sub == aClass37_Sub4_1219) {
				sub = recent.popFront();
				sub.unlink();
				sub.unlinkSub();
			}
		}
		cache.put(node, hash);
		recent.insertBack(node);
	}

	public Node getFirst() {
		return cache.getFirst();
	}

	public NodeSub get(long hash) {
		NodeSub node = (NodeSub) cache.get(hash);
		if (node != null)
			recent.insertBack(node);
		return node;
	}

	public static void method1182(boolean bool) {
		/*anInt1220++;
		Class52_Sub1.anInt2303 = 0;
		int i = (Class37_Sub18.anInt2200 + (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> -1183036505));
		if (bool != false)
			method1183(43, (byte) -43);
		int i_1_ = (Class15_Sub1.anInt1738 + (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> -1579329017));
		if (i >= 3053 && (i ^ 0xffffffff) >= -3157 && i_1_ >= 3056
				&& i_1_ <= 3136)
			Class52_Sub1.anInt2303 = 1;
		if (i >= 3072 && i <= 3118 && i_1_ >= 9492
				&& (i_1_ ^ 0xffffffff) >= -9536)
			Class52_Sub1.anInt2303 = 1;
		if (Class52_Sub1.anInt2303 == 1 && (i ^ 0xffffffff) <= -3140
				&& (i ^ 0xffffffff) >= -3200 && i_1_ >= 3008 && i_1_ <= 3062)
			Class52_Sub1.anInt2303 = 0;*/
	}

	public static void method1183(int i, byte i_2_) {
		anInt1222++;
		Class37_Sub9_Sub15.method822();
		Class1.method42((byte) -119);
		int i_3_ = Class37_Sub4_Sub18.method730(-9094, i).anInt2808;
		if (i_2_ != -3)
			aClass16_1235 = null;
		if ((i_3_ ^ 0xffffffff) != -1) {
			int i_4_ = Class37_Sub23.varpData[i];
			if ((i_3_ ^ 0xffffffff) == -2) {
				if (i_4_ == 1)
					Rasterizer.method666(0.9F);
				if ((i_4_ ^ 0xffffffff) == -3)
					Rasterizer.method666(0.8F);
				if (i_4_ == 3)
					Rasterizer.method666(0.7F);
				if (i_4_ == 4)
					Rasterizer.method666(0.6F);
				Class37_Sub4_Sub12.method693(i_2_ ^ ~0x74);
			}
			if ((i_3_ ^ 0xffffffff) == -4) {
				int i_5_ = 0;
				if (i_4_ == 0)
					i_5_ = 255;
				if ((i_4_ ^ 0xffffffff) == -2)
					i_5_ = 192;
				if (i_4_ == 2)
					i_5_ = 128;
				if (i_4_ == 3)
					i_5_ = 64;
				if ((i_4_ ^ 0xffffffff) == -5)
					i_5_ = 0;
				if ((i_5_ ^ 0xffffffff) != (Class37_Sub9_Sub17.anInt3223 ^ 0xffffffff)) {
					if (Class37_Sub9_Sub17.anInt3223 != 0
							|| (Queue.anInt1442 ^ 0xffffffff) == 0) {
						if (i_5_ != 0)
							Class59.method1164(32701, i_5_);
						else {
							Class37_Sub9_Sub4.method778(false);
							Class55.aBoolean1071 = false;
						}
					} else {
						Class15.method120(i_5_, 0, false, -15793,
								Class54.aClass15_Sub1_1060, Queue.anInt1442);
						Class55.aBoolean1071 = false;
					}
					Class37_Sub9_Sub17.anInt3223 = i_5_;
				}
			}
			if (i_3_ == 10) {
				if (i_4_ == 0)
					Class43.anInt957 = 127;
				if ((i_4_ ^ 0xffffffff) == -2)
					Class43.anInt957 = 96;
				if ((i_4_ ^ 0xffffffff) == -3)
					Class43.anInt957 = 64;
				if (i_4_ == 3)
					Class43.anInt957 = 32;
				if ((i_4_ ^ 0xffffffff) == -5)
					Class43.anInt957 = 0;
			}
			if (i_3_ == 9)
				Class37_Sub4_Sub10.anInt2677 = i_4_;
			if (i_3_ == 5)
				Class37_Sub2.anInt1825 = i_4_;
			if (i_3_ == 4) {
				if ((i_4_ ^ 0xffffffff) == -1)
					Canvas_Sub1.anInt45 = 127;
				if (i_4_ == 1)
					Canvas_Sub1.anInt45 = 96;
				if ((i_4_ ^ 0xffffffff) == -3)
					Canvas_Sub1.anInt45 = 64;
				if (i_4_ == 3)
					Canvas_Sub1.anInt45 = 32;
				if (i_4_ == 4)
					Canvas_Sub1.anInt45 = 0;
			}
			if ((i_3_ ^ 0xffffffff) == -7)
				Class59.anInt1130 = i_4_;
		}
	}

	public void remove(long hash) {
		NodeSub node = (NodeSub) cache.get(hash);
		if (node == null)
			return;
		node.unlink();
		node.unlinkSub();
		capacity++;
	}

	public static boolean method1185(int i, int i_6_) {
		if (i >= -66)
			return false;
		anInt1234++;
		if ((0x1 & i_6_) == 0)
			return false;
		return true;
	}

	public void clear() {
		for (;;) {
			NodeSub node = recent.popFront();
			if (node == null)
				break;
			node.unlink();
			node.unlinkSub();
		}
		capacity = srcCapacity;
	}

	public Cache(int count) {
		capacity = count;
		srcCapacity = count;
		int size;
		for (size = 1; size + size < count; size += size) {
			/* empty */
		}
		cache = new Hashtable(size);
	}

	static {
		aClass16_1232 = Class37_Sub2.create_rsstring("Okay");
		anInt1241 = 50;
		mouseHandler = new MouseHandler();
		aClass16_1242 = (Class37_Sub2
				.create_rsstring(
						"Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3"));
	}
}
