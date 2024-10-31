
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class FileOperations {
	static void FileCreater(String filePath) {
		try {
			File myObj = new File(filePath);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			} 
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}
	static void FileRandomWriterMethod(String filePath) {
		try{
			FileWriter writer = new FileWriter(filePath);
			for(int i = 0;i<1000 ;i++) {
				int randomNum = (int)(Math.random() * 101);
				writer.write( randomNum + ",");
			}
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	static void FileProgress(String filePath, String newFilePath) {
	    try {
	        File myObj = new File(filePath);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	        	String[] data = myReader.nextLine().split(",");
	        	FileOperations.FileCreater(newFilePath);
	        	int [] tempData = new int[1000];
	        	for(int j=0;j<1000;j++){
	        		tempData[j]=0;
	        	}
	        	String[] newData = data;
	        	int i = 0;
	        	for (String element : data) {
	        		tempData[i] = Integer.parseInt(element)*2;
	        		newData[i] =  Integer.toString(tempData[i]);
	        		i++;
	        	}
	        	FileWriterMethod(newFilePath,newData);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	static void FileWriterMethod(String filePath,String[] newData) {
		try{
			FileWriter writer = new FileWriter(filePath);
			for(String element : newData) {
				writer.write( element + ",");
			}
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
