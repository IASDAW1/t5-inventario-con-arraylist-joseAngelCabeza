/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<Integer> listaPrecios = new ArrayList<>();
        ArrayList<Integer> listaCantidad = new ArrayList<>();
        
        while (true) {
        
        System.out.println("\nMenú:");

            System.out.println("1. Agregar productos");

            System.out.println("2. Actualizar producto");

            System.out.println("3. Buscar producto");
            
            System.out.println("4. Mostrar inventario");

            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Introduce el Nombre del Producto");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Introduce el Precio del Producto");
                    int precio = sc.nextInt();
                    
                    System.out.println("Introduce la cantidad que existe del Producto");
                    int cantidad = sc.nextInt();
                    
                    if (!listaNombres.contains(nombre)) {

                        listaNombres.add(nombre);

                        listaPrecios.add(precio);
                        
                        listaCantidad.add(cantidad);

                        System.out.println("Producto agregado correctamente.");

                    } else {

                        System.out.println("El producto ya existe en la lista.");

                    }
                    
                break;
                
                case 2:
                    
                    System.out.println("Introduce el nombre del producto a actualizar:");
                    String nombreActualizar = sc.nextLine();
                    
                    if(listaNombres.contains(nombreActualizar)){
                        int indice = listaNombres.indexOf(nombreActualizar);
                        
                        System.out.println("Introduce el nuevo Nombre");
                        String nuevoNombre = sc.nextLine();
                        
                        System.out.println("Introduce el nuevo Precio");
                        int nuevoPrecio = sc.nextInt();
                        
                        System.out.println("Introduce la nueva cantidad");
                        int nuevoCantidad = sc.nextInt();
                        
                        listaNombres.set(indice, nuevoNombre);
                        listaPrecios.set(indice, nuevoPrecio);
                        listaCantidad.set(indice, nuevoCantidad);
                        
                        
                        System.out.println("Producto actualizado correctamente.");
                    } 
                    
                    else {
                        System.out.println("Producto no encontrado.");
                    }
                    
                break;
                
                case 3:
                    
                    System.out.print("Introduce el nombre del producto a buscar: ");

                    String nombreProducto = sc.nextLine();
                    
                        if(listaNombres.contains(nombreProducto)) {
                            
                            int indice = listaNombres.indexOf(nombreProducto);
                            
                            int numeroPrecio = listaPrecios.get(indice);
                            
                            System.out.println("Producto: " + nombreProducto + "Precio: " + numeroPrecio);
                            
                        }
                        
                        else {

                            System.out.println("Producto no encontrado.");

                        }
                    
                break;
                
                case 4:
                    
                    System.out.println("Lista de productos");
                    
                    for (int i = 0; i < listaNombres.size(); i++) {
                        
                        System.out.println("-Producto: " + listaNombres.get(i) + " -Precio: " + listaPrecios.get(i) + " -Cantidad: " + listaCantidad.get(i));
                        
                    }
                    
                break;
                
                case 5:
                    
                    System.out.println("Saliendo del programa.");

                    sc.close();

                    System.exit(0);

                break;
            }
        }
    }
}
