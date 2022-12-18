
import java.util.*;
public class tasks {
    public static void main(String[] args) {
        System.out.println("1.Essay task");
        System.out.println(essay(10, 7, "hello my name is Bessie and this is my essay"));

        System.out.println("2.Brackets");
        System.out.println(split("()()()"));
        System.out.println(split("((()))"));
        System.out.println(split("((()))(())()()(()())"));

        System.out.println("3. Converter toCamelCase or toSnakeCase");
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("getColorFirst"));

        System.out.println("4.Salary");
        System.out.println(overTime(new double[]{9, 17, 30, 1.5}));
        System.out.println(overTime(new double[]{16, 18, 30, 1.8}));
        System.out.println(overTime(new double[]{13.25, 15, 30, 1.5}));

        System.out.println("5.BMI");
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));

        System.out.println("6.Bugger");
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));

        System.out.println("7.toStarShorthand");
        System.out.println(toStarShorthand("abbccc"));
        System.out.println(toStarShorthand("77777geff"));
        System.out.println(toStarShorthand("abc"));
        System.out.println(toStarShorthand(""));

        System.out.println("8.Rhyme");
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
        System.out.println(doesRhyme("and frequently do?", "you gotta move."));

        System.out.println("9. Trouble");
        System.out.println(trouble(451999277, 1177722899));
        System.out.println(trouble(1222345, 12345));
        System.out.println(trouble(666789, 12345667));
        System.out.println(trouble(33789, 12345337));

        System.out.println("10. countUniqueBooks");
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));
    }
    public static String essay(int n, int k, String str) {
        int count = str.split(" ").length;
        StringBuffer answer = new StringBuffer();
        if (count > n) {
            return "Too much words for essay";
        } else {
            String[] words = str.split(" ");
            int length = 0;
            for(int i = 0; i < words.length; i++) {
                String word = words[i];
                if (length + words[i].length() <= k) {
                    answer.append(words[i]);
                    answer.append(" ");
                    length += words[i].length();
                }
                else{
                    answer.append("\n");
                    answer.append(words[i]);
                    answer.append(" ");
                    length = words[i].length();
                }
            }
        }
        return answer.toString();
    }

    public static String split(String str) {
        char[] chars = str.toCharArray();

        ArrayList<String> answer = new ArrayList<>();
        String buffer = "";
        int opened = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == "(".charAt(0)) { opened += 1; }
            if (chars[i] == ")".charAt(0)) { opened -= 1; }

            buffer += chars[i];

            if (opened == 0) {
                answer.add(buffer);
                buffer = "";
            }
        }

        String[] finalAnswer = new String[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            finalAnswer[i] = answer.get(i);
        }

        return Arrays.toString(finalAnswer);
    }

    public static String toCamelCase(String str) {
        StringBuffer sb = new StringBuffer();
        String[] twoParts = str.split("_");
        String firstWord = twoParts[0];
        sb.append(firstWord);
        for (int i = 1; i < twoParts.length; i++) {
            String word2 = twoParts[i];
            char first = Character.toUpperCase(word2.charAt(0));
            word2 = first + word2.substring(1);
            sb.append(word2);
        }
        return sb.toString();
    }

    public static String toSnakeCase(String str) {
        StringBuffer sb = new StringBuffer();
        String[] words = str.split("(?=[A-Z])");
        String firstWord = words[0];
        sb.append(firstWord);
        for (int i = 1; i < words.length; i++) {
            String word2 = words[i];
            char first = Character.toLowerCase(word2.charAt(0));
            word2 = first + word2.substring(1);
            String word23 = "_" + word2;
            sb.append(word23);
        }
        return sb.toString();
    }

    public static String overTime(double[] salary) {
        double result = 0;
        double workTime = 17 - salary[0];
        if ((workTime % 1) > 0.01) {
            workTime = (salary[1] - salary[0]) - 0.4;
        }
        double overWorkTime = salary[1] - 17;
        double perHour = salary[2];
        double overPerHours = salary[3];
        result = workTime * perHour;
        if (overWorkTime > 0.1) {
            result = result + (overWorkTime * perHour * overPerHours);
        }
        return "$" + String.valueOf(result);
    }

    public static int bugger(int n) {
        int result = 1;
        int count = 0;
        if (n < 10) {
            return result = 0;
        } else {
            while (n > 10) {
                String numbers = String.valueOf(n);
                String[] digits = numbers.split("(?<=.)");
                for (int i = 0; i < digits.length; i++) {
                    int add = Integer.parseInt(digits[i]);
                    result *= add;
                }
                count += 1;
                n = result;
                result = 1;
            }
        }
        return count;
    }

    public static String BMI(String str1, String str2) {
        String[] weightData = str1.split(" ");
        String[] heightData = str2.split(" ");
        double weight = Double.parseDouble(weightData[0]);
        double height = Double.parseDouble(heightData[0]);
        if (weightData[1].equals("pounds")) {
            weight = weight * 0.45359;
        }
        if (heightData[1].equals("inches")) {
            height = height * 0.0254;
        }
        double index = weight / (height * height);
        String formattedIndex = String.format("%.1f", index);
        if (index < 18.5) {
            return formattedIndex + " Underweight";
        } else if (index >= 18.5 && index <= 24.9) {
            return formattedIndex + " Normal weight";
        } else {
            return formattedIndex + " Overweight";
        }
    }

    public static String toStarShorthand(String str) {
        StringBuffer result = new StringBuffer();
        char[] chars = str.toCharArray();
        if(str.length() == 0){
            return "none";
        }
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                if (chars[i] == chars[i - 1]) {
                    count += 1;
                }
                else {
                    if (count > 1) {
                        result.append(chars[i - 1] + "*" + count);
                    } else {
                        result.append(chars[i - 1]);
                    }
                    count = 1;
                }
            }
        }
        if (count > 1) {
            result.append(chars[chars.length - 1] + "*" + count);
        } else {
            result.append(chars[chars.length - 1]);
        }
        return result.toString();
    }

    public static boolean doesRhyme(String str1, String str2) {
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        String rhyme1 = words1[words1.length - 1];
        String rhyme2 = words2[words2.length - 1];
        String vowels = "aeiou";
        Set<String> list = new TreeSet<String>();
        Set<String> list2 = new TreeSet<String>();
        for(int f = 0; f < vowels.length(); f++){
        for (int i = 0; i < rhyme1.length(); i++) {
            char first = Character.toLowerCase(rhyme1.charAt(i));
            if(first == vowels.charAt(f)){
                list.add(String.valueOf(vowels.charAt(f)));
            }
            for (int j = 0; j < rhyme2.length(); j++) {
                char second = Character.toLowerCase(rhyme2.charAt(j));
                    if(second == vowels.charAt(f)){
                        list2.add(String.valueOf(vowels.charAt(f)));
                    }
                }
            }
        }
        return list.equals(list2);
    }
    public static boolean trouble(int n1, int n2){
        String number1 = Integer.toString(n1);
        String number2 = Integer.toString(n2);
        Set<String> nums1 = new TreeSet<String>();
        Set<String> nums2 = new TreeSet<String>();
        int count = 1;
        int count2 = 1;
        for(int i = 0; i < number1.length() - 1; i++){
                if (number1.charAt(i) == number1.charAt(i + 1)) {
                    count += 1;
                    if (count == 3) {
                        nums1.add(String.valueOf(number1.charAt(i)));
                        count = 0;
                    }
                }
            }
        for(int j = 0; j < number2.length() - 1; j++){
                if(number2.charAt(j) == number2.charAt(j + 1)){
                    count2 += 1;
                    if(count2 == 2){
                        nums2.add(String.valueOf(number2.charAt(j)));
                        count2 = 0;
                    }
                }
        }
        String value = "";
    Iterator<String> it = nums1.iterator();
        while(it. hasNext()){
            value = it.next();
        }
        return nums2.contains(value);
    }
    public static int countUniqueBooks(String str, char s){
        Set<Character> uniqueBooks =  new TreeSet<Character>();
        boolean found = false;
        char [] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if (chars[i] == s) {
               found = !found;
            }
            else{
                if(found){
                    uniqueBooks.add(chars[i]);
                }
            }
        }
        return uniqueBooks.size();
    }
}

