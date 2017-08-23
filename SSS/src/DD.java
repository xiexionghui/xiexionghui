import java.util.Timer;

public class DD {

	public static void main(String[] args) {
		Timer tm = new Timer();
		tm.schedule(new MyTask(), 1000, 2000L);

	}
}
