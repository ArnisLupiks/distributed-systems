import DateApp.*;
import org.omg.CORBA.*;
import java.util.Date;
import java.io.*;
import java.net.*;

public class DateServer{
	static String stringifiedObjectReference;

	public static void main(String args[]){
		try{
			Properties props = new Properties();
			        	props.put("org.omg.CORBA.ORBInitialPort", "1050");
			        	// props.put("org.omg.CORBA.ORBInitialHost", "localhost");
        	ORB orb = ORB.init(args, props);

			//Create servant and register it with the ORB
			DateInterface dateObjectReference = new DateInterface_Tie(new DateInterfaceServant());
			orb.connect(dateObjectReference);

			//convert the object reference to a string
			orb.object_to_string(dateObjectReference);

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("IOR"));
			out.writeObject(orb.object_to_string(dateObjectReference));
			out.close();
			System.out.println("Server is runing..");
			orb.run();

		}catch (Exception e){
			System.err.println("ERROR: " +e);
			e.printStackTrace(System.out);
		}
	}
}