
public class nLetter {

	public static void main(String[] args) {
		String input="Softra Services Limited";
		String output="";
		boolean lastCharWasSpace=true;
		int wordCount=0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==' ') {
				lastCharWasSpace=true;
				wordCount++;
			} else if(lastCharWasSpace) {
				output=output+input.charAt(i+wordCount);
				lastCharWasSpace=false;
			}
		}
		output=output.toUpperCase();
		System.out.println(output);

	}

}
