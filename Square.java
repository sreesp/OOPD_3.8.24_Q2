import java.util.Scanner;

class Square implements Shape
{

	float a, A;

	public void DisplayArea() 
	{
		//missing code
		
		Scanner S = new Scanner(System.in);

		System.out.println("Enter the Side Length of the Square ");
		a = S.nextFloat();
		
		A = a * a;

		System.out.println("Area of the Square " + A);

	}
	
}