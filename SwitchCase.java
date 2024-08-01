package method;

import java.util.Scanner;

public class Arithmatic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, num1,num2,res;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1:arithmatic\n2:assighnment\n3:bitwise\n4:logical\n5:ternary");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("You selected the arithmatic operator...!!!");
			System.out.println("Enter two numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1+num2;
			res=num1-num2;
			res=num1*num2;
			res=num1/num2;
			res=num1%num2;
			
			System.out.println("Addition result: " + (num1+num2));
			System.out.println("substract result: " + (num1-num2));
			System.out.println("multi result: " + (num1*num2));
			System.out.println("division: " + (num1/num2));
			System.out.println("module result: " + (num1%num2));
			
			break;
			
		case 2:
			System.out.println("You selected the assighnment operator...!!!!");
			System.out.println("Enter a numbers:");
			num1=sc.nextInt();
			num1+=10;
			System.out.println("num is:"+num1);
			num1-=10;
			System.out.println("num is:"+num1);
			num1*=10;
			System.out.println("num is:"+num1);
			num1/=10;
			System.out.println("num is:"+num1);
			num1%=10;
			System.out.println("num is:"+num1);
			
			break;
			
		case 3:
			System.out.println("You selected the Bitwise operator..!!!");
			System.out.println("Enter the two numbers");
			int num3=sc.nextInt();
			int num4=sc.nextInt();
			int result=num3 & num4;
			System.out.println("bitwise AND result:"+result);
			result=num3 | num4;
			System.out.println("bitwise OR result:"+result);
			result=num3^num4;
			System.out.println("bitwise XOR result:"+result);
			
			break;
				
			
		case 4:
			System.out.println("You selected the Logical operator..!!!");
			boolean bool1=true,bool2=false,result2;
			result2=bool1 && bool2;
			System.out.println("logical AND result:"+result2);
			result2=bool1 || bool2;
			System.out.println("logical OR result:"+result2);
			result2=!(bool1 || bool2);
			System.out.println("logical NOT result:"+result2);
			
			break;
			
		case 5:
			System.out.println("You selected the Ternary operator...!!!");
			System.out.println("Enter the number");
			int num5=sc.nextInt();
			String result3 = (num5>=0)?"Positive":"Negative";
			System.out.println("num5 is "+result3);
			break;
			
		default:
			System.out.println("Invalid choice.Please the correct choice between 1 to 5 ");
			
			
		}

	}

}