import java.util.*;
	public class Practice15{
		
		public static void main (String args []) {
			System.out.print("Original: ");
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			
			String rev = "";
			for(int i = str.length()-1; i>=0; i--){
				rev = rev + str.charAt(i);
			}
			System.out.print("Reverse: " + rev);
			
			
			if(str.compareTo(rev) == 0){
				System.out.println("\nYes, it's a PALINDROME. ");
			}
			else{
			System.out.println("\nNo, it's not a PALINDROME.");
			}
			
		}
	}	