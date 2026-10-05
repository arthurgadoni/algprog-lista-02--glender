import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me fala o valor de n: ");
        int n = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {

            double resultado = 1;

            for (int j = 1; j <= i; j++) {
                resultado = resultado * i;
            }

            soma = soma + resultado;
        }

        System.out.println("O resultado disso ai é de " + soma);

        sc.close();
    }
}