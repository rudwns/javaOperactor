package loop;

public class ForLoop {

	public static void main(String[] args) {
		 
		for (int i = 0;  // 지변 i 초기화 
				i < 10;  // 지변 i 의 한계값 (limit)설정 , 
				         //if 문의 컨디션과 동일 기능
				i++) {   // 1씩 증가하는 증감값
			System.out.println(); //출력
		}
		
		/*
		  for loop 의 장점
		  1. 초기화, 한계값(limit), 증감값 설정을
		        한 컨디션 내부에서 일괄 설정 하므로
		        가독성이 좋고 코딩이 빠르게 진행 된다.
		        따라서, while loop 보다 권장한다.
		            
		 */
	}

}
