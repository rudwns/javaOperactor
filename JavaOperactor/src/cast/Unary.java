package cast;
/*
 * @ Date : 2015.07.08
 * @ Author : me 
 * @ Story : 단항 연산자 문법
 */
public class Unary {

	public static void main(String[] args) {
		/*
		 * 단항 연산자
		 * i++(후위연산자) 또는 ++i(전위연산자)
		 */
		int i =5, j=0, x=5, y=0; //지역변수는 디폴트값으로 초기화
		
		j= i++;
		System.out.println("j=\t"+j);
		// 전위형은 x 의 값을 증가시키고 연산한다 전위형을 많이쓴다
		//i = i+1;
		y = ++x;
		System.out.println("y=\t"+y);
		//후위형은 x 의 값에 +1을 하고넣어준다   
	}

}
