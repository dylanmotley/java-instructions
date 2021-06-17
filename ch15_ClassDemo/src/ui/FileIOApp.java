package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {

		String dirString = "c:/temp/subfolder2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("Directory Created!");
		}
		
		String fileString = "items.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("File Created!");
		}
		
		fileString = "test-file.txt";
		filePath = Paths.get(fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("Relative Path File Created!");
		}
		
		System.out.println("File name:      "+filePath.getFileName());
		System.out.println("Absolute Path:      "+filePath.toAbsolutePath());
		System.out.println("Is writeable:      "+Files.isWritable(filePath));


		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: "+dirPath.toAbsolutePath());
			System.out.println("Files: ");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("      "+p.getFileName());
				}
			}
		}
		
	}
	

}
