import java.io.*;

public class ReaderAndWriter {
    public static void main(String[] args) {
        File f = new File("testing.txt");

        try {
            // Writing to the file
            FileWriter wtr = new FileWriter(f);
            wtr.write("Hello, world!");
            wtr.close();
            System.out.println("File length: " + f.length());
            
            // Reading from the file
            FileReader rdr = new FileReader(f);
            int read = 0;
            int i = 0;
            while (i != -1) {
                i = rdr.read();
                if (i != -1) {
                    System.out.print((char) i);
                    read++;
                }
            }
            System.out.println("\nBytes read: " + read);
            rdr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
