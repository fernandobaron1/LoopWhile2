
package loopwhile2;

import java.util.Scanner;


public class LoopWhile2 {

    
    public static void main(String[] args) {
        
         int numero = 0;
        
        Scanner leia = new Scanner (System.in);
        
        do {
            System.out.println("Informe um número maior que zero");
            numero = leia.nextInt();
            
            if (numero < 1) {
                System.out.println ("O número informado deve ser maior que zero");
            }
        } while (numero < 1);
        
        int contador = 0;
        int resultado = 0;
        while (numero <= 10) {
            
            contador = 0;
            while (contador <= 10) {
            resultado = numero * contador;
            System.out.println (numero+" x "+contador+" = "+resultado);
            contador++;
            
        }
        System.out.println("");
        numero++;
    
    }
    
    }
}
