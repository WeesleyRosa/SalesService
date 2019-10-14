package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import util.MyFileHandler;

public class Initializer {

	public static void main(String[] args) throws InterruptedException, IOException {
		MyFileHandler handler = new MyFileHandler();

		String directory = System.getProperty("user.home");
		String fileName = "data.dat";
		String absolutePath = directory + File.separator + fileName;
		System.out.println(absolutePath);

		// read the content from file
		try (FileReader fileReader = new FileReader(absolutePath)) {
			BufferedReader br = new BufferedReader(fileReader);
			handler.processFiles(br, absolutePath);

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

		try (FileReader fileReader = new FileReader(absolutePath)) {
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

}
