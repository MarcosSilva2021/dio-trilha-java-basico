package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    // atributos
    private String nome;
    private int codigoConvite;


    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    public String getNome() {
        return nome;
    }


    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(instanceof Convidado convidado))
            return false;
        return getCodigoConvite() == Convidado.getCodigoConvite();                   
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }


    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }    

}


