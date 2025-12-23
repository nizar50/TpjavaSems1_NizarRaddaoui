import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, k;
        System.out.println("donner le temp c");
        c = sc.nextDouble();
        k = c + 273.15;
        System.out.println(k);
    }
}
