package com.bh.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	//DTO : Data Transfer Object
	//DAO : Data Access Object
	//file data에 접근
		
//1. getlist
//	 studentData 파일의 내용을 읽어서 작업
	
	public ArrayList<StudentDTO> getList() throws Exception{
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("D:\\ssb\\study", "StudentData.txt");
	
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		boolean check = true;
		
		//첫줄 공백 제거
		br.readLine();
		
		while(check) {
			String data = br.readLine();
			if(data == null) {
				break;
			}//if

			StringTokenizer st = new StringTokenizer(data, ",");
			while(st.hasMoreElements()) {
				StudentDTO dto = new StudentDTO();
				dto.setName(st.nextToken());
				dto.setNum(Integer.parseInt(st.nextToken()));
				dto.setKor(Integer.parseInt(st.nextToken()));
				dto.setEng(Integer.parseInt(st.nextToken()));
				dto.setMath(Integer.parseInt(st.nextToken()));
				ar.add(dto);
			}//while
		}//while
		return ar;
	}
//==========================================================
//2. setList
		//예외처리는 내부에서 처리 (try)
		//List로 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생한 경우
	public int setList(ArrayList<StudentDTO> ar) {
		
		File file = new File("D:\\ssb\\study", "studnetData.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("\r \n");
			for(StudentDTO studentDTO:ar) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(studentDTO.getName());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getNum());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getKor());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getEng());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getMath());
				stringBuffer.append(",");
			}
			
		}
		
		
		
		
	}
	
}
