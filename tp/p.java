import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, n, s, i;
        i = 0;
        do {
            System.out.println("donner un nombre");
            n = sc.nextInt();
            i = i + 1;
        } while (n > 0);
        for (j = 1; j < n; j++) {
            s = j + 1;
        }
        System.out.println(s);
    }
}
