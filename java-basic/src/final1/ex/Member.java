package final1.ex;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) { // string id 있으면 오류
        // this.id = id; // 컴파일 오류 위에 파이널 그렸잖아.
        this.name = name;
    }

    public void print() {
        System.out.println("id" + id + ", name:" + name);
    }

}
