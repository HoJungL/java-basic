// 참조형과 메서드 호출
// 대원칙.자바는 메소드의 매개변수는 항상 값에 의해 전달. 값만. 복사함.
/*
기본형 : 해당 값이 복사되어 전달. 메서드 내부에서 parameter value를 변경해도 변수값 영향 X
참조형 : 참조값(주소) 복사되어 전달. 메서드 내부에서 parameter 객체 멤버 변수 변경시, 객체도 변경.
 */
package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
