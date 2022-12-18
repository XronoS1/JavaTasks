public class Task7 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            double N = Double.parseDouble(args[i]);
            double result = (N * ((N + 1) / 2));
            System.out.println("Сумма чисел до " + N + " равна>> " + result);
        }
    }
}
