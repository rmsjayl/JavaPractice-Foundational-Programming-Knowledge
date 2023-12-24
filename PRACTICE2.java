public class PRACTICE2{
	public static void main(String args []){
		
		//Arithmetic Operation
		int num1 = 10;
		int num2 = 3;
		float num3 = 10;
		float num4 = 3;
		int sum = num1 + num2;
		int diff = num1 - num2;
		int prod = num1 * num2;
		float quo = num3 / num4;
		int mod = num1 % num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + diff);
		System.out.println(num1 + " * " + num2 + " = " + prod);
		System.out.println(num3 + " / " + num4 + " = " + quo);
		System.out.println(num1 + " % " + num2 + " = " + mod);
		
		//The shift left (<<) operator
		int x = 13;
		System.out.println(x << 2);
		//The shift right (>>) operator
		System.out.println(x >> 2);
		
		//Unsigned shift right (>>>) operator
		int y = 1357;
		System.out.println(y >>> 5);
		int z = -1357;
		System.out.println(z >>> 5);
		
		//Relational Operators
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		//Bitwise and(&) operators 
		int a = 5, b = 10;
		System.out.println(a & b);
		//Bitwise or(|) operators
		System.out.println(a | b);
		//Bitwise xor(^) operators
		System.out.println(a ^ b);
		
		//Logical and(&) operator
		System.out.println((a > 5) & (++b != 10));
		System.out.println("a = " + a + "\tb = " + b);
		//The short circuit(&&) and operator 
		System.out.println((a > 5) && (++b != 10));
		System.out.println("a = " + a + "\tb = " + b);
		
		//Logical or(|) operator
		System.out.println((a < 5) | (++b != 10));
		System.out.println("a = " + a + "\tb = " + b);
		//The short circuit(||) or operator 
		System.out.println((a <= 5) || (++b != 10));
		System.out.println("a = " + a + "\tb = " + b);
		
		//Short hand operators
		System.out.println(a += 2);
		System.out.println(a -= 2);
		System.out.println(a *= 2);
		System.out.println(a /= 2);
		System.out.println(a %= 2);
		System.out.println(a <<= 2);
		System.out.println(a >>= 2);
		System.out.println(a >>>= 2);
		System.out.println(a &= 2);
		System.out.println(a ^= 2);
		System.out.println(a |= 2);
		
		//ternary operator
		int quiz = 70;
		System.out.println((quiz >= 70) ? "Pass" : "Fail");
		System.out.println((quiz <= 60) ? "Pass" : "Fail");
	}
}	