public class RAMOS_MP3{
	public static void main(String args[]){
	System.out.println("\n");	
	double money = (double) 2887.50;
	int thousands = (int) (money / 1000);
	int fivehundreds = (int) (money % 1000 /500);
	int twohundred = (int) (money % 1000 % 500 / 200);
	int hundreds = (int) (money % 1000 % 500 % 200 / 100);
	int fifty = (int) (money  % 1000 % 100 / 50);
	int twenty = (int) (money % 1000 % 500 % 200 %100 % 50 / 20);
	int tens = (int) (money % 100 % 50 / 10);
	int fives = (int) (money % 10 / 5);
	int ones = (int) (money / 1 % 10 % 5);
	int cents = (int) (money % 1 / 0.25);
	System.out.println("Amount = " + money);
	System.out.println("\n");
	System.out.println("1,000.00 = " + thousands);
	System.out.println("  500.00 = " + fivehundreds);
	System.out.println("  200.00 = " + twohundred);
	System.out.println("  100.00 = " + hundreds);
	System.out.println("   50.00 = " + fifty);
	System.out.println("   20.00 = " + twenty);
	System.out.println("   10.00 = " + tens);
	System.out.println("    5.00 = " + fives);
	System.out.println("    1.00 = " + ones);
	System.out.println("     .25 = " + cents);
	}
}