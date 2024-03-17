package java_mintic.Reto_2;

import java.util.Scanner;

public class Reto_2 {

    public static void main(String[] args) {
     BasedeDatosProducto ListaProductos = new BasedeDatosProducto();  
     Scanner sc = new Scanner(System.in);  
      String operacion = sc.nextLine();  
      String [] Entradas = sc.nextLine().split(" ");  
      Producto producto = new Producto(Integer.parseInt(Entradas[0]), Entradas[1], Double.parseDouble(Entradas[2]),Integer.parseInt(Entradas[3]));  
        boolean salida = false;  
        if(operacion.equals("AGREGAR")){ 
           salida = ListaProductos.agregar(producto.getCodigo(), producto); 
        } 
        else if(operacion.equals("ACTUALIZAR")){ 
           salida = ListaProductos.actualizar(producto.getCodigo(), producto);  
        } 
        else if(operacion.equals("BORRAR")){ 
            salida = ListaProductos.borrar(producto.getCodigo(), producto);  
        } 
        if (salida){   
            System.out.println(String.format("%.1f", ListaProductos.valor_inventario()));  
        } else { 
            System.out.println("ERROR");  
        } 
    } 
} 

