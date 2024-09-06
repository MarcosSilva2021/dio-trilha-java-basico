package main.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;


public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if (! convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet){
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio !!");
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        if (! convidadosSet.isEmpty()) {
            System.out.println("\nExibindo Convidados:\n"+convidadosSet);
        } else {
            System.out.println("O conjunto está vazio !!");
        }
    }

    public static void main(String[] args) {
        // criando uma instancia da classe ConjConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // exibir numero de canvidados
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " Convidados");

        // add convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Manuel", 1234);
        conjuntoConvidados.adicionarConvidado("Bernanrdo", 12345);
        conjuntoConvidados.adicionarConvidado("Carlos", 12345);
        conjuntoConvidados.adicionarConvidado("Davi", 1236); 

        //Exibir convidados
        conjuntoConvidados.exibirConvidados();

        // exibir numero ataualizado de convidados
        System.out.println("Agora existem "+conjuntoConvidados.contarConvidados()+" convidado(s) dentro do Set de convidados");

        // Remover um candidato
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
       System.out.println("Agora existem "+conjuntoConvidados.contarConvidados()+" convidado(s) dentro do Set de convidados");

        //exibir os convidados atualizado no conjunto
        System.out.println("Convidados no conjunto apos a remoção:\n");
        conjuntoConvidados.exibirConvidados();

    }   



    

}
