package Vista;
import Vista.Producto;
import java.util.HashMap;

public class BasedeDatosProducto {
    private HashMap<Integer, Producto> ListaProductos = new HashMap <Integer, Producto>(); 
    
    BasedeDatosProducto(){
        ListaProductos.put(1, new Producto (1, "Manzanas", 5000.0, 25)); 
        ListaProductos.put(2, new Producto (2, "Limones", 2300.0, 15)); 
        ListaProductos.put(3, new Producto (3, "Peras", 2700.0, 33)); 
        ListaProductos.put(4, new Producto (4, "Arandanos", 9300.0, 5)); 
        ListaProductos.put(5, new Producto (5, "Tomates", 2100.0, 42)); 
        ListaProductos.put(6, new Producto (6, "Fresas", 4100.0, 3)); 
        ListaProductos.put(7, new Producto (7, "Helado", 4500.0, 41)); 
        ListaProductos.put(8, new Producto (8, "Galletas", 500.0, 8)); 
        ListaProductos.put(9, new Producto (9, "Chocolates", 3500.0, 80)); 
        ListaProductos.put(10, new Producto (10, "Jamon", 15000.0, 10)); 
        
    }
    public HashMap<Integer, Producto> getListaProductos(){
        return ListaProductos; 
    } 
}
