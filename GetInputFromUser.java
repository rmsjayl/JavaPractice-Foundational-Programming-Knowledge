import java.util.Scanner;

class GetInputFromUser{
	
	public static void main (String args[])throws Exception{
		
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nEnter an integer : ");
		a = in.nextInt();
		System.out.println("You entered an integer " + a);
		System.out.println("\n Enter a Floating Point number : ");
		b = in.nextFloat();
		System.out.println("You entered a float number " + b);
		System.out.print("\nEnter a String : ");
		s = in.next();
		System.out.println("You entered a string : " + s);
		
	}
}