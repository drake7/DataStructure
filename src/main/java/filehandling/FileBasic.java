package filehandling;

import java.nio.file.*;
//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class FileBasic {
	
	public static void main(String[] args) {
		
		FileSystem fs1 = FileSystems.getDefault();
		
		try {
			Path pathFile = Paths.get("C:\\Users\\deepa\\Downloads\\ImageTable.sql");
			System.out.println( pathFile.getFileName() );
			
			Path pathSample2 = fs1.getPath("C:\\Users\\deepa\\Downloads\\ImageTable.sql");
			
			System.out.println(pathSample2.getFileSystem());
			
			// Get Access
			// syntax: filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
			
			pathFile.getFileSystem().provider().checkAccess(pathFile,AccessMode.READ, AccessMode.EXECUTE);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
