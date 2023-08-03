package StringPrograms;

public class SingleTimesPresent {
	public static void main(String[] args) {
		String s="manikanta";
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(ch==s.charAt(i)) {
				count++;
				}
			}
			if(count==0) {
				System.out.println(ch+" is present "+count+" times");
			}
		}
		
		
	}
}
