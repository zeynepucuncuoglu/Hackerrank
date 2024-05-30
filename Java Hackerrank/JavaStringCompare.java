/*
 * link = https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 * sample inp = welcometojava
3
*/

import java.util.Scanner;

public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String temp;
        for(int i = 1 ; i <= s.length() - k; i++){
            temp = s.substring(i, i+k);
    
            if (temp.compareTo(largest) > 0){
                largest = temp;
            }
            if(temp.compareTo(smallest) < 0){
                smallest = temp;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}