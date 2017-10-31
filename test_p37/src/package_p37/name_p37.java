package package_p37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name_p37 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入英文字母");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		
		System.out.println("轉換成大寫時為"+str.toUpperCase());
		System.out.println("轉換成小寫時為"+str.toLowerCase());
	}

}
