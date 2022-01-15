package com.assignment.day4;


import java.util.ArrayList;

public class GetMaxService_Refactor1 {

	public <E> E getMax(ArrayList<E> list) {
			
			E max = null ;
			Integer len= 0;
			//initialize
			if(list.get(0) instanceof Integer) {
				max=(E) Integer.valueOf(0);
			}else if(list.get(0) instanceof String){
				len= 0;
				max =(E) "";
			}else if(list.get(0) instanceof Float){
				max =(E) Float.valueOf(0);
			}
			
			for (E var : list) {
				if(var instanceof Integer) {
					if(((Integer) var).compareTo((Integer) max) > 0) {
						max=var;
					}
				}else if(var instanceof String) {
					len = ((String) var).length();
					
					if(len.compareTo(((String) max).length()) > 0) {
						max=var;
					}
				}else if(var instanceof Float) {
					if(((Float) var).compareTo((Float) max) > 0) {
						max=var;
					}
				}
			}
			
			return max;
		}


}
