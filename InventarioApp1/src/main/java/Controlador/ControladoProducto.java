
package Controlador;
import Modelo.Producto; 
import Modelo.RepositorioProducto; 
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
public class ControladoProducto {
    @Autowired
    RepositorioProducto rp; 
    ArrayList<Producto>ListaProductos; 

    public ControladoProducto(RepositorioProducto rp) {
        this.rp = rp;
    }
    
    public void setListaProductos(ArrayList<Producto>ListaProductos){
        this.ListaProductos = ListaProductos; 
    }
    public Producto agregar(Producto p){
        return rp.save(p); 
    }
    public Producto actualizar(Producto p){
        return rp.save(p); 
    }
    public boolean eliminar(Integer id){
        try{
            rp.deleteById(id); 
            return true; 
        }catch (Exception ex){
            return false; 
        }
    }
    public ArrayList<Producto>obtenerProductos(){
        return(ArrayList<Producto>)rp.findAll(); 
    }
    public Optional<Producto>obetenerProducto(Integer id){
        return rp.findById(id); 
    }
    public double inventarioTotal(){
        double suma = 0; 
        for(Producto p: ListaProductos){
            suma+=p.getPrecio()*p.getInventario(); 
        }
        return suma; 
    }
     public String precioMayor(){ 
       String nombre = ListaProductos.get(0).getNombre(); 
       double precioMayor = ListaProductos.get(0).getPrecio(); 
       for(Producto producto : ListaProductos){ 
           if(producto.getPrecio() > precioMayor){ 
               nombre = producto.getNombre(); 
               precioMayor = producto.getPrecio(); 
           } 
       } 
       return nombre; 
   } 
 
   public String precioMenor(){ 
       String nombre = ListaProductos.get(0).getNombre(); 
       double precioMenor = ListaProductos.get(0).getPrecio(); 
       for(Producto producto : ListaProductos){ 
           if(producto.getPrecio() < precioMenor){ 
               nombre = producto.getNombre(); 
               precioMenor = producto.getPrecio(); 
           } 
       } 
       return nombre; 
   } 
   public double promedio(){ 
      double suma = 0;  
      for (Producto p : ListaProductos){ 
           suma += p.getPrecio();  
      } 
      return suma / ListaProductos.size();  
    } 

}
