package java_study_1114;

import java.util.Scanner;

public class javaExam {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //데이터를 입력받을 때 사용
		
		//문제 1번 정답
		int age = 25;
		System.out.println(age);
		
		//문제 2번 정답
		System.out.println("상수");
		
		//문제 3번 정답
		System.out.println("Hello, Java!");
		
		//문제 4번 정답
		System.out.print(" 첫 번째 정수 a를 입력해주세요 : ");
		int a = scan.nextInt();
		System.out.print(" 두 번째 정수 b를 입력해주세요 : ");
		int b = scan.nextInt();
		
		int sum = a + b;
		System.out.print(" 두 정수의 합은 : " + sum);
		
		//문제 5번 정답
		
		double height = 180.7;
		System.out.print(height);
				
		//문제 6번 정답
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력해주세요 : ");
		int age2 = scan.nextInt();
		System.out.print("안녕하세요, "+ name +"님! 당신은 "+age2+"살입니다.");
		
		//문제 7번 정답
		
		int dab71 = 7;
		double dab72 = 7.7;
		char dab73 = 'c';
		boolean dab74 = true;
		
		//문제 8번 정답
		
		System.out.print("첫 번째 정수 a1를 입력해주세요 : ");
		int a1 = scan.nextInt();
		System.out.print("두 번째 정수 b1를 입력해주세요 : ");
		int b1 = scan.nextInt();
		
		int sum5 = a1 + b1;
		System.out.println(sum5);
		
		//문제 9번 정답
		
		String x = "10";
		int y = Integer.parseInt(x);
		
		//문제 10번 정답
		
		System.out.println("3번");
		
		//문제 11번 정답
		
		System.out.print("첫 번째 정수 h1을 입력해주세요 : ");
		int h1 = scan.nextInt();
		System.out.print("두 번째 정수 h2를 입력해주세요 : ");
		int h2 = scan.nextInt();
		System.out.print("세 번째 정수 h3을 입력해주세요 : ");
		int h3 = scan.nextInt();
		
		int hab = h1 + h2 + h3;
		int avg = hab / 3;
		System.out.println("한 줄로 작성도 가능");
		
		
		//문제 12번 정답
		
		System.out.print("1할을 구할 정수를 입력해주세요 : ");
		int jung1 = scan.nextInt();
		
		int hal1 = jung1 / 10;
		
		System.out.println(hal1);
		
	}

}
