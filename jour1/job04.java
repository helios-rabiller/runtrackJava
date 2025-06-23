import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un nombre : ");
    int nombre = sc.nextInt();
    System.out.println("Le carré de " + nombre + " est " + (nombre * nombre));
}

