
import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int m = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for(int k=0; k<m; k++){
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        
        int numOfQuery = scanner.nextInt();
        for(int l=0; l<numOfQuery; l++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if(x <= lines.size() && x > 0 && y <= lines.get(x-1).size() && y>0 ){
                System.out.println(lines.get(x-1).get(y-1));
            }else{
                System.out.println("ERROR!");
            }
        }
    
    }
}


