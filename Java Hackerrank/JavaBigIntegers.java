import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigIntegers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        BigInteger num1= sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        System.out.println(sum);
        System.out.print(product);
        
}
}