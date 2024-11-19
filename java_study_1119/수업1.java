package java_study_1119;

public class 수업1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비교연산자 : 비교연산자 결과는 true(참) 혹은 false(거짓)으로 표기
		boolean 비교 = 3 < 5; //3은 5보다 작다
		System.out.println(비교);
		boolean 비교2 = 4 > 10; //4는 10보다 크다?
		System.out.println(비교2);
		boolean 비교3 = 5 == 5; //5는 5와 같음
		System.out.println(비교3);
		boolean 비교4 = 5 != 7; //5는 7과 다르다
		System.out.println(비교4);
		
		//논리연산자
		//AND 연산자 (두 조건이 모두 참일 때 전체가 참)
		boolean 배가고프다 = true;
		boolean 돈이있다 = true;
		boolean 식당에갈수있다 = 배가고프다 && 돈이있다;
		System.out.println("식당에갈수있다 : "+식당에갈수있다);
		//OR 연산자 (두 조건 중 하나만 참이면 전체가 참)
		boolean 비가온다 = true;
		boolean 우산이있다 = false;
		boolean 외출가능 = 비가온다 || 우산이있다;
		System.out.println("외출가능 : "+외출가능);
		
		//NOT 연산자 : 조건의 결과를 뒤집음
		boolean 햇빛이쨍쨍 = true;
		boolean 흐린날씨 = !햇빛이쨍쨍; //변수명 앞에 느낌표
		System.out.println("흐린날씨 : " + 흐린날씨);
		
		//복합대입연산자
		int a = 10;
		int b = 20;
		
		//a = a + b;
		a = a + b; // 동일한 코드 : a = a + b
		System.out.println("a의 값은 : " + a);
		
		int c = 5;
		int d = 6;
		c = c * d;
		//c = c * d;
		//퀴즈) 복합연산자를 이용해서 위 코드 한줄을 수정하시오.
		c *= d; //c = c * d; (동일한 코드)
		System.out.println("c의 값은 : "+c);
		
		//증감연산자
		//변수의 값을 1증가 혹은 1 감소시키는 연산자 입니다.
		int 증감 = 0;
		증감++; //1씩 증가
		System.out.println("증감 : "+증감);
		증감++; //1씩 증가
		System.out.println("증감 : "+증감);
		증감--; //1씩 감소
		System.out.println("증감 : "+증감);
		
		
		//증감연산자는 전위 연산자와 후위 연산자로 나뉨
		//전위 연산자(변수명 앞에 ++ or --가 온다)
		int 사과 = 100;
		System.out.println(++사과); //사과 1증가 (전위 연산자)
		System.out.println(사과); //그냥 사과 출력
		
		int 바나나 = 100;
		System.out.println(바나나++); //1증가
		System.out.println(바나나); //바나나 출력
		
		//삼항 연산자
		//세 개의 피연산자로 구성된 연산자입니다.
		int num = 3;
		int num2 = 5;
		int 결과 = num > num2 ? num - num2 : num + num2;
		
		System.out.println("결과 : " + 결과);
		
		//문제 1.
		int 용돈 = 5000;
		용돈 -= 3000; // 5000 - 3000
		System.out.println("용돈 : "+용돈);
		용돈 += 3000; // 2000 + 3000
		System.out.println("용돈 : "+용돈);
		
		/*문제 2.
		실수형 변수 weight와 height를 선언하고
		weight에 70.5 를 할당, height에는 1.77을 할당 후
		체질량 지수를 계산하는 프로그램을 작성하세요.
		
		
		 *BMI(체질량 지수)공식은 체중(kg) / (신장(m) * 신장
		 */
		
		double weight = 70.5
		double height = 1.77
		double bmi = weight / height*height); //체질량 지수 공식
		System.out.println("bmi : " + bmi);
		
		
		
		
	}

}
