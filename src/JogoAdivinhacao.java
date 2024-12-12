import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            System.out.println("Bem vindo ao Jogo de Adivinhação!");
            System.out.println("Escolha o nível de dificuldade: ");
            System.out.println("1. Fácil (12 tentativas)");
            System.out.println("2. Médio (10 tentativas)");
            System.out.println("3. Difícil (8 tentativas)");

            int limite = 0, maxTentativas = 0;
            boolean entradaValida = false;

            //selecionar nível de dificuldade
            while (!entradaValida) {
                System.out.print("Digite sua escolha: ");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("1") || input.equalsIgnoreCase("Fácil")) {
                    limite = 50;
                    maxTentativas = 12;
                    entradaValida = true;
                } else if (input.equals("2") || input.equalsIgnoreCase("Médio")) {
                    limite = 500;
                    maxTentativas = 10;
                    entradaValida = true;
                } else if (input.equals("3") || input.equalsIgnoreCase("Difícil")) {
                    limite = 5000;
                    maxTentativas = 8;
                    entradaValida = true;
                } else {
                    System.out.println("Opção inválida. Por favor, escolha um nível válido.");
                }
            }

            int numeroAleatorio = random.nextInt(limite) + 1;
            System.out.println("Adivinhe o número entre 1 e " + limite);
            boolean acertou = false;
            int tentativas = 0;

            //tentativas
            while (!acertou && tentativas < maxTentativas) {
                System.out.println("Tentativa " + (tentativas + 1) + " de " + maxTentativas + ":");
                int palpite = 0;
                boolean entradaValidaPalpite = false;

                //evitar erro sem break
                while (!entradaValidaPalpite) {
                    try {
                        System.out.print("Seu palpite: ");
                        palpite = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer
                        entradaValidaPalpite = true;
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Por favor, insira um número.");
                        scanner.nextLine();
                    }
                }

                tentativas++;
                if (palpite == numeroAleatorio) {
                    System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                    acertou = true;
                } else if (palpite < numeroAleatorio) {
                    System.out.println("Muito baixo! Tente novamente.");
                } else {
                    System.out.println("Muito alto! Tente novamente.");
                }

                //fornecer dica
                if (tentativas == maxTentativas / 2 && !acertou) {
                    if (maxTentativas == 12) { //dica para nível fácil
                        System.out.println("Dica: O número é " + (numeroAleatorio % 2 == 0 ? "par." : "ímpar."));
                    } else if (maxTentativas == 10) { //dica para nível médio
                        int divisor = encontrarMenorDivisor(numeroAleatorio);
                        if (divisor != -1) {
                            System.out.println("Dica: O número é divisível por " + divisor + ".");
                        } else {
                            System.out.println("Dica: O número é primo.");
                        }
                    } else if (maxTentativas == 8) { //dica para nível difícil
                        if (isQuadradoPerfeito(numeroAleatorio)) {
                            System.out.println("Dica: O número é um quadrado perfeito.");
                        } else if (isPrimo(numeroAleatorio)) {
                            System.out.println("Dica: O número é primo.");
                        } else {
                            System.out.println("Dica: A soma dos dígitos do número é " + somaDosDigitos(numeroAleatorio) + ".");
                        }
                    }
                }
            }

            //caso não acertar dentro do limite
            if (!acertou) {
                System.out.println("Você não acertou o número. O número correto era " + numeroAleatorio + ".");
            }

            System.out.print("Deseja jogar novamente? (sim/não): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            jogarNovamente = resposta.equalsIgnoreCase("sim");

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar! Até a próxima.");
        scanner.close();
    }

    //verificar se é quadrado perfeito
    private static boolean isQuadradoPerfeito(int numero) {
        int raiz = (int) Math.sqrt(numero);
        return raiz * raiz == numero;
    }

    //verificar se é número primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    //encontrar o menor divisor (menor que ele mesmo)
    private static int encontrarMenorDivisor(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return i;
            }
        }
        return -1; //número é primo
    }

    //somar os dígitos do número
    private static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
