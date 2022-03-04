package day08;
/*
 	정수 5개를 기억할 배열을 만들고 데이터를 채워둔 후
 	1번 방에서부터 3번방까지의 데이터만 다른 배열에 깊은 복사를 해보자.
 	
 	이때 복사될 배열의 길이는 10으로 하세요.
 */

import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		//origin
		int[] ori = {10, 20, 30, 40, 50};
		
		//toCopy
		int[] copy = new int[10];
		
		//깊은 복사
		System.arraycopy(ori, 0, copy, 0, 3);
		
		//배열 내용 출력
		//ori
		System.out.println("ori : " + Arrays.toString(ori));
		//copy
		System.out.println("copy : " + Arrays.toString(copy));
	}

}
