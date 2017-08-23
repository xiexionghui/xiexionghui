
public class Test5 {
	public static void main(String[] args) {
		hello hl = new hello();
		Thread td = new Thread(hl);
		System.out.println("线程启动之前"+td.isAlive());
		td.start();
		System.out.println("线程启动之后"+td.isAlive());
//		for(int i = 0;i<50;++i){
//			if(i>10){
//				try {
//					td.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("main 线程执行-->"+i);
			//}
		//}
	}
	

}
class hello implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<3;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);
			
		}
	}
	
}
