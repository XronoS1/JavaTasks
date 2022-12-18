public class Task8 {
    public static void main(String[] args) {
        int[] triangle = new int[2];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            triangle[i] = numbers;
        }
        int result = ((triangle[0] + triangle[1]) -1);
        System.out.println("Максимальная длина тертьего ребра>> " + result);
    }
}
