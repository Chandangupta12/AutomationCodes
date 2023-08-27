package Chureka;
class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name; 
//System.out.println(" id  "+id+"\n"+" name  "+name);
}  
}
class Emp extends Person{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
} 
public class tset1 {

	public static void main(String[] args) {
		Emp s=new Emp(123,"chandan",123300);
		s.display();
	}

}
