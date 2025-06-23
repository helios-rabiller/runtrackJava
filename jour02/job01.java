class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + toto);
    }
}

//La variable toto est une variable d’instance pas statique mais dans main, on essaie d’y accéder comme si elle était statique avec System.out.println