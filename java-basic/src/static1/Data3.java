package static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name) {
        this.name= name;
        count++; // 원래는 Data3.count++를 해주는게 맞음. 자신의 class이기 때문에 안써도 되는것.

    }
}
