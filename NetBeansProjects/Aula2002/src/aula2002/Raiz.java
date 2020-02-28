
package aula2002;

import java.util.Scanner;


public class Raiz {
    public static void main(String[]args){
        double x;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o numero para a raiz quadrada: ");
        x = ler.nextDouble();
        
        System.out.println("A raiz é: " + Math.sqrt(x));
    }
    
}
