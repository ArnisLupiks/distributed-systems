import java.io.*;
import org.omg.CORBA.*;
import HelloTie.*;

public class HelloTieServer{
	public static void main (String args[]){
		try{
			//create ORB
			ORB orb = ORB.init(args, null);
			//create servant
			Hello helloRef = new Hello_Tie(new HelloTieServant());
			orb.connect(helloRef);
			//stringify the helloRef and dump ot in a file
			String str = orb.object_to_string(helloRef);
			System.out.println(str);

			String filename = "HelloIOR";

			FileOutputStream fos = new FileOutputStream(filename);

			PrintStream ps = new PrintStream(fos);
			ps.print(str);
			ps.close();

			//wait for invocation from clients
			java.lang.Object sync = new java.lang.Object();
			synchronized (sync){
				sync.wait();
			}
	}catch (Exception e){
		System.err.println("ERROR: "+ e);
		e.printStackTrace(System.out);
	}
	}
}