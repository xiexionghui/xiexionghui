
public class Test3 {
	public static void main(String[] args) {
		new MyThread().start();
	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			if(i%10 == 0){
				System.out.println("-------"+i);
				
			}
			System.out.println(i);
			try {
				Thread.sleep(1);
				System.out.println("线程睡眠");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
