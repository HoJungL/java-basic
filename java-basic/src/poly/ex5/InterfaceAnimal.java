/*
상속 (클래스)
- 부모의 기능을 그대로 물려 받는 것이 목적
구현 (인터페이스)
- 모든 메서드가 추상메서드임. 즉, 물려 받는게 없고, 자식이 오버라이딩해서
스스로 구현을 해야함.

interface 구현해야하는 이유요?
1. 제약
- 규제를 주는거임. 좋은 코드는 제약이 많은 코드!
순수 추상 클래스는 미래에 누가 실행이 가능한 코드를 만들어 버릴수도 있잖아?

2. 다중 구현
- 자바에서 클래스 상쏚은 부모를 하나만 지정함. 하지만, 인터페이스는 부모를 여러명 두는 다중 구현이 가능함!

<참고>
자바8에 등장한 default 메소드를 이용하면 인터페이스도 메서드를 구현 할 수는 있음
하지만 이건 예외적으로 아주 특별한 경우메나 사용하기!
자바9에서 등장한 인터페이스 private 메서드도 마찬가지!!
이부분은 추후에 다룸
*/
package poly.ex5;

public interface InterfaceAnimal {
    //아래에 있는 메소드를 반드시 구현해야함!
    // public abstract 생략 가능 // 인터페이스는 일반적으로 공공연하게 쓰기 위해 사용함.
    void sound();
    void move();
    
}
