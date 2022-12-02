package com.question2;

public class LowLetUnderscore {

	public static void main(String[] args) {
		 System.out.println(validate("Sakshi_kude"));
			System.out.println(validate("Rutuja_Kapase"));
			System.out.println(validate("Subhadra_Khanekar"));		
			System.out.println(validate("Vaishnavi_Pujari"));	
	}
	 public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
}
}