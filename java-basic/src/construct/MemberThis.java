package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략가능 이름이 다르니까
    }
}
