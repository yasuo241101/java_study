package java_study_1203;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//1. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요
		//1부터 100까지의 범위 => for(반복문)
		//반복문 종류 1. for, 2. while, 3. do-while(본 적 없음)
		
		for(int i=1; i<=100; i++) {
			// % : 나머지 값 구하기
			// == : 비교연산자
			//코드가 한줄일 때 중괄호 생략가능
			if(i % 2 == 0) System.out.println("짝수는 : " + i);
		}
		
		//2. 1부터 10까지의 합을 구하시오
		//1+2+3./......+10=55
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//+=복합연산자 => sum = sum + i
			sum += i;
		}
		System.out.println(sum);
		
		//3. 배열, apple이 총 몇개인지 출력하기
//		String[] array = {"apple","apple","apple","banana"};
//		int count = 0;
//		for(String i : array) { //for-each
//			if(i.equals("apple")) {
//				count += 1;
//			}			
//		}
		
		
		
		//옷가게 문제
//		System.out.println(count);
//		
//		System.out.print("금액을 입력하세요 : ");
//		int price = scan.nextInt();
//		
//		if(price >= 100000 && price < 300000) {
//			int 할인5 = (int) (price * 0.95); 
// 			System.out.println("5% 할인해서" + 할인5 + "입니다.");
//		}else if(price >= 300000 && price < 500000) {
//			int 할인10 = (int) (price * 0.9);
//			System.out.println("10% 할인해서" + 할인10 + "입니다.");
//		}else if(price >= 500000) {
//			int 할인20 = (int) (price * 0.8);
//			System.out.println("20% 할인해서" + 할인20 + "입니다.");
//		}else {
//			System.out.println("할인 없이" + price + "입니다.");
//			
//		}
		
		
		/*
		 * [문자열 문제]
		 * 문자열 my_string에 "hello"가 주어질 때
		 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열 출력하기
		 * n에 3이 주어짐
		 */
		
		String my_string = "hello";
		
//		String[] mid = my_string.split("");
//		for(int i=0; i<6; i++) {
//			System.out.print(mid[i]);	
//			System.out.print(mid[i]);	
//			System.out.print(mid[i]);	
//		}
		
		int n = 3;
		String result = "";
		for(int i=0; i<my_string.length(); i++) {
			String word = my_string.substring(i, i+1);
			for(int j=0; j<n; j++) { //2중 for문
				//n만큼 반복
				result += word;
			}
		}
		System.out.println("결과 : " + result);
		
		
		//repeat : 특정 문자를 반복하다.
		String s = "hello";
		System.out.println(s.repeat(3));
		
		//repeat활용해서 위 문제 다시 풀어보기
		String[] strArray = my_string.split("");
		String result2 = "";
		for(String i : strArray) {
			result2 += i.repeat(n); //repeat 활용
		}
		System.out.println(result2);
		
		//[배열] 짝수, 홀수 개수 구하기
		//정수형 배열 num_list가 주어질 때 num_list 의 원소 중 짝수와 홀수의 개수를
		//담은 정수형 배열 answer_list를 완성하기
		int[] num_list = {1, 3, 5, 7};
		int[] answer_list = new int[2];
		
		/*
		 * 결과
		 * [0, 4] 즉, 0번째 인덱스엔 짝수, 1번째 인덱스엔 홀수 개수가 옴 
		 */
		
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				answer_list[0] += 1;
			}else {
				answer_list[1] += 1;
			}
		}
		System.out.println(answer_list[0] +","+answer_list[1]);
		
		int 짝수카운트 = 0;
		int 홀수카운트 = 0;
		for(int i : num_list) { //for-each
			if(i % 2 == 0) { //짝수?
				++짝수카운트;
				answer_list[0] = 짝수카운트; //0번째 인덱스(순서)에 값 대입
			}else { //홀수?
				++홀수카운트;
				answer_list[1] = 홀수카운트; //1번째 인덱스(순서)에 값 대입
			}
		}
		
		int ns = 21;
		int ks = 31;
		int hal = ns / 10;
		
		double prices = ns * 12000 + (ks-hal) * 2000;
		
		System.out.println(prices);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
