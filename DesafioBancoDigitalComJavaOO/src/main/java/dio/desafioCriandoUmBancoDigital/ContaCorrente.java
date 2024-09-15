package main.java.dio.desafioCriandoUmBancoDigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("**** Extrato da Conta Corrente *****");
        super.imprimirExtrato();
    }   

}
