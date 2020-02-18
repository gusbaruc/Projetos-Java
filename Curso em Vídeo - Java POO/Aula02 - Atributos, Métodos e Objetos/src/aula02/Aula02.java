package aula02;

public class Aula02 {

    public static void main(String[] args) {
        //CRIANDO PRIMEIRO OBJETO
        Caneta c1 = new Caneta();
        
        //DECLARANDO SEUS ATRIBUTOS (ESTADO)
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 55;
        c1.destampar();
        
        System.out.println("Caneta 01:");
        c1.status();
        c1.rabiscar();
        //------------------------------------
        //CRIANDO SEGUNDO OBJETO
        Caneta c2 = new Caneta();
        
        //DECLARANDO SEUS ATRIBUTOS (ESTADO)
        c2.modelo = "Faber Castell";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.carga = 23;
        c2.tampar();
        
        System.out.println("\nCaneta 02:");
        c2.status();
        c2.rabiscar();
    }
}
