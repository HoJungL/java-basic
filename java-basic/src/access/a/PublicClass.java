/*
클래스 레벨의 접근 제어자는 public, default만 사용가능
public 클래스는 반드시 파일명과 이름이 같아야함.
 */
package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();



    }
}

class DefaultClass1 {
}

class DefaultClass2 {

}
