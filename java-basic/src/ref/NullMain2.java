package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data =null;
        //null에 .(dot / pointer) 찍으면 생기는 오류
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data =" + data.value);
    }
}
