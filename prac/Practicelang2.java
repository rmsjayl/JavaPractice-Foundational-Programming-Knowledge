import java.util.*;

	public class Practicelang2 {
			public static void main(String args []) {
				
				System.out.println("Enter value for quiz: ");
				Scanner in = new Scanner(System.in);
				int quiz[] = new int [4];
				
				
				
				for(int i = 0; i < quiz.length; i++){
					System.out.println("Enter value for quiz [" + i + "]: ");
					quiz[i] = in.nextInt();
				}
			System.out.println("You have entered your quiz score: ");
			System.out.println(quiz[0]);
			System.out.println(quiz[1]);
			System.out.println(quiz[2]);
			System.out.println(quiz[3]);
		}	
	}	