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
		
		System.out.println(my_count.get_coin());
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
			System.out.println("1번째: 10원넣기:"+A.get_coin());
			this.A.input_coin(10);
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
			System.out.println("2번째: 10원넣기:"+A.get_coin());
			this.A.input_coin(10);
		}
	}
}
//Race condition 발생