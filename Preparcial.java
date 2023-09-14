
package com.mycompany.preparcial;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Preparcial {
    
    public static void main(String[] args) {
        
      
        Map<String, Integer> menu1 = new HashMap<>();
        
        menu1.put("1. Hamburguesa", 1);
        menu1.put("2. Perro Caliente", 2);
        menu1.put("3. Pizza", 3);
        
        Map<String, Integer> menuham = new HashMap<String, Integer>();
        
        menuham.put("1. Hamburguesa Sencilla", 15000);
        menuham.put("2. Hamburguesa Doble Carne", 20000);
        menuham.put("3. Hamburguesa Triple Carne", 35000);
        
        Map<String, Integer> menuperro = new HashMap<String, Integer>();
        
        menuperro.put("1. Perro Caliente Sencillo", 7000);
        menuperro.put("2. Perro Caliente Gratinado", 9000);
        menuperro.put("3. Perro Caliente Americano", 12000);
        
        Map<String, Integer> menupizza = new HashMap<String, Integer>();
        
        menupizza.put("1. Pizza Hawaiana", 8000);
        menupizza.put("2. Pizza Carnes", 8000);
        menupizza.put("3. Pizza Pollo Champiñones", 8000);
        
        
        System.out.println("\n \n \t !Bienvenido al Restaurante! \n A continuación las opciones de comida el día de hoy: ");
        System.out.println( menu1.keySet());
        Scanner scanner = new Scanner(System.in);
        
        int selemenu1 = 0;
        
        while (selemenu1<1 || selemenu1>3){
            selemenu1 = scanner.nextInt();
            if (selemenu1<1 || selemenu1>3){
                System.out.println("Número no existente, Selecciona tu pedido: ");
            }
        }
        if (selemenu1==1){
            int selemenuham;
            System.out.println("¿Qué tipo de Hamburguesa prefieres?: ");
            System.out.println( menuham);
            selemenuham = 0;
            while (selemenuham<1 || selemenuham>3){
            selemenuham = scanner.nextInt();
                if (selemenuham<1 || selemenuham>3){
                System.out.println("Número no existente, Selecciona tu pedido: ");
                }
            }
            if (selemenuham==1){
                System.out.println("Pedido: \n - Hamburguesa Sencilla... Precio: "+menuham.get("1. Hamburguesa Sencilla"));
            }else if (selemenuham==2){
                System.out.println("Pedido: \n - Hamburguesa Doble Carne... Precio: "+menuham.get("2. Hamburguesa Doble Carne"));
            }else{
                System.out.println("Pedido: \n - Hamburguesa Triple Carne... Precio: "+menuham.get("3. Hamburguesa Triple Carne"));
            }
        }else if(selemenu1==2){
            int selemenuperro;
            System.out.println("¿Qué tipo de Perro Caliente prefieres?: ");
            System.out.println( menuperro);
            selemenuperro = 0;
            while (selemenuperro<1 || selemenuperro>3){
            selemenuperro = scanner.nextInt();
                if (selemenuperro<1 || selemenuperro>3){
                System.out.println("Número no existente, Selecciona tu pedido: ");
                }
            }
            if (selemenuperro==1){
                System.out.println("Pedido: \n - Perro Caliente Sencillo... Precio: "+menuperro.get("1. Perro Caliente Sencillo"));
            }else if (selemenuperro==2){
                System.out.println("Pedido: \n - Perro Caliente Gratinado... Precio: "+menuperro.get("2. Perro Caliente Gratinado"));
            }else{
                System.out.println("Pedido: \n - Perro Caliente Americano... Precio: "+menuperro.get("3. Perro Caliente Americano"));
            }
        }else{
            int selemenupizza;
            System.out.println("¿Qué tipo de Pizza prefieres?: ");
            System.out.println( menupizza);
            selemenupizza = 0;
            while (selemenupizza<1 || selemenupizza>3){
            selemenupizza = scanner.nextInt();
                if (selemenupizza<1 || selemenupizza>3){
                System.out.println("Número no existente, Selecciona tu pedido: ");
                }
            }
            if (selemenupizza==1){
                System.out.println("Pedido: \n - Pizza Hawaiana... Precio: "+menupizza.get("1. Pizza Hawaiana"));
            }else if (selemenupizza==2){
                System.out.println("Pedido: \n - Pizza Carnes... Precio: "+menupizza.get("2. Pizza Carnes"));
            }else{
                System.out.println("Pedido: \n - Pizza Pollo Champiñones... Precio: "+menupizza.get("3. Pizza Pollo Champiñones"));
            }
        }
        

        
    }  
        
}
