package HelloNaming;


/**
* HelloNaming/Hello_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/distributed systems/tut Ba/HelloWorldName.idl
* 18 February 2015 19:29:12 o'clock GMT
*/

public class Hello_Tie extends _HelloImplBase
{

  // Constructors
  public Hello_Tie ()
  {
  }

  public Hello_Tie (HelloNaming.HelloOperations impl)
  {
    super ();
    _impl = impl;
  }

  public String sayHello ()
  {
    return _impl.sayHello();
  } // sayHello

  private HelloNaming.HelloOperations _impl;

} // class Hello_Tie