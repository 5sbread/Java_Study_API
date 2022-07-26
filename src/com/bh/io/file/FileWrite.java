package com.bh.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public void write() throws IOException {
		File file = new File("D:\\ssb\\study", "test.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("new String\r\n");
		fw.flush(); //강제로 buffer에 있는 것을 밀어냄 -> 파일 사용을 위해
		
		fw.write("오늘은 금요일\r\n우왕~!\r\n");
		//fw.flush();
		
		//\r\n 줄바꿈용
		fw.write("내일은 토요일!!!!!!!!!!!!!!!!!!!!\r\n");
		fw.flush(); //write 마지막에 flush 한번만 쓰면 됨
		
	}
}
