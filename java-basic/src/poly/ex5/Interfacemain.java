package poly.ex5;

public class Interfacemain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가임
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        soundAnimal(new Dog());
        soundAnimal(new Cat());
        soundAnimal(new Caw());
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 움직임 시작");
        animal.move();
        System.out.println("동물 움직임 종료");
    }
}
