package calculator1;
import java.util.*;
import java.util.ArrayList;

public class collection {
    public static void main(String[] args)
    {
    	System.out.println("ArrayList");
    	ArrayList<String> name=new ArrayList<String>();
    	name.add("Jimin");
    	name.add("V");
    	name.add("Jungkook");
    	System.out.println(name);
    	
    	System.out.println("\n");
    	System.out.println("Vector");
    	Vector<Integer> num=new Vector();
    	num.addElement(1);
    	num.addElement(2);
    	num.addElement(3);
    	System.out.println(num);
    	
    	System.out.println("\n");
    	System.out.println("LinkedList");
    	LinkedList<String> n=new LinkedList<String>();
    	n.add("Suga");
    	n.add("Jhope");
    	Iterator<String> i=n.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());
    		
    		System.out.println("\n");
    		System.out.println("HashSet");
    		HashSet<Integer> s=new HashSet<Integer>();
    		s.add(10);
    		s.add(20);
    		System.out.println(s);
    		
    		System.out.println("\n");
    		System.out.println("LinkedHashSet");
    		LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();
    		s2.add(30);
    		s2.add(40);
    		System.out.println(s2);
    	}
    }
}
