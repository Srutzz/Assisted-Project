package assistedproject2;
import java.io.*;
import java.util.Scanner;
public class filehandling {
    public static void main(String[] args) throws Exception
    {
    	FileReader file=new FileReader("C:\\Users\\Suresh\\Downloads\\file.txt");
    	Scanner sc = new Scanner(file);
    	System.out.println("Reading a file");
        while (sc.hasNextLine())
          System.out.println(sc.nextLine());
        File f1=new File("C:\\Users\\Suresh\\Downloads\\file.txt");
        FileWriter fw=new FileWriter("C:\\Users\\Suresh\\Downloads\\file.txt");
        fw.write("Writing in a new file");
        fw.close();
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        String s="Writing in a new file";
        String s1="C:\\Users\\Suresh\\Downloads\\file.txt";
        byte[] tb = "\nAppending in a file".getBytes();

        try (var fos = new FileOutputStream(s1, true)) {
            fos.write(tb);
        }
    }
}
