package org.ie.client;

/* Class68_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class68_Sub1 extends Class68
{
    public ByteBuffer aByteBuffer2311;
    
    public byte[] method1247(int i) {
	if (i != -1)
	    aByteBuffer2311 = null;
	byte[] is = new byte[aByteBuffer2311.capacity()];
	aByteBuffer2311.position(0);
	aByteBuffer2311.get(is);
	return is;
    }
    
    public void method1249(byte[] is, byte i) {
	aByteBuffer2311 = ByteBuffer.allocateDirect(is.length);
	aByteBuffer2311.position(0);
	aByteBuffer2311.put(is);
	int i_0_ = -44 / ((i - 57) / 33);
    }
}
