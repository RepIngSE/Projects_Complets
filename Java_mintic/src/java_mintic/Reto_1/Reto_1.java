
package java_mintic.Reto_1;
import java.util.Scanner; 
public class Reto_1 {
    
    public static String Riesgo (double Imc, int Edad){
        String riesgo = " ";
        if (Imc < 22 && Edad < 45)riesgo = "Bajo"; 
        if (Imc < 22 && Edad >= 45 || Imc >= 22 && Edad < 45)riesgo = "Medio"; 
        if (Imc >= 22 && Edad >= 45)riesgo = "Alto"; 
        return riesgo; 
    }
    
    public static double Imc (double Masa, double Altura){
        double Imc = Masa / (Altura * Altura); 
        return Imc; 
    }
    
    public static boolean Validacion (double Masa, double Altura, int Edad){
        if ((Masa < 0 || Masa > 150) || (Altura < 0.1 || Altura > 2.5) || (Edad < 0 || Edad > 110)){
            return false; 
        }  
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        String [] Entradas = sc.nextLine().split(" "); 
        
        double Masa = Double.parseDouble(Entradas[0]); 
        double Altura = Double.parseDouble(Entradas[1]); 
        int Edad = Integer.parseInt(Entradas[2]); 
        double Imc = Imc (Masa, Altura); 
        
        if (Validacion (Masa, Altura, Edad)){
            System.out.println(String.format("%.1f",Imc) + " " + Riesgo(Imc,Edad)); 
            
        } 
        else {
            System.out.println("ERROR"); 
        }
    }  
}
