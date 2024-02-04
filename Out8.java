import java.util.*;
/**
 * Write a description of class Out8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  
public class Out8
{
    public static void main(){
        int l = 2;
        int p = 0 ;
        for(int i = 1; i<=5;i++){
            for(int j = 1; j<=i;j++ ){
                System.out.print(i+" ");
                
            }
            for(p=l;p<=5;p++){
                    System.out.print(p+" ");
                }
                l = l + 1;
            System.out.println();
        }
    }
}
