package poly.basic;
// 특정 타입으로 변경하는 것 == 캐스팅
/*
1. 다운 캐스팅을 통해 부모타입을 자식타입으로 변경후, 대입 시도
2. 참조값을 읽은 다음, 자식 타입으로 지정
3. 최종 결과 따단.
*/
public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출 못함.

        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; //강제로 Child화 시키기
        child.childMethod();
    }
}
