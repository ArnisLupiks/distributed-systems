package DateApp;

/**
* DateApp/DateInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/distributed systems/tut Ab/DateApp.idl
* 18 February 2015 11:37:31 o'clock GMT
*/

public final class DateInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public DateApp.DateInterface value = null;

  public DateInterfaceHolder ()
  {
  }

  public DateInterfaceHolder (DateApp.DateInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DateApp.DateInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DateApp.DateInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DateApp.DateInterfaceHelper.type ();
  }

}
