package java_study_1217;

class Food{
	String name;
	int cal;
	
	public Food(String name, int cal) {
		this.name = name;
		this.cal = cal;
	}
	
	public void eat() {
		System.out.println("Eating : " + this.name);
	}
	
	public int getcal() {
		return this.cal;
		
	}
	
}//Food 클래스 끝

class Pizza extends Food{ //피자클래스
	String[] toppings; //토핑 (문자열 배열)
	
	public Pizza(String name, int cal, String[] toppings) {
		super(name, cal); //super : 부모클래스 생성자 호출
		this.toppings = toppings;
		
	}
	
	@Override
	public void eat() {

		System.out.println("Eating a slice of " + super.name + "pizza");
	}
	public void showToppings() {
	    System.out.println("Toppings : ");
	    for(String s : toppings) {
	    	System.out.print(s + ",");
	    }
	    System.out.println("");
	    }

}//끝

class Sushi extends Food{ //스시클래스
	String fishType;
	
	public Sushi(String name, int cal, String fishType) {
		super(name, cal); //부모 클래스 생성자 호출
		this.fishType = fishType; //필드 변수 대입
	}
	
	@Override
	public void eat() {
		System.out.println("Eating " + super.name + " sushi ");
	}
	
	public void showFishType() {
		System.out.println("FishType : " + this.fishType);
	}
	
	
}//끝

public class 수업2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food food = new Food("Food", 100); //부모클래스
		
		String[] toppings = {"Tomato", "Mozzarella", "Basil"};
		Pizza margherita = new Pizza("margherita", 300, toppings);
		
		Sushi salmonRoll = new Sushi("salmon Roll", 250, "Salmon");
		
		food.eat(); //푸드 클래스 eat 호출
		margherita.eat(); //피자 클래스 eat(재정의한 메소드) 호출
		salmonRoll.eat(); //스시 클래스 eat(재정의한 메소드) 호출
		
		margherita.showToppings();
		salmonRoll.showFishType();
		
		/*
		 * 
		 * 코드설명
		 * 
		 * Food 클래스 : 기본 음식 클래스, 모든 음식의 공통 속성인
		 * name과 cal(칼로리) 그리고 eat() 메소드를 가진다.
		 * 
		 * 
		 * 
		 * Pizza와 Sushi 클래스 : Food를 상속받아 eat 메소드를 오버라이딩
		 * 또한 Pizza 클래스에는 토핑을 보여주는 showToppings() 메소드 구현
		 * Sushi 클래스에는 생선종류를 보여주는 showFishType() 메소드 구현
		 * 
		 * 핵심 : Pizza와 Sushi 클래스는 Food 클래스의 속성과 메소드를 상속받아
		 * 재사용할 수 있습니다.
		 */
		
	}

}
