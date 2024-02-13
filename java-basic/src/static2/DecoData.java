package static2;

public class DecoData {

    //인스턴스 변수
    private int instanceValue; //참조값, 메서드 모릅니당
    
    //정적 변수
    private static int staticValue;

    //정적 메소드이므로, 인스턴스 변수 사용 불가.
    public static void staticCall() {
/*
        instanceValue++; //인스턴스 변수 접근, complie error
        instanceMethod(); // 인스턴스 메서드 접근, compile error
*/

        staticValue++; //정적 변수 접근
        staticMethod(); // 정적 메소드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; //DecoData.staticValue++; 와 같음
        staticMethod(); // 정적 메소드 접근
    }

    //인스턴스 메소드
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    // 정적 메소드
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);

    }
    // 이건 가능함!! 참조값이 있잖아. DecoData data로
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
}
