package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       // System.out.println("processo seletivo");
       //selecaoCandidatos();
       //imprimirSelecionados();
       String [] candidatos = {"Felipe", "Marcia", "Julia","Paulo","Augusto"};
       
       for(String candidato: candidatos){
        entrandoEmContato(candidato);
       }
       
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("*** CONTATO REALIZADO COM SUCESSO ***");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato +" NA "+ tentativasRealizadas +" TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato +" NUMERO MAXIMO TENTATIVAS "+ tentativasRealizadas);

        }

    }    

    // metodo atender chamada
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia","Paulo","Augusto"};
        
        System.out.println("Imprimir a lista de candidatos usando o  indice");
       
        for(int indice=0; indice < candidatos.length; indice++){
           System.out.println("O candidato de nº "+ (indice+1) + " e " + candidatos[indice]); 
        }

        System.out.println("Forma abraviada de interação por -- ForEach");

        for(String candidato: candidatos ){
            System.out.println("O candidato selecionada foi " + candidato);
        }
    }

    static void selecaoCandidatos(){

            String [] candidatos = {"Felipe", "Marcia", "Julia","Paulo","Augusto","Mônica","Fabricio","Dany"};

            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato "+ candidato +" solicitou este valor de salário "+ salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato "+ candidato +" foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatosAtual++;
            }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase> salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar  para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");

        }
    }

}
