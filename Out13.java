
/**
 * Write a description of class Out13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Out13
{
    public static void main(){
        int p = 1;
        int l = 5;
        int n = 65;
       for(int i = 1; i<=5; i++){
           for(int j = 1; j<=i;j++ )
            {
           System.out.print(i+" ");
            }
            for(int m = 1; m<=l; m++) {
                char d = (char)n;
                System.out.print(d+" ");
            }
            l = l -1;
            n = n + 1;
            System.out.println();
       }
    }
}
