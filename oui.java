import java.util.Scanner;
public class oui {
public static void main (String[] args) {

	Scanner scanner = new Scanner (System.in);
	
	int numNotas = 5;
	double totalNotas = 0;
	int contador = 0;
	
			while (contador < numNotas){
				contador++;
				System.out.println("Digite a nota" +contador+ ":");
				double nota = scanner.nextDouble();
				totalNotas += nota;
			}
	double media = totalNotas / numNotas;
	System.out.println ("A m�dia das notas �: " +media);
	scanner.close();

	if (media >= 7) {
		System.out.println ("Aprovado!");
	} else if (media < 7 && media >= 4) {
		System.out.println ("Reprovado com dieito a recupe��o");
	} else if (media < 4) {
		System.out.println ("Reprovado sem direito a recupera��o.");
	}
}
}