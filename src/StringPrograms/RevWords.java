package StringPrograms;

public class RevWords {
	public static void main(String[] args) {
		String str="welcome to vtalent";
		
		String splitArray[]=str.split(" ");//space...
		for(int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
		}
	}
}
		