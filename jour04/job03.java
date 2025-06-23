import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class job03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Longueur de la chaîne à générer : ");
        int length = sc.nextInt();

        long start = System.currentTimeMillis();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] str = new char[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            str[i] = chars.charAt(rand.nextInt(chars.length()));
        }

        int mid = length / 2;
        Thread t1 = new Thread(() -> {
            try (FileWriter fw = new FileWriter("output.txt")) {
                fw.write(str, 0, mid);
            } catch (IOException e) { e.printStackTrace(); }
        });

        Thread t2 = new Thread(() -> {
            try (FileWriter fw = new FileWriter("output.txt", true)) {
                fw.write(str, mid, length - mid);
            } catch (IOException e) { e.printStackTrace(); }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("Temps d'exécution : " + (end - start) + " ms");
    }
}
