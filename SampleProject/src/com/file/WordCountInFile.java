package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Name :  WordCountInFile
 * Description : Program to count words in a file
 *
 */
public class WordCountInFile {

	/**
	 * Description : Method to count the number of words in the file
	 * @param fileName
	 */
	public void countWords(String fileName){
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
					//Counting words excluding white spaces
					if(!words[i].equals(""))
						wordCount++;
				}
			}
			
			System.out.println("Word count is :"+wordCount);
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
		WordCountInFile testObj = new WordCountInFile();
		System.out.println("Please enter the filePath");
		
		//Using Scanner object getting the path of the file
		Scanner filepath = new Scanner(System.in);
		//Reading the file path
		String fileName=filepath.nextLine();
		testObj.countWords(fileName);
		filepath.close();
	}
}
