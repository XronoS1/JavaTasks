

public class Task4 {
    public static void main(String[] args) {
        double[] win = new double[3];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            win[i] = numbers;
        }
        double prob = win[0];
        double prize = win[1];
        double pay = win[2];
    double game = ((prob*prize)-pay);
        System.out.println(game > 0);
}
}



