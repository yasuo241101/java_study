package java_study_1206;

public class 질문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 22-난이도 up 개미 군단 -> 그리드 (탐욕) 알고리즘
		
		int hp = 24; //여치 hp
		int count2 = 0;
		
		count2 += hp / 5; //장군개미
		hp %= 5;
		
		count2 += hp / 3; //병정개미
		hp %= 3;
		
		count2 += hp;
		System.out.println(count2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
