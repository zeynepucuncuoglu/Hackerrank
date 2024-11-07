
//https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
//some tests faieled check again

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  JavaTagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String regex = "<(.+?)>([^<>]+)</\\1>";
       
        Pattern pattern = Pattern.compile(regex);

		while(testCases>0){
			String line = in.nextLine();	
          	Matcher matcher = pattern.matcher(line);
       
			if(matcher.find()){
                System.out.println(matcher.group(2));
            }else{
                System.out.println("None");
            }
			testCases--;
		}
	}
}