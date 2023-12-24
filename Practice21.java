public class Practice21{
	public static void main (String[] args){

    System.out.println(sum(10,20));
    System.out.println(sum(10,20,30));
	System.out.println(sum(10,20,30,40));
	System.out.println(sum(10,20,.5));
    }

    public static int sum (int num1, int num2){
        System.out.println("int int");
        return num1 + num2;
    }
	

    public static int sum (int num1, int num2, int num3){
        System.out.println("int int int");
        return num1 + num2 + num3;
    }
	
	public static int sum (int num1, int num2, int num3, int num4){
        System.out.println("int int int int");
        return num1 + num2 + num3 + num4;
    }
	
	public static int sum (int...num){
        System.out.println("var args");
		
		int s = 0;
		
		    for (int i : num){
			s = s + i;
			}
		
		return s;
		
    }
	
	public static double sum (double...num){
        System.out.println("var args2");
        double s = 0;
	
	        for(double i:num){
		    s= s + 1;
			}
	
	return s;
	
	}
	
}