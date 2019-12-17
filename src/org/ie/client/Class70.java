package org.ie.client;

/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class70
{
    public RandomAccessFile aRandomAccessFile1351;
    public long aLong1352;
    public long aLong1353;
    public File aFile1354;
    
    public void method1254(byte i, long l) throws IOException {
	if (i != 17)
	    aLong1352 = 127L;
	aRandomAccessFile1351.seek(l);
	aLong1352 = l;
    }
    
    public void finalize() throws Throwable {
	if (aRandomAccessFile1351 != null) {
	    System.out.println
		("Warning! fileondisk " + aFile1354
		 + " not closed correctly using close(). Auto-closing instead. ");
	    method1257(48);
	}
    }
    
    public int method1255(int i, int i_0_, byte i_1_, byte[] is)
	throws IOException {
	int i_2_ = aRandomAccessFile1351.read(is, i, i_0_);
	int i_3_ = -27 % ((i_1_ - 75) / 34);
	if (i_2_ > 0)
	    aLong1352 += (long) i_2_;
	return i_2_;
    }
    
    public long method1256(int i) throws IOException {
	if (i != 1)
	    return -98L;
	return aRandomAccessFile1351.length();
    }
    
    public void method1257(int i) throws IOException {
	if (aRandomAccessFile1351 != null) {
	    aRandomAccessFile1351.close();
	    aRandomAccessFile1351 = null;
	}
	int i_4_ = -123 / ((i - -59) / 59);
    }
    
    public File method1258(int i) {
	if (i != 0)
	    method1258(-7);
	return aFile1354;
    }
    
    public Class70(File file, String string, long l) throws IOException {
	aRandomAccessFile1351 = new RandomAccessFile(file, string);
	aFile1354 = file;
	aLong1353 = l;
	aLong1352 = 0L;
	int i = aRandomAccessFile1351.read();
	if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
	    aRandomAccessFile1351.seek(0L);
	    aRandomAccessFile1351.write(i);
	}
	aRandomAccessFile1351.seek(0L);
    }
    
    public void method1259(byte[] is, byte i, int i_5_, int i_6_)
	throws IOException {
	if (aLong1353 < aLong1352 + (long) i_6_) {
	    aRandomAccessFile1351.seek(aLong1353 - -1L);
	    aRandomAccessFile1351.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile1351.write(is, i_5_, i_6_);
	aLong1352 += (long) i_6_;
	if (i != -91)
	    method1258(-79);
    }
}
