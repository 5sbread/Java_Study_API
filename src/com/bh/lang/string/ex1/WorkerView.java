package com.bh.lang.string.ex1;

public class WorkerView {

	//WorkerDTO를 받아서 정보 출력
	
	public void view(WorkerDTO [] workerDTOs) {
		for(WorkerDTO workerDTO:workerDTOs) {
			System.out.println("이름 : "+workerDTO.getName());
			System.out.println("부서 : "+workerDTO.getDepartment());
			System.out.println("직급 : "+workerDTO.getJob());
			System.out.println("번호 : "+workerDTO.getPhone());
		}
		
	}
}
