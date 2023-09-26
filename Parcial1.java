//Parcial 1 Jeicob Murillo 1000334659
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Parcial1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> baselogin = new HashMap<>();
        baselogin.put("alexander", 1234);
        baselogin.put("andres", 2222);
        baselogin.put("camila", 4321);
        baselogin.put("jeicob", 5555);
        baselogin.put("miguel", 0000);
        
        
        Map<String, Integer> productos = new HashMap<>();
        productos.put("pesahombre",50);
        productos.put("pesamujer",30);
        productos.put("bicicleta",5);
        productos.put("balonfutbol", 100);
        productos.put("balonbaloncesto", 100);
        productos.put("camisetafutbol", 80);
        productos.put("camisetabaloncesto", 50);
        productos.put("caminadora", 3);
        productos.put("raqueta", 20);
        productos.put("palogolf", 10);
  
        int seleinicio = 0;
        while(seleinicio<1 || seleinicio>2){
           System.out.println("\n \t BIENVENIDO A IMPLEMENTOS DEPORTIVOS S.A \n SELECCIONE UNA OPCIÓN: \n 1. Crear Usuario \n 2. Ingresar ");
           seleinicio = scanner.nextInt();
            if (seleinicio==1){
                System.out.println("Ingrese Nombre: ");
                String nombre;
                nombre = scanner.next();
                System.out.println("Ingrese Contrasena: ");
                int contrasena = scanner.nextInt();
                baselogin.put(nombre, contrasena);
                seleinicio=0;
            }else if(seleinicio==2){
                System.out.println("Ingrese Nombre: ");
                String nombreacc;
                nombreacc = scanner.next();
                System.out.println("Ingrese Contrasena: ");
                int contrasenaacc;
                contrasenaacc = scanner.nextInt();
                if (baselogin.containsKey(nombreacc) && baselogin.containsValue(contrasenaacc)){
                       System.out.println("Bienvenido Sr. "+ nombreacc+".");
                }else{
                    System.out.println("Acceso Denegado");
                    seleinicio=4;
                }
                
     if (baselogin.containsKey(nombreacc) && baselogin.containsValue(contrasenaacc)){
         
        
        int sele1=4;
        while (sele1!=3){
        System.out.println("\n ¿Que desea realizar?: \n 1. Ingresar Producto. \n 2. Verificar Producto. \n 3. Salir");
        sele1 = scanner.nextInt();
            if (sele1==1){
                System.out.println("Ingrese Nombre: ");
                String nombreproducto;
                nombreproducto = scanner.next();
                System.out.println("Ingrese Cantidad: ");
                int cantidad;
                cantidad = scanner.nextInt();
                productos.put(nombreproducto, cantidad);
                sele1=4;
            }if(sele1==2){
                System.out.println("Ingrese Nombre: ");
                String nombreproducto2;
                nombreproducto2 = scanner.next();
                if (productos.containsKey(nombreproducto2)){
                    System.out.println("\n El producto "+nombreproducto2+" Si se encuentra y hay "+productos.get(nombreproducto2)+" unidades.");
                }else{
                    System.out.println("No se encuentra el producto. ¿Desea agregarlo? \n 1. Si \n 2. No");
                    int sele2 = scanner.nextInt();
                    if (sele2==1){
                        System.out.println("Ingrese Nombre: ");
                        String nombreproducto1;
                        nombreproducto1 = scanner.next();
                        System.out.println("Ingrese Contraseña: ");
                        int cantidad1;
                        cantidad1 = scanner.nextInt();
                        productos.put(nombreproducto1, cantidad1);
                    }else{
                        sele1=4;
                    }
                }
            }
        }
     }
    }
    }
    }    
}