/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class Exercicio1elseif {
    public static void main(String[]args){
        String nota;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
                nota = ler.next();
                if (nota.equals ("A"))
                    System.out.println("Excelente");
                else if (nota.equals ("B"))
                        System.out.println("Muito bom");
                else if (nota.equals ("C"))
                        System.out.println("Bom");
                else if (nota.equals ("D"))
                        System.out.println("Regular");
                                else if (nota.equals ("E"))
                                System.out.println("Recuperação");
                              
                               
                                
                                
                                     
                
    }
}
