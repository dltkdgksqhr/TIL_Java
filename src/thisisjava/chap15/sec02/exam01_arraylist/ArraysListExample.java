package thisisjava.chap15.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysListExample {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("홍길동","신용권","감자바");
	
	for(String name:list) {
		System.out.println(name);
	}
	
	List<Integer> list2 = Arrays.asList(1,2,3);
	for(int value: list2) {
		System.out.println(value);
	}
	

	}

}
