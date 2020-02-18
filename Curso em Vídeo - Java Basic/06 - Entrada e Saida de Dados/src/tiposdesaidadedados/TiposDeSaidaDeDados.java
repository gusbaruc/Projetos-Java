package tiposdesaidadedados;

import java.util.Scanner;

public class TiposDeSaidaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Agora digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.println("");
        
        System.out.println("A nota é " + nota);
        //Imprimindo resultado formatado ("\n" pula linha)
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
}