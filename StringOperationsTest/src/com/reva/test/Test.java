package com.reva.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		String dirPath = "\\Test/ *StringTest\\IBM Case Manager";
		String fileName = "test.pdf";
		
		String[] array = dirPath.split("/|\\\\");
		
		
		String path2 = getTransformedFilePath(dirPath);
		
		//Path targetDirPath = Paths.get(dirPath);
		
		//Path file = targetDirPath.resolve(fileName.replaceAll("[\\\\/:\"*?<>|]+", "_"));
		
		
		
		
		
		System.out.println(path2);

	}
	
	public static String getTransformedFilePath(String filePath) {
		String[] strArray = filePath.split("/|\\\\");
		String newPath="";
		 
		if(strArray[0].length()>0 && strArray[0].contains(":") ) {
			newPath = strArray[0];	//Drive letter
		}		
		
		for(int i=0;i<strArray.length;i++) {
			if( i==0 && newPath.length()>0) 
				continue;
			newPath = newPath + "\\" + strArray[i].replaceAll("[\\\\/:\"*?<>|]+", "_").trim();			
		}		
		
		return newPath;
	}

	
	
}
