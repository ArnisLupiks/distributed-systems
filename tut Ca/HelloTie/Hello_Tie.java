package HelloTie;


/**
* HelloTie/Hello_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/distributed systems/tut Ca/HelloApp.idl
* 18 February 2015 18:49:27 o'clock GMT
*/

public class Hello_Tie extends _HelloImplBase
{

  // Constructors
  public Hello_Tie ()
  {
  }

  public Hello_Tie (HelloTie.HelloOperations impl)
  {
    super ();
    _impl = impl;
  }

  public String sayHello ()
  {
    return _impl.sayHello();
  } // sayHello

  private HelloTie.HelloOperations _impl;

} // class Hello_Tie
