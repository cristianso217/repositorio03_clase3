
package proyect01_clase03_dataops;

import java.util.Scanner;
public class Proyect01_clase03_dataOps {
    public static void main(String[] args) {
        //declarar variables
        double num1,num2,suma,promedio;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar número 1:");
        num1=lectura.nextDouble();
        System.out.print("Ingresar número 2:");
        num2=lectura.nextDouble();        
        // proceso de datos
        suma=num1+num2;
        promedio=suma/2;
        //salida de datos
        System.out.println("El resultado 1:"+suma);
        System.out.println("El resultado 2:"+promedio);
    }
    
}
