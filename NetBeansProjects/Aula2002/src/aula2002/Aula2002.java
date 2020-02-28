/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2002;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class Aula2002 {
    

   
    public static void main(String[] args) {
         double num1,num2;
         
         Scanner ler = new Scanner(System.in);
        
    System.out.println("Informe o primeiro numero: ");
            num1 = ler.nextInt();
            
    System.out.println("Informe o numero divisor: ");
            num2 = ler.nextInt();
            
       if (num1 % num2 == 0)
           System.out.println("É divisivel e o resultado é:" +num1/num2);
       
       else 
           System.out.println("O numero não é divisível");
      
    }
    
}
