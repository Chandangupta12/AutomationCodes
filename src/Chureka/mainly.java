package Chureka;
class statc{
	// Static method
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }
	
}
public class mainly {
	  // Main method
	public static void main(String[] args) {
		
		statc s=new statc();
		s.myPublicMethod();
		statc.myStaticMethod();
	}
	}


