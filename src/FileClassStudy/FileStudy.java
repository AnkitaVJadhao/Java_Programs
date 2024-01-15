package FileClassStudy;

import java.io.File;
import java.io.IOException;

public class FileStudy {

	public static void main(String[] args) throws IOException
	{
		File f1=new File("C:\\Users\\Ankita\\eclipse-workspace\\JavaProject\\src\\FileStudy1\\Webelements.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		

	}

}
