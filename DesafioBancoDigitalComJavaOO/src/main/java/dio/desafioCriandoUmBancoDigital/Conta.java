package main.java.dio.desafioCriandoUmBancoDigital;

public abstract class Conta implements Iconta {

    // acesso apenas pelas classes filhas
    private static final int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL = 1; //variavel de controle iniciada em 1 dentro da classe pra criar nº seq de conta

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;    

    public Conta(Cliente cliente) {
       this.agencia = Conta.AGENCIA_PADRAO;
       this.numero = SEQUENCIAL++;
       this.cliente = cliente;
    }    

    public Conta() {
    }     

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }    

    @Override
    public String toString() {
        return "{agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "}";
    }

    // imprimir informações de extratos
    protected void imprimirInformacoesExtrato(){
        System.out.println(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d%n", this.agencia));
        System.out.println(String.format("Numero: %d%n", this.numero));
        System.out.println(String.format("Saldo: %d%n", this.saldo));
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente !!!");            
        } else {
            saldo = saldo - valor;
        }
    }  

    @Override
    public void depositar(double valor) {
       saldo += valor; 
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente !!!");            
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
       
    }

}
