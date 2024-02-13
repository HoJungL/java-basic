package poly.overriding;

public class Child extends Parent {

    public String value = "Child";

    // 최 하위의 오버라이딩 된 메소드가 우선권을 가진다!!
    @Override // 오버라이딩 된 메소드는 항상 우선권을 가짐!!
    public void method() {
        System.out.println("Child.method");
    }
}
