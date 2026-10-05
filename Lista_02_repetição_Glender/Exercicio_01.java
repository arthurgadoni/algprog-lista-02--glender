public class Exercicio_01 {
    public static void main(String[] args) {

        int numero = 233;

        while (numero <= 456) {

            System.out.println(numero);

            if (numero >= 300 && numero <= 400) {
                numero = numero + 3;
            } else {
                numero = numero + 5;
            }
        }
    }
}
