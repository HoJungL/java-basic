package ref;

public class Method2 { //class1 하면 안됨. error 걸림
    public static void main(String[] args) {
        // createStudent()는 Student 객체의 참조값!!을 반환
        // 이 참조값을 student1 변수에 저장을함.
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println(student1); //참조값 위치임.
        Student student2 = createStudent("학생2",16,80);
        System.out.println(student2); // 참조값 위치임.

        printStudnet(student1);
        printStudnet(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println(student); //참조값 위치를 확인하기위해서 코드를 잡음
        student.name = name; //name이라는 인스턴스(객체)
        student.age = age;
        student.grade = grade;
        return student; //객체의 참조값을 던지는거임.
    }

    public static void printStudnet(Student student) {
        System.out.println("이름:" + student.name +" 나이:"+ student.age + " 성적: "+student.grade);
    }
}
