package oop1.ex;

public class RectangleMainex1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.height = 5;
        rec.width = 8;
        rec.calculateArea();
        rec.calculatePerimeter();
        rec.isSquare();
    }
}
