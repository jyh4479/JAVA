import java.util.*;

public class My_thread{
	public static void main(String[] args) {
		Runnable r1=new Thread1();
		Runnable r2=new Thread2();
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

class Thread1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("1번째: "+(i+1));
		}
	}
}

class Thread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("2번째: "+(i+1));
		}
	}
}