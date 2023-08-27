package Chureka;
import java.io.File;
import java.io.IOException;
public class filecreat {

	public static void main(String[] args) {
		 try {
		      File myObj = new File("E:\\file\\filenamen.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        System.out.println("Wrightable: " + myObj.canRead());
		        System.out.println("Wrightable: " + myObj.canWrite());
		        System.out.println("Wrightable: " + myObj.length());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();

	}

}
}
