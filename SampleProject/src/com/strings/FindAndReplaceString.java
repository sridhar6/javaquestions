package strings;
/**
 * Class Name: FindAndReplaceString
 * Description: Program to find a substring in a given string and then replace it with another string
 *
 */
public class FindAndReplaceString {

	/**
	 * Description : Finding the substring in the inputString and replacing it with replaceWith String
	 * @param inputString
	 * @param subString
	 * @param replaceWith
	 * @return resultString
	 * 
	 * Logic: Finding the substring using contains function
	 * 	if the substring not found, prompting the message "String doesnot contains substring"
	 * 	else the substring is replaced with replaceWith string using replaceAll function
	 */
	public String findAndReplace(String inputString, String subString, String replaceWith){
		String resultString = "";
		boolean containsSubString = inputString.contains(subString);
		if(!containsSubString){
			System.out.println("String doesnot contains substring");
		}else{
			resultString = inputString.replaceAll(subString,replaceWith);
		}
		return resultString;
	}
	
	/**
	 * 
	 * Main method to test the program
	 */
	public static void main(String[] args) {

		FindAndReplaceString testObj = new FindAndReplaceString();
		String inputString = "Hello World";
		String subString = "World";
		String replaceWith = "My World";
		String replacedString = testObj.findAndReplace(inputString, subString, replaceWith);
		
		if(replacedString!=""){
			System.out.println("Found and Replaced the sub string : "+replacedString);
		}
	}

}
