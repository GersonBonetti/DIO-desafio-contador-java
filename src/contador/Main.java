package contador;
import java.util.Scanner;

class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 >= numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Por favor, insira números inteiros válidos.");
        } finally {
            scanner.close();
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}