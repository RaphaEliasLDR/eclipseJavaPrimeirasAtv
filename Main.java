
import java.util.Scanner;
public class Main{
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		int numero = 20;
		while (numero != 10) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			if (numero == 10) {
				System.out.println ("Você acertou!");
			}else {
				System.out.println ("Você errou, tente novamente");
			}
		}
	}
}
