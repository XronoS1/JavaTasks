import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println(longestZero("000"));
    }
    public static String longestZero(String str){
        int count = 0;
        String line = "";
        String result ="";
        for(int i = 0; i < str.length(); i++ ){
            char s = str.charAt(i);
            if(str.charAt(i) == '0'){
                line+= "0";
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

}
