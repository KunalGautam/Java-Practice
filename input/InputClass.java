import java.util.Scanner;
public class InputClass
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //System.in == Keyboard input
		String name;
		name = input.nextLine();// using next() take input by space or enter, Name like Kunal Gautam need nextLine();
		// Use nextInt() for integer nextDouble() for double
		System.out.println("Hello " + name);
	}
}
