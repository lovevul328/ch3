package package_p14;

public class name_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
		
	}

}

class Car
{
	
	
	void setNum(int n)
	{
		System.out.println("將車號設為"+n);
	}
	void setGas(double g)
	{
		System.out.println("將汽油量設為"+g);
	}
	
}