package aula02;

public class Caneta {
    //DEFININDO ATRIBUTOS
    //Caso não definido, a visibilidade padrão do Java é 'Publico por Pacote'
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //DEFININDO MÉTODOS
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Destampe a caneta para poder rabiscar.");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    //Como o método é publico eu posso chama-lo da classe Aula02, mesmo com o atributo
    //'tampada' sendo privado, pois quem está alterando seu estado é a propria classe
    //Caneta.
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this. tampada = false;
    }
}