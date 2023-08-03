package StringMethods;

public class BeginEndSpaces {
	public static void main(String[] args) {
		String s="   hi all how are you     ";
		String s1=s.trim();
		System.out.println("before trim");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println("after trim");
		System.out.println(s1);
		System.out.println(s1.length());
		}
}
