package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void MaxCounter(int max) {
        if (this.count < max) {
            increment();
        } else {
            System.out.println("최댓값을 초과할 수 없습니다.");
        }
    }
    public void increment() {
        //검증로직
        if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
            return;
        } count++;
    }
    public int getCount() {
        return count;
    }
}



