package Aula17CleanCode;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		double a = ler.nextDouble();
		
		String msg = (a % 5 == 0) ? "O número " + a + " é multiplo de 5" : "O número " + a + "Não é multiplo de 5";
		System.out.println(msg);
		ler.close();

	}

}
