public class My_thread2{
	public static void main(String[] args) {
		ATM my_count=new ATM();
		my_count.set_coin(0);

		Thread3 t1=new Thread3();
		Thread4 t2=new Thread4();
		t1.set_ATM(my_count);
		t2.set_ATM(my_count);
		
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
	}
}

class Thread3 extends Thread{
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
			System.out.println(i+" 1번째: 10원넣기:"+A.get_coin());
		}
	}
}

class Thread4 extends Thread{
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
			System.out.println(i+" 2번째: 10원넣기:"+A.get_coin());
		}
	}
}
//Race condition 문제