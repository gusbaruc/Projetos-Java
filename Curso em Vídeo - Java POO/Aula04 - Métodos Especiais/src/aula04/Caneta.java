package aula04;

public class Caneta {
    //ATRIBUTOS
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //Ctrl+Space ou Alt+Ins(0) gera automaticamente contrutor, getter e setter...

    //MÉTODO CONSTRUTOR VAZIO
    public Caneta() {}

    //MÉTODO CONSTRUTOR COM PARÂMETROS
    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
    }

    //MÉTODOS GETTERS & SETTERS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    //OUTROS MÉTODOS
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("A caneta está tampada?: " + this.isTampada());
    }
    
    public void tampar() {
        this.setTampada(true);
    }
    
    public void destampar() {
        this.setTampada(false);
    }
}
