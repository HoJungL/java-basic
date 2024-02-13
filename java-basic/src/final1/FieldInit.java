package final1;

public class FieldInit {

    // 공용변수이지만, 바뀌지 않는다 -> static 쓰면 됨
    static final int CONST_VALUE = 10;
    final int value = 10; //초기값이 있으니까 생성자 못씀.

}
