package java_study_1126;

import java.util.Random;

public class 문제풀기 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//1번 정답
		System.out.println("1번 정답");
		
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int gop = array1[2] * array1[5];
		System.out.println(gop);
		
		//2번 정답
		System.out.println("2번 정답");
		
		int sum1 = 0;
		for(int i=0; i<array1.length; i++) {
			sum1 = sum1 + array1[i];
		}
		System.out.println(sum1);
		
		//3번 정답
		System.out.println("3번 정답");
		
		int [] array2 = new int[100];
		for(int i=0; i<array2.length; i++) {
			array2[i] = random.nextInt(100)+1;
			System.out.println("랜덤 값 : " + array2[i]);
			if(array2[i] % 2 == 0) {
				System.out.println("짝수 : "+array2[i]);
			}
		}
		
		
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				System.out.println(array2[i]);
			}
		}
		 
			
		
		//4번 정답
		System.out.println("4번 정답");
		
		int [] array4 = new int[100];
		for(int i=0; i<array4.length; i++) {
			array4[i] = random.nextInt(100)+1;
		}
		
		int bigyo = 0;
		for(int i=0; i<array4.length; i++) {
			if(bigyo < array4[i]) {
				bigyo = 0;
				bigyo = bigyo + array4[i];
			}
		}
		
		System.out.println(bigyo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
