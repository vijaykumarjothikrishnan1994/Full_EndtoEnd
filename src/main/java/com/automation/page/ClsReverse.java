package com.automation.page;

public class ClsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Vijaykumar";
		
		char[] cv=name.toCharArray();
		
		for(int i=cv.length-1;i>=0;i--)
		{
			System.out.println(cv[i]);
		}

	}

}
