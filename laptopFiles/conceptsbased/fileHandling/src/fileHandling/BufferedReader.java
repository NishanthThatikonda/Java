package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

	public static void main(String[] args) throws IOException {
File fis=new File("E:\\JAVATEST.txt");
fis.createNewFile();
FileReader fr=new FileReader(fis);
BufferedReader br= new BufferedReader();
String line = new String() ;
while((line= br.readLine) !=null){
	System.out.println(line);
}
	}
  


}