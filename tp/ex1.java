import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int x, c;
        System.out.println("donner un entier");
        a = sc.nextInt();
        x = a % 10;
        if (a % x == 0) {
            System.out.println("devisivle");
        } else {
            System.out.println("non devisible");
        }

    }
}
