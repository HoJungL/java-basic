package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 나는야 기본 생성자
    Book() {
        this(",", "", 0);
/*
        this.title = "";
        this.author = "";
        this.page = 0;
*/
    }

    Book(String title, String author) {
    this(title, author, 0); //이라고 하는것과 같음.
//        this.title = title;
//        this.author = author;
//        this.page = 0;

    }

    void displayInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.page);
    }
}
