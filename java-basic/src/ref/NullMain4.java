package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("BigData.count : " + bigData.count);
        System.out.println("BigData.data : " + bigData.data);

        // nullPointerException 발생함!!
        System.out.println("BigData.data.value : " + bigData.data.value);

    }
}
