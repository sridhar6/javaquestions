package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Name : CountOccuranceInFile
 * Description : Program to search for a string in a file and 
 * 				then return the count of number of occurrences of the string
 */
public class CountOccuranceInFile {


	/**
	 * Description : Method to search for a word and counting its no.Of Occurrences
	 * @param fileName
	 */
	public void countOccurance(String fileName, String searchFor){
		try {
			//Creating the FileReader Object
			FileReader fReaderObj = new FileReader(fileName);
			BufferedReader buffReader = new BufferedReader(fReaderObj);
			String cursor;
			int wordCount=0;
			//Reading the contents of the file
			while((cursor=buffReader.readLine())!=null){
				//Splitting the individual words to count 
				String[] words = cursor.split(" ");
				for(int i=0; i<words.length; i++){
					if(words[i].equals(searchFor)){
						wordCount++;
					}
				}
			}
			if(wordCount==0){
				System.out.println(searchFor+" not found in the file");
			}else{
				System.out.println(searchFor+" occured "+ wordCount +" times");
			}
			buffReader.close();
		}catch(FileNotFoundException fne){
			//If the file is not accessible or file not in entered path,
			//this exception will be thrown
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("IOException occured");
		}
		
	}
	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String[] args){
		CountOccuranceInFile testObj = new CountOccuranceInFile();
		System.out.println("Please enter the filePath");
		
		//Using Scanner object getting the path of the file
		Scanner input = new Scanner(System.in);
		//Reading the file path
		String fileName=input.nextLine();
		System.out.println("Please enter the word to search and count occurance");
		String searchFor = input.nextLine();
		testObj.countOccurance(fileName,searchFor);
		input.close();
	}
}
