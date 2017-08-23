
public class Test1 {
	public static void main(String[] args) {
		
		Daname1 d1 = new Daname1("李山");
		Daname1 d2 = new Daname1("李四");
		Thread dt = new Thread(d1);
		Thread dn = new Thread(d2);
		dt.start();
		dn.start();
	}
	

}
class Daname1 implements Runnable{

	private String name;
	
	public Daname1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0;i<5;i++){
			System.out.println(name+":"+i);
		}
		
	}
	
}
