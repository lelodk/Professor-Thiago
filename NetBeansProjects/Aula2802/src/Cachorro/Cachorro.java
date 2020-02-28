/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cachorro;

//Classe principal precisa ter o metodo main
//Designar uma classe para ter o metodo main

//import java.util.Locale;
//import java.util.Scanner;
public class Cachorro{
    String nome,cor;
    double peso;
    int idade;
    Dono dono;
    
    public Cachorro(Dono Dono){
        this.dono  = Dono;
     
    

    //void useLocale(Locale US) 
     void  MostrarDetalhes(){
        System.out.println("Mostrar as informações do cachorro");
        System.out.println("Nome do cachorro : " + nome);
        System.out.println("Peso : "+ peso);
        System.out.println("Cor : "+ cor);
        System.out.println("Idade : "+ idade);
        
        
    }
    



  
 
    }
    
}
   

