package method;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius:");
		radius =sc.nextInt();
		circumference=Math.PI*2*radius;
		System.out.println("circumference:"+circumference);

	}

}
