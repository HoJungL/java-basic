// 추상 method
/*
1. 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야한다.
2. 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야한다
3. 시발 또 오버라이딩이네?? 시발 망할
*/
package poly.ex3;

// abstract void sound 실행하려면 class에도 abstract를 걸어줘야함.
public abstract class AbstractAnimal {

    public abstract void sound(); // 호출 되면 안됨. 메서드가 없잖아.

    public void move() {
        System.out.println("동물이 움직인당");
    }


}
