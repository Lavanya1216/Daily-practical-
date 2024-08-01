package method;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, r=0,temp;
		System.out.println("enter a no:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp=num;
		while(num!=0) {
			int digit=num%10;//454%10 remainder is 4,aftre store 4 in digit
			r=(r*10)+digit;//0*10+4=4,r is 4
			num/=10;//454/10=45 after check the condition
		}
		if(temp==r)
			System.out.println("Palindrom no");
		else
			System.out.println("not Palindrome");
	}

}
