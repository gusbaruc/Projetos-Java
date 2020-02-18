package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco jubileu = new ContaBanco();
        ContaBanco creusa = new ContaBanco();
        
        jubileu.abrirConta("cc");
        jubileu.setNumConta(1);
        jubileu.setDono("Jubileu");
        jubileu.status();
        
        System.out.println("");
        
        creusa.abrirConta("cp");
        creusa.setNumConta(2);
        creusa.setDono("Creusa");
        creusa.status();
    }
}
