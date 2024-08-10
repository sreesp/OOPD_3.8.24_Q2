import java.util.Scanner;

class Rectangle implements Shape
{

	float l, b, A;

	// missing code
	public void DisplayArea() 
	{
		Scanner S = new Scanner(System.in);

		System.out.println("Enter the Length of the Rectangle ");
		l = S.nextFloat();
		
		System.out.println("Enter the Breadth of the Rectangle ");
		b = S.nextFloat();

		A = l * b;

		System.out.println("Area of the Rectangel " + A);

	}

}