package operator;

import java.util.Scanner;

public class CpCode {

	public static void main(String[] args) {
		//연산에 쓸 재료들을 준비하는 선언부 
		Scanner scanner = new Scanner(System.in);
		 int x=0, y=0;
		 //연산부
		 System.out.println("x값 입력 : ");
		 x = scanner.nextInt();
		 System.out.println("y값 입력 : ");
		 y= scanner.nextInt();
		 //출력영역
		 System.out.println(x+" + " +y+" = "+(x+y));

	}

}
