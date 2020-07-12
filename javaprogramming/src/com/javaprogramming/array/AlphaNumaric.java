package com.javaprogramming.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumaric {

	public static void main(String[] args) {
	
		
		Pattern pattern=Pattern.compile("[a-zA-Z0-9]*");
		
		String str="abc@";
		
		Matcher matcher=pattern.matcher(str);
		
		if(matcher.matches()) {
			System.out.println("string '"+str + "' is alphanumeric");
		}
		else {
			 System.out.println("string '"+str + "' isn't alphanumeric");
		}

	}

}
