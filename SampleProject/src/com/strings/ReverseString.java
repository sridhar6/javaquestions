/**
 * Class Name: ReverseString
 * Description: Program to reverse a string without using any in-built function
 */

package strings;

public class ReverseString {
	/**
	 * Method Description: Reversing the String without using any in-built function
	 * @param inputString
	 * @return resultString
	 * 
	 * Logic: Reading the inputString from last character and assigning it to resultString variable.
	 */
	public String reversingString(String inputString){
		String resultString="";
		for(int i=inputString.length()-1;i>=0;--i){
			resultString+= inputString.charAt(i);
		}
		return resultString;
	}
	
	/**
	 * Main method to test the class
	 */
	public static void main(String args[]){
		ReverseString testObj = new ReverseString();
		String inputString = "Hello World!!!";
		System.out.println("The string before reversing : "+inputString);
		String reversedString = testObj.reversingString(inputString);
		System.out.println("Reversed string without using any in-built function : "+reversedString);
	}
}
