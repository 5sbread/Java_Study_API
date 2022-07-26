package com.bh.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담는 클래스
		//		 실제 파일이 없을 수도 있음
		
		File file = new File("D:\\ssb\\study\\test.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
//====================================================		
		//parent : 폴더 / Child : 파일명 또는 최종폴더명
		file = new File("D:\\ssb\\study", "test.txt");
		
		System.out.println("==============");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		
//=====================================================
		//1. 폴더명 경로가 있는 File 객체 이용
		File path = new File("D:\\ssb\\study");
		file = new File(path, "test.text");
		
		System.out.println("==============");
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		System.out.println(path.length());
		
//=====================================================
		file = new File("D:\\ssb\\study\\sub");
		if(!file.exists()) { //파일이 존재하지 않는다면
			file.mkdir();
		}
		
//=====================================================		
		file = new File("D:\\ssb\\study\\sub2\\t1");
		
		//file.mkdir(); : 중간 폴더가 없으면 생성 X
		file.mkdirs(); //없는 폴더 전부 생성
	
		file.delete(); //제일 마지막 t1만 삭제
		
		File file3 = new File("D:\\ssb\\study");
		file3.delete();
	}

}
