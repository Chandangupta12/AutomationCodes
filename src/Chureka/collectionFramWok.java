package Chureka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class collectionFramWok {

	public static void main(String[] args) {
		List <String> ls= new ArrayList<String>();
		List<String> lk= new LinkedList<String>();
		
		
		ls.add("Akhash");
		ls.add("shakty");
		ls.add("12");
		ls.add("Akhash");
		ls.add("shakty");
		ls.add("12");
		ls.add("optical");
		ls.add("diyam");
		ls.add("qtwc23");
		ls.add("smarirtu");
		ls.add("nawazudin");
		ls.add("azhar");
		Iterator<String> itr=ls.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}
		 System.out.println(ls);
		 ls.remove(3);
		
		 System.out.println(ls);
		
		 System.out.println("knoe we Enter LikedList");
		 lk.add("asd");
		 lk.add("arsol");
		 lk.add("zukp");
		 lk.add("staym");
		 System.out.println(lk);
		// System.out.println(lk);
		// System.out.println(lk);
		 
		 List<String> lg= new LinkedList<String>();
		 lg.add("1234");
		 lg.add("14");
		 lg.add("134");
		 lg.add("4");
		 System.out.println(lg);
		 lg.add(3, "$$$$");
		 System.out.println(lg);
		 
		 List<String> lv= new Stack<String>();
		 lv.add("bangaddesh");
		 lv.add("chandan");
		 lv.add("priyatam");
		 lv.add("adity");
		 lv.add("chandan");
		 System.out.println(lv);
	}
	}
