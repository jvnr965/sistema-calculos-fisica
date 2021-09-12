package fisica;

public class Calculadora {
  public float calcularForcaPeso(float massa, float gravidade){
    return massa * gravidade;
  }

  public float calcularForcaCentripeda(float massa, float raio, float velocidade){
    return  massa * ( (float)Math.pow(velocidade, 2) / raio );
  }

  public float calcularImpulso(float forca, float tempo){
    return  forca * tempo;
  }

  public float calcularForcaElastica(float constanteElastica, float variacao){
    return  constanteElastica * variacao;
  }

  public float calcularVelocidadeMedia(float deslocamento, float intervalo){
    return  deslocamento / intervalo;
  }

  public float calcularMovimentoUniforme(float posicaoInicial, float posicaoFinal, float tempoFinal, float tempoInicial){
    return ( posicaoFinal - posicaoInicial ) / ( tempoFinal - tempoInicial );
  }   
    
  public float calcularMovimentoUniformeVariavel(float velocidadeInicial, float velocidadeFinal, float tempoFinal, float tempoInicial){
    return ( velocidadeFinal - velocidadeInicial ) / ( tempoFinal - tempoInicial );
  }   
}

