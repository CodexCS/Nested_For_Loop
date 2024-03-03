
/**
 * Write a description of class Out15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Out15
{
    public static void main()
    {
        for(int i = 1; i<10;i = i+2){
            for(int j = 9; j >= i;j--){
                if(j%2!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
