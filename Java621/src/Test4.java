
public class Test4 {
	public static void main(String[] args) {
		MaiTest mt = new MaiTest();
		new Thread(mt, "1号窗口").start();
		new Thread(mt, "2号窗口").start();
		new Thread(mt, "3号窗口").start();
	}
}


class MaiTest implements Runnable{
	private int ticket = 5;
	@Override
	public void run() {
		for(int i = 0;i<=20;i++);
			if(this.ticket>0){
				System.out.println(Thread.currentThread().getName()+"正在卖票："+this.ticket);
			}
		}
}
