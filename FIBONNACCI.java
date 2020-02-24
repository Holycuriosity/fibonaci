
package fibonnacci;
import java.util.Scanner;
public class FIBONNACCI {

    public static void main(String[] args) {
     int n1=0, n2=1, n,n3;
     Scanner jack = new Scanner (System.in);
     System.out.println("input number of series");
     n = jack.nextInt();
     for(int i=1; i<=n; i++)
     {
         n3= n1+n2;
         if(n1==0)
            System.out.print(n1 +" " + n2 +" " + n3);
         else
             System.out.print(" " + n3);
         n1=n2;
         n2=n3;
     }
     
    }
    
}
