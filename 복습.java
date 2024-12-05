package java_study_1205;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 사칙연산 - 거스름돈
		 */
		
		int money = 74900;
		
		
		int first = money / 50000;
		int second = (money - (50000 * first)) / 10000;
		int third = (money - (50000 * first) - (10000 * second)) / 1000;
		int fourth = (money - (50000 * first) - (10000 * second) - (1000 * third)) / 500;
		int fifth = (money - (50000 * first) - (10000 * second) - (1000 * third) - (500 * fourth)) / 100;
		
		System.out.println("5만원은 : " + first);
		System.out.println("1만원은 : " + second);		
		System.out.println("천원은 : " + third);
		System.out.println("5백원은 : " + fourth);
		System.out.println("1백원은 : " + fifth);
		
		
		/*
		 * 그리드(탐욕) 알고리즘 ex) 거스름돈
		 * => 선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫒아 최종 답에 도달하는 방법
		 * 
		 */
		
		//상수 : 변경 불가능
		//프로그래밍에서 상수 표현은 데이터타입 앞에 'final' 키워드가 온다.
		//상수를 표현할 땐 변수이름을 대문자로 적어야 합니다. (개발자 약속)
		final double PI = 3.14;
		
		/*
		 * 문제) 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요.
		 * double radius = 5.0; //원의 반지름
		 * 원의 면적은 PI * 반지름 * 반지름 입니다.
		 */
		
		double radius = 5.0;
		
		double circle_area = radius * radius * PI;
		
		/*
		 * 문제)
		 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 
		 * 변수로 주어질 때, 다른 한 변의 길이의 제곱, b를 출력하시오.
		 */
		
		int a = 3;
		int c = 5;
		int b = 0;
		
		b = (c * c) - (a * a);
		
		System.out.println("b는 : " + b + "입니다.");
		
		int[] array = {1, 3, 5}; //배열선언
		System.out.println(array[0]);
		System.out.println(array[2]);
		//맨 마지막 인덱스 출력하기
		System.out.println(array[array.length-1]);
		
		//문제 1번 인덱스 값과 2번 인덱스 값 서로 교환하기
		int temp = array[1];
		array[1] = array[2];
		array[2] = temp;
		//swap
		
		
		//배열문제가 나오면 무조건 for문
		for(int i : array) { //for-each문(배열 길이만큼 자동으로 반복)
			System.out.println("i : " + i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
