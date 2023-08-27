package Chureka;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writetofile {

	public static void main(String[] args) {
		try
		{
	     File myObj = new File("E:\\file\\demowritefile.txt");
	     System.out.println("Onefile crete-->"+myObj.createNewFile());
		FileWriter mywriter = new FileWriter("E:\\file\\demowritefile.txt");
		mywriter.write("this file which write contant");
		mywriter.close();
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();

	}

}
}
