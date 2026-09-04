import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Creates a new input variable of type Scanner
        Scanner input = new Scanner(System.in);
        String address;
        final int startPort = 1;
        final int endPort = 1024;

        System.out.println("Enter IP Address to have ports scanned\n");

        // Takes the input of the next line
        address = input.nextLine();

        System.out.println(address);
    }
}
