package week1.day1;

public class ConvertNegativeNumberToPositiveNumber
{
	public static void main(String[] args) 
	{
		int number=-33;
		if(number<0)
		{
			System.out.println("The given number"+number+" is negative");
			number *= -1;	
		}
		System.out.println("The converted positive number is"+ number);
	}
}