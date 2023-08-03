package StringPrograms;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter  the string: ");
		String s=sc.nextLine();*/
		
		
		
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("is pal");
		}
		else {
			System.out.println(" not pal");
		}
		
	}
}