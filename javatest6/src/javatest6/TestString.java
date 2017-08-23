package javatest6;

import java.util.Map;
import java.util.Properties;

public class TestString {

	public static void main(String[] args) {
//		TestString.Test11();
	}
	static void Test11(){
		String s = "234/132";
		String[] sp = s.split("/");
		for(int i = 0;i<=sp.length;i++){
			System.out.println(sp[i]);
			
			Integer in = Integer.valueOf(sp[i]);
			System.out.println(in.getClass()+"="+s);
		}
		
	}
	static void Test_spl(){
		String s = "7*5*5";
		String[] sp = s.split("\\*");
		for(int i = 0;i<sp.length;i++){
			System.out.println(sp[i]);
		}
		
		
	}
	
	// 根据给定正则表达式的匹配拆分此字符串
	static void test_split() {
		//声明一个局部变量s
		String s ="8*9";
		//调用String 实例对象split方法，获得String数组
		String[] aa = s.split("\\*");
		//遍历数组，最大值=数组长度-1
		for(int i=0;i<=aa.length-1;i++){
			//打印数组
			System.out.println(aa[i]);
			
			//转换为数字对象
			Integer aInt = Integer.valueOf(aa[i]);
			System.out.println(aInt.getClass()+"="+aInt);
		}
	}
	
	static void test_charAt() {
		String s ="8*9中国";
		char c1 = s.charAt(0);
		System.out.println(c1);
		char c4 = s.charAt(4);
		System.out.println(c4);
		
	}
}
