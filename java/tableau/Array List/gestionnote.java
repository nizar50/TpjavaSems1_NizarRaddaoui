import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
public class gestionnote {
    static Scanner s = new Scanner (System.in);
    public static void main (String[] args){
        ArrayList<Integer> note = new ArrayList<>();
    int n ; 
    do {
        System.out.println("donner  taille");
        n = s.nextInt();
    }while (n<=0);
    remplir(note , n) ;
    afficher(note) ;
    afficher_max_moy(note);
    verif(note);
    afficher(note) ;
    trie(note);
    supp(note , n);
    chercher(note);
    modif(note);
    }
    public static void remplir (ArrayList<Integer>l , int n){
        for (int i = 0 ; i < n ;i++){
            int x ;
            do {
                System.out.println("donner x l");
                x = s.nextInt();
            }while(x<0 || x>20);
            l.add(x);
        }
    }
    public static void afficher(ArrayList<Integer>l){
        Iterator<Integer> ll = l.iterator();
        for (int i = 0 ; i < l.size() ; i++){
            System.out.print(ll.next());
        } 
    }
    public static void afficher_max_moy(ArrayList<Integer>l){
        System.out.println(Collections.max(l));
        int somme = 0 ;
        for (int i = 0; i < l.size(); i++) {
            somme = somme + l.get(i);
        }
        System.out.println(somme / l.size());
    }
    public static void verif(ArrayList<Integer>l){
        int x=s.nextInt();
        boolean tt = true ;
        for (int i = 0; i < l.size(); i++) {
        if (x==l.get(i)) {
            l.remove(i);
        }else{
            tt=false;
        }

        }
        if (!tt){
            System.out.println("note non existe");
        }
    }
    public static void trie(ArrayList<Integer>l){
        Collections.sort(l);
    }
    public static void supp(ArrayList<Integer>l , int n){
        Iterator<Integer> ll = l.iterator();
        for (int i = 0; i < n; i++) {
            if (ll.next() > 18 ){
                ll.remove();
            }
        }
    }
    public static void chercher(ArrayList<Integer>l){
        int x = s.nextInt();
        if (l.indexOf(s) == -1){
            System.out.println("existe");
        }else{
            System.out.println("non existe");
        }
    }
    public static void modif(ArrayList<Integer>l){
        for (int i = 0; i < l.size(); i++) {
            if ()
        }

    }
}
