import java.util.Scanner;
	public class SPractice{
		public static void main(String args []) throws Exception {
			int pin = 0;
			int attempt = 0;

			Scanner sc = new Scanner(System.in);
			System.out.print(" Enter your pin: ");
				pin = sc.nextInt();
			
			for(x = 1; x<=attempt; x++)
				attempt = attempt + 1;
			if(pin != 1222){
					System.out.print(" Please Enter Another Pin Again : ");
					pin = sc.nextInt();
			}	
				else if (pin == 1222){
					System.out.print(" You may proceed! ");
				}	
				else {
					System.out.print(" Invalid pin! Try again\n");
				}	
			}	
		}
	