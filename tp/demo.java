import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int aux;
        System.out.println("donner un entier a");
        a = sc.nextInt();
        System.out.println("donner un entier b ");
        b = sc.nextInt();
        aux = a;
        a = b;
        b = aux;
        System.out.println("la nouvelle valeur de a   " + a + "la nouvelle valeur de b " + b);
        sc.close();
    }
}