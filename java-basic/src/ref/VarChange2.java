/*
A 참조값: B 참조값 같을것
10
10
20
20
30
30
 */
package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("A 참조값: " + dataA);
        System.out.println("B 참조값: " + dataB);
        System.out.println("dataA.value: " + dataA.value);
        System.out.println("dataB.value: " + dataB.value);

        // data A 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value: " + dataA.value);
        System.out.println("dataB.value: " + dataB.value);

        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value: " + dataA.value);
        System.out.println("dataB.value: " + dataB.value);


    }
}
