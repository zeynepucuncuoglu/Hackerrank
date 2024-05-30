/*
 * link https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 * sample inp: 
   1
   3
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

    static int B;
    static int H;
    static boolean flag = true ;
    
    static {
        Scanner sc = new Scanner(System.in);
        
        B = sc.nextInt();
        H = sc.nextInt();
        
        if(B <= 0 || H <= 0){
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
