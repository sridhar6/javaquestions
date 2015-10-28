package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Class Name : CopyContentsIntoFile
 * Description : Program to copy content of file into another file
 */
public class CopyContentsIntoFile {
	/**
	 * Description : Method to copy content of file into another file
	 * @param copyFile
	 * @param destinationFile
	 */
	public void copy(String copyFile, String destinationFile){
		//Creating InputStream and OutputStream
		InputStream iStream = null;
		OutputStream oStream = null;
		try{
			//Getting the files
			File copyFrom = new File(copyFile);
			File pasteTo = new File(destinationFile);
			
			iStream = new FileInputStream(copyFrom);
			oStream = new FileOutputStream(pasteTo);
			
			byte[] buffer = new byte[1024];
			int lenght;
			
			//Writing the contents of the file in the another file
			while((lenght=iStream.read(buffer))>0){
				oStream.write(buffer, 0, lenght);
			}
			//Closing the stream
			if(iStream!=null){
				iStream.close();
			}
			if(oStream!=null){
				oStream.close();
			}
			System.out.println("Contents copied to the destination file");
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
		CopyContentsIntoFile testObj = new CopyContentsIntoFile();
		System.out.println("Please enter the filePath to copy the contents");
		
		//Using Scanner object getting the path of the file
		Scanner input = new Scanner(System.in);
		//Reading the file path
		String copyFile=input.nextLine();
		System.out.println("Please enter destination filepath to paste the contents");
		String destinationFile = input.nextLine();
		testObj.copy(copyFile,destinationFile);
		input.close();
	}
}
