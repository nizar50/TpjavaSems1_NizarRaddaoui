import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("donner a");
        a = sc.nextInt();
        System.out.println("donner un entier b");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("le nouvelle de a est" + a + "est b=" + b);

    }
}
