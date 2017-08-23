package javatest6;

public class TestInteger {
	public static void main(String[] args) {
		//TestInteger.bitCount(0);
		//System.out.println(TestInteger.bitCount(9));
		
//		TestInteger.longValue();
//		System.out.println(TestInteger.longValue());
//		TestInteger.TestST("aa");
//		System.out.println(TestInteger.TestST("aa"));
		
		
	}
	//返回指定 int 值的二进制补码表示形式的 1 位的数量。
	static Integer bitCount(int i){
		
		return i;
	}
	//以long类型返回该Integer的值。
	static long longValue(){
		Integer ig = 9;
		Long lg = ig.longValue();
		return lg;
		
	}
	static float floatValue(){
		Integer itg = 1544211154;
		float fl = itg.floatValue();
		return fl;
	}
	//以double类型返回该Integer的值。
	static double doubleValu(){
		Integer ig = 5;
		Double db = (double) ig.doubleValue();
		return db;
	}
	static short shortValue(){
		Integer st = 1234;
		Short sh = st.shortValue();
		return sh;
	}
	//以byte类型返回该Integer的值;
	static Integer byteValue(){
		Integer ig = 5;
		byte bt = (byte) ig.byteValue();
		return (int) bt;
		
	}
	
	static int intValue(){
		Integer lt = (int) 1313224.423;
		int  lg = lt.intValue();
		return lg;
	}

	static void Test_tt(){
		String str = "abc3433";
		String c = "abc3433".substring(5);
		System.out.println(c);
		
	}
	static Integer TestST(String s){
		Integer b = new  Integer(s);
		b = 9;
		String st = b.toString();
		return b;
	}

	static int parseInt(String nk,int t){
		parseInt("0", 10);
		parseInt("473", 10);
		return t;
		
	}

	
}
