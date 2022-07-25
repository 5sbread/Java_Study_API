package com.bh.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service {
	
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
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub

	}

}
