public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            char ch = args[i].charAt(0);
            int ascii = (int) ch;
            System.out.println("Значение элемента в ASCII>> " + ascii);
        }
    }
}
