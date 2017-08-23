import java.util.Date;


public class Test2 {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		my.start();
		try {my.sleep(10000);}
		catch (InterruptedException e) {}
		my.interrupt();
	}

}

class MyThread extends Thread{

	boolean flag = true;
	public void run() {
		while(flag){
			System.out.println("现在的时间"+new Date()+"==");
		try{
			sleep(1000);
		}catch(InterruptedException e){
			return;

		}
		}
	}
	
}