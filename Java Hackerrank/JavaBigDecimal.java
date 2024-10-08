import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
     public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        
        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                
                if(a == null && b == null) return 0;
                if(a == null) return 1;
                if(b == null) return -1;
                BigDecimal aDec = new BigDecimal(a);
                BigDecimal bDec = new BigDecimal(b);
                
                return bDec.compareTo(aDec);
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
