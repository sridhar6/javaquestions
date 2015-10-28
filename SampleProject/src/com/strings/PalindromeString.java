package strings;

/**
 * ClassName: PalindromeString 
 * Description: Program to check for a palindrome string
 *
 */
public class PalindromeString {

	/**
	 * Description : Method to check whether the given string is palindrome or not
	 * 
	 * @param inputString
	 * @return boolean value
	 * 
	 *         Logic: Reversing the inputString and checking with original
	 *         string. If both are equal, then the string is palindrome.
	 */
	public boolean checkPalindrome(String inputString) {
		int lenght = inputString.length();
		String reverse = "";
		for (int i = lenght-1; i >= 0; i--) {
			reverse +=  inputString.charAt(i);
		}
		if (inputString.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String args[]) {
		PalindromeString testObj = new PalindromeString();
		String inputString = "madam";
		if (testObj.checkPalindrome(inputString)) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a plaindrome");
		}
	}
}
