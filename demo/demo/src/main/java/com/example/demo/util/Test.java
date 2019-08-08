package com.example.demo.util;

import java.util.Random;

import com.example.demo.util.reflect.Student;

public class Test {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[]= {3,2,77,44,33,22};
//		Singlon s=Singlon.getInstance();
//		s.maopao(nums);
//		System.out.printf("%d,%d和%d",3,4,5);
//		String a ="aaa";
//		String b=new String("aaa");
//		System.out.println(a.equals(b));
		
		
		//System.out.println(1+x);
//		for(int i=0;i<200;i++) {
//			Random r=new Random();
//			int x=r.nextInt(181);
//			System.out.println(20+x);
//
//		}
		
//		int a=1;
//		int b=5;
//		int c=Math.addExact(a, b);
//		System.out.println(c);		
		
//	}
//	public static void swap(int i, int j) {
//	   //   Integer temp = new Integer(i);
//		int temp=i;
//	      i = j;
//	      j = temp;
//	   }
	   public static void main(String[] args) {
		   int[] nums= {3,5,2,9,7,8};
		   int size=nums.length;
		   int temp=0;
		   for(int i=1;i<size;i++) {
			   for(int j=0;j<size-i;j++) {
				   if(nums[j]>nums[j+1]) {
					   temp=nums[j];
					   nums[j]=nums[j+1];
					   nums[j+1]=temp;
				   }
			   }
		   }
		   for (int a : nums) {
			System.out.println(a);
		}
		   
	   }


}
