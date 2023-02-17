package edu.escuelaing;

import java.net.*;
import java.util.HashMap;
import java.util.Map;

import java.io.*;
import java.lang.reflect.Method;

public class HttpServer {
    public static Map<String, Method> services = new HashMap<String, Method>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HttpServer server = HttpServer.getInstance();
        try {
            Invocar.run();
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(34000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            System.out.println("Listo para recibir ...");
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));
        String inputLine, outputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println("Received: " + inputLine);
            if (!in.ready()) {
                break;
            }
        }

        outputLine = "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Taller diseño</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Taller</h1>\n"
                + "<script>"
                + "</body>\n"
                + "</html>\n" + inputLine;
        out.println(outputLine);

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static HttpServer getInstance() {
        return null;
    }

    public void start() {
    }
}