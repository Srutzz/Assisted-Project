package assistedproject2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class createfile {
	public static void main(String[] args) throws IOException
    {
        fileusingfileclass();
        fileusingoutputstreamclass();
        createfileIn_NIO();
    }
 
    private static void fileusingfileclass() throws IOException
    {
          File f = new File("C:\\Users\\Suresh\\Downloads\\file.txt");
          if (f.createNewFile()){
            System.out.println("File created");
          }else{
            System.out.println("File already exists");
          }
          FileWriter w = new FileWriter(f);
          w.write("Test data");
          w.close();
    }
 
    private static void fileusingoutputstreamclass() throws IOException
    {
        String s = "data";
        FileOutputStream out = new FileOutputStream("C:\\Users\\Suresh\\Downloads\\file2.txt");
        out.write(s.getBytes());
        out.close();
    }
 
    private static void createfileIn_NIO()  throws IOException
    {
        String d = "Test data";
        Files.write(Paths.get("C:\\Users\\Suresh\\Downloads\\file3.txtt"), d.getBytes());
        List<String> l = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("file6.txt"),l,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}

 

