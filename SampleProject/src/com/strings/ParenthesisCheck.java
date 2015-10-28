package strings;

import java.util.Stack;

/**
 * Class Name: ParenthesisCheck 
 * Description: Program to check if a given string
 * 				of parenthesis has balanced parenthesis or not.For example a string as "(())"
 * 				is a valid string where as strings like ")(" or "(()))" are not valid strings.
 */

public class ParenthesisCheck {

	//Final variables 
	private static final char LEFT_PARENTHESIS = '(';
	private static final char RIGHT_PARENTHESIS = ')';

	/**
	 * Description: Method to check the balanced parenthesis using stack
	 * @param inputString
	 * @return boolean
	 * 
	 * 			Logic: Pushing object in the stackObj (java.util.Stack Object)
	 * 					if there is left parenthesis in the inputString
	 * 					 else popping up the object from the stackObj.
	 * 
	 * 					If the parenthesis is balanced, the stackObj.isEmpty() is true,
	 * 					else if there is unbalanced the function will return false.
	 */
	public boolean checkBalance(String inputString) {
		Stack<Character> stackObj = new Stack<Character>(); //Creating stack object
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == LEFT_PARENTHESIS) {
				//Pushing the object
				stackObj.push(LEFT_PARENTHESIS);
			} else if (inputString.charAt(i) == RIGHT_PARENTHESIS) {
				if (stackObj.isEmpty()) {
					//If inputString doesnot have any right parenthesis, then the string is not balanced

					return false;
				}
				if (stackObj.pop() != LEFT_PARENTHESIS) {
					//If the inputString doesnot have any equivalent right parenthesis, then the string is not balanced
					return false;
				}
			}
		}
		return stackObj.isEmpty();

	}

	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String[] args) {
		ParenthesisCheck testObj = new ParenthesisCheck();
		String inputString = "(())";
		if (testObj.checkBalance(inputString)) {
			System.out.println("The parenthesis are balanced.");
		} else {
			System.out.println("The parenthesis are not balanced");
		}

	}

}
