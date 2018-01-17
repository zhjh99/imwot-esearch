package com.imwot.esearch.utils;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class FileUtils {

	private int n = 10000000;

	public void writeMethod2() {
		String fileName = "c:/bit.dat";
		try {
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(fileName,true)));

//			 out.writeUTF("100000000,9");
//			 System.out.println(out.size() + " bytes have been written.2");
			 
			 // System.out.println(Long.MAX_VALUE +
			 // " bytes have been written.2");

			byte[]datas=new byte[1024];
			int y=0;
//			for (int x = 1; x <= n; x++) {
//				String data=x + ",9";
//				datas[y+x]=writeInt(data);
//			}
			out.write(datas);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readMethod2() {
		try {
			DataInputStream stream = new DataInputStream(new FileInputStream(
					"c:/bit.dat"));
			String docid;
			while ((docid = stream.readUTF()) != null) {
				stream.readUTF();
//				System.out.println("docid:" + docid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeO() throws Exception {
		File file = new File("c:/bit2.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		IndexList list = new IndexList();

		MIndex mIndex2 = new MIndex();
		mIndex2.setDocId(3);
		mIndex2.setTf(1);
		mIndex2.setPos("3");

		MIndex mIndex3 = new MIndex();
		mIndex3.setDocId(7);
		mIndex3.setTf(1);
		mIndex3.setPos("4");

		for (int x = 1; x <= n; x++) {
			MIndex mIndex1 = new MIndex();
			mIndex1.setDocId(x);
			mIndex1.setTf(9);
			list.addPosIist(mIndex1);
		}
		oos.writeObject(list);
		oos.flush();
		oos.close();
		fos.close();
	}

	private void readO() throws Exception {
		File file = new File("c:/bit2.dat");
		FileInputStream fos = new FileInputStream(file);
		ObjectInputStream oos = new ObjectInputStream(fos);

		IndexList list = (IndexList) oos.readObject();
		for (MIndex in : list.getPosIist()) {
			System.out.println(in.getDocId());
			System.out.println(in.getTf());
		}
		oos.close();
		fos.close();
	}
	
	public byte[] writeInt(int i) throws IOException {
		byte[] data=new byte[4];
		data[0]=(byte)(i >> 24);
		data[0]=((byte)(i >> 16));
		data[0]=((byte)(i >>  8));
		data[0]=((byte) i);
		return data;
	  }

	public static void main(String[] str) throws Exception {
		FileUtils fu = new FileUtils();

		long ss1 = System.currentTimeMillis();
		fu.writeMethod2();
		long ss2 = System.currentTimeMillis();
		System.out.println(ss1 - ss1);

		long ss3 = System.currentTimeMillis();
		fu.readMethod2();
		long ss4 = System.currentTimeMillis();

		System.out.println("×Ö·û´®´æ´¢Ê±¼ä:" + (ss2 - ss1));
		System.out.println("×Ö·û´®´æ´¢Ê±¼ä:" + (ss4 - ss3));
	}
}