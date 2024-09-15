package main.java.dio.desafioCriandoUmBancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("**** Extrato Conta poupança ****");
        super.imprimirExtrato();
    }

}
