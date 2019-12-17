package org.ie.client;

/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53 {
	public static void method1134(int[] is, int i, int i_0_, int i_1_) {
		i_0_ = i + i_0_ - 7;
		while (i < i_0_) {
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
		}
		i_0_ += 7;
		while (i < i_0_)
			is[i++] = i_1_;
	}

	public static void method1135(byte[] is, int i, byte[] is_2_, int i_3_,
			int i_4_) {
		if (is == is_2_) {
			if (i == i_3_)
				return;
			if (i_3_ > i && i_3_ < i + i_4_) {
				i_4_--;
				i += i_4_;
				i_3_ += i_4_;
				i_4_ = i - i_4_;
				i_4_ += 7;
				while (i >= i_4_) {
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
					is_2_[i_3_--] = is[i--];
				}
				i_4_ -= 7;
				while (i >= i_4_)
					is_2_[i_3_--] = is[i--];
				return;
			}
		}
		i_4_ += i;
		i_4_ -= 7;
		while (i < i_4_) {
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
			is_2_[i_3_++] = is[i++];
		}
		i_4_ += 7;
		while (i < i_4_)
			is_2_[i_3_++] = is[i++];
	}

	public static void method1136(int[] is, int i, int i_5_) {
		i_5_ = i + i_5_ - 7;
		while (i < i_5_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_5_ += 7;
		while (i < i_5_)
			is[i++] = 0;
	}

	public static void method1137(int[] is, int i, int[] is_6_, int i_7_,
			int i_8_) {
		if (is == is_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					is_6_[i_7_--] = is[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			is_6_[i_7_++] = is[i++];
	}
}
