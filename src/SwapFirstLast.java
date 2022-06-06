
public class SwapFirstLast {

	public static void main(String[] args) {
		String input="Hello World";
		String output="";
		int len=input.length();
		
		//add last letter to result, add substring to result, add 0 to result
		output=output.concat(input.substring(len-1,len));
		output=output.concat(input.substring(1,len-1));
		output=output.concat(input.substring(0,1));
		
		System.out.println(output);
	}

}
