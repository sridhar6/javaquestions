package file;

import java.io.File;
import java.util.Scanner;
/**
 * Class Name : ListFiles
 * Description : Program to show list of all file names in a folder
 */
public class ListFiles {
	/**
	 * Description: Method to show list of file names in the folder
	 * @param folderName
	 */
	public void showAllFileNames(String folderName){
		File folder = new File(folderName);
		//Listing all files in an array
		File[] fileList = folder.listFiles();
		if (fileList.length != 0) {
			System.out.println("List of files:::");
			for (File file : fileList) {
				//Displaying every file name
				System.out.println(file.getName());
			}
		} else {
			//When there is no files in the folder
			System.out.println("No files found in the folder");
		}
		
	}
	
	
	/**
	 * Main function to test the program
	 * @param args
	 */
	public static void main(String[] args){
		ListFiles testObj = new ListFiles();
		System.out.println("Please enter the folder path");
		
		//Using Scanner object getting the path of the file
		Scanner filepath = new Scanner(System.in);
		//Reading the file path
		String fileName=filepath.nextLine();
		testObj.showAllFileNames(fileName);
		filepath.close();
	}
}
