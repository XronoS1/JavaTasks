public class DraftTask {
    public static void main(String[] args) {
        System.out.println("Weekly salary");
        System.out.println(WeeklySalary(new int[]{8,8,8,8,8,0,0}));
        System.out.println(WeeklySalary(new int[]{10,10,10,10,10,0,0}));
        System.out.println(WeeklySalary(new int[]{0,0,0,0,0,12,0}));
    }
    public static int WeeklySalary(int[] a){
        int result = 0;
        for(int i=0;i < 5; i++){
            if(a[i] <= 8){
                a[i] = a[i] * 10;
                result += a[i];
            }
            else{
                int differ = a[i] - 8;
                a[i] = 80 + differ * 15;
                result += a[i];
            }
        }
        for(int j=5;j < a.length; j++){
            int differnce = a[j]-8;
            if(a[j] ==0){
                result +=0;
            }
            else{
                a[j] = a[j]*20+ differnce*15;
                result += a[j];
            }
        }
        return result;
    }
}
