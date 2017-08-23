
public class Test6 {
	public static void main(String[] args) {
		Thread td1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//send msg
				for(int i = 0;i<100;i++){
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		});
		td1.start();
		
		
	}

	private static void AAA() {
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+""+i);
			if(i == 30){
				Runnable rb = new MyRunm();
				Thread td = new Thread(rb);
				Thread td1 = new Thread(rb);
				td.start();
				td1.start();
				td1.interrupt();
			}
		}
	}

}

class MyRunm implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	
}
