package static2.ex;

import javax.xml.namespace.QName;

public class Car {
    private String name;

    private static int carTotal;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        carTotal++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: "+ carTotal);
    }
}
