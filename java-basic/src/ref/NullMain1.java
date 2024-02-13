// GC(garbage Collection) - 아무도 참조하지 않는 인스턴스의 최후
// 자동 처리해줌
package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " +data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
