import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez le premier nombre : ");
    int a = sc.nextInt();
    System.out.print("Entrez le deuxième nombre : ");
    int b = sc.nextInt();
    System.out.print("Entrez le troisième nombre : ");
    int c = sc.nextInt();

    int max = Math.max(a, Math.max(b, c));
    System.out.println("Le maximum des trois nombres est : " + max);
}

