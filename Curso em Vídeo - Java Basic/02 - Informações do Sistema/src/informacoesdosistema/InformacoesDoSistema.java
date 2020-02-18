package informacoesdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class InformacoesDoSistema {

    public static void main(String[] args) {
        //Pegando a data e hora do sistema
        Date relogio = new Date();
        
        //Pegando o idioma do sistema
        Locale idioma = Locale.getDefault();
        
        //Pegando a dimensão da tela
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        
        //Comando para visualizar somente o ano atual do sistema:
        //Calendar ano = GregorianCalendar.getInstance();
        
        System.out.println("Informações do Sistema:\n");
        
        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        System.out.println("Versão: " + System.getProperty("os.version"));
        System.out.println("Nome de usuário: " + System.getProperty("user.name"));
        
        System.out.println(); //usando o println só pra pular linha
        
        System.out.println("Data e hora: " + relogio.toString());
        //System.out.println("Ano Atual: " + ano.get(Calendar.YEAR));
        System.out.println("Idioma: " + idioma.getDisplayLanguage());
        System.out.println("Resolução da tela: " + d.width + "x" + d.height);
    }
}
