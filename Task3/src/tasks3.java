

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class tasks3 {
    public static void main(String[] args) {
        System.out.println("1.Equation solution");
        System.out.println(solutions(1, 0, -1)); //2
        System.out.println(solutions(1, 0, 0)); //1
        System.out.println(solutions(1, 0, 1)); //0

        System.out.println("2.find Zip word:");
        System.out.println(findZip("all zip files are zipped and zipped")); //18
        System.out.println(findZip("all zip files are compared")); //-1

        System.out.println("3. Check Perfect:");
        System.out.println(checkPerfect(6)); //true
        System.out.println(checkPerfect(28)); // true
        System.out.println(checkPerfect(97)); //false

        System.out.println("4. flip end chars");
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));

        System.out.println("5.Is Valid Hex code:");
        System.out.println(isValidHexCode("#CD5C5C")); //true
        System.out.println(isValidHexCode("#CD5C58C")); // false more then 6 symbols
        System.out.println(isValidHexCode("CD5C5C")); // false

        System.out.println("6. Same arrays:");
        System.out.println(same(new Integer[]{1, 3, 4, 4, 4}, new Integer[]{2, 5, 7})); //true
        System.out.println(same(new Integer[]{2}, new Integer[]{3, 3, 3, 3})); //true
        System.out.println(same(new Integer[]{9, 8, 7, 6}, new Integer[]{4, 4, 3, 1})); //false

        System.out.println("7.is Kaprekar");
        System.out.println(isKaprekar(3)); // false
        System.out.println(isKaprekar(5)); // false
        System.out.println(isKaprekar(297)); // true

        System.out.println("8. Longest Zero");
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));

        System.out.println("9.Next Prime");
        System.out.println(nextPrime(12)); //13
        System.out.println(nextPrime(24)); //29
        System.out.println(nextPrime(11)); //11

        System.out.println("10.Right triangle");
        System.out.println(rightTriangle(3,4, 5)); //true
        System.out.println(rightTriangle(145,105, 100)); //true
        System.out.println(rightTriangle(70,130, 110)); //false

    }

    public static int solutions(int a, int b, int c) {
        int discr = (b * b) - 4 * a * c;
        if (discr == 0) {
            return 1;
        } else if (discr < 0) {
            return 0;
        } else {
            return 2;
        }
    }

    public static int findZip(String str) {
        String word = "zip";
        boolean found = str.contains(word);
        int start = str.indexOf("zip") + 3; // aded for first word zip
        if (found) {
            return str.indexOf("zip", start);
        }
        else {
            return -1;
        }
    }


    public static boolean checkPerfect(int a){
        int sum = 0;
        for(int i = 1; i<= a/2; i++){
            if(a%i==0){
                sum += i;
            }
        }
        return sum==a;
    }
    public static String flipEndChars(String str){
        char[] arraychar = str.toCharArray();
            if(arraychar.length <= 2){
                return "Incompatible";
            }
            if (arraychar[0] == arraychar[arraychar.length - 1]) {
                    return "Two is pair";
            }
            else {
                char start = arraychar[arraychar.length-1]; //last
                char end = arraychar[0]; //first
                arraychar[0] = start;
                arraychar[arraychar.length - 1] = end;
                }
            StringBuilder builded = new StringBuilder();
            for(int i = 0; i < arraychar.length; i++){
                builded.append(arraychar[i]);
            }
            String result = builded.toString();
            return result;
        }
        public static boolean isValidHexCode(String str) {
            char[] chararray = str.toCharArray();
            boolean result = false;
            if (chararray.length == 7 && chararray[0] == '#') {
                    String num = ".*[0-9].*";
                    String words = ".*[A-F].*";
                    result = str.matches(num) && str.matches(words);
                        }
            return result;
        }
        public static boolean same(Integer[] a, Integer[] b){
            Set<Integer> uniqA = new TreeSet<Integer>();
            uniqA.addAll(Arrays.asList(a));
            Set<Integer> uniqB = new TreeSet<Integer>();
            uniqB.addAll(Arrays.asList(b));
            return uniqA.size() == uniqB.size();
        }
        public static boolean isKaprekar(int a){
        int sum = 0;
        if(a < 9) {
            if (a == 1 | a == 0) {
                return true;
            } else {
                return false;
            }
        }
        else{
            int doubleA = a*a;
            int lengthDouble = String.valueOf(doubleA).length();
            String stringOfDouble = String.valueOf(doubleA);
            String firstHalf = stringOfDouble.substring(0,lengthDouble/2);
            String secondHalf = stringOfDouble.substring(lengthDouble/2);
            int integer1 = Integer.parseInt(firstHalf);
            int integer2 = Integer.parseInt(secondHalf);
            sum = integer1 + integer2;
        }
        return sum == a;
        }
    public static String longestZero(String str){
        int count = 0;
        String line = "";
        String result ="";
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == '0'){
                line += "0";
            }
            else{
                if(result.length() < line.length()){
                    result = line;
                }
                line = "";
            }
        }
        return result;
    }
        public static int nextPrime(int a){
        int result=0;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    a += 1;
                    j = 2; //обнуление j
                } else if (!(a % j == 0)) {
                    result = a;
                }
            }

            return result;
        }
        public static boolean rightTriangle(int a, int b, int c){
        if(a > b && a > c){
            return a*a == (b*b) + (c*c);
        }
        else if(b > a && b > c){
            return b*b == (a*a) + (c*c);
        }
        else{
            return c*c == (a*a) + (b*b);
        }
        }
    }

