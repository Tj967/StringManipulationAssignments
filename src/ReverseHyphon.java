
public class ReverseHyphon {

	public static void main(String[] args) {
		String s="computer";
		String result="";
		int len=s.length();
		
		//reverse through the word, until reaching the first letter
		for(int i=len-1; i>0; i--) {
			result=result+s.charAt(i)+'-';
		}
		//add last char to the string outside of the loop so there isn't an extra -
		result=result+s.charAt(0);
		System.out.println(result);

	}

}
