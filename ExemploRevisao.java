package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1(){
        System.out.println("Digite um nº inteiro"); //1. Ler um numero.
        double nDigiado = sc.nextDouble();
        //2. Se n >10.
        if (nDigiado>10){  //operação relacional.
            System.out.println("É maior que 10");
        }
        //3. Senão mostre "Não é maior que 10".
        else {
            System.out.println("Não é maior que 10");
        }
    }
}
