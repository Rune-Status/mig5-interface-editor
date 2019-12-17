package org.ie.client;

/* Class37_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class37_Sub3 extends Node
{
    public volatile boolean aBoolean1838 = true;
    public Class37_Sub22 aClass37_Sub22_1839;
    public int anInt1840;
    public Class37_Sub3 aClass37_Sub3_1841;
    
    public abstract int method337();
    
    public abstract void method338(int[] is, int i, int i_0_);
    
    public abstract Class37_Sub3 method339();
    
    public void method340(int[] is, int i, int i_1_) {
	if (aBoolean1838)
	    method338(is, i, i_1_);
	else
	    method341(i_1_);
    }
    
    public abstract void method341(int i);
    
    public int method342() {
	return 255;
    }
    
    public abstract Class37_Sub3 method343();
}
