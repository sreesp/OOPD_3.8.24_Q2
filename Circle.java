import java.util.Scanner;

class Circle implements Shape
{

	float r, A;

	public void DisplayArea()
	{
		Scanner S = new Scanner(System.in);

		System.out.println("Enter radius of the Circle ");

		r = S.nextFloat();

		A = PI * r * r;

		System.out.println("Area of the Circle " + A);

	}

}
