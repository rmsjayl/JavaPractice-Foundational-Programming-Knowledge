public class FPractice11 {
	public static void main(String args[]){
		
		//ARRAYCOPY
		/*
		int orig[] = {1,2,3,4,5};
		int temp[] = {10,9,8,7,6,5,4,3,2,1};
		
		System.arraycopy(orig,2,temp,7,3);
		orig = temp;
		temp = null;
		System.out.println("NEW Array: ");
		for(int num:orig){
			System.out.print(num + "\t");
		}
		*/
		
		//SUM
		int sum=0;
		
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
			sum= sum + Integer.parseInt (args[i]);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (double) sum/args.length);

	
		
	}
}
