package repitajoptionpane;

import javax.swing.JOptionPane;

public class RepitaJOptionPane {

    public static void main(String[] args) {
        //JOptionPane são janelas prontas do Java.
        //                              Nome da janela que será aberta (como não temos janela deixaremos como Null),
        //                              Mensagem do corpo, Título, Tipo de janela.
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
        
        int n, s = 0, i = 0, pares = 0, impares = 0, cem = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n(O valor 0 interrompe a contagem)"));
            s += n;
            i++;
            
            if(n%2 == 0)    pares++;
            else            impares++;
            
            if(n > 100)     cem++;
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "Tesultado final: \n\n" + 
                "Voce Digitou: " + i + " número(s)" + 
                "\nTotal de pares: " + pares + 
                "\nTotal de ímpares: " + impares + 
                "\nSoma dos valores: " + s + 
                "\nMédia dos valores: " + s/i + 
                "\nMaiores de 100: " + cem );
    }
    
}
