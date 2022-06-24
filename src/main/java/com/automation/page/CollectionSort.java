package com.automation.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSort {
	
	
	/*public Set<String> Avalue(List<String> stra) {
		
		
		//String[] ste={"vijay","kumar","softwareengineer","tester"};
		
		List<String> stra=new ArrayList<String>();
		
		stra.add("gpay");
		stra.add("Ppay");
		stra.add("PTM");
		Collections.sort(stra);
		
		for (String string : stra) {
			
			
			
			//System.out.println(string);
			
			
			
			Set<String> sv=new HashSet<String>();
			
			Set<String> rv=new HashSet<String>();
			if(!sv.add(string))
			{
				rv.add(string);
				System.out.println(string);
				
			}
			
			return rv;	
		}
	
		
	}*/

	
	
	public void desec() {
		String str="kumar";
		List lv=new ArrayList<Integer>();
		lv.add(1);
		lv.add(10);
		lv.add(16);
		lv.add(919);
		
		lv.add(214);
		lv.add(31);
		
	
		
		Collections.sort(lv, Collections.reverseOrder());
		for (Object object : lv) {
			
			
			System.out.println(object);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionSort obj=new CollectionSort();
		//obj.Avalue("test");
		
		obj.desec();

	}

}
