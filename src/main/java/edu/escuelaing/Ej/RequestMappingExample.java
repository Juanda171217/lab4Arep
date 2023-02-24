package edu.escuelaing.Ej;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import edu.escuelaing.Anotacion.RequestMapping;

public class RequestMappingExample {

    @RequestMapping("/hello")
    public static String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello2")
    public static String Test1() {
        return "Funciona Test2";
    }

    @RequestMapping("/hello3")
    public static String Test3() {
        return "Ha funcionado Test3";
    }

    @RequestMapping("/hello4")
    public static String index1() {
        return body("index", "html");
    }

    public static String body(String sample, String type) {
        byte[] file;
        try {
            file = Files.readAllBytes(Paths.get("src/main/java/edu/escuelaing/resources/" + sample + "." + type));
            return new String(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }

}