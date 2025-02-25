

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// import java.io.*;

public class checkedexception {
    public static void main(String[]args)throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("hello");
    }
    
}
