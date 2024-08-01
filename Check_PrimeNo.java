import java.util.*;

public class Check_PrimeNo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
		System.out.println("enter a no:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();//Input no
		
	for(i=2;i<=num;i++)//condition for nonprime number
{
	if(num%i==0) 
	{
		break;
	}
}
if(num==i)//True
{
System.out.println("prime no");
}
else//False
{
System.out.println("not prime no");
}
}
}