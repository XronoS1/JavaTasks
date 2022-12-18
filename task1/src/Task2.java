
public class Task2 {
    public static void main(String[] args) {
        double[] square = new double[2];

        for (int i = 0; i < args.length; i++) {
            double numbers = Double.parseDouble(args[i]);
            square[i] = numbers;
        }
        double base = square[0];
        double height = square[1];
        double result = ((base*height)/2);
        System.out.println("The square of triangle>> " + result);
    }
}
