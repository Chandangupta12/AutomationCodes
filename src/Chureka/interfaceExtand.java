package Chureka;

interface A
{
	void fun1();
	void fun2();
}
interface B
{
	void fun3();// its method also have in Y
	void fun4();
	void fun5(int k);
}
interface Y extends B{
	void fun3();// its method also have in B
	void  fun5(int a, int f);
}

 class drive implements A,Y {
	public void fun1() {
		System.out.println("interface A");
	}
	public  void fun2() {
		System.out.println("interface A!");
		
		}
	public void fun3() {
		System.out.println("interface B and Y");
	}
	public void fun4() {
		System.out.println("interface B2");
	}
	public void fun5(int e) {
		System.out.println("interface B");
		System.out.println("interface B----->"+e);
		//System.out.println("interface B"+k);
	}
	public void fun5(int s,int g) {
		System.out.println("interface Y");
	}
	 void disply() {
		 System.out.println("this is method of class driver");
	 }
}
 
 
 class stat extends drive{
	 void view () {
		 System.out.println("this is method of stst class");
	 }
//	 public void fun1() {
//			System.out.println("interface A which implement in stst");
//		}
//	 void disply() {
//		 System.out.println("this is method of class stat");
//	 }
	 
 }
public class interfaceExtand {

	public static void main(String[] args) {
		A st=new stat();
		st.fun1();

		

//		A obj=new drive();  //instance of object work only own interface m.ethods , it not work other interface or class methods or object
//		=obj.fun1();
//		obj.fun2();
//		
//		B obj1=new drive();
//		obj1.fun4();
//		obj1.fun3();
//		
//		Y obj2 =new drive();
//		obj2.fun3();
//		obj2.fun4();
//		obj2.fun5(34);//use to obj of Y instance
//		obj1.fun5(124);// use to obj of B instance
//		//	obj1.fun5(124,234);// error
//		obj2.fun5(124,234);
//
//drive drv=new drive();
//drv.fun3();
	}

}
