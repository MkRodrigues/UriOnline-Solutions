import java.util.Scanner;
/*
* Este programa le duas entradas, e calcula o produto das entradas, por fim, apresenta o resultado na tela
*/

public class  Uri1004{
      public static void main (String[] args){
          Scanner input = new Scanner(System.in);
         
         // Variaveis Principais 
         int a, b, PROD; 
        
         // Insercao de dados
        System.out.println("Digite A: ");
        a= input.nextInt();
        System.out.println("Digite B: ");
        b = input.nextInt();
        
         // Soma das Variaveis
        PROD = (a*b);
         
         // Saida de dados
        System.out.printf("PROD = %d %n", PROD );

   }  
}