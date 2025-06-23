import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int somme = 0;
    for (int i = 0; i < 5; i++) {
        System.out.print("Entrez un entier : ");
        somme += sc.nextInt();
    }
    float moyenne = somme / 5.0f;
    System.out.println("La moyenne est : " + moyenne);
}

