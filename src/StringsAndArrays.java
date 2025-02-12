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

        String word = sc.nextLine().toLowerCase();
        int vowelCount = 0;
        for(char ch : word.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
        }
        System.out.println(vowelCount);

    }
}
