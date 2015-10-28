package strings;

/**
 * Class Name: ReverseIndividualWord 
 * Description: Program to reverse each individual word in a sentence
 *
 */
public class ReverseIndividualWord {

	/**
	 * Description: Reversing each individual word in the sentence
	 * 
	 * @param inputString
	 * @return reverseWords
	 * 
	 *         Logic: Parsing each word using split function, then assigning the
	 *         words from the last of array to reverse each individual word
	 */
	public String reverseIndividual(String inputString) {
		String[] words = inputString.split(" ");
		String reverseWords = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reverseWords += words[i] + " ";
		}
		return reverseWords;
	}

	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String[] args) {

		ReverseIndividualWord testObj = new ReverseIndividualWord();
		String inputString = "Reversing each individual word";
		String resultString  = testObj.reverseIndividual(inputString);
		System.out.println("String after reversed : "+resultString);
	}

}
