import java.util.Scanner;
public class RAMOS_FMP2{
	public static void main(String args[]){
		int temp, swap;
		int arr[] = new int [10];
		Scanner in = new Scanner(System.in);
		System.out.println( "Original Order");
			for (int current = 0; current < arr.length; current++){
				System.out.println("arr [" + current + "] :");
				arr[current]= in.nextInt();
			}
	do{
		swap=0;
		for(int current = 0; current < arr.length-1; current++){
			if (arr[current]> arr [current + 1]){
				temp = arr [current];
				arr [current] = arr [current + 1];
				arr [current +1] = temp;
				swap = 1;
			}
		}
	}while(swap == 1);
	
	System.out.println("Numbers in Ascending Order: " );
      	for(int current = 0; current < arr.length; current++){
		System.out.println( "arr [" + current+"]\t " +arr[current]);
		}	
		do{
		swap=0;
			for(int current = 0; current > arr.length-1; current++){
			if (arr[current]> arr [current + 1]){
				temp = arr [current];
				arr [current] = arr [current + 1];
				arr [current +1] = temp;
				swap = 1;
				}
			}
		}while(swap == 1);
			System.out.println("Numbers in Descending Order: " );
			for(int i = 9 ; i >= 0; i--){
			System.out.println("arr ["+i+"]\t " +arr[i]);
		}

	}
}