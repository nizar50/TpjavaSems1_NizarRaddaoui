import java.util.Scanner;;

public class bol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean res;
        int a = 15, b = 22;
        res = a < b;
        System.out.println(res);
        res = !(a < b);
        System.out.println(res);
    }
}
