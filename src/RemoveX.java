
public class RemoveX {

	public static void main(String[] args) {
		String str = "abcxXXcxerxxXXwer";
		String result="";
		char[] charArray=str.toCharArray();
		int xCount=0;
		
		//count lower case x's
		for(char c:charArray) {
			if(c=='x') {
				xCount++;
			}
		}
		
		//remove all lower case x's
		result = str.replace("x","");
		
		//add lower case x's to end of string
		for(int i=0;i<xCount;i++) {
			result=result+'x';
		}
		
		System.out.println(result);
	}

}
