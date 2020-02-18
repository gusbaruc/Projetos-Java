package aula05;

public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //CONSTRUTOR
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    //GETTERS & SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //MÉTODOS
    public void abrirConta(String conta) {
        if(conta == "cc" || conta == "cp") {
            this.status = true;
            this.tipo = conta;
            
            if(conta == "cc") {
                System.out.println("Conta Corrente aberta com sucesso!");
                this.saldo = 50;
            } else {
                System.out.println("Conta Poupança aberta com sucesso!");
                this.saldo = 150;
            }
                
        } else {
            System.out.println("Tipo de conta inválida!");
        }
    }
    
    public void fecharConta() {
        if(this.status == true) {
            
            if(this.saldo == 0) {
                this.status = false;
                System.out.println("Conta fechada com sucesso!");
            } else {
                System.out.println("Erro! Para fechar a conta o saldo deve ser zero.");
            }
            
        } else {
            System.out.println("Essa conta já está fechada.");
        }
    }
    
    public void depositar(float dol) {
        if(this.status == true) {
            this.saldo += dol;
        } else {
            System.out.println("Abra uma conta primeiro!");
        }
    }
    
    public void sacar(float dol) {
        if(this.status == true) {
            
            if(this.saldo >= dol) {
                this.saldo -= dol;
            } else {
                System.out.println("Seu saldo não é suficiente para esse saque.");
            }
            
        } else {
            System.out.println("Abra a conta primeiro!");
        }
    }
    
    public void pagarMensal() {
        
        if(this.status == true) {
            
            if(this.tipo == "cc") {
                this.saldo -= 12;
                System.out.println("Debito de R$12,00 realizado com sucesso.");
            } else {
                this.saldo -= 20;
                System.out.println("Debito de R$20,00 realizado com sucesso.");
            }
            
        } else {
            System.out.println("Sua conta está fechada, logo o pagamento da mensalidade não é necessário.");
        }

    }
    
    public void status() {
        System.out.print("Conta: " + this.numConta);
        System.out.println(" - " + this.tipo);
        System.out.println("Status: " + this.status);
        System.out.println("Nome: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
    }
}
