package main.java.dio.desafioCriandoUmBancoDigital;

public class Main {
    public static void main(String[] args) {
        // instanciou banco
        Banco bancoNovo = new Banco();
        bancoNovo.setNome("Banco Novo");
        

        // instanciou um cliente
        Cliente musquito = new Cliente("Musquito", "123321-12", "Professor", "ms@email.com", "(99)0999-0000");
        musquito.setBanco(bancoNovo);

        Conta cc = new ContaCorrente(musquito);
        Conta pp = new ContaPoupanca(musquito);

        cc.depositar(200);
        cc.transferir(50, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

        System.out.println("Clientes do banco: "+ bancoNovo.clientes);



    }

}
