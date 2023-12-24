import java.util.Scanner;

public class PRACTICE4{
	public static void main(String args[])throws Exception{
		
	int year;
	
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter year: ");
		year = in.nextInt();
		while(year<0){
			System.out.println(year + " is invalid year \n");
			System.out.println(" Enter another year: ");
			year = in.nextInt();
		}
		
		if(year % 400 == 0 ){
			System.out.print(year + " is a leap year.");
		}	
		else if (year % 100 == 0 ){
			System.out.println(year + " is not a leap year.");
		}	
		else if (year % 4 == 0){
			System.out.println(year + " is a leap year.");
		}	
		else {
			System.out.println(year + " is not a leap year.");
		}
	}	
}		