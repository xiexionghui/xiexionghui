
public class Test1 {
	public static void main(String[] args) {
		TESTxc tt = new TESTxc();
		Thread th = new Thread(tt);
		th.start();
		for(int i = 0;i<100;i++){
			System.out.println("线程2222"+i);
		}
	}
	

}
class TESTxc implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<100;i++){
			System.out.println("线程GG"+i);
		}
		
	}
	

}


