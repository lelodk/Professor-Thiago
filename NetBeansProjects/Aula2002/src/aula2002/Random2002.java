/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2002;

import java.util.Scanner;
import java.util.Random;
public class Random2002 {
public static void main(String[]args){
    
    int num1,num2,res;
    
    Scanner ler = new Scanner(System.in);
    Random gerador = new Random();
    
    System.out.println("Informe o primeiro numero: ");
    num1 = ler.nextInt();
    
    num2 = gerador.nextInt(10);
    res = (num1/num2);
    
    System.out.println("O numero gerado foi: "+ num2);
    
    if (num1 % num2 == 0)
        System.out.println(num1 +" dividido por " + num2 +" = " + res);
        else 
        System.out.println("Não é divisivel");
    
}    
    
}
