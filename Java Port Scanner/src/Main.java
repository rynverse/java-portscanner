import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Creates a new input variable of type Scanner
        Scanner input = new Scanner(System.in);
        String host;
        final int startPort = 1;
        final int endPort = 1024;

        System.out.println("Enter IP Address to have ports scanned\n");

        // Takes the input of the next line
        try{
            host = input.nextLine().trim();
            InetAddress address = InetAddress.getByName(host);
            System.out.println(host);
        } catch (UnknownHostException e) {
            System.out.println("Could not Resolve host..");
        }


    }
}
