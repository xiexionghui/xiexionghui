import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class Test8 {
	public static void main(String[] args) {
		String str = "E:\\javase";
		File fl = new File(str);
		File[] fil = fl.listFiles();
		for(File file:fil){
			File fl2 = new File(file.getAbsolutePath());
			File[] fil2 = fl2.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					if(name.endsWith(".avi")){
						return false;
					}
					return true;
				}
			});
//			for(File file2:fil2){
//				
//				String newName = file2.getAbsolutePath();
//				newName = newName.replaceAll("E:\\\\javase\\\\", "").replaceAll("\\\\", "");
//				String atr = "C:\\Users\\Administrator\\Desktop\\xxh2\\"+newName;
//				System.out.println(atr);
//				Test8.Test212(file2.getAbsolutePath(), atr);
//			}
		}
		
		/*
		*/
	}
	static void Test212(String ptt,String xiaozhi){
		try {
			FileInputStream fis = new FileInputStream(ptt);
			FileOutputStream fos = new FileOutputStream(xiaozhi);
			byte[] bt = new byte[1024];
			int abc = fis.read(bt);
			while(abc!=-1){
				fos.write(bt, 0, abc);
				abc = fis.read(bt);
			}
			fos.flush();
			fos.close();
			fis.close();
			System.out.println(bt.length+"长度"+abc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void fuzhi() {
		try {
			FileInputStream fss = new FileInputStream("C:\\Users\\Administrator\\Desktop\\file123.txt");
			 FileOutputStream foos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\file123456.txt");
			 byte[] abc = new byte[7];
			 int aacc = fss.read(abc);
			 while (aacc!=-1) {
				 foos.write(abc, 0, aacc);
				 
				 aacc = fss.read(abc);
				System.out.println(abc.length+":"+aacc);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void shuchushuru() {
		try {
			FileOutputStream fl = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\file123.txt");
			String s = "xxhadfasdf";
			byte[] bt = s.getBytes("utf-8");
			fl.write(bt);
			fl.flush();
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\file123.txt");
			byte[] at = new byte[6];
			fis.read(at);
			fis.close();
			System.out.println(new String(at));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
