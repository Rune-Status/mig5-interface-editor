package org.ie.client;

/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Hashtable {
	public static int anInt216 = -2;
	public static int anInt217;
	public static int anInt218;
	public static int anInt219;
	public Node next;
	public long hash;
	public static int anInt222;
	public static int anInt223;
	public static int anInt224;
	public Node[] table;
	public static int[] anIntArray226;
	public static int anInt227;
	public static int anInt228;
	public int size;
	public static int heldKeyCachePosition = 0;
	public int current = 0;
	public Node lastIterated;

	public Node getFirst() {
		current = 0;
		return getNext();
	}

	public static int method95(int i, int i_1_) {
		Class37_Sub13 class37_sub13 = ((Class37_Sub13) Class37_Sub4_Sub7_Sub1.aClass13_3670.get((long) i));
		if (class37_sub13 == null)
			return 0;
		if (i_1_ == -1)
			return 0;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < class37_sub13.anIntArray2108.length; i_4_++) {
			if ((i_1_ ^ 0xffffffff) == (class37_sub13.anIntArray2116[i_4_] ^ 0xffffffff))
				i_3_ += class37_sub13.anIntArray2108[i_4_];
		}
		return i_3_;
	}

	public int method96(Node[] class37s) {
		int i_5_ = 0;
		for (int i_6_ = 0; (size ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
			Node class37 = table[i_6_];
			for (Node class37_7_ = class37.next; class37 != class37_7_; class37_7_ = class37_7_.next)
				class37s[i_5_++] = class37_7_;
		}
		return i_5_;
	}

	public int method97() {
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < size; i_9_++) {
			Node class37 = table[i_9_];
			Node class37_10_ = class37.next;
			while (class37 != class37_10_) {
				class37_10_ = class37_10_.next;
				i_8_++;
			}
		}
		return i_8_;
	}

	public Node pool() {
		if (next == null)
			return null;
		for (Node node = table[(int) (hash & (long) (size + -1))]; next != node; next = next.next) {
			if (hash == next.hash) {
				Node next_ = next;
				next = next.next;
				return next_;
			}
		}
		next = null;
		return null;
	}

	public static void method99(boolean bool) {
		anIntArray226 = null;
	}

	public Node get(long h) {
		hash = h;
		Node node = table[(int) (h & (long) (size + -1))];
		for (next = node.next; node != next; next = next.next) {
			if (next.hash == h) {
				Node next_ = next;
				next = next.next;
				return next_;
			}
		}
		next = null;
		return null;
	}

	public void put(Node remove, long hash) {
		if (remove.previous != null)
			remove.unlink();
		Node prev = table[(int) (hash & (long) (size + -1))];
		remove.previous = prev.previous;
		remove.hash = hash;
		remove.next = prev;
		remove.previous.next = remove;
		remove.next.previous = remove;
	}

	public Node getNext() {
		if (current > 0 && table[current - 1] != lastIterated) {
			Node node = lastIterated;
			lastIterated = node.next;
			return node;
		}
		while (current < size) {
			Node node = table[current++].next;
			if (table[current - 1] != node) {
				lastIterated = node.next;
				return node;
			}
		}
		return null;
	}

	public Hashtable(int i) {
		size = i;
		table = new Node[i];
		for (int id = 0; i > id; id++) {
			Node node = table[id] = new Node();
			node.next = node;
			node.previous = node;
		}
	}
}
