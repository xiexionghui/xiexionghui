package javatest6;

import java.util.Map;
import java.util.Properties;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		final T2 t2 = new T2();
		Runnable niminglei = new Runnable() {
			@Override
			public void run() {
				int i=0;
				do {
					t2.zifuchuanzizeng3();
//					t2.zifuchuanzizeng();
//					t2.zifuchuanzizeng2();
					i++;
				} while (i<10);
			}
		};
		
		Thread thread1 = new Thread(niminglei);
		Thread thread2 = new Thread(niminglei);
		
		thread1.start();
		thread2.start();
	}

	

	private static void StringBuffer() {
		String s = "0";
		StringBuffer sb = new StringBuffer("0");

		long start1 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--) {
			// s+=i;
			s = s + i;
			// s=s.concat(i+"");
		}
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1) + "ms:" + s);

		long start2 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--) {
			sb.append(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2) + "ms:" + sb);
	}

}



class T2 {
	String s = "";
	StringBuffer sb = new StringBuffer();
	
	StringBuilder sb2 = new StringBuilder();
	int k = 0;
	
	Object lock =new Object();

	public  void zifuchuanzizeng() {

		s += (1);
		System.out.println(Thread.currentThread().getName()+":"+ s.length()+":"+s);
	
		//
		/*synchronized (lock) {
			s += (k++);
			System.out.println(Thread.currentThread().getName()+":"+ s);
		}*/
	}
	
	public  void zifuchuanzizeng2() {
			sb.append(1);
			System.out.println(Thread.currentThread().getName()+":"+ sb.length()+":"+sb);
	}

	
	public  void zifuchuanzizeng3() {
		sb2.append(1);
		System.out.println(Thread.currentThread().getName()+":"+ sb2.length()+":"+sb2);
}
}
