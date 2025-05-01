import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Objects.hash;

public class LearnBasicHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            System.out.println("Elements of the array: ");
//            arr[i] = sc.nextInt();
//        }
//        int[] hash = new int[10000000];
//        for(int i=0; i<n; i++){
//            hash[arr[i]] += 1;
//        }
//        System.out.println("Query Count: ");
//        int q = sc.nextInt();
//        while(q-- > 0){
//            System.out.println("Query count for elements: ");
//            int number = sc.nextInt();
//            System.out.println(hash[number]);
//        }


//        System.out.println("Input string: ");
//        String s = sc.nextLine();
//        System.out.println("Query count for elements: ");
//        int q = sc.nextInt();
//
//        int[] hash = new int[256];
//        for(int i=0; i<s.length(); i++){
//            hash[s.charAt(i)]++;
//
//        }
//        while (q-- > 0){
//            char c = sc.next().charAt(0);
//            System.out.println(hash[c]);
//        }
        System.out.println("Size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){
            System.out.println("Elements of the array: ");
            arr[i] = sc.nextInt();
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }
//        Map<Integer, Integer> mpp = new HashMap<>();
//        for(int i=0; i<n; i++){
//            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
//        }

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }

        System.out.println("Query Count: ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Query count for elements: ");
            int num = sc.nextInt();
            System.out.println(mpp.getOrDefault(num, 0));
        }


    }
}
