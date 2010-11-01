package jia.begins.examples.basics;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class StringTest {
    public static void main(String[] args) {
        String hey = "hey hey hey ";
        String s = "some" + "string";

        System.out.println(s.substring(4));
        System.out.println(s.toUpperCase());
        System.out.println(hey + s);
    }
}
