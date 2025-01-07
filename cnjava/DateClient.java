import java.io.*;
import java.net.*;

public class DateClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to Date Server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String serverResponse = in.readLine();
            System.out.println("Server says: " + serverResponse);

            in.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

