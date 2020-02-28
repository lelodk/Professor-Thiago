/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota;
        
        Scanner ler = new Scanner (System.in);
        nota.useLocale(Locale.us);
        
        System.out.println("Informe a nota do aluno: ");
        nota = ler.nextFloat();
        
        if (nota >=7)
            System.out.println("Passou direto");
        else if ((nota >=4)&&(nota <7))
            System.out.println("Recuperação");
        else if (nota <4)
            System.out.println("Reprovado");
        
        
        
        
    }
    
}
