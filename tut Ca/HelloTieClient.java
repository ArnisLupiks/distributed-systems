import java.io.*;
import org.omg.CORBA.*;
import HelloTie.*;

public class HelloTieClient{
	public static void main(String args[]){
		try{
			//create ORB
			ORB orb = ORB.init(args,null);
			//Get strings
			String filename = "HelloIOR";
			BufferedReader br = new BufferedReader(new FileReader(filename));

			String ior = br.readLine();
			System.out.println(ior);
			org.omg.CORBA.Object obj = orb.string_to_object(ior);
			System.out.println(obj);
			Hello helloRef = HelloHelper.narrow(obj);

			//call the Hello object and print results
			String hello = helloRef.sayHello();
			System.out.println(hello);
		}catch (Exception e){
			System.err.println("ERROR : " +e);
			e.printStackTrace(System.out);
		}
	}
}