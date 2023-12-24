import java.util.Scanner;

public class RAMOS_FMP1 {
	
	public static void main(String args[]) throws Exception{
		
		int firstInteger;
		int secondInteger;
		int prod = 0;
		int quo = 0;
		int mod = 0;
		
		Scanner in = new Scanner(System.in);
			System.out.print("\n Enter 1st integer: ");
			firstInteger = in.nextInt();
			
			System.out.print("\n Enter 2nd integer: ");
			secondInteger =in.nextInt();
			
			for(int i=0;i<firstInteger;i++){
				prod = prod + secondInteger;
			}	
				
				//while(firstInteger>=secondInteger){
					//firstInteger = firstInteger - secondInteger;
					//++quo;
				//}
				System.out.println("\n Product: " + prod);				
				//System.out.println("\n Quotient: " + quo);
				//System.out.println("\n Remainder: " + firstInteger);
	}
}