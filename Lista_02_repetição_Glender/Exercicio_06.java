import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior_indice = 0;
        int menor_indice = 0;

        int codigo_maior = 0;
        int codigo_menor = 0;

        int soma_veiculos = 0;

        int soma_acidentes_menos2000 = 0;
        int cidades_menos2000 = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nA Cidade " + i);

            System.out.print("Qual o codigo da cidade: ");
            int codigo = sc.nextInt();

            System.out.print("Agora o numero de veiculos de passeio: ");
            int veiculos = sc.nextInt();

            System.out.print("E o numero de acidentes com vitimas: ");
            int acidentes = sc.nextInt();

            int indice = acidentes * 1000 / veiculos;

            System.out.println("Indice de acidentes é de " + indice);

            soma_veiculos = soma_veiculos + veiculos;

            if (indice > maior_indice) {
                maior_indice = indice;
                codigo_maior = codigo;
            }

            if (i == 1 || indice < menor_indice) {
                menor_indice = indice;
                codigo_menor = codigo;
            }

            if (veiculos < 2000) {
                soma_acidentes_menos2000 = soma_acidentes_menos2000 + acidentes;
                cidades_menos2000++;
            }
        }

        double media_veiculos = soma_veiculos / 5.0;

        System.out.println("\n----- RESULTADOS -----");

        System.out.println("Maior indice de acidentes é " + maior_indice);
        System.out.println("Cidade com maior indice é " + codigo_maior);
        System.out.println("Menor indice de acidentes é " + menor_indice);
        System.out.println("Cidade com menor indice é " + codigo_menor);

        System.out.println("Media de veiculos é de " + media_veiculos);

        if (cidades_menos2000 > 0) {
            double mediaAcidentes = (double) soma_acidentes_menos2000 / cidades_menos2000;
            System.out.println("Media de acidentes nas cidades com menos de 2000 veiculos sera de " + mediaAcidentes);
        } else {
            System.out.println("Nenhuma cidade possui menos de 2000 veiculos manezao");
        }

        sc.close();
    }
}