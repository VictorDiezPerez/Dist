package helloClient;

import java.rmi.Naming;

public class Cliente {

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];

        try {
            helloServer.Hello or = (helloServer.Hello) Naming.lookup("rmi://" + host + "/ObjetoHello");
            String respuesta = or.sayHello();
            System.out.println("[Respuesta: " + respuesta + " ]");
        } catch (java.rmi.RemoteException re) {
            System.err.println("<Cliente: Excepción RMI: " + re);
            re.printStackTrace();
        } catch (Exception e) {
            System.err.println("<Cliente: Excepcion: " + e);
            e.printStackTrace();
        }
    }
}

