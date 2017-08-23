
public class Test5 {
	
	public static void main(String[] args) {
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+""+i);
			if(i == 30){
				Thread myth1 = new Test12();
				Thread myth2 = new Test12();
				myth1.start();
				myth2.start();
			}
		}
		
	}
	
}


class Test12 extends Thread{
	private int i = 0;

	public void run(){

		for(i = 0;i<100;i++){
		System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}	
	