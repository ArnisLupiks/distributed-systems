package DateApp;


/**
* DateApp/_DateInterfaceImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/distributed systems/tut Ab/DateApp.idl
* 18 February 2015 11:37:31 o'clock GMT
*/

public abstract class _DateInterfaceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements DateApp.DateInterface, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _DateInterfaceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getMasterDateMethod", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // DateApp/DateInterface/getMasterDateMethod
       {
         String student = in.read_string ();
         String $result = null;
         $result = this.getMasterDateMethod (student);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DateApp/DateInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _DateInterfaceImplBase
