package java_study_1122;

import java.util.Scanner;

public class 문제정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		//문제 1~4 안해도 될듯?
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//				System.out.println(i+"는 3의 배수입니다.");
//				sum = sum + i;
//		}
//		}
//		System.out.println("3의 배수의 합은" + sum + "입니다.");
//		
		//문제 6 정답
		
		int number = 5;
		int fac = 1;
		for(int i=number; i==1; i--) { 
			fac = fac * i;
		}
		System.out.println(number+"!는"+fac+"입니다.");
		
//		//문제 7 정답
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				System.out.println("FizzBuzz");
//			}else if(i % 3 == 0) { 
//				System.out.println("Fizz");
//			}else if(i % 5 == 0) {
//				System.out.println("Buzz");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		//문제 11 정답
		
		System.out.println("세균의 마리수를 입력해주세요.");
		int n = scan.nextInt();
		System.out.println("경과한 시간을 입력해주세요.");
		int t = scan.nextInt();
		
		for(int i=t; i>=1; i--) {
			n = n * 2;
		}
		System.out.println("세균은" + n + "마리 입니다.");
		
		//문제 12 정답
		
		int repeat = 0;
		System.out.println("숫자를 입력해주세요.");
		int i = scan.nextInt();
		
		while(i > 1) {
			if(i % 2 == 0) {
				i = i / 2;
				repeat = repeat + 1;
			}else {
				i = i * 3;
				i = i + 1;
				repeat = repeat + 1;
			}
		}
		
		System.out.println(repeat +"회");
		
		
		
		
		//중괄호구분
	}

}
