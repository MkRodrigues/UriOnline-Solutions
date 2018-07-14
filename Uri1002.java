import java.util.Scanner;
/*
Este programa le uma entrada, calcula o circulo do raio com base na entrada e apresenta o resultado.
*/
public class Uri1002 {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	
	//Variaveis
	double area, raio;
	double n = 314159;
	
	//Insercao de dados
	System.out.println("Digite o raio:  ");
	raio = input.nextDouble();
	
	// Produto das entradas
	area = (n * raio * raio);
	
	// Saida de dados
	System.out.printf("A = %.4f \n", area);
		
  }
}