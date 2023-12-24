import java.util.Scanner;
	public class Practicelang1 {
		public static void main(String args []) throws Exception {
			Scanner in = new Scanner(System.in);
			/*
			System.out.print("Enter a number: ");
			int num = in.nextInt();

			if(num>0 ){
				System.out.println (num + " is a positive integer");
			} else if (num<0){
				System.out.println(num + " is a negative integer");
			}
			*/
			
			System.out.print("Enter grades: ");
			int numa = in.nextInt();
			int numb = in.nextInt();
			int numc = in.nextInt();
			int numd = in.nextInt();
			int finalGrade = ((numa+numb+numc+numd)/4);
			
			
				System.out.println("Final Grade : " + numa + " + " + numb + " + " + numc + " + " + numd + " = " + finalGrade);
				
				if(finalGrade >= 75) {
				System.out.println(finalGrade + " Passed");
				}
				else if (finalGrade<=75) {
					System.out.println(finalGrade + "Failed");
				}
				System.out.println("Final Grade: " + finalGrade);
			
			
			
			
			
			
			
			
			
			
			
		}
	}	