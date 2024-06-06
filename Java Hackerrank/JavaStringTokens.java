/*
 * link:https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 * sample inp:He is a very very good boy, isn't he?
*/

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        String[] line = str.split("[^A-Za-z]+");
        int lineCnt = 0;
        for(String x : line){
            if(!x.isEmpty()){
                lineCnt++;
            }  
        }
        System.out.println(lineCnt);
        
        for(String x: line){
            if(!x.isEmpty()){
                System.out.println(x);
            }
        }
        scanner.close();
    }
}