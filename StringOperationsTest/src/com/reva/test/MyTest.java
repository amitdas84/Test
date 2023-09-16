package com.reva.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyTest {

	public static void main(String[] args) {
		String sourcePath = "/IBM Case Manager/Datasets/DevEnvReinitInfo/dev_env_connection_definition";
		String targetFolderPath = "C:\\Temp\\StringTest";

		String destPath = targetFolderPath + sourcePath;
		
		int temp = 0;

		System.out.println(temp++);

//		// Create Target Folder
//		try {
//			Files.createDirectories(Paths.get(destPath));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		File file = new File("C:\\Temp\\test.pdf");

		try {
			InputStream in = new FileInputStream(file);
			Path dir = Files.createDirectories(Paths.get(destPath));
			
			
			
			Files.copy(in,dir.resolve("test.pdf"));
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
