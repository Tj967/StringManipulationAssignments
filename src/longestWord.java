
public class longestWord {

	public static void main(String[] args) {
		String input="This is java String program";
		int longestLength=0;
		String longestWord="";
		String[] words=input.split(" ");
		
		for(int i=0; i<words.length;i++) {
			if(words[i].length()>longestLength) {
				longestLength=words[i].length();
				longestWord=words[i];
			}
		}
		
		System.out.println(longestWord);

	}

}
