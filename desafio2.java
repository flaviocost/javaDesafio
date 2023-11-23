package fundamentos;
import java.util.Scanner;

public class desafio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double a = entrada.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double b = entrada.nextDouble();
		System.out.println("Digite o Terceiro valor: ");
		double c = entrada.nextDouble();
		if ((a>b)&&(a>c)){
			System.out.println("A é maior que B e C");
		}
		else if ((b>a)&&(b>c)) {
			System.out.println("B é maior que A e C");
		}
		else {
			System.out.println("C é maior que A e B");
		}
	}
}
