
public class Test2 {
	public static void main(String[] args) {
		Thread td = new the("xxh");
		Thread te = new the("谢雄辉");
		
		td.start();
		te.start();
	}

}
class the extends Thread{
	private String name;

	public the(String name) {
		this.name = name;
	}
@Override
	public void run() {
		for(int i = 0;i<10;i++){
			System.out.println(name+"子线程"+i);
			
		}
		try {
			
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	
	
}
