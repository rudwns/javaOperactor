package loop;

import java.util.Scanner;

/*
@ Date : 2015.07.13
@ Author :me
@ Story : for-loop + if 결합예제
*/
public class EvenOddSum {
	/*
	 * 
	 * 입력 받은 수(1)부터 입력받은
	 * 수 (10)가지의 수 중에서
	 * 각각 짝수의 합과 홀수의 합을 
	 * 분리해서 출력하세요
	 */

	public void calc() {
		int a=0, b=0,evensum=0,oddsum=0; // 지변 초기화
		// 홀수는 if(input%2==1)
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자를 입력하세요");
		a = scan.nextInt();
		System.out.println("끝숫자를 입력하세요");
		b = scan.nextInt();
		
		for (int i = a; i <= b; i++) {
			if ((i % 2) == 0) { // a 와 b  상수 // i 인덱스 변수
				evensum += i;
			}else {
				oddsum += i;
			}
			
		}
		System.out.println(a+" 부터"+b+"까지의 정수 중에서\n"
				 + "짝수의 합은"+ evensum +"이다 \n"
				 + "홀수의 합은"+ oddsum +"이다");

	}

}
