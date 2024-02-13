package solo.thr;

public class num3 {
    public static void main(String[] args) {
        int dollar = -5;
        if (dollar < 0) {
            System.out.println("잘못된금액임");
        } else if (dollar == 0) {
            System.out.println("너 돈없음");
        } else {
            System.out.println("환전금액은"+(dollar *1300)+"원");
        }
    }
}
