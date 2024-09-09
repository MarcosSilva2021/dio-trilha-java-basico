package main.set.Ordenacao;

public class Aluno {
    // atributos
    private String nome;
    private Long matricula;
    private double madia;    
    
    public Aluno(String nome, Long matricula, double madia) {
        this.nome = nome;
        this.matricula = matricula;
        this.madia = madia;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMadia() {
        return madia;
    }

    

    
    

}
