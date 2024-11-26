package java_study_1126;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자바에서 배열을 만드는 방법은 총 2가지임.
		//첫번째 -> 값이 처음부터 들어있음
		int []array = {2,3};
		//두번째
		int []array2 = new int[2]; // 길이만 생성 안에 값 존재 X
		System.out.println("배열 길이는 : " + array2.length);
		
		//값 넣기
		array2[0] = 10;
		array2[1] = 20;
//		array2[2] = 20;
//		System.out.println(array[2]);
		System.out.println(array2[1]);
		
		//배열에 랜덤한 값 넣기
		
		int []numbers = new int[10]; //10개 공간을 가진 배열 생성!
		// 1~100까지 중 랜덤 값을 배열에 차례로 넣을 예정
		
		//자바에서는 랜덤값을 Random이라는 클래스를 이용합니다.
		Random random = new Random(); //랜덤클래스 생성 => ctrl + shift + o
		numbers[0] = random.nextInt(100)+1; //1부터 100까지의 랜덤값을 0번째 인덱스에 대입함.
		System.out.println("0번째 인덱스 값은 : " + numbers[0]);
		//퀴즈 0번째 ~ 9번째 인덱스에 랜덤 값 넣기
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
			System.out.println("값 : " + numbers[i]);
		}
		
		/*
		 * int []numbers2 = new int[100]; Random random2 = new Random(); numbers2[0] =
		 * random2.nextInt(100)+1; numbers2[1] = random2.nextInt(100)+1; numbers2[2] =
		 * random2.nextInt(100)+1; numbers2[3] = random2.nextInt(100)+1; numbers2[4] =
		 * random2.nextInt(100)+1; numbers2[5] = random2.nextInt(100)+1; numbers2[6] =
		 * random2.nextInt(100)+1; numbers2[7] = random2.nextInt(100)+1; numbers2[8] =
		 * random2.nextInt(100)+1; numbers2[9] = random2.nextInt(100)+1;
		 * System.out.println("0번째 인덱스 값은 : " + numbers2[0]);
		 * System.out.println("1번째 인덱스 값은 : " + numbers2[1]);
		 * System.out.println("2번째 인덱스 값은 : " + numbers2[2]);
		 * System.out.println("3번째 인덱스 값은 : " + numbers2[3]);
		 * System.out.println("4번째 인덱스 값은 : " + numbers2[4]);
		 * System.out.println("5번째 인덱스 값은 : " + numbers2[5]);
		 * System.out.println("6번째 인덱스 값은 : " + numbers2[6]);
		 * System.out.println("7번째 인덱스 값은 : " + numbers2[7]);
		 * System.out.println("8번째 인덱스 값은 : " + numbers2[8]);
		 * System.out.println("9번째 인덱스 값은 : " + numbers2[9]);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
