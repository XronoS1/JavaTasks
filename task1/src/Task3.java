

public class Task3 {
    public static void main(String[] args) {
        int[] legs = new int[3];

        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            legs[i] = numbers;

        }
        int chickens = legs[0];
        int cows = legs[1];
        int pigs = legs[2];
        int result = ((chickens * 2) + (cows * 4) + (pigs * 4)) ;
        System.out.println("There are " + result + " legs");
    }
}
