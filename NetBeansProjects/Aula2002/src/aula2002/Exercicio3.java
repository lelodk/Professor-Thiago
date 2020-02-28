package aula2002;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        double x,y;
        String carg;

        Scanner ler = new Scanner(System.in);

        for (int i = 0;i<100; i++){
        System.out.println("Informe o cargo: ");
            carg = ler.next();
        

        switch (carg){ 
            case ("Diretor"):
                x = ((5000 / 100) * 20);
                System.out.println("O valor do aumento é de R$" + x);
                System.out.println("O valor do salário com aumento é de R$" + (x + 5000));
                break;

            case ("Coordenador"):
                x = ((2800 / 100) * 10);
                System.out.println("O valor do aumento é de R$" + x);
                System.out.println("O valor do salário com o aumento é de R$" + (x + 2800));
                break;

            case ("Supervisor"):
                x = ((1000 / 100) * 5);
                System.out.println("O valor do aumento é de R$" + x);
                System.out.println("O valor do salário com o aumento é de R$" + (x + 1000));
                break;

            case ("Auxiliar"):
                x = ((500 / 100) * 2);
                System.out.println("O valor do aumento é de R$" + x);
                System.out.println("O valor do salário com o aumento é de R$" + (x + 500));
                break;
                
            case ("Sair"):
                System.exit(0);
                
            default:
                System.out.println("Cargo inválido");
                break;
        }
        }
    }
}

