package method;

import java.util.Scanner;

public class ArmtrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,r,sum=0,num1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		num=sc.nextInt();
		num1=num;
		do
		{
			r=num%10;
			sum=sum+ r*r*r;
			num=num/10;
		}
		while(num>0);
		if(num1==sum)
		{
			System.out.println("It is armstrong Numbers="+num1);
		}
		else
		{
			System.out.println("It is Not an armstrong Numbers="+num1);
		}
		
		
		
	}

}