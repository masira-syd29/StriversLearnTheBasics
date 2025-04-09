import java.util.Scanner;

public class Patterns {
//    public static void pattern1(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n- (2*i + 1); j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i>n)
                stars = 2*n-i;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public  static void pattern10(int n){
        int start = 1;
        for(int i=0; i<n; i++){
            if(i%2==0)
                start =1;
            else
                start=0;
            for(int j=0; j<=i; j++){
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public  static void pattern11(int n){
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
    public static void pattern12(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num + 1;
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for(int i=0; i<=n; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0; i<=n; i++){
            for(char ch='A'; ch<='A'+ (n-i-1); ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int i=0; i<n; i++){
            for(char ch = (char) ('E' - i); ch <='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        pattern1(3);
        //pattern2(5);
//        pattern3(7);
//        pattern4(5);
//        pattern5(5);
//        pattern6(4);
//        pattern7(7);
//        pattern7(5);
//        pattern8(5);
//        pattern9(3);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
        pattern17(5);
    }
}
