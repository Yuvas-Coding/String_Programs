package StringPrograms;

import java.util.Arrays;

public class AnagramOrnot {
	public static void main(String[ ] args){

		String s1 = "won" ;
		String s2 = "now";

		if ( s1.length ( ) != s2.length () ){
				System.out.println("Given Strings are not anagrams");
				return ;
		}

		char a[ ] = s1.toCharArray ( );

		char b[ ] = s2.toCharArray ( ) ;

		Arrays.sort ( a );
		Arrays.sort ( b );

		boolean flag = Arrays.equals(a, b);
		if( flag  ){
			System.out.println(s1+ " and "+s2+" Given strings are anagrams");
		}else{
			System.out.println(s1+" and "+s2+" Given Strings are not anagrams");
		}
	}
	
}