package file;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Class Name: InputFromConsole
 * Description: Program that takes input from user dynamically using below classes.
 * 			 	Scanner: Use this class to input 2 integer numbers and sum them.
 *			    BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
 * 				DatainputStream: Use this class to input 2 integer numbers and multiply them.
 *				Console: Use this class to input 2 integer numbers and divide them.
 */
public class InputFromConsole {

	/**
	 * Description: Using Scanner class, getting 2 integer from console and adding it
	 */
	public void scannerMethod(){
		//Creating Scanner object
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Using Scanner");
		System.out.println("Enter the first number and press the Enter: ");
		//Assigning the first number to an int variable
		int firstInt = scanObj.nextInt();
		
		System.out.println("Enter the second number and press the Enter: ");
		//Assigning the second number to an int variable
		int secondInt = scanObj.nextInt();
		
		System.out.println("Addition of the two numbers :"+(firstInt+secondInt));
		
		//Closing the Scanner object
		//scanObj.close();
	}
	
	/**
	 * Description: Using BufferedReader and InputStreamReader classes, getting 
	 * 				2 integer from console and subtract them.
	 */
	public void readerMethod(){
		
		try{
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader buffReader = new BufferedReader(isReader);

		System.out.println("Using BufferedReader and InputStreamReader ");
		System.out.println("Enter the first number and press the Enter: ");
		
		//Assigning the first number to an int variable
		int firstInt = Integer.parseInt(buffReader.readLine());
		
		System.out.println("Enter the second number and press the Enter: ");
		
		//Assigning the second number to an int variable
		int secondInt = Integer.parseInt(buffReader.readLine());
		
		System.out.println("Subtraction of the two numbers :"+(firstInt-secondInt));
		}catch(IOException ex){
			System.out.println("Exception occurred"+ex.getMessage());
		}catch(Exception ex){
			System.out.println("Exception Occurred"+ex.getMessage());
		}
	}
	
	/**
	 * Description : Using DataInputStrem classes, getting 
	 * 				2 integer from console and multiply them.
	 */
	public void dataInputStreamMethod(){
		try{
			DataInputStream dIStream = new DataInputStream(System.in);

			System.out.println("Using DataInputStream ");
			System.out.println("Enter the first number and press the Enter: ");
			
			//Assigning the first number to an int variable
			int firstInt = Integer.parseInt(dIStream.readLine());
			
			System.out.println("Enter the second number and press the Enter: ");
			
			//Assigning the second number to an int variable
			int secondInt = Integer.parseInt(dIStream.readLine());
			
			System.out.println("Multiplication of the two numbers :"+(firstInt*secondInt));
			}catch(Exception ex){
				System.out.println("Exception Occurred"+ex.getMessage());
			}
	}
	
	/**
	 * Description : Using Console classes, getting 
	 * 				2 integer from console and multiply them.
	 * 
	 * Note: This method will not work in eclipse, due to bug in eclipse
	 */
	public void consoleMethod(){
		//Creating console object
		Console consoleObj = System.console();
		if(consoleObj == null){
			System.out.println("No console");
			System.exit(0);
		}
		
			System.out.println("Using Console ");
			System.out.println("Enter the first number and press the Enter: ");
			
			//Assigning the first number to an int variable
			int firstInt = Integer.parseInt(consoleObj.readLine());
			
			System.out.println("Enter the second number and press the Enter: ");
			
			//Assigning the second number to an int variable
			int secondInt = Integer.parseInt(consoleObj.readLine());
			
			System.out.println("Division of the two numbers :"+(firstInt/secondInt));
		
	}
	public static void main(String[] args) {

		InputFromConsole testObj = new InputFromConsole();
		testObj.scannerMethod();
		testObj.readerMethod();
		testObj.dataInputStreamMethod();
		testObj.consoleMethod();
	}

}
