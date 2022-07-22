package com.bh.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> ar = null;
		
		try {
			ar = dao.getList();
			for(StudentDTO studentDTO:ar) {
				System.out.println(studentDTO.getName());
				System.out.println(studentDTO.getNum());
				System.out.println(studentDTO.getKor());
				System.out.println(studentDTO.getEng());
				System.out.println(studentDTO.getMath());
				System.out.println("==================");
			}//for
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(ar);
		
	}

}
