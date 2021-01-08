import java.io.*;
import java.util.*;

public class Test implements Serializable {
	private Date date = new Date(); 
	private String username;
	private transient String password;

	Test(String n, String p) {
		username = n;
		password = p;
	}

	public String toString() {
		return "Username: " + username + "\n Date: " + date + "\n Password: " + password == null ? "n/a" : password; 
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t = new Test("Java", "Sun");
		ObjectOutputStream O = new ObjectOutputStream(new FileOutputStream("Login.out"));
        O.writeObject(t);
        System.out.println("Login a: " + t);
		O.close();
		ObjectInputStream I = new ObjectInputStream(new FileInputStream("Login.out"));
        Test t2 = (Test) I.readObject();
        System.out.println("Login b: " + t2);
        I.close();
	}

}