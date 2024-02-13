/*
요구 사항
1. MovieReview 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
 - 영화 제목 (title)
 - 리뷰 내용 (review)
2. MovieReview 클래스 안에 main() 메소드를 포함하여 영화 리뷰 정보를 선언하고 출력하자.
 */

package class1.ex;

import java.util.stream.DoubleStream;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";
        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화";

        System.out.println(movie1.title + " " + movie1.review);
        System.out.println(movie2.title + " " + movie2.review);
    }
}
