package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//스캐너 (키보드로 입력받기)
		
		//문제 1 정답
		System.out.println(12000);
		
		//문제 2 정답
		System.out.println(170);
		
		//문제 3 정답
		System.out.println(true);
		
		//문제 4 정답
		System.out.println(false);
		
		//문제 5 정답
		
		int a = 10;
		int b = 5;
		
		int ans5 = a * b;
		
		System.out.println("a와 b의 곱은 : " +ans5);
		
		//문제 6 정답
		System.out.println(false);
		
		//문제 7 정답
		final double PI = 3.14;
		double radius = 5.0; //원의 반지름
		double circle_area = PI * radius * radius;
		System.out.println("원의 면적은 : " + circle_area);
		
		
		//문제 8 정답
		double weight = 70.5;
		double height = 1.77;
		double bmi = weight / (height*height); //체질량 지수 공식
		System.out.println("bmi : " + bmi);
		
		//문제 9 정답
		System.out.println("3번");
		
		//문제 10 정답
		int age = 32;
		int year = 2024;
		int result = age + year - 2000 + 1; 
		
		System.out.println("출생 연도는 : " + result);
		
		//문제 11 정답
		
		int obak = 500; //500원
		int bak = 100; //100원
		System.out.print("거스름돈을 입력하세요 : ");
		int g = scan.nextInt(); //정수형 입력받기
		
		int don1 = g / obak;
		int yeonsan1 = g % obak;
		
		int don2 = yeonsan1 / bak;
	
		System.out.println("500원 : " +don1+ "개");
		System.out.println("100원 : " +don2+ "개");
		
	}

}
