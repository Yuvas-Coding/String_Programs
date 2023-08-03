package StringPrograms;

import java.util.Scanner;

public class SwapCorner_RevMiddle {
	

	public static  String revString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev.trim()+" ";
		
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		
		
		String rev="";
		String [] sb=s.split(" ");//{"hello","This","is","teja"}
		
		for(int i=sb.length-1;i>=0;i--) {
			if(i==0 || i==sb.length-1) {
				rev=rev+sb[i]+" ";
			}
			else {
				  rev=rev+revString(sb[i]);				
				}
			}
			System.out.println("required string is: "+ rev.trim()+" ");
		}
}