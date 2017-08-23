
public class Test7 {
	public static void main(String[] args) {
		
	}

}
class heello implements Runnable {
	public void run() {
		for (int i = 0; i < 10; ++i) {
			sale();
		}
	}

	public synchronized void sale() {
		if (count > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(count--);
		}
	}
