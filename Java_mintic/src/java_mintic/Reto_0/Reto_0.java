//prueba
package java_mintic.Reto_0;

import java.util.Scanner;

public class Reto_0 {

    int a, b; 
    private float suma,multiplicacion = 0; 
    private double results, resultm = 0; 
    private Scanner teclado; 
    
    public Reto_0(){
        teclado = new Scanner(System.in);   
    }
    public String read (){
        System.out.print(" "); 
        a = teclado.nextInt(); 
        b = teclado.nextInt(); 
        return null;
    }

    public void run(){
        suma = a+b; 
        multiplicacion= a*b; 
        System.out.print(suma );   
        System.out.println(" "+ multiplicacion);
    }
    public static void main(String[] args){
        Reto_0 reto_0 = new Reto_0(); 
        reto_0.read();
        reto_0.run();
    }
}
    
