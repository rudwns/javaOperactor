package operator;

import java.util.Scanner;

public class TimeSeperator {

	public static void main(String[] args) {
		 /*
		  * 입력받은 초를 시간 분 초로 환산하는 프로그램
		  */
		//변수선언
		Scanner scanner =new Scanner(System.in);
		int second;
		
		System.out.println("구하고자 하는 시간(초) 입력 ");
		second = scanner.nextInt();
		// 입력받은 초가 500이라고 한다면 
		// 500초를 60으로 나눈 나머지가 초
		// 윗 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분
		// 윗 연산에서 나온 몫이 시간
		System.out.println("초  : "+second%60);
		System.out.println("분  : "+second/60 );
		System.out.println("시간 : "+(second/60)/60);
		
		
	}

}
