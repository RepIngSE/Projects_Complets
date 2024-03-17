package Modelo;



import Controlador.ControladoProducto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioAppApplication {
        @Autowired
        RepositorioProducto rep; 
        
	public static void main(String[] args) {
		//SpringApplication.run(InventarioAppApplication.class, args);
                SpringApplicationBuilder builder = new SpringApplicationBuilder(InventarioAppApplication.class); 
                builder.headless(false); 
                ConfigurableApplicationContext context = builder.run(args);    
	}
        
        @Bean
        ApplicationRunner applicationRunner(){
            return args -> {
                final Log logger = LogFactory.getLog(getClass()); 
                ControladoProducto controlador = new ControladoProducto(rep); 
                controlador.setListaProductos(controlador.obtenerProductos()); 
                //Producto p = new Producto("Lechuga", 2000.0, 5); 
                //controlador.agregar(p); 
                System.out.println(controlador.precioMayor()); 
            }; 
        }
    }

