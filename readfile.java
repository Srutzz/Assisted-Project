package assistedproject2;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class readfile {
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List l = readFileInList("C:\\Users\\Suresh\\Downloads\\file.txt"); 
	  
	    Iterator<String> i = l.iterator(); 
	    while (i.hasNext()) 
	      System.out.println(i.next()); 
	  } 
}


