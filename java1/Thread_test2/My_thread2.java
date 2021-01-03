public class My_thread2{
	public static void main(String[] args) {
		ATM my_count=new ATM();
		my_count.set_coin(0);
		
		Thread3 a=new Thread3();
		Thread3 b=new Thread3();
		a.set_ATM(my_count);
		b.set_ATM(my_count);
		
		Runnable r1=a;
		Runnable r2=b;
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		t1.start();
		t2.start();
	}
}
class ATM{
	int coin;
	public void set_coin(int coin) {
		this.coin=coin;
	}
	public int get_coin() {
		return this.coin;
	}
	public void input_coin(int coin) {
		this.coin+=coin;
		System.out.println(this.coin);
	}
}

class Thread3 implements Runnable{
	private ATM A;
	public void set_ATM(ATM A) {
		this.A=A;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("오류발생");
			}
			this.A.input_coin(10);
			//System.out.println(i+" 1번째: 10원넣기:"+A.get_coin());
		}
	}
}

class Thread4 implements Runnable{
	private ATM A;
	public void set_ATM(ATM A) {
		this.A=A;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("오류발생");
			}
			this.A.input_coin(10);
			//System.out.println(i+" 2번째: 10원넣기:"+A.get_coin());
		}
	}
}
//Race condition 문제