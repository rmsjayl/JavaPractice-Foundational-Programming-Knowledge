import java.util.*;

public class Menu {
	public static void displayMenu() {
	//DISPLAY MENU
	int choice = 0;
		System.out.println(" ====> MENU <==== ");
		String menu[] = {"[0]HAMBURGER......Php40.00",
						 "[1]CHEESEBURGER...Php45.00" , 
						 "[2]CHICKEN MEAL...Php70.00" , 
						 "[3]SPAGHETTI......Php50.00" , 
						 "[4]FRENCH FRIES...Php30.00"};
		double hamburger = 45.00;
		double cheeseburger = 45.00;
		double chicken = 70.00;
		double spaghetti = 50.00;
		double fries = 30.00;
		double price = 0.0;
		
		for(int i = 0; i<menu.length; i++){
			System.out.println(menu[i]);
		}
	}
	
	//CHOOSE ITEM FROM USER
	public static int getItemFromUser(){
		String menus [] = {"HAMBURGER",
						 "CHEESEBURGER" , 
						 "CHICKEN MEAL" , 
						 "SPAGHETTI" , 
						 "FRENCH FRIES"};
		Scanner sc = new Scanner(System.in);
		int item;
		int quantity;
		String s;
		do{
			System.out.print("Select an item: ");
			item = sc.nextInt();
		}while ( item < 0 || item > 4 );
		//ITEM SELECTED
		System.out.println("You choose: " + menus[item]);
		//QUANTITY OF THE ITEM SELECTED
		System.out.print("Enter Quantity of " + menus[item] + ": ");
		quantity = sc.nextInt();
		//DECISION: Y / N
		System.out.print("Select another item? [Y/N]: ");
		s = sc.next();
	}
	
}	