package package_p15;

import package_p15.Car;

public class name_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		car1.setNumGas(1234,20.5);
		
	}
}

class Car
{
	void setNumGas(int n,double g)
	{
		System.out.println("將車號設為"+n+"，汽油量設為"+g);
	}
}