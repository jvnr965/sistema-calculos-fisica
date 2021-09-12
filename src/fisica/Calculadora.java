package fisica;

public class Calculadora {
  public float calcularForcaPeso(float massa, float gravidade){
    float peso = massa * gravidade;
    return peso;
  }

  public float calcularForcaCentripeda(float massa, float raio, float velocidade){
    return  massa * ( (float)Math.pow(velocidade, 2) / raio );
  }

}
