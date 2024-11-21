package java_study_1121;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//문제 1 정답
		System.out.println("문제 1 정답 : 3번");
		
		//문제 2 정답
		System.out.println("문제 2 정답 : 1번, A코드 실행");
		
		//문제 3 정답
		
		System.out.println("첫 번째 정수를 입력해주세요");
		int 정수a = scan.nextInt();
		System.out.println("두 번째 정수를 입력해주세요");
		int 정수b = scan.nextInt();
		
		if(정수a > 정수b) {
			System.out.println(정수a);
		}else if(정수a < 정수b) {
			System.out.println(정수b);
		}else if(정수a == 정수b) {
			System.out.println(정수a + "와" + 정수b + "가 같습니다.");
		}
		
		//문제 4 정답
		System.out.println("문제 4 정답 :  안 해도 될듯?");
		
		//문제 5 정답
		System.out.println("문제 5 정답 :  안 해도 될듯?");
		
		//문제 6 정답
		System.out.println("문제 6 정답 :  안 해도 될듯?");
		
		//문제 7 정답
		System.out.println("문제 7 정답 :  안 해도 될듯?");
		
		//문제 8 정답
		
		//스캐너로 3개 입력받기, 인트 avg로 평균계산해서 출력
		//if문으로 노가다
		
		//문제 9 정답
		//or이랑 and사용
		
		//문제 10 정답
		//아까함
		
		//문제 11 정답
		//몫 출력 연산, 나머지가 0보다 클 경우 몫 +1
		
		//문제 12 정답
		//가격 입력받기, if문으로 구간설정, 구간별 연산
		//하나만 해보기
		// 10만원 이하는 else로 놓기
		
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt();
		
		if(price >= 100000 && price < 300000) {
			int 할인5 = (int) (price * 0.95); 
 			System.out.println("5% 할인해서" + 할인5 + "입니다.");
		}else if(price >= 300000 && price < 500000) {
			int 할인10 = (int) (price * 0.9);
			System.out.println("10% 할인해서" + 할인10 + "입니다.");
		}else if(price >= 500000) {
			int 할인20 = (int) (price * 0.8);
			System.out.println("20% 할인해서" + 할인20 + "입니다.");
		}else {
			System.out.println("할인 없이" + price + "입니다.");
			
		}
		
	
		
		
		
		
	}

}
