package com.imwot.esearch.utils;

public class NumberUtils {
	public static void main(String[] args) {
		long number = 3;
		
		// ԭʼ��������
		printInfo(number);
		number = number << 1;
		printInfo(number);
		
		System.out.println("**********************");
	}

	/**
	 * ���һ��int�Ķ�������
	 * 
	 * @param num
	 */
	private static void printInfo(long num) {
		System.out.println(num+"-->"+Long.toBinaryString(num));
	}
}