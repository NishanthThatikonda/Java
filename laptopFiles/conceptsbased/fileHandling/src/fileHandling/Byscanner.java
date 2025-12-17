package fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Byscanner {
			public static void main(String[] args) throws IOException {
		File fis=new File("E:\\JAVA TEST.txt");
		fis.createNewFile();
		Scanner scanner=new Scanner(fis);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			
		}
	}

			}


