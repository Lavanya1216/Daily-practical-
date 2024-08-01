package method;
import java.util.Scanner;

public class Welcome_Hotel 
{
	public static void main(String[] args) 
	{
		int choice,choice2,total=0,quantity;
		char ans;
		String order="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome to Taj Hotel");
		do
			{  
			//Display menu option
			System.out.println("******************************");
			System.out.println("        Taj Hotel              ");
			System.out.println("===============================");
			System.out.println("        * Menu *                ");
			System.out.println("       1.Starters              ");
			System.out.println("       2.Main Course           ");
			System.out.println("       3.Deserts               ");
			System.out.println("       4.SoftDrinks            ");
			System.out.println("===============================");
			System.out.println("Enter your choice:   ");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1: 
				    System.out.println("************ 1.Staters  ************** ");
				    System.out.println("==============================");
					System.out.println("  1.Masala Papad     RS.20");
					System.out.println("  2.Papdi chat       RS.20");
					System.out.println("  3.Khaman Dhokala   RS.50");
					System.out.println("  4.Dahi Vada        RS.30");
					System.out.println("===============================");
					System.out.println("Enter Your choice:  ");
					choice2=sc.nextInt();
					System.out.println("enter quantity");
					 quantity=sc.nextInt();
					
					switch(choice2)
					{ case 1:
						//update total and order
						total+=20*quantity;
						order+="\nMasala Papad \t RS.20";
						System.out.println("You have selected *Masala Papad*");
						break;
					case 2:
							total+=20*quantity;
							order+="\nPapadi chat\t RS.20";
							System.out.println("You have selected *Papdi Chat* ");
							break;
					case 3:
						total+=50*quantity;
						order+="\nKhaman Dhokala \t RS.50";
						System.out.println("You have selected *Khaman Dhokala*");
						break;
					case 4:
						total+=30*quantity;
						order+="\nDahi Vada \t RS.30";
						System.out.println("You have selected *Dahi Vada* ");
						break;
					}
					
				break;
					
				
			case 2:
				System.out.println("       2.Main Course            ");
				System.out.println("================================");
				System.out.println("   1.paneer tikka       RS.120");
				System.out.println("   2. Mutton Birayani   RS.400");
				System.out.println("   3.Chiken Curry       RS.160");
				System.out.println( "  4.Mix Veg            RS.180");
				System.out.println("==================================");
				System.out.println("enter your choice:");
				choice2=sc.nextInt();
				System.out.println("enter quantity");
				 quantity=sc.nextInt();
				
				switch(choice2)
				{
				case 1:
					total+=120*quantity;
					order+="\npaneer tikka \t RS.120";
					System.out.println("You have selected  ==paneer tikka== ");
					break;
				case 2:
						total+=400*quantity;
						order+="\nMutton Birayani \t RS.400";
						System.out.println("You have selected ==Mutton Birayani== ");
						break;
				case 3:
					total+=160*quantity;
					order+="\nchiken curry \t RS.160";
					System.out.println("You have selected ==Chiken curry== ");
					break;
				case 4:
					total+=180*quantity;
					order+="\nMix veg \t RS.180";
					System.out.println("You have selected ==Mix Veg== ");
					break;
				}
			break;
			case 3:
				System.out.println("        3.Desert                   ");
				System.out.println("===================================");
				System.out.println("   1.Smoothie cake      RS.120");
				System.out.println("   2.Cupcake            RS.140");
				System.out.println("   3.ice cream          RS.160");
				System.out.println("   4.Chocalate brownie  RS.180");
				System.out.println("=====================================");
				System.out.println("Enter your choice: ");
				choice2=sc.nextInt();
				System.out.println("enter quantity");
				 quantity=sc.nextInt();
				
				switch(choice2)
				{
				case 1:
					total+=120*quantity;
					order+="\nSmoothie cake  \t RS.120";
					System.out.println("You have selected ==Smoothie cake== ");
					break;
				case 2:
						total+=140*quantity;
						order+="\nCupcake \t RS.140";
						System.out.println("You have selected ==Cupcake==");
						break;
				case 3:
					total+=160*quantity;
					order+="\nice cream \t RS.160";
					System.out.println("You have selected ==Ice cream== ");
					break;
				case 4:
					total+=180*quantity;
					order+="\nChocalate brownie \t RS.180";
					System.out.println("You have selected ==Chocalate Brownie== ");
					break;
				}
			break;
			case 4:
				System.out.println("         4.Cold Drinks             ");
				System.out.println("===================================");
				System.out.println("     1.Jal jeera            RS.20");
				System.out.println("     2.Cold Coffee          RS.30");
				System.out.println("     3.Lassi                RS.30");
				System.out.println("     4.Rooh Afja sharbat    RS.20");
				System.out.println("===================================");
				System.out.println("Eneter your choice:");
		    	choice2=sc.nextInt();
		    	System.out.println("enter quantity");
				quantity=sc.nextInt();
				
				switch(choice2)
				{
				case 1:
					total+=20*quantity;
					order+="\njal jeera  \t RS.20";
					System.out.println("You have selected ==Jal jeera== ");
					break;
				case 2:
						total+=30*quantity;
						order+="\nCold coffee\t RS.30";
						System.out.println("You have selected ==Cold coffee== ");
						break;
				case 3:
					total+=30*quantity;
					order+="\nLassi \t RS.30";
					System.out.println("You have selected ==Lassi== ");
					break;
				case 4:
					total+=20*quantity;
					order+="\nRooh Afja shrabat \t Rs.20";
					System.out.println("You have selected ==Rooh Afja shrabat==");
					break;
				}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			
			System.out.println("Do you want to add any other ITEM YES/NO");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');//loop for repeating quantity selection
		System.out.println("Thanks for coming :) \nVisit Again");
		System.out.println("Your Orders:\n"+order);
		System.out.println("Your total Bill amount is : "+total);
		double gst=total*(0.05);
		double finalbill=total+gst;
		System.out.println("Your Final Bill ==="+finalbill+"===With gst");
		System.out.println("Pay by Gpay or CASH");
		
		//Payment method choice
		System.out.println("Select payment method:");
		System.out.println("1.Gpay");
		System.out.println("2.cash");
		int paymentchoice=sc.nextInt();
		
		//Process payment based on choice
		switch(paymentchoice) {
		case 1:
			System.out.println("Please proceed with Gpay payment:");
			break;
		case 2:
			System.out.println("Please make the Payment in cash:");
			break;
        default:
        	System.out.println("Invalid choice:");
        	break;
		}
	}

}




	