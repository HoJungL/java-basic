package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 util = new DecoUtil1();

        System.out.println("before: " + s);
        System.out.println("after: "+util.deco(s));
    }
}
