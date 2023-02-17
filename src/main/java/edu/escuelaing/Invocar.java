package edu.escuelaing;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import edu.escuelaing.Anotacion.RequestMapping;

public class Invocar {

    public static Map<String, Method> services = new HashMap<String, Method>();

    public static void run() throws Exception {
        String className = "edu.escuelaing.Ej.RequestMappingExample";
        Class c = Class.forName(className);
        for (Method m : c.getMethods()) {
            if (m.isAnnotationPresent(RequestMapping.class)) {
                try {
                    String uri = m.getAnnotation(RequestMapping.class).value();
                    System.out.println(uri + ":" + m.invoke(null));
                    services.put(uri, m);
                } catch (Throwable ex) {
                    System.out.print("Error: " + ex);
                }
            }
        }
    }

    public static String getMethod(String uri) throws Exception {
        System.out.println(uri);
        Method m = services.get(uri);
        return (String) m.invoke(null);
    }
}