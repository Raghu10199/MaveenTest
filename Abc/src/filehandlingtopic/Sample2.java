package filehandlingtopic;

import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\LENOVO\\Desktop\\dingaa.txt");
		if(f1.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is not created");
		}
	}

}
