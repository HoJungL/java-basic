package extends1.super2;

public class ClassC extends ClassB{
    
    public ClassC() {
        super(10,20); // 생성자를 직접 언급할경우 기본생성자 생성 안되니까..!!
        System.out.println("ClassC 생성자");
    }
    
}
