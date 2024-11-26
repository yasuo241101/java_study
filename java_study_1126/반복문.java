package java_study_1126;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2중 for문(중첩 반복)
		//반복문이 다른 반복문을 내포하는 구조
		//이론적으로 2중 3중 4중 ..... n중까지 가능하나,
		//너무 많은 중첩은 프로그램 구조를 복잡하게 한다. 그래서 2중 중첩이 적당하다.
		
		
		for(int i = 0; i<3; i++) { //아우터 for문
//			System.out.println("아우터 for문");
			for(int j=0; j<3; j++) { //이너 for문
//				System.out.println("이너 for문");
			}
		}
		
		//아우터 for문이 먼저 실행 -> 이너 for문 모두 실행 -> 아우터 for문 실행
		
		//구구단 (2중 for문 이용)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j +"= " + i*j);
			}
		}
		
		//직사각형 출력(2중 for문)
		int a = 5; //가로 길이
		int b = 3; //세로 길이
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*"); //ln아님
			}
			System.out.println(); //단순공백 출력
		}
		
		/*
		 * 
		 */
		
		//지난시간 문제풀이 9번
		
		//1. 5번 돌게하기
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//10번
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
