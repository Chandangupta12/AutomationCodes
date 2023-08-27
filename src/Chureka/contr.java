package Chureka;
class dev{
	static int id(int d,int c)
	{
		return	d/c;
	}
}
public class contr {
    static int product(int a, int b)
    {
        return a * b;
    }
  
    // this method calculates
    // sum of two numbers
    static int sum(int a, int b)
    {
        return a + b;
    }
	
	public static void main(String[] args) {
		 // this method calculates
	    // product of two numbers
		       int p = product(5, 10);
		        int s = sum(5, 10);
		  
		        // print product
		        System.out.println("Product: " + p);
		  
		        // print sum
		        System.out.println("Sum: " + s);
		        
		    
	}

}
