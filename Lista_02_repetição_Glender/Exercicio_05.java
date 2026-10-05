import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior_idade = 0;
        int menor_idade = 0;
        int quantidade = 0;

        while (true) {

            System.out.print("Habla pra mim a idade ai: ");
            int idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Agora o sexo: ");
            char sexo = sc.next().charAt(0);

            System.out.print("E a cor dos olhos: ");
            String olhos = sc.next();

            System.out.print("Qual o cor dos cabelos: ");
            String cabelos = sc.next();

            if (idade > maior_idade) {
                maior_idade = idade;
            }

            if (menor_idade == 0 || idade < menor_idade) {
                menor_idade = idade;
            }

            if (sexo == 'F' &&
                idade >= 18 && idade <= 35 &&
                olhos.equalsIgnoreCase("verdes") &&
                cabelos.equalsIgnoreCase("louros")) {

                quantidade++;
            }
        }

        System.out.println("Maior idade é " + maior_idade);
        System.out.println("Menor idade é " + menor_idade);
        System.out.println("Quantidade é " + quantidade);

        sc.close();
    }
}