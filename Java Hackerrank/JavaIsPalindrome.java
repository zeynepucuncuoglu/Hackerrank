/*
 * link:https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 * sample inp: madam
*/

import java.io.*;
import java.util.*;

public class JavaIsPalindrome {
    
    public static boolean isPalindrome(String str){
        int cnt = str.length();
        for(int i=0; i<cnt/2; i++){
            if(str.charAt(i) != str.charAt(cnt-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        if(isPalindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}