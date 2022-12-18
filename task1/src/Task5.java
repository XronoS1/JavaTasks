public class Task5 {
    public static void main(String[] args) {
        int[] calc = new int[3];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            calc[i] = numbers;
        }
        //int N = calc[0];
        //int a = calc[1];
        //int b = calc[2];
        if(calc[0] == (calc[1] + calc[2])){
            System.out.println("added");
        }
        else if(calc[0] == (calc[1] - calc[2])){
            System.out.println("subtracted");
        }
        else if(calc[0] == (calc[1] * calc[2])) {
            System.out.println("multiplicatoin");
        }
        else if(calc[0] == (calc[1] / calc[2])) {
            System.out.println("devided");
        }
        else{
            System.out.println("none or wrong numbers");
        }

    }
}
