import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        // Writing to the file
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dout = new DataOutputStream(fout);
        for (int i = 0; i < 10; i++) dout.writeInt(i);

        // Reading from the file
        FileInputStream fin = new FileInputStream(f);
        BufferedInputStream bin = new BufferedInputStream(fin);
        DataInputStream din = new DataInputStream(bin);    
        try {
            while (true) {
                int i = din.readInt();
                System.out.println(i);
            }
        } catch (EOFException eofe) {
            System.out.println("End of file reached");
        } finally {
            din.close();
            dout.close();
        }
    }
}
