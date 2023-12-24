import java.util.*;
	public class Menusx {
		public static void main(String args[]) {
		
		
			displayMenu();
			getFoodFromUser();
			getQuantity();
			
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
		
		public static int getFoodFromUser(){
			String menus [] =  {"",
								"HAMBURGER",
								"CHEESEBURGER", 
								"CHICKEN MEAL", 
								"SPAGHETTI", 
								"FRENCH FRIES"};			   						   
			Scanner sc = new Scanner(System.in);
			int item = 0;
			int choice;
			int quantity;
			int total;
			String ans;

			do{
				do{
					System.out.print("\nSELECT AN ITEM: ");
					item = sc.nextInt();
				}while(item < 1 || item > 5);	
					System.out.println("You chose: " + menus[item]);

				
				System.out.print("\nSELECT ANOTHER ITEM?[Y/N]: ");
				sc.nextLine();
				ans = sc.nextLine();
			}while (ans.equalsIgnoreCase("y"));
			return choice;
		}	
		
		public static double getQuantity() {
			System.out.println("Enter quantity");
			double quantity = input.nextDouble();
			subTotal(quantity, itemPrice);
			return quantity;
		}
		
	}	