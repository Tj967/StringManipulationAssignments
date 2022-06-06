
public class nextCharacter {

	public static void main(String[] args) {
		String input="Softra Services Limited";
		char[] inputAsCharArray = input.toCharArray();
		String output="";
		char nextLetter;
		int letterValue=0;
		
		for(char c:inputAsCharArray) {
			//not sure how its meant to behave for z
			if(c!=' ') {
				letterValue=(int)c+1;
				nextLetter=(char)letterValue;
				output=output+nextLetter;
			} else{
				output=output+c;
			}
			
		}
		System.out.println(output);

	}

}
