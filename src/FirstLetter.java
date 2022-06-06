
public class FirstLetter {

	public static void main(String[] args) {
		String input="Softra Services Limited";
		char[] inputAsCharArray = input.toCharArray();
		String output="";
		boolean lastCharWasSpace=true;
		
		for(char c:inputAsCharArray) {
			if(c==' ') {
				lastCharWasSpace=true;
			} else if(lastCharWasSpace) {
				output=output+c;
				lastCharWasSpace=false;
			}
		}
		System.out.println(output);
		

	}

}
