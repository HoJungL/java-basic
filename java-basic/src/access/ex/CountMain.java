package access.ex;

public class CountMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());
    }
}
