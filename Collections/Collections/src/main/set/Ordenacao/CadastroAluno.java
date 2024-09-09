package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroAluno {
    // atributos
    private Set<Aluno> alunosSet;

    public CadastroAluno() {
        this.alunosSet = new HashSet<>();
    }

    public void removerAlunoPorMatricula(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a: alunosSet){
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio !");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada !");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio !");
        }
    }

    public void exibirAlunosPorNota(){}

    

}
