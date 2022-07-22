package calculator1;
import java.util.regex.*;
public class regularexpression {
    public static void main(String[] args)
    {
    	String pattern="[a-z]+";
    	String a="Regular expression";
    	Pattern b=Pattern.compile(pattern);
    	Matcher c=b.matcher(a);
    	while(c.find())
    		System.out.println(a.substring(c.start(),c.end()));
    }
}
