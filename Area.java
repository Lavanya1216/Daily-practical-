package method;
import java.util.Scanner;

	public class Area {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int length,breadth,area;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the length");
			length=sc.nextInt();
			System.out.println("enter the breadth");
			breadth=sc.nextInt();
			area =length*breadth;
			System.out.println("total area of the rectangle:"+area);
			

		}

	}


