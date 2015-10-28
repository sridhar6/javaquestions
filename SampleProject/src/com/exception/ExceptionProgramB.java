package exception;

/**
 * Class Name: ExceptionProgramB 
 * Description: Program containing a function
 * 			which is expected to throw any kind of exception say NullPointerException or
 * 			ArithmeticException etc and then handle this function in the parent function
 *			which calls this function.
 */
public class ExceptionProgramB {
	void childMethod1() throws NullPointerException {
		throw new NullPointerException();// checked exception
	}

	void parentMethod() {
		try {
			//Calling child method
			childMethod1();
			
		}
		//Handling different type of exception that child methods throws
		catch(NullPointerException npe){
			System.out.println("In NullPointerException catch block");
		}catch(ArithmeticException ae){
			System.out.println("In ArithmeticException catch block");
		} catch (Exception e) {
			System.out.println("exception handled" + e.toString());
		}
	}

	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String args[]) {
		ExceptionProgramB testObj = new ExceptionProgramB();
		testObj.parentMethod();
	}
}
