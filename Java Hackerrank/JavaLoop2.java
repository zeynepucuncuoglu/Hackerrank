
/*
question:
 https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
sample inp: 
2
0 2 10
5 3 5
*/

import java.util.*;
import java.io.*;

class JavaLoop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = a;
            for(int k = 0; k < n  ; k++){
                sum += b * Math.pow(2,k);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
        
        
        
    }
}