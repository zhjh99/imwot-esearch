package com.imwot.esearch.utils;

public class NumberUtils {
	public static void main(String[] args) {
		long number = 3;
		
		// 原始数二进制
		printInfo(number);
		number = number << 1;
		printInfo(number);
		
		System.out.println("**********************");
	}

	/**
	 * 输出一个int的二进制数
	 * 
	 * @param num
	 */
	private static void printInfo(long num) {
		System.out.println(num+"-->"+Long.toBinaryString(num));
	}
}