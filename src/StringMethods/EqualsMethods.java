package StringMethods;

public class EqualsMethods {
	public static void main(String[] args) {
		String s1=new String("manikanta");
		String s="MANIKANTA";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}
