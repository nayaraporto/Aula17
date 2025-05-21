package Aula17CleanCode;
import java.util.Scanner;
public class JuntaVetores {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

int a[] = new int[2];
for (int i = 0; i < 2; i++) {
System.out.println("Informe o " + i + "º valor..:");
a[i] = ler.nextInt();
}
int b[] = new int[2], c[] = new int[4];
for (int i = 0; i < 2; i++) {
System.out.println("Informe o " + i + "º valor..:");
b[i] = ler.nextInt();

c[i] = a[i];
c[i + 2] = b[i];
}
ler.close();
for (int i = 0; i < 4; i++) {
System.out.println("O valor" + i + "° é..:" + c[i]);
}
}
}

