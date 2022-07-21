package com.bh.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//1-45 중복되지 않는 숫자 6개 Set에 담아서 출력
		
		Random random = new Random();
		
//		random.nextInt(45); //0이상 45미만
		//1을 더해서 0을 1로 취급 / 44를 45로 취급
		
		HashSet<Integer> nums = new HashSet<>();
		
		while(nums.size() != 6) { //nums.size() < 6
			int num = random.nextInt(45)+1;
			nums.add(num);
		}
		
		Iterator<Integer> iterator = nums.iterator();
		//hashSet에서 Iterator로 변경
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
