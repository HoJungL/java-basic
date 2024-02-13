package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);



        // 추가
        // 인스턴스를 통한 접근!!
        // 하지만 권장하지 않아요. 왜냐!
        // 정적변수의 경우 인스턴스 접근 추천 X -> 인스턴스 변수에 접근하는것처럼 오해함
        // 개발은 관점은 2개! 만든 입장, 가져다 쓰는입장(내가 더 중요함)
        Data3 data4 = new Data3("D");
        System.out.println("인스턴스로 접근하니" + data4.count);

        // 그래서 내가 더 조아 ㅎ...
        // class 를 통한 접근
        System.out.println("class로 접근하니"+Data3.count);
    }
}
