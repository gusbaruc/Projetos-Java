package aula02;

public class Aula02 {

    public static void main(String[] args) {
        //CRIANDO PRIMEIRO OBJETO
        Caneta c1 = new Caneta();
        
        //DECLARANDO SEUS ATRIBUTOS (ESTADO)
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 55;
        //c1.tampada = false;
        c1.destampar();
        
        System.out.println("Caneta 01:");
        c1.status();
        c1.rabiscar();
    }
}
