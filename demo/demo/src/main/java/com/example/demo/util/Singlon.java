package com.example.demo.util;

public class Singlon {

	private Singlon() {};
	
	private static Singlon instance=new Singlon();
	
	public static Singlon getInstance() {
		return instance;
	}
	
	/**
	 * 冒泡排序
	 * @param nums
	 */
	public void maopao(int nums[]) {
		int temp;
		int size = nums.length;
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (nums[j] > nums[j + 1]) {//相邻位置比较大小，大的就往后移
					temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}

			}

		}
		for (int a : nums) {
			System.out.print(a + " ");
		}

	}
}
