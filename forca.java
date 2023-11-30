import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class forca {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String palavraChave = "Pernambuco";
        String letraUsadas = "";
        String palavraChutada = "";
        int maxTentativa = 5;

        while (true) {
            palavraChutada = "";

            for (int valor = 0; valor < palavraChave.length(); valor++) {
                palavraChutada += "_";
            }

            for (int tentativa = 0; tentativa < maxTentativa; tentativa++) {
                System.out.println("Rodada: " + (tentativa + 1) + " Até agora chutada: " + palavraChutada);

                char letraTentada = Character.toLowerCase(new Scanner(System.in).next().charAt(0));

                if (letraUsadas.indexOf(letraTentada) >= 0) {
                    System.out.println("Você já tentou a letra -" + letraTentada);
                } else {
                    letraUsadas += letraTentada;

                    boolean letraEncontrada = false;

                    for (int ny = 0; ny < palavraChave.length(); ny++) {
                        char letraAtual = Character.toLowerCase(palavraChave.charAt(ny));

                        if (letraUsadas.indexOf(letraAtual) >= 0) {
                            palavraChutada += palavraChave.charAt(ny);
                            letraEncontrada = true;
                        } else {
                            palavraChutada += "_";
                        }
                    }

                    if (letraEncontrada) {
                        System.out.println("Parabéns " + letraTentada + " tem na palavra! Mas ainda existem outras letras.");
                    } else {
                        System.out.println("Infelizmente a letra " + letraTentada + " não existe na palavra!");
                    }

                    if (!palavraChutada.contains("_")) {
                        System.out.println("Parabéns a palavra adivinhada era " + palavraChutada);
                        System.exit(0);
                    }
                }
            }

            System.out.println("Você tentou " + maxTentativa + " vezes e infelizmente você não conseguiu! A palavra chave era " + palavraChave);
            System.exit(0);
        }
    }
}
