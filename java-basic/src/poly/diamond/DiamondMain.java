/*
인터페이스를 활용하여 "다중 구현"을 할경우에는
다이아몬드 문제가 전혀 발생하지 않아요!
왜냐? 인터페이스는 어차피 걸어놓은 조건이 없잖아요??
어차피 override 걸어서 기능을 구현해야한답니다?
*  */
package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child(); // 오버라이드
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child();
        child.methodCommon();
    }
}
