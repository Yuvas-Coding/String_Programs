package StringPrograms;

import java.util.Scanner;

public class StringSpecialChar {
	
	public static void main(String[] args) {
		
	
	String s="mani@#$$1234";
	
	//we need to count the special char so we can take count=0;
	int count=0;
	
	//convert given string to char by using to toCharArray()
	char[] ch = s.toCharArray();
	
	//take a for loop to itrate the every char
	for(int i=0;i<ch.length;i++) {
		 
		//convert char to int by using type casting.....
		 int j=(int)(ch[i]);
		 
		 //check the ascci values
		 if(!(j>=48 && j<=57) && !(j>=65 && j<=90) && !(j>=97 && j<=122) && !(j==32)) {
			 count++;
			 System.out.println(ch[i]);
		 }
	}
	if(count==0) {
		System.out.println("String has no speical characters...");
	}
	else {
		System.out.println("string has " + count + " special characters");
	}
	}
}
