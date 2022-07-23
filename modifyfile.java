package assistedproject2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class modifyfile {
	static void modify(String fp, String oldstring, String newstring)
    {
        File filetobemodified = new File(fp);
        String old = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(filetobemodified));
            String line = reader.readLine();
            while (line != null) 
            {
                old = old + line + System.lineSeparator();
                line = reader.readLine();
            }
            String news = old.replaceAll(oldstring, newstring);
            writer = new FileWriter(filetobemodified);
            writer.write(news);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        modify("C:\\Users\\Suresh\\Downloads\\file.txt", "85", "95");
        System.out.println("modification is complete");
    }
}

 

