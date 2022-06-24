package com.automation.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> lv=new ArrayList<Integer>();
		lv.add(2);
		lv.add(24);
		lv.add(28);
		lv.add(29);
		//System.out.println(lv);
		
		
		System.out.println(Collections.max(lv));
		
		Collections.reverse(lv);
		
		System.out.println(lv);
		
		//System.out.println(Collections.);
		//Collections.max(lv);
		
	}

}
