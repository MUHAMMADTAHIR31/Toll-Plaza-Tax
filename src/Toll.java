import java.util.*;
class Toll{
public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
	System.out.print("1.Super Highway(M-9) \n2.National Highway \n3.Motorways(M-1,M-2,M-3) \n4.Kohat Tunnel \n5.IMDCW \n\nEnter Highway : ");
	int num=ob.nextInt();
	switch(num)
	{
	case 1:
	{
	System.out.print("1.Car/Land Cruiser/Pajero/Tractor without trolly & Equivalent \n2.Wagon upto 24 seats/Coaster/Mini bus Mazda chasis upto 24 seats and Mini Trucks \n3.Busses greater than 25 seats \n4.2 Axle,3 Axle,Tractor with trolly \n5.4/5/6 Axle Trucks(Articulted \n\nEnter Vehicle Type: ");
		int num2=ob.nextInt();
	switch(num2)
	{
		case 1:
		{
		System.out.println("Your Tax is: 30");
		System.out.print("Enter Note: ");
			int rupee=ob.nextInt();
			
			int note_5000=5000;
			int note_1000=1000;
			int note_500=500;
			int note_100=100;
			int note_50=50;
			int note_40=40;
			int note_30=30;
			if(rupee==note_5000)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_5000-30));
			if(rupee==note_1000)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_1000-30));
			if(rupee==note_500)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_500-30));
			if(rupee==note_100)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_100-30));
			if(rupee==note_50)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_50-30));
			if(rupee==note_40)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_40-30));
			if(rupee==note_30)
				System.out.println("\nYour tax is: "+(30)+"\nYour remaining Money= "+(note_30-30));
		}
		break;
	   case 2:
	   {
	   System.out.println("Your Tax is: 45");
	   System.out.print("Enter Note: ");
			 int rupee2=ob.nextInt();
			 int note2_5000=5000;
			 int note2_1000=1000;
			 int note2_500=500;
			 int note2_100=100;
			 int note2_60=60;
			 int note2_50=50;
			 
			if(rupee2==note2_5000)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_5000-45));
			if(rupee2==note2_1000)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_1000-45));
			if(rupee2==note2_500)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_500-45));
			if(rupee2==note2_100)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_100-45));
			if(rupee2==note2_60)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_60-45));
			if(rupee2==note2_50)
				System.out.println("\nYour tax is: "+(45)+"\nYour remaining Money= "+(note2_50-45));
	   }	
	   break;
	   case 3:
	   {
	   System.out.println("Your Tax is: 75");
	   System.out.print("Enter Note: ");
			int rupee3=ob.nextInt();
			int note3_5000=5000;
			int note3_1000=1000;
			int note3_500=500;
			int note3_100=100;
			int note3_80=80;
			if(rupee3==note3_5000)
				System.out.println("\nYour tax is: "+(75)+"\nYour remaining Money= "+(note3_5000-75));
			if(rupee3==note3_1000)
				System.out.println("\nYour tax is: "+(75)+"\nYour remaining Money= "+(note3_1000-75));
			if(rupee3==note3_500)
				System.out.println("\nYour tax is: "+(75)+"\nYour remaining Money= "+(note3_500-75));
			if(rupee3==note3_100)
				System.out.println("\nYour tax is: "+(75)+"\nYour remaining Money= "+(note3_100-75));
			if(rupee3==note3_80)
				System.out.println("\nYour tax is: "+(75)+"\nYour remaining Money= "+(note3_80-75));
	   }	
	   break;
			case 4:
			{
		System.out.println("Your Tax is: 90");
			System.out.print("Enter Note: ");
			int rupee4=ob.nextInt();
			int note4_5000=5000;
			int note4_1000=1000;
			int note4_500=500;
			int note4_100=100;
			int note4_90=90;
			
			if(rupee4==note4_5000)
				System.out.println("\nYour tax is: "+(90)+"\nYour remaining Money= "+(note4_5000-90));
			if(rupee4==note4_1000)
				System.out.println("\nYour tax is: "+(90)+"\nYour remaining Money= "+(note4_1000-90));
			if(rupee4==note4_500)
				System.out.println("\nYour tax is: "+(90)+"\nYour remaining Money= "+(note4_500-90));
			if(rupee4==note4_100)
				System.out.println("\nYour tax is: "+(90)+"\nYour remaining Money= "+(note4_100-90));
			if(rupee4==note4_90)
				System.out.println("\nYour tax is: "+(90)+"\nYour remaining Money= "+(note4_90-90));
			}
			break;
			case 5:
			{
			System.out.println("Your Tax is: 175");
			System.out.print("Enter Note: ");
			int rupee5=ob.nextInt();
			int note5_5000=5000;
			int note5_1000=1000;
			int note5_500=500;
			int note5_200=200;
			int note5_180=180;
			int note5_175=175;
			if(rupee5==note5_5000)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_5000-175));
			if(rupee5==note5_1000)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_1000-175));
			if(rupee5==note5_500)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_500-175));
			if(rupee5==note5_200)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_200-175));
			if(rupee5==note5_180)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_180-175));
			if(rupee5==note5_175)
				System.out.println("\nYour tax is: "+(175)+"\nYour remaining Money= "+(note5_175-175));
			}
			break;
	}//close nested switch statements
	
	}//case 1 statements end
	case 2:
	{}//case 2 statements end
	case 3:
	{}//case 3 statements end
	case 4:
	{}//case 4 statements end
	}//switch end statements
	}//end main method
}//end class method