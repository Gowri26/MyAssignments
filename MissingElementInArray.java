package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,2,4,7,6,8,5};
		Arrays.sort(arr);
		for(int i=0; i<=arr.length-1;i++)
		{
			if(i+1!=arr[i])
			{
				System.out.println(i+1);
				break;
			}
				
		}
	}
}
