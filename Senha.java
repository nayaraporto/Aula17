package Aula17CleanCode;
import java.util.Scanner;
public class Senha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Cadastre uma senha (apenas com números)");
		int senhaMestre = ler.nextInt();
		
		System.out.print("Digite um número : ");
		double n1 = ler.nextDouble();
		
		System.out.print("Digite outro número : ");
		double n2 = ler.nextDouble();
		double soma = n1 + n2;
		
		System.out.print("Digite a sua senha para desbloquear a soma ");
		int senhaTentativa = ler.nextInt();
		ler.close();
		
		String msg = (senhaTentativa == senhaMestre) ? "A soma é :" + soma : "Erro! Senha errada!";
		System.out.println(msg);
		
		


	}

}
