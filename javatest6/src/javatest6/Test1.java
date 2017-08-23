package javatest6;

import java.io.UnsupportedEncodingException;


public class Test1 {
	public static void main(String[] args) {
		
//		String a = "12345";
//		char aa[] = new char[3] ;
//		for(int i=0;i<a.length();i++){
//			char ar = a.charAt(0);
//			aa[i]=ar;
//			
//		}
//		System.out.println(new String(aa));
		Test1.Stringbyte();
		
				
			
			
}
		
	
	
	static void Stringbyte() {
		String ss = new String();//新创建String对象：
		ss = "";
		
		//通过的默认字符指定的 byte 数组，构造一个新的 String
		
		/*byte [] a = {2,3,4,5,6,7,8};
		
		String by = new String(a);
		by.getBytes("utf-8");
		System.out.println("byte数组"+by);
		*/
		
		String s = "asdf";
		byte[] buff = null;
		try {
			buff = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<buff.length;i++){
			System.out.print(buff[i]+",");
		}
		
		
		//通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
		byte[] b = {3};
		String cy="";
		cy = new String(b );
		System.out.println(""+cy);
	
		//字符解码指定Byte数组构造一个新的String;
//		byte[] c = {2,3,4,5,6,7};
//		// String cb = new String(c, 1, 5, "ISO-8859-1");
//		 System.out.println("byte"+cb);
	
		 //String(byte[] bytes, Charset charset) 
        //通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
		 
	}
	
	static void Stringchar(){
		//分配一个新的String,使其表示字符数组参数中当前包含的字符
		char [] a ={'1','1','1','果','裹','郭'};
		String aa = new String(a);
		System.out.println(aa);
		
		//分配一个新的String,它包含取自字符数组参数一个子数组的字符;
		char [] b ={'1','1','1','果','裹','郭','1','1','4'};
		String bb = new String(b, 3, 5);
		System.out.println(bb);
		
		//返回指定数组中表示该字符序列的 String。
		char [] cr ={'1','1','1','果','裹','郭','1','1','4'};
		String au =String.copyValueOf(cr);
		System.out.println(au);
		
		String  uu = String.copyValueOf(cr, 0, 5);
		System.out.println(uu);
		
		// 分配一个新的 String，它包含 Unicode 代码点数组参数一个子数组的字符。
		char [] oo ={'1','1','1','果','裹','郭','1','1','4'};
		String xx = new String(oo, 1, 6);
		System.out.println(xx);
		//返回指定索引处的char值
		String at = "asdfasf";
		char ac = at.charAt(1);
		System.out.println(ac);
		
		String lk= "分";
	}
	static void StringSp(){
		String yn = "7+7";
		String[] nn = yn.split("\\+");
		for(int i = 0;i<nn.length;i++){
			
			Integer in = Integer.valueOf(nn[i]);
			System.out.println(in.getClass()+"="+in);
		}
		
		
	}
	//String(byte[] bytes) 
	public static void charAn(){
		String st = "safas";
		char cr = st.charAt(4);
		System.out.println(cr);
		
	}
	

}
