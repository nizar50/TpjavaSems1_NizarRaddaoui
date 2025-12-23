import java.util.Scanner;

public class lettre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un lettre");
        char x;
        x = sc.next().charAt(0);
        if (Character.isLetter(x)) {
            if (Character.isUpperCase(x)) {
                System.out.println("la lettre est majuscule");
            } else {
                System.out.println("la lettre est minuiscule");
            }

        }

        else {
            System.out.println("n'est pas un lettre");
        }
    }
}
