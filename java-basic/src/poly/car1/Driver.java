package poly.car1;

/*
OCP(Open-Closed Principle) 원칙
- Open for extension : 새로운 기능의 추가나 변경 사항이 생겼을때, 기존 코드는 확장 할 수 있어야 한다.
- Closed for modification : 기존의 코드는 수정되지 않아야 한다.

newcar를만들어도, driver를 내가 수정하지는 않으니까.. Closed 만족!


driver는 클라이언트당!-> Car는 서버다!!

*/

public class Driver {

    private Car car; // car라는 역할만 이해하셈

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다." +car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

}
