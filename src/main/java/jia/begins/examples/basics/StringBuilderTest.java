package jia.begins.examples.basics;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello, ");
        sb.append("Java! ");
        sb.append("You rock, ");
        sb.append("Bozhidar rules!");

        System.out.println(sb.toString());
    }
}
