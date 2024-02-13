package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레: " + perimeter);
    }

    void isSquare() {
        if (width == height) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
    /*
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return (width == height)
    }
     */
}