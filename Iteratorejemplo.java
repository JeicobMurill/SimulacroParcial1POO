import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class Iteratorejemplo {
    public static void main(String[] args) {
        // Crear un LinkedHashMap llamado "menu"
        LinkedHashMap<String, Integer> menu = new LinkedHashMap<>();

        // Agregar elementos al "menu"
        menu.put("uno", 1);
        menu.put("dos", 2);
        menu.put("tres", 3);

        // Obtener la segunda clave del "menu"
        Iterator<String> iterator = menu.keySet().iterator();
        if (iterator.hasNext()) {
            iterator.next(); // Saltar la primera clave
            if (iterator.hasNext()) {
                String segundaClave = iterator.next();
                System.out.println("La segunda clave en el menú es: " + segundaClave);
            } else {
                System.out.println("No hay suficientes claves en el menú para obtener la segunda.");
            }
        } else {
            System.out.println("El menú está vacío.");
        }

        // Obtener la tercera clave del "menu"
        if (iterator.hasNext()) {
            String terceraClave = iterator.next();
            System.out.println("La tercera clave en el menú es: " + terceraClave);
        } else {
            System.out.println("No hay suficientes claves en el menú para obtener la tercera.");
        }
    }
}