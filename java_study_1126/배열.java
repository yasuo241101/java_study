package java_study_1126;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열 정말 중요합니다
		//배열 > for문 > if/else
		
		/*
		 * 배열은 *****같은 타입*****의 데이터들이 순차적으로 저장되는 ****공간****
		 * 배열은 0부터 시작합니다.
		 * why? 0부터 시작합니다.
		 * 
		 * 
		 */
		
		int [] array = {10,20,30,40}; //배열 초기화
		//array라는 int형 배열에 10,20,30,40 총 4개의 데이터를 저장함.
		
		System.out.println("0번째 배열 값 : " + array[0]);
		System.out.println("1번째 배열 값 : " + array[1]);
		
		int sum = array[1] + array[3]; //첫번째 배열 값 + 세번째 배열 값
		System.out.println("총 합은 : " +sum);
		
		//순서? => 인덱스(프로그래밍에서는 순서를 인덱스라고 합니다.)
		
		int[] array2 = {10,20,30,40,10,20,30,40,10,20,30,40};
		//배열에 들어 있는 값이 많아질 때는 인덱스 번호를 이용해서 조회하는게 한계
		//배열안에 있는 값을 효과적으로 가져오기 위해서는 ***반복문***을 사용해야 합니다.
		//배열하고  for문은 친구
		//array2.length : 배열 길이를 나타냄
		for(int i=0; i<array2.length; i++) {
			System.out.println("배열 값 : " + array2[i]);
		}
		System.out.println("배열 길이는 ? " + array2.length);
		
		
		int[] array3 = {2,3,4,5,6};
		//퀴즈) for문을 이용해서 array3에 있는 값 중 짝수만 출력하기
		for(int i=0; i<array3.length; i++) { //배열 길이만큼 for문을 돌린다!
			int num = array3[i]; //배열 값 num에 대입
			if(num % 2 == 0) { 
				System.out.println("짝수 : " + num);
			}
		}
		//퀴즈) array3있는 값 총합과 평균값을 구하시오.
		int sum1 = 0; //총합
		for(int i=0; i<array3.length; i++) {
			sum += array3[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/array3.length);
		
		//퀴즈)
		int[] array4 = {1,2,3,4,5,6,7,8,9,10};
		//for문을 이용해서 array4에 있는 3의 배수 총합 출력하기.
		
		double  sum3q = 0;
		for(int i=0; i<array4.length; i++) {
			if(array4[i] % 3 == 0) {
				sum3q = sum3q + i;
			}	
		}
		System.out.println("3의 배수의 총합은 : " + sum3q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
