package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import util.MyFileHandler;

public class Initializer {

	private static boolean LOOPER = true;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		MyFileHandler handler = new MyFileHandler();
		
		try (FileReader reader = new FileReader("filename.txt");
	             BufferedReader br = new BufferedReader(reader)) {

	            
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }

		//while (LOOPER) {
//			String homePathEnv = System.getenv("HOMEPATH");
//			System.out.println(homePathEnv);
//			String homePath = homePathEnv + "/data/in";
//			File folder = new File("homePath");
//			System.out.println(folder.getAbsolutePath());
//			System.out.println(System.getProperty("user.home") + "/data/in");
//			String currentUsersHomeDir = System.getProperty("user.home");
//			System.out.println(currentUsersHomeDir);

//			File[] listOfFiles = folder.listFiles();
//			handler.processFiles(listOfFiles);

			//Thread.sleep(7000);
		//}

	}

}
