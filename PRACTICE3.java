public class PRACTICE3{
	public static void main(String args []){
		//Arithmetic operation
		int num1 = 10; int num2 = 3; 
		int result;
		float num3 = 10; 
		float num4 = 3;
		int sum = num1 + num2;
		int diff = num1 - num2;
		int prod = num1 * num2;
		float quo = num3 / num4;
		int mod = num1 % num2;		
		int oper=2;
		
		//if condition
		System.out.println("if condition");
		if (oper==1){
			System.out.println("Addition");
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
		}
		System.out.println("Hello...");
		if (oper==2){
			System.out.println("Subtraction");
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + diff);
		}
		System.out.println("Hello...");
		if (oper==3){
			System.out.println("Multiplication");
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + prod);
		}
		System.out.println("Hello...");
		if (oper==4){
			System.out.println("Division");
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + quo);
		}
		System.out.println("Hello...");
		if (oper==5){
			System.out.println("Modulo Division");
			result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + mod);
		}
		System.out.println("Hello...");
		
		//Nested if
		System.out.println("\nNested if");
		if (oper==1){
			System.out.println("Hello...");
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
		}
		else{
			if (oper==2){
			System.out.println("Hello...");
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + diff);
			}
			else{
				if (oper==3){
				System.out.println("Hello...");
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + prod);
				}
				else{
					if (oper==4){
					System.out.println("hello...");
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + quo);
					}
					else{
						if (oper==5){
						System.out.println("hello...");
						result = num1 % num2;
						System.out.println(num1 + " % " + num2 + " = " + mod);
						}
					}//4th else	
				}//3rd else
			}//2nd else	
		}//1st else
			
	//if-else if ladder		
	System.out.println("\nif-else if ladder");
		if (oper == 1){
		System.out.println("Addition");
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		}
		else if (oper == 2){
		System.out.println("Subtraction");
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		}
		else if (oper == 3){
		System.out.println("Multiplication");
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		}
		else if (oper == 4){
		System.out.println("Division");
		quo = num3 / num4;
		System.out.println(num3 + " / " + num4 + " = " + quo);
		}
		else if (oper == 5){
		System.out.println("Modulo Division");
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		}
		
		
	//Switch conditional Structure	
	System.out.println("\nSwitch conditional Structure");
   
	switch(2){
	    case 1:
				System.out.println("Hello..");
	            result = num1 + num2;
			    System.out.println(num1 + " + " + num2 + " = " + result);
			    break;
	    case 2:
				System.out.println("Hello..");
	            result = num1 - num2;
			    System.out.println(num1 + " - " + num2 + " = " + result);
			    break;
		case 3:
				System.out.println("Hello..");	
	            result = num1 * num2;
			    System.out.println(num1 + " * " + num2 + " = " + result);
			    break;
		case 4:
				System.out.println("Hello..");
	            quo = num1 / num2;
			    System.out.println(num3 + " / " + num4 + " = " + quo);
			    break;
		default:
				System.out.println("Hello..");
		        result = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + result);
				
				
   }// end of switch	
   
	}
}