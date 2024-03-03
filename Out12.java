
/**
 * Write a description of class Out12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*1 2 3 4 5 5 4 3 2 1 
 *1 2 3 4     4 3 2 1
 *1 2 3         3 2 1
 *1 2             2 1
 *1                 1
 * 
 * 
 * 
 * 
 * 
 */
public class Out12
{
    public static void main()
    
    {
        
       int i,j,k,p,d;k=1;p = 5; d=1;
       for(i=1; i<=5; i++){
           for(j=1; j<=p; j++){
               System.out.print(j)
               ;
           }
           for(k=1;k<=d;k++){
               System.out.print(" ");
           }
           for(k=p; k>=1; k--){
               System.out.print(k);
           }
           System.out.println();
           d= d + 2;
           p = p-1;
       }
    }
}
