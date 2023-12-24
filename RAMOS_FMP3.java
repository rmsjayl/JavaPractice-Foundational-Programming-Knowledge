import java.util.*;
public class RAMOS_FMP3{
	public static void main(String args []){
	
		int A[][] = new int [3][3];
		int B[][] = new int [3][3];
		int C[][] = new int [3][3];
	
		Scanner sc = new Scanner(System.in);
			System.out.println("Input Matrix A: ");
		
		for(int row=0;row<A.length;row++){
			for(int col=0;col<A.length;col++){
		System.out.print("A[" + row + "][" + col + "]");
		A[row][col] = sc.nextInt();
			}
		}
		System.out.println("Input Matrix B: ");
			for(int row=0;row<B.length;row++){
				for(int col=0;col<B.length;col++){
				System.out.print("B[" + row + "][" + col + "]");
				B[row][col] = sc.nextInt();
			}
		}
			for(int row=0;row<C.length;row++){
				for(int col=0;col<C.length;col++){
				C[row][col] = A[row][col]+B[row][col];
				}
			}System.out.println("\nMatrix A:");
				for(int row=0;row<A.length;row++){
					for(int col=0;col<A.length;col++){
					System.out.print("\t" + A[row][col]);
				}
			System.out.println();
			}System.out.println("\nMatrix B:");
			for(int row=0;row<B.length;row++){
				for(int col=0;col<B.length;col++){
				System.out.print("\t" + B[row][col]);
			}
			System.out.println();
			}System.out.println("\nMatrix C:");
			for(int row=0;row<C.length;row++){
				for(int col=0;col<C.length;col++){
				System.out.print("\t" + C[row][col]);	
			}
			System.out.println();
		}
	}
}