package com.bmpl.game.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {
	
	
	public static void fileCopy() throws IOException{
		final int EOF  = -1;
		String path = "/Users/amit/Documents/songs/E.mp3";
		File file =new File(path);
		if(!file.exists()){
			System.out.println("File Can't Be Read, File Not Exist");
			return ;
		}
		System.out.println("Copy Start...");
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs,10000);
		FileOutputStream fs2 = new FileOutputStream("/Users/amit/Documents/songs/copye.mp3");
		BufferedOutputStream bs2 = new BufferedOutputStream(fs2,10000);
		int singleByte = bs.read();
		while(singleByte!=EOF){
			bs2.write(singleByte);
			singleByte = bs.read();
		}
		bs2.close();
		bs.close();
		fs.close();
		fs2.close();
		System.out.println("Copy Done...");
		
	}
	
	public static void readFile() throws IOException{
		final int EOF  = -1;
		String path = "/Users/amit/Documents/JavaBatch1130WS/ExceptionAndFilehandling/src/com/bmpl/game/demo/FileOperations.java";
		File file =new File(path);
		if(!file.exists()){
			System.out.println("File Can't Be Read, File Not Exist");
			return ;
		}
		FileInputStream fs = new FileInputStream(file);
		int singleByte = fs.read();
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		fs.close(); 
		
	}
	
	public static void writeFile() throws IOException{
		
		try(FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileOutput/Sample.txt",true)){
			String data = "Hello this is a sample data in a file..";
			fs.write(data.getBytes());
			System.out.println("Data Store....");
		}
		
		
		//   c:\\abcd\xyz.txt
		/*FileOutputStream fs  = null;
		try{
			fs = new FileOutputStream("/Users/amit/Documents/FileOutput/Sample.txt");
		String data = "Hello this is a sample data in a file..";
		fs.write(data.getBytes());
		}
		finally{
		if(fs!=null){	
		fs.close();
		}
		}*/
	}
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		fileCopy();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		//readFile();
		//writeFile();
	}

}
