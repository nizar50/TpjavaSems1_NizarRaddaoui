import java.util.Scanner ;
public class ex1{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n ;
        do{
            n = s.nextInt();
        }while (n<0);
        int [] t = new int[n];
        int [] t1 = new int [100];
        int [] t2 = new int [100]; 
        for (int i = 0 ; i<n ; i++ ){
            do {
                t[i] = s.nextInt();
            }while (t[i] < 0 ) ;
            if (t[i]%2 == 0){
                t1[i] = t[i] ;
            }else{
                t2[i] = t[i] ;
            }
        }
        s.close();
    }
}