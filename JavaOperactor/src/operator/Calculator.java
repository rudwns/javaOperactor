package operator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 /*
		  * order
		  * 스캐너로 두 값을 입력 받아서 
		  * 사칙연산 결과가 나오도록 하시오
		  * 20+7=27
		  * 20*7=140
		  */
		int x, y=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("두 수의 값을 입력하시오");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println(x
				+y);
		System.out.println(x+" + " +y+" = "+(x+y));
		System.out.println(x+" + " +y+" = "+(x-y));
		System.out.println(x+" + " +y+" = "+(x*y));
		System.out.println(x+" + " +y+" = "+(x/y));
		System.out.println(x+" + " +y+" = "+(x%y));

	}

}
