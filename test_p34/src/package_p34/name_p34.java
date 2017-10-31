package package_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name_p34 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		
		System.out.println("您輸入的數字是:"+num);
	}

}
