package package_p43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name_p43 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J��Ӿ��");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br1.readLine());
		int num2 = Integer.parseInt(br1.readLine());
		
	    int ans = Math.max(num1,num2);       //Math���O�Ϊk
		
		System.out.println(num1+"�P"+num2+"�����j���O"+ans);
	}

}
