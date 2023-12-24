import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

double price=0;
System.out.println("Here is the menu");
double ham=3.50;
double cheese=4.00;
double chick=2.50;
double salad=5.50;
double fries=1.50;

String []menu={"hamburger","cheeseburger","chicken","salad","fries"};


for(int i=0;i<menu.length;i++){
   


   System.out.print(i+")");
   System.out.println(menu[i]); 

}
System.out.println("Please select an item");
int c=input.nextInt();
while(c<0 || c>4){
   System.out.println(c+ " is an invalid selection. Please enter your choice again");
   c=input.nextInt(); 
} 
System.out.println("you ordered a "+menu[c]);
System.out.println("how many "+menu[c]+" would you like");

int amount;
amount=input.nextInt();
System.out.println(amount);
switch(c){
   
   case(0):
   price=ham*amount;
   break;
   
   case(1):
   price=cheese*amount;
   break;
   
   case(2):
   price=chick*amount;
   break;
   
   case(3):
   price=salad*amount;
   break;
   
   case(4):
   price=fries*amount;
   break;
   
 
}

System.out.println("Would you like anything else y/n. Please enter a y for yes and a n for n");

String ans=input.next();

while(ans.equals("y")){
   System.out.println("please select an item");
   c=input.nextInt();
   
   System.out.println("how many "+menu[c]+ "do you want");
   amount=input.nextInt();
      System.out.println(amount);
   
   switch(c){
   
   case(0):
   price=ham*amount+price;
   break;
   
   case(1):
   price=cheese*amount+price;
   break;
   
   case(2):
   price=chick*amount+price;
   break;
   
   case(3):
   price=salad*amount+price;
   break;
   
   case(4):
   price=fries*amount+price;
   break;
   
   
   
 
}
 System.out.println("Anything else y/n");
 ans=input.next(); 
    
}

System.out.println("youre total is $"+price);

       

        
    }
}