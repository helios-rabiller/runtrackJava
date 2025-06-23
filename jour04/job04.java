import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre maximum à compter : ");
        int max = sc.nextInt();

        long start = System.currentTimeMillis();

        int count = 0;
        for (int i = 1; i <= max; i++) {
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("Compte total : " + count);
        System.out.println("Temps d'exécution : " + (end - start) + " ms");
    }
}
