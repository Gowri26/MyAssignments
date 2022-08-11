package week1.day2.assignment;

public class MyCalculator 
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		int add = calc.add(5, 5, 5);
		System.out.println("The addtion of three number is:"+add);
		int sub = calc.sub(10, 5);
		System.out.println("The subtraction of two numbers is:"+sub);
		double mul = calc.mul(11.982, 33.3356);
		System.out.println("The multiplication of Two numbers is:"+mul);
		float div = calc.div(10.5f, 5.5f);
		System.out.println("The divison of two numbers is :"+div);
	}
}
