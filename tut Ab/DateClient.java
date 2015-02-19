import DateApp.*;
import org.omg.CORBA.*;
import java.io.*;
import java.net.*;

public class DateClient{
	static String stringifiedObjectReference;

	public static void main(String args[]){
		try{
			//create and ionitialize ORB
			Properties props = new Properties();
			props.put("org.omg.CORBA.ORBInitialPort", "1050");
	        ORB orb = ORB.init(args, props);

			//get and convert the stringifies object refernece
			//to a generic CORBA object reference

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("IOR"));

			String ior = (String) in.readObject();

			in.close();

			org.omg.CORBA.Object genericObjRef = orb.string_to_object(ior);

			//CAst, or narrow the genereic object referene to a
			//true object reference

			DateInterface remoteObjRef = DateInterfaceHelper.narrow(genericObjRef);

			//print results
			String username = remoteObjRef.getMasterDateMethod("Arnis Lupiks - ID:11103621");
			System.out.println(username);


		}catch(Exception e){
			System.out.println("ERROR : " +e);
			e.printStackTrace(System.out);
		}
	}
}