package week1.day1;

public class TwoWheeler {
	int noOfWheels =02;
	short noOfMirrors=04;
	long chassisNumber=23465768763l;
	boolean isPunctured=false;
	String bikeName="Honda Shine";
	double runningKM=67900;
	public static void main(String[] args) 
	{
		TwoWheeler bike = new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);
	}
}
