import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("text.txt");
        String s = "testing..";
        for (int i = 0; i < s.length(); i++) {
            out.write(s.charAt(i));
        }
        out.close();

        FileInputStream in = new FileInputStream("text.txt");
        int length = in.available();
        byte[] buff = new byte[length];
        int read = in.read(buff, 0, length);
        System.out.println(read);
        System.out.println(new String(buff));
        in.close();

        File f = new File("text.txt");
        f.delete();

    }
}
