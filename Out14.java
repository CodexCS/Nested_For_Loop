
/**
 * Write a description of class Out14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Out14
{
    public static void main(){
        int l = 0;
        int j = 0;
        for(int i = 1; i <=5;i++){
            for( j = i; j>1;j--){
                System.out.print(j);
            }
            for(l = 1 ; l <= i ; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
