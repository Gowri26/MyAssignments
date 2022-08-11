package week1.day2.assignment;

public class FibbonacciSeries 
{

	public static void main(String[] args) 
	{
		int n = 11, num1 = 0, num2 = 1;
		for (int i = 1; i <= n; ++i) 
		{
	      System.out.print(num1 + " ");
	      int sum = num1 + num2;
	      num1 = num2;
	      num2 = sum;
	    }

    }
}
