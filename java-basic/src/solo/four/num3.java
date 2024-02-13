package solo.four;

public class num3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 5;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);


        sum = 0;
        max = 0;
        while (max <= 5) {
            sum += max;
            max++;
        }
        System.out.println(sum);
    }
}
