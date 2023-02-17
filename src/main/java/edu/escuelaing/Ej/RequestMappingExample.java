package edu.escuelaing.Ej;

import edu.escuelaing.Anotacion.RequestMapping;

public class RequestMappingExample {

    @RequestMapping("/hello")
    public static String index() {
        return "<h1>Hola</h1>"
                + "<h2>Juan David Martinez</h2>";
    }

}