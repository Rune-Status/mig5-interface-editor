package org.ie.client;

/* Class52_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub2 extends Class52
{
    public long aLong2310 = System.nanoTime();
    
    public int method1129(int i, byte i_0_, int i_1_) {
	long l = 1000000L * (long) i;
	long l_2_ = aLong2310 - System.nanoTime();
	int i_3_ = 0;
	if ((l_2_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL))
	    l_2_ = l;
	if (i_0_ != 119)
	    return 53;
	Class37_Sub9_Sub20.method846(l_2_ / 1000000L, (byte) 58);
	long l_4_;
	for (l_4_ = System.nanoTime();
	     ((i_3_ ^ 0xffffffff) > -11
	      && (-2 < (i_3_ ^ 0xffffffff) || l_4_ > aLong2310));
	     aLong2310 += (long) i_1_ * 1000000L)
	    i_3_++;
	if ((l_4_ ^ 0xffffffffffffffffL) < (aLong2310 ^ 0xffffffffffffffffL))
	    aLong2310 = l_4_;
	return i_3_;
    }
    
    public void method1127(int i) {
	aLong2310 = System.nanoTime();
	if (i != 5)
	    method1129(-36, (byte) -65, -121);
    }
}
