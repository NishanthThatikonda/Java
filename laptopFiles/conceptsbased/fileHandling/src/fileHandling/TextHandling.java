package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextHandling {

	public static void main(String[] args) throws IOException {
File fis=new File("E:\\JAVA TEST.txt");

fis.createNewFile();
FileInputStream file = new FileInputStream(fis);
int ascii;
while((ascii=file.read()) !=-1){
	
System.out.print((char)ascii);
}
	}

}
