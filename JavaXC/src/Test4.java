
public class Test4 implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args) {
		
		Test4 test = new Test4();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("h1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		timer.add(Thread.currentThread().getName());
	}

}
class Timer{
	private static int num = 0;
	public synchronized void add(String name){
		num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			
		}
		System.out.println(name+",你是第"+num+"个使用timer的线程");
	}
}
