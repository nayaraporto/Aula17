package Aula17CleanCode;
import java.util.Scanner;
public class JuntaVetores {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];
		
		for(int i=0; i<2; i++) {
			System.out.println("Informe o " + i + " valor ..:");
			a[i] = ler.nextInt();
		}
		
        for(int i=0; i<2; i++) {
        System.out.println("Informe o " + i + " valor ..:");
		b[i] = ler.nextInt();
		
	}
	
	    for(int i=0; i<2; i++) {
	    	c[i] = a[i];
	    	c[i] = b[i];
	    }
	    for(int i=0; i<4; i++) {
	    	System.out.println("Informe o " + i + " valor..:" + c[i]);
	    }
        ler.close();
	}

}
