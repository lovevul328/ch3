package package_p47;

import package_p47.Car;

public class name_p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.show();
		
		car1.setCar(1234, 20.5);
		
		String str = "1����";
		car1.setName(str);
		
		car1.show();
	}

}

class Car
{
	private int num;
	private double gas;
	private String name;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public void setName(String nm)
	{
		name= nm;
		System.out.println("�N���W�]��"+name);
	}
	public void show()
	{
		
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("���W�O"+name);
	}
}