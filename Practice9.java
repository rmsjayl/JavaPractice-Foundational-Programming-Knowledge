public class Practice9{
	
	public static void main (String args[]){
		/*
		int quiz[] = new int[4];
		quiz[0] = 80;
		quiz[1] = 85;
		quiz[2] = 90;
		quiz[3] = 95;
		*/
		
		int quiz[]={80,85,90,95};
		
		System.out.println(quiz[0]);
		System.out.println(quiz[1]);
		System.out.println(quiz[2]);
		System.out.println(quiz[3]);
		
		//System.out.println((quiz[2]+quiz[3])/2);
		
		String coffee[]= {"Americano","Cappuccino","Latte","Java"};
		
		System.out.println("\n"+coffee[0]);
		System.out.println(coffee[1]);
		System.out.println(coffee[2]);
		System.out.println(coffee[3]);
		
		String kape[] = {
			new String("Americano"),
			new String("Cappuccino"),
			new String("Latte"),
			new String("Java")
		};
		
		System.out.println("\n"+kape[0]);
		System.out.println(kape[1]);
		System.out.println(kape[2]);
		System.out.println(kape[3]);
		
		for (String k : kape){
			System.out.println("\n"+k);
		}
		
		String nescafe[] = {
			"Barako",
			"Espresso",
			"Java",
			"Mocha chino"
		};
		
		System.out.println("\nThe coffee lovers choices are:");
		for (String n : nescafe){
			System.out.println(n);
		}
	}
	
}