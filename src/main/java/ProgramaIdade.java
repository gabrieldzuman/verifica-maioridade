package pacote;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System in);
        
        System.out.printIn("Qual a sua idade?");
        int idade = leitor.nextInt();

        if(idade < 0) {
            System.out.printIn("Idade inválida!");
        }else if(idade >= 18) {
            System.out.printIn("Maior de idade!");
        }else {
            System.out.printIn("Menor de idade!")
        }
    }
}