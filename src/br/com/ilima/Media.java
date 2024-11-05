package br.com.ilima;

public class Media {

	public static void main(String args[]) {
		calculoMedia();
	}
	
	public static void calculoMedia() {
		int nota1 = 10;
		int nota2 = 5;
		int nota3 = 8;
		int nota4 = 4;
		
		float somaTotal = nota1 + nota2 + nota3 + nota4;
		
		float media = somaTotal / 4;
		
		System.out.println("A media é: " + media);
	}
	
}
