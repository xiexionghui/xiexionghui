import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;


public class Test9 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis  = new FileInputStream("C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\QQLive");
			byte[] bt = new byte[10];
			fis.read(bt);
			fis.close();
			System.out.println("读取"+ new String(bt));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
