package solo.thr;

public class num5 {
    public static void main(String[] args) {
        String grade = "a";
        switch (grade) {
            case ("A") -> {
                System.out.println("개잘함");
            }
            case ("B") -> {
                System.out.println("좋은 성과임");
            }
            case ("C") -> {
                System.out.println("준수하네");
            }
            case ("D") -> {
                System.out.println("노력하셈");
            }
            case ("F") -> {
                System.out.println("불합격임");
            }
            default -> {
                System.out.println("잘못된 학점임");
            }
        }
    }
}
