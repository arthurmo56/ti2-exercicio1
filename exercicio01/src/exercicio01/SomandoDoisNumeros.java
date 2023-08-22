package exercicio01;
import java.util.*;
 class SomandoDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	 public static void main(String args[]) {

		 //Declaração das variaveis
		 int n1, n2, soma;

		 //Leitura dos numeros
		 System.out.println("Digite um numero");
		 n1= sc.nextInt();
		 System.out.println("Digite outro numero");
		 n2= sc.nextInt();

		 //Efetuar a soma
		 soma = n1+n2;

		 // Exibir o resultado
		 System.out.println("Soma: " + soma);
	 }
}
