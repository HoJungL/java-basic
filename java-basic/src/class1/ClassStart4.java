/*
다시 한번 대전제
자바에서 대입은 항상 변수에 들어있는 값 값 값 값 값 을 복사한다.
자바에서 대입은 항상 변수에 들어있는 값 값 값 값 값 을 복사한다.
자바에서 대입은 항상 변수에 들어있는 값 값 값 값 값 을 복사한다.
자바에서 대입은 항상 변수에 들어있는 값 값 값 값 값 을 복사한다.
자바에서 대입은 항상 변수에 들어있는 값 값 값 값 값 을 복사한다.
student1, student2에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다!!
*/

package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 학생을 담아 둘 수 있는 변수를 선언하는거임.
         // 변수를 통해, 앞서 선언한 Student Class를 쓸수 있음
        student1.names = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student(); // new가 객체, 메모리를 쓰겠다는 뜻임.
        student2.names = "학생2";
        student2.age = 16;
        student2.score = 80;
        
        
        // 배열에 참조값( System.out.println(student1)치면 나오는거 ) 대입
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        System.out.println(students[0] +"나는야 students[0]");


        System.out.println("이름:" + students[0].names +
                " 나이:" + students[0].age +
                " 성적:" + students[0].score);
        System.out.println("이름:" + students[1].names +
                " 나이:" + students[1].age +
                " 성적:" + students[1].score);
    }
}
/*
1. 변수 선언
Student student1 // Student 변수 선언
Student student1
 - Student 타입을 받을 수 있는 변수 student1을 선언
 - int는 정수를 담듯, Student는 Student 타입의 객체를 받는거임.

2. 객체 생성
 new Student() : new : 새로 생성한다는 뜻. 즉. 해당 코드는 Student 클래스 정보를 기반으로
 새로운 객체를 생성하라는 뜻이며, 이는 메모리에 실제 Student 객체를 생성함.
 객체 생성에는 new 클래스명()을 사용하면 됨. 마지막에 ()를 반드시 추가해야함.
 Student클래스는 String name, int age, int score 멤버 변수를 가지고 있으며,
 이 변수를 사용하는데 필요한 메모리 공간도 함께 확보해야함.

3. 참조값 보관
 student1 =x001;  //  Studnet 객체 참조값을 보관
 이후는 pdf 참고
 */