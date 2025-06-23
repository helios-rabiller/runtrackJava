class Erreur {
    public static void main(String args[]) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a); // Correct a est un attribut de E1 qui est accessible via l'instance a
        System.out.println(y.c); // faux, c n'est pas un attribut de E2
        System.out.println(z.b); // Correct, b est un attribut de E2 accessible via l'instance z
        System.out.println(v.e); // faux, e n'est pas un attribut de E4
        System.out.println(w.a); // Correct, a est un attribut de E1 accessible via l'instance w
    }
}

class E1 { int a = 1; }
class E2 extends E1 { int b = 2; }
class E3 extends E2 { int c = 3; }
class E4 extends E1 { int d = 4; }
class E5 extends E4 { int e = 5; }
