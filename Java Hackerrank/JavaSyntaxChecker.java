/*link:https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
  sample inp: 
 3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
 */


import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaSyntaxChecker {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int numOfLine = Integer.parseInt(scanner.nextLine());
            for(int i = 0; i<numOfLine ; i++){
                String str = scanner.nextLine();
                try {
            Pattern.compile(str);
            System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}