import java.util.Scanner;

public class Uri1003 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Variaveis
		int a, b, soma;
		
		//Entrada de Dados
		System.out.print("Digite o valor de A: ");
		a = input.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = input.nextInt();
		
		//Saida de Dados
		soma = (a + b);
		
			System.out.printf("SOMA = %d \n", soma);
	}
}