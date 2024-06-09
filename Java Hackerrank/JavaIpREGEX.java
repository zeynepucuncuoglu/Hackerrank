/*
 * link: https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
 * sample inp: 000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
*/

import java.io.*;
import java.util.*;

class IpValidator{
   public static final String regex = "^("
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]?[0-9])\\."  // Matches 0-255 followed by a dot, allowing leading zeros
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]?[0-9])\\."  // Matches 0-255 followed by a dot, allowing leading zeros
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]?[0-9])\\."  // Matches 0-255 followed by a dot, allowing leading zeros
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]?[0-9])"     // Matches 0-255, allowing leading zeros
                + ")$"; 
                
}

public class JavaIpREGEX {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextLine()){
            String ip = scanner.nextLine();
            if(ip.isEmpty()){
                break;
            }
            
            if(ip.matches(IpValidator.regex)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
        scanner.close();
    }
}