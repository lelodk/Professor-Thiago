/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cachorro;

import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class Gato {
    String cor,nome;
    double peso;  
    int idade;

    //void useLocale(Locale US)
     void    MostrarDetalhes(){
        System.out.println("Mostrar as informações do Gato");
        System.out.println("Nome do Gato : " + nome);
        System.out.println("Peso : "+ peso);
        System.out.println("Cor : "+ cor);
        System.out.println("Idade : "+ idade);
            }
    
    
}
