import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("donner un entier x");// 15
        x = sc.nextInt();
        System.out.println("donner un entier y");// 21
        y = sc.nextInt();
        System.out.println("x=" + x + "y=" + y);// x=15y=21
        x = y++;
        System.out.println("x=" + x + "y=" + y);// x=21y=22
        x = ++y;
        System.out.println("x=" + x + "y=" + y);// x=23y=23
        y = x--;
        System.out.println("x=" + x + "y=" + y);// x=22y=23
        y = --x;
        System.out.println("x=" + x + "y=" + y);// x=21y=21

    }
}
