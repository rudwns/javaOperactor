package variable;

import java.util.Scanner;

public class InputTotal {

	public static void main(String[] args) {
		 //선언부,초기화 영역
		 Scanner scanner = new Scanner(System.in);
		 int kor =0, eng =0, math =0, total =0; //디폴트 값 선어 : 지역변수 초기화
		// int kor, eng, math, total; //인트선스 변수 선언법
		 
		 //연산부
		 System.out.println("국어 점수를 입력하세요");
		 kor = scanner.nextInt();
		 System.out.println("영어 점수를 입력하세요");
		 eng = scanner.nextInt();
		 System.out.println("수학 점수를 입력하세요");
		 math = scanner.nextInt();
		 	 

		 //결과값 리턴
		 total = kor + eng + math;
		 System.out.println("총점 : "+total);
		 
		 

	}

}
