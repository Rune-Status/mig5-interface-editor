package org.ie.client;

/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class85
{
    public int anInt1536;
    public int anInt1537;
    public byte[] aByteArray1538;
    public int[] anIntArray1539;
    public static int anInt1540;
    public byte aByte1541;
    public int anInt1542;
    public static int anInt1543;
    public int[] anIntArray1544 = new int[6];
    public byte[] aByteArray1545;
    public static int anInt1546;
    public int anInt1547;
    public boolean[] aBooleanArray1548;
    public int anInt1549;
    public int[][] anIntArrayArray1550;
    public boolean[] aBooleanArray1551;
    public static int anInt1552;
    public int anInt1553;
    public byte[][] aByteArrayArray1554;
    public static int anInt1555;
    public int anInt1556;
    public static int anInt1557 = 1;
    public byte[] aByteArray1558;
    public int[] anIntArray1559;
    public int anInt1560;
    public int anInt1561;
    public byte[] aByteArray1562;
    public int anInt1563;
    public int anInt1564;
    public int[][] anIntArrayArray1565;
    public int anInt1566;
    public byte[] aByteArray1567;
    public int anInt1568;
    public int anInt1569;
    public byte[] aByteArray1570;
    public static int anInt1571;
    public int[] anIntArray1572;
    public int[][] anIntArrayArray1573;
    public static int anInt1574;
    public int anInt1575;
    
    public static int method1319(byte[] is, int i, int i_0_, int i_1_) {
	anInt1546++;
	int i_2_ = -1;
	if (i_1_ != 448779536)
	    method1319(null, -31, -98, -11);
	for (int i_3_ = i; i_3_ < i_0_; i_3_++)
	    i_2_ = (Class37_Sub1.anIntArray1803[0xff & (i_2_ ^ is[i_3_])]
		    ^ i_2_ >>> -1456252312);
	i_2_ ^= 0xffffffff;
	return i_2_;
    }
    
    public static void method1320(RSInterface component, int componentX, int componentHeight, int maxScroll,
				  int mouseX, int componentY, int mouseY) {
	anInt1540++;
	if (Class37_Sub9.aBoolean1957)
	    Class37_Sub16.anInt2154 = 32;
	else
	    Class37_Sub16.anInt2154 = 0;
	Class37_Sub9.aBoolean1957 = false;
	if ((Class60.lastMousePress ^ 0xffffffff) != -1) {
	    if (componentX <= mouseX && (mouseX ^ 0xffffffff) > (16 + componentX ^ 0xffffffff)
		&& componentY <= mouseY
		&& (mouseY ^ 0xffffffff) > (componentY + 16 ^ 0xffffffff)) {
		component.verticalScrollPosition -= 4;
		Class73.refreshInterface(component);
	    } else if ((mouseX ^ 0xffffffff) > (componentX ^ 0xffffffff)
		       || (16 + componentX ^ 0xffffffff) >= (mouseX ^ 0xffffffff)
		       || mouseY < -16 + (componentY - -componentHeight)
		       || (componentY - -componentHeight ^ 0xffffffff) >= (mouseY ^ 0xffffffff)) {
		if (-Class37_Sub16.anInt2154 + componentX <= mouseX
		    && mouseX < Class37_Sub16.anInt2154 + (16 + componentX)
		    && (componentY - -16 ^ 0xffffffff) >= (mouseY ^ 0xffffffff)
		    && -16 + (componentY + componentHeight) > mouseY) {
		    int i_11_ = (-32 + componentHeight) * componentHeight / maxScroll;
		    if ((i_11_ ^ 0xffffffff) > -9)
			i_11_ = 8;
		    int i_12_ = -(i_11_ / 2) + -16 + mouseY + -componentY;
		    int i_13_ = componentHeight + (-32 + -i_11_);
		    component.verticalScrollPosition = (maxScroll + -componentHeight) * i_12_ / i_13_;
		    Class73.refreshInterface(component);
		    Class37_Sub9.aBoolean1957 = true;
		}
	    } else {
		component.verticalScrollPosition += 4;
		Class73.refreshInterface(component);
	    }
	}
	if ((Class37_Sub4_Sub7_Sub1_Sub1.scrollModifier ^ 0xffffffff) != -1) {
	    int i_14_ = component.width;
	    if (mouseX >= componentX - i_14_ && (componentY ^ 0xffffffff) >= (mouseY ^ 0xffffffff)
		&& mouseX < componentX - -16 && mouseY <= componentHeight + componentY) {
		component.verticalScrollPosition += Class37_Sub4_Sub7_Sub1_Sub1.scrollModifier * 45;
		Class73.refreshInterface(component);
	    }
	}
    }
    
    public static void method1321(int i, int i_15_, byte i_16_) {
	if (i_16_ == 3) {
	    anInt1571++;
	    long l = (long) ((i_15_ << -1543447152) + i);
	    Class37_Sub4_Sub13 class37_sub4_sub13
		= ((Class37_Sub4_Sub13)
		   Class37_Sub4_Sub18.aClass13_2905.get(l));
	    if (class37_sub4_sub13 != null)
		Class4.aClass77_92.insertFront(class37_sub4_sub13);
	}
    }
   
    public static int method1322(int i, int i_17_, int i_18_, int i_19_,
				 int i_20_) {
	int i_21_
	    = ((-Rasterizer.anIntArray3929[1024 * i_19_ / i_18_]
		+ 65536)
	       >> -1009382879);
	if (i_17_ != 2058356880)
	    return 82;
	anInt1574++;
	return ((i * i_21_ >> 2058356880)
		+ ((65536 - i_21_) * i_20_ >> 448779536));
    }
    
    public Class85() {
	anIntArray1539 = new int[256];
	aBooleanArray1551 = new boolean[256];
	anIntArrayArray1550 = new int[6][258];
	anInt1536 = 0;
	aBooleanArray1548 = new boolean[16];
	anInt1560 = 0;
	aByteArray1562 = new byte[256];
	anIntArray1559 = new int[257];
	anIntArrayArray1565 = new int[6][258];
	anIntArray1572 = new int[16];
	aByteArray1558 = new byte[18002];
	aByteArrayArray1554 = new byte[6][258];
	aByteArray1567 = new byte[18002];
	anIntArrayArray1573 = new int[6][258];
	aByteArray1570 = new byte[4096];
    }
}
