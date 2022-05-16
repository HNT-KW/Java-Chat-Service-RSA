package Main;


import Function.JClient;
import Function.JServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InetAddress ip;
        String hostname;
        System.out.print("Who are you? Server or Client? : ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ans = bf.readLine();
        if (ans.equalsIgnoreCase("server")) {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
            JServer server = new JServer(5123);

        } else {
            JClient client = new JClient();
        }
    }

}
