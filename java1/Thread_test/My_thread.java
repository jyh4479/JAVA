import java.util.*;

public class My_thread{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("1번째: "+i);
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("2번째: "+i);
		}
	}
}
//비동기적인 동작 확인