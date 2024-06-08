/*link:https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
sample inp: 8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
 */
import java.io.*;
import java.util.*;

class UsernameValidator{
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    
   
     
}

public class JavaValidUsernameREGEX {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        while(n--!=0){
            String username = scanner.nextLine();
            if(username.matches(UsernameValidator.regularExpression)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}