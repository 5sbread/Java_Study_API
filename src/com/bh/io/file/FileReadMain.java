package com.bh.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bh.io.file.ex1.StudentDAO;

public class FileReadMain {

	public static void main(String[] args) throws IOException {
	
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		
		try {
			fr.read();
			fw.write();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
