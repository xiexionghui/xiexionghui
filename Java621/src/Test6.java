
public class Test6 {
	public static void main(String[] args) {
		Demo dm  = new Demo();
		Thread th = new Thread(dm, "线程");
		th.start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
	}

}
class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("执行了RUM方法");
		try {
			Thread.sleep(10000);
			System.out.println("线程完成休眠");
		} catch (InterruptedException e) {
			System.out.println("休眠被打断");
			
			return;
		}
		System.out.println("线程被终止");
		
	}
	
	
}
