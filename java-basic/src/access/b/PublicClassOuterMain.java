package access.b;

// import access.a.DefaultClass1;
// 에러임. why? Default제어자인데 같은 패키지에 속한게 아니라서!!
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//      DefaultClass1 class1 = new DefaultClass1();
//      DefaultClass2 class2 = new DefaultClass2();
    }
}
