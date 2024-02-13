package final1;

public class FinalLocalmain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당가능
//        data1 = 20; // 컴파일 오류 뜸 java: variable data1 might already have been assigned

        // final 지역 변수 2
        final int data2 = 20;
//        data2 = 10; // 컴파일 오류
//        method(10); 이녀석도 안됨.
    }

/*
    static void method(final int parameter) {
        parameter = 20;
    }
*/
}
