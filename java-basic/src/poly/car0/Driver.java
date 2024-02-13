package poly.car0;

public class Driver {
    private K3Car k3Car; // 참조형 기본값은 null임!!


    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차는 운전합니다.");
        k3Car.startEngine();
        k3Car.offEngine();
        k3Car.startEngine();
    }
}
