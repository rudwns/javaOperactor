package datatype;
/*
 * @Date : 2015. 07.07
 * @Author : me
 * @story : String 타입 문법
 */
public class StringDemo {

	public static void main(String[] args) {
		 char c = 'c'; 
		 //char 형은 문자 하나밖에 나오질 못한다
		 //맨 끝에 있는 ; 세미콜론 인데 구분자라고 부른다
		 // 카 데이터타입의 c 변수에 알파벳 c 값을 할당함
		 System.out.println(c);
		 String s = "abc"; 
		 System.out.println(s);
		 System.out.println("abc"+\n+c);
		 // 알파벳 하나만 출력할 경우는 char 타입을사용하고 
		 // 하나 이상 복수의 문자열을 출력할때는
		 // String  타입을 사용한다.
		 // 주의할 점은 싱글쿼터와 더블쿼터에 유의

	}

}