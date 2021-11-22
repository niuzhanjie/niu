package com.example.demo;

public class TestLeecode {
	
	public static void main(String[] args) {
	int[]	nums = {3,2,4}; 
	int	target = 1534236469;
	String a="12";
	StringBuilder b=new StringBuilder("12");
	System.out.println(a.equals(b));

	}
	
	
	public static boolean num9(int x) {
		if(x<0) {
			return false;
		}
		
		String str=String.valueOf(x);
		int size=str.length();
		if(size==1) {//个位数，肯定返回true
			return true;
		}
		if(size%2==0) {//一共有偶数个数，取前面一半数字和后面一般对比
			String s1=str.substring(0, size/2);
			String s2=str.substring(size/2,size);
			String strb=new StringBuilder(s2).reverse().toString();
			if(s1.equals(strb)) {
				return true;
			}else {
				return false;
			}
		}
		if(size%2!=0) {//一共有奇数个数，取前面一半数字和后面一般对比
			String s1=str.substring(0, size/2+1);
			String s2=str.substring(size/2,size);
			String strb=new StringBuilder(s2).reverse().toString();
			if(s1.equals(strb)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public static int fanzhuan(int num) {
		if(num==0) {
			return 0;
		}
		String str=String.valueOf(num);
		StringBuilder res=new StringBuilder();
		Integer in=null;
		String a=null;
		char[] ch=str.toCharArray(); 
		if(!"-" .equals(String.valueOf(ch[0]))) {//判断是否带负号,正数
		for(int i=0;i<str.length();i++) {			
				res.append(ch[str.length()-i-1]);//反向拼接
				
			}
		}else {
			//res.append("-");
			for(int i=0;i<str.length()-1;i++) {			
				res.append(ch[str.length()-i-1]);//反向拼接
				
			}
		}		
		double ind=Double.valueOf(res.toString());//转换为数字，去掉开头的0
		if(ind>Integer.MAX_VALUE) {
			return 0;
		}else {
			in=Integer.valueOf(res.toString());//转换为数字，去掉开头的0
		}
		if("-" .equals(String.valueOf(ch[0]))) {//判断是否带负号,正数
			a="-"+in;
		}else {
			 a=String.valueOf(in);
		}
		in=Integer.valueOf(a);
		System.out.print(a);
		return in;
	}
	
	
	
	
	
	
	
	
	
	public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            	if(i!=j) {
            		if(nums[i]+nums[j]==target){
                    	int[] res  = {i,j};
                    	System.out.print(i+"   "+j);
                    	 return res;
                    }
            	}
                
            }
        }
        return null;
        				
    }

}
