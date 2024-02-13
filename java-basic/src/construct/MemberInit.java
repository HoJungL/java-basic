package construct;

public class MemberInit {
    String name; //멤버 변수
    int age;
    int grade;

    void initmember(String name, int age, int grade) {
        this.name = name; // 나의 객체(인스턴스)의 이름
        this.age = age; // 안에 있는게 우선순위를 가짐.
        this.grade = grade; // 매개변수
    } //여기서 this 빼면, 둘다 매개변수로 인식함
}
