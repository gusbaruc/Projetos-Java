package aula04;

public class Aula04 {

    public static void main(String[] args) {
        //Como temos 2 construtores, podemos instanciar o objeto tanto vazio e passar os valores posteriormente
        //quanto já passar os parâmetros diretamente na criação do objeto.
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta("Bic", 0.5f, "Azul", true);
        
        //Acessando os atributos diretamente: ERRO, pois eles são privados
        //c1.modelo = "Bic";
        //c1.ponta = 0.5f;
        
        System.out.println("Caneta 01");
        //Acessando os atributos através dos Metodos Especiais: Maneira correta e segura
        c1.setModelo("Faber Castel");
        c1.setPonta(0.3f);
        c1.setCor("Vermelha");
        c1.tampar();
        c1.status();
        
        System.out.println("\nCaneta 02");
        c2.status();
    }
}
