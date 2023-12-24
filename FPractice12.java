public class FPractice12{
    public static void main (String args[]){
	
    int mult[][] = new int[10][10];
	
		// Store values to array
			for(int row = 1; row <= 10; row++){
				for(int col = 1; col <= 10; col++){
				mult[row-1][col-1]=row*col;
			}
		}
	
		//Extract and Display values from array
			for(int row = 1; row <= 10; row++){
				for(int col = 1; col <= 10; col++){
				System.out.print("\t" + mult[row-1][col-1]);
			}
			System.out.println();
		}
	
	}
	
}