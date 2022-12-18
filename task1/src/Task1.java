public class Task1 {
    public static void main(String[] args) {
        int[] devide = new int[2];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            devide[i] = numbers;
        }
        int result = (devide[0] % devide[1]);
        System.out.println("Остаток от деления>> " + result);
    }
}
