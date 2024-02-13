package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age) {
        this(name, age, 50); // 무조건 첫번째 문장에 써야함! 안그럼 error 뜹니당.
    }

    // 아래의 MemberConstruct가 생성자 인데, class 이름과 같아야함!!
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age:" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
