import java.util.Scanner;;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 4, y = 10;
        /*
         * x = y++;
         * System.out.println(x);
         * System.out.println(y);
         * System.out.println("x = ++y");
         */
        x = ++y;
        System.out.println(x);
        System.out.println(y);

    }
}
