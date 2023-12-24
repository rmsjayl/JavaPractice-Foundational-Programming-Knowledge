import java.util.*;
	public class Menus {
		public static void main(String args[]) {
		
		
			displayMenu();
			getFoodFromUser();
			//displayTotal();
			
		}
		//END OF PUBLIC STATIC VOID MAIN
		
		public static void displayMenu(){	
			System.out.println("\t\t  ====> MENU <==== ");
			System.out.println("\t[1]HAMBURGER..............Php40.00");
			System.out.println("\t[2]CHEESEBURGER...........Php45.00");
			System.out.println("\t[3]CHICKEN MEAL...........Php70.00"); 
			System.out.println("\t[4]SPAGHETTI..............Php50.00"); 
			System.out.println("\t[5]FRENCH FRIES...........Php30.00");
		}
		
		public static double getFoodFromUser(){
			String menus [] =  {"",
								"HAMBURGER",
								"CHEESEBURGER", 
								"CHICKEN MEAL", 
								"SPAGHETTI", 
								"FRENCH FRIES"};			   						   
			Scanner sc = new Scanner(System.in);
			int item = 1;
			int choice = 0;
			String ans;
			double price = 0.00;
			double change = 0.00;

			do{
				do{
					System.out.print("\nSELECT AN ITEM: ");
					item = sc.nextInt();
				}while(item < 1 || item > 5);	
					System.out.println("You chose: " + menus[item]);
					
				System.out.print("\nENTER QUANTITY OF " + menus[item] + ": ");
				int quantity = sc.nextInt();				
				
				switch(item){	
					case (1):
						price = price + (quantity * 40); 
						System.out.println("You entered " + quantity + " " + menus[item]);
						break;
					case (2):
						price = price + (quantity * 45);
						System.out.println("You entered " + quantity + " " + menus[item]);
						break;
					case (3):
						price = price + (quantity * 70);
						System.out.println("You entered " + quantity + " " + menus[item]);
						break;
					case (4):
						price = price + (quantity * 50);
						System.out.println("You entered " + quantity + " " + menus[item]);						
						break;
					case (5):
						price = price + (quantity * 30);
						System.out.println("You entered " + quantity + " " + menus[item]);
						break;	
				}
				
			System.out.print("\nSELECT ANOTHER ITEM?[Y/N]: ");
			sc.nextLine();
			ans = sc.nextLine();
			}while (ans.equalsIgnoreCase("y"));
			
				System.out.println(" Amount due: " + price);
				System.out.print(" Enter payment: ");
				int payment = sc.nextInt();
			if(payment>change){
				change = payment - price;
			}else
				System.out.println(" Insufficient amount... ");
				System.out.println(" Change: " + change);
			return choice;	
			
		}	
		
		

	}	