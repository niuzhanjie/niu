package com.example.demo;


public class Test {
	public static void main(String[] args) {
		String a="abcde";
		String b="cdeab";
		String c="asdfg";
		boolean res=test2(a,b);
		System.out.println(res);
	}

 /**
  * 
  * @param a
  * @param b
  * @return
  */
  public static boolean test2(String a,String b ) {
	  boolean res=false;
	  int size=a.length();
	  int size2=b.length();
	  if(size !=size2) {
		  return false;
	  }
	  for(int i=0;i<size;i++) {
		  char d=a.charAt(0);
		  String e=a+d;
		  a=e.substring(1);
		  if(a.equals(b)) {
			  res= true; 
		  }
	  }	  	  
	  return res;
  }
}
