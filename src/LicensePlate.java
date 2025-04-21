import java.util.ArrayList;
import java.util.List;

//class Solution{
//    public String validator(String l){
//        if(l==null)
//            return "INVALID";
//        StringBuilder cleaned = new StringBuilder();
//        boolean hasDigit = false;
//
//        for(char ch : l.toCharArray()){
//            if(Character.isLetterOrDigit(ch)){
//                if(Character.isDigit(ch)){
//                    hasDigit = true;
//                }
//                cleaned.append(Character.toUpperCase(ch));
//            }
//        }
//
//        int len = cleaned.length();
//        if(len<2 || len>10 || !hasDigit){
//            return "INVALID";
//        }
//
//
//        List<String> groups = new ArrayList<>();
//        int n = cleaned.length();
//        int start = 0;
//
//        if (n % 3 == 0) {
//            while (start < n) {
//                groups.add(cleaned.substring(start, start + 3));
//                start += 3;
//            }
//        } else {
//            while (n - start > 4) { // leave last 2 or 3 characters untouched
//                groups.add(cleaned.substring(start, start + 3));
//                start += 3;
//            }
//            groups.add(cleaned.substring(start)); // add remaining 2 or 3 chars
//        }
//
//        return String.join("-", groups);
//
//
//    }
//}
class Solution {
    public String validator(String l) {
        if (l == null)
            return "INVALID";

        StringBuilder cleaned = new StringBuilder();
        boolean hasDigit = false;

        for (char ch : l.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
                cleaned.append(Character.toUpperCase(ch));
            }
        }

        int len = cleaned.length();
        if (len < 2 || len > 10 || !hasDigit) {
            return "INVALID";
        }

        List<String> groups = new ArrayList<>();
        int i = 0;

        while (len - i > 3) {
            groups.add(cleaned.substring(i, i + 3));
            i += 3;
        }

        if (i < len) {
            groups.add(cleaned.substring(i));
        }

        return String.join("-", groups);
    }
}


public class LicensePlate {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validator("ABC123XYZ"));
        System.out.println(s.validator("abc123xy"));   // ABC-123-XY
        System.out.println(s.validator("a1"));         // A1
        System.out.println(s.validator("abc"));        // INVALID
        System.out.println(s.validator("@ab123!"));
    }
}
//       StringBuilder result = new StringBuilder();
//        int i=0;
//
//        if(len%3==0){
//            while(i<len){
//                if(result.length() > 0)
//                    result.append("-");
//                result.append(cleaned.substring(i, i+3));
//                i +=3;
//            }
//        } else {
//            int groupOf3 = (len-2)/3;
//            for( int j=0; j<groupOf3; j++){
//                if(result.length() > 0 )
//                    result.append("-");
//                result.append(cleaned.substring(i, i+3));
//                i +=3;
//            }
//            if(i<len){
//                if(result.length() > 0)
//                    result.append("-");
//                result.append(cleaned.substring(i));
//            }
//        }
//        return result.toString();
