package fisica;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Calculadora calculadora = new Calculadora();
    Scanner teclado = new Scanner(System.in);

    System.out.println("Calcular Força Peso: \nMassa: ");
    float massaForcaPeso = teclado.nextFloat();
    System.out.println("Gravidade: ");
    float gravidade = teclado.nextFloat();
    float resultadoForcaPeso = calculadora.calcularForcaPeso(massaForcaPeso, gravidade);
    System.out.printf("Resultado: %.2fN \n", resultadoForcaPeso);

    System.out.println("Calcular Força Centripeda: \nMassa: ");
    float massaForcaCentripeda = teclado.nextFloat();
    System.out.println("Velocidade: ");
    float velocidade = teclado.nextFloat();
    System.out.println("Raio: ");
    float raio = teclado.nextFloat();
    float resultadoForcaCentripeda = calculadora.calcularForcaCentripeda(massaForcaCentripeda, raio, velocidade);
    System.out.printf("Resultado: %.2fN \n", resultadoForcaCentripeda);

    System.out.println("Calcular Impulso: \nForça: ");
    float forca = teclado.nextFloat();
    System.out.println("tempo: ");
    float tempo = teclado.nextFloat();
    float resultadoImpulso = calculadora.calcularImpulso(forca, tempo);
    System.out.printf("Resultado: %.2fN \n", resultadoImpulso);

    System.out.println("Calcular Força Elastica: \nConstante Elastica: ");
    float constanteElastica = teclado.nextFloat();
    System.out.println("Variação sofrida pelo corpo elástico: ");
    float variacao = teclado.nextFloat();
    float resultadoForcaElastica = calculadora.calcularForcaElastica(constanteElastica, variacao);
    System.out.printf("Resultado: %.2fN \n", resultadoForcaElastica);

    System.out.println("Calcular Velocidade Media: \nIntervalo do deslocamento: ");
    float deslocamento = teclado.nextFloat();
    System.out.println("Intervalo de tempo: ");
    float intervalo = teclado.nextFloat();
    float resultadoVelocidadeMedia = calculadora.calcularVelocidadeMedia(deslocamento, intervalo);
    System.out.printf("Resultado: %.2fKM/h \n", resultadoVelocidadeMedia);
    
    
    System.out.println("Movimento retilíneo uniforme:\n Posição Inicial: ");
    float posicaoInicial = teclado.nextFloat();
    System.out.println("Posição final: ");
    float posicaoFinal = teclado.nextFloat();
    System.out.println("Tempo Inicial: ");
    float tempoInicialMru = teclado.nextFloat();
    System.out.println("Tempo Final: ");
    float tempoFinalMru = teclado.nextFloat();
    float resultadoMovimentoUniforme = calculadora.calcularMovimentoUniforme(posicaoInicial, posicaoFinal, tempoFinalMru, tempoInicialMru);
    System.out.printf("Resultado: %.2fKM/h \n", resultadoMovimentoUniforme);

    System.out.println("Movimento retilíneo uniformemente variado:\n Velocidade Inicial: ");
    float velocidadeInicial = teclado.nextFloat();
    System.out.println("Velocidade final: ");
    float velocidadeFinal = teclado.nextFloat();
    System.out.println("Tempo Inicial: ");
    float tempoInicialMruv = teclado.nextFloat();
    System.out.println("Tempo Final: ");
    float tempoFinalMruv  = teclado.nextFloat();
    float resultadoMovimentoUniformeVariavel = calculadora.calcularMovimentoUniformeVariavel(velocidadeInicial, velocidadeFinal, tempoFinalMruv, tempoInicialMruv);
    System.out.printf("Resultado: %.2fm/s2 \n", resultadoMovimentoUniformeVariavel);

    teclado.close();

  }
}
