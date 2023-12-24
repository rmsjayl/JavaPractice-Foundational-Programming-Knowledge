import java.util.Scanner;

public class Practice8{
	
	public static void main (String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int quiz[] = new int[4];
		for(int idx = 0; idx < quiz.length; idx++){
		System.out.println("Enter value for quiz[" + idx + "]: ");
		quiz[idx]=sc.nextInt();
		}
		
		System.out.println("Manual Printing");
		System.out.println(quiz[0]);
		System.out.println(quiz[1]);
		System.out.println(quiz[2]);
		System.out.println(quiz[3]);
		
		System.out.println("\nUsing For Statement");
		
		
		for(int i = 0; i <=3; i++){
		System.out.println("Quiz [" + i + "]: " + quiz[i]);
		}
		
		/*
		below is wrong hikhok
		
		System.out.println("\nUsing For Statement");
		
		for(int i = 0; i <= quiz.length; i++){
			System.out.println(quiz[i]);
		}
		*/
		
		// more efficient way to print array :)
        System.out.println("\nUsing For Statement");
		
        for(int i = 0; i < quiz.length; i++){
			System.out.println(quiz[i]);
		}
		
		System.out.println("\nEnhanced For Statement");
		
		for(int q : quiz){
			System.out.println(q);
		}
		
		}
	}
	
