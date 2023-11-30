package filehandlingtopic;

import java.io.File;

public class Sample {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\LENOVO\\Desktop\\Dhinga");
		if(f1.mkdirs())
		{
			System.out.println("Folder created");
		}
		else
		{
			System.out.println("Folder not created");
		}
		if(f1.exists())
		{
			System.out.println("Folder exists");
		}
		else
		{
			System.out.println("Folder doesnt exists");
		}
		if(f1.delete())
		{
			System.out.println("Folder is deleted");
		}
		else
		{
			System.out.println("Folder is not deleted");
		}
	}

}
