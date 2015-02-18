import HelloTie.*;

class HelloTieServant implements HelloOperations {
	public String sayHello(){
		System.out.println("Received a call.");
		return "\nHello world !!\n";
	}
}