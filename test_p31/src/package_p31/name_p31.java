package package_p31;

public class name_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.showSum();
		
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car.showSum();
		
		Car car2 = new Car();
		car2.setCar(4567, 30.5);
	}

}

class Car
{
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public static void showSum()
	{
		System.out.println("���l�`�@��"+sum+"�x");
	}
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
}