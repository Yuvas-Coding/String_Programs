package StringPrograms;

import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		int count=countNumberOfWords(s);
		System.out.println("number of words in string= "+ count);
		
	}

	private static int countNumberOfWords(String s) {
		// TODO Auto-generated method stub
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
}
