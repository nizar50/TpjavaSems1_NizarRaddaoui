public class exe1 {
    public static void main(String[] args) {
        int a = 6, b = 21;
        boolean res;
        res = a > b;
        System.out.println("a>b" + res);// a>bfalse
        res = !(a > b);
        System.out.println("!(a>b)?" + res);// !(a>b)?true
        res = a < b;
        System.out.println("a<b?" + res);// a<b?true
        res = a == b;
        System.out.println("a==b?" + res);// a==b?false
        res = a != b;
        System.out.println("a=!b?" + res);// a=!b?true
        res = (a < b) & (a == b);
        System.out.println("(a<b)&(a==b)?" + res);// (a<b)&(a==b)?false
        res = (a < b) | (a == b);
        System.out.println("(a<b)|(a==b)?" + res);// (a<b)|(a==b)?true
        res = (a < b) ^ (a == b);
        System.out.println("(a<b)^(a==b)?" + res);// (a<b)^(a==b)?true
        res = a < b ? true : false;
        System.out.println("a<b?true:false" + res);// a<b?true:falsetrue
    }
}
