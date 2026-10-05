import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga para mim o dia da data mais antiga: ");
        int dia_1 = sc.nextInt();

        System.out.print("Beleza agora o mes da data mais antiga: ");
        int mes_1 = sc.nextInt();

        System.out.print("Ok, agora o ano da data mais antiga: ");
        int ano_1 = sc.nextInt();

        System.out.print("Agora o dia da data mais recente: ");
        int dia_2 = sc.nextInt();

        System.out.print("O mes da data mais recente: ");
        int mes_2 = sc.nextInt();

        System.out.print("E por ultimo o ano da data mais recente: ");
        int ano_2 = sc.nextInt();

        int dias_1 = 0;
        int dias_2 = 0;

        for (int ano = 1; ano < ano_1; ano++) {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                dias_1 += 366;
            } else {
                dias_1 += 365;
            }
        }

        for (int ano = 1; ano < ano_2; ano++) {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                dias_2 += 366;
            } else {
                dias_2 += 365;
            }
        }

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int mes = 1; mes < mes_1; mes++) {
            dias_1 += diasMes[mes - 1];

            if (mes == 2 && (ano_1 % 400 == 0 || (ano_1 % 4 == 0 && ano_1 % 100 != 0))) {
                dias_1++;
            }
        }

        dias_1 += dia_1;

        for (int mes = 1; mes < mes_2; mes++) {
            dias_2 += diasMes[mes - 1];

            if (mes == 2 && (ano_2 % 400 == 0 || (ano_2 % 4 == 0 && ano_2 % 100 != 0))) {
                dias_2++;
            }
        }

        dias_2 += dia_2;

        System.out.println("Os dias decorridos foram " + (dias_2 - dias_1));

        sc.close();
    }
}