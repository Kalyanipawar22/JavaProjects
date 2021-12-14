package CarDealer;
import java.util.*;
public class Car implements CarModel, CarEngine,CarColor,CarInterior,CarAvailability {
	public static void main(String args[])
	{
		Car ob = new Car();
		System.out.print("Welcome To Car Dealership \n"
				+ "Choose Car Model \n"
				+ "1. Swift \n"
				+ "2. Baleno \n"
				+ "3. Ciaz \n"
				+ "4. Ertiga\n"
				+ "5. XL6\n"
				+ "6. Alto");
		Scanner sc= new Scanner(System.in);
		int Mnum =sc.nextInt();
		ob.model(Mnum);
		
		
		//car Engine
		System.out.println("Choose Engine Type \n"
				+ "1.CnG \n"
				+ "2.Electric"
				);
		Scanner en =new Scanner(System.in);
		int Engine =en.nextInt();
		ob.engine(Engine);
		
		//Car colours
		
		System.out.println("Choose Car Colour \n"
				+ "1. Black \n"
				+ "2. White \n"
				+ "3. Silver \n"
				+ "4. Red \n"
				+ "5. Yellow");
		Scanner cc =new Scanner(System.in);
		int carp=en.nextInt();
		ob.color(carp);
		
		// choose car Interior
		System.out.println("Choose Car Interior \n"
				+ "1.Wood"
				+ "2.Metal"
				+ "3.Gold"
				+ "4.Silver");
		Scanner ine =new Scanner(System.in);
		int inet=en.nextInt();
		ob.interior(inet);
		
		
		
		ob.available();
		
		
		
	}
	public void model(int Mnum)
	{
		String modelarr[]= {"Invalid","Swift","Baleno","Ciaz","Ertiga","Alto"};
				System.out.println(Mnum);
				System.out.println("You have choosen"+modelarr[Mnum]+",Excellant choice");
	}
	public void engine(int Engine)
	{
			String engarr[]= {"None","Petrol","Diesel","CNG","Electric"};
			System.out.println(Engine);
			System.out.println();
	}
	public void color(int carp)
	{
		String carpaint[]= {"None","Black","White","Sliver","red"};
		System.out.println("You have choosen"+carpaint[carp]+"Color");
	}
	public void interior(int inet)
	{
		String interior[]= {"None","Wood","Metal","Gold","silver"};
		System.out.println("You have choosen "+interior[inet]+"interior");
		
	}
	public void available()
	{
		String avail[]= {"None","Availabel","Not Availabel"};
		Random rnd =new Random();
		int randomint =rnd.nextInt();
		System.out.println(avail[randomint]);
	}
}
