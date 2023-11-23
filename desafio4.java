package fundamentos;
import java.util.Scanner;
public class desafio4 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o nome do aluno: ");
	String aluno = entrada.next();
	System.out.println("Informe a primeira nota do aluno: ");
	double nota1 = entrada.nextDouble();
	System.out.println("Informe a segunda nota do aluno: ");
	double nota2 = entrada.nextDouble();
	double media = (nota1 + nota2)/2;
	System.out.println(media >= 7 ? "Aprovado" : (media >= 4 ? "Recuperação" : "Reprovado"));
	}
}
