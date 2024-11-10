//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
import java.util.Scanner;

public class JavaSubarray {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = int[n];
        for(int a=0; a<n ; a++){
            arr[a] = scanner.nextInt();
        }
        int negativeSum = 0;
        for(int i=0; i<n ; i++){
            int sum = 0;
            for(int k=i; k<n; k++){
                sum += arr[k];
                if(sum < 0) negativeSum ++;
            }
        }
    }
}
