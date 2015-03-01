public class NameTest
{
	public static void main(String[] args)
	{
		//instantiation
		Name myName = new Name ("Kunal", "Gautam");
		Name yourName = new Name ("Shiv", "Kumar", "Jha");
		Name aName = new Name ("Upadhaya");
		Name someName;
		someName = new Name ("Vani");
			System.out.println("myName: " + myName.toString());
			System.out.println("yourName: " + yourName.toString());
			System.out.println("aName: " + aName.toString());
			System.out.println("someName: " + someName.toString());	

	}
}

