package package_p38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name_p38 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		System.out.println("�п�J�n�˯�����r");
		
		String str2 = br1.readLine();
		char ch = str2.charAt(0);
		int num = str1.indexOf(ch);       //indexOf�j�M����|�^��-1
		
		if(num != -1)
		{
			System.out.println(str1+"����"+(num+1)+"�Ӧr�N�O�u"+ch+"�v");
		}
		else
		{
			System.out.println(str1+"���S��"+ch+"�o�Ӧr");
		}
		
		
	}

}
