import java.util.Scanner;

public class Practice18{
	
	public static void main (String args[]){
	
		System.out.println("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int f = factorial(n);
		
		System.out.println(n + "! is " + f);
	}
	
	public static int factorial(int num){
		int f;
		if(num == 0){
			return f = 1;
		}
		else{
			return num * factorial(num-1);
		}
		//System.out.println(num + "! is " + f);
	}
}