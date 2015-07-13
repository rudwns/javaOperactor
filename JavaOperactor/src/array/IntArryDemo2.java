package array;
/*
@ Date : 2015.07.13
@ Author :me
@ Story : int 형 배열 예제
*/
public class IntArryDemo2 {

	public static void main(String[] args) {
		 /*
		   자바 배열의 특징
		   1. 배열은 0부터 인덱스 번호가 시작 된다.
		   2. 벼열의크기 = 배열의 요소의 갯수와 같다
		   3. 벼을은 크기가 고정되어 있으며 요소를 추가할 수없다.
		   4. 배열은 한가지 타입만 지정할 수 있다. int면 int 
		  */
		int[] arr = new int[3]; // 숫자 3 은 요소의 갯수 = 배열의 크기
		arr[0] = 1; // 배열 첫번째 칸에 숫자 1을 담는다
		arr[1] = 2; // 배열 두번째 칸에 숫자 2를 담는다
		arr[2] = 3; // 배열 세번째 칸에 숫자 3을 담는다
	  //arr[3] = 4; // 이것은 지금은 에러표시를 하지않지만 
					// 작동시키면 에러가 납니다.arr3은 존재하지않는다
					// 배열에서 3은 배열의 크기이고 배열의 칸은 한계값보다 1이작다 
					// 시작이 0부터 시작하기 때문에
		for (int i = 0; i < arr.length; i++) {
			// arr 은 바로 직전에 선언한 객체[배열]이름
			// 배열객체.length 는 배열의 크기입니다.
			System.out.print((i+1) + "\t");
		}

	}

}
