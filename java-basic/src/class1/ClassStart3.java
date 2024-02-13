/*
사용자 정의 타입을 만들기 위한 설계도 == Class
실제 메모리에 만들어진 시레를 객체 or 인스턴스라고 함!!!! java는 객체지향!!

클래스는 설계도, 실제 메모리에 만들어진 실체를 객체 or 인스턴스라고함. (같은 의미임)
해당 예시에서는 Student 클래스를 기반으로 studnet1, student2 객체(인스턴스)를 만듬.
 */

/*
변수 종류
멤버 변수(필드) : 클래스에 선언
- 인스턴스를 생성할 때 자동 초기화됨
- 숫자, boolean, 참조형 =null( null:참조할 대상이 없다는 뜻)
- 개발자가 초기값을 직접 지정할 수 있음.

지역 변수 : 메소드에 선언, 매개변수도 지역변수의 하나임. 그니까 그냥 메소드에서만 쓰이는변수
- 수동 초기화임./ 직접 초기화 해줘야함
 */
package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; //지역 변수임 // 학생을 담아 둘 수 있는 변수를 선언하는거임.
        student1 = new Student(); // 변수를 통해, 앞서 선언한 Student Class를 쓸수 있음
        student1.names = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student(); // new가 객체, 메모리를 쓰겠다는 뜻임.
        student2.names = "학생2";
        student2.age = 16;
        student2.score = 90;

        System.out.println(student2);
        System.out.println(student1);

        System.out.println("이름:" + student1.names +
                " 나이:" + student1.age +
                " 성적:" + student1.score);
        System.out.println("이름:" + student2.names +
                " 나이:" + student2.age +
                " 성적:" + student2.score);
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