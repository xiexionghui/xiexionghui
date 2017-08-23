import java.util.Date;
import java.util.TimerTask;


public class MyTask extends TimerTask{


	@Override
	public void run() {
		//SELECT 
		System.out.println("当前时间"+new Date());
	}
}
