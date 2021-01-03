public class My_thread3{
	public static void main(String[] args) {
		ATM2 my_count=new ATM2();
		my_count.set_coin(0);

		Thread5 t1=new Thread5();
		Thread6 t2=new Thread6();
		t1.set_ATM(my_count);
		t2.set_ATM(my_count);
		
		t1.start();
		t2.start();
	}
}
class ATM2{
	int coin;
	public void set_coin(int coin) {
		this.coin=coin;
	}
	public int get_coin() {
		return this.coin;
	}
	public synchronized void input_coin(int coin) {
		this.coin+=coin;
	}
}

class Thread5 extends Thread{
	private ATM2 A;
	public void set_ATM(ATM2 A) {
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

class Thread6 extends Thread{
	private ATM2 A;
	public void set_ATM(ATM2 A) {
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
//Race condition 해결