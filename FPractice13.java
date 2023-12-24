import java.util.*;

public class FPractice13{
	public static void main (String args[]){
		
		int irregArray[][] = new int [4][];
		irregArray[0] = new int[3];
		irregArray[1] = new int[5];
		irregArray[2] = new int[1];
		irregArray[3] = new int[4];
	
	
		Scanner s = new Scanner(System.in);
	
			for(int row = 0; row < irregArray.length; row++){
				for(int col = 0; col < irregArray[row].length;col++){
				System.out.print("irregArray[" + row + "] [" + col + "]: ");
				irregArray[row][col] = s.nextInt();
			}
		}
	
			for(int row = 0; row < irregArray.length; row++){
				for(int col = 0; col < irregArray[row].length;col++){
					System.out.print("\t" + irregArray[row][col]);
				}
				System.out.println();
			}
	
	}

}