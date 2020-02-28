/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cachorro;

/**
 *
 * @author Aluno
 */
import java.util.Locale;
public class Cadastro {
    
    /**
     *
     * @param args
     * @Public Static void main é responsavel por ser o codigo principal, sem ele o sistema
     * funcionara quando executado.
     */
    public static void main(String[]args) {
        
   
    
    // bidu é o objeto
    //new é para novo objeto
 
    

    

//chamando a classe GATO

// chamando a classe Passaro   

    
     //dog1.useLocale(Locale.US);
    // cat1.useLocale(Locale.US);
    //Ao digitar ponto estara correto se chamar os atributos da outra classe
    // orientação é buscar o objeto em outra classe utilizando dos atributos de lá
    //
    Dono dono1 = new Dono();
    dono1.nome = "Rambo";
    dono1.cel = "(41)99999-9999";
    
   Cachorro dog1 = new Cachorro();
    dog1.nome = "Bidu";
    dog1.peso = 8;
    dog1.idade = 5;
    dog1.cor = "Preto";
    
   
    
    
    
   Gato cat1 = new Gato();
    cat1.nome = "Bastião";
    cat1.peso = 5;
    cat1.idade = 2;
    cat1.cor = "Laranja";
    
    
   Passaro bird1 = new Passaro();
    bird1.nome = "Juvenal, rei do bordel";
    bird1.peso = 1;
    bird1.idade = 2;
    bird1.cor = "Roxo";
    
    
    
    bird1.MostrarDetalhes();
    System.out.println("       ");
    dog1.MostrarDetalhes();
    System.out.println("       ");
    cat1.MostrarDetalhes();
    
    
    
    
    
    
}
}
