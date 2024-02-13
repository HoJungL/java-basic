package ref;

public class Method1 { //class1 하면 안됨. error 걸림
    public static void main(String[] args) {
        Student student1 = new Student(); // x001라는 객체 (주소 : 참조값)
        initStudent(student1,"학생1", 15,90); // x001

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudnet(student1);
        printStudnet(student2);

    }
    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name; //name이라는 인스턴스(객체)
        student.age = age;
        student.grade = grade;
    }
    public static void printStudnet(Student student) {
        System.out.println("이름:" + student.name +" 나이:"+ student.age + " 성적: "+student.grade);
    }
}
