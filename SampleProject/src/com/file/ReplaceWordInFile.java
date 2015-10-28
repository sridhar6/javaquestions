package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Name : ReplaceWordInFile
 * Description : Program to to search for a string in a file and 
 * 					then replace it with another string
 */
public class ReplaceWordInFile {

	/**
	 * Description : Method to search for a string in a file and 
	 * 					then replace it with another string
	 * @param fileName
	 */
	public void ReplaceWord(String fileName, String searchFor, String replaceWith){
		try {
			//Creating the FileReader Object
			FileReader fReaderObj = new FileReader(fileName);
			BufferedReader buffReader = new BufferedReader(fReaderObj);
			String cursor;
			int wordCount=0;
			String newContents = "";
			//Reading the contents of the file
			while((cursor=buffReader.readLine())!=null){
				//Splitting the individual words to count 
				String[] words = cursor.split(" ");
				for(int i=0; i<words.length; i++){
					if(words[i].equals(searchFor)){
						wordCount++;
					}
				}
				//Creating the new content after replacing the search word
				newContents += cursor.replace(searchFor, replaceWith);
			}
			if(wordCount>=1){
				//Writing the new content in the file
				FileWriter writer = new FileWriter(fileName);
				writer.write(newContents);
				writer.close();
				//Reading the contents of the file
				FileReader fReaderObj2 = new FileReader(fileName);
				BufferedReader buffReader2 =new BufferedReader(fReaderObj2);
				
				System.out.println("Contents of the file after replace");
				System.out.println(buffReader2.readLine());
				buffReader2.close();
			}
			 if(wordCount==0){
				System.out.println(searchFor+" not found in the file");
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
		ReplaceWordInFile testObj = new ReplaceWordInFile();
		System.out.println("Please enter the filePath");
		
		//Using Scanner object getting the path of the file
		Scanner input = new Scanner(System.in);
		//Reading the file path
		String fileName=input.nextLine();
		System.out.println("Please enter the word to search for");
		String searchFor = input.nextLine();
		
		System.out.println("Please enter the word to replace "+searchFor);
		String replaceWith = input.nextLine();
		testObj.ReplaceWord(fileName, searchFor, replaceWith);
		
		input.close();
	}

}
