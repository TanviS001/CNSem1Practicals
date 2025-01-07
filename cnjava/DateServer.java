import java.io.*;
import java.net.*;
import java.util.Date;

public class DateServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Date Server is running... Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            Date currentDate = new Date(); 
            out.println("Current Date and Time: " + currentDate);

            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

