package com.bh.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		StudentService service = new StudentService();
		ArrayList<StudentDTO> ar = null;
		
		try {
			ar = dao.getList();
			for(StudentDTO studentDTO:ar) {
				System.out.println(studentDTO.getName());
				System.out.println(studentDTO.getNum());
				System.out.println(studentDTO.getKor());
				System.out.println(studentDTO.getEng());
				System.out.println(studentDTO.getMath());
				System.out.println(studentDTO.getTotal());
				System.out.println(studentDTO.getAvg());
				System.out.println("==================");
			}//for
			
		}catch(Exception e){
			e.printStackTrace();
		}

		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("Add");
		studentDTO.setNum(6);
		studentDTO.setKor(50);
		studentDTO.setEng(60);
		studentDTO.setMath(88);
		ar.add(studentDTO);
		
		try {
			int result = service.setList(ar);
			System.out.println("Resule : "+result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
