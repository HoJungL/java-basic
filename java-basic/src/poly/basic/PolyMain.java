package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.ParentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.ParentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조라고함)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.ParentMethod();
        // 그와중에 poly.childMethod()는 못불러옴.
        // 자식 기능 호출 불가.
    }
}
