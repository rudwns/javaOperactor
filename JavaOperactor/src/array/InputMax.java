package array;

import java.util.Scanner;

/*
@ Date : 2015.07.13
@ Author :me
@ Story : int 형 배열에서 입력값 중 최대값 구하기
*/
public class InputMax {
	public static void main(String[] args) {
		
	 
		//선언부
		System.out.println("3 개의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int max =0; // 최대값을 담을 임의의 변수
		//연산부
		for (int i = 0; i < args.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
		
		}
		System.out.println("최대값 : " + max);
		
	
		// 배열 선언 및 초기화
		// for-loop 으로 입력
		// 비교로직은 if 문을 사용
	}

}
