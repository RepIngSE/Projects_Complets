package java_mintic.Reto_2;

import java.util.HashMap;

public class BasedeDatosProducto {
    private HashMap<Integer, Producto> ListaProductos = new HashMap <Integer, Producto>(); 
    
    BasedeDatosProducto(){
        this.ListaProductos.put(1, new Producto (1, "Manzanas", 5000.0, 25)); 
        this.ListaProductos.put(2, new Producto (2, "Limones", 2300.0, 15)); 
        this.ListaProductos.put(3, new Producto (3, "Peras", 2700.0, 33)); 
        this.ListaProductos.put(4, new Producto (4, "Arandanos", 9300.0, 5)); 
        this.ListaProductos.put(5, new Producto (5, "Tomates", 2100.0, 42)); 
        this.ListaProductos.put(6, new Producto (6, "Fresas", 4100.0, 3)); 
        this.ListaProductos.put(7, new Producto (7, "Helado", 4500.0, 41)); 
        this.ListaProductos.put(8, new Producto (8, "Galletas", 500.0, 8)); 
        this.ListaProductos.put(9, new Producto (9, "Chocolates", 3500.0, 80)); 
        this.ListaProductos.put(10, new Producto (10, "Jamon", 15000.0, 10)); 
        
    }
    
    public boolean agregar(int codigo, Producto producto) {
        if (this.ListaProductos.containsKey(codigo)){
        return false; 
        }
        this.ListaProductos.put(codigo, producto); 
        return true; 
    }  
    
     public boolean actualizar(int codigo, Producto producto) {
        if (this.ListaProductos.containsKey(codigo)){
        this.ListaProductos.replace(codigo, producto); 
        return true; 
        }
        return false; 
    } 
     
     public boolean borrar(int codigo, Producto producto) {
        if (this.ListaProductos.containsKey(codigo)){
        this.ListaProductos.remove(codigo); 
        return true; 
        }
        return false; 
    } 
     public double valor_inventario(){
         double cont = 0; 
         for (Integer i: ListaProductos.keySet()){
         cont +=(ListaProductos.get(i).getPrecio()*ListaProductos.get(i).getInventario()); 
         }
         return cont; 
    }
}
