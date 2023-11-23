package fundamentos;
import java.util.Scanner;
public class desafio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		System.out.println("De acordo com as perguntas, Informe 1 Para sim e 2 Para não");
		System.out.println("Telefonou para vítama: ");
		double resp = entrada.nextDouble();
		if (resp == 1) {
			contador += 1;
		}
		System.out.print("Esteve no local do crime: ");
		resp = entrada.nextDouble();
		if (resp == 1) {
			contador += 1;
		}
		System.out.print("Mora perto da vítama: ");
		resp = entrada.nextDouble();
		if (resp == 1) {
			contador += 1;
		}
		System.out.print("Devia para a vítama: ");
		resp = entrada.nextDouble();
		if (resp == 1) {
			contador += 1;
		}
		System.out.println("Já trabalhou com a vítama: ");
		resp = entrada.nextDouble();
		if (resp == 1) {
			contador += 1;
		}
		
		if (contador == 2) {
			System.out.println("Suspeita");
		}
		else if (contador == 4 || (contador == 3)) {
			System.out.println("Cúmplice");
		}
		else if (contador == 5) {
			System.out.println("Assasino");
		}
		else {
			System.out.println("Inocente");
		}
		}
		
	}
