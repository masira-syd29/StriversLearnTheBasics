import java.util.Scanner;


public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("NUM1:");
//        double a = sc.nextInt();
//        System.out.println("NUM2:");
//        double b = sc.nextInt();
//        char operator = sc.next().charAt(0);
//        switch(operator){
//            case '+':
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                System.out.println(a/b);
//                break;
//            case '%':
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("Invalid Number");
//        }

//        char grade = sc.next().charAt(0);
//        switch(grade){
//            case 'A': System.out.println("Excellent");break;
//            case 'B': System.out.println("good") ;break;
//            case 'C': System.out.println("Average") ;break;
//            case 'D': System.out.println("Poor") ;break;
//            case 'F': System.out.println("Fail") ;break;
//            default:
//                System.out.println("Invalid grade");
//        }

//        int month = sc.nextInt();
//        switch (month){
//            case 1: System.out.println("Jan");break;
//            case 2: System.out.println("Feb");break;
//            case 3: System.out.println("Mar");break;
//            case 4: System.out.println("Apr");break;
//            case 5: System.out.println("May");break;
//            case 6: System.out.println("Jun");break;
//            case 7: System.out.println("Jul");break;
//            case 8: System.out.println("Aug");break;
//            case 9: System.out.println("Sept");break;
//            case 10: System.out.println("Oct");break;
//            case 11: System.out.println("Nov");break;
//            case 12: System.out.println("Dec");break;
//            default:
//                System.out.println("Invalid Month");
//
//
//        }


//        char vowelConsonantCheck = sc.next().charAt(0);
//        switch (vowelConsonantCheck){
//            case 'a', 'e', 'i', 'o', 'u':
//                System.out.println(" Vowel");
//                break;
//            default:
//                if (Character.isLetter(vowelConsonantCheck)){
//                    System.out.println(vowelConsonantCheck+ " Consonant");
//                } else {
//                    System.out.println("invalid Character");
//                }
//
//        }
//        int monthNumber = sc.nextInt();
//        int year = sc.nextInt();
//        switch (monthNumber){
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.println("31 Days");
//                break;
//            case 4, 6, 9, 11:
//                System.out.println("30 Days");
//                break;
//            case 2:
//                if((year%400==0) || (year%4==0 && year%100!=0)){
//                System.out.println("29 Days");
//                }
//                else {
//                System.out.println("28 Days");
//                }
//                break;
//            default:
//                System.out.println("Invalid Input");
//        }

//        double balance = 1000.0;
//        while (true){
//            System.out.println("Welcome to Basic Banking System");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("Amount to deposit:");
//                    double deposit = sc.nextDouble();
//                    if(deposit>0){
//                        balance += deposit;
//                    } else {
//                        System.out.println("invalid Amount");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Amount to withdraw:");
//                    double withdraw = sc.nextDouble();
//                    if(withdraw>0 && withdraw<=balance){
//                        balance -= withdraw;
//                    } else {
//                        System.out.println("invalid amount");
//                    }
//                    break;
//                case 3:
//                    System.out.println("Balance is: $"+balance);
//                    break;
//                case 4:
//                    System.out.println("ThankYou for using teh banking system!");
//                    return;
//                default:
//                    System.out.println("invalid choice");
//            }
//        }

//        int choice = sc.nextInt();
//        switch (choice){
//            case 1:
//                System.out.println("Enter the radius of circle: ");
//                double radius = sc.nextDouble();
//                System.out.println("Area of circle is :" +Math.PI*radius*radius);
//                break;
//            case 2:
//                System.out.println("Enter the side of square: ");
//                double side = sc.nextDouble();
//                System.out.println("Area of square is :" +side*side);
//                break;
//            case 3:
//                System.out.println("Enter the breadth of triangle: ");
//                double breadth = sc.nextDouble();
//                System.out.println("Enter the length of triangle: ");
//                double length = sc.nextDouble();
//                System.out.println("Area of the Triangle is :" +0.5*length*breadth);
//                break;
//            case 4:
//                System.out.println("Enter the breadth of Rectangle: ");
//                double b = sc.nextDouble();
//                System.out.println("Enter the length of Rectangle: ");
//                double l = sc.nextDouble();
//                System.out.println("Area of the Triangle is :" +l*b);
//                break;
//            default:
//                System.out.println("invalid choice");
//        }

        /* Electricity Bill Generator
        Problem: Input the type of customer (Residential, Commercial, Industrial) and the number of units consumed.
        Calculate the electricity bill based on unit rates for each type.
        Concept: Switch cases for customer type.*/
//        System.out.println("Select Customer Type:");
//        System.out.println("1. Residential");
//        System.out.println("2. Commercial");
//        System.out.println("3. Industrial");
//        System.out.print("Enter your choice: ");
//        int customerType = sc.nextInt();
//        System.out.println("Units Consumed: ");
//        int units = sc.nextInt();
//        double bill = 0;
//        switch (customerType){
//            case 1:
//                bill = calculateBill(units, 3.0, 5.0, 7.0);
//                System.out.println("Customer type: Residential");
//                break;
//            case 2:
//                bill = calculateBill(units, 4.0, 6.0, 8.0);
//                System.out.println("Customer type: Commercial");
//                break;
//            case 3:
//                bill = calculateBill(units, 5.0, 7.0, 9.0);
//                System.out.println("Customer type: Industrial");
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//        System.out.println("Total units consumed: " + units);
//        System.out.println("Total bill: $" + bill);
//    }

//    public static double calculateBill(int units, double rate1, double rate2, double rate3){
//        double bill;
//        if(units<=100){
//            bill = units*rate1;
//        } else if (units<=300) {
//            bill = 100*rate1+(units-100)*rate2;
//        } else {
//            bill = 100*rate1+200*rate2+(units-100)*rate3;
//        }
//        return bill;
//    }

        /* Simple Voting System
        Problem: Write a program for a voting system where users can vote for 3 candidates.
        Display the vote count and the winner.
        Concept: Use switch for vote selection and handle tallying.*/
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;
        int voters;

        System.out.println("Enter the number of voters: ");
        voters = sc.nextInt();

        for(int i=1; i<=voters; i++){
            System.out.println("Voter " + i + ", choose your candidate:");
            System.out.println("Choose your candidate:");
            System.out.println("1.Maseera");
            System.out.println("2.Harry");
            System.out.println("3.Trump");

            int candidate = sc.nextInt();
            switch (candidate){
                case 1:
                    candidate1++;
                    break;
                case 2:
                    candidate2++;
                    break;
                case 3:
                    candidate2++;
                    break;
                default:
                    System.out.println("Invalid candidate");
            }
        }
        System.out.println("Voting results:");
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
        System.out.println("Candidate 3: " + candidate3 + " votes");

        if(candidate1>candidate2 && candidate1>candidate3){
            System.out.println("Candidate 1 is winner");
        } else if (candidate2>candidate1 && candidate2>candidate3) {
            System.out.println("Candidate 2 is the Winner");
        } else if(candidate3>candidate1 && candidate3>candidate2){
            System.out.println("Candidate 3 is the Winner");
        } else {
            System.out.println("It's a Tie!");
        }

    }
}
