
/**
 * Write a description of class test_school_code here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test_school_code
{
    public static void main(){
        int i,j,k,p=1;
        for( i = 5; i>=1; i--)
            {
            for( k = 1; k<=p; k++) 
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
                System.out.print(j);
            System.out.println();
            p = p+1;
        
            }
    }
}
