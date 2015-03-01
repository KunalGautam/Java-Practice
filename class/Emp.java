public class Emp
{
	public class Name
	{
		private String first; //private variable so that it is not exposed anywhere else outside the class
		private String middle;
		private String last;

		public String displayName()
		{
			return first + " " + middle + " " + last;
		}
	
	public String getInitials()
		{
			return first.substring(0,1) + middle.substring(0,1) + last.substring(0,1); //  substring return a string. First argument is starting position, second argument is number of string to get 
		}	

	}


	public static void main(String[] args)
	{
	
	}
}
