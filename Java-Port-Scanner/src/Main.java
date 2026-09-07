import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Creates a new input variable of type Scanner
        Scanner input = new Scanner(System.in);
        String host = "";
        InetAddress address = null;
        final int startPort = 1;
        final int endPort = 1024;

        System.out.println("Enter IP Address to have ports scanned");

        // Takes the input of the next line
        try{
            host = input.nextLine().trim();
            address = InetAddress.getByName(host); // Gets the IP address of a given domain
            System.out.println(host);
        } catch (UnknownHostException e) { // Handles UnknownHostException given when using getByName method
            System.out.println("Could not Resolve host..");
        }

        // Scan Ports
        for (int port = startPort; port <= endPort; port++){
                System.out.println("Scanning Port: " + port);
            try (Socket socket = new Socket(host, port)){ // Creates a new socket per port
            } catch (ConnectException e){
                System.out.println(" Connection Refused");
            } catch(SocketTimeoutException e){
                System.out.println(" Connection Timed Out.");
            } catch(IOException e){ // Handles IOException when making a new Socket Object
                System.out.println("Unknown Host Exception.");
            }
        }
    }
}
