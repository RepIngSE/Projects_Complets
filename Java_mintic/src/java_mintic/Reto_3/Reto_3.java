package java_mintic.Reto_3;


import java.util.HashMap; 
import java.util.Scanner; 
public class Reto_3 { 
 
    private static final Scanner scanner = new Scanner(System.in); 
 
    public static void main(String[] args) { 
    run();  
   } 
 
    public static String read(){ 
        return scanner.nextLine(); 
    } 
 
    public static void run(){ 
 
        BasedeDatosProducto ListaProductos = new BasedeDatosProducto(); 
        String operacion = read(); 
        String [] Entradas = read().split(" "); 
        Producto producto = new Producto(Integer.parseInt(Entradas[0]), Entradas[1], Double.parseDouble(Entradas[2]),Integer.parseInt(Entradas[3]));
        if(operacion.equals("AGREGAR") && !ListaProductos.verificar(producto)) {
            ListaProductos.agregar(producto);
            ListaProductos.generarInforme();
        }else if(operacion.equals("ACTUALIZAR") && ListaProductos.verificar(producto)) {
            ListaProductos.actualizar(producto);
            ListaProductos.generarInforme();
        }else if(operacion.equals("BORRAR") && ListaProductos.verificar(producto)) {
            ListaProductos.borrar(producto);
            ListaProductos.generarInforme();
        }else {
            System.out.println("ERROR");
        }
    }
} 
class Producto { 
    private Integer codigo; 
    private String nombre; 
    private Double precio; 
    private Integer inventario; 
 
    public Producto() { 
    } 
 
    public Producto(Integer codigo, String nombre, Double precio, Integer inventario) { 
        this.codigo = codigo; 
        this.nombre = nombre; 
        this.precio = precio; 
        this.inventario = inventario; 
    } 
 
    public Integer getCodigo() { 
        return codigo; 
    } 
 
    public void setCodigo(Integer codigo) { 
        this.codigo = codigo; 
    } 
 
    public String getNombre() { 
        return nombre; 
    } 
 
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    } 
 
    public Double getPrecio() { 
        return precio; 
    } 
 
    public void setPrecio(Double precio) { 
        this.precio = precio; 
    } 
 
    public Integer getInventario() { 
        return inventario; 
    } 
 
    public void setInventario(Integer inventario) { 
        this.inventario = inventario; 
    } 
} 
class BasedeDatosProducto { 
 
   private HashMap<Integer, Producto> ListaProductos = new HashMap <Integer, Producto>(); 
 
   public BasedeDatosProducto() { 
 
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
 
   public void agregar(Producto producto){ 
       ListaProductos.put(producto.getCodigo(), producto); 
   } 
   public void borrar(Producto producto){ 
       ListaProductos.remove(producto.getCodigo()); 
   } 
   public void actualizar(Producto producto){ 
       ListaProductos.replace(producto.getCodigo(), producto); 
   } 
 
   public String precioMayor(){ 
       String nombre = ListaProductos.values().iterator().next().getNombre(); 
       double precioMayor = ListaProductos.values().iterator().next().getPrecio(); 
       for(Producto producto : ListaProductos.values()){ 
           if(producto.getPrecio() > precioMayor){ 
               nombre = producto.getNombre(); 
               precioMayor = producto.getPrecio(); 
           } 
       } 
       return nombre; 
   } 
 
   public String precioMenor(){ 
       String nombre = ListaProductos.values().iterator().next().getNombre(); 
       double precioMenor = ListaProductos.values().iterator().next().getPrecio(); 
       for(Producto producto : ListaProductos.values()){ 
           if(producto.getPrecio() < precioMenor){ 
               nombre = producto.getNombre(); 
               precioMenor = producto.getPrecio(); 
           } 
       } 
       return nombre; 
   } 
 
   public boolean verificar(Producto producto){ 
       return ListaProductos.containsKey(producto.getCodigo()); 
   } 
   public double promedio(){ 
      double suma = 0;  
      for (Producto producto : ListaProductos.values()){ 
           suma += producto.getPrecio();  
      } 
      return suma / ListaProductos.size();  
    } 
    
   public void generarInforme(){ 
       System.out.println(precioMayor()+" "+precioMenor()+" "+String.format("%.1f", promedio())); 
    } 
}

