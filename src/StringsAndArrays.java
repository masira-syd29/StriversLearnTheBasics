import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsAndArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String reversed = "";
//        for(int i=str.length()-1; i>=0; i--){
//            reversed += str.charAt(i);
//
//        }
//        System.out.println(reversed);

//        String string = sc.nextLine();
//
//        int left = 0;
//        int right = string.length()-1;
//        boolean isPalindrome = true;
//
//        while(left<right){
//            if(string.charAt(left) != string.charAt(right)){
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        System.out.println(isPalindrome);

//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i=1; i<n; i++){
//            if(arr[i]>max)
//                max = arr[i];
//        }
//        System.out.println(max);

//        String word = sc.nextLine().toLowerCase();
//
//        int vowelCount = 0;
//        for(char ch : word.toCharArray()){
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//                vowelCount++;
//        }
//        System.out.println(vowelCount);

//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int result = removeDuplicates(arr);
//        for(int i=0; i<result; i++){
//            System.out.println(arr[i] + " +");
//        }


//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int largest = arr[0];
//        int secondLargest = -1;
//        for(int num : arr){
//            if(num > largest){
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//
//            }
//        }
//        System.out.println(secondLargest);
//        for(int i=1; i<n; i++){
//            if(arr[i] > largest){
//                secondLargest = largest;
//                largest = arr[i];
//            } else if (arr[i] < largest && arr[i] > secondLargest) {
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println("Enter Your String: ");
//        String str = sc.nextLine();
//        char result = firstNonRepeatingChar(str);
//        System.out.println(result == '-' ? "No character Found" : "First Non repeating character" +result);


//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value of k: ");
//        int k = sc.nextInt();
//        rotate(arr, k);
//
//        System.out.println("Rotated Array: ");
//        for(int nums : arr){
//            System.out.println(nums + " ");
//        }

//        System.out.println("Enter the number of Elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int result = majorityElement(arr);
//        System.out.println(result == '-' ? "No majority element" : "Majority element" +result);

        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean result = isAnagram(s, t);
        System.out.println(result);



    }
//    public static int removeDuplicates(int[] arr){
//        if(arr.length == 0) return 0;
//        int uniqueIndex = 0;
//        for(int i=1; i< arr.length; i++){
//            if(arr[i] != arr[uniqueIndex]){
//                uniqueIndex++;
//                arr[uniqueIndex] = arr[i];
//            }
//        }
//        return uniqueIndex+1;
//    }

//    public static char firstNonRepeatingChar(String s){
//        Map<Character, Integer> frequency = new LinkedHashMap<>();
//        for(char c : s.toCharArray()){
//            frequency.put(c, frequency.getOrDefault(c, 0)+1);
//        }
//        for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
//            if(entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return '-';
//    }

//    public static void rotate(int[] arr, int k){
//        int n = arr.length;
//        k %= n;
//        reverse(arr, 0, n-1);
//        reverse(arr, 0, k-1);
//        reverse(arr, k, n-1);
//
//
//    }
//    public static void reverse(int[] arr, int start, int end){
//        while(start<end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }

//    public static int majorityElement(int[] arr){
//        int candidate = arr[0];
//        int count = 1;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] == candidate) {
//                count++;
//            }
//            else {
//                count--;
//                if(count==0){
//                    candidate = arr[i];
//                    count = 1;
//                }
//            }
//        }
//        count = 0;
//        for(int num : arr){
//            if(num == candidate){
//                count++;
//            }
//        }
//        return count> arr.length/2 ? candidate:-1;
//    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for (char c : t.toCharArray()){
            if(!freq.containsKey(c) || freq.get(c)==0){
                return false;
            }
            freq.put(c, freq.get(c)-1);
        }
        for(int count : freq.values()){
            if(count != 0){
                return false;
            }
        }
        return true;

    }



}
