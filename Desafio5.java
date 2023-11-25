package desafioscdd;
import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	System.out.print("Informe seu genero F - Feminino e M - Masculino: ");
	String sexo = entrada.next(); 
	if (sexo.equalsIgnoreCase("F")) {
		System.out.println("Você é do sexo Feminino");
	}
	else if (sexo.equalsIgnoreCase("M")){
		System.out.println("Você é do sexo Masculino");
	}
	else {
		System.out.println("Você digitou um valor inválido!");
	}
	}
}
