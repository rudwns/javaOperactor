package condition;
/*
@ Date : 2015.07.10
@ Author :me
@ Story : switch 를 사용한 문
*/
import java.util.Scanner;

public class SwitchAvg {

	public void calc() {
		//선언부
		String name = "",msg="";
		// 점수는 연산을 해야 되서 int 타입으로 정해져야한다.
		int kor=0, eng=0,math=0,sum=0,avg=0,flag=0;
		Scanner scanner= new Scanner(System.in);
		
		
		//연산부
		System.out.println("이름 : ");
		name =scanner.next();
		System.out.println("국어 : ");
		kor = scanner.nextInt();
		System.out.println("영어 : ");
		eng = scanner.nextInt();
		System.out.println("수학 : ");
		math = scanner.nextInt();
		sum = kor+eng+math;
		avg = (int)sum/3;//다운캐스팅 . 소수점 이하 버림
		
		// 아래 부분을 switch-case 로전환
		flag = avg/10;
		
		switch (avg/10) {
		case 10:case 9: msg="장학생"; break;
		case 8:case 7: msg="합격"; break;
		default:msg="불합격";
			break;
		}
		//출력부
		System.out.println("학생		국어		영어		수학		총점		평균		합격여부");
		System.out.println("-------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);
		 

	}

}
