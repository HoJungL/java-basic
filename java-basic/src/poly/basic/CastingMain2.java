package poly.basic;
// 특정 타입으로 변경하는 것 == 캐스팅
/*
1.((Child) poly).childMethod(); 다운캐스팅을 통해 부모 -> 자식 변환 후 기능호출
2.((Child) x001).childMethod(); 참조값을 읽은 다음, 자식타입으로 다운 캐스팅
*/
public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출 못함.

        // 일시적 다운캐스팅 - 해당 메서드ㅡㄹ 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod(); // 순서가 child 가 먼저라서 poly까지 한번 더 묶는거임.
    }
}
