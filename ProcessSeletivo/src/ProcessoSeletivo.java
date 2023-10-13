import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoCandidatos();
    imprimeSelecionado();

  }
  static void imprimeSelecionado() {
    String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
    for(int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato n° " + (i+1) + " é o " + candidatos[i]);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
    
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println(candidato + " - " + salarioPretendido);
      if(salarioPretendido <= salarioBase) {
        System.out.println(candidato + " selecionado com salario de: R$" + salarioPretendido);
        candidatosSelecionados++;
      }
      candidatoAtual++;
      
    }

  }

  static void analisarCandidato(double salarioDesejado) {
    double salarioBase = 2000.00;
    String resposta = salarioBase > salarioDesejado ? "Ligar para Candidato" :
      salarioBase == salarioDesejado ? "Ligar para candidato com Contra proposta" :
      "Esperar novos candidatos" ;
    System.out.println(resposta);
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
}