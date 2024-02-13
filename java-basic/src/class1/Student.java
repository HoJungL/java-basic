/*
class를 만든거임
클래스에 정의된 변수들을 멤버 변수 or 필드라고 함.
멤버 변수 : 이 변수들은 특정 클래스에 소속된 멤버이기 떄문에 부름.
필드 : 데이터 항목을 가르키는 전통적인 용어. db, excel에서는 데이터 각각의 항목
java 에서는 똑같은 말임.

낙타 표기법을 씀
*/

package class1;

public class Student {
    String names;
    int age;
    int score;
}
/*

기본형 대입
int a = 10;
int b = a; // 값을 복사하는거임!

참조형 대입
Student s1 = new Student();
Student s2 = s1; // 객체의 위치를 가르키는 참조값만 복사됨! 건물 위치 주소만 복사!
 */