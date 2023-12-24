public class PRACTICE5 { 
	public static void main(String args[]){
		int n2567;	
		int origThousands = num1 / 1000;
		int Hundreds = num1 % 1000;
		int origHundreds = Hundreds / 100;
		int Tens = Hundreds % 100;
		int origTens = Tens / 10;
		int origOnes = Tens % 10;
		int newOnes = origThousands;
		int newTens = origHundreds;
		int newHundreds = origTens;
		int newThousands = origOnes;
		
		System.out.println("Original Number = " + num1);
		System.out.println("Reversed Number = " + (newThousands) + (newHundreds) + (newTens) + (newOnes));
		
		if (num1<0){
			System.out.println("-" + (newThousands*-1) + (newHundreds*-1) + (newTens*-1) + (newOnes*-1));
		}
		else {
			System.out.println(""+newThousands+newHundreds+newTens+newOnes);
		}	
	
	}
}