import java.util.Scanner;

import static java.util.Collections.swap;

public class LearnBasicRecursion {
    static int count = 0;
    static void print1(){
        if(count==4)
            return;
        System.out.println(count);
        count++;
        print1();
    }
    static void print2(int i, int n){
        if(i>n)
            return;
        System.out.println("Maseera");
        print2(i+1,n);
    }
    static void print3(int i, int n){
        if(i>n)
            return;
        System.out.println(i);
        print3(i+1,n);
    }
    static void print4(int i, int n){
        if(i<1)
            return;
        System.out.println(i);
        print4(i-1,n);
    }
    static void print5(int i, int n){
        if(i<1)
            return;
        print5(i-1,n);
        System.out.println(i);
    }
    static void print6(int i, int n){
        if(i>n)
            return;
        print6(i+1, n);
        System.out.println(i);
    }
    static int print7(int n){
        if(n==0)
            return 0;
        return n + print7(n-1);
    }
    static int print8(int n){
        if(n==0)
            return 1;
        return n * print8(n-1);
    }
    static void print9(int i, int[] arr, int n){
        if(i >= n/2)
            return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        print9(i+1, arr, n);
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        return helper(0, s);
    }
    private static boolean helper(int i, String s){
        if(i>=s.length()/2)
            return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        return helper(i+1, s);
    }
    public static int fib(int n) {
        if(n<=1)
            return n;
        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        print1();
//        int n = 4;
//        print2(1, n);
//        int n = 10;
//        print3(1, n);
//        int n = 4;
//        print4(n, n);
//        int n = 4;
//        print5(n, n);
//        int n = 4;
//        print6(1, n);
//        int n = 4;
//        System.out.println(print7(n));
//        int n = 4;
//        System.out.println(print8(n));
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        print9(0, arr, n);
//        for(int nums : arr){
//            System.out.print(nums + " ");
//        }
//        String s = "Madas";
//        System.out.println(isPalindrome(s));


        System.out.println(fib(4));

    }
}
