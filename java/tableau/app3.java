import java.util.Scanner ;
public class app3 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = lectureN();
        int [] t = new int[n];
        remplirTab(t,n);

        int [] t_paire = new int [n];
        creeTpaire(t,t_paire,n);

        int [] t_impaire = new int [n];
        creeTimpaire(t,t_impaire,n);

        afficherTab(t,t_paire,t_impaire,n);
    }

    public static int lectureN(){
        int n ;
        do{
            n = s.nextInt();
        }while (n<0);
        return n ;
    }

    public static void remplirTab(int [] t,int n){
        for (int i = 0 ; i<n ; i++ ){
            do {
                t[i] = s.nextInt();
            }while (t[i] < 0 ) ;
        }
    }

    public static void  creeTpaire(int [] t,int [] t_paire,int n){
        for (int i = 0 ; i<n ; i++ ){
            if (t[i] % 2 == 0){
                t_paire[i] = t[i] ;
            }
        }
    }
    public static void creeTimpaire(int [] t,int [] t_impaire,int n){
        for(int i = 0 ; i<n ; i++){
            if (t[i] % 2 != 0){
                t_impaire[i] = t[i] ;
            } 
        }
    }
    public static void afficherTab(int [] t,int [] t_paire,int [] t_impaire,int n){
        for (int i = 0 ; i<n ; i++){
            System.out.print(t[i] + "|");
        }
        System.out.println();
        for (int i = 0 ; i<n ; i++){
            if (t_paire[i] != 0)
                System.out.print(t_paire[i] + "|");
        }
        System.out.println();
        for (int i = 0 ; i<n ; i++){
            if (t_impaire[i] != 0)
                System.out.print(t_impaire[i] + "|");
        }
    }
}
