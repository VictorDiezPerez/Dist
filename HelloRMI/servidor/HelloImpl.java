package helloServer;

public class HelloImpl extends java.rmi.server.UnicastRemoteObject implements Hello{

    public HelloImpl() throws java.rmi.RemoteException{
        super();    //constructor de UnicastRemoteObject
    }

    @Override
    public String sayHello() throws java.rmi.RemoteException {
        return "Hola mundo!";
    }
}
