package fisica;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Calculadora calculadora = new Calculadora();
    Scanner teclado = new Scanner(System.in);

    System.out.println("Calcular Força Peso: \nMassa: ");
    float massa = teclado.nextFloat();
    System.out.println("Gravidade: ");
    float gravidade = teclado.nextFloat();
    float resultado = calculadora.calcularForcaPeso(massa, gravidade);
    System.out.printf("Resultado: %.2fN \n", resultado);

    System.out.println("Calcular Força Centripeda: \nMassa: ");
    massa = teclado.nextFloat();
    System.out.println("Velocidade: ");
    float velocidade = teclado.nextFloat();
    System.out.println("Raio: ");
    float raio = teclado.nextFloat();
    resultado = calculadora.calcularForcaCentripeda(massa, raio, velocidade);
    System.out.printf("Resultado: %.2fN \n", resultado);

    teclado.close();

  }
}
