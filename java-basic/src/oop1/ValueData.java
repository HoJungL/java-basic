package oop1;

public class ValueData {
    int value;

    // static이 붙으면 객체 생성 안해도 메서드 호출 할 수 있음.-자세한건 뒤에
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
