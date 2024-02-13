package poly.basic;
//업캐스팅은 문제가 없는 이유!
/*
문제가 안생겨!
어차피 자식 인스턴스를 생성하면
인스턴스 내부에 자신 포함 부모가 다 생성되잖아!! 그러니까
난 문제가 없다구!
*/
// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

/* 실행 안됨.
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
*/
    }
}
