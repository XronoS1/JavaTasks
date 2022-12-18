import java.math.BigDecimal;
import java.util.Arrays;

public class Tasks2 {
    public static void main(String[] args) {
        System.out.println("1.Repeat n times each char:");
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));

        System.out.println("2.Difference Max Min:");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21})); //82
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19})); //67

        System.out.println("3.Average of array:");
        System.out.println(isAvgWhole(new int[]{1, 3})); //true
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4})); //false
        System.out.println(isAvgWhole(new int[]{1, 5, 6})); //true

        System.out.println("4.Amount of array:");
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));

        System.out.println("5.Decimal:");
        System.out.println(getDecimalPlaces("43.2")); //1

        System.out.println("6.Fibonacci:");
        System.out.println(Fibonacci(3)); //3
        System.out.println(Fibonacci(7)); //13
        System.out.println(Fibonacci(12)); //144

        System.out.println("7.is Valid:");
        System.out.println(isValid("59001")); //true
        System.out.println(isValid("853a7")); //false
        System.out.println(isValid("732 32")); //false

        System.out.println("8.is Strange Pair:");
        System.out.println(isStrangePair("ratio", "orator")); //true
        System.out.println(isStrangePair("bush", "hubris")); //false

        System.out.println("9.is Prefix of word:");
        System.out.println(isPrefix("automation", "auto-")); //true
        System.out.println(isPrefix("retrospect", "sub-")); //false

        System.out.println("9. is Sufix of word:");
        System.out.println(isSuffix("arachnophobia", "-phobia")); //true
        System.out.println(isSuffix("vocation", "-logy")); //false

        System.out.println("10.boxSeq:");
        System.out.println(boxSeq(0)); //0
        System.out.println(boxSeq(1)); //3
        System.out.println(boxSeq(6)); //6
    }

    public static String repeat(String str, int number) {
        char[] chars = str.toCharArray();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < number; j++) {
                answer += chars[i];
            }
        }
        return answer;
    }

    public static int differenceMaxMin(int[] a) {
        Arrays.sort(a);
        int result = a[a.length - 1] - a[0];
        return result;
    }

    public static boolean isAvgWhole(int[] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
        }
         double average = sum / a.length;

        return average % 1 == 0;
    }

    public static int[] cumulativeSum(int[] arr) {
        int sum = 0;
        int[] sumary = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumary[i] = arr[i] + sum;
            sum += arr[i];
        }
        return sumary;
    }

    public static int getDecimalPlaces(String a) {
        BigDecimal answer = new BigDecimal(a);
        int f1 = answer.scale();
        return f1;
    }

    public static int Fibonacci(int a) {
        if (a == 0 || a == 1) {
            return a;
        }
        int n0 = 0, n1 = 1;
        for (int i = 2; i <= a; i++) {
            int res = n0 + n1;
            n0 = n1;
            n1 = res;
        }
        return n1;
    }

    public static boolean isValid(String a) {
        if (a.length() > 5) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                return false;
            }
        }
        String numbers = "1234567890";
        for (int i = 0; i < a.length(); i++) {
            boolean valid = false;
            for (int j = 0; j < numbers.length(); j++) {
                if (a.charAt(i) == numbers.charAt(j)) {
                    valid = true;
                }
            }
            if (!valid) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStrangePair(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        return (arr1[0] == arr2[arr2.length - 1]) & (arr2[0] == arr1[arr1.length - 1]);
    }
    public static boolean isPrefix(String str, String prefix){
        String pref = prefix.substring(0,prefix.length()-1);
        int help = str.length()-pref.length();
        String wordpref = str.substring(0,str.length()-help);
        return pref.equals(wordpref);
    }
    public static boolean isSuffix(String str, String suffix){
        String suff = suffix.substring(1);
        String wordsuff = str.substring(str.length()-suff.length());
        return suff.equals(wordsuff);
    }
    public static int boxSeq(int a) {
        int step = 0;
        if (a % 2 == 0) {
            return (3 - 1) * (a / 2);
        } else if (a % 2 == 1) {
            return (3 - 1) * (a / 2) + 3;
        } else if (a == 1) {
            return step + 3;
        } else {
            return step;
        }
    }
}



