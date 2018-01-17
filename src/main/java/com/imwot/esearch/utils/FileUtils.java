package com.imwot.esearch.utils;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileUtils {

	public void writeMethod2(String fileName, byte[] datas, int start,
			int length) {
		try {

			FileChannel fc = new RandomAccessFile(fileName, "rw").getChannel();
			// 注意，文件通道的可读可写要建立在文件流本身可读写的基础之上
			MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE,
					start, length);
			// 写128M的内容
			for (byte data : datas) {
				out.put(data);
			}

			fc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readMethod2(String fileName, int length) {
		try {
			FileChannel fc = new RandomAccessFile(fileName, "rw").getChannel();
			// 注意，文件通道的可读可写要建立在文件流本身可读写的基础之上
			MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0,
					length);
			// 读取文件中间6个字节内容
			for (int i = length - 1; i >= 0; i--) {
				System.out.println((char) out.get(i));
			}
			fc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public byte[] writeInt(int i) throws IOException {
		byte[] data = new byte[4];
		data[0] = (byte) (i >> 24);
		data[0] = ((byte) (i >> 16));
		data[0] = ((byte) (i >> 8));
		data[0] = ((byte) i);
		return data;
	}

	public static void main(String[] str) throws Exception {
		FileUtils fu = new FileUtils();
		String fileName = "c:/bit.dat";

		long ss1 = System.currentTimeMillis();

		byte[] bytes = new byte[] { 'd' };
		fu.writeMethod2(fileName, bytes, 3, 1);
		long ss2 = System.currentTimeMillis();
		System.out.println(ss1 - ss1);

		long ss3 = System.currentTimeMillis();
		fu.readMethod2(fileName, 4);
		long ss4 = System.currentTimeMillis();

		System.out.println("字符串存储时间:" + (ss2 - ss1));
		System.out.println("字符串存储时间:" + (ss4 - ss3));
	}
}