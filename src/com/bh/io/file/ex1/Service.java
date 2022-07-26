package com.bh.io.file.ex1;

import java.util.ArrayList;

public interface Service {
	//추상메서드만 가능
	//구현해서 오버라이딩 해야함
	
	
	public ArrayList<StudentDTO> getlList()throws Exception;
	//StudentDAO에서 getlist를 호출하고 총점과 평균을 각각
	//계산해서 대입하고 그 List를 리턴

	
	public int setList(ArrayList<StudentDTO> ar)throws Exception;
	//StudentDAO의 setList를 호출하고 
	//그 결과를 리턴
	
	
	public StudentDTO getStudentDTO(ArrayList<StudentDTO> ar)throws Exception;
	//찾으려고 하는 학생의 번호 입력 받기
	//찾은 학생을 리턴
	
	
	public int setStudentDelete(ArrayList<StudentDTO> ar)throws Exception;
	//삭제하려는 학생의 번호 입력 받음
	//일치하는 학생 삭제
	//삭제를 성공하면 1을 리턴, 실패하면 0을 리턴 
	
	public void setStudentAdd(ArrayList<StudentDTO> ar)throws Exception;
	//학생 한명 추가
	//리턴 없음
	
}
