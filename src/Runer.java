
public class Runer extends FileOperations{
	public static void main(String[] args) {
		FileOperations.FileCreater("FileName1.txt");
		FileOperations.FileRandomWriterMethod("FileName1.txt");
		FileOperations.FileProgress("FileName1.txt", "FileName2.txt");
		FileOperations.FileProgress("FileName2.txt", "FileName3.txt");
		FileOperations.FileProgress("FileName3.txt", "FileName4.txt");
		FileOperations.FileProgress("FileName4.txt", "FileName5.txt");
	}
}
