import java.util.Scanner;

public class Practice17{
	
	public static void main (String args[]){
	
		System.out.println("Enter an integer: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int f = 1;
		for(int i=1;i<=num;i++){
			f = f * i;
		}
		
		System.out.println(num + "! is " + f);
		
	}
}