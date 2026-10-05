public class Exercicio_04 {
    public static void main(String[] args) {
        int multiplos_2 = 0;
        int multiplos_3 = 0;
        int multiplos_5 = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 2 == 0) {
                multiplos_2++;
            }

            if (i % 3 == 0) {
                multiplos_3++;
            }

            if (i % 5 == 0) {
                multiplos_5++;
            }
        }

        System.out.println("Multiplos de 2 é " + multiplos_2);
        System.out.println("Multiplos de 3 é " + multiplos_3);
        System.out.println("Multiplos de 5 é " + multiplos_5);
    }
}