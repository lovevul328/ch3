package package_p40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name_p40 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��C");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		System.out.println("�п�J�n�s�W���r��C");
		
		String str2 = br1.readLine();
		
		StringBuffer sb = new StringBuffer(str1);     //���n
		sb.append(str2);							//���n	
		
		System.out.println("�b�u"+str1+"�v��s�W�u"+str2+"�v���ܡA�N�|�ܦ��u"+sb+"�v�C");
	}

}
