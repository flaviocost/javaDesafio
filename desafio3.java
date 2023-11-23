package fundamentos;
import java.util.Scanner;
public class desafio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um nome de 1 a 7: ");
		double resp = entrada.nextDouble();
		if (resp == 1) {
			System.out.println("Hoje é Domingo!");
		}
		else if (resp == 2) {
			System.out.println("Hoje é Segunda-feira!");
		}
		else if (resp == 3) {
			System.out.println("Hoje é Terça-feira");
		}
		else if (resp == 4) {
			System.out.println("Hoje é Quarta-feira");
		}
		else if (resp == 5) {
			System.out.println("Hoje é Quinta-feira");
		}
		else if (resp == 6) {
			System.out.println("Hoje é Sexta-feira");
		}
		else if (resp == 7) {
			System.out.println("Hoje é Sabado");
		}
		else {
			System.out.println("Valor inválido!");
		}
	}
}
