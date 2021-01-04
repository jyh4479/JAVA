public class Interface_test{
	public static void main(String[] args) {
		cat A=new cat();
		dog B=new dog();
		
		A.eat(); A.move(); A.sleep();
		B.eat(); B.move(); B.sleep();
		
		A.move2();
		B.move2();
	}
}

class cat implements Animal,Animal2{
	public void move() {
		System.out.println("고양이 move");
	}
	public void sleep() {
		System.out.println("고양이 sleep");
	}
	public void eat() {
		System.out.println("고양이 eat");
	}
	public void move2() {
		System.out.println("고양이 move2");
	}
}

class dog implements Animal,Animal2{
	public void move() {
		System.out.println("강아지 move");
	}
	public void sleep() {
		System.out.println("강아지 sleep");
	}
	public void eat() {
		System.out.println("강아지 eat");
	}
	public void move2() {
		System.out.println("강아지 move2");
	}
}