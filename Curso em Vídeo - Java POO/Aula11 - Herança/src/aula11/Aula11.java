package aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("");
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        System.out.println("");
        
        Professor p1 = new Professor();
        p1.setNome("Roberto");
        p1.setIdade(42);
        p1.setSalario(1200);
        p1.receberAumento();
        
        System.out.println("");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jefferson");
        b1.setMatricula(222);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        System.out.println("");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marisa");
        t1.setRegistroProfissional(333);
        t1.praticar();
        t1.pagarMensalidade();
    }
}
