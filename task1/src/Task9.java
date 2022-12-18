public class Task9 {
    public static void main(String[] args) {
        double[] triple = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            triple[i] = numbers;

            double result = (Math.pow(triple[i], 3));
            triple[i] = result;
        }
        double sum = 0;
            for (int s = 0; s < triple.length; s++) {
                sum = sum + triple[s];
            }
            double res = sum;
            System.out.println("Сумма кубов>> " + res);
        }
    }


