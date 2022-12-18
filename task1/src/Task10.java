public class Task10 {
    public static void main(String[] args) {
        int[] abc = new int[3];
        for (int i = 0; i < args.length; i++) {
            int numbers = Integer.parseInt(args[i]);
            abc[i] = numbers;
        }
        int A = abc[0];
        int B = abc[1];
        int C = abc[2];
        for(int i = 0;i < B; i++){
            A = A + A;;
        }
        System.out.println("The result of full devide " + A + " by " + C + " is>> "+ ((A%C)==0));
    }
}
