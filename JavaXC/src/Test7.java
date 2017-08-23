
public class Test7 {
	public static void main(String[] args) {
		Test333 tt = new Test333();
		tt.start();
		try {
			Thread.sleep(2000);
			tt.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tt.join();
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+"isAlive"+tt.isAlive());
	}

}
class Test333 extends Thread{
	private boolean isStop = false;
	public void run(){
		for(int i = 0;i<10;i++){
			try {
				Thread.sleep(1000);
				if(isStop){
					break;
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				System.out.println("stop now");
				isStop=true;
			}
		}
		
	}
}
