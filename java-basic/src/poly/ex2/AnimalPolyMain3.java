// 다형적 참조의 아주 좋은 예시!!!!

package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        // 컨트롤 알트 N
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
