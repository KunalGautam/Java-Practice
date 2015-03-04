import java.text.DecimalFormat;
public class Round
{
	public static void main(String[] args)
	{
		double d = 3.76628729;

		DecimalFormat newFormat = new DecimalFormat("#.00");
		double twoDecimal =  Double.valueOf(newFormat.format(d));
		System.out.println(twoDecimal);	
	}
}
