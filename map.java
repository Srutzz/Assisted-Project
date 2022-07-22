package calculator1;
import java.util.*;
public class map {
    public static void main(String[] args)
    {
    	TreeMap<Integer,String> tr=new TreeMap<Integer,String>();
    	tr.put(1,"aa");
    	tr.put(2,"bb");
    	System.out.println("Tree Map ");
    	for(Map.Entry i:tr.entrySet()){
    		System.out.println(i.getKey()+" "+i.getValue());
    	}
    	
    	HashMap<Integer,String> ha=new HashMap<Integer,String>();
    	ha.put(3,"cc");
    	ha.put(4, "dd");
    	System.out.println("\nHash Map ");
    	for(Map.Entry j:ha.entrySet()){
    		System.out.println(j.getKey()+" "+j.getValue());
    	}
    	
    	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
    	ht.put(5, "ee");
    	ht.put(6, "ff");
    	System.out.println("\n Hash Table ");
    	for(Map.Entry k:ht.entrySet()){
    		System.out.println(k.getKey()+" "+k.getValue());
    	}
    	
    }
}
