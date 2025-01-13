import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(num + "x" + i + "=" + (num*i));
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println("A is the greater number");
//        } else {
//            System.out.println("B is the greater number");
//        }
//        System.out.println("Enter Celsius: ");
//        double celsius = sc.nextInt();
//        double fahrenheit = (9/5 * celsius) + 32;
//        System.out.println("Fahrenheit is :" + fahrenheit+"F");
//        double p = sc.nextDouble();
//        double r = sc.nextDouble();
//        double t = sc.nextDouble();
//        double si = (p*r*t)/100;
//        System.out.println("The simple Interest is: "+si);
//        System.out.println("Enter your year: ");
//        int year = sc.nextInt();
//        if((year%4 == 0 && year != 100) || (year % 400 == 0)){
//            System.out.println("Its a Leap Year");
//        } else {
//            System.out.println("Its not a Leap year");
//        }
//        String one = sc.nextLine();
//        String two = sc.nextLine();
//        String concat = one.concat(" ").concat(two);
//        System.out.println(concat);
//        String str = sc.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(reversed);
        String word = sc.nextLine().toLowerCase();
        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u');

        int vowels = 0, constants = 0;
        for(char ch : word.toCharArray()){
            if(vowelsSet.contains(ch)){
                vowels++;
            } else if (ch>='a' && ch <= 'z'){
                constants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+constants);


    }
}