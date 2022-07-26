package com.bh.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
	Scanner sc = new Scanner(System.in);
	
	private StudentDAO studentDAO; //선언만 한 상태, 객체 생성X
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
	}
	
	@Override
	public ArrayList<StudentDTO> getlList() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<StudentDTO> ar = studentDAO.getList();
		for(StudentDTO studentDTO:ar) {
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
		}
		return ar;
	}

//--------------
	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub

		return studentDAO.setList(ar);
	}

//-------------
	@Override
	public StudentDTO getStudentDTO(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO studentDTO = null;
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		
		for(StudentDTO studentDTO2 : ar) {
			if(num == studentDTO2.getNum()) {
				studentDTO = studentDTO2;
				break;
			}
		}
		
		return studentDTO;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		System.out.println("삭제할 학생 번호 입력");
		int num = sc.nextInt();
		for(int i=0; i<ar.size(); i++) {
			if(num==ar.get(i).getNum()) {
				StudentDTO st = ar.remove(i);
				if(st != null) {
					result = 1;
				}
			}
		}
		return result;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가할 학생 이름 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		
		
	}

}
