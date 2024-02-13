/*
순수 추상 클래스
1. 인스턴스 생성 불가
2. 상송시 자식은 모든 메서드르 오버라이딩해야함
3. 주로 다형성을 위해 사용됨.

<상속하는 클래스는 모든 메서드를 구현해야 한다.>
하지만 난 잘 안쓰이지.interface로 쓰여 하하핳

*/
package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상 클래스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal()

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    // 불변

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
