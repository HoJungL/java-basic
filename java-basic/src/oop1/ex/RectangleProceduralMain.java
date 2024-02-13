/*
넓이(area), 둘레 길이(perimeter), 정사각형 여부(square) 구하기
아래의 절차 지향을 객체지향으로 바꾸셈
Rectangle 클래스 만드셈
RectangleOopMain에 해당 클래스 사용하는 main() code를 만들어라.
 */

package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5, height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부 : " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
