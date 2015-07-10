package condition;

public class Onlyif {

	public static void main(String[] args) {
		 int x = 1, y= 2; //지변 초기화
		 if ((x==1) && (y==1)) { // && 엔퍼센트라고 읽고 and 연산자
			 System.out.println("x 는 1 이면서, y도 2이다");
			
		}
		 if ((x==1) || (y==1)  ) {// || 는 컬럼 이라고 읽고 or 연산자
			System.out.println("x 는 1 이거나, y는 2이다");
		}
	}

}
