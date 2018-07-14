import java.util.Scanner;
/*
* Este programa le uma entrada A e B, soma as duas e apresenta o resultado  em X
*/

public class  Uri1001{
      public static void main (String[] args){
          Scanner input = new Scanner(System.in);
         
         // Variaveis Principais 
         int A, B, X; 
        
         // Insercao de dados
        System.out.println("Digite A: ");
        A= input.nextInt();
        System.out.println("Digite B: ");
        B = input.nextInt();
        
         // Soma das Variaveis
        X = (A + B);
         
         // Saida de dados
        System.out.printf("X = %d", X );

   }  
}