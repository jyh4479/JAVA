public class Abstract_test{
	public static void main(String[] args) {
		cat A=new cat();
		dog B=new dog();
		
		A.eat(); A.move(); A.sleep();
		B.eat(); B.move(); B.sleep();
		
		A.basic();
		B.basic();
	}
}

class cat extends Animal{
	public void move() {
		System.out.println("고양이 move");
	}
	public void sleep() {
		System.out.println("고양이 sleep");
	}
	public void eat() {
		System.out.println("고양이 eat");
	}
}

class dog extends Animal{
	public void move() {
		System.out.println("강아지 move");
	}
	public void sleep() {
		System.out.println("강아지 sleep");
	}
	public void eat() {
		System.out.println("강아지 eat");
	}
}