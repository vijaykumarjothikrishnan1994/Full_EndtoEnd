package com.automation.page;

import java.util.List;

public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is vijay and he is software engineer";
		int count;
		String[] strarray=str.toLowerCase().split(" ");
		for(int i=0;i<strarray.length;i++)
		{
			count =1;
			for(int j=i+1;j<strarray.length;j++)
			{
				if(strarray[i].equals(strarray[j]))
				{
					count++;
					strarray[j]="0";
				}
			}
			
			if(count>1&&strarray[i]!="0")
			{
				System.out.println(strarray[i]);
			}
			
		}
			
		

	}

}
