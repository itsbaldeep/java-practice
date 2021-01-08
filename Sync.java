class CallTest {
	synchronized void callme(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Call implements Runnable {
	String msg;
	CallTest obj;
	Thread t;

	public Call(CallTest c, String s) {
		obj = c;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		obj.callme(msg);
	}
}
public class Sync {
    public static void main (String args[]) {
		CallTest T = new CallTest();
		Call ob1 = new Call(T, "Hi");
		Call ob2 = new Call(T, "This ");
		Call ob3 = new Call(T, "is");
		Call ob4 = new Call(T, "Synchronization");
        Call ob5 = new Call(T, "Testing");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
            ob5.t.join();
        } catch ( InterruptedException e) {
            System.out.println (" Interrupted");
        } 
    }
    
}
