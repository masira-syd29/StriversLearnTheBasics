import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.log10;
import static java.lang.Math.sqrt;

public class KnowBasicMathsForDSA {
    public static int countDigit(int n) {
//        TC -> O(log10(N)) SC ->
//        int counter = 0;
//        while (n > 0) {
//            //int lastDigit = n % 10;
//            counter = counter + 1;
//            n = n / 10;
//
//        }
        int counter = (int) (log10(n) + 1);
        return counter;
    }
    public static int reverseNumber(int x) {
        // Write your code here
        int reverseNumber = 0;
        while(x != 0){
            int lastDigit = x % 10;
            x = x / 10;
            if(reverseNumber > Integer.MAX_VALUE/10 || (reverseNumber == Integer.MAX_VALUE/10 && lastDigit > 7)){
                return 0;
            }
            if(reverseNumber < Integer.MIN_VALUE/10 || (reverseNumber == Integer.MIN_VALUE/10 && lastDigit < -8)){
                return 0;
            }

            reverseNumber = (reverseNumber * 10)+ lastDigit;

        }
        return reverseNumber;
    }
    public static boolean palindrome(int x){
        if(x<0 || (x%10 ==0 && x!=0)) {
            return false;
        }
        int reversed = 0;
        while(x > reversed){
            reversed = (reversed * 10) + x%10;
            x = x/10;
        }
        return x==reversed || x==reversed/10;
    }
    public static boolean isArmstrong(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while(n>0){
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n/10;
        }
        return sum == num ? true : false;
    }
    public static List< Integer > printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        // Write your code here
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                divisors.add(i);
                if((n/i) != i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
    public static boolean isprime(int n){
        if(n <= 1)
            return false;
        int sqrt = (int) Math.sqrt(n);
        for(int i=2; i<=sqrt; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b)
                a = a%b;
            else
                b = b%a;

        }
        if(a==0)
            return b;
        else
            return a;

    }

    public static void main(String[] args) {
//        int result = countDigit(123888884);
//        System.out.println(result);
//
//        long result2 = reverseNumber(-123400);
//        System.out.println(result2);

        int number = 29;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
