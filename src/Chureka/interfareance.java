package Chureka;
interface Drawer
{
	void  draw();
}
interface pen extends Drawer
{
	void marker();
}
class circle implements Drawer,pen{
	public void draw(){
	System.out.println("draw a circle");
	}
	public void marker(){
	System.out.println("draw a reactangle");	
	}
}
public class interfareance {

	public static void main(String[] args) {
		Drawer d=new circle();
		d.draw();
		 pen p=new circle();
			p.marker();
		 p.draw();
		 circle c=new circle();
		c.draw();
		 c.marker();
	}
}