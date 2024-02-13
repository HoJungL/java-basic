/*
생성자 장점
중복 호출 제거

제약을 줌(생성자 호출 필수) ()안에 안넣으면 compile error가 생김
 */

package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }
    }
}
