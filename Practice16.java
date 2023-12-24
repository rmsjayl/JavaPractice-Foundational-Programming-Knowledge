import java.util.Scanner;

public class Practice16{
	
	public static void main (String args[]){
		
		int numOne = value();
		int numTwo = value();
		
		greetings();
		greetings("Chris");
		greetings("Chris",21);
		
		add(numOne,numTwo);
	
	}
	
	public static void greetings(){
		System.out.println("Hello");
	}
	
	public static void greetings(String fname){
		System.out.println("Hello "+fname);
	}
	public static void greetings(String fname, int age){
		System.out.println("Name: "+fname+"\nAge: "+age );
	}
	
	public static void add(int num1, int num2){
		System.out.println("The sum is: " + (num1 + num2));
	}
	
	public static int value(){
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	
}