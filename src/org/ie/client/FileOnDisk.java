package org.ie.client;

/*
 * Class: FileOnDisk.java
 * */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOnDisk
{

	public void seek(byte byte0, long l)//method1254
		throws IOException
	{
		if(byte0 != 17)
			position = 127L;
		randomAccessFile.seek(l);
		position = l;
	}

	public void finalize()
		throws Throwable
	{
		if(randomAccessFile != null)
		{
			System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
			close(48);
		}
	}

	public int read(int i, int j, byte byte0, byte abyte0[])//method1255
		throws IOException
	{
		int read = randomAccessFile.read(abyte0, i, j);
		if(read > 0)
			position += read;
		return read;
	}

	public long length(int i)//method1256
		throws IOException
	{
		if(i != 1)
			return -98L;
		else
			return randomAccessFile.length();
	}

	public void close(int i)
		throws IOException
	{
		if(randomAccessFile != null)
		{
			randomAccessFile.close();
			randomAccessFile = null;
		}
	}

	public File file(int i)
	{
		if(i != 0)
			file(-7);
		return file;
	}

	public FileOnDisk(File file, String s, long length)
		throws IOException
	{
		if(~length == 0L)
			length = 0x7fffffffffffffffL;
		if(~length >= ~file.length())
			file.delete();
		randomAccessFile = new RandomAccessFile(file, s);
		this.file = file;
		this.length = length;
		position = 0L;
		int i = randomAccessFile.read();
		if(~i != 0 && !s.equals("r"))
		{
			randomAccessFile.seek(0L);
			randomAccessFile.write(i);
		}
		randomAccessFile.seek(0L);
	}

	public void write(byte abyte0[], byte byte0, int i, int j)
		throws IOException
	{
		if(length < position + (long)j)
		{
			randomAccessFile.seek(length - -1L);
			randomAccessFile.write(1);
			throw new EOFException();
		}
		randomAccessFile.write(abyte0, i, j);
		position += j;
		if(byte0 != -91)
			file(-79);
	}

	public RandomAccessFile randomAccessFile;
	public long position;
	public long length;
	public File file;
}
