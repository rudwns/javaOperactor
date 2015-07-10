package condition;

import java.util.Scanner;

/*
  @ Date : 2015.07.10
  @ Author :me
  @ Story : switch 예제(남성 판별)
 */
public class ManOrWoman {

	public void ssn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예800101-2123456)");
		String ssn=scan.next();
		String msg = "";
		/*
		  charAt(n) 이메소드는 0 부터 시작하여
		  n 번쨰 글자 하나만 출력하는데, 출력결괄르 프로그래밍 에서는
		  리턴값 이라고 한다. 
		  위 예 같은 상황에서는 리턴값이 2가 된다.
		 */
		char ch = ssn.charAt(7);
		/* 문제
		 ssn 의 체계
		 1,3 번 남자
		 2,4 번 여자
		 5번 외국인
		 잘못 입력한 값입니다.
		 
		 */
		switch (ch) {
		case '1':	case '3': msg="남자"; break;
		case '2': case '4': msg="여자"; break;
		case '5': msg="외국인"; break;
		case '6' : case '7': case '8': case '9': msg="잘못된경우입니다.";

		default: break;
		}
		System.out.println("입력하신 ssn은 "+msg+"입니다.");
		

	}

}
