
package com.mycompany.ikerarbeyrodriguezquilindo;

public class IkerArbeyRodriguezquilindo {


    
        public static void main(String[] args) {
    // tablas de multiplicar
    int multiplicador =1;
    int numero =1;
        System.out.println("Ingresar un numero para generar la tabla de multiplicar del 10,s");
         System.out.println("Ingrese el numero");
         
      while (numero <=10){
          System.out.println("  tabla del "+ numero);
         while(multiplicador <=10){
           
         
                 int resultado = multiplicador * numero;
         System.out.println( numero + "X" + multiplicador + "=" + resultado);
       multiplicador++;
         }
         
        
         System.out.println();
         multiplicador =1;
         numero++;
         
      }
      
    }
}