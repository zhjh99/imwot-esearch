package com.imwot.esearch.utils;

import java.io.IOException;


public abstract class IndexOutput {

	  /** Writes a single byte.
	   * @see IndexInput#readByte()
	   */
	  public abstract void writeByte(byte b) throws IOException;

	  /** Writes an array of bytes.
	   * @param b the bytes to write
	   * @param length the number of bytes to write
	   * @see IndexInput#readBytes(byte[],int,int)
	   */
	  public abstract void writeBytes(byte[] b, int length) throws IOException;

	  /** Writes an int as four bytes.
	   * @see IndexInput#readInt()
	   */
	  public void writeInt(int i) throws IOException {
	    writeByte((byte)(i >> 24));
	    writeByte((byte)(i >> 16));
	    writeByte((byte)(i >>  8));
	    writeByte((byte) i);
	  }

	  /** Writes an int in a variable-length format.  Writes between one and
	   * five bytes.  Smaller values take fewer bytes.  Negative numbers are not
	   * supported.
	   * @see IndexInput#readVInt()
	   */
	  public void writeVInt(int i) throws IOException {
	    while ((i & ~0x7F) != 0) {
	      writeByte((byte)((i & 0x7f) | 0x80));
	      i >>>= 7;
	    }
	    writeByte((byte)i);
	  }

	  /** Writes a long as eight bytes.
	   * @see IndexInput#readLong()
	   */
	  public void writeLong(long i) throws IOException {
	    writeInt((int) (i >> 32));
	    writeInt((int) i);
	  }

	  /** Writes an long in a variable-length format.  Writes between one and five
	   * bytes.  Smaller values take fewer bytes.  Negative numbers are not
	   * supported.
	   * @see IndexInput#readVLong()
	   */
	  public void writeVLong(long i) throws IOException {
	    while ((i & ~0x7F) != 0) {
	      writeByte((byte)((i & 0x7f) | 0x80));
	      i >>>= 7;
	    }
	    writeByte((byte)i);
	  }

	  /** Writes a string.
	   * @see IndexInput#readString()
	   */
	  public void writeString(String s) throws IOException {
	    int length = s.length();
	    writeVInt(length);
	    writeChars(s, 0, length);
	  }

	  /** Writes a sequence of UTF-8 encoded characters from a string.
	   * @param s the source of the characters
	   * @param start the first character in the sequence
	   * @param length the number of characters in the sequence
	   * @see IndexInput#readChars(char[],int,int)
	   */
	  public void writeChars(String s, int start, int length)
	       throws IOException {
	    final int end = start + length;
	    for (int i = start; i < end; i++) {
	      final int code = (int)s.charAt(i);
	      if (code >= 0x01 && code <= 0x7F)
		writeByte((byte)code);
	      else if (((code >= 0x80) && (code <= 0x7FF)) || code == 0) {
		writeByte((byte)(0xC0 | (code >> 6)));
		writeByte((byte)(0x80 | (code & 0x3F)));
	      } else {
		writeByte((byte)(0xE0 | (code >>> 12)));
		writeByte((byte)(0x80 | ((code >> 6) & 0x3F)));
		writeByte((byte)(0x80 | (code & 0x3F)));
	      }
	    }
	  }

	  /** Forces any buffered output to be written. */
	  public abstract void flush() throws IOException;

	  /** Closes this stream to further operations. */
	  public abstract void close() throws IOException;

	  /** Returns the current position in this file, where the next write will
	   * occur.
	   * @see #seek(long)
	   */
	  public abstract long getFilePointer();

	  /** Sets current position in this file, where the next write will occur.
	   * @see #getFilePointer()
	   */
	  public abstract void seek(long pos) throws IOException;

	  /** The number of bytes in the file. */
	  public abstract long length() throws IOException;


	}