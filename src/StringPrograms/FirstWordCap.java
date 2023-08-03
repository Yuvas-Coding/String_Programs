package StringPrograms;

public class FirstWordCap {
	public static void main(String[] args) {
	    String text = "this is the first sentence. this is the second sentence. this is the third sentence.";
	    String[] sentences = text.split("(?<=\\.\\s)");

	    for (String sentence : sentences) {
	        sentence = sentence.trim();
	        if (!sentence.isEmpty()) {
	            char firstChar = Character.toUpperCase(sentence.charAt(0));
	            sentence = firstChar + sentence.substring(1);
	            System.out.println(sentence);
	        }
	    }
	}
}
