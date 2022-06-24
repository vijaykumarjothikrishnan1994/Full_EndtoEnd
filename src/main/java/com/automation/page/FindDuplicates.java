package com.automation.page;

import java.util.Iterator;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name="Vijaykumarj";
		int count;
		char[] cv=name.toCharArray();
		
		System.out.println(cv.length);
		
		for(int i=0;i<cv.length;i++)
		{
			count=1;
			for(int j=i+1;j<cv.length;j++)
			{
				if(cv[i]==cv[j]&&cv[i]!=' ')
				{
					count++;
					cv[j]='0';
				}
			}
			
			if(count>1&&cv[i]!='0')
			{
				System.out.println(cv[i]);
			}
		}
			//List<E>
	}

}
