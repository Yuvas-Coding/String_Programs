package StringPrograms;

public class WordCountLenght {
	public static void main(String... args){
		
		String s = "Hello Hello My Friend";

		String[ ] arr = s.split("\\s+");
			
		System.out.println(arr.length);
	}
}