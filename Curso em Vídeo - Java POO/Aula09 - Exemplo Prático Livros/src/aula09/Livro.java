package aula09;
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPagnas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Públicos
    //O método toString mostra todos os dados.
    //Obs: Geramos um toString e só renomeamos para detalhes e removemos o Override.
    public String detalhes() {
        return "Livro{" + "\nTitulo = " + titulo + "\nAutor = " + autor + ",\nTotal de Paginas = " + totPagnas + "\nPagina Atual = " + pagAtual + "\nAberto = " + aberto + 
               "\nLeitor = " + leitor.getNome() + "\nIdade = " + leitor.getIdade() + "\nSexo = " + leitor.getSexo() + '}';
    }
    
    //Métodos Abstratos
    //Ctrl+X exclui a linha
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPagnas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }    

    //Métodos Especiais
    public Livro(String titulo, String autor, int totPagnas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagnas = totPagnas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagnas() {
        return totPagnas;
    }

    public void setTotPagnas(int totPagnas) {
        this.totPagnas = totPagnas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
