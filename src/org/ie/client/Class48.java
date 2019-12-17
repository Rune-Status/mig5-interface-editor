package org.ie.client;

/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48
{
    public int anInt999;
    public int[] anIntArray1000;
    public int anInt1001;
    public int[] anIntArray1002;
    
    public Class48() {
	Class37_Sub24.method1041(16);
	anInt1001 = (Class37_Sub24.method1039() != 0
		     ? Class37_Sub24.method1041(4) + 1 : 1);
	if (Class37_Sub24.method1039() != 0)
	    Class37_Sub24.method1041(8);
	Class37_Sub24.method1041(2);
	if (anInt1001 > 1)
	    anInt999 = Class37_Sub24.method1041(4);
	anIntArray1002 = new int[anInt1001];
	anIntArray1000 = new int[anInt1001];
	for (int i = 0; i < anInt1001; i++) {
	    Class37_Sub24.method1041(8);
	    anIntArray1002[i] = Class37_Sub24.method1041(8);
	    anIntArray1000[i] = Class37_Sub24.method1041(8);
	}
    }
}
