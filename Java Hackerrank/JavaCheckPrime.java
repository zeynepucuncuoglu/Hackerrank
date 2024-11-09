import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class Prime{
    public void checkPrime(int... numbers){
        boolean hasPrime = false;

        for(int num: numbers){
            if(isPrime(num)){
                System.out.print(num + " ");
                hasPrime = true;
            }
        }

        System.out.println();
    }

    private boolean isPrime(int num){
        if(num <= 1) return false ;
        if(int i = 2 ; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}






public class JavaCheckPrime {
    public static void main(String[] args) {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        Prime prime = new Prime();

        int[] numbers = new int[5];
        for(int i=0; i<5 ; i++){
            numbers[i] = Integer.parseInt(br.readLine().trim());
        }

        prime.checkPrime(numbers[0]);
        prime.checkPrime(numbers[0], numbers[1]);
        prime.checkPrime(numbers[0], numbers[1], numbers[2]);
        prime.checkPrime(numbers[0], numbers[1], numbers[2]);
        prime.checkPrime(numbers[0], numbers[1], numbers[2], numbers[3]);
        prime.checkPrime(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
    
    }
    
}
