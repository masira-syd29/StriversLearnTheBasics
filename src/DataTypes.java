import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigDecimal.valueOf;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        String datatype = sc.nextLine();
//
//        switch(datatype){
//            case "integer", "float":
//                System.out.println("4 Bytes");
//                break;
//            case "short", "byte":
//                System.out.println("2 Bytes");
//                break;
//            case "boolean":
//                System.out.println("1 Byte");
//                break;
//            case "long", "double":
//                System.out.println("8 Bytes");
//                break;
//            default:
//                System.out.println("Invalid Data Type");
//        }
//        long num = sc.nextLong();
//        if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){
//            System.out.println("In range");
//        } else {
//            System.out.println("Out of Range");
//        }

//        double num = sc.nextDouble();
//        int implicitCast = (int) num;
//        System.out.println("Implicit Casting: "+implicitCast);
//
//        double explicitCast = (double) implicitCast;
//        System.out.println("Explicit Casting: "+explicitCast);
//        //System.out.println("Explicit Casting: "+ (double) implicitCast);

//        int integer = sc.nextInt();
//        double doubleNumber = sc.nextDouble();
//
//        System.out.println("Addition: "+ (integer + doubleNumber));
//        System.out.println("Subtraction: "+(integer - doubleNumber));
//        System.out.println("Multiplication: "+(integer * doubleNumber));
//        System.out.println("Division: "+ (integer / doubleNumber));
        System.out.println("Enter your Input: ");
        String input = sc.nextLine();
        if(input.isEmpty()){
            System.out.println("Enter a valid Number!");
            return;
        }
        if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
            System.out.println("Boolean");
            return;
        }
        if (input.length() == 1) {
            System.out.println("Char");
            return;
        }

        try{
            BigDecimal bigDecimal = new BigDecimal(input);
            if(bigDecimal.scale() > 0){
                if (bigDecimal.compareTo(valueOf(Float.MAX_VALUE)) <= 0 && bigDecimal.compareTo(valueOf(-Float.MIN_VALUE)) >=0){
                    System.out.println("Float");
                }
                else {
                    System.out.println("Double");
                }
            } else {
                BigInteger bigInt = bigDecimal.toBigIntegerExact();
                if(bigInt.bitLength() <= 8){
                    System.out.println("Byte");
                } else if (bigInt.bitLength() <= 16) {
                    System.out.println("Short");
                } else if (bigInt.bitLength() <= 32) {
                    System.out.println("Integer");
                } else if (bigInt.bitLength() <= 64) {
                    System.out.println("Long");
                } else {
                    System.out.println("Big Integer");
                }
            }
        } catch (NumberFormatException e1){
            System.out.println("String");
        }



    }
}
