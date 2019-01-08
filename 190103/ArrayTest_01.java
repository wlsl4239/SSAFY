package com.ssafy.array;

public class ArrayTest_01 {
	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		char[] s5 = {'h','i'};
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s5);
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		//System.out.println(s1==s5);
		
		boolean flag = true;
		for(int i=0;i<s5.length;i++)
		{
			if(s5[i]!=s1.charAt(i))
			{
				flag = false;
				break;
			}
		}
		
		System.out.println(flag);
		System.out.println(s3.equals(s4));
	}
}
