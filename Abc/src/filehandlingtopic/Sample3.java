package filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\LENOVO\\Desktop\\jadhuu.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("Hello");
		fw.write("Java");
		fw.write("Mava");
		System.out.println("Data is written");
		fw.flush();
		
		
	}

}
