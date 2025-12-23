import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> etudiant = new HashMap<>();
        Scanner s = new Scanner(System.in);

        // partie 1 : --------------------------------------
        System.out.println("donner nom de l'etudiant");
        String nom = s.nextLine();

        System.out.println("donner le nombre de note de l'etudiant");
        int nombre_note = s.nextInt();

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < nombre_note; i++) {
            int note;
            do {
                System.out.println("donner note " + (i + 1));
                note = s.nextInt();
            } while (note > 20 || note < 0);

            l.add(note);
        }

        etudiant.put(nom, l);

        // partie 2: ----------------------------------------
        System.out.println("donner un nom");
        s.nextLine(); 

        String n1 = s.nextLine();

        if (etudiant.containsKey(n1)) {
            int note;
            do {
                System.out.println("donner nouvelle note");
                note = s.nextInt();
            } while (note > 20 || note < 0);

            etudiant.get(n1).add(note);
        } else {
            System.out.println("Etudiant introuvable");
        }

       
        System.out.println("donner une nom");
        s.nextLine(); 
        String n2 = s.nextLine();

        int som = 0;

        if (etudiant.containsKey(n2)) {
            ArrayList<Integer> notes = etudiant.get(n2);

            for (int x : notes) {
                som += x;
            }

            int moy = som / notes.size();
            System.out.println("la moyenne est " + moy);
        } else {
            System.out.println("Etudiant introuvable");
        }

        s.close();
    }
}
