/*
배열의 주의할점
정리할때, index의 순서를 잘 지켜야함. 안그러면 전혀 엉뚱한 value가 뜨거나, error 뜸
 */


package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
        int[] age = {15, 16};
        int[] score = {90, 80};

        for (int i = 0; i < age.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + age[i] + " 성적: "+score[i]);
        }
    }
}
