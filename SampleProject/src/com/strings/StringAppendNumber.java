package strings;

/**
 * Class Name: StringAppendNumber
 * Description: Program which accepts a string
 * 				like "This is nice" and converts it to a string like "This1 is2 nice3"
 *
 */
public class StringAppendNumber {

	/**
	 * Description: Method to append number after each word
	 * 
	 * @param inputString
	 * @return appendNum
	 * 
	 *         Logic: Parsing each word using split function and appending the
	 *         numbers after each word
	 */
	public String appendNumber(String inputString) {
		String[] words = inputString.split(" ");
		String appendNum = "";
		for (int i = 0; i < words.length; i++) {
			appendNum += words[i] + (i + 1) + " ";
		}
		return appendNum;
	}

	/**
	 * Main function to test the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StringAppendNumber testObj = new StringAppendNumber();
		String inputString = "This is nice";
		String resultString = testObj.appendNumber(inputString);
		System.out
				.println("String after appending the number after each word :"
						+ resultString);
	}

}
