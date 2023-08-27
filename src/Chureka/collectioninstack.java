package Chureka;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class collectioninstack {

	public static void main(String[] args) {
		Stack <String> v= new Stack<String>();
		v.push("Ayush"); 
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  
