package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreationOfFile {

	public static void main(String[] args) throws IOException {
File f=new File("./resume.txt"); 

System.out.println(f.createNewFile());
//System.out.println(f.exists());
//System.out.println(f.delete());
//System.out.println(f.createNewFile());
System.out.println(f.isHidden());
System.out.println(f.canWrite());
System.out.println(f.canRead());
//setWrite can be used to untick from the read only.and we wroted true to set write option.
f.setWritable(true); 
System.out.println(f.canWrite());
	}

}
